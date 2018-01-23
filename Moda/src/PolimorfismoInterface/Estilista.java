package PolimorfismoInterface;

public class Estilista extends SeleccionModa {

	private String titulacion;
	private int experiencia;

	public Estilista() {
		super();
	}

	public Estilista(int id, String nombre, String apellidos, int edad, String titulacion, int experiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.experiencia = experiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void desfile() {
		System.out.println("Da asistencia en el desfile (Clase Estilista)");
	}

	public void maquillar() {
		System.out.println("Maquilla");
	}

}