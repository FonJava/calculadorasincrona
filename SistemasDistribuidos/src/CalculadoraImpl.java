import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.lang.Math;

public class CalculadoraImpl extends UnicastRemoteObject implements InterfaceCalculadora {
    public CalculadoraImpl() throws RemoteException {
        super();
    }

    public double soma(double a, double b) throws RemoteException {
        return a + b;
    }

    public double subtracao(double a, double b) throws RemoteException {
        return a - b;
    }

    public double multiplicacao(double a, double b) throws RemoteException {
        return a * b;
    }

    public double divisao(double a, double b) throws RemoteException {
        return a / b;
    }

    public double logaritmoNatural(double a) throws RemoteException {
        return Math.log(a);
    }

    public double logaritmoBase10(double a) throws RemoteException {
        return Math.log10(a);
    }

    public double exponenciacao(double base, double expoente) throws RemoteException {
        return Math.pow(base, expoente);
    }

    public double seno(double a) throws RemoteException {
        return Math.sin(a);
    }

    public double cosseno(double a) throws RemoteException {
        return Math.cos(a);
    }

    public double raizQuadrada(double a) throws RemoteException {
        return Math.sqrt(a);
    }
}
