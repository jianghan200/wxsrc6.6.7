package com.tencent.mm.plugin.appbrand.appusage;

import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ah;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.x;

public final class t
  extends ah
{
  public final boolean gV(int paramInt)
  {
    int j = 1;
    int i;
    if (paramInt != 0)
    {
      i = 1;
      if (paramInt >= 637927936) {
        break label25;
      }
    }
    label25:
    for (paramInt = j;; paramInt = 0)
    {
      return paramInt & i;
      i = 0;
      break;
    }
  }
  
  public final String getTag()
  {
    return "MicroMsg.AppBrand.DuplicateUsageUsernameSetFlagDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    if (gV(paramInt))
    {
      aa.a locala = aa.a.sTW;
      g.Ei().DT().a(locala, Boolean.valueOf(false));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appusage/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */