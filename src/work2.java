class money{
    public static float display(int p, int r,int t, int n){
        return (p*((1+((r/100)/n))^(t*n)));

    }
class kk{
    public static void main(String args[]) {
        money mymoney=new money();
        float result=mymoney.display(500000,18,3,12);
        System.out.println("ANSWER IS: "+ result);
    }
}
}