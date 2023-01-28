public class Cuadrado {

  double lado;

    public Cuadrado ( double lado) {
        this.lado = lado;
    }
  
    public Cuadrado() {
      this(25);
      
    }
    public double calcularDiagonal(){
    
        return Math.sqrt(2*((double)lado*(double)lado));
    }
  
    public double calcularPerimetro(){
        return lado*4;
    }
    public double calcularArea(){
      return lado*lado;
    }
}
