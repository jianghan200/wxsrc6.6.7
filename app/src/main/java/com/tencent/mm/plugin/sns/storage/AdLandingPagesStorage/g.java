package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage;

import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.sdk.platformtools.x;

public final class g
{
  public String bSZ;
  public int cXB;
  public long cYb;
  public String extra = "";
  public int iVN;
  public int iVO;
  public int jzg;
  public int nBk;
  public int nIF;
  public int nIG;
  public int nIH;
  public int nII;
  public int nIJ;
  public int nIK;
  public int nIL;
  public int nIM;
  public String nIN;
  public String nIO;
  public String nIP;
  public String ntU;
  public String ntX;
  
  public final String bAC()
  {
    long l1 = 0L;
    try
    {
      long l2 = i.LP(this.bSZ);
      l1 = l2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        StringBuilder localStringBuilder;
        String str1;
        x.e("AdLandingPagesReportInfo", "", new Object[] { localException });
        continue;
        String str2 = this.ntX;
      }
    }
    localStringBuilder = new StringBuilder().append(i.eF(l1)).append(",").append(this.ntU).append(",").append(this.nIF).append(",").append(this.cXB).append(",").append(this.nIG).append(",").append(this.nIH).append(",").append(this.nII).append(",").append(this.nIJ).append(",").append(this.nIK).append(",").append(this.nIL).append(",").append(this.nIM).append(",").append(this.iVO).append(",").append(this.iVN).append(",").append(this.jzg).append(",").append(this.nIN).append(",").append(this.cYb).append(",").append(this.nIO).append(",");
    if (this.ntX == null)
    {
      str1 = "";
      return str1 + "," + this.extra + "," + this.nBk + "," + this.nIP;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */