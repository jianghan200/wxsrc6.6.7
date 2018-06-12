package com.tencent.mm.plugin.brandservice.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ase;
import com.tencent.mm.protocal.c.asf;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ase();
    locala.dIH = new asf();
    locala.uri = "/cgi-bin/mmbiz-bin/usrmsg/getallrecvtmpmsgoption";
    locala.dIF = 1031;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ase)this.diG.dID.dIL).rPS = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneGetAllRecvTmpMsgOption", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1031;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/brandservice/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */