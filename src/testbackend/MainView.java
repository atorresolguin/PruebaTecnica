package testbackend;
import testbackend.servicio.*;

public class MainView {

	public static void main(String[] args) {
		System.out.println(ServicioInvertirFrase.invertir("Esta frase debe darse vuelta"));
		System.out.println(ServicioOrdenarNumeros.ordenar("5678319241560"));
		ServicioPersonas.menuPersonas();
	}

}
