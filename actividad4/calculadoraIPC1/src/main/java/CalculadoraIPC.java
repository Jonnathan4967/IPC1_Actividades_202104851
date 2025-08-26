import java.util.Scanner;

public class CalculadoraIPC {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        while (!salir) {
            System.out.printf("""
                     **** calculadora ***
                    Operaciones:
                    1.    Suma
                    2.    Resta
                    3.    Multiplicacion
                    4.    Division
                    5.    Potencia
                    6.    Raiz
                    7.    Salir
                    porfavor ingrese el valor de una de las opciones a realizar en letras (uno, dos, etc."):\s""");
            var opciones = consola.nextLine();

            switch (opciones) {
                case "uno" -> {
                    System.out.print("porfavor ingrese el primer numero: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("porfavor ingrese el segundo numero: ");
                    var numero2 = Double.parseDouble(consola.nextLine());

                    var suma = numero1 + numero2;

                    System.out.printf("el resultado de la suma es %.2f%n%n", suma);
                }
                case "dos" -> {
                    System.out.print("porfavor ingrese el primer numero: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("porfavor ingrese el segundo numero: ");
                    var numero2 = Double.parseDouble(consola.nextLine());
                    var resta = numero1 - numero2;

                    System.out.printf("el resultado de la resta es %.2f%n%n", resta);
                }
                case "tres" -> {
                    System.out.print("porfavor ingrese el primer numero: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("porfavor ingrese el segundo numero: ");
                    var numero2 = Double.parseDouble(consola.nextLine());
                    var multiplicacion = numero1 * numero2;
                    System.out.printf("el resultado de la multiplicacion es %.2f%n%n", multiplicacion);
                }
                case "cuatro" -> {
                    System.out.print("porfavor ingrese el primer numero: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("porfavor ingrese el segundo numero: ");
                    var numero2 = Double.parseDouble(consola.nextLine());

                    if (numero2 == 0) {
                        System.out.println("error, no existe division entre 0%n%n");
                    } else {
                        var division = numero1 / numero2;
                        System.out.printf("el resultado de la division es %.2f%n%n", division);
                    }
                }
                case "cinco" -> {
                    System.out.print("porfavor ingrese el numero base: ");
                    var numero1 = Double.parseDouble(consola.nextLine());
                    System.out.print("porfavor ingrese la potencia: ");
                    var numero2 = Double.parseDouble(consola.nextLine());
                    var potencia = Math.pow(numero1, numero2);

                    System.out.printf("el resultado de la potencia es %.2f%n%n", potencia);
                }
                case "seis" -> {
                    System.out.print("porfavor ingrese el numero para evaluarla en raiz cuadrada: ");
                    var numero1 = Double.parseDouble(consola.nextLine());

                    if (numero1 < 0) {
                        System.out.println("error, no se puede calcular raiz cuadrada de numeros negativos%n%n");
                    } else {
                        var raiz = Math.sqrt(numero1);
                        System.out.printf("el resultado de la raiz cuadrada es %.2f%n%n", raiz);
                    }
                }
                case "siete" -> {
                    System.out.println("saliendo del sistema.............");
                    salir = true;
                }
                default -> System.out.println("error, seleccione una operacion existente%n%n");
            }
        }
    }
}