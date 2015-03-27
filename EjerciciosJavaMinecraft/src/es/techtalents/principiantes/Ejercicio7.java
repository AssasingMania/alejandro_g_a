package es.techtalents.principiantes;

import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*7. Programa java que declare cuatro variables enteras a, b, c y d y asígnale un valor acada una.
 *  A continuación realiza las instrucciones necesarias para que: 
 *  
 *  b tome el valor de c, 
 *  c tome el valor de a, 
 *  a tome el valor de d, 
 *  d tome el valor de b.
 *  
 *  
 *  Muestra el valor de cada variable antes y despues de los cambios
 * */
public class Ejercicio7 extends Ejercicio{
	
	public Ejercicio7(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int a = 400;
		int b = 800;
		int c = 900;
		int d = 700;
		
		b=c;
		print ("b vale: " +c);
		c=a;
		print ("c vale: " + a);
		a=d;
		print ("a vale: " + d);
		d=b;
		print ("d vale: " + b);
		
		
		
		
		
		
	}
	
}
