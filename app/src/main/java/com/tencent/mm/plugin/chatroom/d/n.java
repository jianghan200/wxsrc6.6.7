package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.b;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.ab.l;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.btu;
import com.tencent.mm.protocal.c.btv;
import com.tencent.mm.sdk.platformtools.x;

public final class n
  extends l
  implements k
{
  private final b diG;
  private com.tencent.mm.ab.e diJ;
  public String username;
  
  public n(String paramString1, String paramString2)
  {
    b.a locala = new b.a();
    this.username = paramString2;
    btu localbtu = new btu();
    localbtu.rvj = paramString1;
    localbtu.srm = paramString2;
    locala.dIG = localbtu;
    locala.dIH = new btv();
    locala.uri = "/cgi-bin/micromsg-bin/transferchatroomowner";
    locala.dIF = 990;
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
    x.w("MicroMsg.NetSceneTransferChatRoomOwner", "errType = " + paramInt2 + " errCode " + paramInt3 + " errMsg " + paramString);
    this.diJ.a(paramInt2, paramInt3, paramString, this);
  }
  
  public final int getType()
  {
    return 990;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */