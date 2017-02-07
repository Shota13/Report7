
/**
 * Created by e165757 on 2017/01/20.
 */
public class Main {

    public static void main(String[] args){
        int place1,place2;
        int point1,point2;
        Player1 player1=new Player1(null,0,0,0);
        Player2 player2=new Player2(null,0,0,0);
        player1.setName();
        player2.setName();
        place1=player1.getPlace();
        place2=player2.getPlace();
        while (place1<25 || place2<25){
            if (place1<25) {
                player1.game();
                place1 = player1.getPlace();
                System.out.println("現在"+place1+"マス");
            }
            if(place2<25){
            player2.game();
                place2=player2.getPlace();
            System.out.println("現在"+place2+"マス");
            }
            point1=player1.getpoint();
            point2=player2.getpoint();
        }
        point1=player1.getpoint();
        point2=player2.getpoint();
        System.out.println("---------ランキング発表!!!---------");
        if(point1>point2){
            System.out.println("1st " +player1.getName()+"    "+player1.getpoint()+"point");
            System.out.println("2st " +player2.getName()+"    "+player2.getpoint()+"point");
        }

        else{
            System.out.println("1st　" +player2.getName()+"    "+player2.getpoint()+"point");
            System.out.println("2st　" +player1.getName()+"    "+player1.getpoint()+"point");

        }
    }
}
