package Treta;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String[] args) {
		List<SportskiKlub> list = new ArrayList<SportskiKlub>();
		list.add(new SportskiKlub("Real Madrid", "Fudbal", 24));
		list.add(new SportskiKlub("FC Barcelona", "Fudbal", 25));
		list.add(new SportskiKlub("Manchester United", "Fudbal", 32));

		Collections.sort(list);
		for (SportskiKlub a : list) {
			System.out.println(a.getIme());
			System.out.println(a.getSport());
			System.out.println(a.getClenovi());
			System.out.println();
		}
	}
}
