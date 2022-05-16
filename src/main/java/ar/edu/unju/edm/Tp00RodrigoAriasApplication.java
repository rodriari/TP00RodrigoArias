package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import ar.edu.unju.edm.model.Calculadora;
import ar.edu.unju.edm.model.Estudiante;

@SpringBootApplication
public class Tp00RodrigoAriasApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00RodrigoAriasApplication.class, args);
		String nombre= "Rodrigo";
	      System.out.println("Hola edm, dice" + nombre + " " + darNombre ());
	      Estudiante unEstudiante = new Estudiante ();
	      unEstudiante.setDNI("44949209");
	      unEstudiante.setNombre("Rodrigo");

	      System.out.println("El estudiante" + unEstudiante.getNombre() + "Buenas Tardes");

	      Calculadora UnCalculadora = new Calculadora(); // Metodo Construccion
	      UnCalculadora.setNumero1(70);
	      UnCalculadora.setNumero2(3);
	      System.out.println("El Resultado de esta Suma es: " + UnCalculadora.ResolverSuma());
	      System.out.println("El Resultado de esta Resta es: " + UnCalculadora.ResolverResta());
	      System.out.println("El Resultado de esta Multiplicacion es: " + UnCalculadora.ResolverMulti());
	      System.out.println("El Resultado de esta Division es: " + UnCalculadora.ResolverDivision());
	      System.out.println("El Resultado de esta Potencia es: " + UnCalculadora.ResolverPotencia());
	      System.out.println("El Resultado de esta Raiz es: " + UnCalculadora.ResolverRaiz());
	    }

	 public static String darNombre(){
	     String NuevoNombre = "facha";
	     return NuevoNombre;
		}
	}

