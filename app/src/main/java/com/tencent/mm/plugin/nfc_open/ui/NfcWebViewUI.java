package com.tencent.mm.plugin.nfc_open.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.a;
import com.tencent.mm.plugin.nfc.a.c;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.protocal.c.awf;
import com.tencent.mm.protocal.c.kw;
import com.tencent.mm.protocal.c.pl;
import com.tencent.mm.protocal.c.qj;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMWebView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NfcWebViewUI
  extends WebViewUI
{
  private String lFv = null;
  private boolean lFw = false;
  private com.tencent.mm.plugin.nfc_open.a.a lFx = new com.tencent.mm.plugin.nfc_open.a.a();
  
  private String IM(String paramString)
  {
    x.i("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl start");
    this.lFv = "";
    try
    {
      paramString = paramString.split(" ");
      if ((paramString != null) && (paramString.length > 1))
      {
        i = 0;
        boolean bool1 = false;
        boolean bool2;
        for (;;)
        {
          bool2 = bool1;
          if (i >= paramString.length - 1) {
            break;
          }
          String str1 = paramString[i];
          String str2 = paramString[(i + 1)];
          x.d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl cmd = " + str1 + " anwser = " + str2);
          bool1 = a(new com.tencent.mm.plugin.nfc.a.a(com.tencent.mm.plugin.nfc.d.a.hexStringToByteArray(str1)), str2);
          bool2 = bool1;
          if (!bool1) {
            break;
          }
          i = i + 1 + 1;
        }
        if (bool2)
        {
          this.lFv = paramString[(paramString.length - 1)];
          x.d("MicroMsg.NfcWebViewUI", "nfc-getDebugNfcCardGuideUrl tempurl = " + this.lFv);
          paramString = this.lFv;
          return paramString;
        }
      }
    }
    catch (Exception paramString)
    {
      x.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
      x.e("MicroMsg.NfcWebViewUI", "[NFC] Debug get nfc card type exception!" + paramString.toString());
      int i = com.tencent.mm.plugin.nfc.c.a.a.bjr().dW(this.mController.tml);
      x.e("MicroMsg.NfcWebViewUI", "isConnect:" + i);
      this.lFv = tY(1);
      return this.lFv;
    }
    return this.lFv;
  }
  
  private String IN(String paramString)
  {
    x.i("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl start");
    this.lFv = "";
    Object localObject1 = new awf();
    if (!bi.oW(paramString)) {}
    for (;;)
    {
      int k;
      try
      {
        ((awf)localObject1).aG(paramString.getBytes("ISO-8859-1"));
        if (((awf)localObject1).ruL != null)
        {
          i = 0;
          int m = 0;
          if (m < ((awf)localObject1).ruL.size())
          {
            paramString = (kw)((awf)localObject1).ruL.get(m);
            Object localObject2 = com.tencent.mm.plugin.nfc.c.a.a.bjr();
            if (((com.tencent.mm.plugin.nfc.c.a.a)localObject2).lFk != null) {
              ((com.tencent.mm.plugin.nfc.c.a.a)localObject2).lFk.bjs();
            }
            k = i;
            if (paramString != null)
            {
              k = i;
              if (!bi.oW(paramString.qYo))
              {
                k = i;
                if (!bi.cX(paramString.rmS))
                {
                  k = 0;
                  if (k >= paramString.rmS.size()) {
                    break label575;
                  }
                  if (bi.cX(((qj)paramString.rmS.get(k)).ruO)) {
                    break label548;
                  }
                  j = 0;
                  if (j >= ((qj)paramString.rmS.get(k)).ruO.size()) {
                    break label545;
                  }
                  if ((((qj)paramString.rmS.get(k)).ruO.get(j) == null) || (bi.oW(((pl)((qj)paramString.rmS.get(k)).ruO.get(j)).rtL)) || (bi.oW(((pl)((qj)paramString.rmS.get(k)).ruO.get(j)).kQE))) {
                    break label542;
                  }
                  localObject2 = ((pl)((qj)paramString.rmS.get(k)).ruO.get(j)).rtL;
                  String str = ((pl)((qj)paramString.rmS.get(k)).ruO.get(j)).kQE;
                  x.d("MicroMsg.NfcWebViewUI", "nfc-getCommonNfcCardGuideUrl cmd = " + (String)localObject2 + " anwser = " + str);
                  if (!a(new com.tencent.mm.plugin.nfc.a.a(com.tencent.mm.plugin.nfc.d.a.hexStringToByteArray((String)localObject2)), str)) {
                    break label558;
                  }
                  i = 1;
                  break label551;
                  k = j;
                  if (j != 0)
                  {
                    localObject1 = paramString.qYo;
                    x.i("MicroMsg.NfcWebViewUI", "doCardTypeReport start");
                    com.tencent.mm.sdk.f.e.post(new NfcWebViewUI.2(this, (String)localObject1), getClass().getName());
                    paramString = paramString.qYo;
                    return paramString;
                  }
                }
              }
            }
            i = k;
            m += 1;
            continue;
          }
        }
        return this.lFv;
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.NfcWebViewUI", paramString, "", new Object[0]);
        x.e("MicroMsg.NfcWebViewUI", "[NFC] Common get nfc card type exception!" + paramString.toString());
        i = com.tencent.mm.plugin.nfc.c.a.a.bjr().dW(this.mController.tml);
        x.e("MicroMsg.NfcWebViewUI", "isConnect:" + i);
        this.lFv = tY(1);
        return this.lFv;
      }
      label542:
      break label551;
      label545:
      break label560;
      label548:
      break label566;
      label551:
      j += 1;
      continue;
      label558:
      int i = 0;
      label560:
      int j = i;
      if (i == 0)
      {
        label566:
        k += 1;
        continue;
        label575:
        j = i;
      }
    }
  }
  
  private static boolean V(Intent paramIntent)
  {
    if (paramIntent == null)
    {
      x.e("MicroMsg.NfcWebViewUI", "intent is null");
      return true;
    }
    Iterator localIterator = paramIntent.getExtras().keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((str != null) && (!str.startsWith("android.nfc")))
      {
        x.e("MicroMsg.NfcWebViewUI", "extra wrong key = " + str);
        localIterator.remove();
      }
    }
    paramIntent = paramIntent.getParcelableExtra("android.nfc.extra.TAG");
    if ((paramIntent != null) && ((paramIntent instanceof Tag))) {}
    for (paramIntent = (Tag)paramIntent;; paramIntent = null)
    {
      if (paramIntent == null)
      {
        x.e("MicroMsg.NfcWebViewUI", "tag is null");
        return true;
      }
      return false;
    }
  }
  
  private void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    switch (NfcWebViewUI.3.hdM[parama.ordinal()])
    {
    default: 
      finish();
      return;
    }
    parama = paramIntent.getParcelableExtra("android.nfc.extra.TAG");
    if ((parama != null) && ((parama instanceof Tag))) {}
    for (parama = (Tag)parama;; parama = null)
    {
      if (parama == null)
      {
        x.e("MicroMsg.NfcWebViewUI", "[NFC]tag is null");
        return;
      }
      try
      {
        com.tencent.mm.plugin.nfc.c.a.a.bjr().a(parama);
        int i = com.tencent.mm.plugin.nfc.c.a.a.bjr().dX(this.mController.tml);
        x.i("MicroMsg.NfcWebViewUI", "[NFC] connect status : " + i);
        return;
      }
      catch (Exception parama)
      {
        x.e("MicroMsg.NfcWebViewUI", "exp protect");
        return;
      }
    }
  }
  
  private static boolean a(com.tencent.mm.plugin.nfc.a.a parama, String paramString)
  {
    x.i("MicroMsg.NfcWebViewUI", "nfc-doCmd start");
    parama = com.tencent.mm.plugin.nfc.c.a.a.bjr().a(parama).toString();
    if (!bi.oW(parama))
    {
      x.d("MicroMsg.NfcWebViewUI", "nfc-judge mAnwser = " + bi.oV(paramString) + " resp = " + bi.oV(parama));
      if (!Pattern.compile(paramString, 2).matcher(parama).find()) {}
    }
    for (int i = 1; i != 0; i = 0) {
      return true;
    }
    return false;
  }
  
  private boolean bjv()
  {
    try
    {
      if (this.gcO.bVA())
      {
        x.w("MicroMsg.NfcWebViewUI", "not login");
        Intent localIntent = new Intent(this, getClass());
        localIntent.putExtras(getIntent());
        localIntent.addFlags(67108864);
        this.gcO.aj(localIntent);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      x.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
      return true;
    }
    return false;
  }
  
  private String bjw()
  {
    Object localObject1 = null;
    x.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl start");
    for (;;)
    {
      try
      {
        localObject2 = this.gcO.g(4006, null);
        if (localObject2 == null)
        {
          x.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl data is null");
          return null;
        }
        ((Bundle)localObject2).setClassLoader(getClass().getClassLoader());
        str = ((Bundle)localObject2).getString("debugConfig");
        localObject2 = ((Bundle)localObject2).getString("config");
        if (str == null) {
          continue;
        }
        str = IM(str);
        localObject1 = str;
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject2;
        String str;
        x.e("MicroMsg.NfcWebViewUI", localRemoteException.toString());
        x.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
        continue;
      }
      x.i("MicroMsg.NfcWebViewUI", "nfc-getNfcCpuCardGuideUrl targetUrl=" + bi.oV((String)localObject1));
      return (String)localObject1;
      str = IN((String)localObject2);
      localObject1 = str;
    }
  }
  
  private void bjx()
  {
    Intent localIntent = new Intent();
    localIntent.addFlags(67108864);
    com.tencent.mm.bg.d.e(this, "com.tencent.mm.ui.LauncherUI", localIntent);
    finish();
    overridePendingTransition(R.a.anim_not_change, R.a.pop_out);
    x.i("MicroMsg.NfcWebViewUI", "lo-nfc-setBackBtn:back click after login");
  }
  
  private static String tY(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error");
    localStringBuilder.append("&type=").append(paramInt);
    String str;
    if ((!com.tencent.mm.sdk.platformtools.e.sFF) && (w.chP().equals("zh_CN"))) {
      str = "zh_CN";
    }
    for (;;)
    {
      localStringBuilder.append("&lang=").append(str);
      return localStringBuilder.toString();
      if (w.chN()) {
        str = "zh_TW";
      } else {
        str = "en";
      }
    }
  }
  
  protected final void ant()
  {
    if (bjv())
    {
      finish();
      x.w("MicroMsg.NfcWebViewUI", "not login, go to SimpleLogin");
      return;
    }
    super.ant();
    a(AutoLoginActivity.a.qEF, getIntent());
  }
  
  protected final void gU(boolean paramBoolean)
  {
    if (this.gcO == null) {
      x.e("MicroMsg.NfcWebViewUI", "[NFC] invoker is null");
    }
    Object localObject2;
    do
    {
      return;
      a(AutoLoginActivity.a.qEF, getIntent());
      Object localObject1 = bjw();
      localObject2 = this.cbP;
      if ((paramBoolean) && (!bi.oW(this.cbP)) && (!this.cbP.startsWith("https://support.weixin.qq.com/security/readtemplate?t=bus_recharge/index_error"))) {
        for (;;)
        {
          try
          {
            paramBoolean = bi.oW((String)localObject1);
            if (paramBoolean) {
              continue;
            }
          }
          catch (RemoteException localRemoteException)
          {
            int i;
            x.printErrStackTrace("MicroMsg.NfcWebViewUI", localRemoteException, "", new Object[0]);
            continue;
          }
          try
          {
            localObject2 = Uri.parse((String)localObject1);
            localObject1 = Uri.parse(this.cbP);
            localObject2 = ((Uri)localObject2).getHost();
            localObject1 = ((Uri)localObject1).getHost();
            x.i("MicroMsg.NfcWebViewUI", "targetHost=" + (String)localObject2 + ", curHost=" + (String)localObject1);
            paramBoolean = ((String)localObject2).equals(localObject1);
            if (paramBoolean)
            {
              i = 1;
              if (i != 0) {
                this.pRY.c(4007, new Bundle());
              }
              x.i("MicroMsg.NfcWebViewUI", "[NFC]new intent not guide the page");
              return;
            }
          }
          catch (Exception localException) {}
          i = 0;
        }
      }
      this.cbP = localRemoteException;
      if (bi.oW(this.cbP))
      {
        this.cbP = tY(0);
        x.e("MicroMsg.NfcWebViewUI", "[NFC] url not found! not support this card ?");
      }
      getIntent().putExtra("rawUrl", this.cbP);
    } while (this.cbP.equals(localObject2));
    x.i("MicroMsg.NfcWebViewUI", "lo-nfc-dealwithNFC: onNewIntent load:" + this.cbP);
    this.mhH.loadUrl(this.cbP);
  }
  
  public void onBackPressed()
  {
    if (this.lFw)
    {
      bjx();
      return;
    }
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    Intent localIntent = getIntent();
    if (V(localIntent))
    {
      x.e("MicroMsg.NfcWebViewUI", "onCreate judgeIllegalCall finish");
      localIntent.putExtra("key_trust_url", false);
      super.onCreate(paramBundle);
      finish();
      return;
    }
    localIntent.putExtra("key_trust_url", false);
    super.onCreate(paramBundle);
    com.tencent.mm.sdk.b.a.sFg.b(this.lFx);
    com.tencent.mm.bg.d.cfH();
    x.i("MicroMsg.NfcWebViewUI", "onCreate, intent action = " + localIntent.getAction());
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        if (NfcWebViewUI.a(NfcWebViewUI.this)) {
          NfcWebViewUI.b(NfcWebViewUI.this);
        }
        for (;;)
        {
          return true;
          NfcWebViewUI.this.finish();
        }
      }
    });
    getIntent().putExtra("showShare", false);
    ka(false);
  }
  
  @TargetApi(11)
  protected void onDestroy()
  {
    super.onDestroy();
    com.tencent.mm.sdk.b.a.sFg.c(this.lFx);
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    if (V(paramIntent))
    {
      x.e("MicroMsg.NfcWebViewUI", "onNewIntent judgeIllegalCall finish");
      return;
    }
    paramIntent.putExtra("key_trust_url", false);
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    int i = com.tencent.mm.sdk.platformtools.s.a(paramIntent, "wizard_activity_result_code", Integer.MAX_VALUE);
    x.i("MicroMsg.NfcWebViewUI", "onNewIntent, resultCode = " + i);
    if (i != Integer.MAX_VALUE) {
      this.lFw = true;
    }
    switch (i)
    {
    default: 
    case -1: 
    case 1: 
      for (;;)
      {
        gU(true);
        x.i("Foreground dispatch", "Discovered tag with intent: " + paramIntent);
        return;
        a(AutoLoginActivity.a.qEF, paramIntent);
        continue;
        a(AutoLoginActivity.a.qEH, paramIntent);
      }
    }
    bjv();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/nfc_open/ui/NfcWebViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */