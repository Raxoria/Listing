package javaCollection;

public class Main {
	public static void main(String[] args) 
    {
        Family family = new Family();
        family.addUncle("Raden");
        family.addUncle("Fariz");
        family.addUncle("Abdillah");
        family.addUncle("Jatnika");

        family.addNiece("Ira", 4, 5);
        family.addNiece("Ratna", 1, 11);
        family.addNiece("Mulia", 10, 10);
        family.addNiece("Rahayu", 30, 5);

        System.out.println("Daftar Keponakan:");
        family.listNieces();
        System.out.println("Daftar Paman:");
        family.listUncles();

        family.findUncle("Raden").addPresent(family.findNiece("Ira"), "Boneka");
        family.findUncle("Raden").addPresent(family.findNiece("Ratna"), "Barbie");
        family.findUncle("Raden").addPresent(family.findNiece("Mulia"), "Buku cerita");
        family.findUncle("Raden").addPresent(family.findNiece("Rahayu"), "Ikat Rambut");

        if(!family.findUncle("Fariz").addPresent(family.findNiece("Ira"), "Pensil Warna")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Fariz").addPresent(family.findNiece("Ratna"), "Stabilo")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Fariz").addPresent(family.findNiece("Mulia"), "Cat Air")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Fariz").addPresent(family.findNiece("Rahayu"), "Spidol")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");

        if(!family.findUncle("Abdillah").addPresent(family.findNiece("Ira"), "Handphone")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Abdillah").addPresent(family.findNiece("Ratna"), "Laptop")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Abdillah").addPresent(family.findNiece("Mulia"), "VR Game")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Abdillah").addPresent(family.findNiece("Rahayu"), "TV")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");

        
        if(!family.findUncle("Jatnika").addPresent(family.findNiece("Ira"), "Kursi")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Jatnika").addPresent(family.findNiece("Ratna"), "Meja")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Jatnika").addPresent(family.findNiece("Mulia"), "Tempat Tidur")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        if(!family.findUncle("Jatnika").addPresent(family.findNiece("Rahayu"), "Sofa")) System.out.println("Tidak bisa menambahkan hadiah, melanggar aturan keluarga!");
        
        family.findNiece("Ira").listPresents();
        family.findNiece("Ratna").listPresents();
        family.findNiece("Mulia").listPresents();
        family.findNiece("Rahayu").listPresents();
        family.findUncle("Raden").listPresents();
        family.findUncle("Fariz").listPresents();
        family.findUncle("Abdillah").listPresents();
        family.findUncle("Jatnika").listPresents();

        int totalPresent = family.findNiece("Ira").clearPresents();
        System.out.println("Daftar hadiah terhapus, total yang dihapus = " + totalPresent);
    }
}
