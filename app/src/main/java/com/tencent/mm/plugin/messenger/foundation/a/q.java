package com.tencent.mm.plugin.messenger.foundation.a;

import com.tencent.mm.protocal.c.pm;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public abstract interface q
{
  public abstract void a(pm parampm, byte[] paramArrayOfByte, boolean paramBoolean, s params);
  
  public static final class a
  {
    private static ConcurrentHashMap<Integer, q> lco = new ConcurrentHashMap();
    
    public static void a(int paramInt, q paramq)
    {
      if (lco.get(Integer.valueOf(paramInt)) == null) {}
      for (boolean bool = true;; bool = false)
      {
        Assert.assertTrue(bool);
        lco.put(Integer.valueOf(paramInt), paramq);
        return;
      }
    }
    
    public static q sw(int paramInt)
    {
      return (q)lco.get(Integer.valueOf(paramInt));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/messenger/foundation/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */