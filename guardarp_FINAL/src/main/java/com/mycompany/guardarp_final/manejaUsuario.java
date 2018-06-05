
package com.mycompany.guardarp_final;

import com.mycompany.guardarp_final.NewHibernateUtil;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class manejaUsuario {
    
    private Session sesion;
    private Transaction tx;
    
    public manejaUsuario(){
        
    }
    
    public void iniciaOperacion() throws HibernateException{
        
        System.out.println("Comenzando con Hibernate");
        sesion = NewHibernateUtil.getSessionFactory().openSession();
      
        tx = sesion.beginTransaction();
        
    }
    
    public void manejaException(HibernateException he) throws HibernateException{
        
        tx.rollback();
        System.out.println("Ocurrio un error");
        System.exit(0);
        
    }
    
    
    public void finalizaOperacion() throws HibernateException {
        
        tx.commit();
        sesion.close();
        System.out.println("Cerrando sesion");
        
    }
    
   
    public void crearClave(Cuentas c)
    {
        try{
            
            iniciaOperacion();
            sesion.save(c);
            System.out.println("Cuenta guardado");
                       
            
        }catch(HibernateException e)
        {
            manejaException(e);
            throw e;
        }finally{
            
            finalizaOperacion();
        }
    }
    
    
    public String ListarClaves()
    {
        String l="";
        
        
        try{
            iniciaOperacion();
            String sentencia = "SELECT c FROM Cuentas c";
            Query query = sesion.createQuery(sentencia);
            
           
            List<Cuentas> lista = query.list();

            for(int i=0; i<lista.size(); i++)
            {
                String d = lista.get(i).getDescripcion();
                String p = lista.get(i).getPassword();
                
                l = l + "DESCRIPCION:  " + d + " -----  CONTRASEÑA:  " + p + "\n.";
            }
             
        }catch(HibernateException e)
        {
            manejaException(e);
            throw e;
        }finally{
            
            finalizaOperacion();
        }
        return l;
    }
    
    
    public boolean ComprobarUsuario(String nombre, String password)
    {
        boolean comprobado=false;
        Usuario u = new Usuario();
        try
        {
            iniciaOperacion();
            String sentencia = "SELECT * FROM Usuario u where u.nombre= '"+ nombre + "' and u.password= '" + password + "'";
            Query query = sesion.createSQLQuery(sentencia);
            
            List<Usuario> lista = query.list();
           
            
            if(!lista.isEmpty())
            {
                comprobado=true;
            }
        }catch(HibernateException e)
        {
            manejaException(e);
            throw e;
        }finally{
            
            finalizaOperacion();
        }
        return comprobado;
        
      
    }
   
    
    
    public void actualizarPassword(String nombre, String clave)
    {
        Scanner teclado = new Scanner(System.in);
        
        
        try {
            iniciaOperacion();
            
            String sentencia = "SELECT u FROM Usuario u where u.nombre= '" + nombre + "'";
            Query query = sesion.createQuery(sentencia);
            
            List<Usuario> lista = query.list();
            
            Usuario u= lista.get(0);
            
            if(!lista.isEmpty())
            {
               // System.out.println("Nueva clave: ");
              //  String clave = teclado.nextLine();
                clave=getMD5(clave);
                u.setPassword(clave);
                sesion.update(u);
                System.out.println("Clave actualizada!");
            }
        } catch (HibernateException he) {
            manejaException(he);
            throw he;
        } finally {
            finalizaOperacion();
        }
    }
    
    public static String getMD5(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            BigInteger number = new BigInteger(1, messageDigest);
            String hashtext = number.toString(16);

            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    
    public String getLista()
    {
        String l = "";
        ArrayList<Cuentas> c = new ArrayList();
      
        
        
        try {
            iniciaOperacion();
            
            String sentencia = "SELECT * FROM Cuentas";
            Query query = sesion.createSQLQuery(sentencia);
            
            List<Cuentas> lista = query.list();
                     
            for(int i=0; i<lista.size(); i++){
                l = l + "Descripcion: " + lista.get(i).getDescripcion() + " Contraseña: " + lista.get(i).getPassword() + " /n";
            }   
               // c.add(lista.get(i));
               
            
            } catch (HibernateException he) {
                manejaException(he);
                throw he;
            } finally {
                finalizaOperacion();
            }
        
        return l;
    }
    
    
    
}
