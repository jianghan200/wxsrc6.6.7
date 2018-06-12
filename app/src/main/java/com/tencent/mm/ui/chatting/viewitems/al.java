package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.content.res.Resources;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.model.app.ac;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.c.a;
import com.tencent.mm.ui.chatting.d;
import com.tencent.mm.ui.transmit.MsgRetransmitUI;
import com.tencent.mm.y.g.a;

public final class al
  extends b
{
  private com.tencent.mm.ab.e ehD;
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
      localObject = new r(paramLayoutInflater, R.i.chatting_item_voiceremind_remind);
      ((View)localObject).setTag(new ba().dM((View)localObject));
    }
    return (View)localObject;
  }
  
  public final void a(b.a parama, int paramInt, a parama1, com.tencent.mm.storage.bd parambd, String paramString)
  {
    localba = (ba)parama;
    this.tKy = parama1;
    Object localObject2 = ao.cbY().fI(parambd.field_msgId);
    Object localObject1 = parambd.field_content;
    parama = null;
    paramString = parama;
    if (localObject2 != null)
    {
      paramString = parama;
      if (localObject1 != null) {
        paramString = g.a.J((String)localObject1, parambd.field_reserved);
      }
    }
    localObject2 = com.tencent.mm.plugin.subapp.c.e.Oj((String)localObject1);
    if ((localObject2 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).orn != 0)) {}
    try
    {
      localObject3 = com.tencent.mm.pluginsdk.f.h.V(parama1.tTq.getContext(), ((com.tencent.mm.plugin.subapp.c.e)localObject2).orn);
      localObject1 = "";
      parama = (b.a)localObject1;
      if (localObject3 != null)
      {
        parama = (b.a)localObject1;
        if (((String)localObject3).length() > 0)
        {
          localObject3 = ((String)localObject3).split(";");
          localObject1 = "" + localObject3[0].replace(" ", "");
          parama = (b.a)localObject1;
          if (localObject3.length > 1) {
            parama = (String)localObject1 + localObject3[1];
          }
        }
      }
      localObject1 = parama;
      if (paramString != null)
      {
        localObject1 = parama;
        if (paramString.description != null) {
          localObject1 = parama + " " + paramString.description;
        }
      }
      localba.eCn.setText((CharSequence)localObject1);
    }
    catch (Exception parama)
    {
      for (;;)
      {
        Object localObject3;
        long l;
        x.printErrStackTrace("MicroMsg.ChattingItemVoiceRemindRemind", parama, "", new Object[0]);
        continue;
        int i = 0;
        continue;
        localba.ugA.setImageResource(R.g.music_playicon);
      }
    }
    x.d("MicroMsg.ChattingItemVoiceRemindRemind", "content remind " + parambd.field_content);
    if ((bi.oW(parambd.field_imgPath)) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).ort > 0))
    {
      com.tencent.mm.model.au.HU();
      parama = c.FT().I(parambd.field_talker, ((com.tencent.mm.plugin.subapp.c.e)localObject2).ort);
      if (!bi.oW(parama.field_imgPath))
      {
        localObject1 = com.tencent.mm.plugin.subapp.c.k.nJ(q.GF());
        localObject3 = com.tencent.mm.plugin.subapp.c.h.aY((String)localObject1, false);
        if (j.q(com.tencent.mm.plugin.subapp.c.h.aY(parama.field_imgPath, false), (String)localObject3, false))
        {
          parambd.eq((String)localObject1);
          com.tencent.mm.model.au.HU();
          c.FT().a(parambd.field_msgId, parambd);
        }
      }
    }
    if ((bi.oW(parambd.field_imgPath)) && (localObject2 != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).bGP != null) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).bGP.length() > 0) && (((com.tencent.mm.plugin.subapp.c.e)localObject2).dwo > 0) && (this.ehD == null))
    {
      parama = com.tencent.mm.plugin.subapp.c.k.nJ(q.GF());
      localObject1 = com.tencent.mm.plugin.subapp.c.h.aY(parama, false);
      if (bi.oW(parambd.field_imgPath))
      {
        parambd.eq(parama);
        com.tencent.mm.model.au.HU();
        c.FT().a(parambd.field_msgId, parambd);
        x.d("MicroMsg.ChattingItemVoiceRemindRemind", "content.attachid " + paramString.bGP);
        parama = l.a((String)localObject1, parambd.field_msgId, paramString.sdkVer, paramString.appId, paramString.bGP, paramString.dwo);
        x.d("MicroMsg.ChattingItemVoiceRemindRemind", "ainfo.field_mediaSvrId " + parama.field_mediaSvrId);
        if (parama.field_mediaSvrId != null)
        {
          paramString = com.tencent.mm.model.au.DF();
          localObject1 = new al.1(this);
          this.ehD = ((com.tencent.mm.ab.e)localObject1);
          paramString.a(221, (com.tencent.mm.ab.e)localObject1);
          x.d("MicroMsg.ChattingItemVoiceRemindRemind", "doscene");
          parama = new ac(parama);
          com.tencent.mm.model.au.DF().a(parama, 0);
        }
      }
    }
    localba.ugA.setOnClickListener(new al.2(this, parambd, paramInt));
    l = parambd.field_msgId;
    parama = ((ag)this.tKy.O(ag.class)).cwl();
    if ((parama.isPlaying()) && (parama.tHf == l))
    {
      i = 1;
      if (i == 0) {
        break label784;
      }
      localba.ugA.setImageResource(R.g.music_pauseicon);
      localba.hrH.setTag(new au(parambd, parama1.cwr(), paramInt, null, '\000'));
      com.tencent.mm.model.au.HU();
      if (c.isSDCardAvailable()) {
        localba.hrH.setOnLongClickListener(c(parama1));
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, com.tencent.mm.storage.bd parambd)
  {
    int i = ((au)paramView.getTag()).position;
    int j = l.SY(com.tencent.mm.model.bd.b(this.tKy.cwr(), parambd.field_content, parambd.field_isSend));
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
        l.fJ(parambd.field_msgId);
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
    return paramInt == -1879048190;
  }
  
  public final String b(a parama, com.tencent.mm.storage.bd parambd)
  {
    return parama.getTalkerUserName();
  }
  
  public final boolean b(View paramView, a parama, com.tencent.mm.storage.bd parambd)
  {
    return true;
  }
  
  protected final boolean b(a parama)
  {
    return false;
  }
  
  public final boolean bba()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/viewitems/al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */