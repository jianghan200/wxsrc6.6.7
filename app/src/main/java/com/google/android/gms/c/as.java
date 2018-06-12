package com.google.android.gms.c;

import android.content.Context;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.stats.h;

public final class as
{
  private static boolean DEBUG = false;
  private static String TAG = "WakeLock";
  private final String aPz;
  public final PowerManager.WakeLock aZe;
  private WorkSource aZf;
  private final int aZg;
  private final String aZh;
  private boolean aZi = true;
  private int aZj;
  private int aZk;
  private final Context mContext;
  
  private as(Context paramContext, String paramString)
  {
    w.i(paramString, "Wake lock name can NOT be empty");
    this.aZg = 1;
    this.aPz = paramString;
    this.aZh = null;
    this.mContext = paramContext.getApplicationContext();
    this.aZe = ((PowerManager)paramContext.getSystemService("power")).newWakeLock(1, paramString);
    if (ac.at(this.mContext))
    {
      if (!ab.bt(null)) {
        break label175;
      }
      if ((!com.google.android.gms.common.internal.f.aNr) || (!j.isInitialized())) {
        break label167;
      }
      new StringBuilder("callingPackage is not supposed to be empty for wakelock ").append(this.aPz).append("!");
      paramString = "com.google.android.gms";
      this.aZf = ac.m(paramContext, paramString);
      paramContext = this.aZf;
      if ((ac.at(this.mContext)) && (paramContext != null))
      {
        if (this.aZf == null) {
          break label180;
        }
        this.aZf.add(paramContext);
      }
    }
    for (;;)
    {
      this.aZe.setWorkSource(this.aZf);
      return;
      label167:
      paramString = paramContext.getPackageName();
      break;
      label175:
      paramString = null;
      break;
      label180:
      this.aZf = paramContext;
    }
  }
  
  public as(Context paramContext, String paramString, byte paramByte)
  {
    this(paramContext, paramString);
  }
  
  private String aw(boolean paramBoolean)
  {
    if (this.aZi)
    {
      if (paramBoolean) {
        return null;
      }
      return this.aZh;
    }
    return this.aZh;
  }
  
  private boolean qs()
  {
    if (!TextUtils.isEmpty(null))
    {
      String str = this.aZh;
      throw new NullPointerException();
    }
    return false;
  }
  
  public final void qr()
  {
    if ((!z.dx(14)) && (this.aZi)) {
      Log.wtf(TAG, "Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: " + this.aPz);
    }
    boolean bool = qs();
    String str = aw(bool);
    if (DEBUG) {
      new StringBuilder("Acquire:\n mWakeLockName: ").append(this.aPz).append("\n mSecondaryName: ").append(this.aZh).append("\nmReferenceCounted: ").append(this.aZi).append("\nreason: ").append(null).append("\nmOpenEventCount").append(this.aZk).append("\nuseWithReason: ").append(bool).append("\ntrackingName: ").append(str);
    }
    try
    {
      if (this.aZi)
      {
        int i = this.aZj;
        this.aZj = (i + 1);
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((this.aZi) || (this.aZk != 0)) {
          break label228;
        }
      }
      h.pH();
      h.a(this.mContext, com.google.android.gms.common.stats.f.a(this.aZe, str), 7, this.aPz, str, this.aZg, ac.b(this.aZf));
      this.aZk += 1;
      label228:
      this.aZe.acquire(1000L);
      return;
    }
    finally {}
  }
  
  public final void qt()
  {
    this.aZe.setReferenceCounted(false);
    this.aZi = false;
  }
  
  public final void release()
  {
    boolean bool = qs();
    String str = aw(bool);
    if (DEBUG) {
      new StringBuilder("Release:\n mWakeLockName: ").append(this.aPz).append("\n mSecondaryName: ").append(this.aZh).append("\nmReferenceCounted: ").append(this.aZi).append("\nreason: ").append(null).append("\n mOpenEventCount").append(this.aZk).append("\nuseWithReason: ").append(bool).append("\ntrackingName: ").append(str);
    }
    try
    {
      if (this.aZi)
      {
        int i = this.aZj - 1;
        this.aZj = i;
        if ((i == 0) || (bool)) {}
      }
      else
      {
        if ((this.aZi) || (this.aZk != 1)) {
          break label188;
        }
      }
      h.pH();
      h.a(this.mContext, com.google.android.gms.common.stats.f.a(this.aZe, str), 8, this.aPz, str, this.aZg, ac.b(this.aZf));
      this.aZk -= 1;
      label188:
      this.aZe.release();
      return;
    }
    finally {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/google/android/gms/c/as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */