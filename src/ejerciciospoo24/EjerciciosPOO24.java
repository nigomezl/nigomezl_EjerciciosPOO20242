
package ejerciciospoo24;
import java.util.*;
public class EjerciciosPOO24 {
    
    public static void main(String[] args) {
        ejercicio29();
    }
    
    public static void ejercicios1_7() {
        //ejercicio 1
        System.out.println("Hola, ya se imprimir frases");
        
        //ejercicio 2
        System.out.println(273);
        
        //ejercicio 3
        System.out.println(5.3);
        
        //ejercicio 4
        System.out.println(1234+532);
        
        //ejercicio 5
        System.out.println(1234-532);
        
        //ejercicio 6
        System.out.println(1234*532);
        
        //ejercicio 7
        long d = 1234/532;
        System.out.println(d);
    }
    public static void ejercicios8_15(){
        
        for(int i = 1;i < 4; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 9
        for(int i = 1;i < 10; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 10
        for(int i = 1;i < 10001; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 11
        for(int i = 5;i < 11; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 12
        for(int i = 5;i < 16; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 13
        for(int i = 5;i < 15001; i++ ){
            System.out.print(i+" ");
        }
        System.out.println();
        //ejercicio 14
        for(int i = 0;i < 200; i++ ){
            System.out.print("hola ");
        }
        System.out.println();
        //ejercicio 15
        for(int i = 1;i <= 30; i++ ){
            System.out.print(i*i+" ");
        }
    }
    public static void ejercicio16_18(){
        //ejercicio 16
        long x = 1;
        for(int i = 1;i <= 20; i++ ){
            x = x * i;
        }
        System.out.println(x);
        
        //ejercicio 17
        long y = 0;
        for(int i = 1;i <= 100; i++ ){
            y = y+(i*i);
        }
        System.out.println(y);
        
        //ejercicio 18
        Scanner s = new Scanner(System.in);
        System.out.print("Ingresa numero desde que se sumaran los siguientes 100 numeros: ");
        int w = s.nextInt();
        long z = w;
        for(int i = 1;i <= 100; i++ ){
            z += w+i;
        }
        System.out.println(z); 
    }
    
    public static void ejercicio19(){
        //ejercicio 19
        Scanner s = new Scanner(System.in);
        System.out.print("Cantidad de euros a cambiar: ");
        float euros = s.nextFloat();
        float dolares = euros * 1.10F;  
        System.out.println("tienes " + String.format("%.5f", dolares) + " dolares");  
    }
    public static void ejercicio20(){
        //ejercicio 20
        Scanner s = new Scanner(System.in);
        System.out.print("Ancho del rectangulo: ");
        float ancho = s.nextFloat();
        System.out.print("Alto del rectangulo: ");
        float alto = s.nextFloat();
        System.out.println("El area es: "+ (ancho*alto));
    }
    public static void ejercicio21(){
        //ejercicio 21
        Scanner s = new Scanner(System.in);
        System.out.print("Primer numero: ");
        float x = s.nextFloat();
        System.out.print("Segundo numero: ");
        float y = s.nextFloat();
        if (x > y){
            System.out.println(x + " Es mayor que " + y);
        } else if (y > x){
            System.out.println(y + " Es mayor que " + x);
        } else {
            System.out.println(x + " Es igual que " + y);
        }
    }
    public static void ejercicio22(){
        //ejercicio 22
        Scanner s = new Scanner(System.in);
        System.out.print("Numero: ");
        int x = s.nextInt();
        if ((0 == x%2) || (x > 0)){
            x -= 1;
            System.out.print(x + " ");
        }
        while (x > 0){
            x -= 2;
            System.out.print(x + " ");
        }
    }
    public static void ejercicio23(){
        //ejercicio 23
        Scanner s = new Scanner(System.in);
        System.out.print("Primer numero: ");
        int x = s.nextInt();
        System.out.print("Segundo numero: ");
        int y = s.nextInt();
        while (x != 0){
            int d = x;
            x = y%x;
            y = d;
        }
        System.out.println(y);
    }
    public static void ejercicio24(){
        //ejercicio 24
        Scanner s = new Scanner(System.in);
        System.out.print("Coeficiente a: ");
        int a = s.nextInt();
        System.out.print("Coeficiente b: ");
        int b = s.nextInt();
        System.out.print("Coeficiente c: ");
        int c = s.nextInt();
        double raiz = b * b - 4 * a * c;
        if (raiz >= 0){
            double x1 = (-b + Math.sqrt(raiz)) / (2 * a);
            double x2 = (-b + Math.sqrt(raiz)) / (2 * a);
            System.out.println("Las soluciones son: "+ x1 +" "+ x2);
        } else {
            System.out.println("La formula cuadratica no tiene solucion en los reales.");
        }
    }
    //Ejercicio 30
    public static void primos(){
        Scanner s = new Scanner(System.in);
        System.out.print("Rango en el cual se van a buscar primos: ");
        int x = s.nextInt();
        if (x <= 1){
            System.out.println("No hay numeros primos");
        } else {
            //System.out.print(2);
            for (int i = 3; i < x; i += 2){
                boolean primo = true;
                for (int j = 3;j < (i/2); j +=2 ){
                    if (i%j == 0){
                        primo = false;
                        break;
                    }
                }
                if (primo == true){
                    System.out.print(i + " ");
                }
            }
        }  
    }
    //Ejercicio 29
    public static void ejercicio29(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce datos (CTRL+D para terminar en Unix/Mac, CTRL+Z en Windows):");

        while (s.hasNextLine()) {
            String linea = s.nextLine();
            System.out.println("Leido: " + linea);
        }

        System.out.println("Fin del archivo alcanzado.");
    }
    //Ejercicio 28
    public static void menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("Pida su orden del menu");
        int opcion = s.nextInt();
        switch(opcion) {
            case 1:
                System.out.println("Hamburguesa sencilla");
                break;
            case 2:
                System.out.println("Hamburguesa en combo");
                break;
            case 3:
                System.out.println("Pizza");
                break;
        }
    }
    //Ejercicio 27
    public static void temperatura(){
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese temperatura en grados farenheit: ");
        float f = s.nextFloat();
        while (f != 999){
            float c = 5.0F / 9.0F * (f - 32F);
            System.out.println("La temperatura en grados celsius es: " + c + "Grados");
            System.out.print("Ingrese temperatura en grados farenheit: ");
            f = s.nextFloat();
        }
    }
    //Ejercicio 26
    public static void menor_mayor(){
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        int z = s.nextInt();
        
        int mayor = x;
        int menor = x;
        
        if (mayor < y){
            mayor = y;
        }
        if (mayor < z){
            mayor = z;
        }
        if (menor > y){
            menor = y;
        }
        if (menor > z){
            menor = z;
        }
        
        System.out.println("El mayor es: "+ mayor);
        System.out.println("El menor es: "+ menor);    
    }
    
    public static void ejercicio25(){
    //Ejercicio 25
        Scanner s = new Scanner(System.in);
        System.out.println("Numero a sacar el factorial: " ); 
        long x = s.nextLong();
        System.out.println(factorial(x));
        System.out.println("Primer numero para la funcion de ackermann: " ); 
        int m = s.nextInt();
        System.out.println("Segundo numero para la funcion de ackermann: " ); 
        int n = s.nextInt();
        System.out.println(ackermann(m, n));
    }
    public static long factorial(long x){   
        if (x == 0 || x == 1){
            return 1;
        }
        return x * factorial(x-1);
    }
    
    public static int ackermann(int m, int n) {
        if (m == 0) {
            return n+1;
        } else if (n == 0) { //ya sabemos que m no es 0 por el if por lo que no hace falta ponerlo como condicion
            return ackermann(m-1, 1);
        } else {
            return ackermann(m-1, ackermann(m, n-1));
        }
    }  
}