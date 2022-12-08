import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Radio3Test {
    @Test
    public void next() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
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

    @Test
    public void regular() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(5);

        radio.next();

        int expected = 6;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev2() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(9);

        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev3() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(-1);

        //radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(-1);

        //radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volume2() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(11);

        //radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prev4() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(11);

        //radio.prev();

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume() {
        Radio3 radio = new Radio3();
        radio.setCurrentStation(9);

        radio.next();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(0);

        radio.prev();

        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevVolume1() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(8);

        radio.prevVolume1();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume1() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(8);

        radio.nextVolume1();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextVolume2() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(10);

        radio.nextVolume1();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevVolume2() {
        Radio3 radio = new Radio3();
        radio.setCurrentVolume(0);

        radio.prevVolume1();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

}