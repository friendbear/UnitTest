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

}