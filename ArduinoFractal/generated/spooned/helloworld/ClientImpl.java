package helloworld;

import org.objectweb.fractal.fraclet.annotations.Component;
import org.objectweb.fractal.fraclet.annotations.Interface;
import org.objectweb.fractal.fraclet.annotations.Requires;

@Component(provides = @Interface(name = "r", signature = Runnable.class))
public class ClientImpl implements Runnable {
    public ClientImpl() {
        System.err.println("CLIENT created");
    }
    
    @Requires(name = "s")
    private Service service;
    
    public void run() {
        service.print("Hello World !");
    }
    
}

