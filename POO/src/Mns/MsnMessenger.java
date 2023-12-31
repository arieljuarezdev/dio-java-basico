package Mns;

public class MsnMessenger {
	public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		validarConectadoInternet();
        System.out.println("Recebendo mensagem");
        salvarHistoricoMensagem();
	}
    
    // métodos privados
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
