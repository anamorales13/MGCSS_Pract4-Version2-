package com.mycompany.guardarp_final;
// Generated 04-jun-2018 13:59:45 by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String nombre;
     private String password;

    public Usuario() {
    }

	
    public Usuario(String nombre) {
        this.nombre = nombre;
    }
    public Usuario(String nombre, String password) {
       this.nombre = nombre;
       this.password = password;
    }
   
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


