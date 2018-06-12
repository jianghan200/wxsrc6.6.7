package com.tencent.mm.plugin.collect.b;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.e;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bih;
import com.tencent.mm.protocal.c.bii;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c.h;

public final class k
  extends h
{
  public bii hUk;
  
  public k(String paramString, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bih();
    ((b.a)localObject).dIH = new bii();
    ((b.a)localObject).dIF = 1800;
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/scanf2fmaterialcode";
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bih)this.diG.dID.dIL;
    ((bih)localObject).siX = paramString;
    ((bih)localObject).scene = paramInt;
    x.i("MicroMsg.NetSceneF2fMaterial", "req url: %s, %s", new Object[] { paramString, Integer.valueOf(paramInt) });
  }
  
  protected final void b(int paramInt1, int paramInt2, String paramString, q paramq)
  {
    this.hUk = ((bii)((b)paramq).dIE.dIL);
    x.i("MicroMsg.NetSceneF2fMaterial", "retcode: %s, retmsg: %s", new Object[] { Integer.valueOf(this.hUk.hUm), this.hUk.hUn });
    if (this.diJ != null) {
      this.diJ.a(paramInt1, paramInt2, paramString, this);
    }
  }
  
  protected final void f(q paramq)
  {
    paramq = (bii)((b)paramq).dIE.dIL;
    this.uXe = paramq.hUm;
    this.uXf = paramq.hUn;
  }
  
  public final int getType()
  {
    return 1800;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/collect/b/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */