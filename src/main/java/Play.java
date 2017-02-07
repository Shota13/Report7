
/**
 * Created by e165757 on 2017/01/20.
 */
import java.util.Scanner;
public class Play {
    private String name;
    private  int playerPoint;
    private  int place;
    private int saikoro;
    static int n=1;


    public Play(String name, int playerPoint, int place,int saikoro) {
        this.name = name;
        this.place = place;
        this.saikoro = saikoro;
        this.playerPoint=playerPoint;
    }
    public void setName() {
        System.out.println("playername"+n+"を入力してください");
        Scanner scan = new Scanner(System.in);
        name= scan.next();
    System.out.println(name+"さん優勝目指して頑張って下さい！");
        n+=1;
    }
    public int getPlace(){
        return place;
    }
    public String getName(){
        return name;
    }

    private Play(int playerPoint){
        this.playerPoint=playerPoint;
    }

    public  void setPlayerPoint(int playerPoint){
         this.playerPoint+=playerPoint;
    }
    public  static Play setPoint(int point){
        return new Play(point);
    }
    public int getpoint(){
        return playerPoint;
    }

    public void game(){
        System.out.println(name+"さんEnterキーを押してサイコロを振ろう！");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        saikoro=(int)(Math.random() * 6) + 1;
        System.out.println(saikoro);
        place +=saikoro;
        if(place>=25){
            place=25;
        }
        Map.mapPlace(place);
        if(place==10){
            place=0;
        }
    }
}