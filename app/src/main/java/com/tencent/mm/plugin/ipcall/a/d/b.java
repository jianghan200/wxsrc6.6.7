package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bbx;
import com.tencent.mm.protocal.c.bby;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b diG = null;
  private com.tencent.mm.ab.e diJ;
  private bbx krh = null;
  public bby kri = null;
  
  public b(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt)
  {
    b.a locala = new b.a();
    locala.dIG = new bbx();
    locala.dIH = new bby();
    locala.dIF = 807;
    locala.uri = "/cgi-bin/micromsg-bin/pstnchecknumber";
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.krh = ((bbx)this.diG.dID.dIL);
    this.krh.sei = paramString1;
    this.krh.sek = paramString2;
    this.krh.sem = paramString3;
    this.krh.sel = paramString4;
    this.krh.sen = paramInt;
    x.i("MicroMsg.NetSceneIPCallCheckNumber", "NetSceneIPCallCheckNumber pureNumber:%s,lastCountry:%s,osCountry:%s,simCountry:%s,dialScene:%d", new Object[] { paramString1, paramString2, paramString3, paramString4, Integer.valueOf(paramInt) });
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneIPCallCheckNumber", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.kri = ((bby)((com.tencent.mm.ab.b)paramq).dIE.dIL);
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 807;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/a/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */