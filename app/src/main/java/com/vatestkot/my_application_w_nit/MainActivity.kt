package com.vatestkot.my_application_w_nit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnGoToDetails.setOnClickListener {
            val intent = Intent(this, WeatherDetailsActivity::class.java)

            intent.putExtra("City", "Анапа")
            intent.putExtra("Temp", "+10")

/*          передача данных через сериализацию
            val weather = Weather("Ясно", "Небольшой дождь")
            intent.putExtra("Weather", "weather")
*/
            startActivity(intent)
        }
    }
}