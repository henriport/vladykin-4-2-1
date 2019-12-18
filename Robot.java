public class Robot {
    public static void main(String[] args) {
        RobotConnectionManager robotConnectionManager = new RobotConnectionManager() {
            @Override
            public RobotConnection getConnection() {
                return null;
            }
        };
        int x = 3;
        int y = 5;

        moveRobot(robotConnectionManager, x, y);
    }

    static void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {

    }
}