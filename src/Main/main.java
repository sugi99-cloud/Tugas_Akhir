package Main;
import Entity.MobilEntity;
import Controller.MobilController;
import Controller.PenyewaController;
import Controller.*;
import Entity.*;
import View.Login;
import java.util.InputMismatchException;
import View.PenyewaGUI;
        
import java.util.Scanner;

public class main {

    private static Scanner input = new Scanner(System.in);
    private static Scanner str = new Scanner(System.in);
    private static PenyewaController penyewa = new PenyewaController();
    private static MobilController mobil = new MobilController();
    private static TransaksiController transaksi = new TransaksiController();
    public static void main(String[] args) {
        
        Login login = new Login();
        do{
            int pil = 0;
            System.out.print("Menu " +
                    "\n" +
                    "1. Insert Data\n" +
                    "2. View Data\n"+
                    "3. Exit\n" +
                    "Masukkan Pilihan : ");
            pil = input.nextInt();
            if(pil == 1){
                
                int Pilih =0;
                System.out.print(
                    "1. Data Penyewa\n" +
                    "2. Data Mobil\n"+
                    "3. Exit\n" +
                    "Masukkan Pilihan : ");
                Pilih = input.nextInt();
                if(Pilih ==1){
                    System.out.print("Id Pelanggan          : ");
                    String id = input.next();
                    System.out.print("Nama Penyewa          : ");
                    String nama = input.next();
                    System.out.print("Nomor Telephone       : ");
                    String nomor = input.next();
                    System.out.print("Tanggal Pinjam        : ");
                    String tanggal = input.next();
                    penyewa.insertData(id,nama,nomor,tanggal);
                    
                }else if(Pilih == 2){
//                    try{
                    System.out.print("Merk Mobil            : ");
                    String merk = input.next();
                    System.out.print("Nama Mobil            : ");
                    String namaMB = input.next();
                    System.out.print("No. Pol               : ");
                    String nopol = input.next();
                    System.out.print("Harga Sewa            : Rp. ");
                    int hrg = input.nextInt();
                    mobil.insertMobil(merk, namaMB, nopol, hrg);
                    transaksi.insertTransaksi(hrg, hrg, hrg, hrg, Pilih);
                    System.out.print("Lama Sewa             : ");
                    int jmhari=str.nextInt();
                    
//                    mobil.getMobil().setJumlahhari(jmhari*mobil.getMobil().getHrg());
                    transaksi.getTransaksi().setJumlahhari(jmhari*transaksi.getTransaksi().getHrg());
                    System.out.println("Mobil Yang Di Pilih : "+mobil.getMobil().getNamaMB());
//                    System.out.println("Total Pembayaran    : Rp."+mobil.getMobil().getJumlahhari());
                    System.out.println("Total Pembayaran    : Rp."+transaksi.getTransaksi().getJumlahhari());
                    System.out.println("________________________\n"); 
                    System.out.print("Bayar     =Rp.");
//                    mobil.getMobil().setByr(str.nextInt());
                    transaksi.getTransaksi().setByr(str.nextInt());
//                    mobil.getMobil().setKembali(mobil.getMobil().getByr()-mobil.getMobil().getHrg());
                    transaksi.getTransaksi().setKembali(transaksi.getTransaksi().getByr()-transaksi.getTransaksi().getHrg());
//                    System.out.println("Kembali =Rp."+mobil.getMobil().getKembali()+"\n");
                    System.out.println("Kembali =Rp."+transaksi.getTransaksi().getKembali()+"\n");
                  
//                }catch(Exception exception){
//                    System.out.println("Format Pengisian Salah !!");
//                }
            }
                
            }else if (pil == 2){
                AllObjectModel.penyewaModel.view();
                AllObjectModel.mobilModel.view();
                AllObjectModel.transaksiModel.view();
            }
                  
           
        }while (true);
    }


}