package sg.edu.rp.c346.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 16019641 on 16/7/2018.
 */

public class CustomAdapter extends ArrayAdapter {


    Context parent_context;
    int layout_id;
    ArrayList<TodoItem>itemList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<TodoItem> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        itemList = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        LayoutInflater inflater =(LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id,parent,false);

        TextView tvMSA =rowView.findViewById(R.id.textViewTodo);
        TextView tvDate =rowView.findViewById(R.id.textViewDate);

        //return movieitem object
        TodoItem currentItem = itemList.get(position);


        //string value
        String Todo = currentItem.getTodo();
        String date = currentItem.getDateString();

        tvMSA.setText(Todo);
        tvDate.setText(date);


        return rowView;

    }
}
