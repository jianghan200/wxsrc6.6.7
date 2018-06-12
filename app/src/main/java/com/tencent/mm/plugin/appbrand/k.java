package com.tencent.mm.plugin.appbrand;

import android.support.v4.e.a;
import com.tencent.mm.protocal.c.adz;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public final class k
{
  private static final Map<String, k> dmH = new a();
  private static final k fdF = new k();
  public volatile String fdG;
  public final AtomicInteger fdH = new AtomicInteger();
  public final AtomicBoolean fdI = new AtomicBoolean(false);
  public int fdJ = 0;
  public volatile adz fdK;
  public volatile String fdL;
  public volatile String fdM;
  public volatile boolean fdN;
  
  static k qr(String paramString)
  {
    return qs(paramString);
  }
  
  private static k qs(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    synchronized (dmH)
    {
      k localk2 = (k)dmH.get(paramString);
      k localk1 = localk2;
      if (localk2 == null)
      {
        localk1 = new k();
        dmH.put(paramString, localk1);
      }
      return localk1;
    }
  }
  
  private static k qt(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    synchronized (dmH)
    {
      paramString = (k)dmH.get(paramString);
      return paramString;
    }
  }
  
  public static k qu(String paramString)
  {
    k localk = qt(paramString);
    paramString = localk;
    if (localk == null) {
      paramString = fdF;
    }
    return paramString;
  }
  
  public static k qv(String paramString)
  {
    return qs(paramString);
  }
  
  static void remove(String paramString)
  {
    if (bi.oW(paramString)) {
      return;
    }
    synchronized (dmH)
    {
      dmH.remove(paramString);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/appbrand/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */