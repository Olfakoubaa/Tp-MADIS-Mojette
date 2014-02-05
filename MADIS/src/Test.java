import java.util.ArrayList;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuiteFarey f1=new SuiteFarey(5);
		//ArrayList<Double> angles=new ArrayList <Double>();
		ArrayList <Double> a =new ArrayList <Double>();
		a=f1.anglesDiscret(5);
		for(int i=0;i<a.size();i++){
			System.out.println(a.get(i));
		}
		System.out.println(f1.toString());
		
		
		}

}
