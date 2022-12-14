# [Bronze III] 알람 시계 - 2884 

[문제 링크](https://www.acmicpc.net/problem/2884) 

### 성능 요약

메모리: 18548 KB, 시간: 232 ms

### 분류

사칙연산(arithmetic), 수학(math)

### 문제 설명

<p>상근이는 매일 아침 알람을 듣고 일어난다. 알람을 듣고 바로 일어나면 다행이겠지만, 항상 조금만 더 자려는 마음 때문에 매일 학교를 지각하고 있다.</p>

<p>상근이는 모든 방법을 동원해보았지만, 조금만 더 자려는 마음은 그 어떤 것도 없앨 수가 없었다.</p>

<p>이런 상근이를 불쌍하게 보던, 창영이는 자신이 사용하는 방법을 추천해 주었다.</p>

<p>바로 "45분 일찍 알람 설정하기"이다.</p>

<p>이 방법은 단순하다. 원래 설정되어 있는 알람을 45분 앞서는 시간으로 바꾸는 것이다. 어차피 알람 소리를 들으면, 알람을 끄고 조금 더 잘 것이기 때문이다. 이 방법을 사용하면, 매일 아침 더 잤다는 기분을 느낄 수 있고, 학교도 지각하지 않게 된다.</p>

<p>현재 상근이가 설정한 알람 시각이 주어졌을 때, 창영이의 방법을 사용한다면, 이를 언제로 고쳐야 하는지 구하는 프로그램을 작성하시오.</p>

### 입력 

 <p>첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.</p>

<p>입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.</p>

### 출력 

 <p>첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)</p>

<br/><br/>

**★ 수경 MEMO ★**<br/>

먼저 문제는 24시간 표현을 사용하는 시간에서 입력받은 시간보다 45분 빠른 시간을 출력해내는 문제였다.
가장 먼저 생각한 부분은 입력한 분(M)에서 -45분을 했을 때, 결괏값 M이 음수가 된다면 +60을 해줘야 하는 것과
시간(H)에서 -1을 해줘야 한다는 것이었다. 결국 M-45가 음수일 경우엔 M에 +15를 해준 값이 결괏값이 되는 결론이 나와서

// M-45가 음수일 경우<br/>
if((M-45) <0) {<br/>
  // M값은 (M-45)+60 이므로 결국 M+15와 같다.<br/>
  M = (M+15);<br/>
}

라는 if 문 하나가 완성됐고, 여기서 M-45가 음수일 경우엔 시간(H)에서 -1을 해줘야 하고, <br/>
H가 00시일 경우엔 H-1의 값이 음수가 아닌 23시가 되어야 하므로 ( 24시 = 00시 )

if((M-45) <0) {<br/>
  M = (M+15);<br/>
  // H값에서 -1을 할 때 음수일 경우,<br/>
  if((H-1) <0){<br/>
   // H값은 23이되고,<br/>
   H = 23;<br/>
  } else {<br/>
    // 음수가 아닌 경우엔 H-1을 한다.<br/>
    H = H-1;<br/>
    }<br/>
} 

이라는 if 문 하나가 더 완성되었다.<br/>
마지막으로 이 모든 조건에 해당하지 않는 M-45가 0 혹은 양수가 나오는 경우엔 <br/>
그대로 M-45가 최종 시간이므로

if((M-45) <0) {<br/>
  M = (M+15);<br/>
  if((H-1) <0){<br/>
   H = 23;<br/>
  } else {<br/>
    H = H-1;<br/>
    }<br/>
 // M-45가 음수가 아니고 ((M-45)=>0), 따라서 H값에 변동이 필요 없을때,<br/>
}else {<br/>
 M = M-45;<br/>
}

이런 if 문 수식이 만들어진다.
