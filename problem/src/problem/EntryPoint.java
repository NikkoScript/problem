package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryPoint {

	public static void main(String[] args) {
		int size=1;
		System.out.println("Taille de la liste à tester ?");
		try {
			InputStreamReader streamin=new InputStreamReader(System.in);
			BufferedReader bufferin=new BufferedReader(streamin);
			size=Integer.parseInt(bufferin.readLine());
		}
		catch(IOException e) {
			System.out.println("erreur lors de la lecture du clavier");
		}
		//initilisation des différentes variables utilisé pour la résolution du problème
		ListeRandom l=new ListeRandom();
		l.init(size);
		Solution s=new Solution();
		//parcours de la liste aléatoire de -1000 à 1000 et affichage du résultat sur la sortie standard 
		for(int k : l.getList()) {
			System.out.println(s.compute(k));
		}
		
		
	}

}
