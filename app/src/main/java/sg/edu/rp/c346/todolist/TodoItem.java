package sg.edu.rp.c346.todolist;

import java.util.Calendar;

/**
 * Created by 16019641 on 16/7/2018.
 */

public class TodoItem {

    private String Todo;
    private Calendar date;

    public TodoItem (String Todo, Calendar date){
        this.Todo = Todo;
        this.date = date;
    }
    public String getTodo(){
        return Todo;
    }
    public void setTodo(String Todo){
        this.Todo = Todo;
    }

    public Calendar getDate() {
        return date;
    }

    public String getDateString(){
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);

        return str ;
    }
    public void setDate(Calendar date){
        this.date = date;
    }



}









