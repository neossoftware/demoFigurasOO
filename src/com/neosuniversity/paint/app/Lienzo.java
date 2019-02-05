package com.neosuniversity.paint.app;

import com.neosuniversity.paint.domain.Circulo;
import com.neosuniversity.paint.domain.Cuadrado;
import com.neosuniversity.paint.domain.Figura;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Lienzo  extends JPanel {

    private List<Figura> list = new ArrayList<>();

    public  Lienzo (List<Figura> figuras){
        this.list = figuras;
    }

    public List<Figura> getFiguras() {
        return this.list;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        this.list.stream().forEach((f) -> {
            f.draw(g);
        });


    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame();// Ventana




        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Circulo());
        figuras.add(new Circulo(200,Color.GREEN, 100, 50));
        figuras.add(new Circulo(300,  Color.ORANGE, 200, 200,true));
        figuras.add(new Circulo(90,  Color.MAGENTA, 190, 100,true));

        figuras.add(new Cuadrado( 70, Color.MAGENTA, 100,150,true));
        figuras.add(new Cuadrado());

        Lienzo lienzo  = new Lienzo(figuras);

        List<Figura> f = lienzo.getFiguras();

        Lienzo lienzo2 = new Lienzo(f);


        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.add(lienzo);
        ventana.setTitle("Mi ventana");
        ventana.setSize(600,600);
        ventana.setVisible(true);
    }
}
