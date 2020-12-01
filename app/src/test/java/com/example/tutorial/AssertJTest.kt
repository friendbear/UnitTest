package com.example.tutorial

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.assertj.core.api.SoftAssertions
import org.junit.Test

class AssertJTest {

    @Test
    fun assertThatStringTest() {
        assertThat("KOTLIN")
            .`as`("Kotlinの文字列チェック")
            .isEqualTo("KOTLIN")
            .isNotEqualTo("Kotlin")
            .startsWith("KO")
            .endsWith("IN")
            .contains("TL")
            .isInstanceOf(String::class.java)
    }
    @Test
    fun assertThatStringTestAllAssertions() {
        SoftAssertions().apply{
            Assertions.assertThat("KOTLIN")
                .`as`("Kotlinの文字列チェック")
                .isEqualTo("KOTLIN")
                .isNotEqualTo("Kotlin")
                .startsWith("KO")
                .endsWith("IN")
                .contains("TL")
                .isInstanceOf(String::class.java)
        }
    }
    @Test
    fun assertThatNumberTest() {
        assertThat(3.1415)
            .isNotZero()
            .isNotNegative()
            .isLessThan(4.0)
            .isGreaterThanOrEqualTo(3.0)
            .isBetween(3.0, 3.2)
    }
    @Test
    fun assertThatNumberTestAllAssertions() {
        SoftAssertions().apply {
            Assertions.assertThat(3.1415)
            .isNotZero()
            .isNotNegative()
            .isLessThan(4.0)
            .isGreaterThanOrEqualTo(3.0)
            .isBetween(3.0, 3.2)
        }
    }
}