package testbackend.servicio;
import java.util.*;
import testbackend.entidad.Persona;

public class ServicioPersonas {
	public static List<Persona> lista_de_personas = new ArrayList<>();
	
	public static void agregarPersona() {
		Persona persona = new Persona();
		System.out.println("Agregar nueva persona");
		//Solicitamos los datos de la nueva persona
		System.out.println("Ingrese el nombre: ");
		persona.nombre = inputclass.in.nextLine();
		
		System.out.println("Ingrese el email: ");
		persona.email = inputclass.in.nextLine();
		
		System.out.println("Ingrese la edad: ");
		String stringEdad= inputclass.in.nextLine();
		try {
			persona.edad = Integer.parseInt(stringEdad);
		} catch (Exception e) {
			System.out.println("La edad debe ser numerica");
		}
		
		//Agregamos la nueva persona a nuestra lista
		lista_de_personas.add(persona);
	}
	
	
	public static void menuPersonas() {
	boolean salir = false;
	//Solicitamos la primera persona
	agregarPersona();
	
	//Consultamos si se desea agregar una nueva persona o salir
	while (!salir) {
		System.out.println("Desea agregar otra persona?(Si/No)");
		String option = inputclass.in.nextLine();
		switch (option) {
			case "Si": {
				agregarPersona();
				break;
			}
	
			case "No": {
				salir = true;
				System.out.println("Adios!");
				break;
			}
			default: {
				System.out.println("Opcion invalida.");
				break;
				}
			}
		}
	}
			
}

//Clase para evitar error con scanner
class inputclass
{
    static Scanner in = new Scanner(System.in);
}
