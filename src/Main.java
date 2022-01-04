import java.util.*;

public class Main {
    /**
     * split the elements and collect them into an array
     * loop through the array and set the highest and lowest**/
    public static String highLow(String numbers){
        List<Integer> parsedInts = new ArrayList<>();
        List<String> nums = Arrays.asList((numbers.split(" ")));
        for(String num:nums){
            parsedInts.add(Integer.parseInt(num));
        }

        Optional<Integer> maxNumber = parsedInts.stream()
                .max(Integer::compareTo);
        System.out.println(maxNumber.get());


        Integer max = parsedInts.stream().max(Comparator.comparing(Integer::valueOf)).get();
        Integer min = parsedInts.stream().min(Comparator.comparing(Integer::valueOf)).get();



        System.out.println(max);
        System.out.println(min);



        return max.toString() + " " + min.toString();
    }

    public static void main(String[] args) {
        highLow("1 2 3 4");
        highLow("-1 2 3 4 7 9 100 5 2 3 6 -19");


    }
}
