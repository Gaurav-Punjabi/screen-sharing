package BackEnd;

import java.net.InetAddress;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilities {
    public static boolean isValidIP(String IPAddress) {
        String IPPattern = "\\\\b(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\.(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\\\b";
        return IPAddress.matches(IPPattern);
    }
    public static boolean isValidIP(InetAddress IPAddress) {
        return isValidIP(IPAddress.getHostAddress());
    }
    public static String generatePassword() {
        byte[] bytes = new byte[8];
        for(int i=0;i<8;i++) {
            bytes[i] = (byte)((new Random().nextInt(255) + 48) % 123);
        }
        return new String(bytes);
    }
}
