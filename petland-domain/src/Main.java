import com.petland.domain.cadastro.Cadastro;
import com.petland.domain.cadastro.Endereco;
import com.petland.domain.cadastro.Perfil;


public class Main {
    public static void main(String[] args) {

        Cadastro cadastro = new Cadastro();
        cadastro.setId(1);
        cadastro.setNome("Victor Raposo");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);

        cadastro.setPerfil(perfil);

        Endereco endereco = new Endereco();
        endereco.setLogradouro("Rua do Raposo");
        endereco.setNumero("123A");

        cadastro.setEndereco(endereco);

        System.out.println("Cadastro criado, Nome: " + cadastro.getNome());
        System.out.println("Cadastro criado, Endereco: " + cadastro.getEndereco().getLogradouro() + ", " + cadastro.getEndereco().getNumero());

        System.out.println(cadastro);

    }
}