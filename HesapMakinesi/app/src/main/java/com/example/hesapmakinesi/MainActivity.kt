package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import com.example.hesapmakinesi.databinding.ActivityMainBinding
import java.util.*
import javax.xml.xpath.XPathExpression
import android.view.View as Vi



class MainActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityMainBinding
    var sonuc:String = ""
    var temp:Int = 0;
    var arr:ArrayList<Int> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        tasarim = ActivityMainBinding.inflate(layoutInflater)
        setContentView(tasarim.root)


        tasarim.buttonSifir.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonSifir.text.toString())
            tasarim.textView.text = sonuc

        }
        tasarim.buttonBir.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonBir.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonIki.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonIki.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonUc.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonUc.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonDort.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonDort.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonBes.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonBes.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonAlti.setOnClickListener {

            sonuc = concat(sonuc, tasarim.buttonAlti.text.toString())
            tasarim.textView.text = sonuc
        }
        tasarim.buttonYedi.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonYedi.text.toString())
            tasarim.textView.text = sonuc

        }
        tasarim.buttonSekiz.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonSekiz.text.toString())
            tasarim.textView.text = sonuc

        }
        tasarim.buttonDokuz.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonDokuz.text.toString())
            tasarim.textView.text = sonuc

        }
        tasarim.buttonTopla.setOnClickListener {
            sonuc = concat(sonuc, tasarim.buttonTopla.text.toString())
            tasarim.textView.text = sonuc

        }
        tasarim.buttonEsittir.setOnClickListener {
            val list = sonuc.split("+").map { it -> it.trim() }
            list.forEach {
                arr.add(it.toInt())
            }

            arr.forEach {
                temp += it
            }

            sonuc = temp.toString()
            tasarim.textView.text = sonuc
            temp = 0
            arr.clear()

        }

        tasarim.buttonAc.setOnClickListener {
            sonuc = ""
            tasarim.textView.text = sonuc

        }



    }
    private fun concat(s1: String, s2: String): String {
        return StringBuilder(s1).append(s2).toString()
    }






}