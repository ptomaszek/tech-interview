package com.github.ptomaszek.calc


import spock.lang.Specification
import spock.lang.Unroll

class CalcGTest extends Specification {

    def calc = new CalcJ()

    @Unroll
    def "Should multiply"() {
        expect:
        calc.multiply(multiplicand, multiplier) == expected

        where:
        multiplicand | multiplier || expected
        1            | 10         || 10
        2            | -21        || -42
    }
}
