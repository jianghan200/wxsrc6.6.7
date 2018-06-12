package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.m;
import com.tencent.mm.network.k;
import com.tencent.mm.protocal.c.bvk;
import com.tencent.mm.protocal.c.bvl;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.u;

public final class o
  extends l
  implements k
{
  public String chatroomName = null;
  public int daw = 0;
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  public String hKX = null;
  public String hLh = null;
  public int hLi = 0;
  
  public o(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new bvk();
    locala.dIH = new bvl();
    locala.uri = "/cgi-bin/micromsg-bin/upgradechatroom";
    locala.dIF = 482;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.chatroomName = paramString;
    ((bvk)this.diG.dID.dIL).rvj = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    bvl localbvl = (bvl)this.diG.dIE.dIL;
    x.d("MicroMsg.NetSceneUpgradeChatroom", "NetSceneUpgradeChatroom onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.hLh = localbvl.rXh;
    if (!bi.oW(this.hLh))
    {
      au.HU();
      paramArrayOfByte = c.Ga().ih(this.chatroomName);
      paramq = paramArrayOfByte;
      if (paramArrayOfByte == null) {
        paramq = new u();
      }
      paramq.fY(com.tencent.mm.model.q.GF(), this.hLh);
      m.a(paramq);
    }
    this.hKX = localbvl.rGJ;
    this.daw = localbvl.rGI;
    this.hLi = localbvl.rGK;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 482;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */