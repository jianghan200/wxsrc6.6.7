package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.blu;
import com.tencent.mm.protocal.c.blv;
import com.tencent.mm.sdk.platformtools.x;

public final class m
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  
  public m(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    blu localblu = new blu();
    localblu.rvj = paramString1;
    localblu.rGv = paramString2;
    locala.dIG = localblu;
    locala.dIH = new blv();
    locala.uri = "/cgi-bin/micromsg-bin/setchatroomannouncement";
    locala.dIF = 993;
    locala.dII = 0;
    locala.dIJ = 0;
    this.diG = locala.KT();
  }
  
  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ab.e parame1)
  {
    this.diJ = parame1;
    return a(parame, this.diG, this);
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    x.w("MicroMsg.NetSceneSetChatRoomAnnouncement", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 993;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */