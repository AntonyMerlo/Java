public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String nome, int idade, String sexo){
        setNome(nome);
        setIdade(idade);
        if(sexo == "M" && sexo == "m"){
            setSexo("Masculino");
        }
        else if(sexo == "F" && sexo == "f"){
            setSexo("Feminino");
        }
    }
    //get
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public String getSexo(){
        return this.sexo;
    }
    //set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public void fazerAniver(){
        this.idade = getIdade() + 1;
    }
}
