package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class o
  extends i<n>
{
  public static final String[] diD = { i.a(n.dhO, "ShareCardSyncItemInfo") };
  private e diF;
  
  public o(e parame)
  {
    super(parame, n.dhO, "ShareCardSyncItemInfo", null);
    this.diF = parame;
  }
  
  public final List<n> axg()
  {
    ArrayList localArrayList = new ArrayList();
    Cursor localCursor = this.diF.b("select * from ShareCardSyncItemInfo where retryCount < 10", null, 2);
    while (localCursor.moveToNext())
    {
      n localn = new n();
      localn.d(localCursor);
      localArrayList.add(localn);
    }
    localCursor.close();
    x.d("MicroMsg.ShareCardSyncItemInfoStorage", "getAll, share card count = %d", new Object[] { Integer.valueOf(localArrayList.size()) });
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */