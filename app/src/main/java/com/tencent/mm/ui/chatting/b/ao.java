package com.tencent.mm.ui.chatting.b;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Looper;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ac.a.j;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.al.b;
import com.tencent.mm.g.a.st;
import com.tencent.mm.g.a.st.a;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.ad;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.d;
import com.tencent.mm.model.am.f;
import com.tencent.mm.model.au;
import com.tencent.mm.modelvoice.p;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.modelvoice.r;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.c;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.chatting.ak;
import com.tencent.mm.ui.chatting.b.b.ag;
import com.tencent.mm.ui.chatting.b.b.h;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.w;
import com.tencent.mm.ui.w.a;
import org.json.JSONObject;

@com.tencent.mm.ui.chatting.b.a.a(cwo=ag.class)
public class ao
  extends a
  implements com.tencent.mm.ab.e, ag
{
  public boolean hmc = false;
  private am.d otS = new ao.1(this);
  private com.tencent.mm.ui.chatting.d tJL = null;
  private View tTh = null;
  public ChatFooter.c tTi = new ao.2(this);
  
  public final boolean BD()
  {
    boolean bool1 = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cur();
    boolean bool2 = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cus();
    int i;
    if ((com.tencent.mm.model.s.fq(this.bAG.getTalkerUserName())) || (bool2)) {
      i = 1;
    }
    while (bool1) {
      if (bool2)
      {
        return ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cup().hu(1);
        i = 0;
      }
      else
      {
        return ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cuq().hu(1);
      }
    }
    return ((i != 0) && (this.bAG.oLT.csI == 0)) || (this.bAG.oLT.BD());
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    int i = 1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString + " sceneType:" + paraml.getType());
    this.bAG.dismissDialog();
    if (!this.bAG.eaR) {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "onSceneEnd fragment not foreground, return");
    }
    label245:
    for (;;)
    {
      return;
      if (bi.ci(this.bAG.tTq.getContext()))
      {
        Activity localActivity = this.bAG.tTq.getContext();
        if (w.a.a(localActivity, paramInt1, paramInt2, paramString, 7)) {}
        for (;;)
        {
          if ((i != 0) || (paramInt1 != 0) || (paramInt2 != 0)) {
            break label245;
          }
          switch (paraml.getType())
          {
          default: 
            return;
          }
          paramString = q.ot(((com.tencent.mm.modelvoice.f)paraml).fileName);
          if ((paramString == null) || (paramString.status != 99)) {
            break;
          }
          as.I(this.bAG.tTq.getContext(), R.l.after_upload_voice);
          return;
          if (!w.a(localActivity, paramInt1, paramInt2, new Intent().setClass(localActivity, LauncherUI.class).putExtra("Intro_Switch", true).putExtra("animation_pop_in", true).addFlags(67108864), paramString)) {
            i = 0;
          }
        }
      }
    }
  }
  
  @TargetApi(9)
  public final void a(com.tencent.mm.ui.x paramx, boolean paramBoolean)
  {
    if (paramx.getLandscapeMode())
    {
      if (!paramBoolean) {
        break label171;
      }
      if (Build.VERSION.SDK_INT < 9) {
        break label119;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "rotation %d", new Object[] { Integer.valueOf(paramx.getWindowManager().getDefaultDisplay().getOrientation()) });
      switch (paramx.getWindowManager().getDefaultDisplay().getOrientation())
      {
      }
    }
    label119:
    do
    {
      return;
      paramx.setRequestedOrientation(1);
      return;
      paramx.setRequestedOrientation(0);
      return;
      paramx.setRequestedOrientation(9);
      return;
      paramx.setRequestedOrientation(8);
      return;
      if (this.bAG.tTq.getMMResources().getConfiguration().orientation == 2)
      {
        paramx.setRequestedOrientation(0);
        return;
      }
    } while (this.bAG.tTq.getMMResources().getConfiguration().orientation != 1);
    paramx.setRequestedOrientation(1);
    return;
    label171:
    paramx.setRequestedOrientation(-1);
  }
  
  public final void acquireWakeLock()
  {
    this.bAG.setKeepScreenOn(true);
  }
  
  public final boolean be(bd parambd)
  {
    if (parambd.ckz())
    {
      if (parambd.field_msgId == this.tJL.tHf) {
        this.tJL.csQ();
      }
      return true;
    }
    return false;
  }
  
  public final boolean bf(bd parambd)
  {
    if (parambd.ckz())
    {
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        com.tencent.mm.ui.base.s.gH(this.bAG.tTq.getContext());
        return true;
      }
      if (parambd.field_msgId == this.tJL.tHf) {
        this.tJL.csQ();
      }
      if (!this.bAG.getTalkerUserName().equals("medianote"))
      {
        au.HU();
        com.tencent.mm.model.c.FQ().b(new com.tencent.mm.aq.e(parambd.field_talker, parambd.field_msgSvrId));
      }
      ak.aH(parambd);
      return true;
    }
    return false;
  }
  
  public final void cpG()
  {
    cwm();
  }
  
  public final void cpH()
  {
    au.DF().a(127, this);
  }
  
  public final void cpI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay looper[%s]", new Object[] { Looper.myLooper() });
    long l = System.currentTimeMillis();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "resetAutoPlay autoPlay is:%s tid:%d looper:%s", new Object[] { this.tJL, Long.valueOf(Thread.currentThread().getId()), Looper.myLooper() });
    Object localObject;
    if (this.tJL == null)
    {
      this.tJL = new com.tencent.mm.ui.chatting.d(this.bAG, this, this.bAG.getTalkerUserName());
      r.c(this.tJL);
      com.tencent.mm.modelvoice.e.a(this.tJL);
      au.HU();
      bool = bi.a((Boolean)com.tencent.mm.model.c.DT().get(16387, null), true);
      localObject = this.tJL;
      if (!((com.tencent.mm.ui.chatting.d)localObject).tHl)
      {
        ((com.tencent.mm.ui.chatting.d)localObject).tHj = bool;
        ((com.tencent.mm.ui.chatting.d)localObject).csL();
      }
      localObject = ((com.tencent.mm.ui.chatting.b.b.c)this.bAG.O(com.tencent.mm.ui.chatting.b.b.c.class)).cuo();
      if (localObject != null)
      {
        localObject = ((com.tencent.mm.ac.d)localObject).bG(false);
        if (localObject != null)
        {
          if (((d.b)localObject).dKT != null)
          {
            if (((d.b)localObject).dKT.optInt("AudioPlayType", 0) != 1) {
              break label367;
            }
            bool = true;
            label213:
            ((d.b)localObject).dLi = bool;
          }
          if (((d.b)localObject).dLi) {
            this.tJL.tHk = false;
          }
        }
      }
      localObject = this.tJL;
      if (this.hmc) {
        break label372;
      }
    }
    label367:
    label372:
    for (boolean bool = true;; bool = false)
    {
      ((com.tencent.mm.ui.chatting.d)localObject).hlZ = bool;
      this.tJL.bhU();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "summeranrt resetAutoPlay end take[%s]ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      if ((com.tencent.mm.model.s.hC(this.bAG.getTalkerUserName())) && (am.a.dBu != null)) {
        am.a.dBu.a(this.otS);
      }
      if (!b.Pz()) {
        ((m)this.bAG.O(m.class)).setVoiceInputShowCallback(this.tTi);
      }
      cwm();
      return;
      this.tJL.aai(this.bAG.getTalkerUserName());
      break;
      bool = false;
      break label213;
    }
  }
  
  public final void cpJ()
  {
    if ((com.tencent.mm.model.s.hC(this.bAG.getTalkerUserName())) && (am.a.dBu != null)) {
      am.a.dBu.b(this.otS);
    }
    if ((this.tTh != null) && (this.tTh.getVisibility() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "doPause set voiceinputMask GONE");
      this.tTh.setVisibility(8);
    }
    ((m)this.bAG.O(m.class)).setVoiceInputShowCallback(null);
    au.HU();
    com.tencent.mm.model.c.DT().set(26, Boolean.valueOf(this.hmc));
    if ((!com.tencent.mm.ui.s.cqn()) && (this.tJL != null))
    {
      this.tJL.csL();
      this.tJL.csQ();
      this.tJL.release();
    }
    st localst = new st();
    com.tencent.mm.sdk.b.a.sFg.m(localst);
    if ((!localst.cdA.cdD) && (!com.tencent.mm.p.a.BQ())) {
      au.HV().yC();
    }
  }
  
  public final void cpK()
  {
    au.DF().b(127, this);
  }
  
  public final void cun()
  {
    super.cun();
    r.b(this.tJL);
    com.tencent.mm.modelvoice.e.b(this.tJL);
    releaseWakeLock();
    if (this.tJL != null)
    {
      this.tJL.csL();
      com.tencent.mm.ui.chatting.d locald = this.tJL;
      locald.release();
      locald.context = null;
      locald.tHl = false;
      com.tencent.mm.sdk.b.a.sFg.c(locald.tHq);
      au.vv().b(locald);
    }
  }
  
  public final com.tencent.mm.ui.chatting.d cwl()
  {
    return this.tJL;
  }
  
  public final void cwm()
  {
    com.tencent.mm.ui.chatting.b.b.o localo = (com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class);
    if (((h)this.bAG.O(h.class)).cuS())
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.VoiceComponent", "trigger title icon, in show mode");
      this.bAG.lZ(false);
      localo.setTitlePhoneIconVisibility(8);
      localo.setTitleMuteIconVisibility(8);
      return;
    }
    Boolean localBoolean;
    if (BD())
    {
      localo.setTitleMuteIconVisibility(0);
      au.HU();
      localBoolean = (Boolean)com.tencent.mm.model.c.DT().get(26, null);
      if (localBoolean != null) {
        break label136;
      }
      this.hmc = false;
      label108:
      if (!this.hmc) {
        break label147;
      }
    }
    label136:
    label147:
    for (int i = 0;; i = 8)
    {
      localo.setTitlePhoneIconVisibility(i);
      return;
      localo.setTitleMuteIconVisibility(8);
      break;
      this.hmc = localBoolean.booleanValue();
      break label108;
    }
  }
  
  public final boolean cwn()
  {
    return this.hmc;
  }
  
  public final void lY(boolean paramBoolean)
  {
    if (this.tJL == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff error, autoPlay is null!!!");
      return;
    }
    com.tencent.mm.ui.chatting.b.b.o localo = (com.tencent.mm.ui.chatting.b.b.o)this.bAG.O(com.tencent.mm.ui.chatting.b.b.o.class);
    if (paramBoolean)
    {
      this.tJL.hlZ = false;
      this.hmc = true;
      au.HU();
      com.tencent.mm.model.c.DT().set(26, Boolean.valueOf(true));
      localo.setTitlePhoneIconVisibility(0);
      Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.fmt_route_phone), 0).show();
      this.tJL.csP();
      this.bAG.Fh(R.k.actionbar_ear_icon);
      return;
    }
    if (!au.HV().yE()) {
      this.tJL.hlZ = true;
    }
    for (;;)
    {
      this.hmc = false;
      au.HU();
      com.tencent.mm.model.c.DT().set(26, Boolean.valueOf(false));
      localo.setTitlePhoneIconVisibility(8);
      Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.fmt_route_speaker), 0).show();
      this.tJL.csP();
      this.bAG.Fh(R.k.actionbar_loud_icon);
      return;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.VoiceComponent", "setForceSpeakOff true but isBluetoothOn");
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    int j = 0;
    int i = 0;
    boolean bool1;
    if ((paramInt == 25) && (this.tJL != null) && (this.tJL.isPlaying()) && ((this.hmc) || (!this.tJL.hlZ)))
    {
      if (paramKeyEvent.getAction() == 0)
      {
        paramInt = i;
        if (au.HV().yE())
        {
          paramInt = i;
          if (!au.HV().yK()) {
            paramInt = au.HV().yQ();
          }
        }
        au.HV().fE(paramInt);
      }
      bool1 = true;
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return bool1;
            bool1 = bool2;
          } while (paramInt != 24);
          bool1 = bool2;
        } while (this.tJL == null);
        bool1 = bool2;
      } while (!this.tJL.isPlaying());
      if (this.hmc) {
        break;
      }
      bool1 = bool2;
    } while (this.tJL.hlZ);
    if (paramKeyEvent.getAction() == 0)
    {
      paramInt = j;
      if (au.HV().yE())
      {
        paramInt = j;
        if (!au.HV().yK()) {
          paramInt = au.HV().yQ();
        }
      }
      au.HV().fD(paramInt);
    }
    return true;
  }
  
  public final void releaseWakeLock()
  {
    this.bAG.setKeepScreenOn(false);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/chatting/b/ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */