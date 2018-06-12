package com.tencent.mm.plugin.subapp.ui.openapi;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.aq.h;
import com.tencent.mm.aq.h.a;
import com.tencent.mm.bp.a;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.s;
import java.util.LinkedList;
import java.util.List;
import junit.framework.Assert;

public class AppProfileUI
  extends MMPreference
  implements j.a
{
  private com.tencent.mm.ui.base.preference.f eOE;
  private ag handler = null;
  private com.tencent.mm.pluginsdk.model.app.f jUo;
  private AppHeaderPreference.a osN;
  
  private static void a(com.tencent.mm.pluginsdk.model.app.f paramf, boolean paramBoolean)
  {
    LinkedList localLinkedList = new LinkedList();
    StringBuilder localStringBuilder = new StringBuilder().append(paramf.field_appId).append(",");
    if (paramBoolean) {}
    for (paramf = "1";; paramf = "2")
    {
      localLinkedList.add(new h.a(10165, paramf));
      au.HU();
      c.FQ().b(new h(localLinkedList));
      return;
    }
  }
  
  private void bGy()
  {
    this.handler = new AppProfileUI.3(this);
    this.handler.sendEmptyMessageDelayed(0, 30L);
  }
  
  private void refresh()
  {
    boolean bool2 = true;
    this.eOE.removeAll();
    this.eOE.addPreferencesFromResource(R.o.app_profile);
    AppHeaderPreference localAppHeaderPreference;
    AppHeaderPreference.a locala;
    boolean bool1;
    if (this.jUo.field_status == 1)
    {
      this.eOE.aaa("app_profile_add");
      localAppHeaderPreference = (AppHeaderPreference)this.eOE.ZZ("app_profile_header");
      locala = this.osN;
      if (this.jUo.field_status != 1) {
        break label116;
      }
      bool1 = true;
      label80:
      if (locala == null) {
        break label121;
      }
    }
    for (;;)
    {
      Assert.assertTrue(bool2);
      localAppHeaderPreference.osE = locala;
      localAppHeaderPreference.ccZ = bool1;
      return;
      this.eOE.aaa("app_profile_remove");
      break;
      label116:
      bool1 = false;
      break label80;
      label121:
      bool2 = false;
    }
  }
  
  public final int Ys()
  {
    return R.o.app_profile;
  }
  
  public final void a(String paramString, l paraml)
  {
    if (paramString.equals(this.jUo.field_appId)) {
      initView();
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    paramf = paramPreference.mKey;
    x.i("MicroMsg.AppProfileUI", paramf + " item has been clicked!");
    if (paramf.equals("app_profile_add"))
    {
      this.jUo.field_status = 1;
      this.jUo.field_modifyTime = System.currentTimeMillis();
      ao.bmf().a(this.jUo, new String[0]);
      refresh();
      a(this.jUo, true);
      bGy();
      return true;
    }
    if (paramf.equals("app_profile_remove"))
    {
      this.jUo.field_status = 0;
      this.jUo.field_modifyTime = System.currentTimeMillis();
      ao.bmf().a(this.jUo, new String[0]);
      refresh();
      a(this.jUo, false);
      bGy();
      return true;
    }
    return false;
  }
  
  protected final void initView()
  {
    boolean bool = true;
    this.osN = new AppHeaderPreference.a()
    {
      public final String bGw()
      {
        return com.tencent.mm.pluginsdk.model.app.g.b(AppProfileUI.this.mController.tml, AppProfileUI.a(AppProfileUI.this), null);
      }
      
      public final Bitmap bGx()
      {
        return com.tencent.mm.pluginsdk.model.app.g.b(AppProfileUI.a(AppProfileUI.this).field_appId, 1, a.getDensity(AppProfileUI.this));
      }
      
      public final String getHint()
      {
        Object localObject = AppProfileUI.this.mController.tml;
        com.tencent.mm.pluginsdk.model.app.f localf = AppProfileUI.a(AppProfileUI.this);
        if ((localObject == null) || (localf == null)) {
          return null;
        }
        localObject = com.tencent.mm.pluginsdk.model.app.g.eS((Context)localObject);
        if (((String)localObject).equalsIgnoreCase("zh_CN")) {
          return localf.field_appDiscription;
        }
        if ((((String)localObject).equalsIgnoreCase("zh_TW")) || (((String)localObject).equalsIgnoreCase("zh_HK")))
        {
          if (bi.oW(localf.field_appDiscription_tw)) {
            return localf.field_appDiscription;
          }
          return localf.field_appDiscription_tw;
        }
        if (((String)localObject).equalsIgnoreCase("en"))
        {
          if (bi.oW(localf.field_appDiscription_en)) {
            return localf.field_appDiscription;
          }
          return localf.field_appDiscription_en;
        }
        if (bi.oW(localf.field_appDiscription_en)) {
          return localf.field_appDiscription;
        }
        return localf.field_appDiscription_en;
      }
      
      public final String ix(boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {}
        for (int i = R.l.settings_plugins_installed;; i = R.l.settings_plugins_uninstalled) {
          return AppProfileUI.this.mController.tml.getString(i);
        }
      }
    };
    this.jUo = com.tencent.mm.pluginsdk.model.app.g.bl(getIntent().getStringExtra("AppProfileUI_AppId"), true);
    if (this.jUo != null) {}
    for (;;)
    {
      Assert.assertTrue("initView : appInfo does not exist", bool);
      setMMTitle(R.l.app_profile_title);
      this.eOE = this.tCL;
      setBackBtn(new AppProfileUI.2(this));
      refresh();
      return;
      bool = false;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  protected void onPause()
  {
    ao.bmf().d(this);
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
    ao.bmf().c(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/subapp/ui/openapi/AppProfileUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */