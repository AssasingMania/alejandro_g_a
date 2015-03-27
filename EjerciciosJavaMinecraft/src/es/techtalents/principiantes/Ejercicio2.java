package es.techtalents.principiantes;

import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*2. Programa java que realice lo siguiente: 
 * declarar dos variables x e y de tipo int, 
 * dos variables n y m de tipo double y 
 * asigna a cada una un valor. 
 * A continuación reliza y muestra muestra por pantalla el valor de cada variable y
 * la suma de n + m.
 * la multiplicacion de n * n 
 * la division de x / y
 * la division de x / m
 * la operacion (n+n/x)*y
 * la diferencia de y-x
 * la suma de y + 4
 * 
 * * indicando lo que es cada cosa, Por Ejemplo: 
 * "n es: 3.5"
 * "m es: 4.5"
 * "la suma de n + m es: 8.0"
 * 
 * */
public class Ejercicio2 extends Ejercicio{
	
	public Ejercicio2(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int x = 700;
		int y = 80;
		double n = 455;
		double m = 555;
		
		print ("x vale: " + x);
		print ("y vale: " + y);
		print ("n vale: " + n);
		print ("m vale: " + m);
		
		print ("n+m vale: " + (n+m) );
		print ("n*n vale: " + (n*n) );
		print ("x/y vale: " + (x/y) );
		print ("x/m vale: " + (x/m) );
		print ( "(n+n/x)*y vale: "          +     ((n+n/x)*y)     );
		print ("y-x vale: " + (y-x) );
		print ("y+4 vale: " + (y+4) );
		
		
		
		
	}
	
}
