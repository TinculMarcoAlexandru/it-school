package cursitschool5;

        public class RemoveVowels {
            public static void main(String[] args) {
                String input = "Hello World, I am Idiot!";
                System.out.println("Original String: " + input);

                String result = removeVowels(input);
                System.out.println("String without vowels: " + result);
            }

            public static  String removeVowels(String str) {
                String vowels = "AEIOUaeiou";
                StringBuilder sb = new StringBuilder();

                for (int i = 0; i < str.length(); i++) {
                    char ch = str.charAt(i);
                    if (vowels.indexOf(ch) == -1) {
                        sb.append(ch);
                    }
                }
                return sb.toString();
            }
        }






