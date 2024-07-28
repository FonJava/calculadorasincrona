import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Cliente {
    public static void main(String[] args) {
        try {
            InterfaceCalculadora calc = (InterfaceCalculadora) Naming.lookup("rmi://localhost:5509/RMI-Calculadora");
            double resultado;

// Testando a soma
            resultado = calc.soma(177, 92);
            System.out.println("Resultado da soma: " + resultado);

// Testando a subtração
            resultado = calc.subtracao(149, 25);
            System.out.println("Resultado da subtração: " + resultado);

// Testando a multiplicação
            resultado = calc.multiplicacao(82, 3);
            System.out.println("Resultado da multiplicação: " + resultado);

// Testando a divisão
            resultado = calc.divisao(10, 5);
            System.out.println("Resultado da divisão: " + resultado);

// Testando o logaritmo natural
            resultado = calc.logaritmoNatural(24);
            System.out.println("Resultado do logaritmo natural: " + resultado);

// Testando o logaritmo na base 10
            resultado = calc.logaritmoBase10(24);
            System.out.println("Resultado do logaritmo na base 10: " + resultado);

// Testando a exponenciação
            resultado = calc.exponenciacao(2, 12);
            System.out.println("Resultado da exponenciação: " + resultado);

// Testando o seno
            resultado = calc.seno(30);
            System.out.println("Resultado do seno: " + resultado);

// Testando o cosseno
            resultado = calc.cosseno(60);
            System.out.println("Resultado do cosseno: " + resultado);

// Testando a raiz quadrada
            resultado = calc.raizQuadrada(81);
            System.out.println("Resultado da raiz quadrada: " + resultado);


        } catch (NotBoundException ex) {
            System.out.println(ex.getMessage());
        } catch (MalformedURLException ex) {
            System.out.println(ex.getMessage());
        } catch (RemoteException ex) {
            System.out.println(ex.getMessage());
        }

    }

}