package com.tencent.mm.plugin.voip_cs.b.b;

import android.os.Looper;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;

public final class a
{
  public boolean kqA = false;
  public v2protocal kqx = new v2protocal(this.kqy);
  private ag kqy = new a.1(this, Looper.getMainLooper());
  public boolean kqz = false;
  public a oYb = null;
  
  public static int OP(String paramString)
  {
    paramString = paramString.split("\\.");
    int i = bi.getInt(paramString[0], 0);
    int j = bi.getInt(paramString[1], 0);
    int k = bi.getInt(paramString[2], 0);
    return bi.getInt(paramString[3], 0) + ((i << 24) + (j << 16) + (k << 8));
  }
  
  public static abstract interface a
  {
    public abstract void aWO();
    
    public abstract void bML();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/voip_cs/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */