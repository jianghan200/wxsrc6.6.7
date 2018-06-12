package com.tencent.mm.plugin.shake.d.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.axf;
import com.tencent.mm.protocal.c.axg;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public c(int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new axf();
    ((b.a)localObject).dIH = new axg();
    ((b.a)localObject).uri = "/cgi-bin/mmoctv/optvhist";
    ((b.a)localObject).dIF = 1740;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (axf)this.diG.dID.dIL;
    ((axf)localObject).jRb = paramInt;
    ((axf)localObject).sap = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneOpTvHist", "onGYNetEnd [%d,%d]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 1740;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/shake/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */