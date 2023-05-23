import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        // 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        List<Integer> changes = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            changes.add(Integer.parseInt(br.readLine()));
        }
        // 출력
        System.out.print(solution(changes));

    }

    private static String solution(List<Integer> changes) {
        return changes.stream().map(s -> {
            final int a1 = s % 25;
            final int a2 = a1 % 10;
            final int a3 = a2 % 5;
            return new StringBuilder()
                    .append(s / 25).append(" ")
                    .append(a1 / 10).append(" ")
                    .append(a2 / 5).append(" ")
                    .append(a3);
        }).collect(Collectors.joining("\n"));
    }

}