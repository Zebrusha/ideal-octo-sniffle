import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {

    @Test
    public void NomberCurentStation() {
        RadioService radio = new RadioService();

        radio.setCurentRadioStation(7);

        int expected = 7;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTestchanelMax() {
        RadioService radio = new RadioService();
        radio.setCurentRadioStation(9);
        radio.setCurentClic(1);


        int expected = 0;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseTestchanelMin() {
        RadioService radio = new RadioService();
        radio.setCurentRadioStation(0);
        radio.setCurentClic(0);


        int expected = 9;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldIncreaseTestVolume() {
        RadioService radio = new RadioService();
        radio.setCurentVolume(40);
        radio.setCurentClicVolume(1);

        int expected = 41;
        int actual = radio.getCurentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldIncreaseTestVolumeMax() {
        RadioService radio = new RadioService();
        radio.setCurentVolume(100);
        radio.setCurentClicVolume(1);

        int expected = 100;
        int actual = radio.getCurentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void souldIncreaseTestVolumeMin() {
        RadioService radio = new RadioService();
        radio.setCurentVolume(0);
        radio.setCurentClicVolume(0);

        int expected = 0;
        int actual = radio.getCurentVolume();

        Assertions.assertEquals(expected, actual);
    }

}
