/**
 * Created by e165757 on 2017/01/20.
 */
import java.util.Scanner;
public class Map{//すごろくのマスのデータ
    static int point;
    static int num;
    static int n=0;
    public static void mapPlace(int place){
        switch (place){
            case 10:
                System.out.println("残念、、、スタートに戻って下さい");
                break;
            case 15:
                System.out.println("2回サイコロを転がしてゾロ目が出たら,,,なんと！200pointゲット!!");
                int num2;
                System.out.println("Enterキーを押してサイコロを振ろう！");
                Scanner scan2 = new Scanner(System.in);
                scan2.nextLine();
                num = (int)(Math.random() * 6) + 1;
                System.out.println(+num);
                System.out.println("Enterキーを押してサイコロを振ろう！");
                Scanner scan3 = new Scanner(System.in);
                scan3.nextLine();;
                num2 = (int)(Math.random() * 6) + 1;
                System.out.println(+num2);
                if(num==num2){
                    System.out.println("お見事!!!!200pointプレゼント!!!");
                }
                else{
                    System.out.println("残念...");
                }
                break;
            case 20:
                System.out.println("高級腕時計に一目惚れ！衝動買いをしてしまった..." );
                System.out.println("300 point支払った");
                break;
            case 25:
                if(n==0){
                    System.out.println("おめでとうございます！１番にゴールしました！");
                    System.out.println("お祝いに、200pointプレゼントします!");
                    n+=1;
                }
                else{
                    System.out.println("ゴールおめでとうございます！");
                    System.out.println("お祝いに、100pointプレゼントします!");
                }
                break;
                }
        }}

