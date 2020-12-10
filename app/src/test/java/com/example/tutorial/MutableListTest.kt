package com.example.tutorial

import org.junit.Test

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*

class MutableListTest {

    @Test
    fun add() {
        val sut = mutableListOf<String>()
        sut.add("Jone")
        sut.add("Suu")

        assertThat(sut).hasSize(2)
        assertThat(sut[0]).isEqualTo("Jone")
    }

    @Test
    fun remove() {
        val e = mutableListOf("Suu")
        val sut = mutableListOf<String>()
        sut.add("Jone")
        sut.add("Suu")
        sut.removeAt(0)

        assertThat(sut).hasSize(1)
        assertThat(sut).isEqualTo(e)
    }

}