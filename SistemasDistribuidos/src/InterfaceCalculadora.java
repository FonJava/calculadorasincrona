import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCalculadora extends Remote {
    double soma(double a, double b) throws RemoteException;
    double subtracao(double a, double b) throws RemoteException;
    double multiplicacao(double a, double b) throws RemoteException;
    double divisao(double a, double b) throws RemoteException;
    double logaritmoNatural(double a) throws RemoteException;
    double logaritmoBase10(double a) throws RemoteException;
    double exponenciacao(double base, double expoente) throws RemoteException;
    double seno(double a) throws RemoteException;
    double cosseno(double a) throws RemoteException;
    double raizQuadrada(double a) throws RemoteException;
}
