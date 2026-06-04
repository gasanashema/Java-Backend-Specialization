import java.util.ArrayList;
import java.util.Scanner;

public class PromptNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to enter? \n");
        int num = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList();
        int max=0,n,avg,sum=0,even=0,odd=0,min=0;

        for(int i = 1; i<=num; i++){
            System.out.println("Enter number: "+i);
            n = sc.nextInt();
            //add to an array;
            arr.add(n);
            //find max
            if (i == 1){
                max = n;
            }else{
                if (max>n){
                    max = max +n;
                    n = max - n;
                    max = max - n;
                }
            }
            //find min
            if (i == 1){
                min = n;
            }else{
                if (min>n){
                    min = min +n;
                    n = min - n;
                    min = min - n;
                }
            }
            //find sum
            sum += n;

            //even and odd
            if(n%2==0){
                even+=1;
            }else{
                odd+=1;
            }
            //average
        }

        avg = sum/num;
        String output = String.format("Max: %d" +
                "Min: %d\n" +
                "Even Count: %d\n" +
                "Odd Count: %d\n" +
                "Average: %d\n" +
                "Sum: %d\n" +
                "Total Values: %d", max,min, even,odd, avg,sum,num);
        System.out.println(output);
        System.out.println("In reverse order: "+arr.reversed());
        String avg_decision = avg>50?"Yes":"No";
        System.out.println("Average above 50: "+ avg_decision);
    }
}
