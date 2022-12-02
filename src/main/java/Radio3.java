public class Radio3 {
    private int currentStation;
    private int currentVolume;
    int maxStation;
    public Radio3() {
        maxStation = 9;

    }
    public Radio3(int stationsCount){
        maxStation = stationsCount - 1;

    }
    public void next () {
        if (currentStation < maxStation ) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }
    public void prev() {
        if (currentStation > 0) {
            currentStation--;
        }else{
            currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if  (currentStation < 0 ) {
            return;
        }
        if (currentStation > maxStation ) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if  (currentVolume < 0 ) {
            return;
        }
        if (currentVolume > 10 ) {
            return;
        }
        this.currentVolume = currentVolume;
    }
    public void nextVolume () {
        if (currentVolume < 10 ) {
            currentVolume++;
        } else {
            currentStation = 0;
        }
    }
    public void prevVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }else{
            currentVolume = 10;
        }
    }
}