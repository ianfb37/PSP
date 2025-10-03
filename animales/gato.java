package animales;

public class gato extends Animal {
public String LongBigotes;
public void maullar() {
	System.out.println("miau");
}
public String getLongBigotes() {
	return LongBigotes;
}
public void setLongBigotes(String longBigotes) {
	LongBigotes = longBigotes;
}
public gato(String nombre, int edad, String longBigotes) {
	super(nombre, edad);
	LongBigotes = longBigotes;
}
public gato() {
	super();
	// TODO Auto-generated constructor stub
}
public gato(String nombre, int edad) {
	super(nombre, edad);
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "gato [LongBigotes=" + LongBigotes + ", nombre=" + nombre + ", edad=" + edad + ", getLongBigotes()="
			+ getLongBigotes() + ", getNombre()=" + getNombre() + ", getEdad()=" + getEdad()  + ", toString()="
			+ super.toString() + "]";
}

}
