import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
public class CalculatorServer

{
CalculatorServer()
{ 
    
   try
{
Calculator c = new CalculatorImpl();
Naming.rebind("rmi://127.0.0.1:1099/CalculatorService", c);
}
catch (MalformedURLException | RemoteException e)
{
}
}
public static void main(String[] args)
{
    CalculatorServer calculatorServer = new CalculatorServer();
}

}