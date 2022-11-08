# [Bronze V] A+B - 4 - 10951 

[문제 링크](https://www.acmicpc.net/problem/10951) 

### 성능 요약

메모리: 14224 KB, 시간: 128 ms

### 분류

구현(implementation), 사칙연산(arithmetic), 수학(math)

### 문제 설명

<p>두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.</p>

### 입력 

 <p>입력은 여러 개의 테스트 케이스로 이루어져 있다.</p>

<p>각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)</p>

### 출력 

 <p>각 테스트 케이스마다 A+B를 출력한다.</p>

<br/>
<br/>
★ 수경 MEMO ★ <br/><br/>

readLine() 을 통해 입력 받아 연산하는 방법 <br/>
readLine() 은 한 행을 전부 읽기 때문에 공백단위로 입력해 준 문자열을 공백단위로 분리해주어야 함.

문자열 분리 2가지 방법:

1. StringTokenizer 클래스를 이용하여 분리해주는 방법
2. split() 을 이용하는 방법

StringTokenizer 이 특정 상황이 아니면 성능 면에서 훨씬 우월함.<br/>
해당 문제에서도 StringTokenizer 을 썼으며, 출력에서는 StringBuilder 을 사용함.

참고로 반드시 자료형 타입을 잘 보아야 함.

st.nextToken() 은 문자열을 반환하니 Integer.parseInt()로 int 형으로 변환시켜줌.
