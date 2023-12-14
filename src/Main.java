import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ListaDePessoa();
    }

    public static void ListaDePessoa () {
        List<Pessoa> conjuntoPessoas = new ArrayList<>();

        Pessoa a = new Pessoa("Leticia", "feminino");
        Pessoa b = new Pessoa("Rogério", "masculino");
        Pessoa c = new Pessoa("Marcia", "feminino");
        Pessoa d = new Pessoa("Lucio", "masculino");
        Pessoa e = new Pessoa("Fernanda", "feminino");
        Pessoa f = new Pessoa("Maicon", "masculino");

        conjuntoPessoas.add(a);
        conjuntoPessoas.add(b);
        conjuntoPessoas.add(c);
        conjuntoPessoas.add(d);
        conjuntoPessoas.add(e);
        conjuntoPessoas.add(f);
        Collections.sort(conjuntoPessoas);
        System.out.println(conjuntoPessoas);


    }




}