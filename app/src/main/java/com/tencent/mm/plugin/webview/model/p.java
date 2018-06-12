package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.c.b;
import com.tencent.mm.protocal.c.aoc;
import com.tencent.mm.protocal.c.aop;
import com.tencent.mm.protocal.c.aoq;
import com.tencent.mm.protocal.c.apd;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class p
  extends l
  implements k, c.b
{
  public final com.tencent.mm.ab.b diG;
  private com.tencent.mm.ab.e doG;
  private final int pRn;
  public aoc pRo;
  
  public p(aoc paramaoc, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, com.tencent.mm.bk.b paramb, int paramInt1, LinkedList<apd> paramLinkedList, int paramInt2)
  {
    x.i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", new Object[] { paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramString7, Integer.valueOf(paramInt1) });
    this.pRo = paramaoc;
    this.pRn = paramInt2;
    paramaoc = new b.a();
    paramaoc.dIG = new aop();
    paramaoc.dIH = new aoq();
    paramaoc.uri = "/cgi-bin/mmbiz-bin/jsapi-setauth";
    paramaoc.dIF = 1096;
    paramaoc.dII = 0;
    paramaoc.dIJ = 0;
    this.diG = paramaoc.KT();
    paramaoc = (aop)this.diG.dID.dIL;
    paramaoc.url = paramString1;
    paramaoc.bPS = paramString2;
    paramaoc.rQC = paramString3;
    paramaoc.bJT = paramString4;
    paramaoc.rQE = paramString5;
    paramaoc.signature = paramString6;
    paramaoc.rQF = paramString7;
    paramaoc.rQH = paramInt1;
    paramaoc.rQG = paramb;
    paramaoc.rQL = paramLinkedList;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int bUa()
  {
    return this.pRn;
  }
  
  public final int getType()
  {
    return 1096;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/webview/model/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */