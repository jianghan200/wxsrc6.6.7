package com.tencent.mm.ae;

import android.database.Cursor;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 620758015);
  }
  
  public final String getTag()
  {
    return "MicroMsg.App.SyncTopConversation";
  }
  
  public final void transfer(int paramInt)
  {
    x.d("MicroMsg.App.SyncTopConversation", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    com.tencent.mm.plugin.report.service.h.mEJ.e(336L, 15L, 1L);
    au.HU();
    Object localObject1 = c.FO();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append("select username from rconversation");
    ((StringBuilder)localObject2).append(" where flag & 4611686018427387904 != 0");
    x.d("MicroMsg.App.SyncTopConversation", "sql:%s", new Object[] { localObject2 });
    localObject1 = ((com.tencent.mm.bt.h)localObject1).b(((StringBuilder)localObject2).toString(), null, 2);
    if (localObject1 != null)
    {
      while (((Cursor)localObject1).moveToNext())
      {
        localObject2 = ((Cursor)localObject1).getString(0);
        x.v("MicroMsg.App.SyncTopConversation", "userName %s", new Object[] { localObject2 });
        s.t((String)localObject2, false);
      }
      ((Cursor)localObject1).close();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ae/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */