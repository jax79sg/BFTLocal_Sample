package dh.gov.sg.bftlocal_sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import sg.gov.dh.trackers.Event;
import sg.gov.dh.trackers.NavisensLocalTracker;
import sg.gov.dh.trackers.TrackerListener;
import sg.gov.dh.utils.Coords;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        NavisensLocalTracker tracker = new NavisensLocalTracker(this);
        tracker.setTrackerListener(new TrackerListener() {
            @Override
            public void onNewCoords(Coords coords) {
                Log.d("","Current human action: " + coords.getAction());
                Log.d("","Current X: " + coords.getX());
                Log.d("","Current Y: " + coords.getY());
                Log.d("","Current Altitude: " + coords.getAltitude());
                Log.d("","Current Bearing: " + coords.getBearing());
            }

            @Override
            public void onNewEvent(Event event) {

            }
        });
    }
}
