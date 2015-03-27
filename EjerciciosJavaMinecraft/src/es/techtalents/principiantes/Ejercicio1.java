package es.techtalents.principiantes;

import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*1. Programa java que realice lo siguiente: 
 * declarar una variable n de tipo int, 
 * una variable a de tipo double y
 * una variable c de tipo String y asigna a cada una un valor.
 * A continuación muestra por pantalla: El valor de cada variable,
 * la suma de n + a y la diferencia de a - n*/
public class Ejercicio1 extends Ejercicio{
	
	public Ejercicio1(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int n= 2;
		double a= 5.8;
		String c="jdshbvkjbdns";
		print("El valor de n es:" + n);
		print("El valor de a es:" + a);
		print("El valor de c es:" + c);
		print("El valor de n+a es:" + (n+a));
		print("El valor de a-n es:" + (a-n));
		
	   
	
		
		
				
		
		
		
		
		
		
		
		
	}
				
}