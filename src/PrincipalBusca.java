import java.io.IOException;
import java.util.Scanner;

public class PrincipalBusca {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String busca = "";
        ConsultaCep consultacep = new ConsultaCep();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("Digite um cep para leitura: ");
            busca = ler.nextLine();
            if (busca.equalsIgnoreCase("0")){
                break;
            }else if (busca.equalsIgnoreCase("1")){
                continue;
            }
            try {
                Endereco novoEndereco = consultacep.buscaEndereco(busca);
                System.out.println(novoEndereco);
                GeradorArquivo gerador = new GeradorArquivo();
                gerador.salvaJson(novoEndereco);
                System.out.println("Arquivo Salvo! ");
            } catch (RuntimeException | IOException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando a aplicacao! ");
            }
            System.out.println("Aplicação finalizada! ");
            System.out.println("Digite 0 para sair ou 1 para continuar: ");
        }
    }
}
