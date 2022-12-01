public class Main {

public static void main(String args[]) {

boolean check [] = new boolean[10001];

for(int i = 1;i<10001;i++) {

if(getDn(i)<10001)
check[getDn(i)]=true;
}



for(int i = 1;i<10001;i++)
if(check[i]==false)
System.out.println(i);

}


private static int getDn(int n) {

int Dn = n;
while(n>0) {
Dn = Dn + (n%10);
n = n/10;
}

return Dn; }}