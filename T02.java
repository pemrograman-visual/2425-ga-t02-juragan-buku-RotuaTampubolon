// 12S24028 - Rotua Tampubolon
// 12S24002 - Petra Naibaho

import java.util.*;
import java.lang.Math;

public class T02 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku, keterangan, bestPick, mustRead, recommended, average, low;
        int tahun, stok;
        double harga, margin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = Integer.parseInt(input.nextLine());
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        harga = Double.parseDouble(input.nextLine());
        margin = Double.parseDouble(input.nextLine());
        stok = Integer.parseInt(input.nextLine());
        rating = Double.parseDouble(input.nextLine());
        if (rating >= 4.7 && rating <= 5.0) {
            keterangan = "Best Pick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                keterangan = "Must Read";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    keterangan = "Recommended";
                } else {
                    if (rating >= 3.0 && rating < 4.0) {
                        keterangan = "Average";
                    } else {
                        if (rating < 3.0) {
                            keterangan = "Low";
                        }
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + toFixed(harga,2) + "|" + toFixed(margin,2) + "|" + stok + "|" + rating + "|" + keterangan);
    }
    
    private static String toFixed(double value, int digits) {
        return String.format("%." + digits + "f", value);
    }
}
