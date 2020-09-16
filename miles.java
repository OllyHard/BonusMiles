package miles;

public class miles {
    public static void main(String[] args) {
        int spentRubles = 20;
        int accrualMiles = 1;
        int ticketPrice = 10_000;
        int bonusMiles = ticketPrice / spentRubles * accrualMiles;
        System.out.println(bonusMiles);
    }
}
