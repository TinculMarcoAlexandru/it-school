package cursitschool5;

public class CamelToSnake {

        public static String convertToSnakeCase(String camelCase) {
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < camelCase.length(); i++) {
                char ch = camelCase.charAt(i);


                if (Character.isUpperCase(ch)) {
                    if (i != 0) {
                        result.append('_');
                    }
                    result.append(Character.toLowerCase(ch));
                } else {
                    result.append(ch);
                }
            }

            return result.toString();
        }

        public static void main(String[] args) {
            String camelCase = "thisIsCamelCase";
            String snakeCase = convertToSnakeCase(camelCase);
            System.out.println("CamelCase: " + camelCase);
            System.out.println("Snake_case: " + snakeCase);
        }
    }

