public class Feeder{
  private int currentFood = 100;
  public void simulateOneDay(int numBirds){
    if(Math.random() < 0.95){
      int foodPerBird = (int) (Math.random() * 41) + 10;
       currentFood-=numBirds * foodPerBird;
      if(currentFood < 0){        
        currentFood = 0;
      }else{
        currentFood = 0;
      }
    }
  }
  public int simulateManyDays(int numBirds, int numDays){
    int daysLeft = numDays;
    int foundFood = 0;
    while(daysLeft > 0 && currentFood > 0){
      daysLeft--;
      foundFood++;
      simulateOneDay(numBirds);
    }
  return foundFood;
  }
}
