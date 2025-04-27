package com.example.kotlindersleri.odevler

fun main(){

 fun fahrenheit(derece: Int): Double {
     val sonuc = (derece *1.8)+32
     return sonuc
 }
    println(fahrenheit(15))

 fun dikdortgenCevresi(kenar1: Int, kenar2: Int): Int {
    return 2 * (kenar1 + kenar2)
 }
    println(dikdortgenCevresi(10,5))

 fun faktoriyel(sayi: Int): Int {
    var sonuc = 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
 }

 fun harfSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
 }
    println(harfSayisi("Istanbul"))

    fun icAciToplami(kenarSayisi: Int): Int {
        return (kenarSayisi - 2) * 180
    }
    println(icAciToplami(4))

    fun maasHesapla(gun: Int): Int {
        val toplamSaat = gun * 8
        return if (toplamSaat <= 160) {
            toplamSaat * 10
        } else {
            val mesaiSaat = toplamSaat - 160
            (160 * 10) + (mesaiSaat * 20)
        }
    }
    println("Maaş :${maasHesapla(23)}")

    fun kotaUcret(kota: Int): Int {
        return if (kota <= 50) {
            100
        } else {
            100 + ((kota - 50) * 4)
        }
    }
    println("Ucret : ${kotaUcret(100)}")

}
