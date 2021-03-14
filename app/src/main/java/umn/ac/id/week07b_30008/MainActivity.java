package umn.ac.id.week07b_30008;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvDaftarVideo;
    DaftarVideoAdapter mAdapter;
    LinkedList<SumberVideo> daftarVideo = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        isiDaftarVideo();
        rvDaftarVideo = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarVideoAdapter(this, daftarVideo);
        rvDaftarVideo.setAdapter(mAdapter);
        rvDaftarVideo.setLayoutManager(new LinearLayoutManager(this));
    }

    public void isiDaftarVideo(){
        daftarVideo.add(new SumberVideo("Mini Cooper Drag", "Drag Race Mini Cooper dengan Hpnda Civis hatchback", "android.resource://"+getPackageName()+"/"+R.raw.mini01));
        daftarVideo.add(new SumberVideo("Porcsche 918", "Menikmati mobil sport Porcsche 918 Spyder", "android.resource://"+getPackageName()+"/"+R.raw.porsche918));
        daftarVideo.add(new SumberVideo("Drift H2H", "Fast and the Furious", "android.resource://"+getPackageName()+"/"+R.raw.drift01));
        daftarVideo.add(new SumberVideo("Kejar-Kejaran", "Kejar-kejaran di jalanan hasil cuplikan dari film the Fast and The Furious", "android.resource://"+getPackageName()+"/"+R.raw.drift02));
        daftarVideo.add(new SumberVideo("Mini Cooper Drag Race", "Drag Race Mini Cooper dengan Ford Fiesta hatchback", "android.resource://"+getPackageName()+"/"+R.raw.mini02));
    }
}