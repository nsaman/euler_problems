package euler;

import euler.Problem8_Largest_product_in_a_series;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class Problem8_Largest_product_in_a_seriesTest {

    @ParameterizedTest
    @CsvSource({"1,9","4,5832"})
    void largestProductInASeriesLargeSeries(int seriesLength, int result) {
        assertEquals(result, Problem8_Largest_product_in_a_series.largestProductInASeries(Problem8_Largest_product_in_a_series.SERIES,seriesLength));
    }

    @ParameterizedTest
    @CsvSource({"90,1,9", "059,2,45"})
    void largestProductInASeriesExactSeries(String series, int seriesLength, int result) {
        assertEquals(result, Problem8_Largest_product_in_a_series.largestProductInASeries(series,seriesLength));
    }
}