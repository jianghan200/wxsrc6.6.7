package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aon;
import com.tencent.mm.protocal.c.aoo;
import com.tencent.mm.sdk.platformtools.x;

public final class o
  extends l
  implements k, c.b
{
  private final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  public c.a pRl;
  private final int pRn;
  
  public o(c.a parama, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, byte[] paramArrayOfByte, int paramInt)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "NetSceneJSAPIRealtimeVerify doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7 });
    this.pRl = parama;
    this.pRn = paramInt;
    parama = new b.a();
    parama.dIG = new aon();
    parama.dIH = new aoo();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-realtimeverify";
    parama.dIF = 1094;
    parama.dII = 0;
    parama.dIJ = 0;
    this.diG = parama.KT();
    parama = (aon)this.diG.dID.dIL;
    parama.url = paramString1;
    parama.bPS = paramString2;
    parama.rQC = paramString3;
    parama.bJT = paramString4;
    parama.rQE = paramString5;
    parama.signature = paramString6;
    parama.rQF = paramString7;
    parama.rQG = com.tencent.mm.bk.b.bi(paramArrayOfByte);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int bUa()
  {
    return this.pRn;
  }
  
  public final aoo bUc()
  {
    if (this.diG == null) {
      return null;
    }
    return (aoo)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 1094;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/webview/model/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */