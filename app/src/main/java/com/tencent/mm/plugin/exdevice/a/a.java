package com.tencent.mm.plugin.exdevice.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.x;

public abstract class a<RequestType extends com.tencent.mm.bk.a, ResponseType extends com.tencent.mm.bk.a>
  extends l
  implements k
{
  private com.tencent.mm.ab.e doG;
  protected b isw;
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.doG = parame1;
    if (this.isw == null)
    {
      parame1 = new b.a();
      parame1.dIF = getType();
      parame1.uri = getUri();
      parame1.dIG = aGw();
      parame1.dIH = aGx();
      parame1.dII = 0;
      parame1.dIJ = 0;
      this.isw = parame1.KT();
      g(this.isw.dID.dIL);
    }
    return a(parame, this.isw, this);
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.i("MicroMsg.BaseNetScene", "onGYNetEnd netId %d, errType %d, errCode %d, errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if (this.doG != null) {
      this.doG.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public abstract RequestType aGw();
  
  public abstract ResponseType aGx();
  
  public final ResponseType asj()
  {
    if ((this.isw != null) && (this.isw.dIE.dIL != null)) {
      return this.isw.dIE.dIL;
    }
    return null;
  }
  
  public void g(RequestType paramRequestType) {}
  
  public abstract String getUri();
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */