package com.tencent.smtt.export.external;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayList;

public class DexClassLoaderProviderService
  extends Service
{
  private static final String LOGTAG = "dexloader";
  
  public IBinder onBind(Intent paramIntent)
  {
    return null;
  }
  
  public void onCreate()
  {
    super.onCreate();
    DexClassLoaderProvider.setForceLoadDexFlag(true, this);
  }
  
  public void onDestroy()
  {
    System.exit(0);
  }
  
  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    if (paramIntent == null) {}
    do
    {
      return 1;
      paramIntent = paramIntent.getStringArrayListExtra("dex2oat");
    } while (paramIntent == null);
    paramIntent.get(0);
    DexClassLoaderProvider.createDexClassLoader((String)paramIntent.get(1), (String)paramIntent.get(2), (String)paramIntent.get(3), getClassLoader(), getApplicationContext());
    return 1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/smtt/export/external/DexClassLoaderProviderService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */