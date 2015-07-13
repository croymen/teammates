package teammates.ui.template;

import java.util.List;

public class StudentCommentsForStudentsTable {
    private String giverEmail;
    private String giverName;
    private List<CommentRow> rows;
    
    public StudentCommentsForStudentsTable(String giverEmail, String giverName, List<CommentRow> rows) {
        this.giverEmail = giverEmail;
        this.giverName = giverName;
        this.rows = rows;
    }
    
    public String getGiverEmail() {
        return giverEmail;
    }
    
    public String getGiverName() {
        return giverName;
    }
    
    public List<CommentRow> getRows() {
        return rows;
    }
}
