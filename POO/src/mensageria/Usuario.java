package mensageria;

import mensageria.apps.Telegram;

public class Usuario {
    public static void main(String[] args) {
        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
