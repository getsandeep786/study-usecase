package interview;

public class ValidateIPAddress {

    public static boolean isValidIPv4(String ip) {
        if (ip == null || ip.isEmpty()) return false;
        String[] parts = ip.split("\\.");
        if (parts.length != 4) return false;
        for (String part : parts) {
            if (part.isEmpty() || part.length() > 3 || (part.length() > 1 && part.charAt(0) == '0')) {
                return false;
            }
            try {
                int num = Integer.parseInt(part);
                if (num < 0 || num > 255) return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "192.168.1.1";
        System.out.println("IP: " + ip);
        System.out.println("Is valid IPv4: " + isValidIPv4(ip));
        String invalidIp = "192.01.2.3";
        System.out.println("IP: " + invalidIp);
        System.out.println("Is valid IPv4: " + isValidIPv4(invalidIp));
    }
}
