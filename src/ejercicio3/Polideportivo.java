package ejercicio3;

public class Polideportivo extends Edificio implements InstalacionDeportiva {
	
	private String nombre;
	private int tipoDeInstalacion;
	
	Polideportivo(){
		
	}
	Polideportivo(double superficie, String nombre, int Tipo){
		super(superficie);
	    this.nombre=nombre;
	    this.tipoDeInstalacion=Tipo;	    
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	@Override
	public int getTipoDeInstalacion() {
		
		return tipoDeInstalacion;
	}
	@Override
	public String toString() {
		return "Polideportivo se llama" + nombre + "y tiene una superficie de " + this.getSuperficieEdificio() + " metros cuadrados";
	}
	
}
