package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.modelsimple.t;
import com.tencent.mm.protocal.c.bhv;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.al;
import com.tencent.mm.ui.chatting.al.a;
import com.tencent.mm.ui.chatting.b.b.v;
import com.tencent.mm.ui.w;
import com.tencent.mm.ui.w.a;

@com.tencent.mm.ui.chatting.b.a.a(cwo=v.class)
public class ac
  extends a
  implements com.tencent.mm.ab.e, v
{
  private final com.tencent.mm.sdk.b.c cYt = new al(al.a.tMM, null);
  private com.tencent.mm.ui.widget.a.c tRm = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paraml.getType());
    this.bAG.dismissDialog();
    if (this.tRm != null)
    {
      this.tRm.dismiss();
      this.tRm = null;
    }
    if (!this.bAG.eaR) {
      x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd fragment not foreground, return");
    }
    label293:
    label295:
    do
    {
      for (;;)
      {
        return;
        if (bi.ci(this.bAG.tTq.getContext()))
        {
          Activity localActivity = this.bAG.tTq.getContext();
          int i;
          if (w.a.a(localActivity, paramInt1, paramInt2, paramString, 7)) {
            i = 1;
          }
          for (;;)
          {
            if (i != 0) {
              break label293;
            }
            if ((paramInt1 != 0) || (paramInt2 != 0)) {
              break label295;
            }
            switch (paraml.getType())
            {
            default: 
              return;
            }
            paramString = ((t)paraml).Rs();
            if (bi.oW(paramString.siF)) {
              break;
            }
            h.a(this.bAG.tTq.getContext(), paramString.siF, "", this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_dialog_confirm), new ac.2(this));
            return;
            if (w.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
              i = 1;
            } else {
              i = 0;
            }
          }
        }
      }
    } while (paraml.getType() != 594);
    paramString = ((t)paraml).Rs();
    x.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsgTimeout] sysWording:%s", new Object[] { paramString.siG });
    if ((paramInt2 != 0) && (!bi.oW(paramString.siG))) {}
    for (paramInt1 = 0; paramInt1 == 0; paramInt1 = 1)
    {
      x.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsg] sysWording:%s", new Object[] { paramString.siG });
      this.tRm = h.a(this.bAG.tTq.getContext(), paramString.siG, "", this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_dialog_confirm), new ac.3(this));
      return;
    }
    x.d("MicroMsg.ChattingUI.VerifyUserComponent", "[oneliang][revokeMsg] errorCode:%s,sysWording:%s", new Object[] { Integer.valueOf(paramInt2), paramString.siG });
    this.tRm = h.a(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_dialog_failure), "", this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_dialog_confirm), new ac.4(this));
  }
  
  public final void ba(bd parambd)
  {
    t localt = new t(parambd, this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_tips));
    this.bAG.d(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.chatting_revoke_msg_loading), new ac.1(this, parambd, localt));
    au.DF().a(localt, 0);
  }
  
  public final void cpH()
  {
    au.DF().a(594, this);
  }
  
  public final void cpI()
  {
    if (!com.tencent.mm.sdk.b.a.sFg.d(this.cYt)) {
      com.tencent.mm.sdk.b.a.sFg.b(this.cYt);
    }
  }
  
  public final void cpJ()
  {
    com.tencent.mm.sdk.b.a.sFg.c(this.cYt);
  }
  
  public final void cpK()
  {
    au.DF().b(594, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */