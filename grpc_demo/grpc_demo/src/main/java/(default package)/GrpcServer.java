import java.io.IOException;

public class GrpcServer {
    public static void main(String args[]) throws IOException, InterruptedException{
        Server server = ServerBuilder.forPort(9090).addService( new UserService()).build();
        server.start();
        System.out.println("Server started at " + server.getPort());
        server.awaitTermination();
    }
}
