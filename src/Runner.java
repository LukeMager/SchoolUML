public class Runner {

    public static void main(String args[]){
        School berkeleyHigh = new School("Berkeley High");
        Teacher weitz = new Teacher("Mr. Weitz", "Math");
        Teacher mb = new Teacher("Mr. Mulholland-Beahrs", "Biology");
        Teacher albinson = new Teacher("Mr. Albinson", "Computer Science");
        Section math = new Section("Math", weitz);
        Section biology = new Section("Biology", mb);
        Section compSci = new Section("Computer Science", albinson);
        Student me = new Student("Me", 12);
        Student friend1 = new Student("Friend1", 12);
        Student friend2 = new Student("Friend2", 12);
        Student friend3 = new Student("Friend3", 12);
        Student friend4 = new Student("Friend4", 12);
        Student friend5 = new Student("Friend5", 12);
        math.addStudents(me);
        math.addStudents(friend2);
        biology.addStudents(friend1);
        biology.addStudents(friend5);
        compSci.addStudents(friend3);
        compSci.addStudents(friend4);
        System.out.println(math.toString());
        System.out.println(biology.toString());
        System.out.println(compSci.toString());
    }

}