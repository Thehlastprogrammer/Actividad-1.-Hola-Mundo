 */
package com.mycompany.examen2;

public class Persona {
    private String nombre;
    private int indice;
    private String accesorio;
    private String cabello;
    private String expresion;
    private String extra;
    
    //SET----------------------------------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIndice(int indice){
        this.indice = indice;
    }
    public void setAccesorio(String accesorio){
        this.accesorio = accesorio;
    }
    public void setCabello(String cabello){
        this.cabello = cabello;
    }
    public void setExpresion(String expresion){
        this.expresion = expresion;
    }
    public void setExtra(String extra){
        this.extra = extra;
    }
    //GET-------------------------------------
    public String getNombre(){
        return this.nombre;
    }
    public int getindice(){
        return this.indice;
    }
    public String getAccesorio(){
        return this.accesorio;
    }
    public String getCabello(){
        return this.cabello;
    }
    public String getExpresion(){
        return this.expresion;
    }
    public String getExtra(){
        return this.extra; 
    }
    //MOSTRAR--------------------------------
    public void mostrar(){
        System.out.println("\nNombre: " + this.nombre +
                "\nIndice: " + this.getindice() +
                "\nAccesorio: " + this.getAccesorio() + 
                "\nCabello: " + this.getCabello() +
                "\nExpresion: " + this.getExpresion() + 
                "\nExtra: " + this.getExtra());
    }
    
}
