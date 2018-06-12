package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.plugin.sns.storage.g;
import com.tencent.mm.plugin.sns.storage.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import java.util.HashMap;

public final class ah
  implements g
{
  HashMap<String, l> iII = new HashMap();
  
  public final l Mj(String paramString)
  {
    return (l)this.iII.get(paramString);
  }
  
  public final boolean a(final l paraml)
  {
    if ((paraml == null) || (bi.oW(paraml.field_userName))) {
      return false;
    }
    af.bxY().post(new Runnable()
    {
      public final void run()
      {
        ah.this.iII.put(paraml.field_userName, paraml);
      }
    });
    return true;
  }
  
  public final boolean byE()
  {
    af.bxY().post(new Runnable()
    {
      public final void run()
      {
        if (ah.this.iII.size() > 50) {
          ah.a(ah.this, 10);
        }
      }
    });
    return true;
  }
  
  public final boolean byF()
  {
    af.bxY().post(new ah.2(this));
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/sns/model/ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */