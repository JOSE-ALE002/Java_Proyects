import java.security.SecureRandom;

public class Naleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecureRandom naleatorio = new SecureRandom(); 
		int na = naleatorio.nextInt(7); 
		
		System.out.println(na);
		
		if(na==6){
			System.out.println("YOU WON!");
		}
		
		else {
			System.out.println("YOU LOSE!");
		}
		
		
		

	}

}
