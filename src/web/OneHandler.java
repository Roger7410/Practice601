package web;

/**
 * Created by JOKER on 3/24/15.
 */
import org.eclipse.jetty.server.Server;

public class OneHandler
{
    public static void main(String[] args) throws Exception
    {
        Server server = new Server(8080);
        server.setHandler(new HelloHandler());

        server.start();
        server.join();
    }
}
