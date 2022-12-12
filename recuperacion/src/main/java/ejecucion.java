

import java.util.Scanner;

public class ejecucion {
    public static void main(String[] args) {
        int opcion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa porfavor el animal que deseas para el juego. \n1. Lobo \n2. Gato \n3. pez");
        lobo lobito = new lobo();
        gato gatico = new gato();
        pez pecesito = new pez();
        opcion = leer.nextInt();
        
        switch(opcion)
        {
            case 1:
            System.out.println("por medio de la lectura o imagen responde las preguntas: ");
            System.out.println("_______________________________________________________");
            System.out.println("Los lobos cazan en manada, por lo cual prefieren alimentarse de animales mucho más grandes que ellos como alces, venados y hasta caballos.\n tienen un peso de entre 32 y 64 kg.");
            System.out.println("_______________________________________________________");
            lobito.registrarRespuesta();
            lobito.mostrarAnimal();
            break;

            case 2:
            System.out.println("por medio de la lectura o imagen responde las preguntas: ");
            System.out.println("_______________________________________________________");
            System.out.println("El gato es un felino carnívoro y mamífero cuadrúpedo, que ha convivido con los seres humanos desde hace unos 9500 años, ocupando en la cultura\n temprana de las sociedades antiguas un lugar prominente.Tienen un número par de bigotes en cada lado de su hocico que suman 24 en total así miden con precisión su entorno.");
            System.out.println("_______________________________________________________");
            gatico.registrarRespuesta();
            gatico.mostrarAnimal();
            break;

            case 3:
            System.out.println("por medio de la lectura o imagen responde las preguntas: ");
            System.out.println("_______________________________________________________");
            System.out.println("Los peces son animales vertebrados acuáticos, recubiertos por escamas y dotados de adaptaciones específicas para el nado como son las aletas.\nLa mayor parte de los peces presentan reproducción ovípara, es decir, expulsando huevos al exterior. ");
            System.out.println("_______________________________________________________");
            
            pecesito.registrarRespuesta();
            pecesito.mostrarAnimal();
            break;

        }
        
    }
    
}