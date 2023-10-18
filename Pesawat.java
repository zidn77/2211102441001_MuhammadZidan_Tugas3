import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pesawat here.
 * 
 * @author (nama Anda) 
 * @version (nomor versi atau tanggal)
 */
public class Pesawat extends Actor {
    private int delay = 10; // Kecepatan animasi, semakin besar semakin lambat
    private int moveSpeed = 5; // Kecepatan gerakan

    /**
     * Act - melakukan apa yang pesawat ingin lakukan. Metode ini dipanggil setiap
     * kali tombol 'Act' atau 'Run' ditekan di lingkungan.
     */
    public void act() {
        gerak();
        
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
    }
}
