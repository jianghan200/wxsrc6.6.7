package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ym;
import com.tencent.mm.protocal.c.yn;
import com.tencent.mm.sdk.platformtools.x;

public final class d
  extends l
  implements k
{
  private b diG;
  private com.tencent.mm.ab.e diJ;
  
  public d(String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ym();
    ((b.a)localObject).dIH = new yn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/generalset";
    ((b.a)localObject).dIF = 177;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ym)this.diG.dID.dIL;
    ((ym)localObject).rwJ = 1;
    ((ym)localObject).rEm = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    x.d("MicroMsg.NetSceneGeneralSet", "doScene");
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneGeneralSet", "onGYNetEnd errType:" + paramInt2 + " errCode:" + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 177;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/setting/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */