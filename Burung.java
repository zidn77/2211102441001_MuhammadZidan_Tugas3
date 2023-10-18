import greenfoot.*;

public class Burung extends Actor {
    private GreenfootImage[] animasiBurung;
    private int frame;
    private int delay = 10; // Kecepatan animasi, semakin besar semakin lambat
    private int moveSpeed = 5; // Kecepatan gerakan

    public Burung() {
        animasiBurung = new GreenfootImage[2]; // Jumlah gambar animasi
        for (int i = 0; i < 2; i++) {
            animasiBurung[i] = new GreenfootImage(i + 1 + ".png");
        }
        setImage(animasiBurung[frame]);
    }

    public void act() {
        gerak();
        ubahUkuran();
    }

    private void gerak() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - moveSpeed); // Bergerak ke atas
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + moveSpeed); // Bergerak ke bawah
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - moveSpeed, getY()); // Bergerak ke kiri
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + moveSpeed, getY()); // Bergerak ke kanan
        }

        // Mengatur animasi
        if (Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("down") ||
            Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("right")) {
            if (frame < 1) {
                frame++;
                setImage(animasiBurung[frame]);
            } else {
                frame = 0;
                setImage(animasiBurung[frame]);
            }
        } else {
            // Jika tidak ada tombol panah yang ditekan, animasi tetap berjalan antara 2 frame saja
            if (frame == 0) {
                frame = 1;
                setImage(animasiBurung[frame]);
            } else {
                frame = 0;
                setImage(animasiBurung[frame]);
            }
        }
    }

    private void ubahUkuran() {
        // Mengubah ukuran aktor jika terlalu besar
        if (getImage().getWidth() > 50 || getImage().getHeight() > 50) {
            GreenfootImage newImage = new GreenfootImage(getImage());
            newImage.scale(50, 50);
            setImage(newImage);
        }
    }
}