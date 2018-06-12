package com.tencent.mm.ui.transmit;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.ow;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.model.q;
import com.tencent.mm.model.s;
import com.tencent.mm.modelmulti.i;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.b;
import com.tencent.mm.protocal.c.bri;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.j;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.contact.y;
import com.tencent.mm.y.g.a;
import java.util.Iterator;
import java.util.List;

public final class d
  implements com.tencent.mm.plugin.messenger.a.d
{
  public final void D(String paramString1, String paramString2, int paramInt)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      x.w("MicroMsg.SendMsgMgr", "send msg args error, toUser[%s] content[%s]", new Object[] { paramString1, paramString2 });
      return;
    }
    paramString1 = new i(paramString1, paramString2, paramInt);
    au.DF().a(paramString1, 0);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, int paramInt, String paramString3, String paramString4)
  {
    if ((paramString1 == null) || (paramString2 == null))
    {
      x.w("MicroMsg.SendMsgMgr", "sendImg: args error, toUser[%s], fileName[%s]", new Object[] { paramString1, paramString2 });
      return;
    }
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      x.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, R.l.msgretr_share_nosdcard_fail, 1).show();
      return;
    }
    paramContext = new com.tencent.mm.ak.l(4, q.GF(), paramString1, paramString2, paramInt, null, 0, paramString3, paramString4, true, R.g.chat_img_template);
    au.DF().a(paramContext, 0);
    br.IE().c(br.dDm, null);
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, bri parambri, String paramString4)
  {
    int i = 1;
    if (paramContext == null)
    {
      x.w("MicroMsg.SendMsgMgr", "send vedio context is null");
      return;
    }
    if ((paramString1 == null) || (paramString2 == null))
    {
      x.w("MicroMsg.SendMsgMgr", "send vedio args error, toUser[%s] fileName[%s]", new Object[] { paramString1, paramString2 });
      return;
    }
    au.HU();
    if (!com.tencent.mm.model.c.isSDCardAvailable())
    {
      x.w("MicroMsg.SendMsgMgr", "sdcard not ready, send video fail");
      Toast.makeText(paramContext, R.l.msgretr_share_nosdcard_fail, 1).show();
      return;
    }
    MsgRetransmitUI.a locala = new MsgRetransmitUI.a();
    paramContext.getResources().getString(R.l.app_tip);
    p localp = h.a(paramContext, paramContext.getResources().getString(R.l.app_sending), true, new d.1(this, locala));
    locala.context = paramContext;
    locala.fileName = paramString2;
    locala.uDW = paramString3;
    locala.eXG = localp;
    locala.userName = paramString1;
    locala.bZN = paramString4;
    locala.uDZ = false;
    if (62 == paramInt1) {
      locala.elY = 11;
    }
    if (paramInt1 > 0) {}
    for (paramInt1 = i;; paramInt1 = 0)
    {
      locala.uDq = paramInt1;
      locala.enM = paramInt2;
      locala.uDX = false;
      locala.uEa = parambri;
      locala.execute(new Object[0]);
      return;
    }
  }
  
  public final void a(Context paramContext, String paramString1, String paramString2, String paramString3, int paramInt1, int paramInt2, String paramString4)
  {
    a(paramContext, paramString1, paramString2, paramString3, paramInt1, paramInt2, null, paramString4);
  }
  
  public final void a(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3)
  {
    if (paramString1 == null)
    {
      x.w("MicroMsg.SendMsgMgr", "sendAppMsg: args error, toUser is null");
      return;
    }
    x.v("MicroMsg.SendMsgMgr", "for track bug sendAppMsg %s", new Object[] { paramString2 });
    g.a locala = g.a.gp(bi.WT(paramString2));
    if (locala == null)
    {
      x.w("MicroMsg.SendMsgMgr", "send: parse app msg content return null");
      return;
    }
    Object localObject = new b();
    x.i("MicroMsg.SendMsgMgr", "content.attachid %s", new Object[] { locala.bGP });
    paramString2 = (String)localObject;
    if (!bi.oW(locala.bGP))
    {
      long l = bi.getLong(locala.bGP, -1L);
      if (l == -1L) {
        break label385;
      }
      ao.asF().b(l, (com.tencent.mm.sdk.e.c)localObject);
      paramString2 = (String)localObject;
      if (((b)localObject).sKx != l)
      {
        localObject = ao.asF().SR(locala.bGP);
        if (localObject != null)
        {
          paramString2 = (String)localObject;
          if (((b)localObject).field_mediaSvrId.equals(locala.bGP)) {}
        }
        else
        {
          paramString2 = null;
        }
        if (paramString2 != null) {
          break label345;
        }
        x.i("MicroMsg.SendMsgMgr", "appAttachInfo1  %s", new Object[] { locala.bGP });
      }
    }
    for (;;)
    {
      String str = "";
      localObject = str;
      if (paramString2 != null)
      {
        localObject = str;
        if (paramString2.field_fileFullPath != null)
        {
          localObject = str;
          if (!paramString2.field_fileFullPath.equals(""))
          {
            au.HU();
            localObject = com.tencent.mm.pluginsdk.model.app.l.al(com.tencent.mm.model.c.Gk(), locala.title, locala.dwp);
            j.q(paramString2.field_fileFullPath, (String)localObject, false);
            x.i("MicroMsg.SendMsgMgr", "copy from src %s to dest %s size: %s", new Object[] { paramString2.field_fileFullPath, localObject, Integer.valueOf(e.cm(paramString2.field_fileFullPath)) });
          }
        }
      }
      paramString2 = g.a.a(locala);
      paramString2.dwr = 3;
      com.tencent.mm.pluginsdk.model.app.l.a(paramString2, locala.appId, locala.appName, paramString1, (String)localObject, paramArrayOfByte, paramString3);
      return;
      label345:
      x.i("MicroMsg.SendMsgMgr", "appAttachInfo2  %s : %s : %s", new Object[] { locala.bGP, Long.valueOf(paramString2.sKx), paramString2.field_fileFullPath });
      continue;
      label385:
      localObject = ao.asF().SR(locala.bGP);
      if (localObject != null)
      {
        paramString2 = (String)localObject;
        if (((b)localObject).field_mediaSvrId.equals(locala.bGP)) {}
      }
      else
      {
        paramString2 = null;
      }
      if (paramString2 == null) {
        x.i("MicroMsg.SendMsgMgr", "appAttachInfo3  %s", new Object[] { locala.bGP });
      } else {
        x.i("MicroMsg.SendMsgMgr", "appAttachInfo4  %s : %s : %s", new Object[] { locala.bGP, Long.valueOf(paramString2.sKx), paramString2.field_fileFullPath });
      }
    }
  }
  
  public final void dF(String paramString1, String paramString2)
  {
    paramString2 = bi.F(bi.aG(paramString2, "").split(","));
    if (!TextUtils.isEmpty(paramString1))
    {
      paramString2 = paramString2.iterator();
      while (paramString2.hasNext())
      {
        String str = (String)paramString2.next();
        ow localow = new ow();
        localow.bZQ.bZR = str;
        localow.bZQ.content = paramString1;
        localow.bZQ.type = s.hQ(str);
        localow.bZQ.flags = 0;
        a.sFg.m(localow);
      }
    }
  }
  
  public final void l(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramString2 = bi.aG(paramString2, "");
      str = y.aaP(paramString1);
      if (ab.XR(paramString1)) {}
      for (i = 66;; i = 42)
      {
        paramString1 = new i(paramString2, str, i);
        au.DF().a(paramString1, 0);
        return;
      }
    }
    paramString2 = bi.F(bi.aG(paramString2, "").split(","));
    String str = y.aaP(paramString1);
    int i = 0;
    label85:
    Object localObject;
    if (i < paramString2.size())
    {
      localObject = (String)paramString2.get(i);
      if (!ab.XR(paramString1)) {
        break label154;
      }
    }
    label154:
    for (int j = 66;; j = 42)
    {
      localObject = new i((String)localObject, str, j);
      au.DF().a((com.tencent.mm.ab.l)localObject, 0);
      i += 1;
      break label85;
      break;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/transmit/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */