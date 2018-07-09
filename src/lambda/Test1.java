package lambda;

public class Test1 {

    String[] players = {"Rafael Nadal", "Novak Djokovic",
            "Stanislas Wawrinka", "David Ferrer",
            "Roger Federer", "Andy Murray",
            "Tomas Berdych", "Juan Martin Del Potro",
            "Richard Gasquet", "John Isner"};

   public void SortPlayers(){
        L1 l1 = new L1();
        l1.SortStringList(players);
   }
}
