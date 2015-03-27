package es.techtalents.principiantes;

import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*3. Programa java que realice lo siguiente: 
 *  
 *  El programa debe simular una conversacion falsa entre dos jugadores en minecraft
 *  para ello se hara uso de variables de tipo String y los comandos print() y wait()
 *  
 *  Ejemplo:
 *  <Pepito> Hola
 *  <Jaimito> Hola Pepito
 *  <Pepito> hazme tp
 *  <Jaimito> no puedo no soy op
 *  .....
 *  .....
 * 
 * */
public class Ejercicio3 extends Ejercicio{

	public Ejercicio3(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){

		//SOLUCION
		
		String p = "<Pepito> ";
		String j = "<Jaimito> ";
		
		print(p + "Hola");
		wait (2000);
		print(j + "Hola que pasa");
		wait (2000);
		print(p + "Hacme tp");
		wait (2000);
		print(j + "No puedo no soy op");
		wait (4000);
		print(p + "oh no pasa nada mira estoty en hunger games ven en olimpocraft");
		wait (2000);
		print(j + "VALE");
		wait (1000);
		print (j + "cual es el codigo?");
		wait (1000);
		print (p + "espera");
		wait (1000);
		print (j + "OK");
		wait (5000);
		print (p + "olimpo.me");
		wait (2000);
		print (j + "vale ya voy");
		
		
		


	}

}
