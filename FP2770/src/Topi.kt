class Topi:LordEmpire() {
    var kembali = 0
    var valid=1
    override fun Topi() {
        while (valid==1) {
            println("Selamat datang di arifloka hotel")
            println("jenis hotel yang tersedia\n1. Topi BMTH\n2. Topi False Crown\n3. Topi Metal Head\n4. Topi Shinjuku\n5. Topi Empire God")
            print("Masukkan kamar yang disewa = ")
            kode = readLine()!!.toInt()
            when (kode) {
                1 -> {
                    jenis = "Topi BMTH"
                    harga = 800000
                    valid = 0
                }

                2 -> {
                    jenis = "Topi False Crown"
                    harga = 1600000
                    valid = 0
                }

                3 -> {
                    jenis = "Topi Metal Head"
                    harga = 2400000
                    valid = 0
                }

                4 -> {
                    jenis = "Topi Shinjuku"
                    harga = 5000000
                    valid = 0
                }

                5 -> {
                    jenis = "Topi Empire God"
                    harga = 5000000
                    valid = 0
                }

                else -> {
                    println("Topi tidak tersedia. Silakan masukkan kode kembali dengan benar!")
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
