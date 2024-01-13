public class RadioService {

    private int numberRadioStations = 10;
    private int minRadistation = 0;
    private int maxRadioStation = numberRadioStations - 1;
    private int maxVolume = 100;
    private int minVolume = 0;

    private int curentRadioStation = minRadistation;
    private int curentVolume = minVolume;

    public RadioService(int numberRadioStations) {
        this.numberRadioStations = numberRadioStations;
    }

    public RadioService() {
        this.numberRadioStations = numberRadioStations;
    }

    public int getMaxRadioStation() {
        numberRadioStations = maxRadioStation;
        return maxRadioStation;
    }

    public int getCurentVolume() {
        return curentVolume;
    }


    public int getCurentRadioStation() {
        return curentRadioStation;
    }


    public void setCurentRadioStation(int newCurentRadioStation) {
        if (newCurentRadioStation < minRadistation) {
            return;
        } else if (newCurentRadioStation > maxRadioStation) {
            return;
        }
        curentRadioStation = newCurentRadioStation;
    }


    public void setCurentVolume(int newCurentVolume) {
        if (newCurentVolume < minVolume) {
            return;
        } else if (newCurentVolume > maxVolume) {
            return;
        }
        curentVolume = newCurentVolume;
    }


    public void nextChanel() {
        if (curentRadioStation < maxRadioStation) {
            curentRadioStation += 1;
        } else {
            curentRadioStation = 0;
        }

    }

    public void prevChanel() {
        if (curentRadioStation > minRadistation) {
            curentRadioStation -= 1;
        } else {
            curentRadioStation = maxRadioStation;
        }

    }


    public void increaseVolume() {
        if (curentVolume < maxVolume) {
            curentVolume += 1;
        }
    }

    public void decreaseVolume() {
        if (curentVolume > minVolume) {
            curentVolume -= 1;
        }
    }


}