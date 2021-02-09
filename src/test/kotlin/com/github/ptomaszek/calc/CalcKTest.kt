package com.github.ptomaszek.calc

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

object CalcKTest {
    class Tests {
        private val solver = CalcJ()

        @Test
        fun `multiply numbers`() {
            assertThat(solver.multiply(3, 30)).isEqualTo(90)
        }
    }
}
