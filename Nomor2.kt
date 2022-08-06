fun main() {
    println("      Berat Badan (kg) ")
    println("BMI = -----------------")
    println("      Tinggi Badan (m)2\n")
    println("+-------------+--------------+")
    println("|      BMI    |    Kategori  |")
    println("+-------------+--------------+")
    println("|     < 17    | Sangat Kurus |")
    println("| 17.0 - 18.5 |     Kurus    |")
    println("| 18.5 - 25.0 |     Normal   |")
    println("| 25.0 - 27.0 |     Gemuk    |")
    println("|     > 27    | Sangat Gemuk |")
    println("+-------------+--------------+\n")

    print("Berat Badan Anda (kg) : ")
    val beratBadan = readLine()?.toInt()

    print("Tinggi Badan Anda (cm): ")
    val tinggiBadan = readLine()?.toDouble()

    if (beratBadan != null && tinggiBadan != null) {
        val satuanTinggiBadan = (tinggiBadan/100)*(tinggiBadan/100) // Diubah dalam bentuk meter kubik
        val bmi = beratBadan/satuanTinggiBadan
        val pembulatan = String.format("%.2f", bmi) // Membulatkan hasil dari perhitungan BMI
        println("BMI Anda adalah : "+ pembulatan)

        val kat = "Kategori BMI : "
        if (bmi < 17) {
            println(kat +"Sangat kurus")
        } else if (bmi in 17.0 .. 18.5) {
            println(kat +"Kurus")
        } else if (bmi in 18.5 .. 25.0) {
            println(kat +"Normal")
        } else if (bmi in 25.0 .. 27.0) {
            println(kat +"Gemuk")
        } else if (bmi > 27.0) {
            println(kat +"Sangat Gemuk")
        }
    }
}