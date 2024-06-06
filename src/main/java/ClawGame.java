public class ClawGame extends ArcadeGame
{
   // private int
   private int inventoryCost;
   private double cost;
    private int profit;
    private int profitAvg;

   public ClawGame(String name, int addictiveGameplay, int difficultyLevel, int inventoryCost, boolean breaksDownOften)
   {
      super(name, addictiveGameplay, difficultyLevel, breaksDownOften);
      this.inventoryCost = inventoryCost;
      cost = 5000.0; 
      profit =0;
      profitAvg = 0;
       
   }

    public int getDayProfits(int busyLevel)
    {
        if (busyLevel == 3)
        {
            profit += (Math.random()*3000) * 5;
        }
        if(busyLevel == 2)
        {
            profit += (Math.random()*2000) * 5;
        }
        else
        {
            profit += (Math.random()*1000) * 5;
        }
        return profit-inventoryCost;
    }


}
