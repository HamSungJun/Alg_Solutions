# BaekJoon - Level.9

## String Tokenize

> `String.split()` 과 `StringTokenizer` 클래스를 사용상황에 맞게 사용하도록 하자.

- `String.split()`

    - 내부적으로 정규표현식을 이용하여 문자열을 구분한다.
    
- `StringTokenizer`

    - 단순 구분자를 통해 문자열을 구분한다.
    
> 결과적으로 문자열을 구분하는 상황에서 구분해야 하는 상황이 가변적인 경우 `Split()`을 이용하고 단순 구분 및 실행 속도를 요구한다면 `StringTokenizer` 클래스를 사용
>하는 것을 고려해 보아야 한다.

### Refercence

- [Split() , StringTokenizer 클래스 비교](https://sas-study.tistory.com/102)