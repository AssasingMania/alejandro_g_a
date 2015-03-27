package es.techtalents.medio;

import java.security.acl.LastOwnerException;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*1. Programa java que realice lo siguiente: 
 * 
 * pide al jugador que introduzca un numero entre 1 y 10 y asignalo a una variable
 * 
 * si el numero introducido es menor que 1 o mayor que 10 lanzale un rayo como castigo
 * 
 * si el numero introducido es correcto dale 2 diamantes al jugador 
 * 
 * 
*/
public class Ejercicio1m extends Ejercicio{
	
	public Ejercicio1m(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int n;
		Location lugar;
		String s;
		
		print("Hola porfavor introduzca su nick de minecraft");
		s = getString();
		print("Ahora porfavor introduzca un numero entre el 1 y el 10");
		n= getInt();
		
		Player jugador = getPlayer(s);
		
		if(n < 1 || n > 10){
			strikeLightning(jugador);
		}else{
			giveItem(jugador, Material.DIAMOND);
			giveItem(jugador, Material.DIAMOND);
		}
		
		
		print("Gracias puede seguir jugando");
	    
	}
}
