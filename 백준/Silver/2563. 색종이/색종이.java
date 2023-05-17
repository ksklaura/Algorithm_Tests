import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        //가로 x 세로 = 100 x 100이므로 배열 크기를 100x100을 생성 
        int[][] intarr = new int[100][100];

        //리턴할 변수 선언 
        int answer =0;
        for (int i = 0; i < n; i++){
            //버퍼를 통해 x값과 y값 한번에 입력받고 x값과 y값을 나눈다. 
            String str = bufferedReader.readLine();
            String[] arr = str.split(" ");
            int x = Integer.parseInt(arr[0]), y = Integer.parseInt(arr[1]);

            //2차원 배열을 통해 x값 y값 넓이 범위에 있는 부분은 색칠한다고 생각하고
            //1로 채우면 되는데 1로 채우면서 answer 값을 증가시킨다. 

            //하지만, 이미 1인 경우는 색종이가 겹치는 부분이기 때문에 1인 경우는 answer값을 증가시키지 않는다. 
            for (int j = x; j < (x+10); j++){
                for (int z = y; z < (y+10); z++){
                    if (intarr[j][z] != 1){
                        intarr[j][z]++;
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);


    }
}