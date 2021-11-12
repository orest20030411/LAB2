package task1;

public class Patient extends PersonPoliclinic {
      private int numberDoctors;
      static String Diagnosis;

      public Patient(final String name, final int numberDoctors) {
            super(name);
            this.numberDoctors = numberDoctors;
      }
      static{
            Diagnosis = "cancer";
      }

      public int getNumberDoctors() {
            return numberDoctors;
      }

      public void setNumberDoctors(final int numberDoctors) {
            this.numberDoctors = numberDoctors;
      }

      public static String getDiagnosis() {
            return Diagnosis;
      }

      public static void setDiagnosis(final String diagnosis) {
            Diagnosis = diagnosis;
      }
}

