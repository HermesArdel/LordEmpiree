class tshirt:LordEmpire() {
    var kembali = 0
    var valid=1
    override fun tshirt() {
        while (valid==1) {
            println("Selamat datang di LordEmpire")
            println("jenis T-Shirt yang tersedia\n1. T-Shirt Alesana\n2. T-Shirt Radiant\n3. T-Shirt Hope\n4. T-Shirt R.I.P\n5. T-Shirt Clown")
            print("Masukkan T-Shirt Yang Ingin Dibeli= ")
            kode = readLine()!!.toInt()
            when (kode) {
                1 -> {
                    jenis = "T-Shirt Alesana"
                    harga = 800000
                    valid = 0
                }

                2 -> {
                    jenis = "T-Shirt Radiant"
                    harga = 1600000
                    valid = 0
                }

                3 -> {
                    jenis = "T-Shirt Hope"
                    harga = 2400000
                    valid = 0
                }

                4 -> {
                    jenis = "T-Shirt R.I.P"
                    harga = 5000000
                    valid = 0
                }

                5 -> {
                    jenis = "T-Shirt Clown"
                    harga = 1000000
                    valid = 0
                }

                else -> {
                    println("T-Shirt tidak tersedia, Silakan masukkan kode kembali dengan benar!")
                    valid = 1
                }
            }
        }

        println("Tersedia $tsd $jenis")
        println("Harga yang harus dibayar = Rp." + harga)
        print("Masukkan uang = ")
        pembayar = readLine()!!.toInt()
        while (pembayar < harga) {
            println("Uang yang anda masukkan kurang harap masukkan uang yang benar!!!")
            print("Masukkan uang = ")
            pembayar = readLine()!!.toInt()

        }
        kembali = pembayar - harga
        println("Pembayaran Lunas")
        println("==============================NOTA TRANSAKSI===================================")
        println("Nama\t\t\t=$nama\nID\t=$ID\nJenis \t=$jenis\nHarga\t\t\t=$harga\nCash\t\t\t=$pembayar\nKembalian\t\t=$kembali")
        println("Terimakasih telah menggunakan jasa kami")
        println("=========================================")
        println("1. Kembali ke Menu|2. Keluar")
        print("Masukkan kode = ")
        kode= readLine()!!.toInt()
        if (kode==1){
            var kon=kontrol()
            kon.empire()
        }
    }

}