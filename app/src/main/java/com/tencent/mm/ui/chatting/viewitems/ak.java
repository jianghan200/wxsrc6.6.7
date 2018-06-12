package com.tencent.mm.ui.chatting.viewitems;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.c.a;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.g.a;

public final class ak
  extends b
{
  private com.tencent.mm.ab.e ehD;
  private ProgressDialog mQY;
  private a tKy;
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (paramView.getTag() != null) {}
    }
    else
    {
      localObject = new r(paramLayoutInflater, R.i.chatting_item_voiceremind_confirm);
      ((View)localObject).setTag(new aq().dL((View)localObject));
    }
    return (View)localObject;
  }
  
  public final void a(b.a parama, int paramInt, final a parama1, final com.tencent.mm.storage.bd parambd, String paramString)
  {
    paramString = (aq)parama;
    this.tKy = parama1;
    parama = ao.cbY().fI(parambd.field_msgId);
    parama1 = parambd.field_content;
    if ((parama != null) && (parama1 != null)) {}
    for (parama = g.a.gp(parama1);; parama = null)
    {
      boolean bool2 = false;
      parama1 = com.tencent.mm.plugin.subapp.c.e.Oj(parama1);
      boolean bool1 = bool2;
      if (parama1 != null)
      {
        bool1 = bool2;
        if (parama1.orn == 0) {}
      }
      for (;;)
      {
        try
        {
          localObject1 = com.tencent.mm.pluginsdk.f.h.V(this.tKy.tTq.getContext(), parama1.orn);
          if ((parama != null) && (parama.description != null))
          {
            i = parama.description.indexOf('|');
            if ((i <= 0) || (parama.description.length() <= i + 1)) {
              continue;
            }
            localObject2 = parama.description.substring(i + 1);
            paramString.eCn.setText((CharSequence)localObject2);
          }
          if ((localObject1 != null) && (((String)localObject1).length() > 0))
          {
            localObject1 = ((String)localObject1).split(";");
            paramString.ufj.setText(localObject1[0]);
            if (localObject1.length > 1) {
              paramString.ufk.setText(localObject1[1]);
            }
          }
        }
        catch (Exception localException)
        {
          Object localObject1;
          Object localObject2;
          long l;
          Object localObject3;
          int j;
          int k;
          String str;
          x.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindConfirm", localException, "", new Object[0]);
          continue;
          paramString.ufn.setVisibility(8);
          paramString.eCn.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_date_color));
          paramString.ufk.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_date_color));
          paramString.ufj.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_date_color));
          continue;
          int i = 0;
          continue;
          paramString.ufl.setBackgroundResource(R.g.voice_remind_play_btn);
          continue;
        }
        bool1 = ai.iS(parama1.orn);
        if (!bool1) {
          continue;
        }
        paramString.ufn.setVisibility(0);
        paramString.eCn.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_grey_color));
        paramString.ufk.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_grey_color));
        paramString.ufj.setTextColor(this.tKy.tTq.getMMResources().getColor(R.e.voice_remind_grey_color));
        paramString.ufl.setOnClickListener(new ak.1(this, parambd, paramInt));
        l = parambd.field_msgId;
        localObject1 = ((ag)this.tKy.O(ag.class)).cwl();
        if ((localObject1 == null) || (!((d)localObject1).isPlaying()) || (((d)localObject1).tHf != l)) {
          continue;
        }
        i = 1;
        if (i == 0) {
          continue;
        }
        paramString.ufl.setBackgroundResource(R.g.voice_remind_pause_btn);
        if ((parama1 != null) && (!ai.oW(parama1.orp)) && (parama1.orq > 0) && (ai.oW(parambd.field_reserved)) && (parama != null))
        {
          localObject2 = com.tencent.mm.plugin.subapp.c.k.nJ(q.GF());
          localObject1 = com.tencent.mm.plugin.subapp.c.h.aY((String)localObject2, false);
          parambd.er((String)localObject2);
          com.tencent.mm.model.au.HU();
          c.FT().a(parambd.field_msgId, parambd);
          l = parambd.field_msgId;
          i = parama.sdkVer;
          localObject2 = parama.appId;
          localObject3 = parama1.orp;
          j = parama1.orq;
          k = parama.type;
          str = parama.dwK;
          localObject1 = com.tencent.mm.pluginsdk.model.app.l.a((String)localObject1, l, i, (String)localObject2, (String)localObject3, j, k, parama.dws);
          if (localObject1 != null)
          {
            localObject2 = com.tencent.mm.model.au.DF();
            localObject3 = new ak.2(this, parambd, (String)localObject1, paramInt);
            this.ehD = ((com.tencent.mm.ab.e)localObject3);
            ((o)localObject2).a(221, (com.tencent.mm.ab.e)localObject3);
            localObject1 = new ac((String)localObject1);
            ((ac)localObject1).cbT();
            com.tencent.mm.model.au.DF().a((com.tencent.mm.ab.l)localObject1, 0);
          }
        }
        if ((ai.oW(parambd.field_imgPath)) && (parama1.ort > 0))
        {
          com.tencent.mm.model.au.HU();
          localObject1 = c.FT().I(parambd.field_talker, parama1.ort);
          if (!ai.oW(((cm)localObject1).field_imgPath))
          {
            localObject2 = com.tencent.mm.plugin.subapp.c.k.nJ(q.GF());
            localObject3 = com.tencent.mm.plugin.subapp.c.h.aY((String)localObject2, false);
            if (j.q(com.tencent.mm.plugin.subapp.c.h.aY(((cm)localObject1).field_imgPath, false), (String)localObject3, false))
            {
              parambd.eq((String)localObject2);
              com.tencent.mm.model.au.HU();
              c.FT().a(parambd.field_msgId, parambd);
            }
          }
        }
        if ((ai.oW(parambd.field_imgPath)) && (parama1 != null) && (!ai.oW(parama1.bGP)) && (parama1.dwo > 0) && (this.ehD == null))
        {
          localObject1 = com.tencent.mm.plugin.subapp.c.k.nJ(q.GF());
          localObject2 = com.tencent.mm.plugin.subapp.c.h.aY((String)localObject1, false);
          parambd.eq((String)localObject1);
          com.tencent.mm.model.au.HU();
          c.FT().a(parambd.field_msgId, parambd);
          parama = com.tencent.mm.pluginsdk.model.app.l.a((String)localObject2, parambd.field_msgId, parama.sdkVer, parama.appId, parama.bGP, parama.dwo);
          x.d("MicroMsg.ChattingItemVoiceRemindConfirm", "mediaId  " + parama.field_mediaSvrId);
          if (parama.field_mediaSvrId != null)
          {
            localObject1 = com.tencent.mm.model.au.DF();
            localObject2 = new ak.3(this, parama);
            this.ehD = ((com.tencent.mm.ab.e)localObject2);
            ((o)localObject1).a(221, (com.tencent.mm.ab.e)localObject2);
            parama = new ac(parama);
            com.tencent.mm.model.au.DF().a(parama, 0);
          }
        }
        paramString.ufm.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            com.tencent.mm.ui.base.h.a(ak.a(ak.this).tTq.getContext(), R.l.voice_reminder_dialog_del_message, R.l.voice_reminder_dialog_title, new ak.4.1(this), null);
          }
        });
        paramString.hrH.setTag(new au(parambd, this.tKy.cwr(), paramInt, null, '\000'));
        com.tencent.mm.model.au.HU();
        if (c.isSDCardAvailable()) {
          paramString.hrH.setOnLongClickListener(c(this.tKy));
        }
        return;
        paramString.eCn.setText("");
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, com.tencent.mm.storage.bd parambd)
  {
    int i = ((au)paramView.getTag()).position;
    int j = com.tencent.mm.pluginsdk.model.app.l.SY(com.tencent.mm.model.bd.b(this.tKy.cwr(), parambd.field_content, parambd.field_isSend));
    paramView = g.a.gp(com.tencent.mm.model.bd.b(this.tKy.cwr(), parambd.field_content, parambd.field_isSend));
    if ((paramView.dwo <= 0) || ((paramView.dwo > 0) && (j >= 100))) {
      paramContextMenu.add(i, 111, 0, this.tKy.tTq.getMMResources().getString(R.l.retransmit));
    }
    if (!this.tKy.cws()) {
      paramContextMenu.add(i, 100, 0, this.tKy.tTq.getMMResources().getString(R.l.chatting_long_click_menu_delete_msg));
    }
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, a parama, com.tencent.mm.storage.bd parambd)
  {
    switch (paramMenuItem.getItemId())
    {
    default: 
      return false;
    case 100: 
      parama = parambd.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = g.a.gp(parama);
      }
      if (paramMenuItem != null) {
        com.tencent.mm.pluginsdk.model.app.l.fJ(parambd.field_msgId);
      }
      com.tencent.mm.model.bd.aU(parambd.field_msgId);
      return false;
    }
    paramMenuItem = new Intent(parama.tTq.getContext(), MsgRetransmitUI.class);
    paramMenuItem.putExtra("Retr_Msg_content", com.tencent.mm.model.bd.b(parama.cwr(), parambd.field_content, parambd.field_isSend));
    paramMenuItem.putExtra("Retr_Msg_Type", 2);
    paramMenuItem.putExtra("Retr_Msg_Id", parambd.field_msgId);
    parama.startActivity(paramMenuItem);
    return false;
  }
  
  public final boolean aq(int paramInt, boolean paramBoolean)
  {
    return paramInt == -1879048189;
  }
  
  public final boolean b(View paramView, a parama, com.tencent.mm.storage.bd parambd)
  {
    return true;
  }
  
  public final boolean bba()
  {
    return false;
  }
  
  protected final boolean cxM()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */