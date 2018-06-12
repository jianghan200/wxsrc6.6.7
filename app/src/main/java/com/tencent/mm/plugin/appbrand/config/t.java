package com.tencent.mm.plugin.appbrand.config;

import android.util.Pair;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.Iterator;
import java.util.List;

public final class t
{
  public String appId;
  public int bGM;
  public String dLS;
  public List<WxaAttributes.WxaEntryInfo> frQ;
  public List<Pair<String, String>> fsc;
  public int fsi;
  public String fsq;
  private String fsr = null;
  public String nickname;
  public String signature;
  public String username;
  
  public final String aep()
  {
    if ((bi.oW(this.fsr)) && (!bi.cX(this.fsc)))
    {
      Object localObject2 = new StringBuilder();
      Iterator localIterator = this.fsc.iterator();
      label110:
      while (localIterator.hasNext())
      {
        localObject1 = (Pair)localIterator.next();
        if (bi.oW((String)((Pair)localObject1).second)) {}
        for (localObject1 = (String)((Pair)localObject1).first;; localObject1 = (String)((Pair)localObject1).second)
        {
          if (bi.oW((String)localObject1)) {
            break label110;
          }
          ((StringBuilder)localObject2).append("、");
          ((StringBuilder)localObject2).append((String)localObject1);
          break;
        }
      }
      localObject2 = ((StringBuilder)localObject2).toString();
      Object localObject1 = localObject2;
      if (!bi.oW((String)localObject2)) {
        localObject1 = ((String)localObject2).replaceFirst("、", "");
      }
      this.fsr = ((String)localObject1);
    }
    return bi.oV(this.fsr);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/config/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */