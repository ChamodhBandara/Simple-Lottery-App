package com.example.lottery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        var results = mutableListOf<TextView>()
        results.add(findViewById(R.id.results1))
        results.add(findViewById(R.id.results2))
        results.add(findViewById(R.id.results3))
        results.add(findViewById(R.id.results4))
        results.add(findViewById(R.id.results5))
        results.add(findViewById(R.id.results6))

        var button = findViewById<Button>(R.id.bt0)
        var buttons = mutableListOf<Button>()
        buttons.add(findViewById(R.id.bt1))
        buttons.add(findViewById(R.id.bt2))
        buttons.add(findViewById(R.id.bt3))
        buttons.add(findViewById(R.id.bt4))
        buttons.add(findViewById(R.id.bt5))
        buttons.add(findViewById(R.id.bt6))


        for (i in 0..5){
            buttons[i].setOnClickListener()
            {
                calculate(results[i])

            }
        }

        button.setOnClickListener(){
            genarateAll(results)

        }

        genarateAll(results)

    }

    fun genarateAll (results:List<TextView>){
        for (i in 0..5){
            calculate(results[i])
        }
    }


    fun calculate(getResult: TextView) {
        var gen: Random = Random()
        var new_number = 1 + gen.nextInt(49)
        getResult.text = new_number.toString()

    }
}