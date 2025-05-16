package lk.clearview.main.model;

import java.net.InetAddress;

public class NetworkChecker {
    public static boolean isOnline() {
        try {
            // Try to reach a well-known host
            InetAddress address = InetAddress.getByName("8.8.8.8");
            return address.isReachable(3000); // timeout in milliseconds
        } catch (Exception e2) {
            return false;
        }
    }
}