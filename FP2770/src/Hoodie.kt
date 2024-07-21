class Hoodie:LordEmpire() {
    var kembali = 0
    var valid=1
    override fun Hoodie() {
        while (valid==1) {
            println("Selamat datang di arifloka hotel")
            println("jenis hotel yang tersedia\n1. Hore x Unearth Hoodie\n2. Die4U Hoodie\n3. Catarsis Hearth Hoodie\n4. Halil x 270 Hodie\n5. NextGen Hoodie")
            print("Masukkan kamar yang disewa = ")
            kode = readLine()!!.toInt()
            when (kode) {
                1 -> {
                    jenis = "Hore x Unearth Hoodie"
                    harga = 800000
                    valid = 0
                }

                2 -> {
                    jenis = "Die4U Hoodie"
                    harga = 1600000
                    valid = 0
                }

                3 -> {
                    jenis = "Catarsis Hearth Hoodie"
                    harga = 2400000
                    valid = 0
                }

                4 -> {
                    jenis = "Halil x 270 Hodie"
                    harga = 5000000
                    valid = 0
                }

                5 -> {
                    jenis = "NextGen Hoodie"
                    harga = 5000000
                    valid = 0
                }

                else -> {
                    println("Hoodie tidak tersedia. Silakan masukkan kode kembali dengan benar!")
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