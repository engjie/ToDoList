package sg.edu.rp.c346.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvToDo;

    ArrayList<TodoItem> alToDoList;

    CustomAdapter caToDo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvToDo = findViewById(R.id.listViewToDo);


        alToDoList = new ArrayList<>();

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date1.set(2018,9,29);

        TodoItem item1 = new TodoItem("MSA",date1);
        TodoItem item2 = new TodoItem("Go for Haircut",date2);


        alToDoList.add(item1);
        alToDoList.add(item2);

        caToDo = new CustomAdapter(this, R.layout.todo_item,alToDoList);
        lvToDo.setAdapter(caToDo);


    }
}
