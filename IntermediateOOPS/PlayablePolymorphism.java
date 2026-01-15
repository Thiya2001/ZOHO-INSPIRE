interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
}

public class PlayablePolymorphism {
    public static void main(String[] args) {

        Playable g = new Guitar();
        g.play();

        Playable p = new Piano();
        p.play();
    }
}


