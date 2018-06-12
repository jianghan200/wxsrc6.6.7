package com.tencent.mm.plugin.topstory.a.a;

import com.tencent.mars.smc.IDKey;
import com.tencent.mm.plugin.report.f;
import java.util.ArrayList;

public final class a
{
  public static int bzI = 845;
  
  public static void a(com.tencent.mm.plugin.topstory.a.b.a parama)
  {
    ArrayList localArrayList;
    IDKey localIDKey;
    if (parama.ozb > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(bzI);
      localIDKey.SetKey(0);
      localIDKey.SetValue(parama.ozb);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(bzI);
      localIDKey.SetKey(1);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      f.mDy.b(localArrayList, false);
    }
    if (parama.oyS > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(bzI);
      localIDKey.SetKey(2);
      localIDKey.SetValue(parama.oyS);
      localArrayList.add(localIDKey);
      localIDKey = new IDKey();
      localIDKey.SetID(bzI);
      localIDKey.SetKey(3);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      f.mDy.b(localArrayList, false);
    }
    if (parama.ozc > 0L)
    {
      localArrayList = new ArrayList();
      localIDKey = new IDKey();
      localIDKey.SetID(bzI);
      localIDKey.SetKey(4);
      localIDKey.SetValue(parama.ozc);
      localArrayList.add(localIDKey);
      parama = new IDKey();
      parama.SetID(bzI);
      parama.SetKey(5);
      parama.SetValue(1L);
      localArrayList.add(parama);
      f.mDy.b(localArrayList, false);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/topstory/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */