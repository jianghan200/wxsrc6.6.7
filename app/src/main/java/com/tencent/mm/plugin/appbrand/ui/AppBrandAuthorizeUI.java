package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.mm.plugin.appbrand.config.q;
import com.tencent.mm.plugin.appbrand.config.t;
import com.tencent.mm.plugin.appbrand.s.j;
import com.tencent.mm.plugin.appbrand.s.m;
import com.tencent.mm.protocal.c.eb;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.MMPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.statusbar.a;
import com.tencent.mm.ui.statusbar.b;
import com.tencent.mm.ui.statusbar.d;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AppBrandAuthorizeUI
  extends MMPreference
{
  private String gtX;
  List<eb> gtY = new ArrayList();
  private t gtZ;
  protected f gua;
  private boolean gub = false;
  private boolean guc = true;
  private boolean gud = false;
  private b gue = null;
  private String mAppId;
  
  private void ank()
  {
    if (!this.gud) {
      return;
    }
    JSONArray localJSONArray = new JSONArray();
    Object localObject = this.gtY.iterator();
    while (((Iterator)localObject).hasNext())
    {
      eb localeb = (eb)((Iterator)localObject).next();
      JSONObject localJSONObject = new JSONObject();
      try
      {
        localJSONObject.put("scope", localeb.scope);
        localJSONObject.put("state", localeb.state);
        localJSONObject.put("desc", localeb.rep);
        localJSONArray.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        x.printErrStackTrace("MicroMsg.AppBrandAuthorizeUI", localJSONException, "", new Object[0]);
      }
    }
    x.d("MicroMsg.AppBrandAuthorizeUI", "authInfo %s", new Object[] { localJSONArray });
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_app_authorize_state", localJSONArray.toString());
    setResult(-1, (Intent)localObject);
  }
  
  private void da(boolean paramBoolean)
  {
    runOnUiThread(new AppBrandAuthorizeUI.9(this, paramBoolean));
  }
  
  public final int Ys()
  {
    return s.m.app_brand_authorize_pref;
  }
  
  public final boolean a(final f paramf, final Preference paramPreference)
  {
    x.d("MicroMsg.AppBrandAuthorizeUI", "onPreferenceTreeClcik.(key : %s)", new Object[] { paramPreference.mKey });
    if (this.gtY == null) {
      x.w("MicroMsg.AppBrandAuthorizeUI", "mAuthItem == null");
    }
    for (;;)
    {
      return false;
      String str = paramPreference.mKey;
      if (bi.oW(str))
      {
        x.e("MicroMsg.AppBrandAuthorizeUI", "key is null");
        return false;
      }
      Iterator localIterator = this.gtY.iterator();
      while (localIterator.hasNext())
      {
        final Object localObject = (eb)localIterator.next();
        if (str.equals(bi.oV(((eb)localObject).scope)))
        {
          this.gub = true;
          if (((CheckBoxPreference)paramPreference).isChecked())
          {
            ((eb)localObject).state = 1;
          }
          else if (this.guc)
          {
            this.guc = false;
            c.a locala = new c.a(this);
            locala.abu(getString(s.j.app_brand_auth_close_tips));
            locala.abx(getString(s.j.app_brand_auth_close_auth));
            locala.a(new DialogInterface.OnClickListener()
            {
              public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
              {
                localObject.state = 2;
                x.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state close");
              }
            });
            locala.aby(getString(s.j.app_cancel));
            locala.b(new AppBrandAuthorizeUI.5(this, (eb)localObject, paramPreference, paramf));
            locala.e(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                x.d("MicroMsg.AppBrandAuthorizeUI", "on cancel click!");
                localObject.state = 1;
                ((CheckBoxPreference)paramPreference).qpJ = true;
                paramf.notifyDataSetChanged();
              }
            });
            localObject = locala.anj();
            ((com.tencent.mm.ui.widget.a.c)localObject).setCanceledOnTouchOutside(false);
            ((com.tencent.mm.ui.widget.a.c)localObject).show();
          }
          else
          {
            ((eb)localObject).state = 2;
          }
        }
      }
    }
  }
  
  protected void initSwipeBack()
  {
    super.initSwipeBack();
    if ((getSwipeBackLayout() != null) && (getSwipeBackLayout().getChildCount() > 0))
    {
      View localView = getSwipeBackLayout().getChildAt(0);
      getSwipeBackLayout().removeView(localView);
      this.gue = new b(this);
      this.gue.addView(localView, new FrameLayout.LayoutParams(-1, -1));
      getSwipeBackLayout().addView(this.gue);
      getSwipeBackLayout().setContentView(this.gue);
    }
  }
  
  public final void lF(int paramInt)
  {
    super.lF(paramInt);
    if ((Build.VERSION.SDK_INT >= 21) && (getWindow() != null) && (getWindow().getStatusBarColor() != 0)) {
      a.c(this.mController.contentView, getWindow().getStatusBarColor(), d.c(getWindow()));
    }
  }
  
  public void onBackPressed()
  {
    x.d("MicroMsg.AppBrandAuthorizeUI", "onBackPressed !");
    ank();
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setBackBtn(new AppBrandAuthorizeUI.1(this));
    setMMTitle(s.j.app_brand_authorize_settings);
    this.gua = this.tCL;
    paramBundle = getIntent().getStringExtra("key_username");
    this.gtX = paramBundle;
    if (bi.oW(paramBundle))
    {
      finish();
      return;
    }
    this.gud = getIntent().getBooleanExtra("key_app_authorize_jsapi", false);
    this.gtZ = q.rT(this.gtX);
    if (this.gtZ == null)
    {
      x.e("MicroMsg.AppBrandAuthorizeUI", "AppBrandBizInfo is Null");
      return;
    }
    this.mAppId = this.gtZ.appId;
    com.tencent.mm.plugin.appbrand.r.c.Em().H(new AppBrandAuthorizeUI.3(this));
    lF(this.mController.cqm());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onPause()
  {
    if (this.gub)
    {
      x.d("MicroMsg.AppBrandAuthorizeUI", "onPause key change!");
      ah.A(new Runnable()
      {
        public final void run()
        {
          if (AppBrandAuthorizeUI.f(AppBrandAuthorizeUI.this))
          {
            AppBrandAuthorizeUI.g(AppBrandAuthorizeUI.this);
            AppBrandAuthorizeUI.a(AppBrandAuthorizeUI.this, AppBrandAuthorizeUI.b(AppBrandAuthorizeUI.this), AppBrandAuthorizeUI.this.gtY);
          }
        }
      });
    }
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/appbrand/ui/AppBrandAuthorizeUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */