package mx.edu.utez.client;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import java.net.MalformedURLException;
import java.net.URL;

public class JavaClientRead {
    public static void main( String[] args )
            throws MalformedURLException, XmlRpcException {
        XmlRpcClientConfigImpl config = new XmlRpcClientConfigImpl();
        config.setServerURL( new URL( "http://localhost:1400" ) );

        XmlRpcClient client = new XmlRpcClient();
        client.setConfig( config );
        Object[] params = { 2 };
        boolean result = (boolean) client.execute( "Handler.readPelicula",  params);
        System.out.println( result );
    }
}
