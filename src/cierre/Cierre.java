
package cierre;

import java.util.Scanner;


public class Cierre {

    
    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta(700);
        Cuenta cuenta2 = new Cuenta(800);
        
        
        
   
    
    while (true){
    Scanner Data = new Scanner (System.in);
            System.out.println("Ingresa el numero de la opcion a tu convenencia:");
            System.out.println("1.Depositar");
            System.out.println("2.Debitar");
            System.out.println("3.Mostrar Saldo en cuenta 1");
             System.out.println("4.Mostrar Saldo en cuenta 2");
            System.out.println("5.Salir 0/");


          int menu =Data.nextInt();
          
          
          switch(menu) {
              //No se por que no funciona el If else :C
              // tampoco supe como sumarle el dep1 o dep2 a la cuenta1 o cuenta2 :C
              case 1 : 
                  
                  System.out.println("A que cuenta desea de positar a la 1 o la 2:");
                  int Deposito1 = Data.nextInt();
                  if (true)(Deposito1 == 1){ 
                   System.out.println("Cuanto dinero desea depositar:");
                  double dep1 = Data.nextInt();
                  System.out.println("");
                  
                  System.out.println("Usted deposito Q: " +dep1) ;
                          System.out.println(" Su nuevo saldo es Q: " + (dep1  + cuenta1.saldo));
                          System.out.println("--♥----♥----♥----♥----♥----♥--");
                  } else {
                          System.out.println("Cuanto dinero desea depositar:");
                  double dep2 = Data.nextInt();
                  System.out.println("");
                  
                  System.out.println("Usted deposito Q: " +dep2) ;
                          System.out.println(" Su nuevo saldo es Q: " + (dep2  + cuenta2.saldo));
                          System.out.println("--♥----♥----♥----♥----♥----♥--");
                  }
                  
                  
                 
                  break;
                  //debitar
                  //igual no se por que no funciona el if else :C
              case 2:
                   System.out.println("Cuanto dinero desea depositar:");
                  double with1 = Data.nextInt();
                  
                  
                  if (true) (with1>=cuenta1.saldo);{
                       System.out.println("Usted deposito Q: " + with1) ;
                  } else {
                          System.out.println("Fondos insuficientes:") ;
                  }
  
                          System.out.println("--♥----♥----♥----♥----♥----♥--");
                  break;
                          case 3:
                              System.out.println("El saldo de la primera cuenta es: Q" + cuenta1.mostrar());
                              
                              break;
                          case 4 :
                             System.out.println("El saldo de la segunda cuenta es: Q" + cuenta2.mostrar());
                              break;
                               case 5 :
                                   System.out.println("Gracias por usar el sistema de Banco de Luisito.com");
                              System.exit(0);
                              break;
              
          }


     }
}
    
}
