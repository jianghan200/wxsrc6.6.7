package com.tencent.mm.plugin.account.bind.ui;

import android.content.ContentResolver;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.al.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.plugin.account.friend.ui.i;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.base.h;
import java.util.Map;

public class BindMContactUI
  extends MMWizardActivity
{
  private String bTi;
  private String countryCode = null;
  private String dYy = null;
  private i eFY;
  private boolean eFl = false;
  private boolean eGb = false;
  private boolean eGc = false;
  private EditText eGp;
  private LinearLayout eGq;
  private TextView eGr;
  private TextView eGs;
  private TextView eGt;
  private CheckBox eGu;
  private LinearLayout eGv;
  private String eGw = null;
  private boolean eGx = false;
  private boolean eGy = false;
  private boolean eGz = false;
  private int fromScene = 0;
  
  private void WN()
  {
    if ((this.eGb) || (this.eGc))
    {
      tob.clear();
      DT(1);
      return;
    }
    int i;
    if (this.eGy)
    {
      i = a.j.bind_mcontact_exit_content_for_change_mobile;
      if (!this.eGy) {
        break label74;
      }
    }
    label74:
    for (int j = a.j.bind_mcontact_exit_tip_for_change_mobile;; j = a.j.bind_mcontact_exit_tip)
    {
      h.a(this, i, j, new BindMContactUI.1(this), null);
      return;
      i = a.j.bind_mcontact_exit_content;
      break;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindmcontact;
  }
  
  protected final void initView()
  {
    this.eGb = getIntent().getBooleanExtra("is_bind_for_safe_device", false);
    this.eGc = getIntent().getBooleanExtra("is_bind_for_contact_sync", false);
    this.eGx = getIntent().getBooleanExtra("BIND_FOR_QQ_REG", false);
    this.eGy = getIntent().getBooleanExtra("is_bind_for_change_mobile", false);
    this.eGz = getIntent().getBooleanExtra("is_bind_for_reset_pwd", false);
    this.eFl = getIntent().getBooleanExtra("KEnterFromBanner", false);
    this.fromScene = getIntent().getIntExtra("bind_scene", 0);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactUI", "bindScene:%d", new Object[] { Integer.valueOf(this.fromScene) });
    this.eGp = ((EditText)findViewById(a.f.bind_mcontact_mobile));
    this.eGq = ((LinearLayout)findViewById(a.f.country_code_ll));
    this.eGs = ((TextView)findViewById(a.f.country_name));
    this.eGt = ((TextView)findViewById(a.f.country_code));
    this.eGu = ((CheckBox)findViewById(a.f.bind_mcontact_find_me_by_mobile_cb));
    this.eGv = ((LinearLayout)findViewById(a.f.bind_mcontact_find_me_by_mobile_ll));
    this.eGr = ((TextView)findViewById(a.f.setting_bind_mobile_binded_mobile));
    String str2;
    if (this.eGy)
    {
      String str1 = (String)g.Ei().DT().get(6, null);
      if (!bi.oW(str1))
      {
        if (!str1.startsWith("+")) {
          break label510;
        }
        str2 = ap.Fp(str1);
        str1 = str1.substring(str2.length() + 1);
        new ap();
        str1 = ap.formatNumber(str2, str1);
        this.eGr.setText(getString(a.j.bind_mcontact_change_mobile_hint, new Object[] { str1 }));
      }
    }
    if ((this.dYy != null) && (!this.dYy.equals(""))) {
      this.eGs.setText(this.dYy);
    }
    if ((this.countryCode != null) && (!this.countryCode.equals(""))) {
      this.eGt.setText("+" + this.countryCode);
    }
    if ((this.eGw != null) && (!this.eGw.equals("")))
    {
      this.eGp.setText(this.eGw);
      this.eGp.setSelection(this.eGw.length());
    }
    for (;;)
    {
      if (b.PD())
      {
        this.eGv.setVisibility(4);
        this.eGu.setChecked(true);
      }
      addTextOptionMenu(0, getString(a.j.app_nextstep), new BindMContactUI.3(this));
      this.eGp.requestFocus();
      setBackBtn(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          BindMContactUI.f(BindMContactUI.this);
          return true;
        }
      });
      this.eGq.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new Intent();
          paramAnonymousView.putExtra("country_name", BindMContactUI.g(BindMContactUI.this));
          paramAnonymousView.putExtra("couttry_code", BindMContactUI.c(BindMContactUI.this));
          a.ezn.b(paramAnonymousView, BindMContactUI.this);
        }
      });
      return;
      label510:
      str2 = "86";
      break;
      g.Em().a(new BindMContactUI.2(this));
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    switch (paramInt2)
    {
    }
    do
    {
      return;
      this.dYy = bi.aG(paramIntent.getStringExtra("country_name"), "");
      this.countryCode = bi.aG(paramIntent.getStringExtra("couttry_code"), "");
      if (!this.dYy.equals("")) {
        this.eGs.setText(this.dYy);
      }
    } while (this.countryCode.equals(""));
    this.eGt.setText("+" + this.countryCode);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.bind_mcontact_title_bind);
    this.dYy = bi.aG(getIntent().getStringExtra("country_name"), "");
    this.countryCode = bi.aG(getIntent().getStringExtra("couttry_code"), "");
    this.eGw = bi.aG(getIntent().getStringExtra("bindmcontact_shortmobile"), "");
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    if (this.eFY != null)
    {
      getContentResolver().unregisterContentObserver(this.eFY);
      this.eFY.recycle();
    }
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4)
    {
      WN();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i;
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length <= 0)) {
      if (paramArrayOfInt == null)
      {
        i = -1;
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult, grantResults length is:%d requestCode:%d, permissions:%s, stack:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt), paramArrayOfString, bi.cjd() });
      }
    }
    do
    {
      return;
      i = paramArrayOfInt.length;
      break;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.BindMContactUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
      switch (paramInt)
      {
      default: 
        return;
      }
    } while ((paramArrayOfInt[0] != 0) || (this.eFY == null));
    this.eFY.Yh();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindMContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */