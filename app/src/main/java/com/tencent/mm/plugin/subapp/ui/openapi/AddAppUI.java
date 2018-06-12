package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;

public class AddAppUI
  extends MMPreference
  implements e
{
  private f eOE;
  private AppPreference osA;
  private AppPreference osz;
  
  public final int Ys()
  {
    return R.o.addapp_pref;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.d("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
    if ((paramInt1 == 0) && (paramInt2 == 0)) {
      return;
    }
    x.e("MicroMsg.AddAppUI", "onSceneEnd, errType = " + paramInt1 + ", errCode = " + paramInt2);
  }
  
  public final boolean a(f paramf, Preference paramPreference)
  {
    if (paramPreference.mKey.equals("addapp_recommend"))
    {
      paramf = this.mController.tml.getSharedPreferences(ad.chY(), 0);
      paramPreference = this.mController.tml;
      paramf = w.d(paramf);
      paramf = getString(R.l.addapp_recommend_url, new Object[] { Integer.valueOf(com.tencent.mm.protocal.d.qVN), paramf, w.chO() });
      paramPreference = new Intent();
      paramPreference.putExtra("rawUrl", paramf);
      com.tencent.mm.bg.d.b(this, "webview", ".ui.tools.WebViewUI", paramPreference);
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    setMMTitle(R.l.addapp_add_app);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AddAppUI.this.finish();
        return true;
      }
    });
    this.eOE = this.tCL;
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.addapp_pref);
    this.osz = ((AppPreference)this.eOE.ZZ("addapp_added"));
    this.osz.osD = 1;
    this.osz.osG = new AddAppUI.2(this);
    this.osz.osH = new AddAppUI.3(this);
    this.osA = ((AppPreference)this.eOE.ZZ("addapp_available"));
    this.osA.osD = 0;
    this.osA.osG = new AddAppUI.4(this);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
  
  protected void onPause()
  {
    super.onPause();
    if (this.osz != null) {
      this.osz.onPause();
    }
    if (this.osA != null) {
      this.osA.onPause();
    }
  }
  
  protected void onResume()
  {
    super.onResume();
    initView();
    if (this.osz != null) {
      this.osz.onResume();
    }
    if (this.osA != null) {
      this.osA.onResume();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/openapi/AddAppUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */