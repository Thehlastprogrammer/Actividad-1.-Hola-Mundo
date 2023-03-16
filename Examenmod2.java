package com.mycompany.examen2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Scanner;

public class Examen2 {
    
    //Arreglos de datos
    public static String [] accesorios = {"lentes", "sombrero", "aretes"};
    public static String [] cabello = {"corto", "pelon", "coleta"};
    public static String [] expresiones = {"feliz", "serio", "triste"};
    public static String [] extras = {"barba", "bigote", "antifaz"};
    public static String [] nombresPersonas = {"Sofia", "Iliana", "Alam", "Eduardo", "Rodrigo", 
        "Pilar", "Andrea", "Alejandro", "Victor", "Monse"};
    
    /*
    Autor:          Eddy
    Funcion:        crearPersona
    Proposito:      Crear una persona
    Datos entrada:  Lista de accesorios, cabello, expresiones, extras, nombres y el indice
    Datos salida:   Objeto tipo Persona
    Fecha:          5 de marzo
    */
    public static Persona crearPersona(List<String> accesoriosLista, List<String> cabelloLista,
            List<String> expresionesLista, List<String> extrasLista, List<String> nombres, int i){
        Persona personaTemp = new Persona();
        personaTemp.setNombre(nombres.get(i));
        personaTemp.setIndice(i);
        personaTemp.setAccesorio(accesoriosLista.get(0));
        personaTemp.setCabello(cabelloLista.get(0));
        personaTemp.setExpresion(expresionesLista.get(0));
        personaTemp.setExtra(extrasLista.get(0));

        return personaTemp;
    }//END crearPersona
    
    /*
    Autor:          Eddy
    Funcion:        crearUsuario
    Proposito:      Crear un usuario
    Datos entrada:  Nombre y contrasena
    Datos salida:   Objeto tipo Usuario
    Fecha:          15 de marzo
    */
    public static Usuario crearUsuario(String nombre, String contrasena){
        Usuario userTemp = new Usuario(nombre, contrasena);
        return userTemp;
    }
    
    /*
    Autor:          Eddy
    Funcion:        menuPrincipal
    Proposito:      Mostrar las opciones principales
    Datos entrada:  NA
    Datos salida:   Entero de la opcion
    Fecha:          15 de marzo
    */
    public static int menuPrincipal(){
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("\n\tMENU PRINCIPAL");
        System.out.println("1. Crear usuario");
        System.out.println("2. Iniciar sesion");
        System.out.println("3. Mostrar usuarios");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    /*
    Autor:          Eddy
    Funcion:        menuJuego
    Proposito:      Mostrar las opciones que tiene el usuario
    Datos entrada:  Objeto tipo Usuario
    Datos salida:   Entero de la opcion
    Fecha:          15 de marzo
    */
    public static int menuJuego(Usuario user){
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("\n\t" + user.getNombre());
        System.out.println("1. Nuevo juego");
        System.out.println("2. Estadisticas");
        System.out.println("0. SALIR");
        System.out.print("Opcion: ");
        opcion = input.nextInt();
        return opcion;
    }
    
    /*
    Autor:          Eddy
    Funcion:        menu
    Proposito:      Mostrar las opciones a preguntar
    Datos entrada:  Lista de caracteristicas que las personas "vivas" tienen
    Datos salida:   Entero de la opcion
    Fecha:          5 de marzo
    */
    public static int menu(List<String> caracteristicas){
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);
        int opcion;
        int i=1;
        System.out.println("\nMENU");
        for(String car: caracteristicas){
            System.out.println(i + ". " + car);
            i++;
        }
        System.out.print("\n0. SALIR");
        System.out.print("\nOpcion: ");
        opcion = input.nextInt();
        return opcion;
    }//END menu
    
