public class Section {

    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize;

    public Section(String name, Teacher teacher){
        this.name = name;
        this.teacher = teacher;
    }

    public Teacher getTeacher(){
        return this.teacher;
    }

    public void setTeacher(Teacher t){
        this.teacher = t;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void addStudents(Student s){
        this.students[currentSize] = s;
        currentSize++;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String toString(){
        String studentNames = "";
        for(int i = 0; i < currentSize; i++){
            studentNames += students[i].getName() + "; ";
        }
        return  this.teacher.getName() + " teaches " + this.name + " class to " + currentSize + " students: " + studentNames;
    }
}