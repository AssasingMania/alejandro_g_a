import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
     
		int num1;
		int num2;
		System.out.println("Hola porfavor introduzca un numero");
		num1 = getInt();
		System.out.println("Gracias, porfavor ahora introduzca otro numero");
		num2 = getInt();
		System.out.println("Gracias puede seguir jugando");
		System.out.println("Porfavor elija una operacion q calcule de tus dos numeros introducidos: s por multiplicacion, x por divivsion, y por resta y u por suma.");
		
		
		String operacionElegida = getString();
		if(operacionElegida.equals("s")){
			System.out.println("Calculando...");
			esperar(2000);
			System.out.println("La producto es:" + (num1*num2));
		}
		
		
		
		if(operacionElegida.equals("x")){
			System.out.println("Calculando");
			esperar(2000);
			System.out.println("La producto es:" + (num1/num2));
		}
		
		if(operacionElegida.equals("y")){
			System.out.println("Calculando...");
			esperar(2000);
			System.out.println("La producto es:" + (num1-num2));
		}
		
		
		if(operacionElegida.equals("u")){
			System.out.println("Calculando");
			esperar(2000);
			System.out.println("La producto es:" + (num1+num2));
		}
		
		
		
		
		
		
		
	}

	private static void esperar(long n) {
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//esto lee un numero del chat
	public static int getInt(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		int n = -5689;
		while(n ==-5689){
			try {
				n = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out.println("Eso no es un numero entero correcto");
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
			}
		}

		return n;
		
	}

	
	public static String getString(){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader (isr);
		String n = "";
			try {
				n = br.readLine();
			}  catch (IOException e) {
				
			}
		return n;
	}

	
	
}
