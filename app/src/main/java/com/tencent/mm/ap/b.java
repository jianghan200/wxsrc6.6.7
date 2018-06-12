package com.tencent.mm.ap;

import android.content.Context;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class b
  extends a
{
  public String bLe = null;
  public String ebL;
  public LinkedList<String> ebM = new LinkedList();
  public String ebN = null;
  public String text = null;
  
  public b(Map<String, String> paramMap, bd parambd)
  {
    super(paramMap, parambd);
  }
  
  protected final boolean Qi()
  {
    if (this.values == null)
    {
      x.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] values == null ");
      return false;
    }
    x.i("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bi.oV(this.TYPE), Integer.valueOf(this.values.size()) });
    if ((!bi.oW(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApproval")))
    {
      this.ebL = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.RoomName"));
      if (this.values.containsKey(ebD)) {
        this.text = bi.oV((String)this.values.get(ebD));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text")) {
        this.ebN = bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.text"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket")) {
        this.bLe = bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.ticket"));
      }
      this.ebF = this.text;
      if (!this.bXQ.cmC())
      {
        this.ebH.add(this.ebN);
        this.ebI.add(Integer.valueOf(this.ebF.length()));
        this.ebF += this.ebN;
        this.ebJ.add(Integer.valueOf(this.ebF.length()));
      }
      for (;;)
      {
        Iterator localIterator = this.values.keySet().iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          if (str.startsWith(".sysmsg.NewXmlChatRoomAccessVerifyApproval.link.memberlist.username")) {
            this.ebM.add(this.values.get(str));
          }
        }
        this.ebF = (this.ebF + " " + ad.getContext().getString(c.a.has_send_invite));
      }
      return true;
    }
    x.e("MicroMsg.ChatroomAccessVerifyApprovalNewXmlMsg", "[parseXml] type err :%s", new Object[] { bi.oV(this.TYPE) });
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ap/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */