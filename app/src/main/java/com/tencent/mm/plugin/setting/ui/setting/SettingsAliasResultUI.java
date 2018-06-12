package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;

public class SettingsAliasResultUI
  extends MMActivity
{
  private String cCR;
  private TextView eCn;
  private TextView mRM;
  private Button mRN;
  private ImageView mRO;
  private boolean mRP;
  
  protected final int getLayoutId()
  {
    return a.g.settings_alias_result;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.modify_username);
    this.eCn = ((TextView)findViewById(a.f.desc_tv));
    this.mRM = ((TextView)findViewById(a.f.alias_tv));
    this.mRN = ((Button)findViewById(a.f.setpwd_btn));
    this.mRO = ((ImageView)findViewById(a.f.ok_iv));
    setBackBtn(new SettingsAliasResultUI.1(this));
    this.mRM.setText(this.cCR);
    if (!this.mRP)
    {
      this.mRN.setVisibility(0);
      this.eCn.setText(getString(a.i.modify_username_result_goto_setpass));
    }
    for (;;)
    {
      this.mRN.setOnClickListener(new SettingsAliasResultUI.2(this));
      return;
      this.mRN.setVisibility(8);
      this.eCn.setText(getString(a.i.modify_username_result_normal_desc));
    }
  }
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (paramInt2 == -1) {
      finish();
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.cCR = ((String)g.Ei().DT().get(42, null));
    this.mRP = Boolean.valueOf(getIntent().getBooleanExtra("has_pwd", true)).booleanValue();
    initView();
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public void onPause()
  {
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SettingsAliasResultUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */