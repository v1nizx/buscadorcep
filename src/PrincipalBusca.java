
public class PrincipalBusca {
    public static void main(String[] args) {
     ConsultaCep consultacep = new ConsultaCep();
     Endereco novoEndereco = consultacep.buscaEndereco("65051600");
        System.out.println(novoEndereco);
    }
}
