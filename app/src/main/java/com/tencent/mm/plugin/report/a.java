package com.tencent.mm.plugin.report;

import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.report.service.j;
import com.tencent.mm.sdk.platformtools.ac;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.HashMap;

public abstract class a
{
  private static boolean mDt = false;
  private StringBuffer mDu = new StringBuffer();
  
  public static void hr(boolean paramBoolean)
  {
    mDt = paramBoolean;
  }
  
  public final boolean KD(String paramString)
  {
    if (bi.oW(paramString))
    {
      eo("", "check rpt value is null.");
      return false;
    }
    if (paramString.length() >= 7168)
    {
      eo("", "check rpt value more than 7k.");
      return false;
    }
    return true;
  }
  
  public final boolean RD()
  {
    int i = getId();
    Object localObject = wE();
    x.v("MicroMsg.AbsReportStruct", "report %d %s", new Object[] { Integer.valueOf(getId()), wE() });
    if ((i > 0) && (!bi.oW((String)localObject)))
    {
      h.mEJ.k(getId(), wE());
      if (mDt)
      {
        localObject = j.brV();
        String str1 = wE();
        String str2 = wF();
        String str3 = "\r\n\r\n error:\r\n" + this.mDu.toString();
        if ((((j)localObject).mDt) && (((j)localObject).mFc != null))
        {
          x.v("MicroMsg.SubCoreReport", "put kv info [%s %s %s]", new Object[] { str1, str2, str3 });
          ((j)localObject).mFc.put(ac.ce(str1), str2 + str3);
        }
      }
      return true;
    }
    return false;
  }
  
  public final boolean ae(String paramString, long paramLong)
  {
    boolean bool = true;
    if (paramLong <= 151473600L)
    {
      bool = false;
      eo(paramString, String.valueOf(paramLong));
    }
    return bool;
  }
  
  public final void eo(String paramString1, String paramString2)
  {
    x.w("MicroMsg.AbsReportStruct", "error report [%d] msg[%s %s]", new Object[] { Integer.valueOf(getId()), paramString1, paramString2 });
    this.mDu.append(paramString1).append(":").append(paramString2).append("\r\n");
  }
  
  public abstract int getId();
  
  public abstract String wE();
  
  public abstract String wF();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/report/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */