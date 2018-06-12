package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.nn;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.mall.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.plugin.wallet_core.model.ag;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.protocal.c.agf;
import com.tencent.mm.protocal.c.azx;
import com.tencent.mm.protocal.c.azy;
import com.tencent.mm.protocal.c.bfr;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.preference.PreferenceTitleCategory;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class MallIndexMenuUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private f eOE;
  private int kYc;
  private List<azy> kZu;
  private HashMap<String, azx> kZv = new HashMap();
  private boolean kZw;
  
  public final int Ys()
  {
    return -1;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "onSceneEnd, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((paramInt1 != 0) || (paramInt2 != 0)) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MallIndexMenuUI", "GetPayMenu error!");
    }
    Object localObject1;
    do
    {
      return;
      localObject1 = ((b)paraml).kYe;
      paramString = ((agf)localObject1).title;
      paraml = ((agf)localObject1).rJS;
      if (((agf)localObject1).rJS == null) {
        break;
      }
      paramInt1 = ((agf)localObject1).rJS.size();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "onGYNetEnd, title: %s, sectors: %s, sectors.size: %s", new Object[] { paramString, paraml, Integer.valueOf(paramInt1) });
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "initPayMenuFromResponse: %s", new Object[] { localObject1 });
    } while (localObject1 == null);
    this.eOE.removeAll();
    if (!bi.oW(((agf)localObject1).title)) {
      setMMTitle(((agf)localObject1).title);
    }
    paramString = new JSONObject();
    g.Ek();
    paraml = (String)g.Ei().DT().get(aa.a.sZn, "");
    if (!bi.oW(paraml)) {}
    for (;;)
    {
      try
      {
        paraml = new JSONObject(paraml);
        paramString = paraml;
        if ((((agf)localObject1).rJS == null) || (((agf)localObject1).rJS.size() <= 0)) {
          break;
        }
        this.kZu = ((agf)localObject1).rJS;
        paramInt2 = 1;
        paraml = ((agf)localObject1).rJS.iterator();
        paramInt1 = 0;
        if (!paraml.hasNext()) {
          break;
        }
        localObject1 = (azy)paraml.next();
        if ((((azy)localObject1).scH == null) || (((azy)localObject1).scH.size() <= 0)) {
          break label1300;
        }
        if ((paramInt2 == 0) && (bi.oW(((azy)localObject1).title))) {
          this.eOE.a(new PreferenceSmallCategory(this));
        }
        if (!bi.oW(((azy)localObject1).title))
        {
          localObject2 = new PreferenceTitleCategory(this);
          ((PreferenceTitleCategory)localObject2).setTitle(((azy)localObject1).title);
          this.eOE.a((Preference)localObject2);
        }
        localObject1 = ((azy)localObject1).scH.iterator();
        if (!((Iterator)localObject1).hasNext()) {
          break label1295;
        }
        localObject2 = (azx)((Iterator)localObject1).next();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "label name: %s", new Object[] { ((azx)localObject2).name });
        localObject3 = new CdnImageIconPreference(this);
        if (!bi.oW(((azx)localObject2).title)) {
          ((CdnImageIconPreference)localObject3).setTitle(((azx)localObject2).title);
        }
        if (!bi.oW(((azx)localObject2).desc))
        {
          ((CdnImageIconPreference)localObject3).Es(0);
          ((CdnImageIconPreference)localObject3).ao(((azx)localObject2).desc, -1, Color.parseColor("#999999"));
        }
        if (!bi.oW(((azx)localObject2).huW)) {
          ((CdnImageIconPreference)localObject3).iconUrl = ((azx)localObject2).huW;
        }
        ((CdnImageIconPreference)localObject3).setKey(((azx)localObject2).name);
        if (paramString.optInt(((azx)localObject2).name, 0) == 1)
        {
          if (((azx)localObject2).scG == null) {
            break label848;
          }
          if (!"1".equals(((azx)localObject2).scG.type)) {
            break label753;
          }
          ((CdnImageIconPreference)localObject3).Es(0);
          ((CdnImageIconPreference)localObject3).lN(true);
          if (!bi.oW(((azx)localObject2).scG.bSc))
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "show red dot wording: %s", new Object[] { ((azx)localObject2).scG.bSc });
            ((CdnImageIconPreference)localObject3).ao(((azx)localObject2).scG.bSc, -1, Color.parseColor("#999999"));
            ((CdnImageIconPreference)localObject3).Es(0);
          }
        }
        ((CdnImageIconPreference)localObject3).Ew(8);
        if (bi.oW(((azx)localObject2).name)) {
          break label857;
        }
        this.kZv.put(((azx)localObject2).name, localObject2);
        this.eOE.a((Preference)localObject3);
        paramInt1 += 1;
        if (paramString.optInt(((azx)localObject2).name, 0) != 1) {
          break label908;
        }
        paramInt2 = 1;
        switch (((azx)localObject2).paB)
        {
        case 6: 
        case 7: 
        default: 
          continue;
          paramInt1 = 0;
        }
      }
      catch (JSONException paraml) {}
      continue;
      label753:
      if ("2".equals(((azx)localObject2).scG.type))
      {
        ((CdnImageIconPreference)localObject3).dk(getString(a.i.app_new), a.e.new_tips_bg);
        ((CdnImageIconPreference)localObject3).Er(0);
      }
      else if ("3".equals(((azx)localObject2).scG.type))
      {
        ((CdnImageIconPreference)localObject3).dk(((azx)localObject2).scG.number, a.e.unread_count_shape);
        ((CdnImageIconPreference)localObject3).Er(0);
        continue;
        label848:
        ((CdnImageIconPreference)localObject3).Et(0);
        continue;
        label857:
        this.kZv.put(paramInt1 + ((azx)localObject2).name + ((azx)localObject2).paB + ((azx)localObject2).title, localObject2);
        continue;
        label908:
        paramInt2 = 0;
      }
    }
    Object localObject3 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject3).h(14872, new Object[] { Integer.valueOf(1), Integer.valueOf(paramInt2), ((azx)localObject2).paC, "", Integer.valueOf(1) });
      break;
    }
    localObject3 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject3).h(14872, new Object[] { Integer.valueOf(2), Integer.valueOf(paramInt2), "", ((azx)localObject2).paD, Integer.valueOf(1) });
      break;
    }
    Object localObject2 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject2).h(14872, new Object[] { Integer.valueOf(3), Integer.valueOf(paramInt2), "", "", Integer.valueOf(1) });
      break;
    }
    localObject2 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject2).h(14872, new Object[] { Integer.valueOf(4), Integer.valueOf(paramInt2), "", "", Integer.valueOf(1) });
      break;
    }
    localObject2 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject2).h(14872, new Object[] { Integer.valueOf(5), Integer.valueOf(paramInt2), "", "", Integer.valueOf(1) });
      break;
    }
    localObject3 = h.mEJ;
    if (paramInt2 != 0) {}
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      ((h)localObject3).h(14872, new Object[] { Integer.valueOf(8), Integer.valueOf(paramInt2), ((azx)localObject2).paC, "", Integer.valueOf(1) });
      break;
    }
    label1295:
    paramInt2 = 0;
    label1300:
    for (;;)
    {
      break;
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "onPreferenceTreeClick, key: %s", new Object[] { paramf });
    azx localazx = (azx)this.kZv.get(paramf);
    Object localObject;
    if (localazx != null)
    {
      paramf = new JSONObject();
      g.Ek();
      localObject = (String)g.Ei().DT().get(aa.a.sZn, "");
      if (bi.oW((String)localObject)) {}
    }
    for (;;)
    {
      try
      {
        localObject = new JSONObject((String)localObject);
        paramf = (f)localObject;
        if (paramf.optInt(localazx.name, 0) != 1) {
          break label1093;
        }
        paramf.remove(localazx.name);
        if (paramf.length() > 0) {
          break label265;
        }
        g.Ek();
        g.Ei().DT().a(aa.a.sZn, "");
        if ((paramPreference instanceof IconPreference))
        {
          ((IconPreference)paramPreference).Et(8);
          ((IconPreference)paramPreference).Er(8);
          ((IconPreference)paramPreference).Es(8);
          ((IconPreference)paramPreference).lN(false);
        }
        i = 1;
        switch (localazx.paB)
        {
        case 6: 
        case 7: 
        default: 
          return true;
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.MallIndexMenuUI", localException, "parse redDotConfig json failed: %s", new Object[] { localException.getMessage() });
      }
      continue;
      label265:
      g.Ek();
      g.Ei().DT().a(aa.a.sZn, paramf.toString());
      continue;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type h5, url: %s", new Object[] { localazx.paC });
      if (!bi.oW(localazx.paC)) {
        com.tencent.mm.wallet_core.ui.e.l(this, localazx.paC, false);
      }
      paramf = h.mEJ;
      if (i != 0) {}
      for (int i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(1), Integer.valueOf(i), localazx.paC, "", Integer.valueOf(0) });
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type tiny app, username: %s, path: %s", new Object[] { localazx.paD, localazx.paD });
      if (!bi.oW(localazx.paD))
      {
        paramf = new qu();
        paramf.cbq.userName = localazx.paD;
        paramf.cbq.cbs = bi.aG(localazx.paE, "");
        paramf.cbq.scene = 1066;
        paramf.cbq.cbt = 0;
        com.tencent.mm.sdk.b.a.sFg.m(paramf);
      }
      paramf = h.mEJ;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(2), Integer.valueOf(i), "", localazx.paD, Integer.valueOf(0) });
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type payment management");
      d.A(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
      paramf = h.mEJ;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(3), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type payment security");
      d.A(this, "wallet", ".pwd.ui.WalletSecuritySettingUI");
      paramf = h.mEJ;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(4), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type wallet switch");
      d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      paramf = h.mEJ;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(5), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        return true;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MallIndexMenuUI", "jump type honey pay");
      d.A(this, "honey_pay", ".ui.HoneyPayMainUI");
      paramf = h.mEJ;
      if (i != 0) {}
      for (i = 1;; i = 0)
      {
        paramf.h(14872, new Object[] { Integer.valueOf(8), Integer.valueOf(i), "", "", Integer.valueOf(0) });
        return true;
      }
      if ("pay_my_msg".equals(paramf))
      {
        if (com.tencent.mm.plugin.wallet_core.model.o.bOW().bPw().bPn())
        {
          paramf = new Intent();
          paramf.putExtra("rawUrl", "https://wx.tenpay.com/userroll/readtemplate?t=userroll/index_tmpl");
          d.b(this, "webview", ".ui.tools.WebViewUI", paramf);
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.He(20);
          return true;
          com.tencent.mm.wallet_core.a.b(this, "ShowOrdersInfoProcess", null);
        }
      }
      if ("pay_manage".equals(paramf))
      {
        if (q.GS()) {
          d.A(this, "wallet_payu", ".pwd.ui.WalletPayUPasswordSettingUI");
        }
        for (;;)
        {
          com.tencent.mm.wallet_core.ui.e.He(21);
          return true;
          d.A(this, "wallet", ".pwd.ui.WalletPasswordSettingUI");
        }
      }
      if ("pay_security".equals(paramf))
      {
        d.A(this, "wallet", ".pwd.ui.WalletSecuritySettingUI");
        com.tencent.mm.wallet_core.ui.e.He(22);
      }
      do
      {
        return false;
        if ("pay_help_center".equals(paramf))
        {
          paramPreference = new Intent();
          if (q.GS()) {}
          for (paramf = "https://wx.tenpay.com/cgi-bin/mmpayweb-bin/readtemplate?t=payu_faq_tmpl";; paramf = "https://kf.qq.com/touch/scene_product.html?scene_id=kf1")
          {
            paramPreference.putExtra("rawUrl", paramf);
            d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
            com.tencent.mm.wallet_core.ui.e.He(23);
            return true;
          }
        }
      } while (!"pay_wallet_switch".equals(paramf));
      d.c(this, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", 1);
      return true;
      label1093:
      i = 0;
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt1 == 1)
    {
      g.Ek();
      this.kYc = ((Integer)g.Ei().DT().get(aa.a.sTs, Integer.valueOf(0))).intValue();
      if (paramInt2 == -1)
      {
        if (!q.GT()) {
          break label51;
        }
        finish();
      }
    }
    return;
    label51:
    finish();
    paramIntent = new nn();
    paramIntent.bYA.context = this.mController.tml;
    com.tencent.mm.sdk.b.a.sFg.m(paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.kZw = getIntent().getBooleanExtra("key_default_show_currency", false);
    g.Ek();
    g.Ei().DT().a(aa.a.sZo, Boolean.valueOf(false));
    setBackBtn(new MallIndexMenuUI.1(this));
    this.eOE = this.tCL;
    setMMTitle(a.i.mall_menu_ui_title);
    g.DF().a(1754, this);
    paramBundle = new b();
    g.DF().a(paramBundle, 0);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    g.DF().b(1754, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/mall/ui/MallIndexMenuUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */