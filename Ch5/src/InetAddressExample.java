import java.net.*;

public class InetAddressExample {
    public static void main(String[] args) {
        try {
            // 獲取本地主機的 InetAddress 物件
            InetAddress localhost = InetAddress.getLocalHost();
            System.out.println("Localhost: " + localhost.getHostAddress());

            // 獲取指定主機的 InetAddress 物件
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("Google IP: " + google.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
