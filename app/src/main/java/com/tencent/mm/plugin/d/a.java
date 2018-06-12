package com.tencent.mm.plugin.d;

import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.kernel.api.e;
import com.tencent.mm.kernel.b.c;
import java.util.HashMap;

public final class a
  implements com.tencent.mm.kernel.api.a, e, c
{
  private static final HashMap<Integer, h.d> cVM;
  private static a fak;
  private com.tencent.mm.storage.g fal;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("AddContactAntispamTicket".hashCode()), new a.1());
  }
  
  public static a ZN()
  {
    try
    {
      if (fak == null) {
        fak = new a();
      }
      a locala = fak;
      return locala;
    }
    finally {}
  }
  
  public final com.tencent.mm.storage.g Gw()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    return this.fal;
  }
  
  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return cVM;
  }
  
  public final void onDataBaseClosed(h paramh1, h paramh2) {}
  
  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    this.fal = new com.tencent.mm.storage.g(paramh1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */