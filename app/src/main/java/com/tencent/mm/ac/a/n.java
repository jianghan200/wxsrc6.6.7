package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ql;
import com.tencent.mm.protocal.c.qm;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public n(String paramString, xr paramxr, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new ql();
    ((b.a)localObject).dIH = new qm();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/createbizchatinfo";
    ((b.a)localObject).dIF = 1355;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (ql)this.diG.dID.dIL;
    ((ql)localObject).riK = paramString;
    ((ql)localObject).ruQ = paramxr;
    this.data = paramObject;
  }
  
  public final qm Nt()
  {
    if ((this.diG != null) && (this.diG.dIE.dIL != null)) {
      return (qm)this.diG.dIE.dIL;
    }
    return null;
  }
  
  public final ql Nu()
  {
    if ((this.diG != null) && (this.diG.dID.dIL != null)) {
      return (ql)this.diG.dID.dIL;
    }
    return null;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneCreateBizChatInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1355;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */