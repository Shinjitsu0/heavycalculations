import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 24567);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()), true);
        Scanner scanner = new Scanner(System.in);
        String msg;

        while (true) {
            System.out.println("Расчет n-ого числа Фибоначчи, введите число, для завершения введите `end`");
            msg = scanner.nextLine();
            out.println(msg);
            if ("end".equals(msg)) {
                break;
            }
            System.out.println(in.readLine());
        }
    }
}