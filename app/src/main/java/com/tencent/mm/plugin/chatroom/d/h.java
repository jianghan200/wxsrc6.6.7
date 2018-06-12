package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.b.b;
import com.tencent.mm.ab.b.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.aca;
import com.tencent.mm.protocal.c.acb;
import com.tencent.mm.sdk.platformtools.x;

public final class h
  extends l
  implements k
{
  public String chatroomName;
  private final b diG;
  private com.tencent.mm.ab.e diJ = null;
  public String hKX;
  public int hKY;
  public int hKZ;
  public int status;
  
  public h(String paramString)
  {
    b.a locala = new b.a();
    locala.dIG = new aca();
    locala.dIH = new acb();
    locala.uri = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
    locala.dIF = 519;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
    this.chatroomName = paramString;
    ((aca)this.diG.dID.dIL).rvj = paramString;
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    paramq = (acb)this.diG.dIE.dIL;
    x.d("MicroMsg.NetSceneGetChatRoomUpgradeStatus", "NetSceneGetChatRoomUpgradeStatus onGYNetEnd errType:%d, errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.status = paramq.hcd;
    this.hKX = paramq.rGJ;
    this.hKZ = paramq.rGK;
    this.hKX = paramq.rGJ;
    this.hKY = paramq.rGI;
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 519;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */