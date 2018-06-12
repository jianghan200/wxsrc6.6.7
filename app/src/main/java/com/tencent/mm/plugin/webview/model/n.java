package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.a;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aol;
import com.tencent.mm.protocal.c.aom;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class n
  extends l
  implements k, c.b
{
  public final b diG;
  private com.tencent.mm.ab.e doG;
  public String gsE;
  public c.a pRl;
  private final int pRn;
  
  public n(c.a parama, String paramString1, String paramString2, LinkedList<String> paramLinkedList, String paramString3, String paramString4, String paramString5, String paramString6, int paramInt1, String paramString7, int paramInt2)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6 });
    this.pRl = parama;
    this.gsE = paramString1;
    this.pRn = paramInt2;
    parama = new b.a();
    parama.dIG = new aol();
    parama.dIH = new aom();
    parama.uri = "/cgi-bin/mmbiz-bin/jsapi-preverify";
    parama.dIF = 1093;
    parama.dII = 0;
    parama.dIJ = 0;
    this.diG = parama.KT();
    parama = (aol)this.diG.dID.dIL;
    parama.url = paramString1;
    parama.bPS = paramString2;
    parama.rQU = paramLinkedList;
    parama.bJT = paramString3;
    parama.rQE = paramString4;
    parama.signature = paramString5;
    parama.rQF = paramString6;
    parama.scene = paramInt1;
    parama.rQV = paramString7;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int bUa()
  {
    return this.pRn;
  }
  
  public final aom bUb()
  {
    if (this.diG == null) {
      return null;
    }
    return (aom)this.diG.dIE.dIL;
  }
  
  public final int getType()
  {
    return 1093;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */