package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.r;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.ChattingUI;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.contact.SelectContactUI;
import com.tencent.mm.ui.contact.y;
import com.tencent.mm.ui.transmit.SelectConversationUI;
import com.tencent.mm.ui.x;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.d.class)
public class d
  extends a
  implements com.tencent.mm.ui.chatting.b.b.d
{
  private boolean f(int paramInt1, int paramInt2, Intent paramIntent)
  {
    String str1;
    switch (paramInt1)
    {
    default: 
      return false;
    case 223: 
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        str1 = paramIntent.getStringExtra("be_send_card_name");
        if ((!this.bAG.cwr()) || (!ab.XR(str1))) {
          break;
        }
      }
      break;
    }
    try
    {
      h.a(this.bAG.tTq.getActivity(), this.bAG.tTq.getActivity().getString(R.l.share_openim_card_waring), "", null);
      return true;
      String str3 = r.gT(str1);
      String str2 = paramIntent.getStringExtra("received_card_name");
      boolean bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
      g.a locala = new g.a(this.bAG.tTq.getContext());
      com.tencent.mm.aa.c.a(str1, true, -1);
      au.HU();
      paramIntent = com.tencent.mm.model.c.FR().Ye(str1);
      if (com.tencent.mm.model.s.gU(paramIntent.field_verifyFlag)) {
        paramIntent = this.bAG.tTq.getResources().getString(R.l.app_friend_card_biz);
      }
      for (;;)
      {
        paramIntent = paramIntent + str3;
        locala.bZ(str2).TH(paramIntent).g(Boolean.valueOf(true)).BX(R.l.app_send).a(new d.1(this, str1, str2, bool)).eIW.show();
        return true;
        if (ab.XR(str1)) {
          paramIntent = SelectConversationUI.d(ad.getContext(), paramIntent);
        } else {
          paramIntent = this.bAG.tTq.getResources().getString(R.l.app_friend_card_personal);
        }
      }
      if ((paramInt2 == -1) && (paramIntent != null))
      {
        str1 = paramIntent.getStringExtra("be_send_card_name");
        str2 = paramIntent.getStringExtra("received_card_name");
        str3 = paramIntent.getStringExtra("custom_send_text");
        bool = paramIntent.getBooleanExtra("Is_Chatroom", false);
        paramIntent = new Intent(this.bAG.tTq.getContext(), ChattingUI.class);
        paramIntent.putExtra("Chat_User", str2);
        paramIntent.putExtra("send_card_username", str1);
        paramIntent.putExtra("send_card_edittext", str3);
        paramIntent.putExtra("Is_Chatroom", bool);
        this.bAG.tTq.startActivity(paramIntent);
      }
      return true;
    }
    catch (Throwable paramIntent)
    {
      for (;;) {}
    }
  }
  
  public final boolean aS(bd parambd)
  {
    if (parambd.cmi())
    {
      if (!this.bAG.getTalkerUserName().equals("medianote"))
      {
        au.HU();
        com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(parambd.field_talker, parambd.field_msgSvrId));
      }
      ak.aN(parambd);
      this.bAG.lT(true);
      return true;
    }
    return false;
  }
  
  public final void cpF()
  {
    Object localObject2 = this.bAG.tTq.getContext().getIntent();
    String str1 = ((Intent)localObject2).getStringExtra("Chat_User");
    Object localObject1 = ((Intent)localObject2).getStringExtra("send_card_username");
    if (!bi.oW((String)localObject1))
    {
      boolean bool = ((Intent)localObject2).getBooleanExtra("Is_Chatroom", false);
      localObject2 = ((Intent)localObject2).getStringExtra("send_card_edittext");
      if (!bool) {
        break label138;
      }
      localObject3 = bi.aG(str1, "");
      str2 = y.aaP((String)localObject1);
      if (!ab.XR((String)localObject1)) {
        break label132;
      }
    }
    label132:
    for (int i = 66;; i = 42)
    {
      localObject1 = new i((String)localObject3, str2, i);
      au.DF().a((l)localObject1, 0);
      if (localObject2 != null) {
        com.tencent.mm.plugin.messenger.a.g.bcT().dF((String)localObject2, str1);
      }
      return;
    }
    label138:
    Object localObject3 = bi.F(bi.aG(str1, "").split(","));
    String str2 = y.aaP((String)localObject1);
    i = 0;
    label165:
    Object localObject4;
    if (i < ((List)localObject3).size())
    {
      localObject4 = (String)((List)localObject3).get(i);
      if (!ab.XR((String)localObject1)) {
        break label231;
      }
    }
    label231:
    for (int j = 66;; j = 42)
    {
      localObject4 = new i((String)localObject4, str2, j);
      au.DF().a((l)localObject4, 0);
      i += 1;
      break label165;
      break;
    }
  }
  
  public final void cuG()
  {
    Intent localIntent = new Intent(this.bAG.tTq.getContext(), SelectContactUI.class);
    if (ab.XR(this.bAG.getTalkerUserName())) {
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.s(new int[] { com.tencent.mm.ui.contact.s.ukI, 1 }));
    }
    for (;;)
    {
      localIntent.putExtra("list_type", 4);
      localIntent.putExtra("received_card_name", this.bAG.getTalkerUserName());
      localIntent.putExtra("block_contact", this.bAG.getTalkerUserName());
      localIntent.putExtra("Add_SendCard", true);
      localIntent.putExtra("titile", this.bAG.tTq.getMMResources().getString(R.l.address_title_select_contact));
      this.bAG.tTq.startActivityForResult(localIntent, 223);
      return;
      localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.s(new int[] { com.tencent.mm.ui.contact.s.ukI, 2048 }));
    }
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    f(paramInt1, paramInt2, paramIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */