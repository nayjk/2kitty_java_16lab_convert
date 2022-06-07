public class Main {
    static class Calculation{
        int result;
        int a,b;
        int c = 2;
        public Calculation(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public void getCalculate(){
            result = (int) Math.pow(b,c) * a;
        }
    }
    @FunctionalInterface
    interface Converter <T>{
        SecondCalculation convert(T first);
    }
    static class SecondCalculation{
        int result;
        int a,b;
        int c = 2;
        public SecondCalculation(int a, int b, int c){
            this.a = a;
            this.b = b;
            this.c = c;
        }
        public int getCalculate(){
            result = (int) Math.pow(b,c) * a;
            return result;
        }
    }
    public static void main(String[] args) {
        Calculation first = new Calculation(2,3,2);
        Converter <Calculation>  cOnvert = x -> new SecondCalculation(x.a,x.b,x.c);
        SecondCalculation second = cOnvert.convert(first);
        System.out.println(second.getCalculate());
    }
}