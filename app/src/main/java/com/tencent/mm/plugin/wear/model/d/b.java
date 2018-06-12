package com.tencent.mm.plugin.wear.model.d;

import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.bd;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.cfa;
import com.tencent.mm.protocal.c.cfb;
import com.tencent.mm.sdk.platformtools.x;

public final class b
  extends l
  implements k
{
  private com.tencent.mm.ab.b dZf;
  private com.tencent.mm.ab.e diJ;
  
  public b(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIF = 976;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendyo";
    ((b.a)localObject).dIG = new cfa();
    ((b.a)localObject).dIH = new cfb();
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.dZf = ((b.a)localObject).KT();
    localObject = (cfa)this.dZf.dID.dIL;
    ((cfa)localObject).jTu = paramString;
    ((cfa)localObject).rWU = ((cfa)localObject).lOH;
    ((cfa)localObject).lOH = ((int)bd.iD(paramString));
    ((cfa)localObject).hcE = 63;
    ((cfa)localObject).szG = 1;
    ((cfa)localObject).hbF = 1;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.dZf, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.Wear.NetSceneSendYo", "onGYNetEnd netId = " + paramInt1 + " errType = " + paramInt2 + " errCode = " + paramInt3 + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 976;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/wear/model/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */