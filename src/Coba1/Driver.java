package Coba1;

public class Driver {
    public static void main(String[] args) {
        Mp3 mp3 = new Mp3();
        mp3.nameOfProduct = "DreamTheater full album";
        mp3.description = "Best Album of all time that ever made by dreamtheater";
        mp3.price = 300000;
        mp3.duration = 120;
        mp3.artist = "DreamTheater";
        System.out.println("============ MP3 ============");
        mp3.display();
        mp3.displayItem();

        System.out.println("\n");

        Dvd dvd = new Dvd();
        dvd.nameOfProduct = "Titanic";
        dvd.description = "Blu-ray Dvd best quality original 100%";
        dvd.price = 500000;
        dvd.certificate = "QwewojcsPJEapfso1232oeb";
        dvd.duration = 90;
        dvd.actors = "Ajopi";
        System.out.println("============ DVD ============");
        dvd.displayItem();
        dvd.display();

        System.out.println("\n");

        Book book = new Book();
        book.nameOfProduct = "Laskar Pelangi";
        book.description = "Laskar Pelangi adalah novel pertama karya Andrea Hirata yang " +
                "diterbitkan oleh Bentang Pustaka pada tahun 2005. Novel ini bercerita tentang " +
                "kehidupan 10 anak dari keluarga miskin yang bersekolah (SD dan SMP) di sebuah " +
                "sekolah Muhammadiyah di Belitung yang penuh dengan keterbatasan.";
        book.price = 100000;
        book.author = "Andrea Hirata";
        book.numberOfPages = 150;
        book.genre = "Drama";
        System.out.println("============ BOOK ============");
        book.displayItem();
        book.display();
    }
}
