package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.jg.JgClassChecked;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.gf;
import com.tencent.mm.model.q;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.pluginsdk.wallet.h;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author=50, fComment="checked", lastDate="20141016", reviewer=50, vComment={com.jg.EType.ACTIVITYCHECK})
public class WXCustomSchemeEntryActivity
  extends AutoLoginActivity
{
  private List<String> hed;
  
  private String atC()
  {
    if (com.tencent.mm.compatible.util.d.fT(21)) {
      try
      {
        Object localObject = Class.forName("android.app.Activity").getDeclaredField("mReferrer");
        ((Field)localObject).setAccessible(true);
        localObject = (String)((Field)localObject).get(this);
        return (String)localObject;
      }
      catch (Exception localException)
      {
        x.printErrStackTrace("MicroMsg.WXCustomSchemeEntryActivity", localException, "", new Object[0]);
        return "No referrer";
      }
    }
    return "";
  }
  
  protected final boolean A(Intent paramIntent)
  {
    try
    {
      paramIntent = getIntent().getData();
      if (paramIntent != null) {
        if (com.tencent.mm.pluginsdk.d.SA(paramIntent.toString())) {
          return true;
        }
      }
    }
    catch (Exception paramIntent)
    {
      String str1;
      String str2;
      do
      {
        String str3;
        do
        {
          for (;;)
          {
            x.e("MicroMsg.WXCustomSchemeEntryActivity", "get url from intent failed : %s", new Object[] { paramIntent.getMessage() });
            paramIntent = null;
          }
          str3 = paramIntent.getScheme();
          str1 = paramIntent.getHost();
          str2 = paramIntent.getQuery();
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "uri is %s,scheme is %s, host is %s, query is %s", new Object[] { paramIntent.toString(), str3, str1, str2 });
          if ((bi.oW(str1)) || (!this.hed.contains(str1))) {
            break label299;
          }
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "match the host : %s", new Object[] { str1 });
          if (!str1.equals("cardpackage")) {
            break;
          }
          str3 = paramIntent.getQueryParameter("encrystr");
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "card encrypt value = %s", new Object[] { str3 });
        } while ((!bi.oW(str3)) && (str3.length() < 1024));
        if (!str1.equals("connectToFreeWifi")) {
          break;
        }
        if ((bi.oW(str2)) || (!str2.startsWith("apKey=")) || (str2.length() <= 6)) {
          break label285;
        }
        str2 = str2.substring(6);
        x.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { str2 });
      } while ((!bi.oW(str2)) && (str2.length() < 1024));
      while ((str1.equals("wap")) && (paramIntent.toString().startsWith("weixin://wap/pay")))
      {
        x.i("MicroMsg.WXCustomSchemeEntryActivity", "preLogin for WX_WAP_PAY");
        return true;
        label285:
        if (paramIntent.toString().startsWith("weixin://connectToFreeWifi/friendWifi")) {
          return true;
        }
      }
      label299:
      finish();
    }
    return false;
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    switch (WXCustomSchemeEntryActivity.5.hdM[parama.ordinal()])
    {
    }
    for (;;)
    {
      finish();
      return;
      try
      {
        localUri = getIntent().getData();
        if (localUri == null) {
          continue;
        }
        if (localUri != null)
        {
          i = 2;
          if (paramIntent != null) {
            i = s.a(paramIntent, "translate_link_scene", 2);
          }
          int j = s.a(paramIntent, "pay_channel", -1);
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "translateLinkScene = %d, payChannel = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
          parama = null;
          if (j >= 0)
          {
            x.i("MicroMsg.WXCustomSchemeEntryActivity", "doTicketsDeepLink put paychannel to extraData: %s", new Object[] { Integer.valueOf(j) });
            parama = new Bundle();
            parama.putInt("pay_channel", j);
          }
          str1 = atC();
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "packageName %s", new Object[] { str1 });
          if (parama != null) {
            break label1012;
          }
          parama = new Bundle();
          parama.putString("pay_package", str1);
          if (!com.tencent.mm.pluginsdk.d.SA(localUri.toString())) {
            break label574;
          }
          if (!com.tencent.mm.pluginsdk.d.k(localUri)) {
            break label318;
          }
          boolean bool = com.tencent.mm.pluginsdk.d.l(localUri);
          x.i("MicroMsg.WXCustomSchemeEntryActivity", "isTicketLink uri:%s, %b", new Object[] { localUri.toString(), Boolean.valueOf(bool) });
          if (bool)
          {
            com.tencent.mm.pluginsdk.d.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.1(this));
            i = 1;
            if (i == 0) {
              continue;
            }
            return;
          }
        }
      }
      catch (Exception parama)
      {
        label318:
        label574:
        label926:
        label956:
        label1010:
        label1012:
        for (;;)
        {
          int i;
          String str1;
          x.e("MicroMsg.WXCustomSchemeEntryActivity", "post login get url from intent failed : %s", new Object[] { parama.getMessage() });
          Uri localUri = null;
          continue;
          com.tencent.mm.pluginsdk.d.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.2(this));
          for (;;)
          {
            i = 0;
            break;
            String str2;
            if (com.tencent.mm.pluginsdk.d.SB(localUri.toString()))
            {
              if (i == 1)
              {
                localObject1 = u.Hx().ia("key_data_center_session_id");
                if (localObject1 == null)
                {
                  x.e("MicroMsg.WXCustomSchemeEntryActivity", "null keyvalue for opensdk scene");
                  finish();
                  continue;
                }
                str1 = ((u.b)localObject1).getString("key_package_name", "");
                localObject1 = ((u.b)localObject1).getString("key_package_signature", "");
                localObject2 = paramIntent.getStringExtra("key_package_name");
                str2 = paramIntent.getStringExtra("key_package_signature");
                x.i("MicroMsg.WXCustomSchemeEntryActivity", "pkg = %s, sig = %s, intentpkg = %s, intentsig = %s", new Object[] { str1, localObject1, localObject2, str2 });
                u.Hx().ib("key_data_center_session_id");
                if ((!str1.equals(localObject2)) || (!((String)localObject1).equals(str2)))
                {
                  x.e("MicroMsg.WXCustomSchemeEntryActivity", "signature or package check failed");
                  finish();
                  continue;
                }
              }
              com.tencent.mm.pluginsdk.d.a(this, localUri.toString(), i, parama, new WXCustomSchemeEntryActivity.3(this), paramIntent.getStringExtra("key_package_name"), paramIntent.getStringExtra("key_package_signature"));
              i = 1;
              break;
            }
            parama = q.GF();
            x.i("MicroMsg.WXCustomSchemeEntryActivity", "not TicketLink uri:%s", new Object[] { localUri.toString() });
            com.tencent.mm.pluginsdk.d.a(this, localUri.toString(), parama, 23, localUri.toString(), new WXCustomSchemeEntryActivity.4(this));
            continue;
            Object localObject2 = localUri.getScheme();
            parama = localUri.getHost();
            Object localObject1 = localUri.getQuery();
            x.i("MicroMsg.WXCustomSchemeEntryActivity", "scheme is %s, host is %s, query is %s", new Object[] { localObject2, parama, localObject1 });
            if ((!bi.oW(parama)) && (this.hed.contains(parama)))
            {
              if ((parama.equals("cardpackage")) && (!bi.oW(localUri.getQueryParameter("encrystr"))))
              {
                paramIntent.setClassName(this, "com.tencent.mm.ui.CheckSmsCanAddCardUI");
                startActivity(paramIntent);
              }
              if (parama.equals("connectToFreeWifi"))
              {
                if ((bi.oW((String)localObject1)) || (!((String)localObject1).startsWith("apKey="))) {
                  break label956;
                }
                localObject2 = localUri.getQueryParameter("apKey");
                x.i("MicroMsg.WXCustomSchemeEntryActivity", "apKey value = %s", new Object[] { localObject2 });
                str2 = localUri.getQueryParameter("ticket");
                if ((!bi.oW((String)localObject2)) && (((String)localObject2).length() < 1024))
                {
                  paramIntent = new Intent();
                  paramIntent.putExtra("free_wifi_schema_uri", localUri.toString());
                  paramIntent.putExtra("free_wifi_ap_key", (String)localObject2);
                  paramIntent.putExtra("free_wifi_source", 5);
                  paramIntent.putExtra("free_wifi_threeone_startup_type", 1);
                  if (!bi.oW(str2)) {
                    paramIntent.putExtra("free_wifi_schema_ticket", str2);
                  }
                  if ((!((String)localObject2).startsWith("_")) && (!bi.oW(str2))) {
                    break label926;
                  }
                  paramIntent.addFlags(67108864);
                  com.tencent.mm.bg.d.b(this, "freewifi", ".ui.FreeWifiEntryUI", paramIntent);
                }
              }
              for (;;)
              {
                if ((!parama.equals("wap")) || (!localUri.toString().startsWith("weixin://wap/pay"))) {
                  break label1010;
                }
                x.i("MicroMsg.WXCustomSchemeEntryActivity", "postLogin for WX_WAP_PAY packageNameFrommThird %s", new Object[] { str1 });
                if (TextUtils.isEmpty((CharSequence)localObject1)) {
                  break;
                }
                h.a(this, com.tencent.mm.pluginsdk.e.a.SJ((String)localObject1), false, str1);
                break;
                localObject2 = new gf();
                ((gf)localObject2).bPr.intent = paramIntent;
                com.tencent.mm.sdk.b.a.sFg.m((b)localObject2);
                continue;
                if (localUri.toString().startsWith("weixin://connectToFreeWifi/friendWifi"))
                {
                  paramIntent = new Intent();
                  paramIntent.putExtra("key_connected_router", localUri.toString());
                  com.tencent.mm.bg.d.b(this, "exdevice", ".ui.ExdeviceConnectedRouterActivateStateUI", paramIntent);
                  x.i("MicroMsg.WXCustomSchemeEntryActivity", "Jump to ExdeviceConnectedRouterUi.");
                }
              }
            }
          }
        }
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return R.i.biz_share_check;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    x.i("MicroMsg.WXCustomSchemeEntryActivity", "onCreate");
    this.hed = new ArrayList();
    this.hed.add("cardpackage");
    this.hed.add("connectToFreeWifi");
    this.hed.add("wap");
    super.onCreate(paramBundle);
    setTitleVisibility(0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/base/stub/WXCustomSchemeEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */