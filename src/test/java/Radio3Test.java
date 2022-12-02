import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio3Test {

    public class radio3Test {
        public class radio3Test {
            @Test
            public void test() {
                int stationsCount;
                Radio3 radio = new Radio3(stationsCount = 20);
                radio.setCurrentStation(15);
                int expected = 15;
                int actual = radio.getCurrentStation();
                Assertions.assertEquals(expected, actual);
            }
        }
    }
    @Test
    public void next() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prev() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

}
