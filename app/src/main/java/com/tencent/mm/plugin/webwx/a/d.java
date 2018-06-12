package com.tencent.mm.plugin.webwx.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.uu;
import com.tencent.mm.protocal.c.uv;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  final b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public d(String paramString)
  {
    b.a locala = new b.a();
    uu localuu = new uu();
    uv localuv = new uv();
    locala.dIG = localuu;
    locala.dIH = localuv;
    locala.uri = "/cgi-bin/micromsg-bin/extdeviceloginconfirmget";
    locala.dIF = 971;
    locala.dII = 0;
    locala.dIJ = 0;
    this.dZf = locala.KT();
    localuu.rya = paramString;
    x.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "[oneliang][NetSceneExtDeviceLoginConfirmGet]loginUrl:%s", new Object[] { paramString });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneExtDeviceLoginConfirmGet", "onGYNetEnd  errType:" + paramInt2 + " errCode:" + paramInt3 + " errMsg:" + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 971;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/webwx/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */