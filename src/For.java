public class For {

    public static void main(String[] args) {

        int sum = 0;
        for (int a = 0; a<10 ; a++){
                    sum = sum +a;
        }


        System.out.println(sum);


       sum = 0;

        for(int b = 1; b<10; b++) {
            for (int c = 1; c<10; c++){
                sum = b*c;
                System.out.print(b + "*" + c +"="+ sum+", ");
            }
       System.out.println();
        }



    }
}
