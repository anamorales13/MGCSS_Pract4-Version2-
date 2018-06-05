
package com.mycompany.guardarp_final;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import java.util.logging.Logger;


public class main {
   
    public static void main (String[] args) throws NoSuchAlgorithmException{
       int opcion, opcion2;
        String nomb, pass, descripcion, contraseña;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        manejaUsuario manejauser = new manejaUsuario();
        boolean resultado=false;
        boolean comprobado=false;
        Cuentas cuenta;
       
        Usuario u = new Usuario();
     
       
        do 
        {
            
            System.out.println("1. Identificación del usuario");
            System.out.println("2. Cambiar contraseña");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            
            
            switch(opcion)
            {
                case 1:
                   
                    System.out.println("Introduce el nombre: ");
                    nomb=sc2.nextLine();
                    //usuario.setNombre(nomb);
                    System.out.println("Introduce la contraseña: ");
                    pass=sc3.nextLine();
                    
                    comprobado=manejauser.ComprobarUsuario(nomb, pass);
                    
                    if(comprobado){
                        do{
                               System.out.println("1. Crear nuevas claves");
                               System.out.println("2. Listar");
                               System.out.println("3. Salir");  
                               opcion2 = sc.nextInt(); 
                               
                               switch(opcion2)
                               {
                                   case 1: System.out.println("Introduce la descripcion: ");
                                            descripcion = sc2.nextLine();
                                            System.out.println("Introduce la contraseña: ");
                                            contraseña = sc4.nextLine();
                                            cuenta = new Cuentas(descripcion, contraseña);
                                            manejauser.crearClave(cuenta); // le pasamos el objeto de la clase que nos crea al crear la base de datos!!!!
                                          
                                       
                                       break;
                                       
                                   case 2: manejauser.ListarClaves();
                                       break;
                                       
                                   case 3: System.exit(0);
                                       break;
                                       
                                   default: System.out.println("Error. Introduce un numero del 1 al 3.");
                                    break;
                               }
                               
                    
                        }while(opcion != 3);
                    }
                    break;
                    
                case 2: System.out.println("Introduzca el nombre: ");
                        nomb=sc2.nextLine();
                        System.out.println("Introduzca la contraseña: ");
                        pass=sc.nextLine();
                    
                        u.setNombre(nomb);
                        u.setPassword(pass);
                      //  manejauser.actualizarPassword(nomb);
                    break;
                    
                    
                    
                case 3: System.exit(0);
                    break;
            }
            
            
            
            
        }while(opcion != 3);
        
        
        
        
        
        
        
        
      
    }
    
    
}
