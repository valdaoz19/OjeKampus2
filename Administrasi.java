import java.util.*;
import static java.lang.Math.*;
/**
 * Write a description of class Administrasi here.
 * 
 * @author (Valda Orchidea Zahwa) 
 * @version (16 03 2016)
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    
    /**
     * Method untuk menampilkan data ojek database
     */
    public static void printOjekDatabase(){
        System.out.println("Database Ojek : " + DatabaseUser.getOjekDatabase());
    }
    
    /**
     * Method untuk menampilkan data pelanggan database
     */
    public static void printPelangganDatabase(){
        System.out.println("Database Pelanggan : " + DatabaseUser.getPelangganDatabase());
    }
    
    /**
     * Method untuk menampilkan pesanan database
     */
    public static void printPesananDatabase(){
        System.out.println("Database Pesanan : " + DatabasePesanan.getDatabase());
    }
    
    /**
     * Method untuk menampilkan data semua database
     */
    public static void printAllDatabase(){
        printPesananDatabase();
        printPelangganDatabase();
        printOjekDatabase();
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan
     * @param pesan untuk pesanan
     * @param pelayan untuk ojek
     */
    public static void pesananDitugaskan(Pesanan pesan, Ojek pelayan){
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setPelayan(pelayan);
        ojekAmbilPesanan(pesan,pelayan);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pengambilan pesanan
     * @param pesan untuk pesanan
     * @param pelayan untuk ojek
     */
    public static void ojekAmbilPesanan(Pesanan pesan, Ojek pelayan){
        pelayan.setStatus(StatusOjek.Jemput);
        pelayan.setPesanan(pesan);
    }   
    
    /**
     * Method untuk memberi pemberitahuan jika ada melepas pesanan
     * @param pelayan untuk ojek
     */
    public static void ojekLepasPesanan(Ojek pelayan){
        pelayan.setStatus(StatusOjek.Idle);
        pelayan.setPesanan(null);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan yang dibatalkan (untuk ojek)
     * @param pelayan untuk ojek
     */
    public static void pesananDibatalkan(Ojek pelayan){
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan yang selesai (untuk ojek)
     * @param pelayan untuk ojek
     */
    public static void pesananSelesai(Ojek pelayan){
        Pesanan pesan = pelayan.getPesanan();
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        pesan.setPelayan(null);
        ojekLepasPesanan(pelayan);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan dibatalkan (untuk pesanan)
     * @param pesan untuk pesanan
     */
    public static void pesananDibatalkan(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan yang selesai (untuk pesan)
     * @param pesan untuk pesanan
     */
    public static void pesananSelesai(Pesanan pesan){
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
     /**
     * Method untuk memberi pemberitahuan jika ada pesanan dibatalkan (untuk pelanggan)
     * @param pengguna untuk pelanggan
     */
    public static void pesananDibatalkan(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(false);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
    /**
     * Method untuk memberi pemberitahuan jika ada pesanan yang selesai (untuk pelanggan)
     * @param pengguna untuk pelanggan
     */
    public static void pesananSelesai(Pelanggan pengguna){
        Pesanan pesan = DatabasePesanan.getPesanan(pengguna);
        pesan.setStatusDiproses(false);
        pesan.setStatusSelesai(true);
        ojekLepasPesanan(pesan.getPelayan());
        pesan.setPelayan(null);
    }
    
     /**
     * Method untuk mencari pesanan yang sedang idle
     * @return pesan jika ada pesanan
     * @return null jika tidak
     */
    private static Pesanan cariPesananIdle(){
        ArrayList<Pesanan>  pesanan = new ArrayList<>();
        pesanan.addAll(DatabasePesanan.getDatabase());
        
        for(Pesanan pesan : pesanan){
            if(pesan.getStatusDiproses() == false){
                if(pesan.getStatusSelesai() == false){
                 return pesan;
                }
            }
        }
        return null;
    }
    
    /**
     * Method untuk mencari ojek yang terdekat berdasarkan x dan y
     * @return ojek_terdekat mengembalikan nilai ojek yang terdekat
     */
    private static Ojek temukanOjekTerdekat(Pesanan pesan){
        ArrayList<Ojek>  ojek_database = new ArrayList<>();
        Lokasi lokasi_pengguna = pesan.getLokasiAwal();
        ojek_database.addAll(DatabaseUser.getOjekDatabase());
        Ojek ojek_terdekat = null;
        Lokasi lokasi_ojek = null;
        double x=0;
        double y=0;
        double jarak=0;
        int count=0;
        double jarak_terdekat=0;
        for(Ojek ojek_temp : ojek_database){
            if(ojek_temp.getStatus().equals(StatusOjek.Idle)){
                lokasi_ojek = ojek_temp.getPosisi();
                x = Math.abs(lokasi_ojek.getX() - lokasi_pengguna.getX());
                y = Math.abs(lokasi_ojek.getY() - lokasi_pengguna.getY());
                jarak  = Math.sqrt((x*x)+(y*y));
                if(count == 0){
                    jarak_terdekat = jarak;
                    ojek_terdekat = ojek_temp;
                    count++;
                }
                else{
                    if(jarak<jarak_terdekat){
                        ojek_terdekat = ojek_temp;
                    }
                }
            }
        }
        return ojek_terdekat;
    }
    
    /**
     * Method untuk menjalankan sistem penugas jadi akan menjalankan sekaligus method
     * dari cariPesananIdle dan temukanOjekTerdekat lalu menjalankan method pesananDitugaskan
     */
    public static void jalankanSistemPenugas(){
        Pesanan pesanan_idle = cariPesananIdle();
        Ojek ojek_terdekat = temukanOjekTerdekat(pesanan_idle);
        pesananDitugaskan(pesanan_idle,ojek_terdekat);
    }
}
