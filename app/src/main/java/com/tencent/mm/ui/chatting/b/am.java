package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.w;
import com.tencent.mm.ui.w.a;
import java.util.List;

public class am
  extends a
  implements com.tencent.mm.ab.e, j.a, m.b, u
{
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    int i = 1;
    x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paraml.getType());
    this.bAG.dismissDialog();
    if (!this.bAG.eaR) {
      x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onSceneEnd fragment not foreground, return");
    }
    label121:
    label333:
    label335:
    label354:
    for (;;)
    {
      return;
      if (bi.ci(this.bAG.tTq.getContext()))
      {
        Object localObject = this.bAG.tTq.getContext();
        if (w.a.a((Context)localObject, paramInt1, paramInt2, paramString, 7))
        {
          if ((i != 0) || (paramInt1 != 0) || (paramInt2 != 0)) {
            break label333;
          }
          switch (paraml.getType())
          {
          default: 
            return;
          }
          paramString = ((com.tencent.mm.pluginsdk.model.m)paraml).qyZ;
          if ((paramString != null) && (!paramString.contains(this.bAG.oLT.field_username))) {
            break;
          }
          localObject = this.bAG.oLT;
          au.HU();
          paraml = c.FR().Yg(((ai)localObject).field_username);
          if (paraml != null)
          {
            paramString = paraml;
            if ((int)paraml.dhP != 0) {}
          }
          else
          {
            au.HU();
            if (c.FR().S((ab)localObject)) {
              break label335;
            }
            x.e("MicroMsg.ChattingUI.ChattingLogic", "insert contact failed, username = " + ((ai)localObject).field_username);
          }
        }
        for (paramString = null;; paramString = c.FR().Yg(((ai)localObject).field_username))
        {
          if (paramString == null) {
            break label354;
          }
          s.p(paramString);
          return;
          if (w.a((Activity)localObject, paramInt1, paramInt2, new Intent().setClass((Context)localObject, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
            break label121;
          }
          i = 0;
          break label121;
          break;
          au.HU();
        }
      }
    }
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    if (!this.bAG.eaR) {
      x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange fragment not foreground, return");
    }
    do
    {
      return;
      x.i("MicroMsg.ChattingUI.VerifyUserComponent", "onNotifyChange " + paramInt);
      au.HU();
      paramm = c.FR().Yg(this.bAG.getTalkerUserName());
    } while ((paramm == null) || ((int)paramm.dhP == 0));
    if (bi.oW(paramm.field_nickname)) {
      paramm.dx(this.bAG.oLT.field_nickname);
    }
    this.bAG.oLT = paramm;
    ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvn();
    ((com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class)).cvq();
    this.bAG.avj();
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    label0:
    break label0;
  }
  
  public final void cpH()
  {
    au.DF().a(137, this);
    au.HU();
    c.FR().a(this);
  }
  
  public final void cpK()
  {
    au.DF().b(137, this);
    if (au.HX())
    {
      au.HU();
      c.FR().b(this);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/chatting/b/am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */