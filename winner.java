import java.util.Scanner;

public class winner {
//build by LK07
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double team1,draw,team2;
        int money,dteam1,ddraw,dteam2;

        System.out.println("How much money are you there");
        money=reader.nextInt();
        System.out.println("enter ratio team1");
        team1=reader.nextDouble();
        System.out.println("enter ratio draw");
        draw=reader.nextDouble();
        System.out.println("enter ratio team2");
        team2=reader.nextDouble();
        dteam1=money/3;
        dteam2=money/3;
        ddraw=money/3;

        System.out.println("team 1 value "+team1+"||"+"draw value "+draw+"||"+"team 2 value "+team2);
        System.out.println("___________________________________________________________________________");
        System.out.println("team 1 money "+dteam1+"||"+"draw money "+ddraw+"||"+"team 2 money "+dteam2);
        System.out.println("___________________________________________________________________________");
        System.out.println("team 1 ratio is "+dteam1*team1+"||"+"draw ratio is "+ddraw*draw+"||"+"team 2 ratio is "+dteam2*team2);
        System.out.println("___________________________________________________________________________");

    }
}
