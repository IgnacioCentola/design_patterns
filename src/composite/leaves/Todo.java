package composite.leaves;

import composite.component_interface.TodoList;

public class Todo implements TodoList {
    // This class represents a leaf (or a possible type of leaf if we have many kinds)
    private final String text;

    public Todo(String text){
        this.text = text;
    }
    @Override
    public String getHtml() {
        return text;
    }
}
