package PolimorfismoInterface;

public class Disenador extends SeleccionModa {

	private int idDisenador;

	public Disenador() {
		super();
	}

	public Disenador(int id, String nombre, String apellidos, int edad, int idDisenador) {
		super(id, nombre, apellidos, edad);
		this.setIdDisenador(idDisenador);
	}

	public int getIdDisenador() {
		return idDisenador;
	}

	public void setIdDisenador(int idDisenador) {
		this.idDisenador = idDisenador;
	}

	@Override
	public void desfile() {
		System.out.println("Dirige un desfile(Clase Disenador)");

	}

	public void disenarVestido() {
		System.out.println("Diseña un vestido");
	}

}
