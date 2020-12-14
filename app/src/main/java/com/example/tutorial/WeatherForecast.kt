package com.example.tutorial


class WeatherForecast (val satellite: Satellite){
    private val recorder = WeatherRecorder()

    fun shouldBringUmbrella(): Boolean {
        return when (satellite.getWeather()) {
            "雨" -> true
            else -> false
        }
    }

    fun recordCurrentWeather() {
        val weather = satellite.getWeather()
        recorder.record(weather)
    }
}

class WeatherRecorder {
    fun record(weather: String): Unit{
        // DB
    }
}

open class Satellite {

    open fun getWeather(): String {
        return "晴れ"
    }

}
class SatelliteStub(val anyWeather: String): Satellite() {
    override fun getWeather(): String {
        return anyWeather
    }
}