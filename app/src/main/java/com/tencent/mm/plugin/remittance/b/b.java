package com.tencent.mm.plugin.remittance.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends i<a>
{
  public static final String[] diD = { i.a(a.dhO, "DelayTransferRecord") };
  private static final String[] eBa = { "*", "rowid" };
  private e diF;
  
  public b(e parame)
  {
    super(parame, a.dhO, "DelayTransferRecord", null);
    this.diF = parame;
  }
  
  public final a Kw(String paramString)
  {
    if (bi.oW(paramString)) {
      x.i("MicroMsg.AARecordStorage", "empty transferId");
    }
    for (;;)
    {
      return null;
      paramString = this.diF.a("DelayTransferRecord", eBa, "transferId=?", new String[] { paramString }, null, null, null, 2);
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
        x.printErrStackTrace("MicroMsg.AARecordStorage", localException, "", new Object[0]);
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */