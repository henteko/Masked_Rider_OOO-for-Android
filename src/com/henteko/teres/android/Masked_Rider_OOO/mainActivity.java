package com.henteko.teres.android.Masked_Rider_OOO;

import java.util.List;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

public class mainActivity extends Activity implements SensorEventListener {
	public SensorManager manager;
	public float lowPassX, lowPassY, lowPassZ;
	public float rawAx, rawAy, rawAz;
	public float k;
	public float N;
	public OOO_set ooo;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		lowPassX = 0.0f;
		lowPassY = 0.0f;
		lowPassZ = 0.0f;
		k = 0.1f;
		N = 30.0f;
		
		ooo = new OOO_set(this);
		
		manager = (SensorManager) getSystemService(SENSOR_SERVICE);
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		// Listener‚Ì“o˜^‰ğœ
		manager.unregisterListener(this);
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		ooo.Pause();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		// Listener‚Ì“o˜^
		List<Sensor> sensors = manager.getSensorList(Sensor.TYPE_ACCELEROMETER);
		if (sensors.size() > 0) {
			Sensor s = sensors.get(0);
			manager.registerListener(this, s, SensorManager.SENSOR_DELAY_UI);
		}
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub

		if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {

			lowPassX = event.values[0] * k + lowPassX * (1.0f - k);
			lowPassY = event.values[1] * k + lowPassY * (1.0f - k);
			lowPassZ = event.values[2] * k + lowPassZ * (1.0f - k);

			rawAx = event.values[0] - lowPassX;
			rawAy = event.values[1] - lowPassY;
			rawAz = event.values[2] - lowPassZ;
			
			float n = Math.abs(rawAx) + Math.abs(rawAy) + Math.abs(rawAz);
			if(n > N) {
				//‚±‚±‚Åƒƒ\ƒbƒhÀs
				ooo.on_henshin();
			}
		}
	}
}
