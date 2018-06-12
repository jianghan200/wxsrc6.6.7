package com.tencent.map.swlocation.api;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.d.a.a.q;
import com.d.a.a.t;

public class SwEngine
{
  public static void creatLocationEngine(Context paramContext, q paramq)
  {
    t.a(paramContext, paramq);
  }
  
  public static void onDestroy() {}
  
  public static void setImei(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new NullPointerException("SenseWhereEngine:invalid imei!");
    }
    t.setImei(paramString);
  }
  
  public static void startContinousLocationUpdate(Handler paramHandler, int paramInt1, int paramInt2, LocationUpdateListener paramLocationUpdateListener, ServerMessageListener paramServerMessageListener)
  {
    t.a(paramHandler, paramInt2, paramLocationUpdateListener, paramServerMessageListener);
  }
  
  public static void stopContinousLocationUpdate() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/map/swlocation/api/SwEngine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */