package com.tencent.mm.platformtools;

import android.util.SparseBooleanArray;
import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public final class u
{
  private static ConcurrentHashMap<Integer, a> evW = new ConcurrentHashMap();
  
  public static final a a(int paramInt, String paramString, HashMap<Integer, h.d> paramHashMap, boolean paramBoolean)
  {
    if ((!bi.oW(paramString)) && (paramHashMap != null)) {}
    int i;
    a locala;
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      i = paramString.hashCode();
      locala = (a)evW.get(Integer.valueOf(i));
      if (locala != null) {
        break label168;
      }
      locala = new a(paramString, paramBoolean);
      if (!paramBoolean) {
        break;
      }
      g.Eg();
      if (locala.a("", paramString, "", a.Df(), q.zy(), paramHashMap, true)) {
        break label122;
      }
      throw new b((byte)0);
    }
    if (!locala.b(paramString, paramHashMap, false)) {
      throw new b((byte)0);
    }
    label122:
    evW.put(Integer.valueOf(i), locala);
    for (paramString = locala;; paramString = locala)
    {
      x.d("MicroMsg.GeneralDBHelper", "addRef %d", new Object[] { Integer.valueOf(paramInt) });
      paramString.evY.put(paramInt, true);
      return paramString;
      label168:
      if (paramBoolean == locala.evX) {
        paramBoolean = true;
      }
      long l;
      for (;;)
      {
        Assert.assertTrue(paramBoolean);
        l = locala.dO(-1L);
        paramString = paramHashMap.values().iterator();
        for (;;)
        {
          if (paramString.hasNext())
          {
            paramHashMap = ((h.d)paramString.next()).xb();
            int j = paramHashMap.length;
            i = 0;
            label234:
            if (i < j)
            {
              String str = paramHashMap[i];
              x.d("MicroMsg.GeneralDBHelper", "init sql:" + str);
              try
              {
                locala.fV(null, str);
                i += 1;
                break label234;
                paramBoolean = false;
              }
              catch (Exception localException)
              {
                for (;;)
                {
                  Assert.assertTrue("CreateTable failed:[" + str + "][" + localException.getMessage() + "]", false);
                }
              }
            }
          }
        }
      }
      locala.gp(l);
    }
  }
  
  public static final class a
    extends h
  {
    public final boolean evX;
    SparseBooleanArray evY = new SparseBooleanArray();
    private final String path;
    
    public a(String paramString, boolean paramBoolean)
    {
      x.d("MicroMsg.GeneralDBHelper", "create db %s", new Object[] { paramString });
      this.evX = paramBoolean;
      this.path = paramString;
    }
    
    @Deprecated
    public final void closeDB()
    {
      x.e("MicroMsg.GeneralDBHelper", "forbid to use this method %s", new Object[] { bi.cjd() });
      if (this.evY.size() <= 1) {
        super.closeDB();
      }
    }
    
    @Deprecated
    public final void ex(String paramString)
    {
      x.e("MicroMsg.GeneralDBHelper", "forbid to use this method");
      if (this.evY.size() <= 1) {
        super.ex(paramString);
      }
    }
    
    public final void iQ(int paramInt)
    {
      x.d("MicroMsg.GeneralDBHelper", "try close db %d", new Object[] { Integer.valueOf(paramInt) });
      this.evY.delete(paramInt);
      if (this.evY.size() <= 0)
      {
        x.d("MicroMsg.GeneralDBHelper", "close db %d succ", new Object[] { Integer.valueOf(paramInt) });
        super.closeDB();
        u.Vt().remove(Integer.valueOf(this.path.hashCode()));
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/platformtools/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */