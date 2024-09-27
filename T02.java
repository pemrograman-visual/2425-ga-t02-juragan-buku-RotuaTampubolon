// 12S24028 - Rotua Tampubolon
// 12S24002 - Petra Naibaho

import java.util.*;
import java.lang.Math;

public class T02{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN, judul, penulis, penerbit, formatbuku, keterangan, bestPick, mustRead, recommended, average, low;
        int tahun, stok;
        double harga, margin, rating;

        iSBN = input.nextLine();
        judul = input.nextLine();
        penulis = input.nextLine();
        tahun = input.nextInt();
        penerbit = input.nextLine();
        formatbuku = input.nextLine();
        harga = input.nextDouble();
        margin = input.nextDouble();
        stok = input.nextInt();
        rating = input.nextDouble();
        if (rating >= 4.7 && rating <= 5.0) {
            keterangan = "bestPick";
        } else {
            if (rating >= 4.5 && rating < 4.7) {
                keterangan = "mustRead";
            } else {
                if (rating >= 4.0 && rating < 4.5) {
                    keterangan = "recommended";
                } else {
                    if (rating > 3.0 && rating < 4.0) {
                        keterangan = "average";
                    } else {
                        keterangan = "low";
                    }
                }
            }
        }
        System.out.println(iSBN + "|" + judul + "|" + penulis + "|" + tahun + "|" + penerbit + "|" + formatbuku + "|" + harga + "|" + margin + "|" + stok + "|" + rating + "|" + keterangan);
    }
}
