import java.util.Scanner;
//import java.util.Locale;

public class tugasKWH {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Program pemakaian listrik sederhana");
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Kelurahan: ");
        String kelurahan = input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter: ");
        int awalKwh = input.nextInt();
        System.out.print("Masukkan posisi akhir Khw Meter: ");
        int akhirKwh = input.nextInt();
        System.out.print("Masukkan biaya beban saat ini: ");
        int biayaBeban = input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen): ");
        float ppj = input.nextFloat() ;

        int totalPemakaian = awalKwh - akhirKwh;
        int tarifListrik = totalPemakaian * biayaBeban;
        float totalPPJ = (ppj /100 ) * tarifListrik;
        float totalBayar = tarifListrik + totalPPJ;




        System.out.println("==========PLN Java==========");
        System.out.printf("%-14s: %s%n", "Nama",nama);
        System.out.printf("%-14s: %s%n", "Kelurahan",kelurahan);
        System.out.printf("%-24s: %d Kwh Meter %n", "Pemakaian bulan ini",totalPemakaian);
        System.out.printf("%-14s: Rp %d,- %n", "Tarif Listrik",tarifListrik);
        System.out.printf("%-14s: Rp %d,-%n", "PPJ " + (int)ppj + "%", (int) totalPPJ);
        System.out.printf("%-14s: Rp %d,- %n", "Total Bayar",(int)totalBayar);
        System.out.println("============================");


    }
}
