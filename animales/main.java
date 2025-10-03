package animales;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
ArrayList<Animal> perro = new ArrayList();
ArrayList<Animal> gato = new ArrayList();
Scanner scanner = new Scanner(System.in);

perro.add (new perro("aga",1,"caa"));
gato.add (new gato("gato3",6,"14 cm"));
int opcion=1;
while(opcion!=3) {
	System.out.println("Menu");
	System.out.println("1.Añadir animal: ");
	System.out.println("2.Ver animales: ");
	System.out.println("3.Salir: ");
	 opcion = scanner.nextInt();

switch (opcion) {
case 1:
	System.out.println("Introduce 1 para añadir un perro y 2 si desea introducir un gato");
	
	int op = scanner.nextInt();
		System.out.println("Nombre:");
		String nombre = scanner.next();
		System.out.println("Edad:");
		int edad = scanner.nextInt();
		System.out.println("Si es perro introduce la raza si es gato introduce los mm de bigote");
		String rb = scanner.next();
		if(op==1) {
			perro.add (new perro(nombre,edad,rb));
		}
		if(op==2) {
			gato.add (new gato(nombre,edad,rb));
		}
	break;
case 2:

System.out.println("=== PERROS ===");
for (Animal animal : perro) {
    System.out.println(animal.mostrarDatos());
    if (animal instanceof perro) {  
        ((perro) animal).ladrar(); 
        System.out.println("Raza" + ((perro) animal).getRaza());
    }
}
System.out.println("\n=== GATOS ===");
for (Animal animal : gato) {
    System.out.println(animal.mostrarDatos());
    if (animal instanceof gato) {  
        ((gato) animal).maullar(); 
        System.out.println("Longitud de bigotes: " + ((gato) animal).getLongBigotes());
    }
}

break;

case 3:
	
	System.out.println("Salir");
	
	break;
}
}
	}
}
