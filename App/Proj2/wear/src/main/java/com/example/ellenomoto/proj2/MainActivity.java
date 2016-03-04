package com.example.ellenomoto.proj2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.StandardCharsets;

public class MainActivity extends Activity {
    // The following are used for the shake detection
    private SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private ShakeDetector mShakeDetector;
    private TextView mTextView;
    private ImageView sen1;
    private ImageView sen2;
    private ImageView house;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView peopleList = (ListView) findViewById(R.id.listView);
        int[] info = {R.string.senator1, R.string.senator2, R.string.house, R.string.results};
        int[] photos = {R.drawable.barbara_boxer, R.drawable.dianne_feinstein, R.drawable.nancy_pelosi, 0};

        final PeopleArrayAdapter adapter = new PeopleArrayAdapter(this, info, photos);
        peopleList.setAdapter(adapter);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        // ShakeDetector initialization
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        mAccelerometer = mSensorManager
                .getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        mShakeDetector = new ShakeDetector();
        mShakeDetector.setOnShakeListener(new ShakeDetector.OnShakeListener() {

            @Override
            public void onShake(int count) {
				/*
				 * The following method, "handleShakeEvent(count):" is a stub //
				 * method you would use to setup whatever you want done once the
				 * device has been shook.
				 */
                String value = new String("Location has been changed!");
                Context context = getApplicationContext();
                Toast.makeText(context, value, Toast.LENGTH_SHORT).show();
            }
        });
    }
}


