public class Main {
    public static void main(String[] args) {
        ICalcMedia aritmetica = new Aritimetica();
        ICalcMedia geometrica = new Geometrica();

        Disciplina d = new Disciplina(aritmetica);
        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));

        d = new Disciplina(geometrica);
        d.setNome("Padroes de Desenvolvimento");
        d.setP1(10);
        d.setP2(5);
        d.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f Situacao: %s", d.getP1(), d.getP2(), d.getMedia(), d.getSituacao()));
    }
}