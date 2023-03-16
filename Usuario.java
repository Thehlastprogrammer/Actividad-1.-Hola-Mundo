package com.mycompany.examen2;

public class Usuario {
    private String nombre;
    private String contrasena;
    private int intentos;
    private int victorias;
    
    public Usuario(String nombre, String contrasena){
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.intentos = 0;
        this.victorias = 0;
    }
    public void sumarIntentos(){
        this.intentos += 1;
    }
    public void sumarVictorias(){
        this.victorias += 1;
    }
    public float porcentajeDeVictorias(){
        if(this.getIntentos() != 0){
            return ((this.getVictorias() * 100) / this.getIntentos());
        }
        else{
            return 0;
        }
        
    }
    //GET
    public String getNombre(){
        return this.nombre;
    }
    public String getContrasena(){
        return this.contrasena;
    }
    public int getIntentos(){
        return this.intentos;
    }
    public int getVictorias(){
        return this.victorias;
    }
    public void mostrarInformacion(){
        System.out.println("\nNombre: " + this.getNombre() + "\nIntentos: " + this.getIntentos() 
                + "\nVictorias: " + this.getVictorias() + 
                "\nPorcentaje de victorias: " + this.porcentajeDeVictorias() + "%");
    }
}
