public class Q39DefangIPAddress {
    public static void main(String[] args) {
        String address = "192.168.0.1";
        String result = address.replace(".", "[.]");
        System.out.println(result);
    }
}
