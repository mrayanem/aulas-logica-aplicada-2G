public class Solo {

    //atributos

    boolean fertil;
    String tipoSolo;
    String localDoSolo;
    String estado;

    //metódos

    public Planta gerarPlanta(Semente s1){
        Planta p1 = new Planta(s1);
        return p1;
    }
}
