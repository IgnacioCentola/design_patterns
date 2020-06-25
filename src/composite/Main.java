package composite;

import composite.component_interface.TodoList;
import composite.composites.Project;
import composite.leaves.Todo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        TodoList todoList1 = new Todo("Watch Tabula Rasa");

        printTodoList(todoList1);

        List<TodoList> subTodos = List.of(
                new Todo("Build database"),
                new Todo("Build backend"),
                new Todo("Build mobile app"));

        TodoList todoList2 = new Project("Build software", subTodos);

        printTodoList(todoList2);
    }
    static void printTodoList(TodoList todoList){
        System.out.println(todoList.getHtml());
    }
}
