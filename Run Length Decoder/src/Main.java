public class Main {
    public static void main(String[] args) {
        String input = "4a2b1c5d";
        String input1 = "1a";
        String input2 = "";
        String input3 = "10a1b15x";

        Decoder decoder = new Decoder();
        System.out.println(decoder.decode(input));
        System.out.println(decoder.decode(input1));
        System.out.println(decoder.decode(input2));
        System.out.println(decoder.decode(input3));
    }
}
