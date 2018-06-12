package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arw;
import com.tencent.mm.protocal.c.asb;
import com.tencent.mm.protocal.c.asc;

public final class x
  extends l
  implements k
{
  String appId;
  String bNH;
  final b diG;
  private com.tencent.mm.ab.e doG;
  
  public x(String paramString1, String paramString2, arw paramarw)
  {
    this.appId = paramString1;
    this.bNH = paramString2;
    paramString2 = new b.a();
    paramString2.dIG = new asb();
    paramString2.dIH = new asc();
    paramString2.uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_uploadcdninfo";
    paramString2.dIF = 1034;
    paramString2.dII = 0;
    paramString2.dIJ = 0;
    this.diG = paramString2.KT();
    paramString2 = (asb)this.diG.dID.dIL;
    paramString2.bPS = paramString1;
    paramString2.rUw = paramarw;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NetSceneUploadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1034;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webview/model/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */