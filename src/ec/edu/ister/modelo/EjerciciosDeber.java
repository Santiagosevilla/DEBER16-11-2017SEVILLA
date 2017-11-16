package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class EjerciciosDeber {
    public static void ejercicio1(){
        JOptionPane.showMessageDialog(null,"Este es el ejercicio 1");
        //1
        for(int i=1;i<=100;i++){
            if(i%5==0 && i%25==0)
                System.out.println(i+",");
        }
        //2
        int i;
        for( i=1;i<=100;i++){
            if(i%75==0)
                System.out.println(i+",");
        }
        JOptionPane.showMessageDialog(null,"Los resultados no son iguales");
    }
    
    public static void ejercicio2(){
        JOptionPane.showMessageDialog(null,"Este es el ejercicio 2");
        int total=0;
        for(int i=0;i<=5;i++){
            total+=2;
        }
        JOptionPane.showMessageDialog(null,"La salida de este codigo es: "+total);
    }
    public static void ejercicio3(){
        JOptionPane.showMessageDialog(null,"Este es el ejercicio 3");
        int [] primes = {1,3,6};
        int sum=0;
        for(int t:primes){
            sum+=t; 
        }System.out.println(sum++);
    }
    
    public static void ejercicio4(){
       JOptionPane.showMessageDialog(null,"Este es el ejercicio 4");
        for(int i=1;i <6;i +=2){
            for(int j=0;j<3;j++){
                if(i+j>4)
                  break;
                System.out.println(i*j);
            }
        } 
    }
    
    public static void ejercicio5(){
        JOptionPane.showMessageDialog(null,"Este es el ejercicio 5");
        int x=0;
        do{
            System.out.print(x);
            x++;
            break;
        }
        while(x>0);          
        JOptionPane.showMessageDialog(null,"Es un ciclo infinito");
    }
    public static void ejercicio6(){
        JOptionPane.showMessageDialog(null,"Este es el ejercicio 6");
        int [] n={0,1,0,-1};
        for (int i=1;i<n.length;i++)
            if(n[i]==0&&n[i-1]!=0){
                int x=n[i-1];
                n[i-1]=n[i];
                n[i]=x;
            }
        JOptionPane.showMessageDialog(null,"El resultado es: "+n[2]);
    }
    
    public static void menu(){
       int op;
        do {   
            
            op=Integer.parseInt(JOptionPane.showInputDialog(""
                    + "1.- Ejercicio1\n"
                    + "2.- Ejercicio 2\n"
                    + "3.- Ejercicio 3\n"
                    + "4.- Ejercicio 4\n"
                    + "5.- Ejercicio 5\n"
                    + "6.- Ejercicio 6\n"
                    + "0.- Salir\ningrese opcion"));
            switch(op){
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                case 4:
                    ejercicio4();
                    break;
                case 5:
                    ejercicio5();
                    break;
                    case 6:
                    ejercicio6();
                    break;
            }
        } while (op!=0);
    }
}
