package com.tencent.mm.ae;

import android.database.Cursor;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.ah;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c
  extends ah
{
  public final boolean gV(int paramInt)
  {
    return (paramInt != 0) && (paramInt < 620757033);
  }
  
  public final String getTag()
  {
    return "MicroMsg.DataTransfer.BlackListConvDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    x.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt != 0) && (paramInt < 620757033))
    {
      com.tencent.mm.plugin.report.service.h.mEJ.e(336L, 13L, 1L);
      Object localObject1 = new LinkedList();
      au.HU();
      Object localObject2 = com.tencent.mm.model.c.FR().d("@black.android", "", null);
      Object localObject3;
      if (localObject2 != null)
      {
        ((Cursor)localObject2).moveToFirst();
        while (!((Cursor)localObject2).isAfterLast())
        {
          localObject3 = new ab();
          ((ab)localObject3).d((Cursor)localObject2);
          ((List)localObject1).add(((ai)localObject3).field_username);
          ((Cursor)localObject2).moveToNext();
        }
        ((Cursor)localObject2).close();
      }
      if (((List)localObject1).size() > 0)
      {
        localObject2 = new StringBuilder();
        ((StringBuilder)localObject2).append("Update rconversation");
        ((StringBuilder)localObject2).append(" set parentRef = '@blacklist' where 1 != 1 ");
        localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject3 = (String)((Iterator)localObject1).next();
          ((StringBuilder)localObject2).append(" or username = '").append((String)localObject3).append("'");
        }
        localObject1 = ((StringBuilder)localObject2).toString();
        x.d("MicroMsg.DataTransfer.BlackListConvDataTransfer", "update sql: %s", new Object[] { localObject1 });
        au.HU();
        com.tencent.mm.model.c.FO().fV("rconversation", (String)localObject1);
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ae/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */