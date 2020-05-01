package com.github.bioce.jackfruit.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author bioce
 * @date 2020-04-21 20:30
 */
public class MoneyUtilTest {

    @Test
    public void testYuan2fen() {
        Assertions.assertEquals(20, MoneyUtils.yuan2fen(0.2));
        Assertions.assertEquals(2, MoneyUtils.yuan2fen(0.02));
        Assertions.assertEquals(200, MoneyUtils.yuan2fen(2.002));
        Assertions.assertEquals(200, MoneyUtils.yuan2fen(2.00));
        Assertions.assertEquals(200, MoneyUtils.yuan2fen(2D));
        Assertions.assertEquals(0, MoneyUtils.yuan2fen(0D));
        Assertions.assertEquals(-200, MoneyUtils.yuan2fen(-2.002));
        Assertions.assertEquals(-200, MoneyUtils.yuan2fen(-2.00));
        Assertions.assertEquals(-200, MoneyUtils.yuan2fen(-2D));
        Assertions.assertEquals(0, MoneyUtils.yuan2fen(-0D));
        Assertions.assertNull(MoneyUtils.yuan2fen(null));
    }

    @Test
    public void testFen2yuan() {
        Assertions.assertNull(MoneyUtils.fen2yuan(null));
        Assertions.assertEquals(0, MoneyUtils.fen2yuan(0L));
        Assertions.assertEquals(0.2, MoneyUtils.fen2yuan(20L));
        Assertions.assertEquals(2, MoneyUtils.fen2yuan(200L));
        Assertions.assertEquals(2.2, MoneyUtils.fen2yuan(220L));
        Assertions.assertEquals(2.02, MoneyUtils.fen2yuan(202L));
        Assertions.assertEquals(2.00, MoneyUtils.fen2yuan(200L));
    }
}
