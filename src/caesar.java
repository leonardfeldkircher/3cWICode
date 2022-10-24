public class caesar {
    private static final int KEY = 2;

        public static void main(String[] args) {
            String result = crypto("Hallo", true);
            System.out.println("Verschlüsselung: " + result);
            result = crypto(result, false);
            System.out.println("Entschlüsselung: " + result);
        }

        public static String crypto(String stringToEncrypt, boolean encrypt) {
            char[] chars = stringToEncrypt.toCharArray();
            StringBuilder result = new StringBuilder();
            for (char aChar : chars) {
                int letterCode = encrypt ? aChar + KEY : aChar - KEY;
                result.append(Character.toString(letterCode));
            }
            return result.toString();
        }
}
