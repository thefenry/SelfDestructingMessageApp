package ivansued.com.selfdestructingmessageapp;

import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.Timer;
import java.util.TimerTask;


public class ViewImageActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_image);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Uri imageUri = getIntent().getData();
        //This line uses picasso to add image to image view.
        Picasso.with(this).load(imageUri.toString()).into(imageView);

        //Create a timer variable that will finish the activity by calling the anonymous class after
        //10 seconds
        Timer time = new Timer();
        time.schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
            }
        },10*1000);
    }
}
