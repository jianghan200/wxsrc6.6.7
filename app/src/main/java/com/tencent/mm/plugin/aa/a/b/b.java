package com.tencent.mm.plugin.aa.a.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "AAPayRecord") };
  private static final String[] eBa = { "*", "rowid" };
  private e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "AAPayRecord", null);
    this.diF = parame;
  }
  
  public final a pd(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      paramString = this.diF.a("AAPayRecord", eBa, "payMsgId=?", new String[] { paramString }, null, null, null, 2);
      try
      {
        if (paramString.moveToFirst())
        {
          a locala = new a();
          locala.d(paramString);
          return locala;
        }
        return null;
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.AAPayRecordStorage", "getByPayMsgId error: %s", new Object[] { localException.getMessage() });
        return null;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */