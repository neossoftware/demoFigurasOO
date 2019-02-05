import java.awt.Color;

public class CirculoApp {

    public static void main(String[] args) {

        Circulo c1 = new Circulo();

        Circulo c2 = new Circulo(200, Color.GREEN);


        System.out.println(c1);

        System.out.println("Area=  " + c1.calculaArea());

        System.out.println(c2);

        System.out.println("Area=  " + c2.calculaArea());


    }
}
