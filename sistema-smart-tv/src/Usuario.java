public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        smartTV.turnOn();
        smartTV.selectChannel(44);
        smartTV.minusVolume();

        System.out.println("the tv is on? " + smartTV.OnOff);
        System.out.println("channel: " + smartTV.channel);
        System.out.println("volume: " + smartTV.volume);
    
    }
}
