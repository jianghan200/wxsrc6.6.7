package com.google.android.gms.iid;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.gcm.GcmReceiver;
import java.io.IOException;

public class InstanceIDListenerService
  extends Service
{
  static String ACTION = "action";
  private static String aQw = "gcm.googleapis.com/refresh";
  private static String aRa = "google.com/iid";
  private static String aRb = "CMD";
  MessengerCompat aQY = new MessengerCompat(new InstanceIDListenerService.1(this, Looper.getMainLooper()));
  BroadcastReceiver aQZ = new InstanceIDListenerService.2(this);
  int aRc;
  int aRd;
  
  static void a(Context paramContext, e parame)
  {
    parame.pS();
    parame = new Intent("com.google.android.gms.iid.InstanceID");
    parame.putExtra(aRb, "RST");
    parame.setPackage(paramContext.getPackageName());
    paramContext.startService(parame);
  }
  
  static void ap(Context paramContext)
  {
    Intent localIntent = new Intent("com.google.android.gms.iid.InstanceID");
    localIntent.setPackage(paramContext.getPackageName());
    localIntent.putExtra(aRb, "SYNC");
    paramContext.startService(localIntent);
  }
  
  public final void e(Intent paramIntent)
  {
    String str = paramIntent.getStringExtra("subtype");
    Object localObject1;
    Object localObject2;
    if (str == null)
    {
      localObject1 = a.ao(this);
      localObject2 = paramIntent.getStringExtra(aRb);
      if ((paramIntent.getStringExtra("error") == null) && (paramIntent.getStringExtra("registration_id") == null)) {
        break label82;
      }
      Log.isLoggable("InstanceID", 3);
      a.pO().h(paramIntent);
    }
    label82:
    label269:
    do
    {
      do
      {
        return;
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("subtype", str);
        localObject1 = a.c(this, (Bundle)localObject1);
        break;
        if (Log.isLoggable("InstanceID", 3)) {
          new StringBuilder("Service command ").append(str).append(" ").append((String)localObject2).append(" ").append(paramIntent.getExtras());
        }
        if (paramIntent.getStringExtra("unregistered") != null)
        {
          localObject2 = a.pN();
          if (str == null) {}
          for (localObject1 = "";; localObject1 = str)
          {
            ((e)localObject2).bo((String)localObject1);
            a.pO().h(paramIntent);
            return;
          }
        }
        if (aQw.equals(paramIntent.getStringExtra("from")))
        {
          a.pN().bo(str);
          return;
        }
        if ("RST".equals(localObject2))
        {
          ((a)localObject1).aQW = 0L;
          paramIntent = a.aQS;
          str = ((a)localObject1).aQV;
          paramIntent.bn(str + "|");
          ((a)localObject1).aQU = null;
          return;
        }
        if (!"RST_FULL".equals(localObject2)) {
          break label269;
        }
      } while (a.pN().isEmpty());
      a.pN().pS();
      return;
      if ("SYNC".equals(localObject2))
      {
        a.pN().bo(str);
        return;
      }
    } while (!"PING".equals(localObject2));
    try
    {
      com.google.android.gms.gcm.a.al(this).a(aRa, d.pR(), paramIntent.getExtras());
      return;
    }
    catch (IOException paramIntent) {}
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    if ((paramIntent != null) && ("com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction()))) {
      return this.aQY.getBinder();
    }
    return null;
  }
  
  public void onCreate()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
    localIntentFilter.addCategory(getPackageName());
    registerReceiver(this.aQZ, localIntentFilter, "com.google.android.c2dm.permission.RECEIVE", null);
  }
  
  public void onDestroy()
  {
    unregisterReceiver(this.aQZ);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    try
    {
      this.aRc += 1;
      if (paramInt2 > this.aRd) {
        this.aRd = paramInt2;
      }
      if (paramIntent == null)
      {
        stop();
        return 2;
      }
    }
    finally {}
    try
    {
      if ("com.google.android.gms.iid.InstanceID".equals(paramIntent.getAction()))
      {
        if (Build.VERSION.SDK_INT <= 18)
        {
          Intent localIntent = (Intent)paramIntent.getParcelableExtra("GSF");
          if (localIntent != null)
          {
            startService(localIntent);
            return 1;
          }
        }
        e(paramIntent);
      }
      stop();
      if (paramIntent.getStringExtra("from") != null) {
        GcmReceiver.b(paramIntent);
      }
      return 2;
    }
    finally
    {
      stop();
    }
  }
  
  final void stop()
  {
    try
    {
      this.aRc -= 1;
      if (this.aRc == 0) {
        stopSelf(this.aRd);
      }
      if (Log.isLoggable("InstanceID", 3)) {
        new StringBuilder("Stop ").append(this.aRc).append(" ").append(this.aRd);
      }
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/iid/InstanceIDListenerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */