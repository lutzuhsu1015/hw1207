import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        try {
            // 建立 URL 物件
            URL url = new URL("https://www.example.com");

            // 取得連線
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // 設定請求方法
            connection.setRequestMethod("GET");

            // 讀取輸入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;

            // 輸出網頁內容
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // 關閉資源
            reader.close();
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
