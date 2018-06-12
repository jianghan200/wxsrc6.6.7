package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class h
  extends i<g>
{
  public static final String[] diD = { i.a(g.dhO, "CardMsgInfo") };
  public e diF;
  
  public h(e parame)
  {
    super(parame, g.dhO, "CardMsgInfo", null);
    this.diF = parame;
  }
  
  public final Cursor axc()
  {
    return this.diF.rawQuery("select * from CardMsgInfo order by time desc", null);
  }
  
  public final int axd()
  {
    int i = 0;
    Cursor localCursor = this.diF.b(" select count(*) from CardMsgInfo where read_state = ? ", new String[] { "1" }, 2);
    if (localCursor == null) {
      return 0;
    }
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    return i;
  }
  
  public final boolean axe()
  {
    return this.diF.fV("CardMsgInfo", " update CardMsgInfo set read_state = 0  where read_state = 1");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/card/model/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */