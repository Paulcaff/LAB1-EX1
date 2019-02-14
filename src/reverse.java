public class reverse {

    public String reverse(String str) {

        String result = "";

        if (str.equals("")) {
            return "";
        }

        if (str.length() == 1) {
            return str;
        } else {
            if (str.length() > 0) {
                char ch = str.charAt(0);
                result = str.substring(1, str.length());
                return reverse(result) + ch;


            }

            return str;
        }
    }

}
