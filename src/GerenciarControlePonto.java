import java.time.LocalDate;
import java.time.LocalDateTime;

public class GerenciarControlePonto {
    public static void main(String[] args) throws InterruptedException{
        Gerente gerente = new Gerente();
        gerente.setIdFunc(10);
        gerente.setNome("Cleitin");
        gerente.setDocumento("70707070");
        gerente.setEmail("CocoDoCoqueiro@hotmail.com");
        gerente.setLogin("CleiBoss");
        gerente.setSenha("senha");

        Secretaria secretaria = new Secretaria();
        secretaria.setIdFunc(06);
        secretaria.setNome("Catarina Furacão");
        secretaria.setDocumento("28379182");
        secretaria.setEmail("Catarinahurricane@bol.com");


        Operador operador = new Operador();
        operador.setIdFunc(2);
        operador.setNome("Aécio Snows");
        operador.setDocumento("45454545");
        operador.setEmail("VacuumMan@Sniff.com");

        Thread.sleep(3000);
        RegistroPonto gerente1 = new RegistroPonto();
        gerente1.setFunc(gerente);
        gerente1.setDataRegistro(LocalDate.now());
        gerente1.setHoraEntrada(LocalDateTime.now());
        gerente1.setHoraSaida(LocalDateTime.now());
        gerente1.apresentarRegistroPonto();

        Thread.sleep(3000);
        RegistroPonto secretaria1 = new RegistroPonto();
        secretaria1.setFunc(secretaria);
        secretaria1.setDataRegistro(LocalDate.now());
        secretaria1.setHoraEntrada(LocalDateTime.now());
        secretaria1.setHoraSaida(LocalDateTime.now());
        secretaria1.apresentarRegistroPonto();

        Thread.sleep(3000);
        RegistroPonto operador1 = new RegistroPonto();
        operador1.setFunc(operador);
        operador1.setDataRegistro(LocalDate.now());
        operador1.setHoraEntrada(LocalDateTime.now());
        operador1.setHoraSaida(LocalDateTime.now());
        operador1.apresentarRegistroPonto();


    }
}
