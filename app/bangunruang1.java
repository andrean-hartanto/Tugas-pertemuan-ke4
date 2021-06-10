package app;

import java.util.Scanner;

public class bangunruang1 {
    public static void main(String[] args) {
        float tinggi;
        float sisi;
        float panjang;
        float lebar;
        float r;
        float t;
        char yn = 'n';
        
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Program Luas dan Volume Bangun Ruang");
            System.out.println("1. Balok");
            System.out.println("2. Tabung");
            System.out.println("3. Kubus");
            System.out.println("Nomor ? ");
            int nomor = input.nextInt();
            if (nomor == 1){

                System.out.println("Masukkan Panjang : ");
                panjang = input.nextFloat();

                System.out.println("Masukkan Lebar : ");
                lebar = input.nextFloat();

                System.out.println("Masukkan Tinggi : ");
                tinggi = input.nextFloat();

                float luas = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi );
                float volume = panjang * lebar * tinggi;

                System.out.println("Luas adalah : " + luas);
                System.out.println("Volumeny adalah : " + volume);

            }
            if (nomor == 2){

                System.out.println("Jari - Jari ? ");
                r = input.nextFloat();
                System.out.println("Tinggi ? ");
                t = input.nextFloat();

                double Luastabung = 2 * 3.14 * r * (r + t);
                double Volumetabung = 3.14 * r * r * t;

                System.out.println("Luas Permukaan Tabung = " + Luastabung);
                System.out.println("Volume Tabung = " + Volumetabung);

            }
            if (nomor == 3){

                System.out.println("Program Untuk Menghitung Luas dan Volume Kubus");
                System.out.println("Sisi ? ");
                sisi = input.nextFloat();

                float Luaskubus = 6 * (sisi*sisi);
                float Volumekubus = sisi*sisi*sisi;

                System.out.println("Luas Permukaan kubus adalah : " + Luaskubus);
                System.out.println("Volume kubus adalah : " + Volumekubus);
            }

            System.out.println("Apakah anda ingin mengulangi lagi ? [y/n] ");
            input.nextLine();
            String yesno = input.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='y' || yn=='Y');
        input.close();
        
    }
}