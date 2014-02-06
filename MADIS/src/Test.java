import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuiteFarey f1=new SuiteFarey(4);

		ArrayList <Double> a =new ArrayList <Double>();
		a=f1.anglesDiscret(4);

		System.out.println(f1.toString());
		
		int[][] tabim = {{0,1,0,2},{1,3,1,2},{0,2,1,2},{3,1,0,2}};		
		
		Mojette image=new Mojette(tabim);

//		ArrayList<Integer>tab=image.projection(2,1);
//		image.afficheVect(tab);
		int [] t= image.projection(2,1);
		image.afficheVect(t);

		}

}
