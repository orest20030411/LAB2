package task3;

public class Rating {
    private int hundredPointSystem;
    private int fivePointSystem;


    public Rating(final int hundredPointSystem,final int fivePointSystem ) {
        this.hundredPointSystem = hundredPointSystem;
        this.fivePointSystem = fivePointSystem;

    }

    public Rating() {

    }


    public int getHundredPointSystem() {
        return hundredPointSystem;
    }

    public void setHundredPointSystem(int hundredPointSystem) {
        this.hundredPointSystem = hundredPointSystem;
    }

    public int getFivePointSystem() {
        return fivePointSystem;
    }

    public void setFivePointSystem(int fivePointSystem) {
        this.fivePointSystem = fivePointSystem;
    }



    @Override
    public String toString() {
        return " hundred point system = " + hundredPointSystem +
                ", five point system = " + fivePointSystem ;

    }
}
