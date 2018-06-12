package com.tencent.mm.ui.chatting.b;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.ak.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.af;
import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.model.s;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.p.a;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.u;
import com.tencent.mm.ui.chatting.ar;
import com.tencent.mm.ui.chatting.as;
import com.tencent.mm.y.g.a;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

@com.tencent.mm.ui.chatting.b.a.a(cwo=com.tencent.mm.ui.chatting.b.b.a.class)
public class b
  extends a
  implements com.tencent.mm.ui.chatting.b.b.a
{
  private com.tencent.mm.plugin.wallet.a myP = null;
  private ar tNY = null;
  private final j.a tNZ = new b.1(this);
  private final j.a tOa = new b.2(this);
  
  private boolean a(com.tencent.mm.storage.bd parambd, com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    if ((!parambd.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq"))) {
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.AppMsgComponent", "jacks open QQ");
    parambd = new Intent("android.intent.action.MAIN", null);
    parambd.addCategory("android.intent.category.LAUNCHER");
    parambd.addFlags(268435456);
    parambd.setClassName("com.tencent.mobileqq", aF(this.bAG.tTq.getContext(), "com.tencent.mobileqq"));
    parambd.putExtra("platformId", "wechat");
    au.HU();
    paramf = com.tencent.mm.model.c.DT().get(9, null);
    int i;
    if ((paramf != null) && ((paramf instanceof Integer))) {
      i = ((Integer)paramf).intValue();
    }
    for (;;)
    {
      if (i != 0) {}
      try
      {
        paramf = String.valueOf(i).getBytes("utf-8");
        byte[] arrayOfByte = "asdfghjkl;'".getBytes("utf-8");
        int k = arrayOfByte.length;
        int j = 0;
        i = 0;
        while (j < k)
        {
          int m = arrayOfByte[j];
          if (i >= paramf.length) {
            break;
          }
          paramf[i] = ((byte)(m ^ paramf[i]));
          j += 1;
          i += 1;
        }
        parambd.putExtra("tencent_gif", paramf);
        i = 0;
      }
      catch (UnsupportedEncodingException paramf)
      {
        try
        {
          for (;;)
          {
            this.bAG.tTq.startActivity(parambd);
            return true;
            paramf = paramf;
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ChattingUI.AppMsgComponent", paramf, "", new Object[0]);
          }
        }
        catch (Exception parambd)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private static String aF(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ChattingUI.AppMsgComponent", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  private void o(com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    if ((paramf == null) || (bi.oW(paramf.field_appId)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "jumpServiceH5 error args");
      return;
    }
    if (bi.oW(paramf.cmY))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "ForwardUrl is null");
      return;
    }
    Object localObject1 = this.bAG.tTq.getContext().getSharedPreferences(ad.chY(), 0);
    this.bAG.tTq.getContext();
    Object localObject2 = w.d((SharedPreferences)localObject1);
    localObject1 = localObject2;
    if ("language_default".equalsIgnoreCase((String)localObject2))
    {
      localObject1 = localObject2;
      if (Locale.getDefault() != null) {
        localObject1 = Locale.getDefault().toString();
      }
    }
    if (s.fq(this.bAG.getTalkerUserName()))
    {
      au.HU();
      localObject2 = com.tencent.mm.model.c.Ga().ih(this.bAG.getTalkerUserName());
      if (localObject2 == null) {}
    }
    for (int i = ((u)localObject2).Nn().size();; i = 1)
    {
      localObject2 = new Intent();
      Bundle localBundle = new Bundle();
      localBundle.putString("jsapi_args_appid", paramf.field_appId);
      localBundle.putBoolean("isFromService", true);
      ((Intent)localObject2).putExtra("forceHideShare", true);
      localBundle.putString("sendAppMsgToUserName", this.bAG.oLT.field_username);
      ((Intent)localObject2).putExtra("jsapiargs", localBundle);
      ((Intent)localObject2).putExtra("show_bottom", false);
      ((Intent)localObject2).putExtra("rawUrl", String.format("%s&wxchatmembers=%s&lang=%s", new Object[] { paramf.cmY, Integer.valueOf(i), localObject1 }));
      d.b(this.bAG.tTq.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject2);
      return;
    }
  }
  
  public final void a(com.tencent.mm.pluginsdk.ui.tools.m paramm)
  {
    br.IE().c(38, new Object[] { Integer.valueOf(1) });
    Object localObject = paramm.filePath;
    paramm = new WXMediaMessage(new WXFileObject((String)localObject));
    paramm.title = new File((String)localObject).getName();
    paramm.description = bi.bF(com.tencent.mm.a.e.cm((String)localObject));
    localObject = new com.tencent.mm.pluginsdk.model.app.f();
    ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appId = "wx4310bbd51be7d979";
    com.tencent.mm.pluginsdk.model.app.ao.bmf().b((com.tencent.mm.sdk.e.c)localObject, new String[0]);
    l.a(paramm, ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appId, ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appName, this.bAG.getTalkerUserName(), 2, null);
  }
  
  public final void aR(com.tencent.mm.storage.bd parambd)
  {
    Object localObject1 = parambd.field_content;
    Object localObject2;
    if (parambd.field_isSend == 0)
    {
      localObject2 = this.bAG;
      int i = parambd.field_isSend;
      if ((!((com.tencent.mm.ui.chatting.b.b.c)((com.tencent.mm.ui.chatting.c.a)localObject2).O(com.tencent.mm.ui.chatting.b.b.c.class)).cus()) && (s.fq(((com.tencent.mm.ui.chatting.c.a)localObject2).getTalkerUserName())) && (localObject1 != null) && (i == 0)) {
        localObject1 = com.tencent.mm.model.bd.iC((String)localObject1);
      }
    }
    for (;;)
    {
      localObject2 = g.a.gp((String)localObject1);
      com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bl(((g.a)localObject2).appId, true);
      if ((localf != null) && (com.tencent.mm.pluginsdk.model.app.p.r(this.bAG.tTq.getContext(), localf.field_packageName)))
      {
        if (localf.field_status == 3) {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "requestAppShow fail, app is in blacklist, packageName = " + localf.field_packageName);
        }
        do
        {
          return;
          if (!com.tencent.mm.pluginsdk.model.app.p.b(this.bAG.tTq.getContext(), localf))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "The app %s signature is incorrect.", new Object[] { localf.field_appName });
            Toast.makeText(this.bAG.tTq.getContext(), this.bAG.tTq.getMMResources().getString(R.l.game_launch_fail_alert, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.bAG.tTq.getContext(), localf, null) }), 1).show();
            return;
          }
        } while (a(parambd, localf));
        WXAppExtendObject localWXAppExtendObject = new WXAppExtendObject();
        localWXAppExtendObject.extInfo = ((g.a)localObject2).extInfo;
        if ((((g.a)localObject2).bGP != null) && (((g.a)localObject2).bGP.length() > 0))
        {
          localObject1 = com.tencent.mm.pluginsdk.model.app.ao.asF().SR(((g.a)localObject2).bGP);
          if (localObject1 != null) {
            break label425;
          }
        }
        label425:
        for (localObject1 = null;; localObject1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath)
        {
          localWXAppExtendObject.filePath = ((String)localObject1);
          localObject1 = new WXMediaMessage();
          ((WXMediaMessage)localObject1).sdkVer = 620823808;
          ((WXMediaMessage)localObject1).mediaObject = localWXAppExtendObject;
          ((WXMediaMessage)localObject1).title = ((g.a)localObject2).title;
          ((WXMediaMessage)localObject1).description = ((g.a)localObject2).description;
          ((WXMediaMessage)localObject1).messageAction = ((g.a)localObject2).messageAction;
          ((WXMediaMessage)localObject1).messageExt = ((g.a)localObject2).messageExt;
          ((WXMediaMessage)localObject1).thumbData = com.tencent.mm.a.e.e(o.Pf().lN(parambd.field_imgPath), 0, -1);
          new as(this.bAG.tTq.getContext()).a(localf.field_packageName, (WXMediaMessage)localObject1, localf.field_appId, localf.field_openId);
          return;
        }
      }
      parambd = com.tencent.mm.pluginsdk.model.app.p.y(this.bAG.tTq.getContext(), ((g.a)localObject2).appId, "message");
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", parambd);
      d.b(this.bAG.tTq.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      return;
    }
  }
  
  public final void cpH()
  {
    this.myP = com.tencent.mm.plugin.wallet.a.cp(this.bAG.oLT.field_username, 1);
    this.myP.aM(1, this.bAG.oLT.field_username);
    com.tencent.mm.pluginsdk.model.app.ao.asF().c(this.tNZ);
    com.tencent.mm.pluginsdk.model.app.ao.bmf().c(this.tOa);
    if (this.tNY == null) {
      this.tNY = new ar(this.bAG);
    }
    ar localar = this.tNY;
    this.bAG.tTq.getContext();
    ar.tNy.a(localar, null);
  }
  
  public final void cpJ() {}
  
  public final void cpK()
  {
    ar localar = this.tNY;
    this.bAG.tTq.getContext();
    ar.tNy.remove(localar);
    localar.tNx.clear();
    ar.b(localar.tNw.getContext(), null);
    if (au.HX())
    {
      com.tencent.mm.pluginsdk.model.app.ao.asF().d(this.tNZ);
      com.tencent.mm.pluginsdk.model.app.ao.bmf().d(this.tOa);
    }
  }
  
  public final void n(com.tencent.mm.pluginsdk.model.app.f paramf)
  {
    if (paramf == null) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSelected, info is null, %s", new Object[] { bi.cjd() });
    }
    label360:
    do
    {
      do
      {
        do
        {
          boolean bool;
          do
          {
            return;
            if ((paramf != null) && (com.tencent.mm.pluginsdk.model.app.f.qzE.equals(paramf.field_appId)) && (this.myP != null)) {
              this.myP.aM(2, this.bAG.oLT.field_username);
            }
            if (!paramf.cbJ()) {
              break label360;
            }
            if ((paramf == null) || (!paramf.cbJ()))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect not service app");
              return;
            }
            if ((this.bAG.oLT == null) || (bi.oW(this.bAG.oLT.field_username)))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "serviceAppSelect talker is null");
              return;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.AppMsgComponent", "serviceApp, jumpType[%d], package[%s], appid[%s]", new Object[] { Integer.valueOf(paramf.cmZ), paramf.field_packageName, paramf.field_appId });
            if ((paramf.cmZ == 2) && (!bi.oW(paramf.cmY)))
            {
              o(paramf);
              return;
            }
            if (paramf.cmZ != 3) {
              break;
            }
            if (bi.oW(paramf.field_openId))
            {
              com.tencent.mm.pluginsdk.model.app.ao.bmh().pS(paramf.field_appId);
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail, openId is null, go get it");
              return;
            }
            if ((this.tNY == null) || (bi.oW(paramf.field_packageName)))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP fail");
              o(paramf);
              return;
            }
            bool = this.tNY.gh(paramf.field_packageName, paramf.field_openId);
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP 3RD APP success[%s]", new Object[] { Boolean.valueOf(bool) });
          } while (bool);
          o(paramf);
          return;
        } while (paramf.cmZ != 1);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.AppMsgComponent", "JUMP NATIVE ForwardUrl[%s]", new Object[] { paramf.cmY });
        p.a.qyl.a(this.bAG.tTq.getContext(), paramf.cmY, false, new b.3(this));
        return;
        if (paramf.field_status == 3)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "onAppSeleted fail, app is in blacklist, packageName = " + paramf.field_packageName);
          return;
        }
      } while ((this.tNY.gh(paramf.field_packageName, paramf.field_openId)) || (paramf.field_status != 5));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.AppMsgComponent", "SuggestionApp appSuggestionIntroUrl = %s", new Object[] { paramf.cmM });
    } while (bi.oW(paramf.cmM));
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", paramf.cmM);
    d.b(this.bAG.tTq.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt1)
    {
    }
    boolean bool;
    do
    {
      do
      {
        do
        {
          return;
        } while (paramInt2 != -1);
        long l = paramIntent.getLongExtra("App_MsgId", 0L);
        au.HU();
        aR(com.tencent.mm.model.c.FT().dW(l));
        return;
      } while ((paramInt2 != -1) || (paramIntent == null));
      String str1 = paramIntent.getStringExtra("service_app_package_name");
      String str2 = paramIntent.getStringExtra("service_app_openid");
      paramIntent = paramIntent.getStringExtra("service_app_appid");
      if (this.tNY != null) {}
      for (bool = true;; bool = false)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg, wxmessage[%b], package[%s], appId[%s], openId[%s]", new Object[] { Boolean.valueOf(bool), str1, paramIntent, str2 });
        if (!bi.oW(paramIntent)) {
          break;
        }
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "REQUEST_CODE_SERVICE_APP openId is null");
        return;
      }
      if ((this.tNY == null) || (bi.oW(str1)))
      {
        o(com.tencent.mm.pluginsdk.model.app.g.bl(paramIntent, true));
        return;
      }
      if (bi.oW(str2))
      {
        com.tencent.mm.pluginsdk.model.app.ao.bmh().pS(paramIntent);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg fail, openId is null, go get it");
        return;
      }
      bool = this.tNY.gh(str1, str2);
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ChattingUI.AppMsgComponent", "request send wx msg success = %b", new Object[] { Boolean.valueOf(bool) });
    } while (bool);
    o(com.tencent.mm.pluginsdk.model.app.g.bl(paramIntent, true));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/chatting/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */