public class Teacher extends Person {

    private int sectionCount;
    private Section[] sections = new Section[10];
    private String subject;

    public Teacher(String name, String subject){
        super(name);
        this.subject = subject;
    }

    public String getSection(){
        return this.subject;
    }

    public void setSections(String n){
        this.subject = n;
    }

    public Section[] getSections() {
        return this.sections;
    }

    public void addSection(Section s){
        this.sections[sectionCount] = s;
        sectionCount++;
    }
}