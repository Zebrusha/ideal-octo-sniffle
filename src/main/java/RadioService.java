public class RadioService {
    private int curentRadioStation;
    private int curentVolume;

    public int getCurentVolume() {
        return curentVolume;
    }

    public int getCurentRadioStation() {
        return curentRadioStation;
    }

    public void setCurentRadioStation(int newCurentRadioStation) {
        if (newCurentRadioStation < 0) {
            return;
        }
        if (newCurentRadioStation > 9) {
            return;
        }
        curentRadioStation = newCurentRadioStation;
    }

    public void setCurentVolume(int newCurentVolume) {
        if (newCurentVolume < 0) {
            return;
        }
        if (newCurentVolume > 100) {
            return;
        }
        curentVolume = newCurentVolume;
    }

    public void nextChanel() {
        if (curentRadioStation < 9) {
            curentRadioStation = curentRadioStation + 1;
        }
        if (curentRadioStation == 9) {
            curentRadioStation = 0;
        }
    }

    public void prevChanel() {
        if (curentRadioStation > 0) {
            curentRadioStation = curentRadioStation - 1;
        }
        if (curentRadioStation == 0) {
            curentRadioStation = 9;
        }
    }

    public void increaseVolume() {
        if (curentVolume < 100) {
            curentVolume = curentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (curentVolume > 0) {
            curentVolume = curentVolume - 1;
        }
    }

}
