package com.tencent.mm.plugin.wear.model.e;

import com.tencent.mm.aq.j;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.protocal.c.ceo;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class k
  extends a
{
  public final List<Integer> bSy()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Integer.valueOf(11011));
    localArrayList.add(Integer.valueOf(11010));
    return localArrayList;
  }
  
  protected final byte[] p(int paramInt, byte[] paramArrayOfByte)
  {
    Object localObject;
    switch (paramInt)
    {
    default: 
      return null;
    case 11010: 
      localObject = new ceo();
    }
    try
    {
      ((ceo)localObject).aG(paramArrayOfByte);
      com.tencent.mm.plugin.wear.model.a.bSl().pIO.ct(((ceo)localObject).szk, ((ceo)localObject).szw);
      return null;
      try
      {
        paramArrayOfByte = new String(paramArrayOfByte, "utf8");
        au.HU();
        localObject = c.FR().Yg(paramArrayOfByte);
        if (s.fq(paramArrayOfByte))
        {
          au.HU();
          localObject = c.FR().Yg(paramArrayOfByte);
          ((ab)localObject).eN(0);
          au.HU();
          c.FR().a(paramArrayOfByte, (ab)localObject);
          au.HU();
          c.FQ().b(new j(paramArrayOfByte, 0));
          com.tencent.mm.plugin.wear.model.c.a.ee(4, 0);
          return null;
        }
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        for (;;)
        {
          paramArrayOfByte = "";
          continue;
          s.n((ab)localObject);
        }
      }
    }
    catch (IOException paramArrayOfByte)
    {
      for (;;) {}
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/wear/model/e/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */