package tugas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main4 {
	public static void printCollection(Collection<?> c) {
		for (Object e : c) {
			System.out.println(e);
		}
}

public static void main(String[] args) {
	System.out.println("Daftar Murid Baru FITB:");
	Collection<String> murid1 = new ArrayList<>();
	murid1.add("Nuno Alwi");
		printCollection(murid1);
	Collection<String> murid2 = new LinkedList<>();
	murid2.add("Temmy Mahesa");
		printCollection(murid2);
	Collection<String> murid3 = new HashSet<>();
	murid3.add("Sobri Waskito");
		printCollection(murid3);
	}
}