package animales;

public class perro extends Animal {
public String raza;
public void ladrar() {
	System.out.println("ladra");
}
	public perro() {
		// TODO Auto-generated constructor stub
	}
	public perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	@Override
	public String toString() {
		return "perro [raza=" + raza + ", nombre=" + nombre + ", edad=" + edad + ", getRaza()=" + getRaza() + "]";
	}
	
	

}
