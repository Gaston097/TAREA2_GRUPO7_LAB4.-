package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {
	
	private String nombre;
	private int tipoDeInstalacion;
	
	Polideportivo(){
		
	}
	Polideportivo (double superficie, String nombre, int Tipo){
		super(superficie);
		this.nombre= nombre;
		this.tipoDeInstalacion = Tipo;
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setTipoDeInstalacion(int tipoDeInstalacion) {
		this.tipoDeInstalacion = tipoDeInstalacion;
	}


	@Override
	public int getTipoDeInstalacion() {
		return tipoDeInstalacion;
	}


	@Override
	public String toString() {
		return "Polideportivo se llama " + nombre + "y Tiene una superficie de " + this.getSuperficieEdificio() + " metros cuadrados";
	}
	
	
}
