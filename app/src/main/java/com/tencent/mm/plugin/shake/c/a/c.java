package com.tencent.mm.plugin.shake.c.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.protocal.c.bmi;
import com.tencent.mm.protocal.c.bmj;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  e mXj;
  
  public c(float paramFloat1, float paramFloat2, int paramInt, String paramString)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bmi();
    ((b.a)localObject).dIH = new bmj();
    ((b.a)localObject).uri = "/cgi-bin/mmbiz-bin/card/shakecard";
    ((b.a)localObject).dIF = 1250;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bmi)this.diG.dID.dIL;
    ((bmi)localObject).bSx = paramFloat2;
    ((bmi)localObject).bUg = paramFloat1;
    ((bmi)localObject).scene = paramInt;
    ((bmi)localObject).skB = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.NetSceneShakeCard", "onGYNetEnd, getType = 1250 errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (bmj)this.diG.dIE.dIL;
      if (paramq != null)
      {
        this.mXj = new e();
        this.mXj.hwF = paramq.hwF;
        this.mXj.huU = paramq.huU;
        this.mXj.cad = paramq.cad;
        this.mXj.title = paramq.title;
        this.mXj.huX = paramq.huX;
        this.mXj.huY = paramq.huY;
        this.mXj.hwh = paramq.hwh;
        this.mXj.huW = paramq.huW;
        this.mXj.dxh = paramq.dxh;
        this.mXj.mXk = paramq.mXk;
        this.mXj.mXn = paramq.mXn;
        this.mXj.mXo = paramq.mXo;
        this.mXj.mXp = paramq.mXp;
        this.mXj.mXq = paramq.mXq;
        this.mXj.mXr = paramq.mXr;
        this.mXj.end_time = paramq.end_time;
        this.mXj.mXs = paramq.mXs;
        this.mXj.mXt = paramq.mXt;
        m.buI().mXm = this.mXj.mXr;
      }
    }
    for (;;)
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
      this.mXj = new e();
      this.mXj.hwF = 3;
      this.mXj.mXr = m.buI().mXm;
      continue;
      this.mXj = new e();
      this.mXj.hwF = 3;
      this.mXj.mXr = m.buI().mXm;
    }
  }
  
  public final int getType()
  {
    return 1250;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/shake/c/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */