public class holamundo2 {
  public static void main ( String[]Args) {

     Scanner entradas = new Scanner(System.in);
     String escrito = entradas.nextLine();
     while (true)
       System.out.println("2. Compute perimetro of the square");
       System.out.println("3. Compute area of the square");
       System.out.println("4. Compute perimetro of the circle");
       System.out.println("5. Compute area of the circle ");
      // Agregar hasta el final System.out.println("6. Enter your choice:");

    int choice = Integer.parseInt(entradas.nextLine());
    switch(choice){
        case 1:
        System.out.print("Enter the side length the square:");
        double lado2 = Double.parseDouble(entradas.nextLine());
        Cuadrado miCuadrado1 = new Cuadrado(lado2);
        System.out.println("The area of the square is:" + miCuadrado1.calcularArea());
        break;
        case 2:
        System.out.print("Enter the side lenght of the square:");
        double lado = Double.parseDouble(entradas.nextLine());
        Cuadrado miCuadrado2 = new Cuadrado(lado2);
        System.out.println(" The permitero of the square is:" + miCuadrado2.calcularPerimetro());
        break;
        case 3:
        System.out.print("Enter the radius of the circle:");
        double radius1 = Double.parseDouble(entradas.nextLine());
        Circulo miCirculo1 = new Circulo(radio2);
        System.out.println("The area of the circle is:" + miCirculo1.calcularArea());
        break;
        case 4:
        System.out.print("Enter the radius of the circle:");
        double radius2 = Double.parseDouble(entradas.nextLine());
        Circulo miCirculo2 = new Circulo(radio2);
        System.out.println("The area of the circle is:" + miCirculo2.calcularPerimetro());
        break;
        case 5:
        System.out.println("Enter your choice");
        System.exit(0);
        loop choice1;
        default:
        System.out.println("Invalida choice. Please enter a valid choice.");
        break;

        if(escrito.contains("cuadrado")) {
          System.out.println("¿Cuanto mide su lado");
          String lado3 = entradas.nextLine();
          int lado4 = Integer.parseInt(lado3);
          Cuadrado miCuadrado = new Cuadrado(lado2);

          System.out.println("¿Qué desea calcular?");
          System.out.println("1. Diagonal");
          System.out.println("2. Perimetro");
          System.out.println(" 3. Area");

          int respuesta = entradas.nextInt();

          if(respuesta == 1){
            System.out.println(miCuadrado.calcularDiagonal());
            
          } else if ( respuesta == 2) {
                  System.out.println(miCuadrado.calcularPerimetro());
            
          } else if ( respuesta == 3){
                  System.out.println(miCuadrado.calcularArea());
            
          } else {
                  System.out.println("No se puede hacer eso");
            
               if (escrito.equals("circulo")){
                System.out.println("¿Cuanto mide su radio?");
                String radio = entradas.nextLine();
                int radio2 = Integer.parseInt(radio);
                Circulo miCirulo = new Circulo (radio2);

                System.out.println("¿Qué desea calcular?");
                System.out.println("1. Perímtero");
                System.out.println("2. Area");

                int respuesta1 = entradas.nextInt();


                if(respuesta == 1){

                  System.out.println(miCirculo1.calcularPerimetro());
                  
              } else if ( respuesta == 2){
                  
                  System.out.println(miCirculo2.calcularArea());
              } else {
                  
                  System.out.println("No se puede hacer eso");
              }
          } else {
                System.out.println("No se puede hacer eso");
          }
          entradas.close();
       }
    }
    // Poner dentro del loop y dentro del switch
