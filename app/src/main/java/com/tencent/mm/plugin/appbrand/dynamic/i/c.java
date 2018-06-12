package com.tencent.mm.plugin.appbrand.dynamic.i;

import android.text.TextUtils;
import com.tencent.mm.plugin.report.service.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class c
  implements a
{
  private String appId;
  private String fuu;
  private String fxE;
  private Map<String, Integer> fxF = new HashMap();
  
  public c(String paramString1, String paramString2)
  {
    this.appId = paramString1;
    this.fuu = paramString2;
    this.fxE = (this.fuu + "-" + this.appId);
  }
  
  public final void sI(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return;
    }
    Integer localInteger2 = (Integer)this.fxF.get(paramString);
    Integer localInteger1 = localInteger2;
    if (localInteger2 == null) {
      localInteger1 = Integer.valueOf(0);
    }
    this.fxF.put(paramString, Integer.valueOf(localInteger1.intValue() + 1));
  }
  
  public final void xP()
  {
    Iterator localIterator = this.fxF.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      h.mEJ.h(14705, new Object[] { localEntry.getKey(), localEntry.getValue(), this.fxE, this.fuu, this.appId });
    }
    this.fxF.clear();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/i/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */