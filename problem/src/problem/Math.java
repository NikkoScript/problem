package problem;
/**
 * Classe contenant les diff�rente m�thodes math�matiques
 * @author nicol
 *
 */
public class Math {
	/**
	 * Variable stockant le nombre utilis� pour les diff�rentes fonctions math�matiques
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
 * Constructeur de base , initialise le facteur � 1
 */
Math(){
	facteur=1;
};
/**
 * Constructeur avec initilisation de la variable facteur
 * @param f nombre utilis� pour facteur
 */
Math(int f){
	facteur=f;
}
/**
 * m�thode qui v�rifie si un nombre est divisible par facteur
 * @param n , entier en param�tre
 * @return un bool�en correspondant au r�sultat, false si le facteur est 0
 */
public boolean diviseur(int n){
	if (facteur==0)
		return false;
	else
		return (n%facteur==0);
}
/**
 * Verifie si deux objet math ont le m�me facteur
 * @param b Math
 * @return Boolean
 */
public boolean equals(Math b) {
	return facteur==b.getFacteur();
}

}
