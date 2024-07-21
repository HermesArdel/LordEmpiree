class pesananSaya:LordEmpire() {
    data class pesananSaya(var jenis: String, var harga: Int, var tanggal: String ) {
        override fun toString(): String {
            return "Jenis\t: $jenis \nTanggal\t: $tanggal \n Harga\t: $harga"
        }
    }

    companion object {
        val data = mutableListOf(pesananSaya("Hoodie Bapho", 500000, "31 Februari 2025"))
    }

}