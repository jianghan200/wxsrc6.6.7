package com.tencent.mm.plugin.bottle.a;

import android.database.Cursor;
import com.tencent.mm.aq.d;
import com.tencent.mm.bt.h;
import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.c.am;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.a;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.az.a;
import java.util.HashMap;

public final class i
  implements ar
{
  private static HashMap<Integer, h.d> cVM;
  private az.a dBJ = new i.2(this);
  private b hke;
  
  static
  {
    HashMap localHashMap = new HashMap();
    cVM = localHashMap;
    localHashMap.put(Integer.valueOf("THROWBOTTLEINFO_TABLE".hashCode()), new i.1());
  }
  
  private static i auj()
  {
    au.HN();
    i locali2 = (i)bs.iK("plugin.bottle");
    i locali1 = locali2;
    if (locali2 == null)
    {
      locali1 = new i();
      au.HN().a("plugin.bottle", locali1);
    }
    return locali1;
  }
  
  public static b auk()
  {
    com.tencent.mm.kernel.g.Eg().Ds();
    if (auj().hke == null)
    {
      i locali = auj();
      au.HU();
      locali.hke = new b(com.tencent.mm.model.c.FO());
    }
    return auj().hke;
  }
  
  public static void aul()
  {
    au.HU();
    Cursor localCursor = com.tencent.mm.model.c.FW().clF();
    int i = 0;
    while (i < localCursor.getCount())
    {
      localCursor.moveToPosition(i);
      ai localai = new ai();
      localai.d(localCursor);
      au.HU();
      com.tencent.mm.storage.bd localbd = com.tencent.mm.model.c.FT().GD(localai.field_username);
      au.HU();
      com.tencent.mm.model.c.FQ().b(new d(localai.field_username, localbd.field_msgSvrId));
      au.HU();
      com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.f(localai.field_username, 0));
      au.HU();
      com.tencent.mm.model.c.FR().Ym(localai.field_username);
      i += 1;
    }
    localCursor.close();
    au.HU();
    com.tencent.mm.model.c.FT().GL("@bottle");
    au.HU();
    com.tencent.mm.model.c.FW().clz();
    au.HU();
    com.tencent.mm.model.c.FW().GL("floatbottle");
    com.tencent.mm.model.bd.Il();
    auk().dCZ.delete("bottleinfo1", null, null);
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return cVM;
  }
  
  public final void bn(boolean paramBoolean)
  {
    c.auf();
    au.HU();
    com.tencent.mm.model.c.FW().b(this.dBJ);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    au.HU();
    com.tencent.mm.model.c.FW().c(this.dBJ);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/bottle/a/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */