package com.tencent.mm.ui.chatting.b;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import com.tencent.mm.R.l;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.b.b.u;
import com.tencent.mm.ui.chatting.i.a.a;
import com.tencent.mm.ui.chatting.i.a.b;
import com.tencent.mm.ui.tools.k;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=u.class)
public class ab
  extends a
  implements u, a.b
{
  private k contextMenuHelper;
  private com.tencent.mm.ui.chatting.i.b tRc;
  private com.tencent.mm.ui.chatting.i.c tRd;
  private com.tencent.mm.ui.chatting.i.d tRe;
  
  private void a(View paramView, com.tencent.mm.ui.chatting.f.a parama)
  {
    au.HU();
    com.tencent.mm.model.c.DT().a(aa.a.sSn, Boolean.valueOf(false));
    bd localbd = parama.bXQ;
    if (System.currentTimeMillis() - parama.tXS >= 300000L)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.NewXmlSysMsgComponent", "[handleClickInvokeMessageSysText] it's over time to copy invoke message!");
      com.tencent.mm.ui.base.h.b(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.invoke_message_overtime_tip), this.bAG.tTq.getMMResources().getString(R.l.app_tip), true);
      com.tencent.mm.sdk.f.e.post(new ab.2(this, localbd, paramView), "deleteInvokeMsg");
    }
    do
    {
      return;
      com.tencent.mm.plugin.report.service.h.mEJ.h(15037, new Object[] { Integer.valueOf(1) });
      paramView = (m)this.bAG.O(m.class);
      paramView.cvb().setLastText(paramView.cvb().getLastText() + parama.tXR);
    } while (paramView.cvb().ceK());
    paramView.cvb().showVKB();
  }
  
  private void a(View paramView, LinkedList<String> paramLinkedList, String paramString)
  {
    if (this.contextMenuHelper == null) {
      this.contextMenuHelper = new k(this.bAG.tTq.getContext());
    }
    this.contextMenuHelper.b(paramView, new ab.3(this), new ab.4(this, paramLinkedList, paramString));
  }
  
  private void ax(LinkedList<String> paramLinkedList)
  {
    if (((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur())
    {
      ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).au(paramLinkedList);
      return;
    }
    ((com.tencent.mm.ui.chatting.b.b.e)this.bAG.O(com.tencent.mm.ui.chatting.b.b.e.class)).aw(paramLinkedList);
  }
  
  public final void a(View paramView, bd parambd, com.tencent.mm.ap.a parama, int paramInt)
  {
    if ((parama instanceof com.tencent.mm.ap.e))
    {
      parambd = (com.tencent.mm.ap.e)parama;
      parama = bi.oV(parambd.ebG);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.NewXmlSysMsgComponent", "click delchatroommember link %s,isBizChat:%s", new Object[] { parama, Boolean.valueOf(((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur()) });
      if (parambd.ebU == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewXmlSysMsgComponent", "click members is null!!!");
      }
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if ((((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus()) || (s.fq(this.bAG.getTalkerUserName()))) {}
            for (paramInt = 1; paramInt == 0; paramInt = 0)
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.NewXmlSysMsgComponent", "not group chat !!!!!");
              return;
            }
            if (parama.equals("invite"))
            {
              ax(parambd.ebU);
              return;
            }
            if (parama.equals("qrcode"))
            {
              a(paramView, parambd.ebU, parambd.bUu);
              return;
            }
          } while ((!parama.equals("webview")) || (bi.oW(parambd.url)));
          paramView = new Intent();
          paramView.putExtra("rawUrl", parambd.url);
          paramView.putExtra("geta8key_username", q.GF());
          com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
          return;
          if (!(parama instanceof com.tencent.mm.ap.d)) {
            break;
          }
          localObject = (com.tencent.mm.ap.d)parama;
        } while (paramInt != 0);
        paramView = ((com.tencent.mm.ap.d)localObject).ebR;
        parama = ((com.tencent.mm.ap.d)localObject).ebS;
        String str1 = ((com.tencent.mm.ap.d)localObject).ebL;
        String str2 = ((com.tencent.mm.ap.d)localObject).bLe;
        LinkedList localLinkedList1 = ((com.tencent.mm.ap.d)localObject).ebM;
        LinkedList localLinkedList2 = ((com.tencent.mm.ap.d)localObject).ebP;
        Object localObject = ((com.tencent.mm.ap.d)localObject).ebQ;
        Intent localIntent = new Intent();
        localIntent.putExtra("msgLocalId", parambd.field_msgId);
        localIntent.putExtra("invitertitle", this.bAG.tTq.getMMResources().getString(R.l.access_invite_content_title, new Object[] { Integer.valueOf(localLinkedList1.size()) }));
        localIntent.putExtra("inviterusername", paramView);
        localIntent.putExtra("chatroom", str1);
        localIntent.putExtra("invitationreason", parama);
        localIntent.putExtra("ticket", str2);
        localIntent.putExtra("username", bi.c(localLinkedList1, ","));
        localIntent.putExtra("nickname", bi.c(localLinkedList2, ","));
        localIntent.putExtra("headimgurl", bi.c((List)localObject, ","));
        com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "chatroom", ".ui.SeeAccessVerifyInfoUI", localIntent);
        return;
        if ((parama instanceof com.tencent.mm.ap.b))
        {
          paramView = (com.tencent.mm.ap.b)parama;
          parama = new ArrayList();
          parama.addAll(paramView.ebM);
          ((com.tencent.mm.ui.chatting.b.b.e)this.bAG.O(com.tencent.mm.ui.chatting.b.b.e.class)).a(parama, paramView.bLe, parambd);
          return;
        }
        if ((parama instanceof com.tencent.mm.ui.chatting.f.a))
        {
          au.HU();
          if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sSn, Boolean.valueOf(true))).booleanValue())
          {
            com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.invoke_edit_tip), this.bAG.tTq.getMMResources().getString(R.l.tip_title), this.bAG.tTq.getMMResources().getString(R.l.i_know_it), new ab.1(this, paramView, parama));
            return;
          }
          a(paramView, (com.tencent.mm.ui.chatting.f.a)parama);
          return;
        }
      } while (!(parama instanceof com.tencent.mm.ap.c));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.NewXmlSysMsgComponent", "handleClickMuteSysText");
    } while (!s.fq(this.bAG.getTalkerUserName()));
    if (this.bAG.oLT.csI == 0) {}
    for (boolean bool = true;; bool = false)
    {
      ((com.tencent.mm.plugin.expt.roomexpt.d)g.l(com.tencent.mm.plugin.expt.roomexpt.d.class)).eB(bool);
      paramView = new Intent();
      paramView.putExtra("Chat_User", this.bAG.oLT.field_username);
      paramView.putExtra("RoomInfo_Id", this.bAG.getTalkerUserName());
      paramView.putExtra("Is_Chatroom", s.fq(this.bAG.getTalkerUserName()));
      paramView.putExtra("fromChatting", true);
      paramView.putExtra("isShowSetMuteAnimation", true);
      com.tencent.mm.bg.d.b(this.bAG.tTq.getContext(), "chatroom", ".ui.ChatroomInfoUI", paramView);
      return;
    }
  }
  
  public final void a(View paramView, a.a parama)
  {
    if ((paramView != null) && (parama != null))
    {
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(parama.username);
      a(paramView, localLinkedList, parama.egr);
    }
  }
  
  public final void ay(LinkedList<String> paramLinkedList)
  {
    if ((paramLinkedList != null) && (paramLinkedList.size() > 0)) {
      ax(paramLinkedList);
    }
  }
  
  public final void cpG()
  {
    super.cpG();
    this.tRe = new com.tencent.mm.ui.chatting.i.d(this);
    this.tRd = new com.tencent.mm.ui.chatting.i.c(this);
    this.tRc = new com.tencent.mm.ui.chatting.i.b(this);
  }
  
  public final void cpK()
  {
    if (this.tRc != null)
    {
      this.tRc.release();
      this.tRc = null;
    }
    if (this.tRd != null)
    {
      this.tRd.release();
      this.tRd = null;
    }
    if (this.tRe != null)
    {
      this.tRe.release();
      this.tRe = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ab.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */