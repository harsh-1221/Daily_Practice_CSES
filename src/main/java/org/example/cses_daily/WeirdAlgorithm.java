package org.example.cses_daily;

public class WeirdAlgorithm {
        public int input;

        public void collazConjecture(long n) {
            while(n!=1)
            {
                if(n%2==0)
                {
                    System.out.println(n);
                    n = n/2; }
                else
                {
                    System.out.println(n);
                    n = (n*3)+1;
                }
            }
            System.out.println(n);
        }
}