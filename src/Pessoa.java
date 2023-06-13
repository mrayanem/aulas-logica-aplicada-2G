public class Pessoa extends Animal {
    // Atributos da classe
    String sobrenome;
    // Métodos da classe

    // Sobrecarga do método
    public void falar(){
        System.out.println("falei");
    }
    public void falar(String volume){
        System.out.println("falei " + volume);
    }
    public String falar(String volume,
                        String tom){
        return "falei " + volume + " e " + tom;
    }
    // Sobrescrita de método
    public void comer(){
        System.out.println("Comer como pessoa");
    }
}