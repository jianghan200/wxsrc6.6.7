package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.but;
import com.tencent.mm.protocal.c.buu;
import com.tencent.mm.protocal.c.hs;
import com.tencent.mm.sdk.platformtools.x;

public final class w
  extends l
  implements k
{
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public w(String paramString, hs paramhs, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new but();
    ((b.a)localObject).dIH = new buu();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchat";
    ((b.a)localObject).dIF = 1356;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (but)this.diG.dID.dIL;
    ((but)localObject).riK = paramString;
    ((but)localObject).rDx = paramhs;
    this.data = paramObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneUpdateBizChat", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneUpdateBizChat", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1356;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/a/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */