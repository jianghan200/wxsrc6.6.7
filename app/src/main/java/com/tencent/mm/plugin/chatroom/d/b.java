package com.tencent.mm.plugin.chatroom.d;

import com.tencent.mm.ab.a;
import com.tencent.mm.ab.b.a;
import com.tencent.mm.protocal.c.dv;
import com.tencent.mm.protocal.c.dw;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.LinkedList;

public final class b
  extends a<dw>
{
  public b(String paramString1, String paramString2, String paramString3, LinkedList<String> paramLinkedList)
  {
    x.d("MicroMsg.CgiApproveAddChatRoomMember", "inviterusername%s,roomname:%s,ticket:%s,username:%s", new Object[] { paramString1, paramString2, bi.Xf(paramString3), paramLinkedList });
    dv localdv = new dv();
    localdv.ebR = paramString1;
    localdv.reg = paramString2;
    localdv.bLe = paramString3;
    localdv.reh = paramLinkedList;
    paramString1 = new b.a();
    paramString1.dIG = localdv;
    paramString1.dIH = new dw();
    paramString1.uri = "/cgi-bin/micromsg-bin/approveaddchatroommember";
    paramString1.dIF = 774;
    this.diG = paramString1.KT();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */