package com.github.ptomaszek.calc;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalcJTest {

    private final CalcJ calc = new CalcJ();

    @Test
    void solve() {
        //given

        //when
        int res = calc.multiply(21, 2);

        //then
        Assertions.assertThat(res).isEqualTo(42);
    }
}
