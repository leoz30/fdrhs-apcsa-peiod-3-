import javax.management.loading.PrivateMLet;

public class Scoreboard {
  private String t1;
  private String t2;
  private int s1;
  private int s2;
  private boolean turn;

  public Scoreboard(String t1, String t2){
    this.t1 = t1;
    this.t2 = t2;
    this.s1 = 0;
    this.s2 = 0;
    this.turn = true;


  }
  public void recordPlay(int points){
    if(points != 0){
      if(turn){
        s1 += points;
      }else{
        s2 += points;
      }
    }else{
      turn = ! turn;
    }
  }
  public String getScore(){
    String turn = t1;
    if( ! t1 ){
      turn = t2;
    }
    return s1 + "-" + s2 + "-" + turn;

  }
  
}
