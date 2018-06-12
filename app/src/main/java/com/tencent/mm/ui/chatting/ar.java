package com.tencent.mm.ui.chatting;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.opensdk.channel.MMessageActV2;
import com.tencent.mm.opensdk.channel.MMessageActV2.Args;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Req;
import com.tencent.mm.opensdk.modelmsg.GetMessageFromWX.Resp;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.platformtools.ai;
import com.tencent.mm.pluginsdk.a.d;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.chatting.c.a;
import com.tencent.mm.ui.s;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class ar
  implements ad
{
  public static k<ad, Bundle> tNy = new ar.1();
  private a bAG;
  public com.tencent.mm.ui.x tNw;
  public final Set<String> tNx = new HashSet();
  
  public ar(a parama)
  {
    this.tNw = parama.tTq;
  }
  
  private q.a a(final WXMediaMessage paramWXMediaMessage, final f paramf)
  {
    new q.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        if (paramAnonymousBoolean)
        {
          paramAnonymousString = null;
          if (paramWXMediaMessage.getType() != 8) {
            break label93;
          }
          if (paramWXMediaMessage.thumbData == null) {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "code should not reach here due to WXMediaMessage::checkArgs, sendEmoji Fail cause thumbData is null");
          }
        }
        else
        {
          return;
        }
        String str = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().a(ar.a(ar.this).getContext(), paramWXMediaMessage, paramf.field_appId);
        paramAnonymousString = str;
        if (str == null)
        {
          com.tencent.mm.sdk.platformtools.x.v("MicroMsg.WXAppMessageReceiver", "sendEmoji Fail cause emojiconmd5 is null");
          return;
        }
        label93:
        br.IE().c(27, new Object[] { Integer.valueOf(1) });
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.WXAppMessageReceiver", "onDialogClick, messageAction = %s, messageExt = %s", new Object[] { paramWXMediaMessage.messageAction, paramWXMediaMessage.messageExt });
        l.a(paramWXMediaMessage, paramf.field_appId, paramf.field_appName, ar.b(ar.this).getTalkerUserName(), 1, paramAnonymousString);
      }
    };
  }
  
  public static void ah(Bundle paramBundle)
  {
    tNy.ci(paramBundle);
    tNy.doNotify();
  }
  
  @TargetApi(9)
  public static void b(Context paramContext, Set<String> paramSet)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramSet != null)
    {
      localObject1 = localObject2;
      if (paramSet.size() > 0)
      {
        localObject1 = new StringBuilder();
        paramSet = paramSet.iterator();
        while (paramSet.hasNext())
        {
          ((StringBuilder)localObject1).append((String)paramSet.next());
          ((StringBuilder)localObject1).append(";");
        }
        localObject1 = ((StringBuilder)localObject1).toString();
      }
    }
    paramContext = paramContext.getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.cib(), 0).edit();
    paramContext.putString("transactions_array_key", (String)localObject1);
    if (Build.VERSION.SDK_INT > 8)
    {
      paramContext.apply();
      return;
    }
    paramContext.commit();
  }
  
  private String m(f paramf)
  {
    return this.tNw.getString(R.l.confirm_dialog_source, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.tNw.getContext(), paramf, null) });
  }
  
  public final void ag(Bundle paramBundle)
  {
    int j = 1;
    int k = 0;
    if (!this.bAG.eaR)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.WXAppMessageReceiver", "handleResp Chatting is a fragment but not foregound");
      return;
    }
    Object localObject2 = Uri.parse(paramBundle.getString("_mmessage_content")).getQueryParameter("appid");
    Object localObject1 = new GetMessageFromWX.Resp(paramBundle);
    paramBundle = ((GetMessageFromWX.Resp)localObject1).message;
    Object localObject4;
    Object localObject3;
    if (this.tNx.size() == 0)
    {
      localObject4 = this.tNw.getContext();
      localObject3 = new HashSet();
      localObject4 = ((Context)localObject4).getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.cib(), 0).getString("transactions_array_key", null);
      if ((localObject4 != null) && (((String)localObject4).length() > 0))
      {
        localObject4 = ((String)localObject4).split(";");
        int m = localObject4.length;
        i = 0;
        while (i < m)
        {
          ((Set)localObject3).add(localObject4[i]);
          i += 1;
        }
      }
      this.tNx.addAll((Collection)localObject3);
    }
    if (!this.tNx.contains(((GetMessageFromWX.Resp)localObject1).transaction))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "invalid resp, check transaction failed, transaction=" + ((GetMessageFromWX.Resp)localObject1).transaction);
      return;
    }
    this.tNx.remove(((GetMessageFromWX.Resp)localObject1).transaction);
    b(this.tNw.getContext(), this.tNx);
    localObject1 = new f();
    ((f)localObject1).field_appId = ((String)localObject2);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WXAppMessageReceiver", "handleResp, appId = " + (String)localObject2);
    if (!ao.bmf().b((com.tencent.mm.sdk.e.c)localObject1, new String[0]))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "unregistered app, ignore request, appId = " + (String)localObject2);
      return;
    }
    int i = paramBundle.getType();
    switch (i)
    {
    case 6: 
    default: 
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "unknown type = " + i);
      i = 0;
    case 1: 
    case 2: 
    case 3: 
    case 4: 
    case 5: 
      while (i == 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "deal fail, result is false");
        return;
        localObject2 = this.tNw.getController();
        localObject3 = paramBundle.description;
        m((f)localObject1);
        if (com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (String)localObject3, false, a(paramBundle, (f)localObject1)) != null) {}
        for (i = 1;; i = 0) {
          break;
        }
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject2 = this.tNw.getController();
          localObject3 = paramBundle.thumbData;
          m((f)localObject1);
          paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (byte[])localObject3, false, a(paramBundle, (f)localObject1));
          if (paramBundle != null) {
            break label640;
          }
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.WXAppMessageReceiver", "showDialogItem3 fail, invalid argument");
        }
        for (i = k;; i = 1)
        {
          break;
          localObject2 = (WXImageObject)paramBundle.mediaObject;
          if ((((WXImageObject)localObject2).imageData != null) && (((WXImageObject)localObject2).imageData.length > 0))
          {
            localObject3 = this.tNw.getController();
            localObject2 = ((WXImageObject)localObject2).imageData;
            m((f)localObject1);
            paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject3, (byte[])localObject2, false, a(paramBundle, (f)localObject1));
            break label512;
          }
          localObject3 = this.tNw.getController();
          localObject2 = ((WXImageObject)localObject2).imagePath;
          m((f)localObject1);
          paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.b((s)localObject3, (String)localObject2, false, a(paramBundle, (f)localObject1));
          break label512;
        }
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject2 = this.tNw.getController();
          localObject3 = paramBundle.title;
          m((f)localObject1);
        }
        for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (String)localObject3, false, 2, a(paramBundle, (f)localObject1));; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, i, (String)localObject3, false, a(paramBundle, (f)localObject1)))
        {
          i = j;
          if (paramBundle != null) {
            break;
          }
          i = 0;
          break;
          localObject2 = this.tNw.getController();
          i = R.k.app_attach_file_icon_music;
          localObject3 = paramBundle.title;
          m((f)localObject1);
        }
        if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
        {
          localObject2 = this.tNw.getController();
          localObject3 = paramBundle.title;
          m((f)localObject1);
        }
        for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (String)localObject3, false, 1, a(paramBundle, (f)localObject1));; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, i, (String)localObject3, false, a(paramBundle, (f)localObject1)))
        {
          i = j;
          if (paramBundle != null) {
            break;
          }
          i = 0;
          break;
          localObject2 = this.tNw.getController();
          i = R.k.app_attach_file_icon_video;
          localObject3 = paramBundle.title;
          m((f)localObject1);
        }
        localObject2 = this.tNw.getController();
        localObject3 = paramBundle.title;
        localObject4 = paramBundle.description;
        m((f)localObject1);
        i = j;
        if (com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (String)localObject3, (String)localObject4, a(paramBundle, (f)localObject1)) == null) {
          i = 0;
        }
      }
    case 7: 
      label512:
      label640:
      if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
      {
        localObject2 = this.tNw.getController();
        localObject3 = paramBundle.title;
        m((f)localObject1);
      }
      for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (String)localObject3, false, 0, a(paramBundle, (f)localObject1));; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, i, (String)localObject3, false, a(paramBundle, (f)localObject1)))
      {
        i = j;
        if (paramBundle != null) {
          break;
        }
        i = 0;
        break;
        localObject2 = this.tNw.getController();
        i = R.k.app_attach_file_icon_webpage;
        localObject3 = paramBundle.title;
        m((f)localObject1);
      }
    }
    if ((paramBundle.thumbData != null) && (paramBundle.thumbData.length > 0))
    {
      localObject2 = this.tNw.getController();
      localObject3 = paramBundle.thumbData;
      m((f)localObject1);
    }
    for (paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, (byte[])localObject3, false, a(paramBundle, (f)localObject1));; paramBundle = com.tencent.mm.pluginsdk.ui.applet.g.a((s)localObject2, i, (String)localObject3, false, a(paramBundle, (f)localObject1)))
    {
      i = j;
      if (paramBundle != null) {
        break;
      }
      i = 0;
      break;
      localObject2 = this.tNw.getController();
      i = R.k.app_attach_file_icon_webpage;
      localObject3 = paramBundle.title;
      m((f)localObject1);
    }
  }
  
  public final boolean gh(String paramString1, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.WXAppMessageReceiver", "request, pkg = " + paramString1 + ", openId = " + paramString2);
    GetMessageFromWX.Req localReq = new GetMessageFromWX.Req();
    localReq.username = this.bAG.getTalkerUserName();
    localReq.transaction = com.tencent.mm.a.g.u(ai.VF().getBytes());
    localReq.openId = paramString2;
    paramString2 = this.tNw.getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.chY(), 0);
    this.tNw.getContext();
    localReq.lang = w.d(paramString2);
    au.HU();
    localReq.country = ((String)com.tencent.mm.model.c.DT().get(274436, null));
    paramString2 = new Bundle();
    localReq.toBundle(paramString2);
    p.ae(paramString2);
    p.af(paramString2);
    MMessageActV2.Args localArgs = new MMessageActV2.Args();
    localArgs.targetPkgName = paramString1;
    localArgs.bundle = paramString2;
    boolean bool = MMessageActV2.send(this.tNw.getContext(), localArgs);
    this.tNx.add(localReq.transaction);
    b(this.tNw.getContext(), this.tNx);
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */