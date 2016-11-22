package at.fh.swengb.listhomework;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import at.fh.swengb.listhomework.model.SSD;


public class ShowsSSD extends AppCompatActivity {

    private SSD ssd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shows_ssd);


        Intent intent = getIntent();
        ssd = (SSD)intent.getExtras().get("SSD");

        TextView viewName = (TextView) findViewById(R.id.textViewName);
        TextView viewSpeed = (TextView) findViewById(R.id.textViewSpeed);
        TextView viewCapacity = (TextView) findViewById(R.id.textViewCapacity);
        TextView viewTechnology = (TextView) findViewById(R.id.textViewTechnology);

        viewName.setText("Device Name: "+ssd.getName());
        viewSpeed.setText("Speed: "+String.valueOf(ssd.getSpeed())+" Mbit/s");
        viewCapacity.setText("Capacity: "+String.valueOf(ssd.getCapacity())+" GB");
        viewTechnology.setText("Technology: "+ssd.getTechnology());
    }

    public void showServer(View view) {
        // Map point based on address
        Uri location = Uri.parse(ssd.getServerurl());
        Intent serverIntent = new Intent(Intent.ACTION_VIEW, location);

        startActivity(serverIntent);
    }



}
