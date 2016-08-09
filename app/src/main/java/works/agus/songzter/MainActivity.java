package works.agus.songzter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        final TextView listenNext = (TextView) findViewById(R.id.listen_next);

        listenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listenNextIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(listenNextIntent);

            }
        });

        ImageView playlist1 = (ImageView) findViewById(R.id.playList1);
        playlist1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent listenNextIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(listenNextIntent);
            }

        });

    }
}