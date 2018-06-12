package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.alf;
import com.tencent.mm.protocal.c.alg;

public final class j
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  
  public j(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new alf();
    locala.dIH = new alg();
    locala.uri = "/cgi-bin/micromsg-bin/grantbigchatroom";
    locala.dIF = 339;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    ((alf)this.diG.dID.dIL).jTu = paramString;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGrantBigChatRoom", "grant to userName :" + paramString);
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NetSceneGrantBigChatRoom", "onGYNetEnd " + paramInt2 + " " + paramInt3 + "  " + paramString);
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.diJ.a(paramInt2, paramInt3, paramString, this);
      return;
    }
    au.HU();
    paramInt1 = ((Integer)c.DT().get(135176, Integer.valueOf(0))).intValue();
    if (paramInt1 - 1 >= 0)
    {
      au.HU();
      c.DT().set(135176, Integer.valueOf(paramInt1 - 1));
    }
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 339;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */