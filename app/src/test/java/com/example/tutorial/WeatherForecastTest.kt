package com.example.tutorial

import org.junit.Assert.*
import org.junit.Test
import org.assertj.core.api.Assertions.*

class WeatherForecastTest {

    @Test
    fun getWeatherが雨ならshouldBringUmbrellaがtrueを返す() {
        val sut = WeatherForecast(SatelliteStub("雨"), WeatherRecorder())
        val actual = sut.shouldBringUmbrella()
        assertThat(actual).isTrue()
    }

    @Test
    fun recorderクラスにrecordされている() {
        val recorder = MockWeatherRecorder()
        val sut = WeatherForecast(SatelliteStub("晴れ"), recorder)

        sut.recordCurrentWeather()
        val isCalled = recorder.isCalled
        assertThat(isCalled).isTrue()

        val weather = recorder.currentWeather
        assertThat(weather).isIn("晴れ", "曇り", "雨")
    }
}