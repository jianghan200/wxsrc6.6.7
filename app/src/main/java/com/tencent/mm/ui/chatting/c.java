package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.s;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.d;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.t;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.chatting.c.a;
import com.tencent.mm.ui.w.a;
import com.tencent.mm.y.g.a;

public final class c
  implements View.OnClickListener, com.tencent.mm.ab.e, t
{
  private ProgressDialog eHw;
  private a tGW;
  
  public c(a parama)
  {
    this.tGW = parama;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    com.tencent.mm.model.au.DF().b(1030, this);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.bA(this.tGW.tTq.getContext(), this.tGW.tTq.getMMResources().getString(R.l.game_refuse_message_ok));
      return;
    }
    Toast.makeText(this.tGW.tTq.getContext(), this.tGW.tTq.getMMResources().getString(R.l.template_msg_refuse_success, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.pluginsdk.model.app.x paramx)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppSpamClickListener", "appsettings errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    ao.bmi().b(2, this);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      h.bA(this.tGW.tTq.getContext(), this.tGW.tTq.getMMResources().getString(R.l.game_refuse_message_ok));
    }
    while (w.a.a(this.tGW.tTq.getContext(), paramInt1, paramInt2, paramString, 4)) {
      return;
    }
    Toast.makeText(this.tGW.tTq.getContext(), this.tGW.tTq.getMMResources().getString(R.l.game_liset_set_refuse_msg_failed, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }), 0).show();
  }
  
  public final void onClick(View paramView)
  {
    boolean bool = true;
    int i = 0;
    if (paramView.getTag() == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "onClick tag is null");
      return;
    }
    Object localObject1;
    if ((paramView.getTag() instanceof com.tencent.mm.ui.chatting.viewitems.au))
    {
      localObject1 = (com.tencent.mm.ui.chatting.viewitems.au)paramView.getTag();
      if (localObject1 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "ItemDataTag is null");
        return;
      }
      paramView = ((com.tencent.mm.ui.chatting.viewitems.au)localObject1).bXA.appId;
      if (bi.oW(paramView))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "appId is null or nil");
        label74:
        if (i == 0) {
          break label271;
        }
        ao.bmi().a(2, this);
        if (!this.tGW.cwr()) {
          break label273;
        }
        i = 2;
        label98:
        paramView = this.tGW.getTalkerUserName();
        if (!s.fq(paramView)) {
          break label472;
        }
        paramView = bd.iB(((com.tencent.mm.ui.chatting.viewitems.au)localObject1).bXQ.field_content);
      }
    }
    label271:
    label273:
    label472:
    for (;;)
    {
      localObject1 = ((com.tencent.mm.ui.chatting.viewitems.au)localObject1).bXA;
      h.a(this.tGW.tTq.getContext(), this.tGW.tTq.getMMResources().getString(R.l.app_message_setting_confirm), this.tGW.tTq.getMMResources().getString(R.l.app_message_setting_title), this.tGW.tTq.getMMResources().getString(R.l.ac_app_message_btn_tip), this.tGW.tTq.getMMResources().getString(R.l.refuse_app_message_btn_tip), new c.2(this, (g.a)localObject1, paramView, i), new c.3(this, (g.a)localObject1, paramView, i));
      return;
      if (g.bl(paramView, false) == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "get null appinfo : appid = " + paramView);
        break label74;
      }
      i = 1;
      break label74;
      break;
      i = 1;
      break label98;
      if (!(paramView.getTag() instanceof t.n)) {
        break;
      }
      Object localObject2 = (t.n)paramView.getTag();
      if (localObject2 == null)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "TemplateItemDataTag is null");
        return;
      }
      if ((localObject2 == null) || (bi.oW(((t.n)localObject2).dxx)) || (((t.n)localObject2).bXQ == null))
      {
        if (localObject2 == null) {}
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppSpamClickListener", "wrong args, tag is null ? ", new Object[] { Boolean.valueOf(bool) });
          return;
          bool = false;
        }
      }
      paramView = this.tGW.tTq.getMMResources().getString(R.l.template_msg_btn_expose);
      localObject1 = this.tGW.tTq.getMMResources().getString(R.l.template_msg_btn_refuse);
      String str = this.tGW.tTq.getMMResources().getString(R.l.app_cancel);
      Activity localActivity = this.tGW.tTq.getContext();
      localObject2 = new c.1(this, (t.n)localObject2);
      h.a(localActivity, null, new String[] { paramView, localObject1, str }, null, true, (h.c)localObject2);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */