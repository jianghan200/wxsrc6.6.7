package c.t.m.g;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

final class de
  implements SensorEventListener
{
  private static volatile de e;
  final SensorManager a;
  final boolean b;
  boolean c;
  double d;
  
  private de(Context paramContext)
  {
    this.a = ((SensorManager)paramContext.getSystemService("sensor"));
    if (this.a != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.b = bool;
      return;
    }
  }
  
  public static de a(Context paramContext)
  {
    if (e == null) {
      e = new de(paramContext);
    }
    return e;
  }
  
  public final double a()
  {
    if (this.c) {
      try
      {
        double d1 = this.d;
        return d1;
      }
      finally {}
    }
    return NaN.0D;
  }
  
  public final void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public final void onSensorChanged(SensorEvent paramSensorEvent)
  {
    try
    {
      if (paramSensorEvent.sensor.getType() == 11)
      {
        float[] arrayOfFloat1 = new float[16];
        float[] arrayOfFloat2 = new float[3];
        SensorManager.getRotationMatrixFromVector(arrayOfFloat1, paramSensorEvent.values);
        SensorManager.getOrientation(arrayOfFloat1, arrayOfFloat2);
        double d1 = arrayOfFloat2[0];
        d1 = d1 * 180.0D / 3.1415926D;
        try
        {
          this.d = d1;
          return;
        }
        finally {}
      }
      return;
    }
    catch (Throwable paramSensorEvent) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/c/t/m/g/de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */