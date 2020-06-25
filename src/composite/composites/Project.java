package composite.composites;

import composite.component_interface.TodoList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project implements TodoList {
    // This class represents a composite (or a possible type of composite if we have many kinds)
    private final String title;
    private final List<TodoList> todos;

    public Project(String title, List<TodoList> todos){
        this.title = title;
        this.todos = todos;
//        this.todos = Collections.unmodifiableList(todos);
    }
    @Override
    public String getHtml() {
        StringBuilder html = new StringBuilder("<h1>");
        html.append(title);
        html.append("</h1><ul>");
        todos.forEach(todo -> {
            html.append("<li>");
            html.append(todo.getHtml());
            html.append("</li>");
        });
        html.append("</ul></h1>");
        return html.toString();
    }
}