    /*
    Autor:          Eddy
    Funcion:        fases
    Proposito:      Filtrar las personas por cada pregunta que se hace
    Datos entrada:  Lista de personas, entero de opcion, String filtro, Persona la persona a adivinar
    Datos salida:   Lista de personas filtradas
    Fecha:          5 de marzo
    */
    public static List<Persona> fases(List<Persona> personasFiltro, int opcion, String filtro, Persona adivinador){
        List<Persona> faseTemporal = new ArrayList<>();
        
        for(Persona temporal: personasFiltro){
                //ACCESORIOS
                if(filtro.equals("lentes") || filtro.equals("sombrero") || filtro.equals("aretes")){
                    //Personaje si tiene el atributo
                    if(adivinador.getAccesorio().equals(filtro)){
                        if(temporal.getAccesorio().equals(filtro)){
                            faseTemporal.add(temporal);
                        }
                    }
                    //Personaje no tiene el atributo
                    else{
                        if(!(temporal.getAccesorio().equals(filtro))){
                            faseTemporal.add(temporal);
                        }
                    }
                }
                //CABELLO
                else if(filtro.equals("corto") || filtro.equals("pelon") || filtro.equals("coleta")){
                    //Personaje si tiene el atributo
                    if(adivinador.getCabello().equals(filtro)){
                        if(temporal.getCabello().equals(filtro)){
                            faseTemporal.add(temporal);
                        }
                    }
                    //Personaje no tiene el atributo
                    else{
                        if(!(temporal.getCabello().equals(filtro))){
                            faseTemporal.add(temporal);
                        }
                    }
                }
                //EXPRESION
                else if(filtro.equals("feliz") || filtro.equals("triste") || filtro.equals("serio")){
                    //Personaje si tiene el atributo
                    if(adivinador.getExpresion().equals(filtro)){
                        if(temporal.getExpresion().equals(filtro)){
                            faseTemporal.add(temporal);
                        }
                    }
                    //Personaje no tiene el atributo
                    else{
                        if(!(temporal.getExpresion().equals(filtro))){
                            faseTemporal.add(temporal);
                        }
                    }
                }
                //EXTRA
                else if(filtro.equals("barba") || filtro.equals("bigote") || filtro.equals("antifaz")){
                    //Personaje si tiene el atributo
                    if(adivinador.getExtra().equals(filtro)){
                        if(temporal.getExtra().equals(filtro)){
                            faseTemporal.add(temporal);
                        }
                    }
                    //Personaje no tiene el atributo
                    else{
                        if(!(temporal.getExtra().equals(filtro))){
                            faseTemporal.add(temporal);
                        }
                    }
                }
            }   
        return faseTemporal;
    }//END fases
    
