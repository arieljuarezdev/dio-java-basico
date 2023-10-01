package mensageria.apps;
// Exercicio de Herança, abstração e polimorfismo
public abstract class ServiçoMensagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();

    protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}
