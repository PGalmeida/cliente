public class Cliente {
    public String nome;
    public int numeroConta, numeroAgencia;
    public float saldo;

    public Cliente(String nome, int numeroAgencia, int numeroConta, float saldo){
        this.nome = nome;
        this.numeroAgencia = numeroAgencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void realizarDeposito(float x){
        this.saldo += x;
    }

    public void realizarSaque(float x){
        if(this.saldo - x >= 0){
            this.saldo -= x;
        }
    }

    public String mostrar(){
        return "\nNúmero da conta: "+this.numeroConta+", Nome do cliente: "+this.nome+", Saldo atual: R$"+this.saldo;
    }
}
