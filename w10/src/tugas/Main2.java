package tugas;

class Bound<T extends AlKes>
{
	private T objRef;

 	public Bound(T obj){
 		this.objRef = obj;
 	}

 	public void doRunTest(){
 		this.objRef.displayClass();
 	}
}

class AlKes
{
	public void displayClass()
	{
		System.out.println("Alat Kesehatan : Masker, Sanitizer.");
	}
}

class Masker extends AlKes
{
	public void displayClass()
	{
		System.out.println("Masker merupakan Alat Kesehatan");
	}
}

class Sanitizer extends AlKes
{
	public void displayClass()
	{
		System.out.println("Sanitizer merupakan Alat Kesehatan");
	}
}

public class Main2{
	public static void main(String a[]){
	
	 // similarly passing super class A
	 Bound<AlKes> al = new Bound<AlKes>(new AlKes());
	 al.doRunTest();
		
	 // Creating object of sub class C and
	 // passing it to Bound as a type parameter.
	 Bound<Sanitizer> san = new Bound<Sanitizer>(new Sanitizer());
	 san.doRunTest();

	 // Creating object of sub class B and
	 // passing it to Bound as a type parameter.
	 Bound<Masker> mask = new Bound<Masker>(new Masker());
	 mask.doRunTest();

	 }
 }
