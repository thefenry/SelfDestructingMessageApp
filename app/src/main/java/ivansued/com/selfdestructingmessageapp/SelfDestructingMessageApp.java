package ivansued.com.selfdestructingmessageapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by isued on 3/11/2015.
 */
public class SelfDestructingMessageApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        Parse.initialize(this, "cai5dWwOLNVQ6GsuKLcp8w67vbaJLQjTUkhhiptY", "pZ6WzeKiHJ2MJiPHjY5FuVpnC4ZskYrcYEo3dkz1");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
