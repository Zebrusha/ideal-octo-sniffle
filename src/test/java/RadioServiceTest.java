import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioServiceTest {

//    @Test
//    public void NomberCurentStation() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(7);
//
//        int expected = 7;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void sholdTestingNextChanel() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(4);
//        radio.nextChanel();
//
//        int expected = 5;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdTestingPrevChanel() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(4);
//        radio.prevChanel();
//
//        int expected = 3;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void shouldIncreaseTestchanelMax() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(9);
//        radio.nextChanel();
//
//
//        int expected = 0;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldIncreaseTestchanelMin() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(0);
//        radio.prevChanel();
//
//
//        int expected = 9;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void sholdIncreaseTestchanelLess() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(-1);
//
//
//        int expected = 0;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseTestChanelMore() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(10);
//
//        int expected = 0;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void souldIncreaseTestVolume() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(40);
//        radio.increaseVolume();
//
//        int expected = 41;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void souldDecreaseTestVolume() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(50);
//        radio.decreaseVolume();
//
//        int expected = 49;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void sholdIncreaseTestVoluneMax() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(100);
//        radio.increaseVolume();
//
//        int expected = 100;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void souldIncreaseTestVolumeMin() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(0);
//        radio.decreaseVolume();
//
//        int expected = 0;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void souldIncreaseTestVolumeLess() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(-1);
//
//
//        int expected = 0;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shoulIncreaseTestVolumeMore() {
//        RadioService radio = new RadioService();
//        radio.setCurentVolume(101);
//
//        int expected = 0;
//        int actual = radio.getCurentVolume();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void shouldIncreaseTestchanel() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(8);
//        radio.nextChanel();
//
//
//        int expected = 9;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldIncreaseTestchanelNule() {
//        RadioService radio = new RadioService();
//        radio.setCurentRadioStation(1);
//        radio.prevChanel();
//
//
//        int expected = 0;
//        int actual = radio.getCurentRadioStation();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void prevUnderChangingMaximumСhannel() {
        RadioService radio = new RadioService(10);
        radio.setCurentRadioStation(0);
        radio.prevChanel();

        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void nextUnderChangingMaximumСhannel() {
        RadioService radio = new RadioService(10);
        radio.setCurentRadioStation(9);
        radio.nextChanel();

        int expected = 0;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void decreaseVolume() {
        RadioService radio = new RadioService(50);
        radio.setCurentVolume(40);
        radio.decreaseVolume();

        int expected = 39;
        int actual = radio.getCurentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void curentRadioStationMoreLastRadioStation() {
        RadioService radio = new RadioService(14);
        radio.setCurentRadioStation(12);


        int expected = 0;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void test() {
        RadioService radio = new RadioService(20);
        radio.setCurentRadioStation(15);


        int expected = 15;
        int actual = radio.getCurentRadioStation();

        Assertions.assertEquals(expected, actual);
    }


}
