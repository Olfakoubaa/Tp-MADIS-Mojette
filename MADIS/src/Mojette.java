import java.util.ArrayList;
import java.util.Arrays;


public class Mojette {
	
	private int[][] image ;

	
	Mojette(int [][] image){
		this.image=image;
	}

	public int[]  projection(int p , int q){
		/**nombre de bins de projection*/
		int nb= (image.length-1)*Math.abs(p)+(image[0].length-1)*Math.abs(q)+1;
		/**les valeurs des projections*/
		int[] tab=new int [nb];
		/**initialiser le tableu vide*/
		Arrays.fill(tab, 0);
		int min=0;
		int b;
		for (int l=0;l<image.length;l++){
			for (int k=0;k<image[0].length;k++){
				b=-q*k+p*l;
				if (b<min) min=b;
				}
			}
		
		for (int l=0;l<image.length;l++){
			for (int k=0;k<image[0].length;k++){

				b=-q*k+p*l+Math.abs(min);
				tab[b]=tab[b]+image[l][k];
				afficheVect(tab);				
			}
			System.out.println();
		}
		
		return tab;
	}
	
	
	public int[][] getImage() {
		return image;
	}

	public void setImage(int[][] image) {
		this.image = image;
	}
	
	
	public void afficheArrayList(ArrayList <Integer> vect ){
		
		for (int i=0; i<vect.size();i++){
			System.out.println( vect.get(i));
		}
	}
	
public void afficheVect(int[]vect ){
		
		for (int i=0; i<vect.length;i++){
			System.out.print( vect[i]+" ");
		}
		System.out.println();
	}
	
}
