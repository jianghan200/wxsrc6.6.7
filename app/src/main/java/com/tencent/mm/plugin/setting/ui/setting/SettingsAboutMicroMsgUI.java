package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.e;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.plugin.setting.a.k;
import com.tencent.mm.plugin.y.b;
import com.tencent.mm.pluginsdk.f.e.a;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.IconSummaryPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.r;
import com.tencent.mm.ui.y;

public class SettingsAboutMicroMsgUI
  extends MMPreference
  implements com.tencent.mm.ab.e
{
  private f eOE;
  private boolean mQU = false;
  private aiv mQV;
  private int mQW = 0;
  Intent mQX = null;
  private ProgressDialog mQY;
  private al mQZ;
  private com.tencent.mm.ab.e mRa = null;
  
  private void btx()
  {
    this.eOE = this.tCL;
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(a.k.settings_pref_about_micromsg);
    SettingsAboutMMHeaderPreference localSettingsAboutMMHeaderPreference = (SettingsAboutMMHeaderPreference)this.eOE.ZZ("settings_about_mm_header");
    String str = com.tencent.mm.sdk.platformtools.e.aj(this.mController.tml, com.tencent.mm.protocal.d.qVN);
    Object localObject = str;
    if (com.tencent.mm.protocal.d.qVQ) {
      localObject = str + " " + getString(a.i.alpha_version_alpha);
    }
    localSettingsAboutMMHeaderPreference.mQR = ((String)localObject);
    int i;
    if (w.chM())
    {
      i = bi.f((Integer)g.Ei().DT().get(12304, null));
      localObject = (IconPreference)this.eOE.ZZ("settings_update");
      if (i > 0)
      {
        ((IconPreference)localObject).Er(0);
        ((IconPreference)localObject).dk(String.valueOf(i), r.hd(this.mController.tml));
      }
    }
    else
    {
      if ((com.tencent.mm.sdk.platformtools.e.bxm & 0x1) == 0) {
        break label404;
      }
      i = 1;
      label181:
      if ((!this.mQU) || (com.tencent.mm.sdk.platformtools.e.sFF)) {
        break label409;
      }
      localObject = (IconSummaryPreference)this.eOE.ZZ("funtion_update");
      ((IconSummaryPreference)localObject).mQk = 0;
      str = com.tencent.mm.sdk.platformtools.e.aj(null, this.mQW);
      ((IconSummaryPreference)localObject).dk(getString(a.i.app_new), a.e.new_tips_bg);
      ((IconSummaryPreference)localObject).setSummary(str);
      ((IconSummaryPreference)localObject).tCq = 0;
      if (((IconSummaryPreference)localObject).tCr != null) {
        ((IconSummaryPreference)localObject).tCr.setVisibility(((IconSummaryPreference)localObject).tCq);
      }
      this.eOE.aaa("funtion_check_update");
      label278:
      if (!w.chM()) {
        this.eOE.bw("settings_report", true);
      }
      com.tencent.mm.pluginsdk.f.e.qBn.vx();
      this.eOE.bw("funtion_about_wechat", true);
      if (bi.oW((String)g.Ei().DT().get(aa.a.sXa, null))) {
        break label575;
      }
      localObject = (IconPreference)this.eOE.ZZ("funtion_crowdtest_update");
      if (com.tencent.mm.s.c.Cp().aU(262157, 266263)) {
        ((IconPreference)localObject).Et(0);
      }
    }
    for (;;)
    {
      this.eOE.notifyDataSetChanged();
      return;
      ((IconPreference)localObject).Er(8);
      ((IconPreference)localObject).dk("", -1);
      break;
      label404:
      i = 0;
      break label181;
      label409:
      if ((i == 0) && (this.mQV != null) && (this.mQV.rLD != 0) && (!bi.oW(this.mQV.rLE)) && (!com.tencent.mm.sdk.platformtools.e.sFF))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutMicroMsgUI", "show alpha update. url:%s, hint:%d", new Object[] { this.mQV.rLE, Integer.valueOf(this.mQV.rLF) });
        if (this.mQV.rLF != 0)
        {
          localObject = (IconSummaryPreference)this.eOE.ZZ("funtion_update");
          ((IconSummaryPreference)localObject).mQk = 0;
          ((IconSummaryPreference)localObject).dk(getString(a.i.app_new), a.e.new_tips_bg);
          this.eOE.aaa("funtion_check_update");
          break label278;
        }
        this.eOE.aaa("funtion_update");
        break label278;
      }
      this.eOE.aaa("funtion_update");
      break label278;
      label575:
      this.eOE.aaa("funtion_crowdtest_update");
    }
  }
  
  public final int Ys()
  {
    return a.k.settings_pref_about_micromsg;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutMicroMsgUI", "onSceneEnd " + paramInt2 + " errType " + paramInt1);
    paramString = (b)paraml;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getDownloadUrls() " + paramString.bfx());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.getPackVersion() " + paramString.bfw());
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.SettingsAboutMicroMsgUI", "updateInfo.now getPackVersion() " + com.tencent.mm.protocal.d.qVN);
    if ((com.tencent.mm.plugin.y.d.lrA) || ((paramInt1 == 0) && (paramInt2 == 0)))
    {
      this.mQW = paramString.bfw();
      if ((this.mQW <= 0) || (this.mQW <= com.tencent.mm.protocal.d.qVN)) {
        break label212;
      }
      this.mQU = true;
      if (!g.Eg().Dx()) {
        break label200;
      }
      com.tencent.mm.s.c.Cp().u(262145, true);
    }
    for (;;)
    {
      this.mQV = paramString.bfy();
      btx();
      return;
      label200:
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
      continue;
      label212:
      this.mQU = false;
      if (g.Eg().Dx()) {
        com.tencent.mm.s.c.Cp().u(262145, false);
      } else {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAboutMicroMsgUI", "SubCoreHub.getNewBadge() uin not ready!");
      }
    }
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutMicroMsgUI", paramf + " item has been clicked!");
    if (paramf.equals("settings_update")) {
      if (w.chM())
      {
        g.Eg();
        int i = com.tencent.mm.kernel.a.Df();
        int j = bi.f((Integer)g.Ei().DT().get(12304, null));
        paramf = getString(a.i.settings_system_notice_url, new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (paramf != null) {}
      }
    }
    do
    {
      return true;
      g.Ei().DT().set(12304, Integer.valueOf(0));
      paramPreference = new Intent();
      paramPreference.putExtra("title", getString(a.i.settings_system_notice));
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
      return true;
      if (w.chM()) {}
      for (paramf = getString(a.i.settings_funtion_update_cv_url, new Object[] { w.chP(), Integer.valueOf(com.tencent.mm.protocal.d.qVN) });; paramf = "http://blog.wechat.com/")
      {
        paramPreference = new Intent();
        paramPreference.putExtra("rawUrl", paramf);
        paramPreference.putExtra("showShare", false);
        paramPreference.putExtra("show_bottom", false);
        com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
        return true;
      }
      if (paramf.equals("funtion_update"))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 16L, 1L, true);
        paramPreference = "";
        if (this.mQU) {
          paramf = getString(a.i.settings_funtion_update_nv_url, new Object[] { w.chP(), Integer.valueOf(this.mQW) });
        }
        for (;;)
        {
          paramPreference = new Intent();
          paramPreference.putExtra("rawUrl", paramf);
          paramPreference.putExtra("showShare", true);
          paramPreference.putExtra("show_bottom", false);
          com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
          return true;
          paramf = paramPreference;
          if (this.mQV != null)
          {
            paramf = paramPreference;
            if (this.mQV.rLD != 0)
            {
              paramf = paramPreference;
              if (!bi.oW(this.mQV.rLE)) {
                paramf = this.mQV.rLE;
              }
            }
          }
        }
      }
      if (paramf.equals("funtion_check_update"))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 17L, 1L, true);
        if (com.tencent.mm.plugin.y.d.bfB() != null)
        {
          com.tencent.mm.plugin.y.d.bfB().bfz();
          if ((com.tencent.mm.sdk.platformtools.e.bxm & 0x1) != 0)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAboutMicroMsgUI", "package has set external update mode");
            paramf = Uri.parse(com.tencent.mm.sdk.platformtools.e.sFB);
            paramPreference = new Intent("android.intent.action.VIEW", paramf).addFlags(268435456);
            if ((paramf == null) || (paramPreference == null) || (!bi.k(this.mController.tml, paramPreference)))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri failed, jump to weixin.qq.com");
              startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://weixin.qq.com")).addFlags(268435456));
              com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 18L, 1L, true);
              return true;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.SettingsAboutMicroMsgUI", "parse market uri ok");
            startActivity(paramPreference);
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 19L, 1L, true);
            return true;
          }
          if ((this.mQV != null) && (this.mQV.rLD != 0) && (!bi.oW(this.mQV.rLE)))
          {
            paramf = this.mQV.rLE;
            paramPreference = new Intent();
            paramPreference.putExtra("rawUrl", paramf);
            paramPreference.putExtra("showShare", false);
            paramPreference.putExtra("show_bottom", false);
            com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 20L, 1L, true);
            return true;
          }
          ad.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bi.VE()).commit();
          paramf = com.tencent.mm.plugin.y.d.bfB().a(this, new SettingsAboutMicroMsgUI.6(this));
          if (paramf == null) {
            com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 21L, 1L, true);
          }
        }
        else
        {
          return false;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 22L, 1L, true);
        paramf.update(3);
        return true;
      }
    } while (paramf.equals("funtion_about_wechat"));
    if (paramf.equals("settings_report"))
    {
      paramf = new Intent();
      paramf.putExtra("showShare", false);
      paramf.putExtra("show_feedback", false);
      paramf.putExtra("rawUrl", "https://support.weixin.qq.com/security/readtemplate?t=complaints/index");
      com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramf);
      return true;
    }
    if (paramf.equals("settings_quit_wechat"))
    {
      com.tencent.mm.ui.base.h.a(this.mController.tml, a.i.main_exit_warning, a.i.main_exit_title, a.i.app_yes, a.i.app_no, new SettingsAboutMicroMsgUI.2(this), null);
      return true;
    }
    if (paramf.equals("funtion_crowdtest_update"))
    {
      com.tencent.mm.s.c.Cp().aV(262157, 266263);
      paramf = (String)g.Ei().DT().get(aa.a.sXa, null);
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      paramPreference.putExtra("showShare", false);
      paramPreference.putExtra("show_bottom", false);
      com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramPreference);
      return true;
    }
    return false;
  }
  
  public final View btw()
  {
    LinearLayout localLinearLayout = (LinearLayout)y.gq(this.mController.tml).inflate(a.g.settings_about_micromsg_footer, null);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(a.f.terms_of_service);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(a.f.terms_of_privacy);
    String str2 = g.Ei().DT().get(274436, "").toString();
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = w.chO();
    }
    str1 = getString(a.i.license_read_url, new Object[] { w.chP(), str1, "setting", Integer.valueOf(0), Integer.valueOf(0) });
    localTextView1.setText(String.format("<a href='%s'>%s</a>", new Object[] { getString(a.i.url_agreement), getString(a.i.license_detail) }));
    localTextView2.setText(String.format("<a href='%s'>%s</a>", new Object[] { str1, getString(a.i.privacy_detail) }));
    j.g(localTextView1, 1);
    j.g(localTextView2, 1);
    ((TextView)localLinearLayout.findViewById(a.f.copyright_desc_tv)).setText(localLinearLayout.getResources().getString(a.i.app_copyright, new Object[] { Integer.valueOf(2018) }));
    return localLinearLayout;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_what_new);
    setBackBtn(new SettingsAboutMicroMsgUI.1(this));
    btx();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    cqh();
    initView();
    g.DF().a(11, this);
    if (com.tencent.mm.plugin.y.d.bfB() != null)
    {
      paramBundle = com.tencent.mm.plugin.y.d.bfB().bfA();
      g.DF().a((l)paramBundle, 0);
      com.tencent.mm.plugin.report.service.h.mEJ.a(405L, 15L, 1L, true);
    }
  }
  
  public void onDestroy()
  {
    g.DF().b(11, this);
    super.onDestroy();
  }
  
  public void onResume()
  {
    super.onResume();
    btx();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMicroMsgUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */