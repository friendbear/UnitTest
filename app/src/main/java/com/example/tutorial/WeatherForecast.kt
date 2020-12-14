package com.example.tutorial


class WeatherForecast (val satellite: Satellite){

    fun shouldBringUmbrella(): Boolean {
        return when (satellite.getWeather()) {
            "雨" -> true
            else -> false
        }
    }
}

open class Satellite {

    fun getWeather(): String {
        return "晴れ"
    }

}
class SatelliteStub(val anyWeather: String): Satellite() {
    override fun getWeather(): String {
        return anyWeather
    }
}