package com.tencent.mm.aq;

import com.tencent.mm.a.e;
import com.tencent.mm.bk.b;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.b;
import com.tencent.mm.protocal.c.auy;
import com.tencent.mm.protocal.c.bhz;
import com.tencent.mm.sdk.platformtools.bi;

@Deprecated
public final class l
  extends h.b
{
  private auy ecl = new auy();
  
  public l(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, int paramInt, String paramString9, String paramString10)
  {
    super(1);
    this.ecl.rXT = 2048;
    this.ecl.rvi = new bhz().VO(bi.oV(paramString1));
    this.ecl.rQz = new bhz().VO(bi.oV(paramString2));
    this.ecl.ray = 0;
    this.ecl.rXU = new bhz().VO(bi.oV(paramString3));
    this.ecl.rXV = new bhz().VO(bi.oV(paramString4));
    this.ecl.hcd = 0;
    paramString2 = e.e(bi.oV(paramString5), 0, -1);
    paramString3 = this.ecl;
    if (paramString2 == null)
    {
      paramString1 = new byte[0];
      paramString3.rXR = new b(paramString1);
      paramString1 = this.ecl;
      if (paramString2 != null) {
        break label305;
      }
    }
    label305:
    for (int i = 0;; i = paramString2.length)
    {
      paramString1.rXQ = i;
      this.ecl.eJH = 0;
      this.ecl.eJL = 0;
      this.ecl.eJK = bi.oV(paramString6);
      this.ecl.eJJ = bi.oV(paramString7);
      this.ecl.eJI = bi.oV(paramString8);
      this.ecl.raB = paramInt;
      this.ecl.rTg = bi.oV(paramString9);
      this.ecl.rYa = 0;
      this.ecl.eJM = bi.oV(paramString10);
      this.ecl.rTi = 0;
      this.ecl.rTh = "";
      this.lcH = this.ecl;
      return;
      paramString1 = paramString2;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/aq/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */