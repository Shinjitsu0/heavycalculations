import java.io.*;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        Fibonacci fibonacci = new Fibonacci();
        ServerSocket serverSocket = new ServerSocket(24567);
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;

        while ((line = in.readLine()) != null) {
            if (line.equals("end")) {
                break;
            }
            long result = fibonacci.getFibonacciValue(Long.parseLong(line));
            out.printf("Вы ввели %s, n-ое число в ряде Фибоначчи %s\n", line, result);
        }
    }
}
