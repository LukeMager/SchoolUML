public class Student extends Person {

    private int sectionCount;
    private Section[] sections = new Section[10];
    private int grade;

    public Student(String name, int grade){
        super(name);
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setGrade(int g){
        this.grade = g;
    }

    public Section[] getSections() {
        return this.sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }
}