    /*
    Autor:          Eddy
    Funcion:        verificacion
    Proposito:      Verificar que cada atributo se use por lo menos 2 veces
    Datos entrada:  Lista de personas
    Datos salida:   Lista de personas por referencia
    Fecha:          5 de marzo
    */
    public static void verificacion(List<Persona> personas){

        List<String> atributos = new ArrayList<>();
        List<String> repetidos = new ArrayList<>();
        int i;
        String cambioPoner;
        String cambioQuitar;
        
        int contLentes, contSombrero, contAretes;
        int contCorto, contPelon, contColeta;
        int contFeliz, contTriste, contSerio;
        int contBarba, contBigote, contAntifaz;
        
        
        //Guardar atributos ----------------------------------------------------
        for(i=0; i<10; i++){
            atributos.add(personas.get(i).getAccesorio());
            atributos.add(personas.get(i).getCabello());
            atributos.add(personas.get(i).getExpresion());
            atributos.add(personas.get(i).getExtra());
        }
        
        //Verificacion----------------------------------------------------------
            
        //CAMBIAR ACCESORIOS
        contLentes = Collections.frequency(atributos, "lentes");
        contSombrero = Collections.frequency(atributos, "sombrero");
        contAretes = Collections.frequency(atributos, "aretes");
        if(contLentes==1 || contSombrero==1 || contAretes==1){

            if(contLentes>contSombrero && contSombrero>contAretes){
                cambioPoner = "aretes";
                cambioQuitar = "lentes";
            }
            else if(contLentes>contSombrero && contAretes>contSombrero){
                cambioPoner = "sombrero";
                cambioQuitar = "lentes";
            }
            else if(contSombrero>contLentes && contLentes>contAretes){
                cambioPoner = "aretes";
                cambioQuitar = "sombrero";
            }
            else if(contSombrero>contLentes && contAretes>contLentes){
                cambioPoner = "lentes";
                cambioQuitar = "sombrero";
            }
            else if(contAretes>contLentes && contLentes>contSombrero){
                cambioPoner = "sombrero";
                cambioQuitar = "aretes";
            }
            else{
                cambioPoner = "lentes";
                cambioQuitar = "aretes";
            }

            ajuste("accesorios", cambioPoner, cambioQuitar, personas);
           
        }
        //CAMBIAR CABELLO
        contCorto = Collections.frequency(atributos, "corto");
        contPelon = Collections.frequency(atributos, "pelon");
        contColeta = Collections.frequency(atributos, "coleta");
        if(contCorto==1 || contPelon==1 || contColeta==1){

            if(contCorto>contPelon && contPelon>contColeta){
                cambioPoner = "coleta";
                cambioQuitar = "corto";
            }
            else if(contCorto>contPelon && contColeta>contPelon){
                cambioPoner = "pelon";
                cambioQuitar = "corto";
            }
            else if(contPelon>contCorto && contCorto>contColeta){
                cambioPoner = "coleta";
                cambioQuitar = "pelon";
            }
            else if(contPelon>contCorto && contColeta>contCorto){
                cambioPoner = "corto";
                cambioQuitar = "pelon";
            }
            else if(contColeta>contCorto && contCorto>contPelon){
                cambioPoner = "pelon";
                cambioQuitar = "coleta";
            }
            else{
                cambioPoner = "corto";
                cambioQuitar = "coleta";
            }

            ajuste("cabello", cambioPoner, cambioQuitar, personas);
            
        }
        //CAMBIAR EXPRESION
        contFeliz = Collections.frequency(atributos, "feliz");
        contTriste = Collections.frequency(atributos, "trsite");
        contSerio = Collections.frequency(atributos, "serio");
        if(contFeliz==1 || contTriste==1 || contSerio==1){

            if(contFeliz>contTriste && contTriste>contSerio){
                cambioPoner = "serio";
                cambioQuitar = "feliz";
            }
            else if(contFeliz>contTriste && contSerio>contTriste){
                cambioPoner = "triste";
                cambioQuitar = "feliz";
            }
            else if(contTriste>contFeliz && contFeliz>contSerio){
                cambioPoner = "serio";
                cambioQuitar = "triste";
            }
            else if(contTriste>contFeliz && contSerio>contFeliz){
                cambioPoner = "feliz";
                cambioQuitar = "triste";
            }
            else if(contSerio>contFeliz && contFeliz>contTriste){
                cambioPoner = "triste";
                cambioQuitar = "serio";
            }
            else{
                cambioPoner = "feliz";
                cambioQuitar = "serio";
            }

            ajuste("expresion", cambioPoner, cambioQuitar, personas);
            
        }
        //CAMBIAR EXTRA
        contBarba = Collections.frequency(atributos, "barba");
        contBigote = Collections.frequency(atributos, "bigote");
        contAntifaz = Collections.frequency(atributos, "antifaz");
        if(contBarba==1 || contBigote==1 || contAntifaz==1){

            if(contBarba>contBigote && contBigote>contAntifaz){
                cambioPoner = "antifaz";
                cambioQuitar = "barba";
            }
            else if(contBarba>contBigote && contAntifaz>contBigote){
                cambioPoner = "bigote";
                cambioQuitar = "barba";
            }
            else if(contBigote>contBarba && contBarba>contAntifaz){
                cambioPoner = "antifaz";
                cambioQuitar = "bigote";
            }
            else if(contBigote>contBarba && contAntifaz>contBarba){
                cambioPoner = "barba";
                cambioQuitar = "bigote";
            }
            else if(contAntifaz>contBarba && contBarba>contBigote){
                cambioPoner = "bigote";
                cambioQuitar = "antifaz";
            }
            else{
                cambioPoner = "barba";
                cambioQuitar = "antifaz";
            }

            ajuste("extra", cambioPoner, cambioQuitar, personas);
            
        } 
        
        atributos.clear();
        repetidos.clear();
        //Mostrar valores ajustados---------------------------------------------
        for(i=0; i<10; i++){
            atributos.add(personas.get(i).getAccesorio());
            atributos.add(personas.get(i).getCabello());
            atributos.add(personas.get(i).getExpresion());
            atributos.add(personas.get(i).getExtra());
        }
        //Imprimir cantidad de veces de uso de cada atributo
        System.out.println("\nCantidad de uso de atributos de las personas:");
        for(String atr: atributos){
            if(!repetidos.contains(atr)){
                repetidos.add(atr);
                int contador = Collections.frequency(atributos, atr);
                System.out.println(atr + ": " + contador);
            }
        }
    }//END verificacion
    
