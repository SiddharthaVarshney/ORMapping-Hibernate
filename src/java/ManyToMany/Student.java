package ManyToMany;

import java.util.Set;

class Student{
    private int stdId;
    private String stdName;
    private int stdMarks;
    private Set<Course> courses;
    
    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public int getStdMarks() {
        return stdMarks;
    }

    public void setStdMarks(int stdMarks) {
        this.stdMarks = stdMarks;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
    
    
}