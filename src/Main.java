public class Main {
    public static void main(String[] args) {
        // Aula introdutória de Orientação à Objetos
        // Criar objetos
        Pessoa adao = new Pessoa();
        // Declaração de objeto
        Pessoa qualquer;
        // Instanciação do objeto
        qualquer = new Pessoa();
        Pessoa adulta = new Pessoa();
        // Definir forma do objeto
        qualquer.nome = "Rita";
        qualquer.sobrenome = "Lee";
        // Definir comportamento do objeto
        qualquer.falar();
        adao.falar("baixo");
        //criar mais objetos

        //declarar
        Pessoa rainha;
        //instanciar
        rainha = new Pessoa();
        //definir forma do objeto
        rainha.nome = "Tina";
        rainha.sobrenome = "Tunner";
        //definir comportamento
        rainha.falar();
        rainha.falar("alto");
        System.out.println(rainha.falar("alto", "grave"));

        Animal cao;
        cao = new Animal();
        cao.nome = "Pluto";
        cao.comer();

        rainha.comer();


    }
}