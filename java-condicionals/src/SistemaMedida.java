public class SistemaMedida {
    public static void main(String[] args) {
        String medida = "g";

        switch(medida){
            case "p":{
                System.out.println("Pequeno");
                break;
            }
            case "m":{
                System.out.println("Médio");
                break;
            }
            case "g":{
                System.out.println("Grande");
                break;
            }
            default:{
                System.out.println("Opção não encontrada");
                break;
            }
        }
    }
}
