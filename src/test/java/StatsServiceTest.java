import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.stats.StatsService;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldSum(String line) {
        StatsService service = new StatsService();
        //конвертируем строку в int
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getSum(resources);

        int expected = 180;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldGetAverage(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getAverage(resources);

        int expected = 15;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void sholdGetMonthMax(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getMonthMax(resources);

        int expected = 6;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void sholdGetMonthMin(String line) {
        StatsService service = new StatsService();
        int[] resources = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getMonthMin(resources);

        int expected = 9;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldgetMonthMaxCount(String line) {
        StatsService service = new StatsService();
        int[] resouces = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getCountOverAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data.csv")
    void shouldgetMonthMin(String line) {
        StatsService service = new StatsService();
        int[] resouces = Arrays.stream(line.split(",")).mapToInt(Integer::parseInt).toArray();
        int actual = service.getCountUnderAverage(resouces);

        int expected = 5;

        assertEquals(expected, actual);
    }
}