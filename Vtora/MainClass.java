package Vtora;

import java.util.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		MetodiZaListaNiza m = new MetodiZaListaNiza();
		List<String> lista = new ArrayList<String>();
		lista.add("A");
		lista.add("B");
		lista.add("V");
		m.listToArray(lista);

		String[] niza = { "a", "b", "v" };
		m.arrayToList(niza);
	}
}
