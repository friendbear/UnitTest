package com.example.tutorial

import org.junit.Assert.*
import org.junit.Test
import org.assertj.core.api.Assertions.*

class WeatherForecastTest {

    @Test
    fun getWeatherが雨ならshouldBringUmbrellaがtrueを返す() {
        val sut = WeatherForecast(SatelliteStub("雨"))
        val actual = sut.shouldBringUmbrella()
        assertThat(actual).isTrue()
    }
}