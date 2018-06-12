package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

public class SensorController
  extends BroadcastReceiver
  implements SensorEventListener
{
  private static float sIR = 4.2949673E9F;
  private static float sIT = 0.5F;
  public static boolean sJa = false;
  public static double sJb = -1.0D;
  private Context context;
  private SensorManager ejl;
  private float nCz = -1.0F;
  private float sIS;
  private a sIU;
  private Sensor sIV;
  private final boolean sIW;
  private boolean sIX = false;
  public boolean sIY = false;
  private float sIZ = -1.0F;
  
  public SensorController(Context paramContext)
  {
    if (paramContext == null)
    {
      this.sIW = false;
      return;
    }
    this.context = paramContext;
    this.ejl = ((SensorManager)paramContext.getSystemService("sensor"));
    this.sIV = this.ejl.getDefaultSensor(8);
    if (this.sIV != null) {
      this.nCz = Math.min(10.0F, this.sIV.getMaximumRange());
    }
    if (this.nCz < 0.0F)
    {
      x.e("MicroMsg.SensorController", "error, getMaximumRange return %s, set to 1", new Object[] { Float.valueOf(this.nCz) });
      this.nCz = 1.0F;
    }
    if (this.sIV != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.sIW = bool;
      this.sIS = (sIT + 1.0F);
      return;
    }
  }
  
  public final void a(a parama)
  {
    x.i("MicroMsg.SensorController", "sensor callback set, isRegistered:" + this.sIY + ", proximitySensor: " + this.sIV + ", maxValue: " + this.nCz);
    if (!this.sIY)
    {
      this.sIZ = -1.0F;
      IntentFilter localIntentFilter = new IntentFilter();
      localIntentFilter.addAction("android.intent.action.HEADSET_PLUG");
      this.context.registerReceiver(this, localIntentFilter);
      this.ejl.registerListener(this, this.sIV, 2);
      this.sIY = true;
    }
    this.sIU = parama;
  }
  
  public final void ciL()
  {
    x.i("MicroMsg.SensorController", "sensor callback removed");
    try
    {
      this.context.unregisterReceiver(this);
      this.ejl.unregisterListener(this, this.sIV);
      this.ejl.unregisterListener(this);
      this.sIY = false;
      this.sIU = null;
      this.sIZ = -1.0F;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.v("MicroMsg.SensorController", "sensor receiver has already unregistered");
      }
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {}
    int i;
    do
    {
      do
      {
        return;
        paramContext = paramIntent.getAction();
      } while ((paramContext == null) || (!paramContext.equals("android.intent.action.HEADSET_PLUG")));
      i = paramIntent.getIntExtra("state", 0);
      if (i == 1) {
        this.sIX = true;
      }
    } while (i != 0);
    this.sIX = false;
  }
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if ((paramSensorEvent == null) || (paramSensorEvent.sensor == null) || (this.sIV == null)) {}
    float f2;
    float f1;
    float f3;
    do
    {
      do
      {
        return;
      } while (this.sIX);
      f2 = paramSensorEvent.values[0];
      double d = 3.0D;
      x.i("MicroMsg.SensorController", "newValue: %s, maxValue: %s, divideRatio: %s, configNearFarDivideRatio: %s, lastValue: %s, maxRange: %s", new Object[] { Float.valueOf(f2), Float.valueOf(this.nCz), Double.valueOf(3.0D), Double.valueOf(sJb), Float.valueOf(this.sIZ), Float.valueOf(this.sIV.getMaximumRange()) });
      if (sJb > 0.0D) {
        d = sJb;
      }
      if ((sJb <= 0.0D) && (this.nCz >= 0.0F)) {
        break;
      }
      f1 = this.sIV.getMaximumRange();
      f3 = Math.max(0.1F, (float)(f1 / d));
      x.i("MicroMsg.SensorController", "onSensorChanged, near threshold: %s, max: %s", new Object[] { Float.valueOf(f3), Float.valueOf(f1) });
      switch (paramSensorEvent.sensor.getType())
      {
      default: 
        return;
      }
    } while ((this.sIU == null) || (f2 == this.sIZ));
    if (f2 < f3)
    {
      x.i("MicroMsg.SensorController", "sensor near-far event near false");
      this.sIU.dK(false);
    }
    for (;;)
    {
      this.sIZ = f2;
      return;
      f1 = this.nCz;
      break;
      x.i("MicroMsg.SensorController", "sensor near-far event far true");
      this.sIU.dK(true);
    }
  }
  
  public static abstract interface a
  {
    public abstract void dK(boolean paramBoolean);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/SensorController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */