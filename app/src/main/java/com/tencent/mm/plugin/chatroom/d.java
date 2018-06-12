package com.tencent.mm.plugin.chatroom;

import com.tencent.mm.bt.h.d;
import com.tencent.mm.g.a.jv;
import com.tencent.mm.g.a.jw;
import com.tencent.mm.g.a.jx;
import com.tencent.mm.g.a.jy;
import com.tencent.mm.g.a.kc;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ar;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bs;
import com.tencent.mm.model.bv;
import java.util.HashMap;

public class d
  implements ar
{
  private static com.tencent.mm.plugin.chatroom.c.a hKH;
  private com.tencent.mm.pluginsdk.c.c<jv> hKB = new d.1(this);
  private com.tencent.mm.pluginsdk.c.c<jy> hKC = new d.2(this);
  private com.tencent.mm.pluginsdk.c.c<jx> hKD = new d.3(this);
  private com.tencent.mm.pluginsdk.c.c<kc> hKE = new d.4(this);
  private com.tencent.mm.pluginsdk.c.c<jw> hKF = new d.5(this);
  private com.tencent.mm.sdk.b.c hKG = new d.6(this);
  
  private static d aAs()
  {
    au.HN();
    d locald2 = (d)bs.iK("plugin.chatroom");
    if (locald2 == null)
    {
      d locald1 = locald2;
      if (locald2 == null) {}
      try
      {
        locald1 = new d();
        au.HN().a("plugin.chatroom", locald1);
        return locald1;
      }
      finally {}
    }
    return locald2;
  }
  
  private static com.tencent.mm.plugin.chatroom.c.a aAt()
  {
    g.Eg().Ds();
    aAs();
    if (hKH == null)
    {
      aAs();
      hKH = new com.tencent.mm.plugin.chatroom.c.a();
    }
    aAs();
    return hKH;
  }
  
  public final HashMap<Integer, h.d> Ci()
  {
    return null;
  }
  
  public final void bn(boolean paramBoolean)
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.hKG);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKB);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKF);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKC);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKD);
    com.tencent.mm.sdk.b.a.sFg.b(this.hKE);
    com.tencent.mm.plugin.chatroom.c.a locala = aAt();
    au.getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApplication", locala.hKS, true);
    au.getSysCmdMsgExtension().a("NewXmlChatRoomAccessVerifyApproval", locala.hKS, true);
  }
  
  public final void bo(boolean paramBoolean) {}
  
  public final void gi(int paramInt) {}
  
  public final void onAccountRelease()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.hKG);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKB);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKF);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKC);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKD);
    com.tencent.mm.sdk.b.a.sFg.c(this.hKE);
    com.tencent.mm.plugin.chatroom.c.a locala = aAt();
    au.getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApplication", locala.hKS, true);
    au.getSysCmdMsgExtension().b("NewXmlChatRoomAccessVerifyApproval", locala.hKS, true);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */