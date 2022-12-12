public class lobo extends animal
{
    private String colorPelaje;
    private String Alimentecion;
    private double peso;
    private String registraL;
    private String mostrarL;

    public String getRegistraL() {
        return registraL;
    }
    public void setRegistraL(String registraL) {
        this.registraL = registraL;
    }
    public String getMostrarL() {
        return mostrarL;
    }
    public void setMostrarL(String mostrarL) {
        this.mostrarL = mostrarL;
    }
    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }
    public String getAlimentecion() {
        return Alimentecion;
    }
    public void setAlimentecion(String alimentecion) {
        Alimentecion = alimentecion;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

  public String registrarRespuesta()
  {
    System.out.println("Ingresa el color del pelaje del lobo: ");
    setColorPelaje(lectura.next());
    System.out.println("Ingresa el alimento que comen los lobos: ");
    setAlimentecion(lectura.next());
    System.out.println("ingresa el peso del lobo: ");
    setPeso(lectura.nextDouble());
    System.out.println("Se registro la respuesta.");
     return registraL;
  }
  public String mostrarAnimal()
  {
    mostrarL = getColorPelaje() +" come " +getAlimentecion() +" y pesa " +getPeso()+" kilos";
    System.out.println("El lobo es: "+ mostrarL);
    return mostrarL;
  }
  

    
}