    /*
    Autor:          Eddy
    Funcion:        ajuste
    Proposito:      Ajustar los atributos de una persona
    Datos entrada:  String el campo a cambiar, String valor a poner, String valor a quitar, Lista de personas
    Datos salida:   Objeto tipo Persona
    Fecha:          5 de marzo
    */
    public static void ajuste(String campo, String poner, String quitar, List<Persona> personas){

        switch (campo) {
            case "accesorios":
                for(Persona per: personas){
                    if(per.getAccesorio().equals(quitar)){
                        per.setAccesorio(poner);
                        break;
                    }
                }   break;
            case "cabello":
                for(Persona per: personas){
                    if(per.getCabello().equals(quitar)){
                        per.setCabello(poner);
                        break;
                    }
                }   break;
            case "expresion":
                for(Persona per: personas){
                    if(per.getExpresion().equals(quitar)){
                        per.setExpresion(poner);
                        break;
                    }
                }   break;
            default:
                for(Persona per: personas){
                    if(per.getExtra().equals(quitar)){
                        per.setExtra(poner);
                        break;
                    }
                }   break;
        }
    }//END ajuste
    
    
    /*
    MAIN
    */
    public static void main(String[] args) {
        //Crear objeto Scanner
        Scanner input = new Scanner(System.in);       
        //MENU PRINCIPAL--------------------------------------------------------------------------------------------------
        //MENU PRINCIPAL
        List<Usuario> usuarios = new ArrayList<>();
        int opcionPrincipal;
        String nombre, contrasena;
        boolean usuarioExistente;
        Usuario userLogin = new Usuario("", "");
        int opcionJuego;
        
        //ADIVINA QUIEN
        //Variables
        int i, opcion, indice, numPreguntas=0;
        String filtro = "";
        //Generar listas
        List<Persona> personas = new ArrayList<>();
        List<String> accesoriosLista = Arrays.asList(accesorios);
        List<String> cabelloLista = Arrays.asList(cabello);
        List<String> expresionesLista = Arrays.asList(expresiones);
        List<String> extrasLista = Arrays.asList(extras);
        List<String> nombres = Arrays.asList(nombresPersonas);
        //Lista de las caracteristicas que las personas filtradas tienen
        List<String> caracteristicas = new ArrayList<>();
        
        //INICIO----------------------------------------------------------------------------------------------------------
        do{
            opcionPrincipal = menuPrincipal();
            usuarioExistente = false;
            if(opcionPrincipal == 1){
                System.out.println("\n\tCREAR USUARIO");
                System.out.print("\nNombre: ");
                nombre = input.nextLine();
                System.out.print("\nContrasena: ");
                contrasena = input.nextLine();
                for(Usuario user: usuarios){
                    if(user.getNombre().equals(nombre)){
                        usuarioExistente = true;
                    }
                }
                if(usuarioExistente){
                    System.out.println("Usuario ya existente");
                }
                else{
                    usuarios.add(crearUsuario(nombre, contrasena));
                    //usuarios.get(0).mostrarInformacion();
                }
            }
            //INICIAR SESION----------------------------------------------------
            else if(opcionPrincipal == 2){
                System.out.println("\n\tINICIAR SESION");
                System.out.print("\nNombre: ");
                nombre = input.nextLine();
                System.out.print("\nContrasena: ");
                contrasena = input.nextLine();
                for(Usuario user: usuarios){
                    if(user.getNombre().equals(nombre) & user.getContrasena().equals(contrasena)){
                        usuarioExistente = true;
                        userLogin = user;
                    }
                }
                //ADIVINA QUIEN-------------------------------------------------------------------------------------------
                if(usuarioExistente){
                    do{
                        opcionJuego = menuJuego(userLogin);
                        //Jugar-------------------------------------------------
                        if(opcionJuego == 1){
                            
                            personas.clear();
                            shuffle(nombres);
                            //Crear 10 personas distintas
                            for(i=0; i<10; i++){
                                //Mezclar los atributos para tener resultados distintos
                                shuffle(accesoriosLista);
                                shuffle(cabelloLista);
                                shuffle(expresionesLista);
                                shuffle(extrasLista);
                                //Funcion para la creacion de una persona y añadirla a la lista
                                personas.add(crearPersona(accesoriosLista, cabelloLista, expresionesLista, extrasLista, nombres, i));
                            }
                            //Verificacion y ajuste de atributos
                            verificacion(personas);

                            //Mostrar todas las personas
                            for(Persona per: personas){
                                per.mostrar();
                            }
                            //Se obtiene un indice aleatorio para seleccionar un personaje
                            indice = (int)(Math.random()*10);

                            //Lista para poder ir filtrando por las preguntas
                            List<Persona> personasFiltro = new ArrayList<>(personas);

                            //Ciclo de 3 preguntas
                            do{
                                caracteristicas.clear();
                                //Guardar las caracteristicas que las personas filtradas tienen
                                for(Persona per: personasFiltro){
                                    if(!(caracteristicas.contains(per.getAccesorio()))){
                                        caracteristicas.add(per.getAccesorio());
                                    }
                                    if(!(caracteristicas.contains(per.getCabello()))){
                                        caracteristicas.add(per.getCabello());
                                    }
                                    if(!(caracteristicas.contains(per.getExpresion()))){
                                        caracteristicas.add(per.getExpresion());
                                    }
                                    if(!(caracteristicas.contains(per.getExtra()))){
                                        caracteristicas.add(per.getExtra());
                                    }
                                }

                                //Obtener la opcion que desea buscar
                                opcion = menu(caracteristicas);

                                //Identificar el filtro por el indice seleccionado
                                if(opcion != 0){
                                    filtro = caracteristicas.get((opcion-1));
                                }

                                //Filtrar las personas que cumplan con el filtro
                                personasFiltro = fases(personasFiltro, opcion, filtro, personas.get(indice));

                                //Mostrar las personas "vivas" en el juego
                                for(i=0; i<personasFiltro.size(); i++){
                                    personasFiltro.get(i).mostrar();
                                }

                                //Saber si existe el atributo en el personaje
                                boolean encontrado = false;

                                if(personas.get(indice).getAccesorio().equals(filtro) || 
                                        personas.get(indice).getCabello().equals(filtro) ||
                                        personas.get(indice).getExpresion().equals(filtro) ||
                                        personas.get(indice).getExtra().equals(filtro)){
                                    encontrado = true;
                                }
                                //Mostrar informacion al usuario
                                if(encontrado){
                                    System.out.println("\nMi personaje SI cumple con el atributo: " + filtro);
                                }
                                else{
                                    System.out.println("\nMi personaje NO cumple con el atributo: " + filtro);
                                }

                                //Sumamos al contador de preguntas
                                numPreguntas+=1;

                            }while(numPreguntas<3 && opcion != 0);
                            numPreguntas = 0;
                            //Mientras el usuario no haya salido
                            if(opcion != 0){
                                System.out.println("\nAdivia quien: ");
                                int adivina;
                                adivina = input.nextInt();

                                if(adivina == indice){
                                    System.out.println("\nADIVINASTE");
                                    userLogin.sumarVictorias();
                                }
                                else{
                                    System.out.println("\nFALLASTE");
                                    System.out.println("Persona correcta: ");
                                    personas.get(indice).mostrar();
                                }
                                userLogin.sumarIntentos();
                            }
                        }
                        //Estadisticas------------------------------------------
                        else if(opcionJuego == 2){
                            userLogin.mostrarInformacion();
                        }
                    }while(opcionJuego != 0);
                }
                else{
                    System.out.println("\nUsuario no encontrado");
                }
            }
            //Mostrar usuarios--------------------------------------------------
            else if(opcionPrincipal == 3){
                System.out.println("\n\tUSUARIOS");
                //Mostrar usuarios
                for(Usuario user: usuarios){
                    user.mostrarInformacion();
                }
            }
        }while(opcionPrincipal != 0);  
    }//END MAIN   
}//END CLASS
