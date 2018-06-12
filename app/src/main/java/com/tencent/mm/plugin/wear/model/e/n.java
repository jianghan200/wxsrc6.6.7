package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.plugin.wear.model.h;
import java.util.ArrayList;
import java.util.List;

public final class n
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11033));
    localArrayList.add(Integer.valueOf(11030));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    switch (paramInt)
    {
    case 11031: 
    case 11032: 
    default: 
      return null;
    case 11030: 
      if (new String(paramArrayOfByte).equals("arm_v7")) {
        return h.PQ("wechatvoicesilk_v7a");
      }
      return h.PQ("wechatvoicesilk");
    }
    return h.PQ("stlport_shared");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */