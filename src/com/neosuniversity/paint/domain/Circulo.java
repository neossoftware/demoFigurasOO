package com.neosuniversity.paint.domain;

import java.awt.Color;
import java.awt.Graphics;

public class Circulo implements  Figura {

    private double radio;

    private double area;

    private double perimetro;

    private int x;

    private int y;

    private boolean isFilled;

    private Color color ;


    public Circulo() {
        this.x = 0;
        this.y = 0;
        this.radio = 100;
        this.color = Color.BLACK;

    }

    public Circulo (double radio, Color color ) {
        this.x = 0;
        this.y = 0;
        this.radio = radio;
        this.color = color;
    }

    public Circulo (double radio, Color color, int x, int y ) {
        this(radio,color);
        this.x = x;
        this.y = y;
    }

    public Circulo (double radio, Color color, int x, int y, boolean isFilled ) {
        this(radio,color, x, y);
       this.isFilled = isFilled;
    }


    public double calculaArea() {
        this.area = Math.PI * Math.pow(this.radio , 2);
        return this.area;
    }

    public void draw (Graphics g){
        g.setColor(this.color);
        if (this.isFilled) {
            g.fillOval(this.x,this.y,(int)this.radio, (int)this.radio);
        } else {
            g.drawOval(this.x,this.y,(int)this.radio, (int)this.radio);
        }

    }

    @Override
    public String toString() {
        return "com.neosuniversity.paint.domain.Circulo{" +
                "radio=" + radio +
                ", area=" + area +
                ", perimetro=" + perimetro +
                ", color='" + color + '\'' +
                '}';
    }
}
