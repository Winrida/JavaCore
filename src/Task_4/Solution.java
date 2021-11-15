package Task_4;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly canFly);
    }
}