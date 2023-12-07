import java.io.*;
import java.net.*;

public class SocketExample {
    public static void main(String[] args) {
        try {
            // 連接到指定主機和埠號
            Socket socket = new Socket("www.example.com", 80);

            // 獲取輸出流
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(outputStream, true);

            // 發送資料
            writer.println("GET / HTTP/1.1");
            writer.println("Host: www.example.com");
            writer.println();

            // 獲取輸入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String line;

            // 讀取伺服器回應
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 關閉資源
            reader.close();
            writer.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
