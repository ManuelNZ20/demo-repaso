package ejemplo;

public class Empleado extends Persona{
	
	private float sueldo;
	
	public(String nombre,String apellido,float sueldo){
		super(nombre,apellido);
		this.sueldo = sueldo;
	}
	
	public(){
		this(null,null,0.0f);
	}
	
	
}
