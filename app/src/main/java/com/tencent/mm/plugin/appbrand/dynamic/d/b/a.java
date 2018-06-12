package com.tencent.mm.plugin.appbrand.dynamic.d.b;

import com.tencent.mm.platformtools.af;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class a
  implements com.tencent.mm.u.d.a
{
  private static final int fwA = -bi.getInt(af.exh, 0);
  private byte[] fwB;
  private String id;
  
  public a(String paramString, byte[] paramArrayOfByte)
  {
    this.id = paramString;
    this.fwB = paramArrayOfByte;
  }
  
  public final boolean gu(int paramInt)
  {
    int i = fwA;
    if (i == -1)
    {
      x.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm on", new Object[] { this.id, Integer.valueOf(paramInt) });
      paramInt = 1;
    }
    while (paramInt == 1)
    {
      return true;
      if (i == -2)
      {
        x.d("MicroMsg.DefaultPermissionFilter", "getCtrlByte, id = %s, ctrlIndex = %d, hard code perm off", new Object[] { this.id, Integer.valueOf(paramInt) });
        paramInt = 0;
      }
      else if (paramInt == -2)
      {
        paramInt = 1;
      }
      else if (paramInt == -1)
      {
        paramInt = 0;
      }
      else if ((this.fwB == null) || (paramInt < 0) || (paramInt >= this.fwB.length))
      {
        paramInt = 0;
      }
      else
      {
        paramInt = this.fwB[paramInt];
      }
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/appbrand/dynamic/d/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */