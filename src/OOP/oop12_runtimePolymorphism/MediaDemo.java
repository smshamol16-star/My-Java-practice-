package OOP.oop12_runtimePolymorphism;

public class MediaDemo {
    public static void main(String[] args){

        Media media;

        media = new Audio();
        media.play();

        media = new Video();
        media.play();

        media = new Podcast();
        media.play();

    }
}
