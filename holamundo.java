import java.util.Scanner;

public class holamundo {
  public static void main ( String[]Args) {

     Scanner entradas = new Scanner(System.in);
     String escrito = entradas.nextLine();

    if(escrito.contains("cuadrado")) {
      System.out.println("¿Cuando mide su lado");
      String lado = entradas.nextLine();
      int lado2 = Integer.parseInt(lado);
      Cuadrado miCuadrado = new Cuadrado(lado2);

      System.out.println("¿Qué desea calcular?");
      System.out.println("1. Diagonal");
      System.out.println("2. Perimetro");
      System.out.println(" 3. Area");

      int respuesta = entradas.nextInt();

      if(respuesta == 1){
          System.out.println(miCuadrado.calcularDiagonal());
        
      } else if (respuesta == 2) {
          System.out.println(miCuadrado.calcularPerimetro());
        
      } else if (respuesta == 3){

          System.out.println(miCuadrado.calcularArea());
        
      } else {
            System.out.println("No se puede hacer eso");
      }
    
    } else if (escrito.equals("circulo")){
        System.out.println("Cuanto mide su radio?");
        String radio = entradas.nextLine();
        int radio2 = Integer.parseInt(radio);
        Circulo miCirculo = new Circulo (radio2);

        System.out.println("¿Qué desea calcular?");
        System.out.println("1. Perímetro");
        System.out.println("2. Area");

        int respuesta = entradas.nextInt();

        if(respuesta == 1){
          
          System.out.println(miCirculo.calcularPerimetro());
          
        } else if ( respuesta == 2){
          
          System.out.println(miCirculo.calcularArea());
          
        } else {
          
          System.out.println("No se puede hacer eso");
          
        }
      
      
    } else {
        System.out.println("No se puede hacer eso");
    }

    entradas.close();
    
  }
}
