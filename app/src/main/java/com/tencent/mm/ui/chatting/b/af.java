package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Intent;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.bu.b;
import com.tencent.mm.hardcoder.HardCoderJNI;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.plugin.bbom.r;
import com.tencent.mm.plugin.setting.model.j;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bn;
import com.tencent.mm.ui.chatting.ChattingAnimFrame;
import com.tencent.mm.ui.chatting.ac;
import com.tencent.mm.ui.chatting.b.b.aa;
import com.tencent.mm.ui.chatting.b.b.m;
import com.tencent.mm.ui.chatting.z;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.chatting.b.a.a(cwo=aa.class)
public class af
  extends a
  implements com.tencent.mm.ab.e, aa
{
  private boolean tOB = false;
  private z tRT;
  private int tRU;
  
  private boolean dn(final String paramString, final int paramInt)
  {
    int i = 0;
    paramString = bi.Xj(paramString);
    if ((paramString == null) || (paramString.length() == 0))
    {
      x.e("MicroMsg.ChattingUI.SendTextComponent", "doSendMessage null");
      return false;
    }
    Object localObject = this.tRT;
    if (!com.tencent.mm.platformtools.ai.oW(paramString))
    {
      bd localbd = new bd();
      localbd.setContent(paramString);
      localbd.eX(1);
      ((z)localObject).aF(localbd);
    }
    localObject = new bu();
    ((bu)localObject).bJj.bJl = paramString;
    ((bu)localObject).bJj.context = this.bAG.tTq.getContext();
    com.tencent.mm.sdk.b.a.sFg.m((b)localObject);
    if (((bu)localObject).bJk.bJm) {
      return true;
    }
    boolean bool = HardCoderJNI.hcSendMsgEnable;
    int j = HardCoderJNI.hcSendMsgDelay;
    int k = HardCoderJNI.hcSendMsgCPU;
    int m = HardCoderJNI.hcSendMsgIO;
    if (HardCoderJNI.hcSendMsgThr) {
      i = com.tencent.mm.kernel.g.Em().cij();
    }
    this.tRU = HardCoderJNI.startPerformance(bool, j, k, m, i, HardCoderJNI.hcSendMsgTimeout, 202, HardCoderJNI.hcSendMsgAction, "MicroMsg.ChattingUI.SendTextComponent");
    com.tencent.mm.ui.chatting.c.a.cwt().post(new Runnable()
    {
      public final void run()
      {
        if (af.this.bAG == null)
        {
          x.w("MicroMsg.ChattingUI.SendTextComponent", "NULL == mChattingContext");
          return;
        }
        com.tencent.mm.plugin.report.service.g.vu(20);
        if (af.a(af.this))
        {
          af.this.bAG.cwp();
          localObject1 = new com.tencent.mm.ah.a(af.this.bAG.oLT.field_username, paramString);
          au.DF().a((l)localObject1, 0);
          return;
        }
        if ((((com.tencent.mm.ui.chatting.b.b.g)af.this.bAG.O(com.tencent.mm.ui.chatting.b.b.g.class)).getCount() == 0) && (ab.XQ(af.this.bAG.getTalkerUserName()))) {
          br.IE().c(10076, new Object[] { Integer.valueOf(1) });
        }
        Object localObject1 = af.this.bAG.getTalkerUserName();
        int j = com.tencent.mm.model.s.hQ((String)localObject1);
        Object localObject2 = paramString;
        String str = ((com.tencent.mm.ui.chatting.b.b.q)af.this.bAG.O(com.tencent.mm.ui.chatting.b.b.q.class)).aao((String)localObject1);
        if (bi.oW(str))
        {
          x.w("MicroMsg.ChattingUI.SendTextComponent", "tempUser is null");
          return;
        }
        m localm = (m)af.this.bAG.O(m.class);
        ChatFooter localChatFooter = localm.cvb();
        int i = paramInt;
        if (localChatFooter.qLy.qMD.containsKey(localObject1)) {
          if (((LinkedList)localChatFooter.qLy.qMD.get(localObject1)).size() > 0) {
            i = 291;
          }
        }
        for (;;)
        {
          localObject2 = new i(str, (String)localObject2, j, i, localm.cvb().fD((String)localObject1, (String)localObject2));
          ((com.tencent.mm.ui.chatting.b.b.q)af.this.bAG.O(com.tencent.mm.ui.chatting.b.b.q.class)).g((i)localObject2);
          au.DF().a((l)localObject2, 0);
          if (!com.tencent.mm.model.s.hM((String)localObject1)) {
            break;
          }
          localObject1 = new j(com.tencent.mm.compatible.e.q.zO(), paramString + " key " + bn.cmZ() + " local key " + bn.cmY() + "NetType:" + ao.getNetTypeString(af.this.bAG.tTq.getContext().getApplicationContext()) + " hasNeon: " + n.zp() + " isArmv6: " + n.zr() + " isArmv7: " + n.zq());
          au.DF().a((l)localObject1, 0);
          return;
        }
      }
    });
    this.bAG.lT(true);
    return true;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.bAG != null) {
      this.bAG.dismissDialog();
    }
    if (522 == paraml.getType())
    {
      HardCoderJNI.stopPerformace(HardCoderJNI.hcSendMsgEnable, this.tRU);
      this.tRU = 0;
    }
  }
  
  public final void a(com.tencent.mm.ui.chatting.c.a parama)
  {
    super.a(parama);
    this.tRT = new z(this.bAG);
  }
  
  public final boolean aaq(String paramString)
  {
    return dn(paramString, 0);
  }
  
  public final void cpG()
  {
    r.a(this.tRT);
    this.tOB = true;
  }
  
  public final void cpH()
  {
    au.DF().a(522, this);
    List localList = ((com.tencent.mm.ui.chatting.b.b.s)this.bAG.O(com.tencent.mm.ui.chatting.b.b.s.class)).cvI();
    if (localList != null)
    {
      Object localObject = this.tRT;
      if ((((z)localObject).tMr != null) && (((z)localObject).bAG != null))
      {
        ac localac = ((z)localObject).tMr;
        localObject = ((z)localObject).bAG.tTq.getContext();
        localac.huM = localList;
        localac.tMt = ((Activity)localObject);
        if (localac.mHandler != null) {
          localac.mHandler.sendEmptyMessageDelayed(0, 300L);
        }
      }
    }
  }
  
  public final void cpI()
  {
    if (!this.tOB) {
      r.a(this.tRT);
    }
    this.tOB = false;
  }
  
  public final void cpJ()
  {
    r.b(this.tRT);
  }
  
  public final void cpK()
  {
    au.DF().b(522, this);
    if (this.tRT != null)
    {
      Object localObject = this.tRT;
      if (((z)localObject).tMr != null)
      {
        localObject = ((z)localObject).tMr;
        ((ac)localObject).mHandler.removeMessages(0);
        if (((ac)localObject).tMs != null) {
          ((ac)localObject).tMs.stop();
        }
        x.d("MicroMsg.EggMgr", "egg has been stop");
      }
    }
    HardCoderJNI.stopPerformace(HardCoderJNI.hcSendMsgEnable, this.tRU);
    this.tRU = 0;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    default: 
      return;
    }
    dn(paramIntent.getStringExtra("art_smiley_slelct_data"), 4);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/chatting/b/af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */