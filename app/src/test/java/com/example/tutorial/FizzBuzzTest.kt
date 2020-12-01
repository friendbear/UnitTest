package com.example.tutorial

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*

class ExampleTest {

    lateinit var example: FizzBuzz
    @Before
    fun setUp() {
        example = FizzBuzz()
    }

    @After
    fun tearDown() {
    }

    @Test
    fun fizzBuzzに３を渡した場合() {
        val expected = "Fizz"
        val actual = example.fizzBuzz(3)
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    fun fizzBuzzに20を渡した場合() {
        val expected = "Buzz"
        val actual = example.fizzBuzz(20)
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    fun fizzBuzzに15を渡した場合() {
        val expected = "FizzBuzz"
        val actual = example.fizzBuzz(15)
        assertThat(actual).isEqualTo(expected)
    }
    @Test
    fun fizzBuzzに1を渡した場合() {
        val expected = "1"
        val actual = example.fizzBuzz(1)
        assertThat(actual).isEqualTo(expected)
    }
}