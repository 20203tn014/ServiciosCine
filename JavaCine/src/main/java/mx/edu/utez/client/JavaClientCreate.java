package mx.edu.utez.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaClientCreate {
    public static void main( String[] args )
            throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL( new URL( "http://localhost:1400" ) );

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig( config );
        Object[] params = { "Matrix", "Película de 2021", "Otra aventura fuera de esta realidad", 9, "11/25/2021", "11/25/2021", 1, 1 };
        boolean result = (boolean) client.execute( "Handler.createPelicula",  params);
        System.out.println( result );
    }
}