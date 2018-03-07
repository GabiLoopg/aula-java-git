/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 02956215248
 */
public class Calculadora {
       public  static  double soma (double x, double y){
     return x+y;
 }
    public static double subtracao (double x, double y){
     return x-y;
 }
    public static double multiplica (double x, double y){
     return x*y;
 }
    public static double dividir (double x, double y){
     return x/y;
 }
    

public static void main(String[] args){
    double x =11;
    double y =20;
    Calculadora cal=new Calculadora();
    System.out.println(Calculadora.soma (x, y));
    System.out.println(Calculadora.subtracao (x, y));
    System.out.println(Calculadora.multiplica (x, y));
    System.out.println(Calculadora.dividir (x, y));

}
    
}

   
