import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) throws IOException {
        
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> inputList = new ArrayList<>();
        while (true) {
            final int input = Integer.parseInt(br.readLine());
            if (input == -1) {
                break;
            }
            inputList.add(input);
        }
        System.out.print(solution(inputList));
    }

    public static String solution(List<Integer> nums) {
        StringBuilder sb = new StringBuilder();

        nums.forEach(num->{
            sb.append(num);

            List<Integer> divisors = findDivisors(num);
            if (num == divisors.stream().mapToInt(i->i).sum()){
                sb.append(" = ");
                divisors.forEach(i->sb.append(i).append(" + "));
                sb.setLength(sb.length()-3);
            } else {
                sb.append(" is NOT perfect.");
            }
            sb.append("\n");
        });

        if (sb.length() > 0){
            sb.setLength(sb.length()-1);
        }
        return sb.toString();
    }

    private static List<Integer> findDivisors(Integer num) {
        return IntStream.range(1,num)
                .filter(i->num%i==0)
                .boxed()
                .collect(Collectors.toList());
    }
}