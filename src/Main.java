public class Main {
    /**
     * Check for vowels in comments**/
    public static String disemvowel(String comment) {
        return comment.replaceAll("[aeiou]", "");
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("THis site is bad!"));

    }
}
