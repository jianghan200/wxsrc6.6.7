package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.c;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.a.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.k.e;
import com.tencent.mm.k.g;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.friend.a.ao;
import com.tencent.mm.plugin.account.friend.a.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.KeyValuePreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import java.io.ByteArrayOutputStream;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class ContactSocialInfoUI
  extends MMPreference
{
  private String bWJ;
  private f gua;
  private ab ipd;
  private String lVA;
  private String lVB;
  private JSONObject lVC;
  private long lVl;
  private String lVm;
  private com.tencent.mm.plugin.account.friend.a.a lVu;
  private String lVv;
  private String lVw;
  private String lVx;
  private String lVy;
  private String lVz;
  
  private void JD(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setFlags(268435456);
    localIntent.setData(Uri.parse("tel:" + paramString));
    startActivity(localIntent);
  }
  
  private void bno()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.lVC.optString("ShopUrl"));
    localIntent.putExtra("geta8key_username", q.GF());
    d.b(this.mController.tml, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
  }
  
  private void m(String paramString1, String paramString2, boolean paramBoolean)
  {
    if ((!bi.oW(paramString2)) && (!bi.oW(paramString1)))
    {
      paramString1 = (KeyValuePreference)this.gua.ZZ(paramString1);
      if (paramString1 != null)
      {
        paramString1.tCD = true;
        paramString1.tCF = 5;
        if (paramBoolean) {
          paramString1.hIZ = getResources().getColor(R.e.link_color);
        }
        paramString1.setSummary(paramString2);
        paramString1.lO(false);
      }
      return;
    }
    this.gua.aaa(paramString1);
  }
  
  private boolean q(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return com.tencent.mm.plugin.account.friend.a.l.a(paramString, this.mController.tml, localByteArrayOutputStream.toByteArray());
    }
    return false;
  }
  
  public final int Ys()
  {
    return R.o.contact_social_infos;
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactSocialInfoUI", paramf + " item has been clicked!");
    if (paramf.equals("contact_info_social_mobile")) {
      if ((this.lVu != null) && (this.ipd != null)) {}
    }
    do
    {
      do
      {
        int i;
        do
        {
          do
          {
            return false;
            au.HU();
            if (c.FR().Yc(this.lVu.getUsername()))
            {
              if ((this.lVu != null) && (!bi.oW(this.lVu.dHL))) {}
              for (paramf = getResources().getStringArray(R.c.profile_alert_all);; paramf = getResources().getStringArray(R.c.profile_alert_short))
              {
                paramPreference = paramf;
                if (com.tencent.mm.plugin.profile.a.ezo.vq())
                {
                  paramf = bi.F(paramf);
                  paramf.add(getResources().getString(R.l.chatting_phone_download_wxpb));
                  paramPreference = (String[])paramf.toArray(new String[paramf.size()]);
                  com.tencent.mm.plugin.report.service.h.mEJ.h(11621, new Object[] { Integer.valueOf(2), Integer.valueOf(3) });
                }
                com.tencent.mm.ui.base.h.a(this, null, paramPreference, null, new ContactSocialInfoUI.2(this, paramPreference));
                return false;
              }
            }
          } while ((this.lVw == null) || (this.lVw.length() == 0));
          i = this.lVw.lastIndexOf(' ') + 1;
        } while (i <= 0);
        JD(this.lVw.substring(i));
        return false;
      } while (paramf.equals("contact_info_social_qq"));
      if (paramf.equals("contact_info_social_linkedin"))
      {
        paramf = this.ipd.csX;
        if (bi.oW(paramf))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactSocialInfoUI", "this liurl is null!");
          return false;
        }
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("geta8key_username", q.GF());
        d.b(this, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramPreference);
        return false;
      }
    } while ((paramf.equals("contact_info_social_facebook")) || (paramf.equals("contact_info_social_googlecontacts")) || (!paramf.equals("contact_info_social_weishop")) || (this.lVC == null));
    au.HU();
    if (c.DT().get(aa.a.sRZ, null) == null)
    {
      com.tencent.mm.ui.base.h.a(this, R.l.contact_info_social_weishop_jump_alert, R.l.app_tip, new ContactSocialInfoUI.4(this), null);
      return false;
    }
    bno();
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.contact_info_social_title);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        ContactSocialInfoUI.this.finish();
        return true;
      }
    });
    this.gua = this.tCL;
    Object localObject1 = getIntent().getStringExtra("Contact_Mobile_MD5");
    Object localObject2 = getIntent().getStringExtra("Contact_full_Mobile_MD5");
    if ((bi.oW((String)localObject1)) && (bi.oW((String)localObject2))) {
      if (bi.oW(this.ipd.field_username)) {
        this.lVu = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(this.bWJ);
      }
    }
    for (;;)
    {
      label150:
      int i;
      if ((this.lVu == null) || (this.lVu.Xh() == null) || (this.lVu.Xh().length() <= 0))
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactSocialInfoUI", "error : this is not the mobile contact, MD5 = " + this.lVv);
        m("contact_info_social_mobile", this.lVw, true);
        au.HU();
        i = bi.f((Integer)c.DT().get(9, null));
        this.lVl = getIntent().getLongExtra("Contact_Uin", 0L);
        this.lVm = getIntent().getStringExtra("Contact_QQNick");
        if ((this.lVl != 0L) && (i != 0))
        {
          if ((this.lVm == null) || (this.lVm.length() == 0))
          {
            long l = this.lVl;
            localObject2 = com.tencent.mm.plugin.account.b.getQQListStg().bK(l);
            localObject1 = localObject2;
            if (localObject2 == null) {
              localObject1 = null;
            }
            if (localObject1 != null) {
              this.lVm = ((ao)localObject1).getDisplayName();
            }
          }
          this.lVx = bi.oV(this.lVm);
          this.lVx = (this.lVx + " " + new o(this.lVl).longValue());
        }
        m("contact_info_social_qq", this.lVx, true);
        localObject1 = g.AT().getValue("LinkedinPluginClose");
        if ((!bi.oW((String)localObject1)) && (Integer.valueOf((String)localObject1).intValue() != 0)) {
          break label822;
        }
        i = 1;
        label380:
        if ((i == 0) || (bi.oW(this.ipd.csV))) {
          break label827;
        }
        this.lVy = this.ipd.csW;
        label408:
        m("contact_info_social_linkedin", this.lVy, true);
        m("contact_info_social_facebook", this.lVz, false);
        this.lVB = bi.aG(getIntent().getStringExtra("verify_gmail"), "");
        this.lVA = bi.aG(getIntent().getStringExtra("profileName"), bi.Xe(this.lVB));
        if ((bi.oW(this.lVB)) || (bi.oW(this.lVA))) {
          break label837;
        }
        m("contact_info_social_googlecontacts", this.lVA + '\n' + this.lVB, false);
        label533:
        if (!q.GF().equals(this.ipd.field_username)) {
          break label851;
        }
        au.HU();
        localObject1 = (String)c.DT().get(aa.a.sRy, null);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactSocialInfoUI", "in self social info page, weishop info:%s", new Object[] { localObject1 });
        if (bi.oW((String)localObject1)) {}
      }
      try
      {
        this.lVC = new JSONObject((String)localObject1);
        if (this.lVC != null)
        {
          m("contact_info_social_weishop", this.lVC.optString("ShopName"), true);
          return;
          this.lVu = com.tencent.mm.plugin.account.b.getAddrUploadStg().pp(this.ipd.field_username);
          continue;
          if (((localObject1 == null) || (((String)localObject1).length() <= 0)) && ((localObject2 == null) || (((String)localObject2).length() <= 0))) {
            continue;
          }
          this.lVu = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq((String)localObject1);
          if ((this.lVu != null) && (this.lVu.Xh() != null) && (this.lVu.Xh().length() > 0)) {
            continue;
          }
          this.lVu = com.tencent.mm.plugin.account.b.getAddrUploadStg().pq((String)localObject2);
          if ((this.lVu == null) || (this.lVu.Xh() == null)) {
            continue;
          }
          this.lVu.Xh().length();
          continue;
          this.lVw = (bi.oV(this.lVu.Xj()) + " " + bi.oV(this.lVu.Xp()).replace(" ", ""));
          break label150;
          label822:
          i = 0;
          break label380;
          label827:
          this.lVy = "";
          break label408;
          label837:
          m("contact_info_social_googlecontacts", "", false);
          break label533;
          label851:
          localObject1 = this.ipd.csY;
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ContactSocialInfoUI", "weiShopInfo:%s", new Object[] { localObject1 });
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.ContactSocialInfoUI", localJSONException, "", new Object[0]);
          this.lVC = null;
        }
        m("contact_info_social_weishop", "", false);
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.bWJ = bi.oV(getIntent().getStringExtra("Contact_User"));
    au.HU();
    this.ipd = c.FR().Yg(this.bWJ);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/ContactSocialInfoUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */