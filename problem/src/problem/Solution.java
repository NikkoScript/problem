/**
 * 
 */
package problem;

/**
 * classe permettant la résolution du problème
 * @author nicol
 *
 */
public class Solution {

	private Math div3;
	private Math div5;
	
	/**
	 * getter sur div5
	 * @return Math
	 */
	public Math getDiv5() {
		return div5;
	}
/**
 * getter sur div3
 * @return Math
 */
	public Math getdiv3() {
		return div3;
	}
/**
 * constructeur par défaut , intilialise div 3 et div5
 */
	public Solution() {
		div3=new Math(3);
		div5=new Math(5);
	}
	
	
	/**
	 * fonction vérifiant la divisibilité du nombre entré en paramètre
	 * @param n
	 * @return boolean
	 */
	public String compute(int n ) {
		if (div3.diviseur(n)&&div5.diviseur(n))
			return new String("Gestform");
		else if (div3.diviseur(n))
			return new String("Geste");
		else if (div5.diviseur(n))
			return new String("Forme");
		else 
			return new String(Integer.toString(n));		
	}

}
