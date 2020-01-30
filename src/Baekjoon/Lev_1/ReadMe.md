# BaekJoon - Level.1

## 입출력과 사칙연산

> 입력과 출력을 주로 `Scanner 클래스`와 `System.print()` 하곤 하는데 BufferedReader, BufferedWriter 클래스를 이용하는 습관을 갖도록 하자.

```java
    
    import java.io.BufferedReader;
    import java.io.BufferedWriter;
    import java.io.InputStreamReader;
    import java.io.OutputStreamWriter;    

    BufferedReader BUF_IN = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter BUF_OUT = new BufferedWriter(new OutputStreamWriter(System.out));

    /*
     * Your Code Here.   
     */  
    
    BUF_OUT.flush();
    BUF_OUT.close();
    BUF_IN.close();

```