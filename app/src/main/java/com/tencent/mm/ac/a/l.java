package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.hx;
import com.tencent.mm.protocal.c.hy;
import com.tencent.mm.sdk.platformtools.x;

public final class l
  extends com.tencent.mm.ab.l
  implements k
{
  private Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public l(String paramString1, String paramString2, int paramInt)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new hx();
    ((b.a)localObject).dIH = new hy();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/bizchatsearchcontact";
    ((b.a)localObject).dIF = 1364;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (hx)this.diG.dID.dIL;
    ((hx)localObject).riK = paramString1;
    ((hx)localObject).bHt = paramString2;
    ((hx)localObject).offset = paramInt;
    this.data = null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.NetSceneBizChatSearchContact", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.NetSceneBizChatSearchContact", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1364;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ac/a/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */