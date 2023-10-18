import greenfoot.*;

public class Awan extends Actor {
    private GreenfootImage awanImage;
    private int speed;

    public Awan() {
        awanImage = new GreenfootImage("Awan.png");
        setImage(awanImage);
        speed = Greenfoot.getRandomNumber(2) + 1; // Kecepatan acak antara 1 dan 2
    }

    public void act() {
        // Menggerakkan awan ke kiri
        setLocation(getX() - speed, getY());

        // Jika awan mencapai ujung kiri layar, hapus aktor
        if (getX() < 40) {
            getWorld().removeObject(this);
        }
    }
}






