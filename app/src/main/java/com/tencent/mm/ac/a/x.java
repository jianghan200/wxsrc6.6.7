package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.bur;
import com.tencent.mm.protocal.c.bus;
import com.tencent.mm.protocal.c.hv;

public final class x
  extends l
  implements k
{
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public x(String paramString1, String paramString2, hv paramhv1, hv paramhv2, Object paramObject)
  {
    Object localObject = new b.a();
    ((b.a)localObject).dIG = new bur();
    ((b.a)localObject).dIH = new bus();
    ((b.a)localObject).uri = "/cgi-bin/mmocbiz-bin/updatebizchatmemberlist";
    ((b.a)localObject).dIF = 1357;
    ((b.a)localObject).dII = 0;
    ((b.a)localObject).dIJ = 0;
    this.diG = ((b.a)localObject).KT();
    localObject = (bur)this.diG.dID.dIL;
    ((bur)localObject).riK = paramString1;
    ((bur)localObject).riE = paramString2;
    ((bur)localObject).srQ = paramhv1;
    ((bur)localObject).srR = paramhv2;
    this.data = paramObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.brandservice.NetSceneUpdateBizChatMemberList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1357;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ac/a/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */