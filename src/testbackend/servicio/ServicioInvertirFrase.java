package testbackend.servicio;

public class ServicioInvertirFrase {
	
	public static String invertir(String frase) {
		if (frase.length() <= 1) //Cuando llegamos al ultimo caracter de la cadena salimos de la recursividad.
			return frase;
		    else {
		    	//Ingresamos a la recursividad retirando el primero caracter de la cadena y agregandolo al final.
		    	//Lo que permite que comencemos a armar la frase final partiendo en el ultimo caracter hasta llegar al primero
		    	String fraseInvertida = invertir(frase.substring(1)) + frase.charAt(0);
		    	return fraseInvertida;
		        }
	}
	
}
