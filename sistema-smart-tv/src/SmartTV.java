public class SmartTV {
    
    boolean OnOff = false;
    int channel = 1;
    int volume = 20;

    public void turnOn(){
        OnOff = true;
    }

    public void turnOff(){
        OnOff = false;
    }

    public void selectChannel(int numberChannel){
        channel = numberChannel;
    }

    public void plusChannel(){
        channel++;
    }

    public void minusChannel(){
        channel--;
    }

    public void plusVolume(){
        volume++;
    }

    public void minusVolume(){
        volume--;
    }
}
