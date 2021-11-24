package utils;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class CartSummary {

    public static BigDecimal COST_FOR_ONE_DAY = BigDecimal.valueOf(2);

    public static BigDecimal COST_FOR_PREMIERE_MOVIE = BigDecimal.valueOf(5);
    public static BigDecimal COST_FOR_STANDARD_MOVIE = BigDecimal.valueOf(2);
    public static BigDecimal COST_FOR_CLASSIC_MOVIE  = BigDecimal.valueOf(1);

    public static BigDecimal COST_MOVIE_SHORT_RENT = BigDecimal.valueOf(3);
    public static BigDecimal COST_MOVIE_STANDARD_RENT = BigDecimal.valueOf(2);
    public static BigDecimal COST_MOVIE_LONG_RENT = BigDecimal.valueOf(1);

    public static int MAX_DAY_FOR_SHORT_TERM_RENT = 2;
    public static int MAX_DAY_FOR_LONG_TERM_RENT = 5;
}
