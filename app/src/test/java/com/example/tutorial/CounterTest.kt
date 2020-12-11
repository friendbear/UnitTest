package com.example.tutorial

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import org.assertj.core.api.Assertions.*

@RunWith(Enclosed::class)
class CounterTest {

    class 初期状態 {
        lateinit var sut: Counter
        @Before
        fun setUp(){
            sut = Counter()
        }

        @Test
        fun decrementを１回実行するとマイナス１を返す() {
            val actual = sut.decrement()
            assertThat(actual).isEqualTo(-1)
        }
    }

    class incrementが１回実行された状態() {
        lateinit var sut: Counter

        @Before
        fun setUp() {
            sut = Counter()
            sut.increment()
        }

        @Test
        fun incrementを100回実行すると101を返す() {
            var actual = 0
            for (i in 1..100) actual = sut.increment()
            assertThat(actual).isEqualTo(101)
        }
    }

}