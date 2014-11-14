/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
import utfpr.ct.dainf.if62c.pratica.Elipse;
import utfpr.ct.dainf.if62c.pratica.Circulo;

public class Pratica42 {
    public static void main(String[] args) {
        Elipse elipse = new Elipse(2,4);
        Circulo circulo = new Circulo(2);
        System.out.println(elipse.getArea());
        System.out.println(elipse.getPerimetro());
        System.out.println(circulo.getPerimetro());
    }
}
