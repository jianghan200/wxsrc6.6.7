package com.tencent.mm.plugin.scanner.util;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  implements SensorEventListener
{
  public static final m mNW = new m();
  public SensorManager bgR = (SensorManager)ad.getContext().getSystemService("sensor");
  public Sensor mNS = this.bgR.getDefaultSensor(1);
  public float[] mNT = new float[3];
  public int mNU;
  private long mNV;
  
  public final long btn()
  {
    if (this.mNU >= 5) {
      return this.mNV;
    }
    return 0L;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (paramSensorEvent.sensor.getType() == 1)
    {
      paramSensorEvent = paramSensorEvent.values;
      x.d("MicroMsg.ScanStableDetector", "x:%f,y:%f,z:%f", new Object[] { Float.valueOf(paramSensorEvent[0]), Float.valueOf(paramSensorEvent[1]), Float.valueOf(paramSensorEvent[2]) });
      if ((this.mNT[0] == 0.0F) && (this.mNT[1] == 0.0F) && (this.mNT[2] == 0.0F))
      {
        this.mNT[0] = paramSensorEvent[0];
        this.mNT[1] = paramSensorEvent[1];
        this.mNT[2] = paramSensorEvent[2];
      }
    }
    else
    {
      return;
    }
    if ((Math.abs(paramSensorEvent[0] - this.mNT[0]) > 0.7F) || (Math.abs(paramSensorEvent[1] - this.mNT[1]) > 0.7F) || (Math.abs(paramSensorEvent[2] - this.mNT[2]) > 0.7F))
    {
      x.d("MicroMsg.ScanStableDetector", "scan unstable");
      this.mNU = 0;
    }
    for (;;)
    {
      this.mNT[0] = paramSensorEvent[0];
      this.mNT[1] = paramSensorEvent[1];
      this.mNT[2] = paramSensorEvent[2];
      return;
      if (this.mNU == 0) {
        this.mNV = System.currentTimeMillis();
      }
      this.mNU += 1;
      if (this.mNU >= 5) {
        x.d("MicroMsg.ScanStableDetector", "scan stable");
      }
    }
  }
  
  public final void stop()
  {
    x.i("MicroMsg.ScanStableDetector", "stop detect scan stable");
    if (this.bgR != null)
    {
      x.i("MicroMsg.ScanStableDetector", "unregister accelerate listener");
      this.bgR.unregisterListener(this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/scanner/util/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */