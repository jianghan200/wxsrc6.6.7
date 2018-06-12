package com.tencent.mm.plugin.account.security.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.tencent.mm.ab.o;
import com.tencent.mm.plugin.account.a.f;
import com.tencent.mm.plugin.account.a.g;
import com.tencent.mm.plugin.account.a.j;
import com.tencent.mm.plugin.account.security.a.d;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.MMEditText.c;

public class ModSafeDeviceNameUI
  extends MMActivity
  implements com.tencent.mm.ab.e
{
  private String bKv;
  private long createTime;
  private ProgressDialog eHw = null;
  private String eOA;
  private EditText eOx;
  private String eOy;
  private String eOz;
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if ((this.eHw != null) && (this.eHw.isShowing()))
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramString = new d();
      paramString.field_devicetype = this.bKv;
      paramString.field_name = this.eOz;
      paramString.field_uid = this.eOA;
      paramString.field_createtime = this.createTime;
      com.tencent.mm.plugin.account.security.a.g.Yq().c(paramString, new String[0]);
      h.bA(this, com.tencent.mm.bp.a.af(this, a.j.safe_device_mod_name_ok));
      new ag().postDelayed(new Runnable()
      {
        public final void run()
        {
          ModSafeDeviceNameUI.this.finish();
        }
      }, 1000L);
    }
    while (!com.tencent.mm.plugin.account.a.a.ezo.a(this, paramInt1, paramInt2, paramString)) {
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    return a.g.mod_safe_device_name;
  }
  
  protected final void initView()
  {
    this.eOy = getIntent().getStringExtra("safe_device_name");
    this.eOA = getIntent().getStringExtra("safe_device_uid");
    this.bKv = getIntent().getStringExtra("safe_device_type");
    setMMTitle(com.tencent.mm.bp.a.af(this, a.j.safe_device_edit_title));
    setBackBtn(new ModSafeDeviceNameUI.1(this));
    addTextOptionMenu(0, getString(a.j.app_save), new ModSafeDeviceNameUI.2(this));
    ModSafeDeviceNameUI.3 local3 = new ModSafeDeviceNameUI.3(this);
    this.eOx = ((EditText)findViewById(a.f.mod_safe_device_name));
    MMEditText.c localc = new MMEditText.c(this.eOx, null, 32);
    localc.uGk = local3;
    this.eOx.addTextChangedListener(localc);
    if (!bi.oW(this.eOy))
    {
      this.eOx.setText(this.eOy);
      return;
    }
    enableOptionMenu(false);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  protected void onPause()
  {
    com.tencent.mm.kernel.g.DF().b(361, this);
    super.onPause();
  }
  
  protected void onResume()
  {
    com.tencent.mm.kernel.g.DF().a(361, this);
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/account/security/ui/ModSafeDeviceNameUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */