import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio3Test {

    public class Radio2Test {
        public class radio2Test {
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
}
