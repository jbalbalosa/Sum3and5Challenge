public class Main {
    public static void main(String[] args) {
        System.out.println("Sum 3 and 5 Challenge!");

        int sum = 0;
        int count = 0;
        for(int i = 30; i <70; i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum += i;
                count++;
                System.out.println( i + " number can be divided by 3 or 5");
            }
            if (count == 3){
                System.out.println("Sum of all numbers :" + sum);
                break;
            }
        }
    }
}
