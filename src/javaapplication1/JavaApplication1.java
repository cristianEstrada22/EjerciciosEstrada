/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.Normalizer;
import java.util.Random;

/**
 *
 * @author Cristian
 */
public class JavaApplication1 {
    private static double IVA =1.21;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        /*
        //EJERCICIO3
           JOptionPane.showMessageDialog(null, "Ejercicio 3","Bienvenido al ",2);
        String nombre;
        nombre=(JOptionPane.showInputDialog("Cuál es su nombre?"));
        JOptionPane.showMessageDialog(null, nombre, "Bienvenido", 1 );
        // TODO code applicati
        on logic here
        //EJERCICIO 5
        JOptionPane.showMessageDialog(null, "Ejercicio 5","Bienvenido al ",2);
        double area;
        String radio;
        radio=(JOptionPane.showInputDialog("Cuál es el radio?"));
        double radio2 =Double.parseDouble(radio);
        area = Math.PI * Math.pow(radio2, 2);
        JOptionPane.showMessageDialog(null,area,"El area de dicho circulo es:",2);
        
        //EJERCICIO6
        JOptionPane.showMessageDialog(null, "Ejercicio 6","Bienvenido al ",2);
        float numDivisible;
        String numTeclado;
        numTeclado=JOptionPane.showInputDialog("Ingresa un numero al azar");
        numDivisible=Float.parseFloat(numTeclado);
        if((numDivisible % 2) == 0){
            JOptionPane.showMessageDialog(null, "El numero ingresado es divisible entre 2");
        } else{
            JOptionPane.showMessageDialog(null, "El numero ingresado NO es divisible entre 2");
        }
        
        //EJERCICIO 7
        JOptionPane.showMessageDialog(null, "Ejercicio 7","Bienvenido al ",2);
        char correspAscii;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int caracter= teclado.nextInt();
        correspAscii= (char)caracter;
        JOptionPane.showMessageDialog(null,correspAscii, " este valor en ASCII es:", 2);
        
        //EJERCICIO 8
        JOptionPane.showMessageDialog(null, "Ejercicio 8","Bienvenido al ",2);
        int correspAsci;
        System.out.println("Ingrese un caracter");
        char caract= teclado.next().charAt(0);
        correspAsci= (char)caract;
        JOptionPane.showMessageDialog(null,correspAsci, "el valor de dicho caracter en Ascii es:", 2);
       
        //EJERCICIO 9
        JOptionPane.showMessageDialog(null, "Ejercicio 9","Bienvenido al ",2);
        String precioString = JOptionPane.showInputDialog("ingrese el precio de un producto");
        double precio =Double.parseDouble(precioString);
        JOptionPane.showMessageDialog(null,precio*IVA, "el precio con el valor agregado es:", 2);
       
        
        
        System.out.println("\t\t\t\t\t\t\t\t\tEJERCICIO 10");
        int max=0;
        System.out.println("NUMEROS DEL 1 AL 100");
        do{
            //JOptionPane.showMessageDialog(null, max, "Numeros del 1 al 100", 1);
            System.out.printf("%d-",max);
            max++;
        }while (max<=100);
        
        System.out.println("\n\t\t\t\t\t\t\t\tEJERCICIO 11");
        System.out.println("NUMEROS DEL 1 AL 100");
        max=0;
        for(int i=0; i<=100;i++){
            //JOptionPane.showMessageDialog(null, max, "Numeros del 1 al 100", 1);
            System.out.printf("%d-",max);
            max++;
        }
        
        System.out.println("\n\t\t\t\t\t\t\t\tEJERCICIO 12");
        max=0;
        System.out.println("NUMEROS DEL 1 AL 100 divisibles entre 2 ");
        do{
            //JOptionPane.showMessageDialog(null, max, "Numeros del 1 al 100", 1);
            if ((max %2 )==0){
            System.out.printf("%d-",max);
        }
            max++;
        }while (max<=100);
    
        //EJERCICIO 13
        JOptionPane.showMessageDialog(null, "Ejercicio 13","Bienvenido al ",2);
        int maxVentas;
        float precio,total=0;
        String ventaString=JOptionPane.showInputDialog("Indique el maximo de ventas a introducir");
        String precioString;
        maxVentas = Integer.parseInt(ventaString);
        for(int i=1; i<=maxVentas;i++){
            precioString= JOptionPane.showInputDialog("Ingrese el valor de la venta");
            precio=Float.parseFloat(precioString);
            total+=precio;
        }
        JOptionPane.showMessageDialog(null, total,"La suma total de las ventas es ", 1);
        
        
        //EJERCICio 15
        JOptionPane.showMessageDialog(null, "Ejercicio 15","Bienvenido al ",2);
        int numIt=0;
        do{
        String numString= JOptionPane.showInputDialog("Ingrese un numero >= que 0");
        numIt= Integer.parseInt(numString);
        }while(numIt<0);
        JOptionPane.showMessageDialog(null,numIt,"Numero Mayor o igual que 0",0);
        
        //EJERCICIO 16
        JOptionPane.showMessageDialog(null, "Ejercicio 16","Bienvenido al ",2);
        int numIntentos=0;
        String contraseña="";
        contraseña =JOptionPane.showInputDialog("Ingrese una contraseña");
        String contraRepe= JOptionPane.showInputDialog("Ingrese su contraseña nuevamente");
        while( numIntentos<3){
            if(contraRepe.equals(contraseña)){
                JOptionPane.showMessageDialog(null, "Enhorabuena");
                numIntentos=3;
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
                contraRepe= JOptionPane.showInputDialog("Ingrese su contraseña nuevamente");
                numIntentos++;
            }
        
        //EJERCICIO 17
        JOptionPane.showMessageDialog(null, "Ejercicio 17","Bienvenido al ",2);
        String dia=JOptionPane.showInputDialog("Ingrese un dia de la semana");
        String diaNormalizado=Normalizer.normalize(dia, Normalizer.Form.NFD);
        String diaSinAcentos=diaNormalizado.replaceAll("[^\\p{ASCII}]", "");
        switch(diaSinAcentos.toLowerCase()){
            
            case "lunes":  JOptionPane.showMessageDialog(null, "Este es un dia laboral");
            break;
            case "martes" :  JOptionPane.showMessageDialog(null, "Este es un dia laboral");
            break;
            case "miercoles":  JOptionPane.showMessageDialog(null, "Este es un dia laboral");
            break;
            case "jueves":  JOptionPane.showMessageDialog(null, "Este es un dia laboral");
            break;
            case "viernes":  JOptionPane.showMessageDialog(null, "Este es un dia laboral");
            break;
            case "sabado":  JOptionPane.showMessageDialog(null, "Este no es un dia laboral");
            break;
            case "domingo":  JOptionPane.showMessageDialog(null, "Este no es un dia laboral");
            break;
            default : JOptionPane.showMessageDialog(null, "Este no es un dia de la semana");  
    }
        
        //EJERCICIO 18
        
        JOptionPane.showMessageDialog(null, "Ejercicio 18","Bienvenido al ",2);
        String num1Cadena=JOptionPane.showInputDialog("Ingrese limite inferior");
        int num1=Integer.parseInt(num1Cadena);
        String num2Cadena=JOptionPane.showInputDialog("Ingrese limite superior");
        int num2=Integer.parseInt(num2Cadena)+1;
        Random random= new Random();
        if (num1 > num2){
            JOptionPane.showMessageDialog(null, "el primer numero debe ser menor al segundo");
        }else
        for (int i=1;i<=10;i++){
            int aleat= num1 + random.nextInt(num2-num1);
            String iter = String.valueOf(i);
            JOptionPane.showMessageDialog(null,aleat,iter ,2);
        }
    
      //EJERCICIO 19  
        JOptionPane.showMessageDialog(null, "Ejercicio 19","Bienvenido al ",2);
        String numUserCad=JOptionPane.showInputDialog("Ingrese un numero");
        int numUsuario=Integer.parseInt(numUserCad);
        int cifras= cuentaCifras(numUsuario);
         JOptionPane.showMessageDialog(null, cifras,"CANTIDAD DE CIFRAS QUE TIENE: ",2);
 

      //EJERCICIO 20  
        JOptionPane.showMessageDialog(null, "Ejercicio 20","Bienvenido al ",2);
        String numDividirCad=JOptionPane.showInputDialog("Ingrese un numero");
        double numDividir = Double.parseDouble(numDividirCad);
        boolean bandera=false;
        if(numDividir <=1){JOptionPane.showMessageDialog(null, "Numero no primo");
        }else{
            for (int i=2;i<=Math.sqrt(numDividir);i++){
                if(numDividir%i==0){
                bandera = true;
            }
        }
        if (bandera == true){
            JOptionPane.showMessageDialog(null,"El número ingresado no es primo");
        }else 
            JOptionPane.showMessageDialog(null,"El número ingresado es primo");
        }
     */   
        //EJERCICIO 21  
        JOptionPane.showMessageDialog(null, "Ejercicio 21","Bienvenido al ",2);
         
