package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.tencent.mm.sdk.platformtools.x;

public final class e
  implements r.a
{
  public static e qSs = null;
  public boolean hasInit = false;
  private float[] qSo = new float[3];
  int qSp = 55536;
  int qSq = 55536;
  private SensorManager qSr;
  private SensorEventListener qis;
  
  private void cfo()
  {
    x.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
    if ((this.qSr != null) && (this.qis != null))
    {
      x.d("MicroMsg.HeadingPitchSensorMgr", "releaseSensor");
      this.qSr.unregisterListener(this.qis);
      this.qSr = null;
      this.qis = null;
    }
    this.hasInit = false;
  }
  
  public final void bXa()
  {
    qSs = null;
    cfo();
  }
  
  public final void bXb()
  {
    cfo();
  }
  
  public final int cfn()
  {
    x.d("MicroMsg.HeadingPitchSensorMgr", "getHeading() " + this.qSp);
    return this.qSp;
  }
  
  public final void eZ(Context paramContext)
  {
    x.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() ");
    if (paramContext == null)
    {
      x.e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
      return;
    }
    if (this.qSr == null) {
      this.qSr = ((SensorManager)paramContext.getSystemService("sensor"));
    }
    if (this.qis == null) {
      this.qis = new e.1(this);
    }
    boolean bool = this.qSr.registerListener(this.qis, this.qSr.getDefaultSensor(3), 3);
    this.hasInit = true;
    x.d("MicroMsg.HeadingPitchSensorMgr", "initSensor() finish, %s", new Object[] { Boolean.valueOf(bool) });
  }
  
  public final void ez(Context paramContext)
  {
    eZ(paramContext);
  }
  
  public final String getName()
  {
    return "HeadingPitchSensorMgr";
  }
  
  public final int getPitch()
  {
    x.d("MicroMsg.HeadingPitchSensorMgr", "getPitch() " + this.qSq);
    return this.qSq;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/tools/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */