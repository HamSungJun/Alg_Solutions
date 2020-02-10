# BaekJoon - Level.10

## 에라토스테네스의 체 , 골드바흐의 추측

> 현재까지 문제를 풀면서 소수를 찾는 가장 효율적인 알고리즘은 에라토스테네스의 체를 만들어서 확인된 소수들을 통해 문제를 해결 하는 것으로 알고 있음.

```java

    import java.util.Arrays;
    
    public class Eratosthenes {
    
        public boolean[] che;
    
        public Eratosthenes(int cheLength) {
            this.che = new boolean[cheLength];
            Arrays.fill(this.che, true);
            this.che[0] = this.che[1] = false;
        }
    
        public void setChe() {
    
            for (int i = 2; i < Math.ceil(Math.sqrt(this.che.length)); i++) {
    
                if (this.che[i]) {
                    if (isPrime(i)) {
                        for (int j = (2 * i); j < this.che.length; j += i) {
                            this.che[j] = false;
                        }
                    }
                }
    
            }
    
        }
    
        public boolean isPrime(int num) {
    
            if (num == 0 || num == 1) {
                return false;
            }
            boolean result = true;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    result = false;
                    break;
                }
            }
            return result;
    
        }
    
        public int countBetween(int start) {
            int acc = 0;
            for (int i = start + 1; i <= 2 * start; i++) {
                if (this.che[i]) {
                    acc += 1;
                }
            }
            return acc;
        }
    
        public void printChe() {
            System.out.println(Arrays.toString(this.che));
        }
    
    }
    
    // 기존의 에라토스테네스의 체를 찾는 메소드를 중복해서 활용하므로 상속하여 이용함.

    public class Goldbach extends Eratosthenes {
    
        public Goldbach(int cheLength) {
            super(cheLength);
        }
    
        public int[] findPartition(int num) {
    
            int[] answer = new int[2];
    
            int left = num / 2;
            int right = num / 2;
    
            while (true) {
                if (this.che[left] && this.che[right]) {
                    answer[0] = left;
                    answer[1] = right;
                    break;
                }
                left--;
                right++;
            }
    
            return answer;
    
        }
    
    }

```

> 문제를 해결할 때, 예를 들면 다양한 케이스의 M ~ N 까지의 소수를 확인하는 경우가 있을 수 있다. 확인 할때마다 체를 만드는 것은 비 효율적이라고 판단하고
> 입력된 정수의 최대값으로 체를 구성한 후 나머지 테스트 케이스에서 전역으로 이용하였다.
