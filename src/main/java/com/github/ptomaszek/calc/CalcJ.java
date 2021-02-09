package com.github.ptomaszek.calc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CalcJ {

    Logger log = LoggerFactory.getLogger(CalcJ.class);

    public int multiply(int multiplicand, int multiplier) {
        log.debug("Multiplying {} * {}...", multiplicand, multiplier);
        return multiplicand * multiplier;
    }
}
