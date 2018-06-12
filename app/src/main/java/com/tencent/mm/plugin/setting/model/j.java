package com.tencent.mm.plugin.setting.model;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.bkj;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public j(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, 0);
  }
  
  public j(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bki();
    ((b.a)localObject).dIH = new bkj();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sendfeedback";
    ((b.a)localObject).dIF = 153;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bki)this.diG.dID.dIL;
    ((bki)localObject).sjX = paramString1;
    ((bki)localObject).jSA = paramString2;
    ((bki)localObject).rSC = paramInt;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSendSceneFeedBack", "onGYNetEnd type:" + paramInt2 + " code:" + paramInt3);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 153;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/setting/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */