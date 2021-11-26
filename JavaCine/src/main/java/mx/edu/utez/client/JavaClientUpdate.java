package mx.edu.utez.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaClientUpdate {
    public static void main( String[] args )
            throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL( new URL( "http://localhost:1400" ) );

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig( config );
        Object[] params = { "Thor 4", "Película de 2022", "Otra aventura fuera de este mundo", 10, "11/25/2021", "11/25/2021", 1, 2 };
        boolean result = (boolean) client.execute( "Handler.updatePelicula",  params);
        System.out.println( result );
    }
}