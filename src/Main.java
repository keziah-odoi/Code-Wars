public class Main {
    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        System.out.println(jadenCase.toJadenCase("Hello this is a sentence"));
        System.out.println(jadenCase.toJadenCase(null));
        System.out.println(jadenCase.toJadenCase(""));

    }
}
