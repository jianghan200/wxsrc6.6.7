package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.aa.c;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.f;
import com.tencent.mm.ac.z;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.b;
import com.tencent.mm.plugin.appbrand.s.f;
import com.tencent.mm.plugin.appbrand.s.g;
import com.tencent.mm.plugin.appbrand.s.h;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.model.m;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.tools.q;

public class AppBrandOpenWeRunSettingUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private ImageView eBM;
  private TextView eBO;
  private TextView eBR;
  private TextView eIH;
  private TextView guR;
  private ab guS = null;
  p guT;
  
  private void anw()
  {
    a.b.a(this.eBM, this.guS.field_username);
    this.eIH.setText(this.guS.BL());
    if (com.tencent.mm.l.a.gd(this.guS.field_type))
    {
      this.eBR.setTextColor(q.hb(this.mController.tml));
      this.eBR.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)g.l(com.tencent.mm.plugin.appbrand.compat.a.a.class)).cs(this));
      this.eBR.setCompoundDrawablesWithIntrinsicBounds(s.f.status_enable, 0, 0, 0);
      this.guR.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)g.l(com.tencent.mm.plugin.appbrand.compat.a.a.class)).cs(this));
      this.guR.setClickable(false);
      return;
    }
    this.eBR.setTextColor(q.hc(this.mController.tml));
    this.eBR.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)g.l(com.tencent.mm.plugin.appbrand.compat.a.a.class)).ct(this));
    this.eBR.setCompoundDrawablesWithIntrinsicBounds(s.f.status_disable, 0, 0, 0);
    this.guR.setText(((com.tencent.mm.plugin.appbrand.compat.a.a)g.l(com.tencent.mm.plugin.appbrand.compat.a.a.class)).cr(this));
    this.guR.setClickable(true);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof m))
    {
      g.Eh().dpP.b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0)) {
        break label110;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandOpenWeRunSettingUI", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 4) && (paramInt2 == -24) && (!bi.oW(paramString))) {
        Toast.makeText(ad.getContext(), paramString, 1).show();
      }
      setResult(1);
    }
    label110:
    ab localab;
    for (;;)
    {
      if (this.guT != null) {
        this.guT.dismiss();
      }
      anw();
      return;
      paraml = ((m)paraml).cby();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.AppBrandOpenWeRunSettingUI", "bind fitness contact %s success", new Object[] { paraml });
      this.guS = ((i)g.l(i.class)).FR().Yg("gh_43f2581f6fd6");
      localab = this.guS;
      if ((localab != null) && (!bi.oW(paraml))) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandOpenWeRunSettingUI", "respUsername == " + paraml + ", contact = " + localab);
      paramString = z.MY().kA(this.guS.field_username);
      z.MY().e(paramString);
      g.Ei().DT().set(327825, Boolean.valueOf(true));
      setResult(-1);
      ah.i(new AppBrandOpenWeRunSettingUI.4(this), 1500L);
    }
    if (com.tencent.mm.model.s.hd(localab.field_username))
    {
      String str = bi.oV(localab.field_username);
      paramString = f.kH(str);
      if (paramString != null) {
        paramString.field_username = paraml;
      }
      z.MY().delete(str);
      localab.dD(str);
    }
    for (;;)
    {
      localab.setUsername(paraml);
      if ((int)localab.dhP == 0) {
        ((i)g.l(i.class)).FR().U(localab);
      }
      if ((int)localab.dhP <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.AppBrandOpenWeRunSettingUI", "addContact : insert contact failed");
        break;
      }
      com.tencent.mm.model.s.p(localab);
      paraml = ((i)g.l(i.class)).FR().Yg(localab.field_username);
      if (paramString != null)
      {
        z.MY().d(paramString);
        break;
      }
      paramString = f.kH(paraml.field_username);
      if ((paramString == null) || (paramString.LS()))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandOpenWeRunSettingUI", "shouldUpdate");
        am.a.dBr.R(paraml.field_username, "");
        c.jN(paraml.field_username);
        break;
      }
      if (!paraml.ckZ()) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.AppBrandOpenWeRunSettingUI", "update contact, last check time=%d", new Object[] { Integer.valueOf(paraml.csR) });
      am.a.dBr.R(paraml.field_username, "");
      c.jN(paraml.field_username);
      break;
      paramString = null;
    }
  }
  
  protected final int getLayoutId()
  {
    return s.h.app_brand_open_we_run_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(getString(s.j.app_brand_open_we_run));
    this.eBM = ((ImageView)findViewById(s.g.open_we_run_avatar_iv));
    this.eIH = ((TextView)findViewById(s.g.open_we_run_nickname_tv));
    this.eBR = ((TextView)findViewById(s.g.open_we_run_status_tv));
    this.eBO = ((TextView)findViewById(s.g.open_we_run_title));
    this.guR = ((TextView)findViewById(s.g.open_we_run_open));
    this.guR.setOnClickListener(new AppBrandOpenWeRunSettingUI.1(this));
    setBackBtn(new AppBrandOpenWeRunSettingUI.2(this));
    paramBundle = bi.oV(getIntent().getStringExtra("OpenWeRunSettingName"));
    this.guS = ((i)g.l(i.class)).FR().Yg("gh_43f2581f6fd6");
    if ((this.guS == null) || ((int)this.guS.dhP == 0))
    {
      getString(s.j.app_tip);
      this.guT = h.a(this, getString(s.j.app_waiting), true, null);
      this.guT.show();
      am.a.dBr.a("gh_43f2581f6fd6", "", new AppBrandOpenWeRunSettingUI.3(this));
    }
    this.eBO.setText(getString(s.j.app_brand_open_we_run_title, new Object[] { paramBundle }));
    anw();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandOpenWeRunSettingUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */