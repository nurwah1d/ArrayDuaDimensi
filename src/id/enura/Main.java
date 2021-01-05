package id.enura;

public class Main {

    public static void main(String[] args) {
        // TODO: Deklarasi + inisialisasi
        String[][] mahasiswa = {
                {"52001", "Budi Suseno", "Yogyakarta"},
                {"52002", "Rania Putri Wijaya", "Bantul"},
                {"52003", "Clarissa Amanda", "Sleman"},
                {"52004", "Yuana Inka Dewi", "Padang"},
                {"52005", "Muhammad Thariq", "Kebumen"},
        };

        // TODO: Panjang field max
        int lNpm = 0, lNama = 0, lAlamat = 0;
        for (String[] value : mahasiswa) {
            for (int j = 0; j < value.length; j++) {
                if (j == 0) {
                    if (value[j].length() > lNpm) lNpm = value[j].length();
                } else if (j == 1) {
                    if (value[j].length() > lNama) lNama = value[j].length();
                } else {
                    if (value[j].length() > lAlamat) lAlamat = value[j].length();
                }
            }
        }

        int temp;
        int[] lenField = {lNpm, lNama, lAlamat};
        String[] title = {"NPM", "Nama", "Alamat"};

        // Cetak baris
        for (int i: lenField) {
            System.out.print("+");
            for (int m=0; m<i+2; m++) {
                System.out.print("-");
            }
            if (i == lAlamat) System.out.print("+\n");
        }

        // TODO: Cetak header tabel
        for (int i=0; i<lenField.length; i++) {
            System.out.print("| ");
            System.out.print(title[i]);

            if (i == 0) temp = lNpm - title[i].length() + 1;
            else if (i == 1) temp = lNama - title[i].length() + 1;
            else temp = lAlamat - title[i].length() + 1;

            // Cetak spasi untuk menyesuaikan lebar
            for (int k=0; k<temp; k++) {
                System.out.print(" ");
            }

            if (i == 2) System.out.print("|\n");
        }

        // Cetak baris
        for (int i: lenField) {
            System.out.print("+");
            for (int m=0; m<i+2; m++) {
                System.out.print("-");
            }
            if (i == lAlamat) System.out.print("+\n");
        }

        // TODO: Cetak data array
        for (String[] strings : mahasiswa) {
            System.out.print("| ");
            for (int j = 0; j < strings.length; j++) {
                System.out.print(strings[j]);

                temp = 0;
                if (j == 1) temp = lNama - strings[j].length();
                else if (j == 2) temp = lAlamat - strings[j].length();

                // Cetak spasi untuk menyesuaikan lebar
                for (int k = 0; k < temp; k++) {
                    System.out.print(" ");
                }

                System.out.print(" | ");
            }
            System.out.println();
        }

        // Cetak baris
        for (int i: lenField) {
            System.out.print("+");
            for (int m=0; m<i+2; m++) {
                System.out.print("-");
            }
            if (i == lAlamat) System.out.print("+\n");
        }

    }
}
