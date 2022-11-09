package exercise.streamexercise;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MatchStream {
    public static void main(String[] args) {
        List<String> oldList = List.of("1", "2", "3", "4");
        List<String> newList = List.of("3", "4", "5", "6");

        List<String> resultList1 = oldList.stream()
                .filter(old -> newList.stream().noneMatch(Predicate.isEqual(old)))
                .collect(Collectors.toList());

        System.out.println(resultList1);

        List<String> resultList2 = newList.stream()
                .filter(element -> oldList.stream().noneMatch(Predicate.isEqual(element)))
                .collect(Collectors.toList());

        System.out.println(resultList2);

        String expected = "123";
        String trueValue = "123";

        long count2 = trueValue.chars()
                .filter(x -> expected.chars().equals(x))
                .count();

        System.out.println(count2);

        long count = expected.chars()
                .filter(x -> x == '1')
                .count();

        System.out.println(count);
    }
}
