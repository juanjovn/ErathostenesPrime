package primosEratostenes;
import java.util.Scanner;

public class PrimosEratostenes {

	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int n=0;
		int cont = 0 ;
		boolean[] erato= eratostenes(15500000);
		System.out.println("Teclea posicion : ");
		n=sn.nextInt();
		for (int i=1; i<erato.length;i++) {
			if (erato[i]==true) {
				cont++;
			}
			if (cont==n){
				System.out.println("Primo numero "+cont+" es : "+i);
				break;
			}
		}
		
		sn.close();
	}
	
	static boolean[] eratostenes(int ls){
		boolean[] primostenes= new boolean[ls+1];
		for (int i=2; i<=ls; i++) primostenes[i]=true;
		for(int factor=2; factor*factor <=ls; factor++){
			if(primostenes[factor]){
				for(int j=factor;j*factor<=ls;j++) primostenes[factor*j]=false;
			}
		}
		return primostenes;
	}
}