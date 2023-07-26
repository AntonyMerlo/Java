public class ContaBancaria {
    //atributos de conta
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Atributo de texto
    public void informa(){
        System.out.println("-----------------------------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }
    //abrir conta
    public void abrirConta(String tipo){
        if(tipo == "cc" || tipo == "CC"){
            setTipo("cc");
            setSaldo(50f);
            setStatus(true);
        }
        else{
            setTipo("cp");
            setSaldo(150f);
            setStatus(true);
        }
        System.out.println("Conta aberta!");
    }
     //fechar conta
    public String fConta;
    public void fecharConta(){
        if(status == true){
            if(saldo == 0){
                fConta = "Foi fechada com sucesso";
            }
            else if(saldo > 0){
                fConta = "Apresenta Saldo";
            }
            else{
                fConta = "Apresenta Debito";
            }
        }
        else if(status == false){
            fConta = "Esta Fechada";
            setStatus(false);
        }
        System.out.println("Conta: " + fConta);
    }
    //depositar
    public void depositar(int valor){
        if(status == true){
            setSaldo(getSaldo() + valor);
            System.out.println("Deposito realizado com sucesso!");
        }
        else{
            System.out.println("Impossivel depositar!");
        }
    }
    //sacar
    public void sacar(int valor){
        if(getStatus() == true){
            if(valor > 1000){
                System.out.println("Só pode ter saques até 1000");
            }
            else if(valor < 0){
                System.out.println("Não pode sacar valor negativo");
            }
            else if(getSaldo() < valor){
                System.out.println("Saldo insuficiente!");
            }
            else{
                setSaldo(getSaldo()-valor);
                System.out.println("Contando o dinheiro para liberar!");
            }
        }
        else{
            System.out.println("Conta não existe");
        }
    }
    //Mensalidade
    public void pagarMensalidade(){
        if(getTipo() == "cc"){
            setSaldo(getSaldo()-12f);
        }
        else{
            setSaldo(getSaldo()-20f);
        }
    }

    //Metodos especiais
    //metodo construtor
    public ContaBancaria(){
        setSaldo(0f);
        setStatus(false);
    }
    //numConta;
    public int getNumConta(){
        return numConta;
    }
    public void setNumConta(int numConta){
        this.numConta = numConta;
    }
    //tipo;
    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    //dono;
    public String getDono(){
        return dono;
    }
    public void setDono(String dono){
        this.dono = dono;
    }
    //saldo;
    public float getSaldo(){
        return saldo;
    }
    public void setSaldo(float saldo){
        this.saldo = saldo;
    }
    //status;
    public boolean getStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
