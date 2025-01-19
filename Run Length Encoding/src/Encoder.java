public class Encoder {
    public String encode(String input) {
        if (input == null || input.isEmpty()) {
            return "EMPTY";
        }

        StringBuilder res = new StringBuilder();
        int count = 1;

        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                res.append(count).append(input.charAt(i - 1));
                count = 1;
            }
        }

        res.append(count).append(input.charAt(input.length() - 1));

        return res.toString();
    }
}
