package com.diegolima.justifyText

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.diegolima.myapplication.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textName.text = "Diego - android 4.1 tendo que usar o plugin kotlin-android-extensions para poder referenciar diretamente os atributos da interface."

supportActionBar!!.hide()

    }

}
