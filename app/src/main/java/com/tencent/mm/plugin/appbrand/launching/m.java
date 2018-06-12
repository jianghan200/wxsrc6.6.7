package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import java.util.List;

class m
  implements i
{
  final String appId;
  final int fmv;
  final String fqx;
  final List<WxaAttributes.e> fsl;
  final String fsn;
  final int gfL;
  final int gfM;
  final int gfw;
  
  m(String paramString1, int paramInt1, String paramString2, int paramInt2, int paramInt3, int paramInt4, String paramString3, List<WxaAttributes.e> paramList)
  {
    this.appId = paramString1;
    this.fmv = paramInt1;
    this.fqx = paramString2;
    this.gfw = paramInt2;
    this.gfL = paramInt3;
    this.gfM = paramInt4;
    this.fsn = paramString3;
    this.fsl = paramList;
  }
  
  public final void onDownloadProgress(int paramInt) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/launching/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */