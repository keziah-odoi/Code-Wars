public class Main {

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] array = new char[]{'a', 'e', 'i', 'o', 'u'};
        if (str==null || str=="")
        {
            vowelsCount=0;
            return vowelsCount;
        }
        for (int i=0; i<str.length(); i++) {
            for (int k=0; k<array.length; k++) {
                if (Character.valueOf(str.charAt(i)) == array[k]) {
                    vowelsCount++;
                }
            }
        }
        System.out.println(vowelsCount);

        return vowelsCount;
    }
    public static void main(String[] args) {
        getCount("abracadabra");
    }
}

