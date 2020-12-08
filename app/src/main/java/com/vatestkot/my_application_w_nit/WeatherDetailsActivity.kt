package com.vatestkot.my_application_w_nit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_weather_details.*

class WeatherDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_weather_details)

        val city = intent.extras?.getString("City")
        val temp = intent.extras?.getString("Temp")
        cityName.text = "Город: $city"
        tempC.text = "Температура: $temp"
        /*
        приём через сериализацию
        val weather = intent.extras?.getSerializable("Weather") as Weather
        Clouds.text = "Облачность: ${weather.clouds}"
        Rainfall.text = "Осадки: ${weather.rainfall}"
        */
    }
}