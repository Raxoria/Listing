package tugas;

interface MinMax <T extends Comparable<T>> {
	 T max();
	 T min();
	 /* w w w .java2 s . co m*/
	}

class Data<T extends Comparable<T>>{
	T[] vals;
	Data(T[] o) {
		vals = o;
	}
	public T max() {
	 T v = vals[0];
	 for (int i = 1; i < vals.length; i++) {
		 if (vals[i].compareTo(v) > 0) {
			 v = vals[i];
		 }
	 }
	 return v;
	}
	public T min() {
			 T v = vals[0];
			 for (int i = 1; i < vals.length; i++) {
				 if (vals[i].compareTo(v) < 0) {
					 v = vals[i];
				 }
	 }
	 return v;
 	 	 }
 	 }

public class Main {
	public static void main(String args[]) {
		Integer tahunLahir[] = { 2002, 2001, 2007, 2004 };
		String nama[] = { "Rarairarang", "Voltmont", "Kazuno", "Rineru"};
		Data<Integer> year = new Data<Integer>(tahunLahir);
		Data<String> name = new Data<String>(nama);
		
		System.out.println("Umur ditentukan oleh urutan abjad. Semakin akhir maka akan semakin muda.");
		System.out.println("Paling tua :" + name.min() + ",lahir pada tahun " + year.min() + ",umurnya " + (2021-year.min()));
		System.out.println("Paling muda :" + name.max() + ",lahir pada tahun " + year.max() + ",umurnya " + (2021-year.max()));
	}
}
