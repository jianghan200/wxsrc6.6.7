package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.view.MenuItem;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.chatting.b.b.g;
import com.tencent.mm.ui.chatting.b.b.t;
import com.tencent.mm.ui.w;
import com.tencent.mm.ui.w.a;

@com.tencent.mm.ui.chatting.b.a.a(cwo=t.class)
public class z
  extends a
  implements com.tencent.mm.ab.e, t
{
  private void aQ(bd parambd)
  {
    com.tencent.mm.ui.chatting.view.b localb = new com.tencent.mm.ui.chatting.view.b(this.bAG.tTq.getContext());
    localb.tZc = new z.2(this, localb, parambd);
    localb.show();
    com.tencent.mm.plugin.report.service.h.mEJ.a(795L, 0L, 1L, false);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paraml.getType());
    this.bAG.dismissDialog();
    if (!this.bAG.eaR) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MsgRemindComponent", "onSceneEnd fragment not foreground, return");
    }
    label260:
    do
    {
      for (;;)
      {
        return;
        if (bi.ci(this.bAG.tTq.getContext()))
        {
          localActivity = this.bAG.tTq.getContext();
          int i;
          if (w.a.a(localActivity, paramInt1, paramInt2, paramString, 7)) {
            i = 1;
          }
          while (i == 0)
          {
            if ((paramInt1 != 0) || (paramInt2 != 0)) {
              break label260;
            }
            switch (paraml.getType())
            {
            default: 
              return;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.MsgRemindComponent", "set msg remind!");
            com.tencent.mm.ui.widget.snackbar.b.a(this.bAG.tTq.getContext(), this.bAG.tTq.getView(), this.bAG.tTq.getMMResources().getString(R.l.has_remind_tip), "");
            return;
            if (w.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
              i = 1;
            } else {
              i = 0;
            }
          }
        }
      }
    } while (paraml.getType() != 525);
    com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MsgRemindComponent", "[setMsgRemind] scene type:%s errCode:%s, errType:%s, errMsg:%s", new Object[] { Integer.valueOf(525), Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), bi.oV(paramString) });
    Activity localActivity = this.bAG.tTq.getContext();
    paraml = paramString;
    if (bi.oW(paramString)) {
      paraml = this.bAG.tTq.getMMResources().getString(R.l.remind_err_desc);
    }
    com.tencent.mm.ui.base.h.b(localActivity, paraml, this.bAG.tTq.getMMResources().getString(R.l.remind_err_title), true);
    com.tencent.mm.plugin.report.service.h.mEJ.a(795L, 4L, 1L, false);
  }
  
  public final void cpH()
  {
    au.DF().a(525, this);
  }
  
  public final void cpK()
  {
    au.DF().b(525, this);
  }
  
  public final void k(MenuItem paramMenuItem)
  {
    bd localbd = ((g)this.bAG.O(g.class)).ES(paramMenuItem.getGroupId());
    if (localbd == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.MsgRemindComponent", "context item select failed, null msg");
      return;
    }
    switch (paramMenuItem.getItemId())
    {
    default: 
      return;
    }
    au.HU();
    if (((Boolean)c.DT().get(aa.a.sQl, Boolean.valueOf(true))).booleanValue())
    {
      com.tencent.mm.ui.base.h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.remind_tip_desc), this.bAG.tTq.getMMResources().getString(R.l.remind_tip_title), new z.1(this, localbd));
      au.HU();
      c.DT().a(aa.a.sQl, Boolean.valueOf(false));
      return;
    }
    aQ(localbd);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/b/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */