package ejemplo;

public class Persona{
 private String nombre;
 private String apellido;
 public Persona(String nombre,String apellido){
   this.nombre = nombre;
   this.apellido = apellido;
 }
 
 public Persona(){
  this(null,null);
 }
 public String getNombre(){
  return nombre;
 }
 
 public String getApellido()
 {
  return apellido;
 }
 
 }


