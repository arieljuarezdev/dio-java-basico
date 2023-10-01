package mensageria.apps;

public class Telegram extends ServiçoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada via Telegram");
        salvarHistorico();
    }
    
    @Override
    public void receberMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem recebida via Telegram");
        salvarHistorico();
    }
    
    private void salvarHistorico(){
        System.out.println("Salvando histórico Telegram");
    }
}
