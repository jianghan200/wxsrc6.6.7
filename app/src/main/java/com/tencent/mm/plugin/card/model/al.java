package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class al
  extends i<ak>
{
  public static final String[] diD = { i.a(ak.dhO, "PendingCardId") };
  e diF;
  
  public al(e parame)
  {
    super(parame, ak.dhO, "PendingCardId", null);
    this.diF = parame;
  }
  
  public final List<ak> axg()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.diF.b("select * from PendingCardId where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      ak localak = new ak();
      localak.d(localCursor);
      localArrayList.add(localak);
    }
    localCursor.close();
    x.d("MicroMsg.PendingCardIdInfoStorage", "getAll, count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/card/model/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */