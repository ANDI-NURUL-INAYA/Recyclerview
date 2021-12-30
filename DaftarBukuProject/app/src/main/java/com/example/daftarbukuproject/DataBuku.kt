package com.example.daftarbukuproject

object DataBuku {
    private val judulbuku = arrayOf(
        "Mariposa",
        "Geez and Ann",
        "Dilan 1990",
        "Milea",
        "Koala Kumal",
        "Pulang",
        "Mantappu Jiwa",
        "Jingga dan Senja",
        "Sebuah Usaha Melupakan",
        "Sebuah Seni Untuk Bersikap Bodo Amat")

    private val detailbuku = arrayOf(
        "Mariposa merupakan novel fiksi bergenrekan romance-comedy yang ditulis oleh Hidayatul Fajriyah atau yang kerap dikenal" +
                "dengan Luluk HF. Perempuan kelahiran 1995 ini adalah seorang penulis asal Indonesia yang aktif mengunggah hasil karya" +
                "tulisnya di Wattpad.Novel ini setebal 482 halaman.",
        "Novel Geez & Ann merupakan novel yang diangkat dari cerota Wattpad lalu di bukukan. Novel ini adalah karya pertama Nadhifa Allya Tsana yang menamai " +
                "dirinya sebagai Rintik Sendu. Novel ini menceritakan kisah tentang perempuang SMP yang akan beranjak dewasa.",
        "Pidi Baiq, sebuah nama yang tidak asing bagi pencinta novel. pasalnya, banyak novel yang telah dilahirkan seperti Dilan" +
                "novel Dilan ini menceritakan kisah cinta anak SMA yaitu Dilan. ia adalah salah satu anak geng motor yang bersifat nakal, namun jika dilihat sari sisi lain akan ditemukan juga hal " +
                "positif di dalam dirinya.",
        "Milea merupakan Novel ketiga setelah Dilan 1990 dan Dilan 1991. yang menceritakan pengenalan singkat Dilan waktu masih kecil. " +
                "kira-kira waktu masih berumur 5 tahun,pernah ingin jadi macan walaupun itu tidak mungkin. dia pernah menamai sepedanya dengan" +
                "nama mobilderek.dilan selalu berpikir bahwa dia mempunyai masa kecil bahagia ",
        "Novel Koala Kumal ini menceritakan anak muda yang bernama Raditya Dika. Dika kecil yang masih usia SD begitu sangat dimanja oleh orang tuanya, dan memiliki hobi bermain video game." +
                " Wajar kalau tidak punya teman bermain di luar rumah.Novel ini menggunakan sudut pandang orang pertama pelaku utama yakni “gue”.",
        "Pulang kali ini berkisah tentang seorang anak talang di rimba hutan Sumatera, di antara rimbunnya Bukit Barisan, yang dipanggil si Bujang. Sekilas kita mahfum bahwa Bujang hanyalah nama panggilan, " +
                "seperti nama Entong di Betawi, dan bukan nama yang sebenarnya. Ia dititipkan pada seorang tauke.",
        "Mantappu Jiwa ini adalah cacatan perjuangan Jerome Poline dari semasa hidupnya yang penuh liku. Penuh perjuangan hingga dia mampu menjadi orang hebat seperti sekarang. Buku Mantappu Jiwa karya Jerome Poline ini berisi kisah hidup Jerome sejak dia lahir sampai bisa kuliah di Jepang dan menjadi Youtuber terkenal.",
        "novel ini berisi tentang dua orang murid yang memiliki kandungan nama yang sama serta waktu kelahiran yang sama, yaitu pada saat matahari tenggelam. Tari atau lengkapnya jingga matahari adalah  gadis remaja yang bersekolah di SMA Airlangga kelas X. Dia penggemar aksesoris berwarna oranye.",
        "Buku ini bercerita tentang “Aku” yang sangat mencintai pasangannya, dia awalnya memuji dan mengelukan pasangannya dengan kata-kata manis, pujian, dan cinta, meski mereka berhubungan jarak jauh. Hubungan mereka manis, penuh janji dan harapan. Namun, " +
                "lenyap ketika “aku” dihianati oleh pasangannya akibat kehadiran orang ketiga.",
        "Sebuah Seni Untuk Bersikap Bodo Amat bercerita tentang seseorang yang bernama Charles Bukowski yang mempunyai masa lalu yang kelam, suka mabuk-mabukan, berjudi, mempermainkan wanita, kasar, tukang utang dan seorang penyair.")

    private val bukuImages = intArrayOf(
        R.drawable.mariposa,
        R.drawable.geez_ann,
        R.drawable.dilan,
        R.drawable.milea,
        R.drawable.koala_kumal,
        R.drawable.pulang,
        R.drawable.mantappujiwa,
        R.drawable.jingga_senja,
        R.drawable.boy_candra,
        R.drawable.mark_manson)

    val listData:ArrayList<Buku>
    get() {
        val list = arrayListOf<Buku>()
        for (position in judulbuku.indices){
            val buku = Buku()
            buku.judul = judulbuku[position]
            buku.desk = detailbuku[position]
            buku.gambar = bukuImages[position]
            list.add(buku)

        }
           return list
    }
}