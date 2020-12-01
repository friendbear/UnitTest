package com.example.tutorial

import org.junit.Test

import org.junit.Assert.*
import org.assertj.core.api.Assertions.*

class NameListTest {

    @Test
    fun add() {
        val sut = NameList()
        sut.add("Jone")
        sut.add("Suu")

        assertThat(sut.nameList).hasSize(2)
        assertThat(sut.nameList[0]).isEqualTo("Jone")
    }

    @Test
    fun remove() {
    }
}