package com.tencent.mm.plugin.remittance.b;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;
import java.util.Map;

public final class d
  extends i<c>
{
  public static final String[] diD = { i.a(c.dhO, "RemittanceRecord") };
  private static final String[] eBa = { "*", "rowid" };
  public static Map<String, c> eBb = new HashMap();
  private e diF;
  
  public d(e parame)
  {
    super(parame, c.dhO, "RemittanceRecord", null);
    this.diF = parame;
  }
  
  public final c Kx(String paramString)
  {
    if (bi.oW(paramString)) {
      return null;
    }
    paramString = this.diF.a("RemittanceRecord", eBa, "transferId=?", new String[] { paramString }, null, null, null, 2);
    try
    {
      if (paramString.moveToFirst())
      {
        c localc = new c();
        localc.d(paramString);
        return localc;
      }
      return null;
    }
    catch (Exception localException)
    {
      x.printErrStackTrace("MicroMsg.RemittanceSendRecordStorage", localException, "getRecordByTransferId error: %s", new Object[] { localException.getMessage() });
      return null;
    }
    finally
    {
      paramString.close();
    }
  }
  
  public final boolean a(c paramc)
  {
    if ((paramc != null) && (eBb.containsKey(paramc.field_transferId))) {
      eBb.put(paramc.field_transferId, paramc);
    }
    return super.a(paramc);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */