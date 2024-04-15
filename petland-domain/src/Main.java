import com.petland.domain.atendimento.Atendimento;
import com.petland.domain.atendimento.AtendimentoStatus;
import com.petland.domain.atendimento.AtendimentoTipo;
import com.petland.domain.cadastro.*;

import java.time.LocalDate;
import java.time.LocalTime;


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

        //cadastro ok
        cadastro.setEndereco(endereco);

        Animal animal = new Animal();
        animal.setId(1);
        animal.setNome("Snoop");
        animal.setAniversario(LocalDate.of(2023, 01, 23));
        animal.setEspecie(Especie.CACHORRO);

        ProdutoServico servico = new ProdutoServico();
        servico.setId(1);
        servico.setServico(true);
        servico.setNome("Tosa");
        servico.setValor(60.0);

        Atendimento atendimento = new Atendimento();
        atendimento.setId(1);
        atendimento.setData(LocalDate.now());
        atendimento.setHora(LocalTime.now());
        atendimento.setDescricao(servico.getNome());
        atendimento.setValor(servico.getValor());
        atendimento.setStatus(AtendimentoStatus.REALIZANDO);
        atendimento.setTipo(AtendimentoTipo.HIGIENIZACAO);
        atendimento.setSolicitante(cadastro);
        atendimento.setPaciente(animal);
        atendimento.setServico(servico);

        System.out.println(atendimento);



    }
}