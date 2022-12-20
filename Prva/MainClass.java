package Prva;

import java.util.List;
import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Brufen");
		lista.add("Kafetin");
		lista.add("Analgin");
		lista.add("Andol");
		lista.add("Paracetamol");

		if (lista.get(lista.size() - 1).equals("Paracetamol")) {
			System.out.println("Lekot pomaga za namaluvanje na telesnata temperatura.");
		} else
			System.out.println("Namenata na lekot e nepoznata.");
	}
}
