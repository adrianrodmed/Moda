package Main;

import java.util.ArrayList;

import PolimorfismoInterface.Disenador;
import PolimorfismoInterface.Modelo;
import PolimorfismoInterface.Estilista;
import PolimorfismoInterface.SeleccionModa;

public class Main {

	// ArrayList de objetos SeleccionFutbol. Idenpendientemente de la clase hija a la que pertenezca el objeto
	public static ArrayList<SeleccionModa> integrantes = new ArrayList<SeleccionModa>();

	public static void main(String[] args) {

		SeleccionModa armani = new Disenador(1, "Giorgio", "Armani", 60, 28489);
		SeleccionModa eva = new Modelo(2, "Eva", "Longoria", 29, 6, "Hombre");
		SeleccionModa raulMartinez = new Estilista(3, "Raul", "Martinez", 41, "Licenciado en Estilismo", 18);

		integrantes.add(armani);
		integrantes.add(eva);
		integrantes.add(raulMartinez);

		// CONCENTRACION
		System.out.println("Todos los integrantes comienzan una desfile. (Todos ejecutan el mismo metodo)");
		for (SeleccionModa integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.fecha();
		}

		// VIAJE
		System.out.println("\nTodos los integrantes viajan para desfilar. (Todos ejecutan el mismo metodo)");
		for (SeleccionModa integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.viajar();
		}

		// ENTRENAMIENTO
		System.out.println("\nEntrenamiento: Todos los integrantes tienen su funcion en un desfile (Especializacion)");
		for (SeleccionModa integrante : integrantes) {
			System.out.print(integrante.getNombre() + " " + integrante.getApellidos() + " -> ");
			integrante.desfile();
		}


		// DISEÑAR VESTIDO
		System.out.println("\nPlanificar Desfile: Solo el diseñador tiene el metodo para planificar un desfile:");
		System.out.print(armani.getNombre() + " " + armani.getApellidos() + " -> ");
		((Disenador) armani).disenarVestido();

		// ENTREVISTA
		System.out.println("\nEntrevista: Solo el modelo tiene el metodo para dar una entrevista:");
		System.out.print(eva.getNombre() + " " + eva.getApellidos() + " -> ");
		((Modelo) eva).entrevista();

		// MASAJE
		System.out.println("\nMasaje: Solo el estilista tiene el metodo para maquillar:");
		System.out.print(raulMartinez.getNombre() + " " + raulMartinez.getApellidos() + " -> ");
		((Estilista) raulMartinez).maquillar();

	}
}