```

(a+b)%m = ((a%m) + (b%m))%m
(a*b)%m = ((a%m) * (b%m))%m


(a-b)%m = ((a%m) - (b%m))%m  : It will not give the correct ans in case for negative no. or a is less than b

-20 % 3 = 1  (-20 - (-21))
but in java we can do -20 % 3 = -2 : to overcome this add 3 (the no. dividing) to the remainder

(a-b)%m = ((a%m) - (b%m) + m)%m is the modified solution for the above problem

(a/b)%m = ((a%m) / (b%m))%m

b%m must not be equal to 0 
To over come this issue, we use Fermat's Theorem

```