import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int result = is_chroati(bf.readLine());
        System.out.println(result);

    }

    private static int is_chroati(String readline){
        int count = 0;
        int len = readline.length();
        
        for(int i = 0; i+1 <= readline.length(); i++){
            char a = readline.charAt(i);
            if(i == readline.length() -1){
                count++;
                break;
            }

            char b = readline.charAt(i+1);

            if(a == 'c' && (b == '=' || b == '-')){
                count++;
                i++;
            }else if(a == 'd' ){
                if(b == '-'){
                    i++;
                }else if((b == 'z')){
                    if(i+2 >= len){
                        count++;
                        continue;
                    }else if(readline.charAt(i+2) == '='){
                        i+=2;
                    }
                }
                count++;
            }else if(a == 'l' && b == 'j'){
                count++;
                i++;
            }else if(a == 'n' && b == 'j'){
                count++;
                i++;
            }else if(a == 's' && b == '=' ){
                count++;
                i++;
            }else if(a == 'z' && b == '=' ){
                count++;
                i++;
            }else {
                count++;
            }
        }
        
        return count;

    }
}