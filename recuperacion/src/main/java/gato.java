public class gato extends animal
{
    private int cantidadvigotes;
    private String razaGato;
    private String alimentacion;
    private String registraG;
    private String mostrarG;

    public int getCantidadvigotes() {
        return cantidadvigotes;
    }
    public void setCantidadvigotes(int cantidadvigotes) {
        this.cantidadvigotes = cantidadvigotes;
    }
    public String getRazaGato() {
        return razaGato;
    }
    public void setRazaGato(String razaGato) {
        this.razaGato = razaGato;
    }
    public String getAlimentacion() {
        return alimentacion;
    }
    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
 
    public String registrarRespuesta()
    {
      System.out.println("Ingresa la cantidad de vigotes del gato: ");
      setCantidadvigotes(lectura.nextInt());
      System.out.println("Ingresa la raza de el gato: ");
      setRazaGato(lectura.next());
      System.out.println("ingresa el alimento que comen los gatos: ");
      setAlimentacion(lectura.next());
      System.out.println("Se registro la respuesta.");
       return registraG;
    }
    public String mostrarAnimal()
    {
      mostrarG ="El gato tiene "+ getCantidadvigotes() +" vigotes, su raza es:  " +getRazaGato() +" y come/toma " +getAlimentacion();
      System.out.println("El gato es: "+ mostrarG);
      return mostrarG;
    }
    
    
}

