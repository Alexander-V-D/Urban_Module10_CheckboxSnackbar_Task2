package com.example.module10_checkboxsnackbar_task2

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var checkBox: CheckBox
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        checkBox = findViewById(R.id.checkBox)
        textView = findViewById(R.id.textView)

        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                textView.text = getString(R.string.traffic_laws_text)
                checkBox.text = getString(R.string.traffic_laws)
            } else {
                textView.text = ""
                checkBox.text = getString(R.string.information)
            }
        }
    }
}