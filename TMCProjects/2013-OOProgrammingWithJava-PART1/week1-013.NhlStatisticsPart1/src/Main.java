
import nhlstats.NHLStatistics;


public class Main {

    public static void main(String[] args) {

        System.out.println("Top ten by goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);

        System.out.println("Top twenty-five by penalty");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);

        System.out.println("Sidney Crosby stats");
        NHLStatistics.searchByPlayer("Sidney Crosby");

        System.out.println("Philadelphia Flyers stats");
        NHLStatistics.teamStatistics("PHI");

        System.out.println("Players of Anaheim Ducks by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
    }
}
