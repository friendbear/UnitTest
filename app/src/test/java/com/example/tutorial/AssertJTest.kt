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

    @Test
    fun assertThatArrayTest() {

        val sut = arrayOf("red", "green", "blue")
        Assertions.assertThat(sut)
            .hasSize(3)
            .contains("green")
            .containsOnly("blue", "red", "green")
            .containsExactly("red", "green", "blue")
            .doesNotContain("yellow")
    }

    @Test
    fun assertThatCollectionTest() {

        val sut = listOf<String>("red", "green", "blue")
        Assertions.assertThat(sut)
            .hasSize(3)
            .contains("green")
            .containsOnly("blue", "red", "green")
            .containsExactly("red", "green", "blue")
            .doesNotContain("yellow")
    }

    @Test
    fun lessonAssertThatTest() {
        val arr = arrayOf(3, 1, 4)

        /*
        1 配列のサイズが3である
        2 2を含まない
        3 1つ目の要素が3である
        4 2つ目の要素が正の数である
        5 3つの目の要素は4以下である
         */
        assertThat(arr)
            .hasSize(3)
            .doesNotContain(2)

        assertThat(arr[0])
            .isEqualTo(3)
        assertThat(arr[1])
            .isNotNegative()
        assertThat(arr[2])
            .isLessThanOrEqualTo(4)
    }
}