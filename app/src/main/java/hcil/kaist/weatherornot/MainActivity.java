package hcil.kaist.weatherornot;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private DayInfo currentDate;
    private RegionInfo currentRegion;

    private LinearLayout layout_currentWeather;
    private ImageView[] weather;
    private TextView date, region;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currentDate = new DayInfo();
        currentDate.update();

        currentRegion = new RegionInfo();
        currentRegion.update();

        layout_currentWeather = (LinearLayout)findViewById(R.id.layout_currentWeather);
        layout_currentWeather.setBackgroundResource(R.mipmap.ic_launcher);

        weather = new ImageView[8];
        weather[0] = (ImageView)findViewById(R.id.img_weather_nextday1);
        weather[1] = (ImageView)findViewById(R.id.img_weather_nextday2);
        weather[2] = (ImageView)findViewById(R.id.img_weather_nextday3);
        weather[3] = (ImageView)findViewById(R.id.img_weather_hour1);
        weather[4] = (ImageView)findViewById(R.id.img_weather_hour2);
        weather[5] = (ImageView)findViewById(R.id.img_weather_hour3);
        weather[6] = (ImageView)findViewById(R.id.img_weather_hour4);
        weather[7] = (ImageView)findViewById(R.id.img_weather_hour5);

        for(int i = 0 ; i < 8 ; i++){
            weather[i].setImageResource(R.mipmap.ic_launcher);
        }

        date = (TextView)findViewById(R.id.info_date);
        region = (TextView)findViewById(R.id.info_region);


        date.setText(currentDate.toString());
        date.setTextSize(20);

        region.setTextSize(40);
        region.setText(currentRegion.getCity());



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
