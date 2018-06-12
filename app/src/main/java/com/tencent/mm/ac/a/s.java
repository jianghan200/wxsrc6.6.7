package com.tencent.mm.ac.a;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.ado;
import com.tencent.mm.protocal.c.adp;
import com.tencent.mm.sdk.platformtools.x;

public final class s
  extends l
  implements k
{
  public b diG;
  private com.tencent.mm.ab.e diJ;
  
  public s(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new ado();
    locala.dIH = new adp();
    locala.uri = "/cgi-bin/mmocbiz-bin/getfavbizchatlist";
    locala.dIF = 1367;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((ado)this.diG.dID.dIL).riK = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    x.i("MicroMsg.brandservice.NetSceneGetFavBizChatList", "do scene");
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.d("MicroMsg.brandservice.NetSceneGetFavBizChatList", "onGYNetEnd code(%d, %d)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    if (this.diJ != null) {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
    }
  }
  
  public final int getType()
  {
    return 1367;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ac/a/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */