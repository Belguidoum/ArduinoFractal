package helloworld;

import org.objectweb.fractal.fraclet.annotations.Attribute;
import org.objectweb.fractal.fraclet.annotations.Component;
import org.objectweb.fractal.fraclet.annotations.Interface;

@Component(provides = @Interface(name = "s", signature = Service.class))
public class ServerImpl implements ServerImplAttributes , Service {
    @Attribute(value = "->")
    private String header;
    
    public ServerImpl() {
        System.err.println("SERVER created");
    }
    
    public void print(final String msg) {
        System.out.println(((header) + msg));
    }
    
}

