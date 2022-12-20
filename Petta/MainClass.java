package Petta;

import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main(String[] args) {
		Set<String> mnozestvo1 = new TreeSet<String>();
		mnozestvo1.add("Matematika");
		mnozestvo1.add("Geografija");
		mnozestvo1.add("Istorija");

		Set<String> mnozestvo2 = new TreeSet<String>();
		mnozestvo2.add("Biologija");
		mnozestvo2.add("Matematika");
		mnozestvo2.add("Istorija");

		System.out.println("Presek od dvete mnozhestva:");
		mnozestvo1.retainAll(mnozestvo2);
		System.out.println(mnozestvo1);

	}
}
