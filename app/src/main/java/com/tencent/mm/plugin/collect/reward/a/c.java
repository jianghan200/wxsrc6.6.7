package com.tencent.mm.plugin.collect.reward.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bik;
import com.tencent.mm.protocal.c.bil;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class c
  extends h
{
  public bil hUZ;
  
  public c(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bik();
    ((b.a)localObject).dIH = new bil();
    ((b.a)localObject).dIF = 2811;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanrewardmaterialcode";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bik)this.diG.dID.dIL;
    ((bik)localObject).siX = paramString;
    ((bik)localObject).scene = paramInt;
    x.i("MicroMsg.NetSceneQrRewardMaterial", "req url: %s, %s", new Object[] { paramString, Integer.valueOf(paramInt) });
  }
  
  public final boolean aBQ()
  {
    return true;
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    this.hUZ = ((bil)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneQrRewardMaterial", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hUZ.hUm), this.hUZ.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bil)((b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 2811;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/collect/reward/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */