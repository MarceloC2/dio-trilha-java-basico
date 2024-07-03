package bancozurc.tiposconta;

public interface IContas {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino) ;
    //pode receber tanta conta poupança quando corrente (polimorfismo)

    void ImprimirExtrato();
}
/*
 * A interface não era necessária, nas por demosntração fica legal pq podemos ver os contratos bem definidos
 */