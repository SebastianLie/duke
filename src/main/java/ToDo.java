public class ToDo extends Task {
    // task with nothing attached, so no frills, everything can be simply inherited
    public ToDo(String info, String type, String by) {
        /**
         *  overrides original constructor
         *  @params String info: task information
         * @params String type: type of task
         * @return none
         */
        super(info,"T","");
        if (!by.equals("")) {
            System.out.println("Please Use a deadline if you have a data to do this task by.");
        }
    }
}
