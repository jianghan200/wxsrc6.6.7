package com.tencent.mm.ap;

import android.content.Context;
import com.tencent.mm.plugin.chatroom.c.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.LinkedList;
import java.util.Map;

public final class d
  extends a
{
  public String bLe;
  public String ebL;
  public LinkedList<String> ebM = new LinkedList();
  public int ebO;
  public LinkedList<String> ebP = new LinkedList();
  public LinkedList<String> ebQ = new LinkedList();
  public String ebR = null;
  public String ebS = null;
  public String ebT = null;
  public String text = null;
  
  public d(Map<String, String> paramMap, bd parambd)
  {
    super(paramMap, parambd);
  }
  
  protected final boolean Qi()
  {
    int i = 0;
    if (this.values == null)
    {
      x.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] values == null ");
      return false;
    }
    x.i("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type:%s, values size:%s", new Object[] { bi.oV(this.TYPE), Integer.valueOf(this.values.size()) });
    if ((!bi.oW(this.TYPE)) && (this.TYPE.equalsIgnoreCase("NewXmlChatRoomAccessVerifyApplication")))
    {
      this.ebL = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.RoomName"));
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text")) {
        this.ebT = bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.text"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername")) {
        this.ebR = bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.inviterusername"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason")) {
        this.ebS = bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.invitationreason"));
      }
      if (this.values.containsKey(ebD)) {
        this.text = bi.oV((String)this.values.get(ebD));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket")) {
        this.bLe = ((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.ticket"));
      }
      if (this.values.containsKey(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize")) {
        this.ebO = bi.getInt((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.memberlistsize"), 0);
      }
      if (!this.bXQ.cmC())
      {
        this.ebI.add(Integer.valueOf(this.text.length()));
        this.ebH.add(this.ebT);
        this.ebF = (this.text + this.ebT);
        this.ebJ.add(Integer.valueOf(this.ebF.length()));
        if (i >= this.ebO) {
          break label755;
        }
        if (i != 0) {
          break label620;
        }
        this.ebM.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.username")));
        this.ebP.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.nickname")));
        this.ebQ.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member.headimgurl")));
      }
      for (;;)
      {
        i += 1;
        break;
        this.ebH.clear();
        this.ebI.clear();
        this.ebJ.clear();
        this.ebF = (this.text + " ");
        this.ebI.add(Integer.valueOf(this.ebF.length()));
        this.ebH.add(ad.getContext().getString(c.a.has_approve_info));
        this.ebF += ad.getContext().getString(c.a.has_approve_info);
        this.ebJ.add(Integer.valueOf(this.ebF.length()));
        break;
        label620:
        this.ebM.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".username")));
        this.ebP.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".nickname")));
        this.ebQ.add(bi.oV((String)this.values.get(".sysmsg.NewXmlChatRoomAccessVerifyApplication.link.memberlist.member" + i + ".headimgurl")));
      }
      label755:
      return true;
    }
    x.e("MicroMsg.ChatroomAccessVerifyApplicationNewXmlMsg", "[parseXml] type err :%s", new Object[] { bi.oV(this.TYPE) });
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ap/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */