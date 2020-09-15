//clase SERVER 

import java.io.IOException;

import fi.iki.elonen.NanoHTTPD;
import fi.iki.elonen.NanoHTTPD.IHTTPSession;
import fi.iki.elonen.NanoHTTPD.Response;


public class Server_Estatico extends NanoHTTPD{
    public Server_Estatico() throws IOException{
        super(9000);
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
    }

    public static void main(String[] args) throws IOException{
        new Server_Estatico();
    }

    @Override
    public Response serve(IHTTPSession session){
        return newFixedLengthResponse("Hello world");
    }
}