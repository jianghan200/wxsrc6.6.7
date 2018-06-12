package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.az.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import java.util.Arrays;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.q.class)
public class w
  extends a
  implements com.tencent.mm.ui.chatting.b.b.q
{
  String bSm = null;
  private String hev = null;
  boolean qLA = false;
  private boolean tQK = false;
  private Runnable tQL = new w.1(this);
  private Runnable tQM = new Runnable()
  {
    public final void run()
    {
      if (w.this.bAG != null)
      {
        Object localObject = (com.tencent.mm.ui.chatting.b.b.m)w.this.bAG.O(com.tencent.mm.ui.chatting.b.b.m.class);
        ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb().setLbsMode(false);
        ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb().qLG = false;
        ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb().cek();
        ChatFooter localChatFooter = ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb();
        if (localChatFooter.qLq != null) {
          localChatFooter.qLq.setVisibility(0);
        }
        localObject = ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb();
        if (((ChatFooter)localObject).qLn != null) {
          ((ChatFooter)localObject).qLn.setVisibility(0);
        }
      }
    }
  };
  private com.tencent.mm.sdk.b.c tQN = new w.3(this);
  
  public final void Fc(int paramInt)
  {
    Object localObject;
    if (this.hev != null)
    {
      localObject = String.format(this.bAG.tTq.getMMResources().getString(R.l.banner_lbs_mode_add_friends), new Object[] { bi.oV(com.tencent.mm.model.q.GH()) });
      localObject = new com.tencent.mm.pluginsdk.model.m(2, Arrays.asList(new String[] { this.bSm }), Arrays.asList(new Integer[] { Integer.valueOf(18) }), (String)localObject, "");
      au.DF().a((l)localObject, 0);
      this.tQK = true;
    }
    for (;;)
    {
      ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvs();
      return;
      localObject = d.SG().YS(this.bSm);
      au.DF().a(new com.tencent.mm.pluginsdk.model.m(this.bSm, ((ba)localObject).field_ticket, paramInt, (byte)0), 0);
      ((ba)localObject).field_flag = 2;
      d.SG().c((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    }
  }
  
  public final void a(Button paramButton, LinearLayout paramLinearLayout1, LinearLayout paramLinearLayout2)
  {
    if (this.hev != null)
    {
      if (this.tQK)
      {
        ((TextView)paramLinearLayout1.findViewById(R.h.add_friend_text)).setText(R.l.chatting_lbs_mode_addcontact_send);
        paramButton.setVisibility(8);
        return;
      }
      ((TextView)paramLinearLayout1.findViewById(R.h.add_friend_text)).setText(R.l.chatting_lbs_mode_addcontact_tips);
      ((Button)paramLinearLayout1.findViewById(R.h.chatting_addcontact_btn)).setText(R.l.chatting_lbs_mode_addcontact_btn);
      return;
    }
    paramButton = d.SG().YS(this.bSm);
    if (paramButton != null)
    {
      ((TextView)paramLinearLayout1.findViewById(R.h.add_friend_text)).setText(paramButton.field_sayhicontent);
      ((Button)paramLinearLayout1.findViewById(R.h.chatting_addcontact_btn)).setText(R.l.chatting_lbs_mode_addcontact_accept_btn);
      return;
    }
    paramLinearLayout2.setVisibility(8);
  }
  
  public final String aao(String paramString)
  {
    if (this.qLA)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.LbsComponent", "[oneliang]encrypt:" + this.bSm + ",raw:" + this.bAG.getTalkerUserName());
      if (bi.oW(this.bSm)) {
        return this.bAG.getTalkerUserName();
      }
      return this.bSm;
    }
    return paramString;
  }
  
  public final void aw(Intent paramIntent)
  {
    paramIntent.putExtra("Contact_IsLBSFriend", true);
    paramIntent.putExtra("Contact_IsLbsChattingProfile", true);
    paramIntent.putExtra("Contact_Scene", 18);
  }
  
  public final void cpF()
  {
    this.qLA = this.bAG.tTq.getBooleanExtra("lbs_mode", false).booleanValue();
    if (bi.oW(this.bAG.oLT.field_encryptUsername)) {}
    for (String str = this.bAG.getTalkerUserName();; str = this.bAG.oLT.field_encryptUsername)
    {
      this.bSm = str;
      this.hev = this.bAG.tTq.getStringExtra("lbs_ticket");
      return;
    }
  }
  
  public final void cpG()
  {
    if (this.qLA)
    {
      Object localObject = (com.tencent.mm.ui.chatting.b.b.m)this.bAG.O(com.tencent.mm.ui.chatting.b.b.m.class);
      ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb().setLbsMode(true);
      ChatFooter localChatFooter = ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb();
      if (localChatFooter.qLq != null) {
        localChatFooter.qLq.setVisibility(8);
      }
      localObject = ((com.tencent.mm.ui.chatting.b.b.m)localObject).cvb();
      if (((ChatFooter)localObject).qLn != null) {
        ((ChatFooter)localObject).qLn.setVisibility(8);
      }
    }
  }
  
  public final void cpH()
  {
    com.tencent.mm.sdk.b.a.sFg.b(this.tQN);
  }
  
  public final void cpI() {}
  
  public final void cpJ()
  {
    ah.M(this.tQL);
    ah.M(this.tQM);
  }
  
  public final void cpK()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.tQN);
  }
  
  public final boolean cvD()
  {
    return this.qLA;
  }
  
  public final boolean cvE()
  {
    if (this.qLA)
    {
      ba localba = d.SG().YS(this.bSm);
      if ((this.hev != null) || (localba != null)) {
        ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvs();
      }
      return true;
    }
    return false;
  }
  
  public final void g(com.tencent.mm.modelmulti.i parami)
  {
    Object localObject2 = null;
    Object localObject3;
    Object localObject1;
    if (this.qLA)
    {
      localObject3 = this.hev;
      localObject1 = d.SG();
      String str1 = this.bSm;
      String str2 = "SELECT * FROM " + ((bb)localObject1).getTableName() + " where sayhiencryptuser=? and isSend=0 and flag=0 ORDER BY createtime desc LIMIT 1";
      localObject1 = ((bb)localObject1).diF.b(str2, new String[] { str1 }, 2);
      if (localObject1 != null) {
        break label168;
      }
    }
    for (;;)
    {
      localObject1 = localObject3;
      if (localObject2 != null)
      {
        localObject1 = localObject3;
        if (!bi.oW(((ba)localObject2).field_ticket)) {
          localObject1 = ((ba)localObject2).field_ticket;
        }
      }
      localObject2 = localObject1;
      if (bi.oW((String)localObject1))
      {
        localObject3 = d.SG().YS(this.bSm);
        localObject2 = localObject1;
        if (localObject3 != null)
        {
          localObject2 = localObject1;
          if (!bi.oW(((ba)localObject3).field_ticket)) {
            localObject2 = ((ba)localObject3).field_ticket;
          }
        }
      }
      if (localObject2 != null) {
        parami.dZD = new com.tencent.mm.plugin.bbom.i((String)localObject2);
      }
      return;
      label168:
      if (!((Cursor)localObject1).moveToFirst())
      {
        ((Cursor)localObject1).close();
      }
      else
      {
        localObject2 = new ba();
        ((ba)localObject2).d((Cursor)localObject1);
        ((Cursor)localObject1).close();
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */