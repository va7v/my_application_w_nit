package com.vatestkot.my_application_w_nit

import java.io.Serializable

data class Weather (val city: String, val temp: String, val clouds: String, val rainfall:String) : Serializable