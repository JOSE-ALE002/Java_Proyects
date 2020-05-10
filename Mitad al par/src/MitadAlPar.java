import java.util.Scanner;

public class MitadAlPar {
	
	int Desimales(String c) {
		int a = c.length(), resp = 0;
		String Subcadena;
		for(int i = 0; i < a; i++) {
			if(c.charAt(i) == '.') {
				Subcadena = c.substring((i+1));
				resp = Subcadena.length();
				break;
			}
		}
		return resp;
	}

	public static void main(String args[]) {	
		MitadAlPar MitadAlPar = new MitadAlPar();
		Scanner entrada = new Scanner(System.in);
		String cadena, unidad  ="", decimal ="";
		int decimales, lon;
		char []array;
		String uf = "";
		boolean election = false;
		
		System.out.println("\t\t>> Metodo Mitad Al Par <<\n");
		System.out.print("\t1. Ingrese un numero: ");
		cadena = entrada.nextLine();
		lon = cadena.length();
		
		int d = MitadAlPar.Desimales(cadena);
		do {
			System.out.print("\t2. Ingrese cantidad de Decimales: ");
			decimales = entrada.nextInt();
			if(decimales > d  || decimales <= 0) {
				System.out.println("\t\tNo valido\n");
			}
		}while(decimales > d  || decimales <= 0);
		
		
		for(int i = 0; i < lon; i++) {
			if(cadena.charAt(i) == '.') {
				System.out.println("\n\t* El  punto decimal esta en la posicion: " + i);
				unidad = cadena.substring(0, i);
				decimal = cadena.substring((i+1), i + decimales +1);
				System.out.println("\t* Cadena Enteros: " + unidad + " longitud: "+ unidad.length());
				System.out.println("\t* Cadena Decimales: " + decimal + " longitud: "+ decimal.length());
			}
		}
		
		array = decimal.toCharArray();
		for(int j = decimal.length()-1; j >= 0; j--) {
			
			String aux = String.valueOf(decimal.charAt(j));
			//System.out.println("El caracter es: " + aux);
			int num = Integer.parseInt(aux); 
			//System.out.println("El numero es:  " + num);
			//System.out.println("bro " + j);
			if(j != 0) {
				if(num >= 5) {
				//	System.out.println("Entro a Mayor que 5");
					//System.out.println(array);
					String aux2 = String.valueOf(decimal.charAt(j-1));
					//System.out.println("El numero tomado es: " + aux2);
					int num2 = Integer.parseInt(aux2);
					num2++;
					String convert = Integer.toString(num2);
					//System.out.println("Num tomado Aumentado: " + num2);
					array[j-1] = convert.charAt(0);
					
					//System.out.println(rb);
				}
			}else {
				//System.out.println("No me lllega");
				String u = "";
				String l = String.valueOf(array[j]);
				//System.out.println("El ultimo digito es: " + l);
				int nr = Integer.parseInt(l);
				if(nr >= 5) {
					election = true;
					for(int i = 0; i < unidad.length(); i++) {
						u += "" + String.valueOf(unidad.charAt(i));
						//System.out.println(u);
					}
					
					//System.out.println("El resultado de la u es: " + u);
					int a = Integer.parseInt(u);
					a++;
					//System.out.println("El resultado de la unidad es: " + a);
					u = Integer.toString(a);
					uf = u;
				}else {
					uf = unidad; 
				}
			}
		}
		
		if(election == true) {
			System.out.println("\n\tEl numero redondeado es: : " + uf);
		}else {
			System.out.print("\n\tEl numero redondeado es " + uf +".");
			System.out.println(array);
		}
	}
}
	//			PRUEBA DE SUBCADENAS
		/*		
		Scanner entrada = new Scanner(System.in);
		String cadena, unidad, decimal;
		int decimales, lon;
		
		System.out.println("Ingrese numero: ");
		cadena = entrada.next();
		
		System.out.println("Ingrese cantidad de Decimales: ");
		decimales = entrada.nextInt();
		
		lon = cadena.length();
		
		for(int i = 0; i < lon; i++) {
		if(cadena.charAt(i) == '.') {
		System.out.println("Esta es la posicion: " + i);
		unidad = cadena.substring(0, i);
		decimal = cadena.substring((i+1), i + decimales +1);
		System.out.println(unidad);
		System.out.println(decimal);
		}
}*/
