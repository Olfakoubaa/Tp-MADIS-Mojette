import java.util.ArrayList;


public class Mojette {
	
	private int[][] image ;

	
	Mojette(int [][] image){

		this.image=image;
	}

	public ArrayList <Integer> projection(int p , int q){
		/**les valeurs des projections*/
		ArrayList<Integer>tab=new ArrayList<Integer>();
		//ligne
		for (int i=0;i<this.image.length;i++){
			//colonne
			for(int j=0;j<this.image.length;j++){
				
				int s= this.image[i][j];				
					
					if (i+q>i ){	
						int x=i+q;
						int y=j-p;
						while(x>=0 && x<this.image.length && y>=0 && y <this.image.length){
						s+=this.image[x][y];
						x=x+q;
						y=y-p;
					}
				}					
				tab.add(s);	
			}
		}
	return tab;
}
				
				/*	if(i-q <0 && j+p<this.image.length && j+p>0){
						tab.add(this.image[i][j]);
					}

//					else if(i-q>=0 && j+p < this.image.length && j+p>=0 && i-q < this.image.length){
//						s+=this.image[i-q][j+p];
//					}
//					if (i-q>0 &&j+p<image.length)
//						tab.add(s);			
			}
		}
		
*/
	public int[][] getImage() {
		return image;
	}

	public void setImage(int[][] image) {
		this.image = image;
	}
	
	
	public void afficheVect(ArrayList <Integer> vect ){
		
		for (int i=0; i<vect.size();i++){
			System.out.println( vect.get(i));
		}
	}
	
}
