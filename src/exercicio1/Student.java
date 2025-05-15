    package src.exercicio1;

    import java.util.ArrayList;

    public class Student {
        private String name;
        private String studentID;
        private ArrayList <Double> grades;

        public Student(String name, String studentID, double[] grades) {
            this.name = name;
            studentID = studentID;
            this.grades = new ArrayList<>();
        }

        public void registerGrades(double grade){
            if(grades.size() < 4){
                grades.add(grade);
            }else {
                System.out.println("Grade limit reached");
            }
        }

        public double getAverage(){
            double sum = 0;
            for(int i = 0; i < grades.size(); i++){
                sum += grades.get(i);

            }

            if(grades.size() == 0) return 0;

            return sum / grades.size();
        }

        public boolean isApproved(){

            if(getAverage() >= 7) return true;
            return false;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public ArrayList<Double> getGrades() {
            return grades;
        }

        public void setGrades(ArrayList<Double> grades) {
            this.grades = grades;
        }
    }
