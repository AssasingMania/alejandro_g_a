package es.techtalents.principiantes;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import es.techtalents.main.Ejercicio;

/*1. Programa java que realice lo siguiente: 
 * declarar una variable n de tipo int, 
 * una variable a de tipo double y
 * una variable c de tipo String y asigna a cada una un valor.
 * A continuación muestra por pantalla: El valor de cada variable,
 * la suma de n + a y la diferencia de a - n*/
public class Calculadora extends Ejercicio{
	
	public Calculadora(JavaPlugin plugin) {
		super(plugin);
	}

	public void run(){
		
		//SOLUCION
		int num1;
		int num2;
		String lugar;
		print("Hola porfavor introduzca un numero");
		num1 = getInt();
		print("Gracias, porfavor ahora introduzca otro numero");
		num2 = getInt();
		print("Gracias puede seguir jugando");
		print("Hola porfavor ponga su nick de minecraft");
		lugar = getString();
		Player jugadorelegido = getPlayer(lugar);
		print("Porfavor elija una operacion q calcule de tus dos numeros introducidos: s por multiplicacion, x por divivsion, y por resta y u por suma.");
		
		
		String operacionElegida = getString();
		strikeLightning(jugadorelegido);
		if(operacionElegida.equals("s")){
			print("Calculando...");
			wait(2000);
			print("La producto es:" + (num1*num2));
		}
		
		
		
		if(operacionElegida.equals("x")){
			print("Calculando");
			wait(2000);
			print("La producto es:" + (num1/num2));
		}
		
		if(operacionElegida.equals("y")){
			print("Calculando...");
			wait(2000);
			print("La producto es:" + (num1-num2));
		}
		
		
		if(operacionElegida.equals("u")){
			print("Calculando");
			wait(2000);
			print("La producto es:" + (num1+num2));
		}
		
	}
				
}