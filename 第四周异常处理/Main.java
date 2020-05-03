package 第四周异常处理;
import java.util.*;
public class Main {
  static int numbersOfPlayers = 4;
  static int numbersOfHandCard = 13;
  public static void main(String[] args) {
    String[] player = {"a","o","e","i"};
    String sentence = "的手牌是：";
    String[] huase = {"♥","♣","♦","♠"};
    String[] paiValue ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    List deak = new ArrayList();
    for(int i = 0;i < 4;i++){
      for(int j = 0; j < 13;j++)
      {
        deak.add(huase[i]+paiValue[j]);
      }
    }
    Collections.shuffle(deak);
    for(int i = 0;i < numbersOfPlayers;i++){
      System.out.print(player[i]+sentence);
      System.out.println(dealHand(deak, numbersOfHandCard));
    }
  }
  public static List dealHand(List Ls,int n){
    int sizePai = Ls.size();
    List handView = Ls.subList(sizePai - n, sizePai);
    List hand = new ArrayList(handView);
    handView.clear();
    return hand;
  }
}