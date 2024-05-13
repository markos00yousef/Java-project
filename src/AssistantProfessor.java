
public class AssistantProfessor extends Student {
    
    String field;
    String mainProfessor;

    AssistantProfessor(String name, int year, String college, String field, String mainProfessor) {
        super(name, year, college);
        this.field = field;
        this.mainProfessor = mainProfessor;
    }
    
}
