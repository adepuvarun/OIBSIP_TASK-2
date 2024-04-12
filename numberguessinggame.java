import java.util.Scanner;
public class numberguessinggame {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        int trails=5;
        int i,guess;
        int num=1+(int)(100*Math.random());
        System.out.println("A number should be choose between 1 to 100 ");
        System.out.println("And the Number Should Guess With in the 5 trails");
        for(i=0;i<trails;i++)
        {
            System.out.println("guess the number:");
            guess=s.nextInt();
            if(num>guess)
            {
                System.out.println("the number is greater than "+guess);
            }
            else if(num<guess)
            {
                System.out.println("the number is less than "+guess);
            }
            if(num==guess)
            {
                System.out.println("You have guessed the correct number");
                break;
            }
        }
        if(i==trails)
        {
            System.out.println("you have Wiped out the trails:"+trails);
            System.out.println("the number is "+num);
        }
    }
}