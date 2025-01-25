public class Decoder {
    public String decode(String s){
        if(s.length() == 0) return "EMPTY";
        StringBuilder res = new StringBuilder();

        for(int i=0; i<s.length(); i++){;
            int count = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                count = count * 10 + (s.charAt(i) - '0');
                i++;
            }
            if (i < s.length()) {
                char c = s.charAt(i);
                res.append(String.valueOf(c).repeat(count));
            }
        }
        return res.toString();
    }
}
