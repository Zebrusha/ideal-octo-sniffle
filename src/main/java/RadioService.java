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
            curentRadioStation = 9;
            return;
        }
        if (newCurentRadioStation > 9) {
            curentRadioStation = 0;
            return;
        }
        curentRadioStation = newCurentRadioStation;
    }

    public void setCurentClic(int NextorPrev) {
        if (NextorPrev == 1) {
            int target = curentRadioStation + 1;
            setCurentRadioStation(target);
        }
        if (NextorPrev == 0) {
            int target = curentRadioStation - 1;
            setCurentRadioStation(target);
        }
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

    public void setCurentClicVolume(int PluseorMinus) {
        if (PluseorMinus == 1) {
            int target = curentVolume + 1;
            setCurentVolume(target);
        }
        if (PluseorMinus == 0) {
            int target = curentVolume - 1;
            setCurentVolume(target);
        }
    }

}
