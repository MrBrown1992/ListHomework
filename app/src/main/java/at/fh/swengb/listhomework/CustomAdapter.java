package at.fh.swengb.listhomework;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import at.fh.swengb.listhomework.model.SSD;


/**
 * Created by Nikolaus Spieß on 16.11.16.
 */

public class CustomAdapter extends BaseAdapter {
    List<SSD> listSSD;
    Context context;
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, List<SSD> listSSD) {
        this.context = applicationContext;
        this.listSSD= listSSD;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return listSSD.size();
    }

    @Override
    public Object getItem(int i) {
        return listSSD.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null) {
            view = inflter.inflate(R.layout.row_item, null);//set layout for displaying items
        }
        TextView viewName=(TextView)view.findViewById(R.id.textViewListName);
        TextView viewSpeed=(TextView)view.findViewById(R.id.textViewListSpeed);
        TextView viewCapacity=(TextView)view.findViewById(R.id.textViewListCapacity);

        SSD ssd = listSSD.get(i);
        viewName.setText(ssd.getName());
        viewCapacity.setText(String.valueOf(ssd.getCapacity())+" Mbit/s");
        viewSpeed.setText(String.valueOf(ssd.getSpeed())+" GB");

        return view;




    }
}
