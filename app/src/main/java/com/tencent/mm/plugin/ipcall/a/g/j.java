package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements g.a
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(i.dhO, "IPCallPopularCountry") };
  public e diF;
  public m eKw = new j.1(this);
  
  public j(e parame)
  {
    super(parame, i.dhO, "IPCallPopularCountry", null);
    this.diF = parame;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final String getTableName()
  {
    return "IPCallPopularCountry";
  }
  
  public final void y(int paramInt, long paramLong)
  {
    i locali = new i();
    Cursor localCursor = this.diF.a("IPCallPopularCountry", null, "countryCode=?", new String[] { Integer.toString(paramInt) }, null, null, null, 2);
    boolean bool;
    if (!localCursor.moveToFirst())
    {
      x.i("MicroMsg.IPCallPopularCountryStorage", "get null with countryCode:" + paramInt);
      localCursor.close();
      locali.field_countryCode = paramInt;
      locali.field_lastCallTime = paramLong;
      locali.field_callTimeCount = 1L;
      bool = b(locali);
    }
    for (;;)
    {
      x.i("MicroMsg.IPCallPopularCountryStorage", "updatePopularCountryCode ret:" + bool);
      return;
      locali.d(localCursor);
      locali.field_callTimeCount += 1L;
      locali.field_lastCallTime = paramLong;
      bool = super.a(locali);
      localCursor.close();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */