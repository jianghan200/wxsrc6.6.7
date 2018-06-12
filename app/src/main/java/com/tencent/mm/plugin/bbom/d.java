package com.tencent.mm.plugin.bbom;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mm.ac.d.b;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.chatting.viewitems.c.f;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;

public final class d
  implements com.tencent.mm.plugin.brandservice.a.a
{
  private View.OnClickListener heo = new d.1(this);
  private View.OnClickListener hep = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      Context localContext = paramAnonymousView.getContext();
      paramAnonymousView = (com.tencent.mm.ui.chatting.viewitems.au)paramAnonymousView.getTag();
      q localq = paramAnonymousView.ufF;
      if (localq == null) {
        x.e("MicroMsg.ChattingItemHelper", "onBizTimeLineWebViewClick info is null");
      }
      do
      {
        do
        {
          return;
          x.d("MicroMsg.ChattingItemHelper", "onWebViewClick = " + System.currentTimeMillis());
        } while (com.tencent.mm.ui.chatting.f.a(paramAnonymousView.ceR, localContext, null, localq.field_talker));
        localObject1 = paramAnonymousView.userName;
        localObject2 = paramAnonymousView.ufy;
      } while ((localObject1 == null) || (((String)localObject1).equals("")));
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", (String)localObject1);
      localIntent.putExtra("shortUrl", (String)localObject1);
      localIntent.putExtra("webpageTitle", (String)localObject2);
      Object localObject1 = new Bundle();
      com.tencent.mm.model.au.HU();
      Object localObject2 = c.FR().Yg(localq.field_talker);
      int i;
      if ((localObject2 != null) && (((ab)localObject2).ckW()))
      {
        i = 4;
        x.d("MicroMsg.ChattingItemHelper", "hakon click biz msg %s", new Object[] { ((com.tencent.mm.g.c.ai)localObject2).field_username });
      }
      for (;;)
      {
        localIntent.putExtra("msg_id", localq.field_msgId);
        localIntent.putExtra("KPublisherId", "msg_" + Long.toString(localq.field_msgSvrId));
        localIntent.putExtra("pre_username", localq.field_talker);
        localIntent.putExtra("prePublishId", "msg_" + Long.toString(localq.field_msgSvrId));
        localIntent.putExtra("preUsername", localq.field_talker);
        localIntent.putExtra("preChatName", localq.field_talker);
        localIntent.putExtra("preChatTYPE", 7);
        localIntent.putExtra("preMsgIndex", paramAnonymousView.pSA);
        localObject2 = paramAnonymousView.ufE;
        if (localObject2 != null) {
          localIntent.putExtras((Bundle)localObject2);
        }
        ((Bundle)localObject1).putInt("snsWebSource", i);
        localIntent.putExtra("jsapiargs", (Bundle)localObject1);
        localIntent.putExtra("geta8key_username", localq.field_talker);
        if (!com.tencent.mm.platformtools.ai.oW(paramAnonymousView.bZG))
        {
          localIntent.putExtra("srcUsername", paramAnonymousView.bZG);
          localIntent.putExtra("srcDisplayname", paramAnonymousView.bZH);
          localIntent.putExtra("mode", 1);
        }
        localIntent.putExtra("message_id", paramAnonymousView.pSz);
        localIntent.putExtra("message_index", paramAnonymousView.pSA);
        localIntent.putExtra("from_scence", 1);
        localIntent.putExtra("geta8key_scene", paramAnonymousView.cfR);
        localIntent.addFlags(536870912);
        com.tencent.mm.bg.d.b(localContext, "webview", ".ui.tools.WebViewUI", localIntent);
        return;
        i = 0;
      }
    }
  };
  
  public final void a(int paramInt, Context paramContext, String paramString1, String paramString2, long paramLong1, long paramLong2)
  {
    com.tencent.mm.ui.chatting.r.a(paramInt, paramContext, paramString1, paramString2, paramLong1, paramLong2);
  }
  
  public final void a(long paramLong, int paramInt, Context paramContext, Activity paramActivity, bd parambd)
  {
    com.tencent.mm.ui.chatting.r.a(paramLong, paramInt, paramContext, null, paramActivity, parambd);
  }
  
  public final void a(View paramView, long paramLong, String paramString1, String paramString2, int paramInt)
  {
    c.f localf = new c.f();
    localf.bJC = paramLong;
    localf.uaH = paramInt;
    localf.bVv = paramString2;
    localf.bSw = paramString1;
    paramView.setTag(localf);
    paramView.setOnClickListener(this.heo);
  }
  
  public final void a(bd parambd, Activity paramActivity)
  {
    if (!parambd.aQm())
    {
      ch localch = new ch();
      e.a(localch, parambd);
      localch.bJF.activity = paramActivity;
      localch.bJF.bJM = 43;
      com.tencent.mm.sdk.b.a.sFg.m(localch);
      if (localch.bJG.ret == 0) {
        com.tencent.mm.modelstat.b.ehL.x(parambd);
      }
    }
  }
  
  public final void a(bd parambd, Context paramContext)
  {
    com.tencent.mm.ui.chatting.r.a(parambd, paramContext, null);
  }
  
  public final void a(m paramm, q paramq, int paramInt, l paraml, View paramView, boolean paramBoolean)
  {
    Object localObject1 = com.tencent.mm.model.r.gT(paramq.field_talker);
    String str = paramm.url;
    Object localObject2 = paramq.field_talker;
    if ((!TextUtils.isEmpty(str)) && (str.contains("http://weixin.qq.com/emoticonstore/")))
    {
      str = str.substring(str.lastIndexOf("/") + 1);
      ab localab = ((com.tencent.mm.plugin.messenger.foundation.a.i)g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg((String)localObject2);
      if ((com.tencent.mm.l.a.gd(localab.field_type)) && (localab.ckW()))
      {
        localObject2 = com.tencent.mm.ac.f.kH((String)localObject2);
        if (localObject2 != null)
        {
          localObject2 = ((com.tencent.mm.ac.d)localObject2).bG(false);
          if ((localObject2 != null) && (!TextUtils.isEmpty(((d.b)localObject2).Mx())) && (str.contains(((d.b)localObject2).Mx())))
          {
            if (TextUtils.isEmpty(str)) {
              break label266;
            }
            paraml = new com.tencent.mm.ui.chatting.viewitems.au(null, false, paramInt, paramm.url, paramBoolean, (String)localObject1, paraml.bZG, paraml.bZH, paramm.title, str, null, false, false);
            paramView.setOnClickListener(new d.3(this, paramq));
          }
        }
      }
    }
    for (;;)
    {
      if (paraml != null)
      {
        paraml.pSz = paramq.field_msgSvrId;
        paraml.pSA = 0;
        paraml.ufF = paramq;
        paramView.setTag(paraml);
      }
      if (com.tencent.mm.y.i.gr(paramm.dzD)) {
        com.tencent.mm.ui.chatting.r.a(paramm, paramView, paramq.field_talker);
      }
      return;
      str = null;
      break;
      label266:
      if (!bi.oW(paramm.url))
      {
        paraml = new com.tencent.mm.ui.chatting.viewitems.au(null, false, paramInt, paramm.url, paramBoolean, (String)localObject1, paraml.bZG, paraml.bZH, paramm.title);
        paraml.cfR = 56;
        str = paramq.field_talker;
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("share_report_pre_msg_url", paramm.url);
        ((Bundle)localObject1).putString("share_report_pre_msg_title", paramm.title);
        ((Bundle)localObject1).putString("share_report_pre_msg_desc", paramm.dzA);
        ((Bundle)localObject1).putString("share_report_pre_msg_icon_url", paramm.dzy);
        ((Bundle)localObject1).putString("share_report_pre_msg_appid", "");
        ((Bundle)localObject1).putInt("share_report_from_scene", 5);
        ((Bundle)localObject1).putString("share_report_biz_username", str);
        paraml.ufE = ((Bundle)localObject1);
        paramView.setOnClickListener(this.hep);
      }
      else
      {
        paraml = null;
      }
    }
  }
  
  public final void b(com.tencent.mm.ac.d paramd, Activity paramActivity, ab paramab)
  {
    com.tencent.mm.ui.tools.b.a(paramd, paramActivity, paramab, 3);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/bbom/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */