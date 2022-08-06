fun main() {
    print("Input Nilai Siswa : ")
    val nilai = readLine()?.toInt()

    if(nilai in 85..100){
        println("------------------------")
        println("Nilai Anda : $nilai")
        println("Hasil Akhir : A")
    }else if(nilai in 70..84){
        println("------------------------")
        println("Nilai Anda : $nilai")
        println("Hasil Akhir : B")
    }else if(nilai in 55..69){
        println("------------------------")
        println("Nilai Anda : $nilai")
        println("Hasil Akhir : C")
    } else if(nilai in 40..54){
        println("------------------------")
        println("Nilai Anda : $nilai")
        println("Hasil Akhir : D")
    }else{
        println("------------------------")
        println("Nilai Anda : $nilai")
        println("Hasil Akhir : E")
    }

}