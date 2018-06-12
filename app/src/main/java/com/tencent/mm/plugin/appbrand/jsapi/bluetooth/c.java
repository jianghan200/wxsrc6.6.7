package com.tencent.mm.plugin.appbrand.jsapi.bluetooth;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

public final class c
{
  public static void bK(int paramInt1, int paramInt2)
  {
    ArrayList localArrayList = new ArrayList();
    IDKey localIDKey = new IDKey();
    localIDKey.SetID(762);
    localIDKey.SetKey(paramInt1);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    localIDKey = new IDKey();
    localIDKey.SetID(762);
    localIDKey.SetKey(paramInt2);
    localIDKey.SetValue(1L);
    localArrayList.add(localIDKey);
    h.mEJ.b(localArrayList, true);
  }
  
  public static void kB(int paramInt)
  {
    h.mEJ.e(762L, paramInt, 1L);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/jsapi/bluetooth/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */