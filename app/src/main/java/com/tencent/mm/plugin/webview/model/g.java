package com.tencent.mm.plugin.webview.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.arx;
import com.tencent.mm.protocal.c.ary;
import com.tencent.mm.sdk.platformtools.x;

public final class g
  extends l
  implements k
{
  String appId;
  final b diG;
  private com.tencent.mm.ab.e doG;
  String fnN;
  
  public g(String paramString1, String paramString2)
  {
    this.appId = paramString1;
    this.fnN = paramString2;
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new arx();
    ((b.a)localObject).dIH = new ary();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_downloadcdninfo";
    ((b.a)localObject).dIF = 1035;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (arx)this.diG.dID.dIL;
    ((arx)localObject).bPS = paramString1;
    ((arx)localObject).rUv = paramString2;
    x.i("MicroMsg.NetSceneDownloadCdnInfo", "download cdn info, appid : %s, mediaId : %s", new Object[] { paramString1, paramString2 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneDownloadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.doG.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1035;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/webview/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */