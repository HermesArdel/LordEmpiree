class ShortPants:LordEmpire() {
    var kembali = 0
    var valid=1
    override fun ShortPants() {
        while (valid==1) {
            println("Selamat datang di arifloka hotel")
            println("jenis hotel yang tersedia\n1. Cargo Empire God\n2. Cargo Empire God V2\n3. Cargo Never Death\n4. Cargo HELL\n5. Cargo SleepWalking")
            print("Masukkan kamar yang disewa = ")
            kode = readLine()!!.toInt()
            when (kode) {
                1 -> {
                    jenis = "Cargo Empire God"
                    harga = 800000
                    valid = 0
                }

                2 -> {
                    jenis = "Cargo Empire God V2"
                    harga = 1600000
                    valid = 0
                }

                3 -> {
                    jenis = "Cargo Never Death"
                    harga = 2400000
                    valid = 0
                }

                4 -> {
                    jenis = "Cargo HELL"
                    harga = 5000000
                    valid = 0
                }

                5 -> {
                    jenis = "Cargo SleepWalking"
                    harga = 5000000
                    valid = 0
                }

                else -> {
                    println("Kamar tidak tersedia. Silakan masukkan kode kembali dengan benar!")
                    valid = 1
                }
            }
        }

        println("Tersedia $tsd $jenis")
        println("Harga yang harus dibayar = Rp." + harga)
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