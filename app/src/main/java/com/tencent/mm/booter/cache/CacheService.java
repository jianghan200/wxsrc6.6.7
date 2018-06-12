package com.tencent.mm.booter.cache;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class CacheService
  extends Service
{
  public IBinder onBind(Intent paramIntent)
  {
    return a.cYg;
  }
  
  public void onCreate()
  {
    super.onCreate();
    a.prepare();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    a.destroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/booter/cache/CacheService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */