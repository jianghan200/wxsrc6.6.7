package com.tencent.mm.model;

import com.tencent.mm.g.c.ai;
import com.tencent.mm.l.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.Iterator;
import java.util.List;

public final class ab
{
  public static void HA()
  {
    Object localObject = s.Hu().iterator();
    com.tencent.mm.storage.ab localab1;
    while (((Iterator)localObject).hasNext())
    {
      localab1 = (com.tencent.mm.storage.ab)((Iterator)localObject).next();
      if ((localab1 != null) && ((int)localab1.dhP != 0) && (localab1.field_showHead == 32))
      {
        localab1.eD(localab1.AY());
        x.d("MicroMsg.HardCodeUpdateTask", "contact to updatefavour " + localab1.field_username);
        au.HU();
        c.FR().a(localab1.field_username, localab1);
      }
    }
    localObject = s.dAV;
    int j = localObject.length;
    int i = 0;
    while (i < j)
    {
      localab1 = localObject[i];
      com.tencent.mm.storage.ab localab2 = c.FR().Yg(localab1);
      if ((localab2 != null) && (((int)localab2.dhP != 0) || (a.gd(localab2.field_type))))
      {
        localab2.Bk();
        c.FR().a(localab1, localab2);
      }
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/model/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */