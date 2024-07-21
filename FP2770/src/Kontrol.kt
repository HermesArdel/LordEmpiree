class kontrol(){
    fun lord(){
        var brand=LordEmpire()
        brand.show()
        println("Selamat datang di Brand LordEmpire, yang menyediakan brand kekinian!")
        println("====================================================================")
    }
    fun empire() {
        var brand=LordEmpire()
        println(" ===== Menu tersedia =====")
        println("1. T-Shirt LordEmpire")
        println("2. Short Pants LordEmpire")
        println("3. Topi LordEmpire")
        println("4. Hoodie LordEmpire")
        println("5. Pesanan Saya")
        println("===================================")
        print("PILIH MENU : ")
        brand.kode = readLine()!!.toInt()
        println("===================================")
        do {
            if (brand.kode == 1) {
                var tshirt = tshirt()
                tshirt.tshirt()
            } else if (brand.kode == 2) {
                var shortpants = ShortPants()
                shortpants.ShortPants()
            } else if (brand.kode == 3) {
                var topi = Topi()
                topi.Topi()
            } else if (brand.kode == 4) {
                var hoodie = Hoodie()
                hoodie.Hoodie()
            }
            else if(brand.kode==5){
                println(pesananSaya.data.joinToString(separator = "\n"))
                println("=========================================")
                println("1.Kembali ke menu|2.keluar")
                print("Masukkan kode = ")
                brand.kode= readLine()!!.toInt()
                if (brand.kode==1){
                    var kon=kontrol()
                    kon.empire()
                }
            }else {
                print("Silakan masukkan kode yang benar")
            }
        } while (brand.kode == 6)
    }
}