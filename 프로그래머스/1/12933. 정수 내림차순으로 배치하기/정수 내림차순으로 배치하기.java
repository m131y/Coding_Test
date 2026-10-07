import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String sortedStr = Stream.of(String.valueOf(n).split(""))
                                 .sorted(Comparator.reverseOrder())
                                 .collect(Collectors.joining());
        
        return Long.parseLong(sortedStr);
        
    }
}