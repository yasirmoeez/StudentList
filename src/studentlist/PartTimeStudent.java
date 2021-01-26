
package studentlist;

/**
 *
 * @author moeez 26Jan2021 @12:28
 */
public class PartTimeStudent extends Student{
    private int numCourses;

    //This is done
    public PartTimeStudent(int numCourses, String name) {
        super(name);
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
    
    
}
