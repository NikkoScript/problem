package problem;

import java.util.LinkedList;
import java.util.Random;
/**
 * classe de gestion de la liste des entier de -1000 à 1000
 * @author nicol
 *
 */
public class ListeRandom {
private Random rng;
private LinkedList< Integer > list;

public LinkedList<Integer> getList() {
	return list;
}
static int Max=1000;

public static int getMax() {
	return Max;
}
public ListeRandom() {
	list=new LinkedList<Integer>();
	rng= new Random();
}
public void init(int size) {
	for(int k=0;k<size;k++) {
		//range de -Max to +Max.
		if(rng.nextBoolean()) 
			list.add(rng.nextInt(Max));		
		else
			list.add(-1*rng.nextInt(Max));
	}
}
}
