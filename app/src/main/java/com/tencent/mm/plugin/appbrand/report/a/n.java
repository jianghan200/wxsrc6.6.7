package com.tencent.mm.plugin.appbrand.report.a;

import com.tencent.mm.plugin.appbrand.appcache.k;
import com.tencent.mm.plugin.appbrand.report.a;
import com.tencent.mm.plugin.report.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class n
{
  public final String appId;
  private int bMH;
  public final int fgJ;
  public final int gfU;
  private long gsp;
  public final boolean gsq;
  public boolean gsr;
  public boolean gss;
  public int gst;
  public int gsu;
  public long gsv;
  
  public n(String paramString, int paramInt1, int paramInt2)
  {
    if ("@LibraryAppId".equals(paramString)) {
      this.appId = "publiclib";
    }
    for (this.gsq = k.abF();; this.gsq = k.abE())
    {
      this.fgJ = paramInt1;
      this.gfU = paramInt2;
      return;
      this.appId = paramString;
    }
  }
  
  public final void amR()
  {
    this.gsp = (bi.VF() - this.gsv);
  }
  
  public final void lD(int paramInt)
  {
    if (!this.gsq) {
      return;
    }
    this.bMH = paramInt;
  }
  
  public final String toString()
  {
    return "kv_14609{appId='" + this.appId + '\'' + ", oldVersion=" + this.fgJ + ", targetVersion=" + this.gfU + ", spendTime=" + this.gsp + ", canUsePatchUpdate=" + this.gsq + ", isUpdateComplete=" + this.gsr + ", isUpdateCompleteWithPatch=" + this.gss + ", fullPkgSize=" + this.gst + ", patchSize=" + this.gsu + ", errcode=" + this.bMH + '}';
  }
  
  public final void xP()
  {
    int k = 1;
    x.i("MicroMsg.AppBrand.Report.kv_14609", "report %s", new Object[] { toString() });
    f localf = f.mDy;
    String str1 = this.appId;
    String str2 = a.cH(ad.getContext());
    int m = this.fgJ;
    int n = this.gfU;
    long l = this.gsp;
    int i;
    int j;
    if (this.gsq)
    {
      i = 1;
      if (!this.gsr) {
        break label199;
      }
      j = 1;
      label75:
      if (!this.gss) {
        break label204;
      }
    }
    for (;;)
    {
      localf.h(14609, new Object[] { str1, Integer.valueOf(1), str2, Integer.valueOf(m), Integer.valueOf(n), Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(this.gst), Integer.valueOf(this.gsu), Integer.valueOf(this.bMH) });
      return;
      i = 0;
      break;
      label199:
      j = 0;
      break label75;
      label204:
      k = 0;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/appbrand/report/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */