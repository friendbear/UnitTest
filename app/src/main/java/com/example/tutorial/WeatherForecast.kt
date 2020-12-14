package com.example.tutorial

import kotlin.random.Random


class WeatherForecast (val satellite: Satellite, val recorder: WeatherRecorder) {

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

open class WeatherRecorder {
    open fun record(weather: String): Unit{
        // DB
    }
}

class MockWeatherRecorder: WeatherRecorder() {
    var currentWeather = ""
    var isCalled = false

    override fun record(weather: String) {
        this.currentWeather = weather
        this.isCalled = true
    }
}
open class Satellite {

    open fun getWeather(): String {
        return when (Random.nextInt()) {
            in 0..5 -> "晴れ"
            in 6..8 -> "曇り"
            else -> "雨"
        }
    }

}
class SatelliteStub(val anyWeather: String): Satellite() {
    override fun getWeather(): String {
        return anyWeather
    }
}