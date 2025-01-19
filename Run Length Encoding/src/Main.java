public class Main {
    public static void main(String[] args) {
        String input1 = "aaaabbbcdddddda";
        String input2 = "aaaabbbcdddddd";
        String input3 = "";
        String input4 = "a";
        Encoder enc = new Encoder();

        String result1 = enc.encode(input1);
        System.out.println(result1);

        String result2 = enc.encode(input2);
        System.out.println(result2);

        String result3 = enc.encode(input3);
        System.out.println(result3);

        String result4 = enc.encode(input4);
        System.out.println(result4);
    }
}
