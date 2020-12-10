package com.example.tutorial

import org.junit.Test

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*
import org.junit.After
import org.junit.Before
import org.junit.Ignore

class CalculatorTest {

    lateinit var calculator: Calculator

    @Before
    fun setUp() {
        calculator = Calculator()

    }
    @Test
    fun multiply() {
        val actual = calculator.multiply(2, 3)
        val expected = 6
        assertThat(actual).isEqualTo(expected)
        assertEquals(expected, actual)
    }
    @Test
    fun multiplyで0と3をかけたら0が取得できる() {
        val actual = calculator.multiply(0, 3)
        val expected = 0
        assertThat(actual).isEqualTo(expected)
        assertEquals(expected, actual)
    }

    @Ignore
    @Test
    fun multiply_minusValue() {
        assertEquals(-100, Calculator().multiply(-1, 100))
    }

    @Test
    fun divide() {
        val actual = calculator.divide(6, 2)
        val expected = 3.0
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    fun divide3を2で割った結果を取得できる() {
        val actual = calculator.divide(3, 2)
        val expected = 1.5
        assertThat(actual).isEqualTo(expected)
    }

    @Test(expected = IllegalArgumentException::class)
    fun divide_Zero() {
        val actual = calculator.divide(5, 0)

    }

    @After
    fun tearDown() {

    }
}