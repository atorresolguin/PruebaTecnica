package testbackend.servicio;

import java.util.*;

public class ServicioOrdenarNumeros {
	public static String ordenar(String serie) {
		char[] serieArray = serie.toCharArray(); //Transformamos la cadena en un array
		Arrays.sort(serieArray); //Ordenamos el array
		String serieOrdenada="";
		//Pasamos nuevamente de Array a una cadena
		for (int i=0;i<serieArray.length;i++){
            serieOrdenada+=(serieArray[i]);
        }
		return serieOrdenada;
	}

}
