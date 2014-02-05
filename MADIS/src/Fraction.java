/***
 * 
 * @author Olfa
 */
public class Fraction {

	/**num�rateur*/
	private int numerator;
	/**num�rateur*/
	private int denominator;
	
	/**constructeur*/
	public Fraction(int numerator,int denominator){
		this.numerator=numerator;
		this.denominator=denominator;
	}

	/**constructeur*/
	public Fraction (Fraction f){
		this.numerator=f.getNumerator();
		this.denominator=f.getDenominator();
	}
	
	public float getFloat(){
		return (float)this.numerator/ this.denominator;
	}
	
	public double calculAngle(){
		double angle=Math.atan((double)denominator/(double) numerator);
		if(angle<0) angle+=Math.PI;
		return angle;	
	}
	
	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	/**ToString method*/
	public String ToString(){
		return this.numerator+"/"+this.denominator;
	}


}