        boolean bandera=false;
        for (int x=1;x<100;x++){
        if(x <=1){JOptionPane.showMessageDialog(null, "Numero no primo");
        }else{
            for (int i=2;i<=Math.sqrt(x);i++){
                if(x % i==0){
                bandera = true;
            }
        }
        if (bandera == true){
            JOptionPane.showMessageDialog(null,"El número ingresado no es primo");
        }else 
            JOptionPane.showMessageDialog(null,"El número ingresado es primo");
        }}
        //EJERCICIO 22  
        JOptionPane.showMessageDialog(null, "Ejercicio 22","Bienvenido al ",2);
        String frase="La lluvía en Sevilla es una maravilla";
        int cantidad=cuentaVocales(frase);
        JOptionPane.showMessageDialog(null, cantidad,"N° de vocales en la frase",2);
    
    }
    public static int cuentaCifras(int num){
        int contador=0;
        if(num ==0){
            contador=1;
        }else {
            for (int i= Math.abs(num);i>0;i/=10){
                contador++;
            }
        }
        return contador;
    }
    public static int cuentaVocales(String frase){
        int contador=0;
        String fraseNormalizada=Normalizer.normalize(frase, Normalizer.Form.NFD);
        String fraseSinAcentos=fraseNormalizada.replaceAll("[^\\p{ASCII}]", "");
        
        for(int i=0;i<frase.length();i++){
            switch (fraseSinAcentos.toLowerCase().charAt(i)){
                case 'a':contador ++;
                    break;
                case 'e':contador ++;
                    break;
                case 'i':contador ++;
                    break;    
                case 'o':contador ++;
                    break;
                case 'u':contador ++;
                    break;    
            }
        } 
        return contador;
    }
}
