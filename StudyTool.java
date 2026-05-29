public abstract class StudyTool {
    protected String toolName;
    private String message;

    public StudyTool(String toolName){
        this.toolName = toolName;
    }
    public String getToolName() {
        return toolName;
    }
    public void setToolName(String toolName) {
        this.toolName = toolName;
    }
    public void startTool() {
        IO.println("Tool Started");
    }
    public void startTool(String toolName){
        IO.println(message);
    }
    public void dispalyinfo(){
        IO.println("Tool Started");
    }

    public abstract void starttool();

    public abstract void displayinfo();
}

