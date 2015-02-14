package host809.com.fishfeeder;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class TimeConfig extends ActionBarActivity {
    public void gotodate() {
        Intent myIntent = new Intent(TimeConfig.this, Date.class);
        //myIntent.putExtra("key", foodtimes); //Optional parameters
        TimeConfig.this.startActivity(myIntent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_config);
        Intent intent = getIntent();
        String value = intent.getStringExtra("key");
        final TextView foodtimes = (android.widget.TextView) findViewById(R.id.txt_foodtimesdata);
        foodtimes.setText("You can select "+value+" values!");

        final Button cancel = (Button) findViewById(R.id.btm_closetime);
        final Button next = (Button) findViewById(R.id.btm_next2);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotodate();
            }
        });



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_time_config, menu);
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
