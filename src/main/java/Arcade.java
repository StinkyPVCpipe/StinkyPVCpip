public class Arcade {
    private ArcadeGame[][] arcadeGrid;
    private double totalMoney=0;
    private int totalDays=0;

    public Arcade(int size, double money)
    {
        arcadeGrid = new ArcadeGame[size][size];
        totalMoney = money;
    }

    public double getMoney()
    {
       return totalMoney; 
    }

    public String RunDay()
    {
        int busy = (int)Math.random()*3;
        String output = "";
        for (int row = 0; row < arcadeGrid.length; row++)
            {
                for(int col =0; col < arcadeGrid[row].length; col++)
                    {
                        if(arcadeGrid[row][col] != null)
                        {
                            output += "The machine " + arcadeGrid[row][col].getName() + " made " + arcadeGrid[row][col].getDayProfits(busy) + " dollars! \n";
                        }
                    }
            }
        return output;
    }

    public void addGame(ArcadeGame newGame)
    {
        for(int row = 0; row < arcadeGrid.length; row++) {
            for (int col = 0; col < arcadeGrid[row].length; col++) {
                if (arcadeGrid[row][col] == null) {
                    arcadeGrid[row][col] = newGame;
                    return;
                }
            }
        }
    }
    public String printArcade()
    {
        String output = "";
        for(int row = 0; row<arcadeGrid.length; row++)
        {
            for(int col = 0; col<arcadeGrid[row].length; col++)
            {
                if(arcadeGrid[row][col] != null) {
                    output += ("[" + arcadeGrid[row][col].getName().substring(0, 4) + "] ");
                }
                else{
                    output += ("[____] ");
                }
            }
            output+= ("\n");
        }
        return output;
    }
}