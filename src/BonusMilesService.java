public class BonusMilesService {
    public int calculate(int cost) {
        int priceStep = 20;
        return  cost / priceStep;
    }
}