package problem;
/**
 * Classe contenant les différente méthodes mathématiques
 * @author nicol
 *
 */
public class Math {
	/**
	 * Variable stockant le nombre utilisé pour les différentes fonctions mathématiques
	 */
private int facteur;
/**
 * getter sur la variable facteur
 * @return la variable facteur
 */
public int getFacteur() {
	return facteur;
};
/**
 * Constructeur de base , initialise le facteur à 1
 */
Math(){
	facteur=1;
};
/**
 * Constructeur avec initilisation de la variable facteur
 * @param f nombre utilisé pour facteur
 */
Math(int f){
	facteur=f;
}
/**
 * méthode qui vérifie si un nombre est divisible par facteur
 * @param n , entier en paramètre
 * @return un booléen correspondant au résultat, false si le facteur est 0
 */
public boolean diviseur(int n){
	if (facteur==0)
		return false;
	else
		return (n%facteur==0);
}
/**
 * Verifie si deux objet math ont le même facteur
 * @param b Math
 * @return Boolean
 */
public boolean equals(Math b) {
	return facteur==b.getFacteur();
}

}
