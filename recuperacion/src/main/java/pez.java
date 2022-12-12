public class pez extends animal
{
 private String razaP;
 private String escamas;
 private String peligroso;
private String tipoRepro;
private String registraP;
private String mostrarP;

public String getRazaP() {
    return razaP;
}
public void setRazaP(String razaP) {
    this.razaP = razaP;
}
public String getEscamas() {
    return escamas;
}
public void setEscamas(String escamas) {
    this.escamas = escamas;
}
public String getPeligroso() {
    return peligroso;
}
public void setPeligroso(String peligroso) {
    this.peligroso = peligroso;
}
public String getTipoRepro() {
    return tipoRepro;
}
public void setTipoRepro(String tipoRepro) {
    this.tipoRepro = tipoRepro;
}


public String registrarRespuesta()
{
  System.out.println("Ingresa la raza del pez: ");
  setRazaP(lectura.next());
  System.out.println("Ingresa de que esta recubierto los peces: ");
  setEscamas(lectura.next());
  System.out.println("ingresa si el pez es o no peligroso: ");
  setPeligroso(lectura.next());
  System.out.println("ingresa el tipo de reproduccion del pez: ");
  setTipoRepro(lectura.next());
  System.out.println("Se registro la respuesta.");
   return registraP;
}
public String mostrarAnimal()
{
    mostrarP ="de raza: "+ getRazaP() +" esta recubierto de " +getEscamas() +" " +getPeligroso()+" es peligroso, " + "su tipo de reproducción es:"+ getTipoRepro();
    System.out.println("El pez es: "+ mostrarP);
    return mostrarP;
}

}
