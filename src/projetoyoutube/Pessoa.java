package projetoyoutube;
public class Pessoa {
    protected String pessoa;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String pessoa, int idade, String sexo) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    @Override
    public String toString() {
        return "\npessoa = " + pessoa + "\nidade = " + idade + "\nsexo = " + sexo + "\nexperiencia = " + experiencia + "\n";
    }
    
    
    
    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
}
