package com.tencent.mm.plugin.aa.a.b;

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
  public static final String[] diD = { i.a(c.dhO, "AARecord") };
  private static final String[] eBa = { "*", "rowid" };
  public static Map<String, c> eBb = new HashMap();
  private e diF;
  
  public d(e parame)
  {
    super(parame, c.dhO, "AARecord", null);
    this.diF = parame;
  }
  
  public final boolean a(c paramc)
  {
    if ((paramc != null) && (eBb.containsKey(paramc.field_billNo))) {
      eBb.put(paramc.field_billNo, paramc);
    }
    return super.b(paramc);
  }
  
  public final boolean a(c paramc, String... paramVarArgs)
  {
    if ((paramc != null) && (eBb.containsKey(paramc.field_billNo))) {
      eBb.remove(paramc.field_billNo);
    }
    return super.a(paramc, paramVarArgs);
  }
  
  public final boolean b(c paramc)
  {
    if ((paramc != null) && (eBb.containsKey(paramc.field_billNo))) {
      eBb.put(paramc.field_billNo, paramc);
    }
    return super.a(paramc);
  }
  
  public final c pe(String paramString)
  {
    if (bi.oW(paramString)) {}
    for (;;)
    {
      return null;
      paramString = this.diF.a("AARecord", eBa, "billNo=?", new String[] { paramString }, null, null, null, 2);
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
        x.e("MicroMsg.AARecordStorage", "getRecordByBillno error: %s", new Object[] { localException.getMessage() });
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/aa/a/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */