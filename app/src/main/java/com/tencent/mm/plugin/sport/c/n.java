package com.tencent.mm.plugin.sport.c;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.base.o;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;

public final class n
{
  public static o opq;
  
  public static boolean E(long paramLong1, long paramLong2)
  {
    l2 = 3600000L;
    try
    {
      JSONObject localJSONObject = g.bFJ().optJSONObject("stepCountUploadConfig");
      l1 = l2;
      if (localJSONObject != null)
      {
        int i = localJSONObject.optInt("backgroundTimeInterval", 60);
        l1 = i * 60 * 1000L;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        long l1 = l2;
      }
    }
    return paramLong2 - paramLong1 >= l1;
  }
  
  public static boolean F(long paramLong1, long paramLong2)
  {
    j = 500;
    if ((paramLong1 == 0L) && (paramLong2 > 0L)) {
      return true;
    }
    try
    {
      JSONObject localJSONObject = g.bFJ().optJSONObject("stepCountUploadConfig");
      i = j;
      if (localJSONObject != null) {
        i = localJSONObject.optInt("backgroundStepCountInterval", 500);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        int i = j;
      }
    }
    return paramLong2 - paramLong1 >= i;
  }
  
  public static boolean bFQ()
  {
    boolean bool = true;
    if (g.bFJ().optInt("extStepApiSwitch") != 1)
    {
      x.i("MicroMsg.Sport.SportUtil", "Not Support extStepApiSwitch is off");
      bool = false;
    }
    return bool;
  }
  
  public static boolean bFv()
  {
    ab localab = ((i)com.tencent.mm.kernel.g.l(i.class)).FR().Yg("gh_43f2581f6fd6");
    if (localab != null) {}
    for (boolean bool = a.gd(localab.field_type);; bool = false)
    {
      if (!bool) {
        x.i("MicroMsg.Sport.SportUtil", "checkUserInstallWeSportPlugin %b", new Object[] { Boolean.valueOf(bool) });
      }
      return bool;
    }
  }
  
  public static final String bx(long paramLong)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(paramLong));
  }
  
  public static boolean ei(Context paramContext)
  {
    if (d.fS(19))
    {
      x.i("MicroMsg.Sport.SportUtil", "Not Support SDK VERSION");
      return false;
    }
    if (!paramContext.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter"))
    {
      x.i("MicroMsg.Sport.SportUtil", "Not Support FEATURE_SENSOR_STEP_COUNTER");
      return false;
    }
    if (((SensorManager)paramContext.getSystemService("sensor")).getDefaultSensor(19) == null)
    {
      x.i("MicroMsg.Sport.SportUtil", "Not Support can not get sensor");
      return false;
    }
    if (g.bFJ().optInt("deviceStepSwitch") != 1)
    {
      x.i("MicroMsg.Sport.SportUtil", "Not Support deviceStepSwitch is off");
      return false;
    }
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/sport/c/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */