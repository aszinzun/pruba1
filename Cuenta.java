import java.util.Random;
import java.util.Scanner;
public class Cuenta {
    float saldo;
    String tipoCuenta;
    int NT;
    public Cuenta() {
        Scanner leer= new Scanner(System.in);
        System.out.println("dame el tipo de cuenta");
        tipoCuenta= leer.nextLine();
        System.out.println("dame el saldo");
        saldo= leer.nextInt();
        Random ran= new Random();
        NT= ran.nextInt(200);
    }
    public Cuenta(float saldo, String tipocuenta, int NT) {
        this.saldo = saldo;
        this.tipoCuenta = tipocuenta;
        this.NT = NT;
    }
    @Override
    public String toString() {
        return "Cuenta{" + "saldo=$" + saldo +
                ", tipo de Cuenta=" + tipoCuenta +
                ", Numero de Tarjeta=" + NT + '}';
    }
    public void consultar(){
        System.out.println("la cuenta tine un saldo de $"+ this.saldo);
        System.out.println(" es de tipo "+ tipoCuenta);
        System.out.println(" y numero de tarjeta igual a "+ NT);
    }
    public float depositar( float cant){
        saldo= saldo+cant;
        System.out.println("deposito efectuado........");
        return  saldo;
    }
    public float retirar(float cant){
        if(cant<=saldo){
            saldo=saldo-cant;
            System.out.println("retiro realizado");
        }else{
            System.out.println("saldo insuficiente");
            System.out.println("no se hizo el retiro");
        }
        return saldo;
    }
}