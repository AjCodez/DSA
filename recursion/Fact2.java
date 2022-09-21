class Fact2{
    static int fact(int c,int n)
    {
        if (n <= 1) 
            return c;
        else    
            c=c*n;
            return fact(c,n-1);    
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(fact(1,n));
    }
}