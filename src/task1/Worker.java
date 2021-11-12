package task1;

public class Worker extends PersonPoliclinic {
    private int workExperince;
    static int salary;

    public Worker(final String name, final int workExperince) {
        super(name);
        this.workExperince = workExperince;
    }

    public int getWorkExperince() {
        return workExperince;
    }

    public void setWorkExperince(final int workExperince) {
        this.workExperince = workExperince;
    }

    public static int getSalary() {
        return salary;
    }

    public static void setSalary(final int salary) {
        Worker.salary = salary;
    }
}
