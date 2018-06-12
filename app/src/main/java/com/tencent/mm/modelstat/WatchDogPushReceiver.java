package com.tencent.mm.modelstat;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.network.a.a.a;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.sdk.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.text.SimpleDateFormat;
import java.util.Date;
import junit.framework.Assert;

public class WatchDogPushReceiver
  extends BroadcastReceiver
{
  private static String className = "";
  
  public static void Sk()
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
    localIntent.putExtra("type", 3);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  public static void Sl()
  {
    if (!b.chp()) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
    localIntent.putExtra("type", 7);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  public static void a(h paramh)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
    localIntent.putExtra("type", 1);
    localIntent.putExtra("rtType", paramh.rtType);
    localIntent.putExtra("beginTime", paramh.beginTime);
    localIntent.putExtra("endTime", paramh.endTime);
    localIntent.putExtra("rtType", paramh.rtType);
    localIntent.putExtra("dataLen", paramh.ejJ);
    localIntent.putExtra("isSend", paramh.ceW);
    localIntent.putExtra("cost", paramh.btT);
    localIntent.putExtra("doSceneCount", paramh.ejK);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  private static String getClassName()
  {
    if (bi.oW(className)) {
      className = ad.getPackageName() + ".modelstat.WatchDogPushReceiver";
    }
    return className;
  }
  
  public static void iz(int paramInt)
  {
    if (!b.chp()) {
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setAction("com.tencent.mm.WatchDogPushReceiver");
    localIntent.setComponent(new ComponentName(ad.getPackageName(), getClassName()));
    localIntent.putExtra("type", 5);
    localIntent.putExtra("jni", paramInt);
    ad.getContext().sendBroadcast(localIntent);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (paramIntent == null) {
      x.e("MicroMsg.WatchDogPushReceiver", "onReceive intent == null");
    }
    int i;
    do
    {
      do
      {
        return;
        i = paramIntent.getIntExtra("type", 0);
        x.d("MicroMsg.WatchDogPushReceiver", "onReceive type:" + i);
        if (i == 1)
        {
          paramContext = new a.a();
          paramContext.rtType = paramIntent.getIntExtra("rtType", 0);
          paramContext.beginTime = paramIntent.getLongExtra("beginTime", 0L);
          paramContext.endTime = paramIntent.getLongExtra("endTime", 0L);
          boolean bool = paramIntent.getBooleanExtra("isSend", false);
          if (!bool) {
            paramContext.etV = paramIntent.getLongExtra("dataLen", 0L);
          }
          for (;;)
          {
            paramContext.btT = paramIntent.getLongExtra("cost", 0L);
            paramContext.etW = paramIntent.getLongExtra("doSceneCount", 0L);
            x.d("MicroMsg.WatchDogPushReceiver", "onRecv: rtType:" + paramContext.rtType + " isSend:" + bool + " tx:" + paramContext.etU + " rx:" + paramContext.etV + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
            if ((paramContext.etW != 0L) && (paramContext.rtType != 0L) && (paramContext.beginTime != 0L) && (paramContext.endTime != 0L) && (paramContext.endTime - paramContext.beginTime > 0L)) {
              break;
            }
            x.w("MicroMsg.WatchDogPushReceiver", "onRecv: count:" + paramContext.etW + " rtType:" + paramContext.rtType + " begin:" + paramContext.beginTime + " end:" + paramContext.endTime);
            return;
            paramContext.etU = paramIntent.getLongExtra("dataLen", 0L);
          }
        }
      } while ((i == 2) || (i == 3) || (i == 4));
      if ((i == 5) && (b.chp()))
      {
        if (paramIntent.getIntExtra("jni", 1) == 1)
        {
          Assert.assertTrue("test errlog push " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
          return;
        }
        MMProtocalJni.setClientPackVersion(-1);
        return;
      }
    } while (i != 6);
    x.chR();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelstat/WatchDogPushReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */