package tugas;

class Print<T> {
	private T t;
	public T get(){
		return this.t;
	}
	public void set(T t1){
		this.t=t1;
	}
}

public class Main3 {
	//Java Generic Method
		 public static <T> boolean isEqual(Print<T> g1, Print<T> g2){
			 return g1.get().equals(g2.get());
		 }
		 public static void main(String args[]){
		 Print<String> g1 = new Print<>();
			 g1.set("Laki laki");
		 Print<String> g2 = new Print<>();
			 g2.set("Perempuan");
		 boolean isEqual = Main3.<String>isEqual(g1, g2);
 	 		 isEqual = Main3.isEqual(g1, g2);
 	 	 System.out.println("Apakah "+ g1.get() + " dan " + g2.get() + " itu sama?" + isEqual);	 
			}
}
