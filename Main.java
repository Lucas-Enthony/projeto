public class Main {
    public static void main(String[] args) {
        Cenoura cenoura1 = new Cenoura();
        Coelho coelho1 = new Coelho();
        Lobo lobo1 = new Lobo();

        coelho1.comerCenoura(cenoura1);
        lobo1.cacarCoelho(coelho1);

        System.out.println("Estado do ecossistema:");
        System.out.println("Cenoura foi comida? " + !cenoura1.estaComida());
        System.out.println("O coelho está alimentado? " + coelho1.estaAlimentado());
        System.out.println("O lobo está alimentado? " + lobo1.estaAlimentado());
    }
}
