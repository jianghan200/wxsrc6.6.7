package com.tencent.mm.plugin.card.c;

import android.database.Cursor;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.c;
import com.tencent.mm.storage.aa.a;

public final class a
  implements b
{
  public final boolean axA()
  {
    return l.azT();
  }
  
  public final String axB()
  {
    return (String)g.Ei().DT().get(aa.a.sPS, null);
  }
  
  public final int axC()
  {
    int j = 0;
    int i = 0;
    Object localObject1 = am.axi();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(" where (status=0 OR status=5) and (block_mask= '1' OR block_mask= '0' )");
    localObject2 = "select count(*) from UserCardInfo" + ((StringBuilder)localObject2).toString();
    localObject1 = ((c)localObject1).diF.b((String)localObject2, null, 2);
    if (localObject1 == null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.CardMgrImpl", "getGiftCardCount:" + i);
      return i;
      i = j;
      if (((Cursor)localObject1).moveToFirst()) {
        i = ((Cursor)localObject1).getInt(0);
      }
      ((Cursor)localObject1).close();
    }
  }
  
  public final boolean axz()
  {
    return l.azR();
  }
  
  public final boolean nI(int paramInt)
  {
    return l.nI(paramInt);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */