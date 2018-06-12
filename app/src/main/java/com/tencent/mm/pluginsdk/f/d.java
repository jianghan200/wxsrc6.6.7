package com.tencent.mm.pluginsdk.f;

import com.tencent.mm.sdk.a.b;
import java.util.concurrent.ConcurrentHashMap;

public final class d
{
  public static d qBm = new d("default");
  private boolean kws = false;
  private ConcurrentHashMap<String, Integer> qBj = new ConcurrentHashMap();
  private ConcurrentHashMap<String, Long> qBk = new ConcurrentHashMap();
  private String qBl = "";
  
  public d(String paramString)
  {
    if (b.chp()) {
      this.kws = true;
    }
    this.qBl = paramString;
  }
  
  public final void Tf(String paramString)
  {
    if (!this.kws) {}
    label156:
    label159:
    for (;;)
    {
      return;
      int i;
      if (this.qBj.containsKey(paramString))
      {
        i = ((Integer)this.qBj.get(paramString)).intValue();
        i += 1;
        this.qBj.put(paramString, Integer.valueOf(i));
        if (!this.qBk.containsKey(paramString)) {
          break label156;
        }
      }
      for (long l = ((Long)this.qBk.get(paramString)).longValue();; l = 0L)
      {
        if (System.currentTimeMillis() - l <= 1000L) {
          break label159;
        }
        new StringBuilder().append(this.qBl).append("user get fps ").append(i).append(" fpswraper: ").append(paramString);
        this.qBj.put(paramString, Integer.valueOf(0));
        this.qBk.put(paramString, Long.valueOf(System.currentTimeMillis()));
        return;
        i = 0;
        break;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/pluginsdk/f/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */