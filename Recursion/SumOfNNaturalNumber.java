/**
 * SumOfNNaturalNumber
 */
public class SumOfNNaturalNumber {

    public static int sum(int n){
        if(n == 1)  return 1;
        return n + sum(n-1);
    }

    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}

/* 
10 + sum(9)
    +  9 + sum(8)
        +   8 + sum(7)
            +     7 + sum(6)
                +     6 + sum(5)
                    +     5 + sum(4)
                        +     4 + sum(3)
                            +     3 + sum(2)
                                +     2 + sum(1)
                                    +      1 
*/