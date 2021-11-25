package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EntryPoint {

	public static void main(String[] args) {
		int size=1;
		System.out.println("Taille de la liste � tester ?");
		try {
			InputStreamReader streamin=new InputStreamReader(System.in);
			BufferedReader bufferin=new BufferedReader(streamin);
			size=Integer.parseInt(bufferin.readLine());
		}
		catch(IOException e) {
			System.out.println("erreur lors de la lecture du clavier");
		}
		//initilisation des diff�rentes variables utilis� pour la r�solution du probl�me
		ListeRandom l=new ListeRandom();
		l.init(size);
		Solution s=new Solution();
		//parcours de la liste al�atoire de -1000 � 1000 et affichage du r�sultat sur la sortie standard 
		for(int k : l.getList()) {
			System.out.println(s.compute(k));
		}
		
		
	}

}
