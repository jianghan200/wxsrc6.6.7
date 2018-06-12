package com.tencent.mm.plugin.account.bind.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.friend.a.m;
import com.tencent.mm.plugin.account.friend.a.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

public class BindGoogleContactIntroUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private ImageView eEQ;
  private TextView eER;
  private Button eES;
  private Button eET;
  private boolean eEU = false;
  private boolean eEV = false;
  private String eEW;
  private ProgressDialog eEX;
  private w eEY;
  private int eEZ;
  private View.OnClickListener eFa = new BindGoogleContactIntroUI.1(this);
  private View.OnClickListener eFb = new View.OnClickListener()
  {
    public final void onClick(View paramAnonymousView)
    {
      h.a(BindGoogleContactIntroUI.this.mController.tml, true, BindGoogleContactIntroUI.this.getString(a.j.unbind_gcontact_confirm), "", BindGoogleContactIntroUI.this.getString(a.j.unbind_gcontact_btn_setting), BindGoogleContactIntroUI.this.getString(a.j.app_cancel), new BindGoogleContactIntroUI.2.1(this), new BindGoogleContactIntroUI.2.2(this));
    }
  };
  
  private void WE()
  {
    this.eET.setVisibility(8);
    this.eES.setVisibility(0);
    this.eEQ.setVisibility(0);
    this.eER.setVisibility(0);
    this.eER.setText(a.j.bind_gcontact_contenct_setting);
    this.eES.setText(a.j.bind_gcontact_btn_setting);
    this.eES.setOnClickListener(this.eFa);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    paraml = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paraml = "";
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "[onSceneEnd] errType:%d,errCode:%d,errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paraml });
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      g.Ei().DT().set(208903, "");
      g.Ei().DT().set(208901, "");
      g.Ei().DT().set(208902, "");
      g.Ei().DT().set(208905, Boolean.valueOf(true));
      g.Ei().DT().lm(true);
      WE();
      h.bA(this, getString(a.j.unbind_gcontact_success_tip));
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "unbind failed");
    Toast.makeText(this, a.j.gcontact_unbind_failed_msg, 0).show();
  }
  
  protected final int getLayoutId()
  {
    return a.g.bindgooglecontactintro;
  }
  
  protected final void initView()
  {
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        BindGoogleContactIntroUI.this.finish();
        return true;
      }
    });
    this.eEQ = ((ImageView)findViewById(a.f.setting_bind_google_account_icon));
    this.eER = ((TextView)findViewById(a.f.setting_bind_google_account_text));
    this.eES = ((Button)findViewById(a.f.setting_bind_google_account_btn));
    this.eET = ((Button)findViewById(a.f.setting_unbind_google_account_btn));
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GoogleContact.BindGoogleContactIntroUI", "requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 == -1) {
      if (paramInt1 == 2005) {
        this.eEU = paramIntent.getBooleanExtra("gpservices", false);
      }
    }
    while (paramInt1 != 2005) {
      return;
    }
    this.eEU = paramIntent.getBooleanExtra("gpservices", false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(a.j.bind_gcontact_title_setting);
    this.eEZ = getIntent().getIntExtra("enter_scene", 0);
    this.eEU = m.cl(this);
    if (this.eEU) {
      startActivityForResult(new Intent("com.tencent.mm.gms.CHECK_GP_SERVICES"), 2005);
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  protected void onResume()
  {
    super.onResume();
    this.eEW = ((String)g.Ei().DT().get(208903, null));
    if (TextUtils.isEmpty(this.eEW))
    {
      this.eEV = false;
      initView();
      if (!this.eEV) {
        break label129;
      }
      this.eET.setVisibility(0);
      this.eES.setVisibility(8);
      this.eER.setVisibility(0);
      this.eER.setText(getString(a.j.bind_gcontact_contenct_binded, new Object[] { this.eEW }));
      this.eET.setOnClickListener(this.eFb);
    }
    for (;;)
    {
      g.DF().a(487, this);
      return;
      this.eEV = true;
      break;
      label129:
      WE();
    }
  }
  
  protected void onStop()
  {
    super.onStop();
    g.DF().b(487, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */