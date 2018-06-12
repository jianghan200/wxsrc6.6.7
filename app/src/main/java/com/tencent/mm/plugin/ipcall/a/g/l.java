package com.tencent.mm.plugin.ipcall.a.g;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class l
  extends i<k>
{
  public static final String[] diD = { i.a(k.dhO, "IPCallRecord") };
  public static final String[] ksH = { "*", "rowid" };
  public e diF;
  
  public l(e parame)
  {
    super(parame, k.dhO, "IPCallRecord", null);
    this.diF = parame;
  }
  
  public final Cursor ET(String paramString)
  {
    return this.diF.query("IPCallRecord", ksH, "phonenumber=?", new String[] { paramString }, null, null, "calltime desc");
  }
  
  public final void a(k paramk)
  {
    if (paramk != null) {
      a(paramk.sKx, paramk);
    }
  }
  
  public final Cursor dQ(long paramLong)
  {
    return this.diF.query("IPCallRecord", ksH, "addressId=?", new String[] { String.valueOf(paramLong) }, null, null, "calltime desc");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/g/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */