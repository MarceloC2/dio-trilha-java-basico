package bancozurc.tiposconta;

import bancozurc.agencia.clientes.Cliente;

public class ContaPupanca extends Conta {

    public ContaPupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void ImprimirExtrato() {
        System.out.println("+++ Extrato Conta Poupança +++");
        super.extratoComum();
    }

   
}
