package sathittham.sangthong.slims_master.fused_sensors;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class GyroscopeSensor implements SensorEventListener {
	
	private SensorManager mSensorManager;
	private Sensor mSensor;

	// Create a constant to convert nanoseconds to seconds.
	private static final float NS2S = 1.0f / 1000000000.0f;
	//private final float[] deltaRotationVector = new float[4]();
	private float timestamp;


	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
	}

}
