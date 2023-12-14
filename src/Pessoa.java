import java.util.Comparator;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {

    private String Nome;
    private String Sexo;

    public Pessoa(String Nome, String Sexo) {
        this.Nome = Nome;
        this.Sexo = Sexo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    @Override
    public String toString() {
        return Nome;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(Nome, pessoa.Nome) && Objects.equals(Sexo, pessoa.Sexo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Nome, Sexo);
    }


    @Override
    public int compareTo(Pessoa pessoa) {
        return this.Nome.compareTo(pessoa.getNome());
    }
}
