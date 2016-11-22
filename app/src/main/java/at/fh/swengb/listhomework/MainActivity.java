package at.fh.swengb.listhomework;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import at.fh.swengb.listhomework.model.SSD;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private List<SSD> listSSD;
    private ListView myListView;
    private CustomAdapter  myAdapter;
    private String url="http://cdn.softlayer.com/innerlayer/softlayerrackfront_s.gif";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myListView = (ListView) findViewById(R.id.mySSDList);


        listSSD = new ArrayList<>();
        listSSD.add(new SSD(3300,500,"OS",2.5,"NVME",true,url));
        listSSD.add(new SSD(3300,500,"Cache",2.5,"NVME",true,url));
        listSSD.add(new SSD(3300,500,"Cache",2.5,"NVME",true,url));
        listSSD.add(new SSD(500,4000,"DATA1",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"DATA2",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"DATA3",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"DATA4",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"BACKUP1",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"BACKUP2",2.5,"TLC",true,url));
        listSSD.add(new SSD(500,4000,"BACKUP3",2.5,"TLC",false,url));
        listSSD.add(new SSD(500,4000,"BACKUP4",2.5,"TLC",false,url));








        myAdapter = new CustomAdapter (this,listSSD);

        myListView.setAdapter(myAdapter);

        myListView.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        SSD selectedSSD = listSSD.get(i);
        Intent intent = new Intent(view.getContext(),ShowsSSD.class);
        intent.putExtra("SSD",selectedSSD);
        startActivity(intent);

    }
}
