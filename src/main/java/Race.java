public class Race {
    String carLeaderName;
    double distanceOfLeader;

    public Race() {
        this.carLeaderName = "";
        this.distanceOfLeader = 0;
    }

    public void leaderCalculations(Car carObject){
        double distance = 24 * carObject.speed;
        if (distance>distanceOfLeader){
            carLeaderName = carObject.name;
        }
    }
}