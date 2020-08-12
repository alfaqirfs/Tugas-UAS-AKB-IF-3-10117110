package com.fauzisunarya.tugasuasakbif_310117110.models;

import java.util.ArrayList;
/** NIM : 10117110
 * Nama : Fauzi Sunarya
 * Kelas : IF-3
 * Tanggal : 06-08-2020**/
public class WisataData {
    public static  String[][] data = new String[][]{
            {"Kawah Putih",
                    "Wisata kawah ini terbentuk dari letusan gunung Patuha yang terjadi beberapa ratus tahun silam. Seiring berjalannya waktu bekas dari erupsi dahsyat tersebut berbekas dan membentuk sebuah kawah.\n" +
                            "\n" +
                            "Tempat Wisata di Bandung ini di buka mulai dari jam 7 pagi hingga jam 5 sore dengan tiket masuk seharga 18.000 per orang. Pemandangan yang indah dari bekas letusan tersebut akan membuat Anda bersama keluarga betah berlama-lama disana. Apa lagi saat ini telah ada beberapa pedagang yang menjajakan makanan di sekitar daerah wisata tersebut.\n" +
                            "\n" +
                            "Lokasi: Sugihmukti, Kec. Pasirjambu, Bandung.",
                    "https://www.javatravel.net/wp-content/uploads/2019/07/Kawah-Putih.jpg"},
            {"Gunung Tangkuban Perahu",
                    "Salah satu destinasi wisata yang berada di Bandung berikutnya masih memiliki nuansa pegunungan. Yaitu Gunung Tangkuban Perahu yang merupakan salah satu tempat wisata alam yang wajib Anda kunjungi ketiak berada di kota tersebut. Mungkin ketika anak-anak kita sering mendengarkan mengenai kisah Sangkuriang yang berasal dari daerah pegunungan tersebut. Memiliki nama Tangkuban Perahu atau dalam bahasa Indonesia memiliki arti perahu yang terbalik.\n" +
                            "\n" +
                            "Karena gunung yang masih aktif ini jika di lihat dari jarak yang agak jauh akan nampak seperti perahu yang terbalik. Bagi Anda yang memiliki hobby hiking mungkin tempat ini menjadi salah satu alternatif untuk menyalurkan hobby Anda tersebut. Seperti halnya wisata pegunungan lainnya tempat ini kadang dapat mencapai suhu di bawah 20 derajat celcius. Kadang pada beberapa saat tertentu suhu di gunung ini dapat mencapai di bawah 5 derajat celcius.\n" +
                            "\n" +
                            "Lokasi: Cikahuripan, Lembang, Kab. Bandung Barat.",
                    "https://www.javatravel.net/wp-content/uploads/2019/07/Gunung-Tangkuban-Perahu.jpg"},
            {"Air Panas Ciater",
                    "Bergeser sedikit kearah bawah dari tingginya pegunungan kita akan menemui pemandian air panas Ciater. Pemandian air panas yang satu ini tidak bisa dilepaskan dari pra vulkanik gunung Tangkuban Perahu. Mengingat dari aktifitas tersebut dapat menghasilkan sumber-sumber air panas yang dapat Anda nikmati bersama keluarga. Memilih wisata ini untuk menghabiskan waktu sembari bersantai merupakan pilihan yang tepat.\n" +
                            "\n" +
                            "Wisata yang satu ini bisa membuat Anda melepaskan sedikit penat dan melemaskan otot yang tegang ketika berkerja. Banyak lagi manfaat yang Anda dapatkan ketika berendam dan bermalas-malasan di tempat wisata ini selain kesahatan tentunya dalah relaksasi.\n" +
                            "\n" +
                            "Lokasi: Jl. Raya Ciater, Nagrak, Ciater, Kab. Subang.",
                    "https://www.javatravel.net/wp-content/uploads/2019/07/Air-Panas-Ciater.jpg"}

    };

    public static ArrayList<Wisata> getListData(){
        Wisata wisata;
        ArrayList<Wisata> list = new ArrayList<>();

        for (String[] mData : data){
            wisata = new Wisata();
            wisata.setWtitle(mData[0]);
            wisata.setWdesc(mData[1]);
            wisata.setWimage(mData[2]);

            list.add(wisata);
        }
        return  list;
    }
}
