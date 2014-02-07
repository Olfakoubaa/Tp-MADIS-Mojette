import java.util.ArrayList;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		SuiteFarey f1=new SuiteFarey(4);

		ArrayList <Double> a =new ArrayList <Double>();
		a=f1.anglesDiscret(4);

		System.out.println(f1.toString());
		
		int[][] tabim = {{0,1,0,2},{1,3,1,2},{0,2,1,2},{3,1,0,2}};		
		int x,h;
		Mojette image=new Mojette(tabim);
		
		System.out.println ("donnez la direction de projection");
		int p=sc.nextInt();
		int q=sc.nextInt();
		int [] t= image.projection(p,q);
		image.afficheVect(t);

		}

}
