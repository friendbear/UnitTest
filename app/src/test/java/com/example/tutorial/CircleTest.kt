package com.example.tutorial

import org.junit.Test

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*
import org.junit.runner.RunWith
import org.junit.runners.Suite

class CircleTest {

    @Test
    fun constructorTest() {
        val actual = 3.14
        val expected = 3.14

        assertThat(Circle(3.14).pi).isEqualTo(expected)

    }

    @Test
    fun getArea() {

        val actual = Circle(3.14).getArea(2)
        val expected = 12.56

        assertThat(actual).isEqualTo(expected)
    }
}

@RunWith(Suite::class)
@Suite.SuiteClasses(CircleTest::class, FizzBuzz::class)
class SuiteTest{}