import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuiteFarey f1=new SuiteFarey(4);
		//ArrayList<Double> angles=new ArrayList <Double>();
		ArrayList <Double> a =new ArrayList <Double>();
		a=f1.anglesDiscret(4);
//		for(int i=0;i<a.size();i++){
//			System.out.println(a.get(i));
//		}
		System.out.println(f1.toString());
		
		int[][] tabim = {{3,1,0,2},{0,2,1,2},{1,3,1,2},{0,1,0,2}};		
		
		Mojette image=new Mojette(tabim);

		ArrayList<Integer>tab=image.projection(2,1);
		image.afficheVect(tab);

		
		
	/*ArrayList <Integer> pro=image.projection(1, 0);
		for(int i=0;i<pro.size();i++){
		System.out.println(pro.get(i));
	}*/		
		
		}

}
