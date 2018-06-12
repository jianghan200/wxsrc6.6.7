package com.tencent.mm.plugin.freewifi.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.br;
import com.tencent.mm.protocal.c.bs;
import com.tencent.mm.sdk.platformtools.x;

public final class i
  extends l
  implements k
{
  private String bPS;
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  private i()
  {
    b.a locala = new b.a();
    locala.dIG = new br();
    locala.dIH = new bs();
    locala.uri = "/cgi-bin/mmo2o-bin/addcontact";
    locala.dIF = 1703;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public i(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    this();
    this.bPS = paramString1;
    br localbr = (br)this.diG.dID.dIL;
    localbr.rbW = paramString1;
    localbr.jPK = paramString2;
    localbr.qZe = paramInt;
    localbr.qZf = paramString3;
    x.i("MicroMsg.FreeWifi.NetSceneAddContact", "appid = %s", new Object[] { paramString1 });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.FreeWifi.NetSceneAddContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, appid = %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString, this.bPS });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1703;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/model/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */