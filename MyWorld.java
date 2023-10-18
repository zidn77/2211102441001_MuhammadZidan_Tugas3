import greenfoot.*;
import java.util.Random;

public class MyWorld extends World {
    private static final int AWAN_INTERVAL = 100; // Interval munculnya awan (dalam frame)
    private Burung burung;

    public MyWorld() {
        super(800, 400, 1);
        prepare();
    }

    public void act() {
        // Munculkan awan setiap AWAN_INTERVAL frame
        if (Greenfoot.getRandomNumber(AWAN_INTERVAL) == 0) {
            addObject(new Awan(), getWidth(), Greenfoot.getRandomNumber(getHeight()));
        }
    }

    private void prepare() {
        burung = new Burung();
        addObject(burung, 115, 150);

        // Tambahkan beberapa awan pada saat inisialisasi
        for (int i = 0; i < 3; i++) {
            addObject(new Awan(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
        Pesawat pesawat = new Pesawat();
        addObject(pesawat,159,262);
    }
}