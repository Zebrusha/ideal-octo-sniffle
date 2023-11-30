public class RadioService {
    public int curentRadioStation;
    public int curentVolume;

    public int getCurentVolume() {
        return curentVolume;
    }

    public int getCurentRadioStation() {
        return curentRadioStation;
    }

    public void setCurentRadioStation(int newCurentRadioStation) {
        if (newCurentRadioStation < 0) {
            curentRadioStation = 9;
            return;
        }
        if (newCurentRadioStation > 9) {
            curentRadioStation = 0;
            return;
        }
        curentRadioStation = newCurentRadioStation;
    }

    public void setCurentClic(int b) {
        if (b == 1) {
            int target = curentRadioStation + 1;
            setCurentRadioStation(target);
        }
        if (b == 0) {
            int target = curentRadioStation - 1;
            setCurentRadioStation(target);
        }
    }

    public void setToMaxChanel() {
        curentRadioStation = 9;
    }


    public void increaseRadioMax() {
        int target = curentRadioStation + 1;
        setCurentRadioStation(target);

    }

    public void increaseRadioMin() {
        int target = curentRadioStation + 1;
        setCurentRadioStation(target);
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

    public void setCurentClicVolume(int b) {
        if (b == 1) {
            int target = curentVolume + 1;
            setCurentVolume(target);
        }
        if (b == 0) {
            int target = curentVolume - 1;
            setCurentVolume(target);
        }
    }

}
