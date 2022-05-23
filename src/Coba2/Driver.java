package Coba2;

public class Driver {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3("Aruna", 5);
        mp3.nameOfProduct = "";
        mp3.description = "";
        mp3.price = 50000;
        mp3.artist = "Iwan Fals";
        mp3.duration = 120;
        System.out.println("============ MP3 ============");
        mp3.displayItem();
        mp3.display();

        System.out.println("\n");

        Dvd dvd = new Dvd("Ajopi", 1);
        dvd.nameOfProduct = "DVD Dreamtheater";
        dvd.description ="Blu-ray Dvd best quality original 100%";
        dvd.price = 100000;
        dvd.certificate = "qwertyuAOnawdpaKJH71278120";
        dvd.duration = 90;
        dvd.actors = "JOJO";
        System.out.println("============ DVD ============");
        dvd.displayItem();
        dvd.display();


        System.out.println("\n");
        Book book = new Book("Ajopi", 3);
        book.nameOfProduct = "Laskar Pelangi";
        book.description = "Laskar Pelangi adalah novel pertama karya Andrea Hirata yang " +
                "diterbitkan oleh Bentang Pustaka pada tahun 2005. Novel ini bercerita tentang " +
                "kehidupan 10 anak dari keluarga miskin yang bersekolah (SD dan SMP) di sebuah " +
                "sekolah Muhammadiyah di Belitung yang penuh dengan keterbatasan.";
        book.price = 75000;
        book.author = "Andrea Hirata";
        book.numberOfPages = 150;
        book.genre = "Drama";
        System.out.println("============ DVD ============");
        book.displayItem();
        book.display();


    }
}
