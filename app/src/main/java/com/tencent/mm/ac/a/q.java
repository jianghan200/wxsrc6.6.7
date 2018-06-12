package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.aan;
import com.tencent.mm.protocal.c.aao;
import com.tencent.mm.sdk.platformtools.x;

public final class q
  extends l
  implements k
{
  Object data;
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public q(String paramString, Object paramObject)
  {
    b.a locala = new b.a();
    locala.dIG = new aan();
    locala.dIH = new aao();
    locala.uri = "/cgi-bin/mmocbiz-bin/getbizchatmyuserinfo";
    locala.dIF = 1354;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((aan)this.diG.dID.dIL).riK = paramString;
    this.data = paramObject;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneGetBizChatMyUserInfo", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1354;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ac/a/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */