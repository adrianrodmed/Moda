package PolimorfismoInterface;

public class Modelo extends SeleccionModa {

	private int posicion;
	private String genero;

	public Modelo() {
		super();
	}

	public Modelo(int id, String nombre, String apellidos, int edad, int posicion, String genero) {
		super(id, nombre, apellidos, edad);
		this.posicion = posicion;
		this.genero = genero;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public void desfile() {
		System.out.println("Realiza un desfile (Clase Modelo)");
	}

	public void entrevista() {
		System.out.println("Da una Entrevista");
	}

}