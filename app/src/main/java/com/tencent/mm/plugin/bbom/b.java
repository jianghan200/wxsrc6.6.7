package com.tencent.mm.plugin.bbom;

import android.content.Context;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.d.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.az.d;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.model.am.b.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bd.b;
import com.tencent.mm.model.s;
import com.tencent.mm.protocal.c.by;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import java.util.Stack;

public final class b
  implements com.tencent.mm.plugin.messenger.foundation.a.a
{
  static void a(by paramby, bd.b paramb, com.tencent.mm.storage.ab paramab)
  {
    String str1 = com.tencent.mm.platformtools.ab.a(paramby.rcj);
    au.HU();
    com.tencent.mm.model.c.DT().set(73729, Integer.valueOf(1));
    String str2 = paramab.field_nickname;
    ba localba = new ba();
    localba.field_content = com.tencent.mm.platformtools.ab.a(paramby.rcl);
    localba.field_createtime = bi.VE();
    localba.field_imgpath = "";
    if (paramby.jQd == 3)
    {
      paramab = ad.getContext().getString(R.l.nearby_say_hi_type_image);
      localba.field_sayhicontent = paramab;
      localba.field_sayhiuser = str1;
      localba.field_scene = 18;
      if (paramby.hcd <= 3) {
        break label217;
      }
    }
    label217:
    for (int i = paramby.hcd;; i = 3)
    {
      localba.field_status = i;
      localba.field_svrid = paramby.rcq;
      localba.field_talker = str2;
      localba.field_type = paramby.jQd;
      localba.field_isSend = 0;
      localba.field_sayhiencryptuser = str1;
      localba.field_ticket = paramb.dCs;
      d.SG().a(localba);
      paramby = new it();
      paramby.bSl.bSm = str1;
      com.tencent.mm.sdk.b.a.sFg.m(paramby);
      return;
      paramab = com.tencent.mm.platformtools.ab.a(paramby.rcl);
      break;
    }
  }
  
  public final void a(final d.a parama, com.tencent.mm.storage.bd parambd, final String paramString1, final String paramString2, boolean paramBoolean)
  {
    parama = parama.dIN;
    paramString2 = com.tencent.mm.model.bd.iF(parama.rco);
    if (paramString2 != null)
    {
      parambd.ev(paramString2.dCq);
      parambd.et(paramString2.dCp);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BaseMsgCallbackImpl", "bizClientMsgId = %s", new Object[] { paramString2.dCp });
      if ((paramString2.dCs != null) && (paramString2.scene == 1) && (parama.jQd != 10000))
      {
        au.HU();
        parambd = com.tencent.mm.model.c.FR().Yg(paramString1);
        if ((parambd != null) && ((int)parambd.dhP > 0)) {
          break label132;
        }
        am.a.dBr.a(paramString1, null, new am.b.a()
        {
          public final void x(String paramAnonymousString, boolean paramAnonymousBoolean)
          {
            au.HU();
            paramAnonymousString = com.tencent.mm.model.c.FR().Yg(paramString1);
            b.a(parama, paramString2, paramAnonymousString);
          }
        });
      }
    }
    return;
    label132:
    a(parama, paramString2, parambd);
  }
  
  public final void b(d.a parama, com.tencent.mm.storage.bd arg2, String paramString1, String paramString2, boolean paramBoolean)
  {
    int j = 1;
    int i;
    if ((s.he(paramString1)) && (s.hT(paramString1))) {
      i = 1;
    }
    for (;;)
    {
      long l;
      if ((s.fq(paramString1)) && (!s.hS(paramString1))) {
        if ((!paramBoolean) && (???.ckA()) && (i == 0) && (j == 0))
        {
          com.tencent.mm.modelcontrol.c.NM();
          if (com.tencent.mm.modelcontrol.c.o(???))
          {
            parama = o.Ph();
            l = ???.field_msgId;
            com.tencent.mm.modelcontrol.c.NM();
            if (!com.tencent.mm.modelcontrol.c.NN()) {}
          }
        }
      }
      synchronized (parama.dTg)
      {
        if (parama.dTg.size() >= 100) {
          parama.dTg.remove(0);
        }
        parama.dTg.push(Long.valueOf(l));
        parama.dTk = System.currentTimeMillis();
        parama.start();
        return;
        i = 0;
        continue;
        j = 0;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/bbom/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */