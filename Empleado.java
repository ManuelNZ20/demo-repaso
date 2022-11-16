package ejemplo;

public class Empleado extends Persona{
	
	private float sueldo;
	
	public(String nombre,String apellido,float sueldo){
		super(nombre,apellido);
		this.sueldo = sueldo;
	}
	
	
	public float getSueldo(){
	    return sueldo;
	}
	
	public void setSueldo(float sueldo)
	{
	    this.sueldo = sueldo;
	}
}
