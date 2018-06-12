package com.tencent.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.preference.PreferenceManager;

public class i
{
  static f bvA = null;
  public static volatile long bvB = 0L;
  static h bvC = null;
  private static i bvz;
  public static Context mContext = null;
  public static Handler mHandler = null;
  private g bvD = null;
  
  static
  {
    bvz = null;
  }
  
  private i(Context paramContext)
  {
    HandlerThread localHandlerThread = new HandlerThread(i.class.getSimpleName());
    localHandlerThread.start();
    mHandler = new Handler(localHandlerThread.getLooper());
    paramContext = paramContext.getApplicationContext();
    mContext = paramContext;
    bvB = PreferenceManager.getDefaultSharedPreferences(paramContext).getLong("__MID_LAST_CHECK_TIME__", 0L);
  }
  
  public static void a(f paramf)
  {
    bvA = paramf;
  }
  
  public static i aF(Context paramContext)
  {
    if (bvz == null) {}
    try
    {
      if (bvz == null) {
        bvz = new i(paramContext);
      }
      return bvz;
    }
    finally {}
  }
  
  public final String tO()
  {
    if ((this.bvD == null) || (!s.cj(this.bvD.bvx)))
    {
      this.bvD = r.aH(mContext).tT();
      if (!s.cj(this.bvD.bvx)) {
        break label100;
      }
    }
    label100:
    for (int i = 2;; i = 1)
    {
      if (mHandler != null) {
        mHandler.post(new n(mContext, i));
      }
      new StringBuilder("wx get mid:").append(this.bvD.bvx);
      return this.bvD.bvx;
    }
  }
  
  public final String tP()
  {
    if ((this.bvD == null) || (!s.cj(this.bvD.bvx))) {
      this.bvD = r.aH(mContext).tT();
    }
    return this.bvD.bvx;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/b/a/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */