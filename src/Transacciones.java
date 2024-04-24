import java.util.Scanner;

public class Transacciones {
    public static void main(String[] args) {
        double saldoDeCuenta = 1599.99;
        short operacionBancaria = 0;
        boolean salirOperaciones = false;
        System.out.println("* * * * * * * * * * * * * * * * *\n");
        System.out.println("Nombre del Cliente: Tony Stark");
        System.out.println("Tipo de Cuenta: Cuenta Corriente");
        System.out.println("Saldo Disponible $" + saldoDeCuenta);
        System.out.println("* * * * * * * * * * * * * * * * *\n");
        while (salirOperaciones != true){

            System.out.println("* * Escriba el numero de la operacion deseada * *");
            System.out.println("""
                              1 - Consultar Saldo
                              2 - Retirar
                              3 - Depositar
                              4 - Salir
                               """);
            Scanner teclado = new Scanner(System.in);
            operacionBancaria = Short.parseShort(teclado.nextLine());


            switch (operacionBancaria) {
                case 1:
                    System.out.println("Su saldo es de $" + saldoDeCuenta);
                    break;
                case 2:
                    double saldoRetirar;
                    double resultadoSaldo;
                    System.out.println("Ingrese el monto de cuanto desea retirar");
                    saldoRetirar = Double.parseDouble(teclado.nextLine());
                    if (saldoRetirar > saldoDeCuenta) {
                        System.out.println("Fondos insufientes para retirar");
                    } else {
                        resultadoSaldo = saldoDeCuenta - saldoRetirar;
                        System.out.println("Usted ha retirado satisfactoriamente $" + saldoRetirar + " de su cuenta, dejando un saldo de $" + resultadoSaldo);
                        saldoDeCuenta = resultadoSaldo;
                        //System.out.println(saldoDeCuenta);
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el monto de cuanto desea depositar");
                    double saldoDepositar;
                    saldoDepositar = Double.parseDouble(teclado.nextLine());
                    saldoDeCuenta += saldoDepositar;
                    System.out.println("Usted ha depositado satisfactoriamente $" + saldoDepositar + " a su cuenta, dejando un saldo de $" + saldoDeCuenta);
                    //System.out.println(saldoDeCuenta);
                    break;
                case 4:
                    System.out.println("muchas gracias por usar nuestro servicio");
                    salirOperaciones = true;
                    break;
                default:
                    System.out.println("Opcion no valida");
            }





        }
    }
}
