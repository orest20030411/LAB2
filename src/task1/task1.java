package task1;

public class task1 {
    public class Main {
        public static void main(final String[] args) {
            final Worker worker = new Worker("Сергій", 5);
            final Patient patient = new Patient("Orest", 100);
            System.out.println(worker.getName() + "   " + worker.getWorkExperince());
            System.out.println(patient.getName() + "  " + patient.getNumberDoctors());
        }
    }
}




