package academy.devdojo.maratonajava.javacore.kenum.test;

import academy.devdojo.maratonajava.javacore.kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.kenum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsu", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("JU", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        System.out.println(cliente1);
        System.out.println("--------------");
        System.out.println(cliente2);
        System.out.println("--------------");
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(500));
        System.out.println("--------------");
        TipoCliente tipoCliente1 = TipoCliente.valueOf("PESSOA_FISICA");
        TipoCliente tipoCliente2 = TipoCliente.tipoClienteRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente1.getNomeRelatorio());
        System.out.println(tipoCliente2.getNomeRelatorio());
    }
}
