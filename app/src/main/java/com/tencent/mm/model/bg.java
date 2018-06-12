package com.tencent.mm.model;

import com.tencent.mm.ab.l;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class bg
  extends l
  implements k
{
  private final a dCJ;
  private final String dCK;
  private long dCL;
  private com.tencent.mm.ab.e diJ;
  
  public bg(a parama)
  {
    this(parama, null);
  }
  
  public bg(a parama, String paramString)
  {
    x.i("MicroMsg.NetSceneLocalProxy", "init LocalProxy task:%s [%s] ", new Object[] { paramString, bi.cjd() });
    this.dCJ = parama;
    this.dCK = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    c(parame);
    this.diJ = parame1;
    this.dCL = bi.VG();
    g.Em().H(new Runnable()
    {
      public final void run()
      {
        bg.this.a(0, 0, 0, null, null, null);
      }
      
      public final String toString()
      {
        return super.toString() + "|doScene";
      }
    });
    return 0;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if (this.dCJ != null)
    {
      x.d("MicroMsg.NetSceneLocalProxy", "local proxy [%s] end, cost=%d", new Object[] { this.dCK, Long.valueOf(bi.bI(this.dCL)) });
      this.dCJ.a(this.dIX);
    }
    this.diJ.a(0, 0, null, this);
  }
  
  public final int getType()
  {
    return 0;
  }
  
  public static abstract interface a
  {
    public abstract void a(com.tencent.mm.network.e parame);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/model/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */