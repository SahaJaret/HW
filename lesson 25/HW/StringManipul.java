public class StringManipul {
    public static void main(String[] args) {
        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("Последний символ строки: " + lastChar);

        int javaIndex = str.indexOf("Java");
        System.out.println("Позиция подстроки 'Java': " + javaIndex);

        boolean containsJava = str.contains("Java");
        System.out.println("Содержит ли строка подстроку 'Java': " + containsJava);

        String replacedStr = str.replace('o', 'a');
        System.out.println("Строка после замены 'o' на 'a': " + replacedStr);

        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);

        String substringJava = str.substring(javaIndex, javaIndex + 4);
        System.out.println("Подстрока 'Java': " + substringJava);

        boolean endsWithExclamation = str.endsWith("!!!");
        System.out.println("Заканчивается ли строка '!!!': " + endsWithExclamation);

        boolean startsWithImProud = str.startsWith("I'm proud");
        System.out.println("Начинается ли строка 'I'm proud': " + startsWithImProud);
    }
}
