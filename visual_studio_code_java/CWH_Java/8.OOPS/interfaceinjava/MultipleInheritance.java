package interfaceinjava;

// all methods of interfaces are public by default
interface GPS {
    void runGPS();
}

interface Camera {
    void runCamera();

    void runGPS();
}

interface MediaPlayer {
    void runMediaPlayer();
}

// In java multiple inheritance is achived using interface, it makes sure that
// if there exists same methods in two different parent class then also no
// problem is faced as the only definition exists in the subclass

class SmartPhone implements GPS, Camera, MediaPlayer {
    public void runGPS() {
        System.out.println("running GPS");
    }

    public void runCamera() {
        System.out.println("running Camera");
    }

    public void runMediaPlayer() {
        System.out.println("running Media Player");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        // SmartPhone obj=new SmartPhone();
        GPS obj = new SmartPhone();
        Camera objC = new SmartPhone();
        MediaPlayer objMP = new SmartPhone();
        obj.runGPS();
        objC.runCamera();
        objC.runGPS();
        objMP.runMediaPlayer();
    }
}
