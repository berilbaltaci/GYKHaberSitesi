package com.example.gykhabersitesi;

        import android.content.Intent;
        import android.graphics.drawable.Drawable;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.webkit.WebView;
        import android.widget.AdapterView;
        import android.widget.ListView;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<HaberSitesi> haberSitesiList= new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=findViewById(R.id.Liste);

        haberSitesiList.add(new HaberSitesi(R.drawable.milliyet, "Milliyet","http://www.milliyet.com.tr/"));
        haberSitesiList.add(new HaberSitesi(R.drawable.hurriyet, "Hurriyet", "http://www.milliyet.com.tr/"));
        haberSitesiList.add(new HaberSitesi(R.drawable.milliyet, "Milliyet", "http://www.milliyet.com.tr/"));
        haberSitesiList.add(new HaberSitesi(R.drawable.milliyet, "Milliyet", "http://www.milliyet.com.tr/"));

        HaberSitesiAdapter hsAdapter=new HaberSitesiAdapter(haberSitesiList, this);
        listView.setAdapter(hsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(MainActivity.this, HaberSitesiActivity.class);
                intent.putExtra("link", haberSitesiList.get(position).getUrl());
                startActivity(intent);
            }
        });
    }
}
