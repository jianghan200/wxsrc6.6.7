package com.tencent.mm.plugin.scanner.history.a;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "ScanHistoryItem") };
  public e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "ScanHistoryItem", null);
    this.diF = parame;
  }
  
  public final Cursor axc()
  {
    return this.diF.rawQuery("select * from ScanHistoryItem order by ScanTime desc", null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/scanner/history/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */