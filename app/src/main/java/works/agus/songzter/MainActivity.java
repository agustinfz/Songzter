package works.agus.songzter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        /**
         * Set an OnClickListener on the Your Music TextView to start the Your Music acitivity
         */
        TextView listenNext = (TextView) findViewById(R.id.listen_next);
        listenNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listenNextIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(listenNextIntent);
            }
        });

        /**
         * Set an OnClickListeners on the Playlist ImageViews to start the Now Playing acitivity
         * Q: How do I pass the value or ID for that playlist to the Now LIstening activity to play
         * the right
         */
        ImageView playlist1 = (ImageView) findViewById(R.id.playList1);
        playlist1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent listenNextIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(listenNextIntent);
            }

        });
        ImageView playlist2 = (ImageView) findViewById(R.id.playList2);
        playlist2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent listenNextIntent = new Intent(MainActivity.this, NowPlaying.class);
                startActivity(listenNextIntent);
            }
        });

        /**
         * Set an OnClickListener on the Your Music TextView to start the Your Music acitivity
         */
        TextView yourMusic = (TextView) findViewById(R.id.your_music);
        yourMusic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent yourMusicIntent = new Intent (MainActivity.this, YourMusic.class);
                startActivity(yourMusicIntent);
            }
        });

        /**
         * Set an OnClickListener on the discover TextView to start the discover acitivity
         */

        TextView discover = (TextView) findViewById(R.id.discover);
        discover.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent discover = new Intent(MainActivity.this, Discover.class);
                startActivity(discover);
            }
        });

        /**
         *  Set an OnKeyListener on the search box to go to the Search activity
         *  when ENTER key is pressed
         *  Q: How do I pass the contents of the edittext to a query? It's probably stored in the
         *  search object
         */
        EditText search = (EditText) findViewById(R.id.search);
        search.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey (View v, int keyCode, KeyEvent event) {
                if (event.getAction() == KeyEvent.ACTION_DOWN)
                {
                    switch(keyCode)
                   {
                        case KeyEvent.KEYCODE_ENTER:
                            Intent search = new Intent(MainActivity.this, SearchResults.class);
                            startActivity(search);
                           return true;
                       default:
                           break;
                    }
                }
                return false;

            }
        });
    }
}