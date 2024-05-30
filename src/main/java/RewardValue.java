public class RewardValue {
    double cash;
    int miles;
    public RewardValue(double c) {
        cash = c;
        miles = (int)(c / 0.0035);
    }
    public RewardValue(int m){
        miles = m;
        cash = m * 0.0035;
    }
    public double getCashValue(){
        return cash;
    }
    public int getMilesValue(){
        return miles;
    }


}
