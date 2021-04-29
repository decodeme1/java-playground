public class fibonacci {
    public static void main(String[] args) {
        int count = 1;
        long[] numberList = new long[500];
        numberList[0] = 0;
        while (count<50) {
            if (count==1) {
                numberList[1] = 1;
                System.out.println(numberList[count]);
            } else if (count==2) {
                numberList[count] = numberList[count] + numberList[count-1];
                System.out.println(numberList[count]);
            } else {
                numberList[count] = numberList[count-1] + numberList[count-2];
                System.out.println(numberList[count]);
            }
            count++;
        }
    }
}
