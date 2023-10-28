package com.canerkuyucu.dortislemproje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun topla(view : View) {
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null ){
            textView.text  = " sayi girmeyi unutmayınız"
        }else {
            var sonuc = sayi1  + sayi2
            textView.text = "Sonuç : ${sonuc}"
        }
    }
    fun cikar (view : View){
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null ){
            textView.text  = " sayi girmeyi unutmayınız"
        }else {
            var sonuc = sayi1  - sayi2
            textView.text = "Sonuç : ${sonuc}"
        }

    }
    fun bol(view : View){
        var sayi1 = editText.text.toString().toDoubleOrNull()
        var sayi2 = editText2.text.toString().toDoubleOrNull()
        if (sayi1 == null || sayi2 == null ){
            textView.text  = " sayi girmeyi unutmayınız"
        }else {
            var sonuc = sayi1  / sayi2
            textView.text = "Sonuç : ${sonuc}"
        }

    }
    fun carp (view : View){
        var sayi1 = editText.text.toString().toIntOrNull()
        var sayi2 = editText2.text.toString().toIntOrNull()
        if (sayi1 == null || sayi2 == null ){
            textView.text  = " sayi girmeyi unutmayınız"
        }else {
            var sonuc = sayi1  * sayi2
            textView.text = "Sonuç : ${sonuc}"
        }

    }
}