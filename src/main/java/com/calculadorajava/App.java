package com.calculadorajava;
import java.util.*;
public class calcu {
    public static int suma(int a, int b)
    {
        return a+b;
    }
    public static int resta(int a, int b)
    {
        return a-b;
    }
    public static int producto(int a, int b)
    {
        return a*b;
    }
    public static double division(int a, int b)
    {
        return (double)a/(double)b;
    }
    public static void main(String args[])
    {
        Scanner leer=new Scanner(System.in);
        int op, a, b;
        char seguir;
        System.out.println("Bienvenidos a la calcu de java. \n\n Vamos a realizar cálculos básicos de números enteros.\n");
        do{
        System.out.println("¿Que quieres hacer?\n");
        System.out.println("1.Sumar\n");
        System.out.println("2.Restar\n");
        System.out.println("3.Multiplicar\n");
        System.out.println("4.Dividir\n");
        op=leer.nextInt();
        System.out.println("Introduce los dos enteros para realizar la operación:");
        a=leer.nextInt();
        b=leer.nextInt();
        switch(op)
        {
            case 1:
            {
                System.out.println("El resultado de la suma es: " + suma(a,b) + "\n");
            }break;
            case 2:
            {
                System.out.println("El resultado de la resta es: " + resta(a,b)+ "\n");
            }break;
            case 3:
            {
                System.out.println("El resultado del producto es: " + producto(a,b)+ "\n");
            }break;
            case 4:
            {
                if(b==0) System.out.println("Esta operacion no puede realizarse.\n");
                else
                    System.out.println("El resultado de la division es: " + division(a,b)+ "\n");
            }break;
        }
        System.out.println("¿Quieres realizar otra operacion? S/N\n");
        seguir=leer.next().charAt(0);
        }while(seguir =='S' || seguir =='s');
    }
}
