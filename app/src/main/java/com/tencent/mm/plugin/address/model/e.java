package com.tencent.mm.plugin.address.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.address.a.a;
import com.tencent.mm.protocal.c.bey;
import com.tencent.mm.protocal.c.bfa;
import com.tencent.mm.protocal.c.bfb;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class e
  extends com.tencent.mm.ab.l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  public boolean eXH;
  public String nickname;
  public String username;
  
  public e(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bfa();
    ((b.a)localObject).dIH = new bfb();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/rcptinfoquery";
    ((b.a)localObject).dIF = 417;
    ((b.a)localObject).dII = 202;
    ((b.a)localObject).dIJ = 1000000202;
    this.diG = ((b.a)localObject).KT();
    localObject = (bfa)this.diG.dID.dIL;
    ((bfa)localObject).timestamp = 0;
    ((bfa)localObject).sgG = paramString1;
    ((bfa)localObject).bPS = paramString2;
    ((bfa)localObject).scene = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    boolean bool = true;
    x.d("MicroMsg.NetSceneRcptInfoQuery", "errType:" + paramInt2 + ",errCode:" + paramInt3 + ",errMsg" + paramString);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bfb)((b)paramq).dIE.dIL;
      this.username = paramq.iEL;
      this.nickname = paramq.sgJ;
      if (paramq.sgI != 1) {
        break label186;
      }
    }
    for (;;)
    {
      this.eXH = bool;
      if (paramq.sgt.sgw != null)
      {
        x.d("MicroMsg.NetSceneRcptInfoQuery", "resp.rImpl.rcptinfolist.rcptinfolist " + paramq.sgt.sgw.size());
        a.Zv();
        a.Zx().q(paramq.sgt.sgw);
        a.Zv();
        a.Zx().Zz();
      }
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      label186:
      bool = false;
    }
  }
  
  public final int getType()
  {
    return 417;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/address/model/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */