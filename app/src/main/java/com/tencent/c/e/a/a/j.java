package com.tencent.c.e.a.a;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import java.util.Arrays;

public final class j
{
  public final long timestamp;
  public final float[] values;
  public final int vkh;
  
  public j(SensorEvent paramSensorEvent, long paramLong)
  {
    this.vkh = paramSensorEvent.sensor.getType();
    this.timestamp = paramLong;
    this.values = Arrays.copyOf(paramSensorEvent.values, paramSensorEvent.values.length);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/c/e/a/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */