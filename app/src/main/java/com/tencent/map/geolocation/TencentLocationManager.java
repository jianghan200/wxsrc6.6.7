package com.tencent.map.geolocation;

import android.content.Context;
import android.os.Looper;
import c.t.m.g.ct;
import c.t.m.g.cu;
import c.t.m.g.dg;
import c.t.m.g.dg.b;
import c.t.m.g.eb;
import java.lang.ref.WeakReference;
import java.util.List;

public final class TencentLocationManager
{
  public static final int COORDINATE_TYPE_GCJ02 = 1;
  public static final int COORDINATE_TYPE_WGS84 = 0;
  private static TencentLocationManager d;
  private final byte[] a = new byte[0];
  private final ct b;
  private final dg c;
  
  private TencentLocationManager(Context paramContext)
  {
    this.b = ct.a(paramContext);
    this.c = new dg(this.b);
  }
  
  public static TencentLocationManager getInstance(Context paramContext)
  {
    try
    {
      if (d != null) {
        break label60;
      }
      if (paramContext == null) {
        throw new NullPointerException("context is null");
      }
    }
    finally {}
    if (paramContext.getApplicationContext() == null) {
      throw new NullPointerException("application context is null");
    }
    d = new TencentLocationManager(paramContext.getApplicationContext());
    label60:
    paramContext = d;
    return paramContext;
  }
  
  public final String getBuild()
  {
    cu localcu = this.b.c();
    if (localcu != null) {
      return localcu.e();
    }
    return "None";
  }
  
  public final int getCoordinateType()
  {
    return this.c.b;
  }
  
  public final TencentLocation getLastKnownLocation()
  {
    dg localdg = this.c;
    if (localdg.l == 0)
    {
      localdg.a(localdg.k);
      return localdg.k;
    }
    return null;
  }
  
  public final String getVersion()
  {
    cu localcu = this.b.c();
    if (localcu != null) {
      return localcu.d();
    }
    return "None";
  }
  
  public final void removeUpdates(TencentLocationListener arg1)
  {
    synchronized (this.a)
    {
      this.c.a();
      return;
    }
  }
  
  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener)
  {
    return requestLocationUpdates(paramTencentLocationRequest, paramTencentLocationListener, Looper.myLooper());
  }
  
  public final int requestLocationUpdates(TencentLocationRequest paramTencentLocationRequest, TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    if (paramTencentLocationRequest == null) {
      throw new NullPointerException("request is null");
    }
    if (paramTencentLocationListener == null) {
      throw new NullPointerException("listener is null");
    }
    if (paramLooper == null) {
      throw new NullPointerException("looper is null");
    }
    synchronized (this.a)
    {
      int i = this.c.a(paramTencentLocationRequest, paramTencentLocationListener, paramLooper);
      return i;
    }
  }
  
  public final int requestSingleFreshLocation(TencentLocationListener paramTencentLocationListener, Looper paramLooper)
  {
    int j = 0;
    if (paramTencentLocationListener == null) {
      throw new NullPointerException("listener is null");
    }
    if (paramLooper == null) {
      throw new NullPointerException("looper is null");
    }
    for (;;)
    {
      dg localdg;
      int i;
      synchronized (this.a)
      {
        localdg = this.c;
        if (localdg.d != 0)
        {
          i = localdg.d;
          return i;
        }
        if ((paramTencentLocationListener != null) && (localdg.f != null)) {
          localdg.f.add(new WeakReference(paramTencentLocationListener));
        }
        i = j;
        if (System.currentTimeMillis() - localdg.g < 2000L) {
          continue;
        }
        localdg.g = System.currentTimeMillis();
        if ((localdg.f != null) && (localdg.l == 0) && (localdg.k != null) && (((localdg.k.getProvider().equals("gps")) && (System.currentTimeMillis() - localdg.k.getTime() <= 90000L)) || ((localdg.k.getProvider().equals("network")) && (System.currentTimeMillis() - localdg.k.getTime() <= 30000L))))
        {
          localdg.a(localdg.k, localdg.l, 3103);
          localdg.g = 0L;
          i = j;
        }
      }
      if (localdg.m == dg.b.a)
      {
        localdg.a(3997);
        i = j;
      }
      else
      {
        i = localdg.a(TencentLocationRequest.create().setInterval(0L), dg.a, paramLooper);
        localdg.m = dg.b.c;
      }
    }
  }
  
  public final void setCoordinateType(int paramInt)
  {
    if ((paramInt == 1) || (paramInt == 0)) {
      synchronized (this.a)
      {
        dg localdg = this.c;
        if (localdg.b != paramInt) {
          localdg.b = paramInt;
        }
        return;
      }
    }
    throw new IllegalArgumentException("unknown coordinate type: " + paramInt);
  }
  
  public final boolean startIndoorLocation()
  {
    this.c.i = 1;
    return true;
  }
  
  public final boolean stopIndoorLocation()
  {
    dg localdg = this.c;
    if (localdg.i > 0)
    {
      if (localdg.c == null) {
        break label73;
      }
      i = 1;
      if (i != 0) {
        localdg.c.j = localdg.e.l;
      }
      if (Long.valueOf(localdg.h) == null) {
        break label78;
      }
    }
    label73:
    label78:
    for (int i = 1;; i = 0)
    {
      if (i != 0) {
        localdg.h = localdg.j.getInterval();
      }
      localdg.i = 0;
      return true;
      i = 0;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/map/geolocation/TencentLocationManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */