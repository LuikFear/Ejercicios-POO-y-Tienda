
package cierre;


public class Cuenta {
    int saldo;

    public Cuenta(int saldo) {
        this.saldo = saldo;
    }
    
    
    
    
    
    
    
    public void dep (int saldo) {
    this.saldo += saldo;
   
    }
   
    
      public void with(int saldo) {
    this.saldo -= saldo;
   
    }
    
    public int mostrar(){
    return this.saldo;
        
    }
}
