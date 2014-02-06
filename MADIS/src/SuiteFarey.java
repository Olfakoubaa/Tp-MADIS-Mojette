import java.util.ArrayList;
/***
 * 
 * @author Olfa
 *
 */
public class SuiteFarey {

	/**Ordre de la suite*/
	private int n=0;
	/**Elements de la suite*/
	private ArrayList <Fraction> suiteFarey= new ArrayList<Fraction>();
	
	/**Constructeur*/
	public SuiteFarey(int n){
		this.n=n;
		this.suiteFarey=calculSuite(this.n);
	}
	
	
	/**Calcul des termes de la suite */
	public ArrayList <Fraction> calculSuite(int p){
		if (p==1){	
			suiteFarey.add(new Fraction(0,1));
			suiteFarey.add(new Fraction(1,1));
		}	
		if (p>1){
			calculSuite(p-1);
			for (int i=1;i<p;i++){
				if (pgcd(i,p)==1){
					suiteFarey.add(new Fraction (i,p));
				}
			}
		}		
		tri();
		return suiteFarey;
	}

	
		
	//tri selection itératif
	public void tri(){
			
		ArrayList <Float> F=new ArrayList<Float>();
		
		/**transformer les  Fraction en float*/
		for (int k=0;k<this.suiteFarey.size();k++){
			F.add(this.suiteFarey.get(k).getFloat());
		}
		
		
		for (int i=0;i<F.size()-1;i++){
			int min=i;
			
			for(int j=i+1;j<F.size();j++) {
				if (F.get(j)<F.get(min)) min=j;
			}
					
			if (min!=i) {
				/**permutation*/
				Fraction f=this.suiteFarey.get(i);
				this.suiteFarey.set(i, this.suiteFarey.get(min));
				suiteFarey.set(min, f);
						
				float x=F.get(i);
				F.set(i, F.get(min));
				F.set(min, x);
						
			}
		}
	}
		
	/**calcul des angles*/
	

	public ArrayList <Double> anglesDiscret(int n){
		
		ArrayList<Double> angles=new ArrayList <Double>();
		
		for (int i=0;i<this.suiteFarey.size();i++){
			
				angles.add(suiteFarey.get(i).getAngle());
				
		}


		for (int i=0;i<this.suiteFarey.size();i++){	
			if(!exist(angles,suiteFarey.get(i).getSym().getAngle())){
				angles.add(suiteFarey.get(i).getSym().getAngle());
			}
			
			
			if(!exist(angles,suiteFarey.get(i).getSymBis().getAngle())){
				angles.add(suiteFarey.get(i).getSymBis().getAngle());
							
			}

		}
	
		
		return angles;
	}
		
	public boolean exist (ArrayList <Double> angles, double elem){
		
		boolean test=false;
		int i=0;
		while(i<angles.size() && !test){
			test = elem==angles.get(i);
			i++;
		}
		
		return test;
	}
	
	
		/**Calcul du pgcd*/
		static int pgcd (int a, int b) { 

			    if(a<b) 
			      return (pgcd(b,a));
			    else if(b==0) 
			      return (a);
			    else
			      return (pgcd(b,a%b));

		}
	
	

	public int getN() {
		return n;
	}

	public ArrayList<Fraction> getSuiteFarey() {
		tri();
		return suiteFarey;
	}


	@Override
	public String toString() {
		String str=  "SuiteFarey [n=" + n  + "] : ";
		
		for (int i=0;i<this.suiteFarey.size();i++){
			str += this.suiteFarey.get(i).ToString()+ " ; ";
		}
		return str;
	}
	
	
	
		
}
