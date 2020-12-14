package com.example.tutorial

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.junit.Assert.*
import org.junit.Test
import org.assertj.core.api.Assertions.*

class WeatherForecastTest {

    lateinit var stubSatellite: Satellite
    lateinit var mockWeatherRecorder: WeatherRecorder

    @Test
    fun getWeatherが晴れならばshouldBringUmbrellaがfalseを返す() {
        stubSatellite = mock(name = "StubSatellite")
        whenever(stubSatellite.getWeather()).thenReturn("晴れ")

        val weatherForecast = WeatherForecast(stubSatellite, WeatherRecorder())
        val actual = weatherForecast.shouldBringUmbrella()
        assertThat(actual).isFalse()
    }
    

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