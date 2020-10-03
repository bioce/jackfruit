package com.github.bioce.jackfruit.util;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * 金额相关转换
 * @author bioce
 */
public class MoneyUtils {

    private static final BigDecimal BD_100 = new BigDecimal(100);

    /**
     * 分 to 元
     * @param fen 金额（分）
     * @return 金额（元）
     */
    public static Double fen2yuan(Long fen) {
        if (Objects.isNull(fen)) {
            return null;
        }
        BigDecimal bdFen = new BigDecimal(fen);
        return bdFen.divide(BD_100, 2, BigDecimal.ROUND_DOWN).doubleValue();
    }

    /**
     * 元 to 分
     * @param yuan 金额（元）
     * @return 金额（分）
     */
    public static Long yuan2fen(Double yuan) {
        if (Objects.isNull(yuan)) {
            return null;
        }
        return Double.valueOf(yuan * 100).longValue();
    }
}
