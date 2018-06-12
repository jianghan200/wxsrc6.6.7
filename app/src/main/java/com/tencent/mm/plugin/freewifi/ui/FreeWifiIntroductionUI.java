package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiIntroductionUI
  extends MMActivity
{
  private Button jlX;
  private Button jnr;
  private Button jns;
  private CheckBox jnt;
  private int source;
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_intro;
  }
  
  protected final void initView()
  {
    this.jnr = ((Button)findViewById(R.h.continue_btn));
    this.jnt = ((CheckBox)findViewById(R.h.agree_user_agree_cb));
    this.jlX = ((Button)findViewById(R.h.help_btn));
    this.jns = ((Button)findViewById(R.h.user_agreemen_btn));
    this.source = getIntent().getIntExtra("free_wifi_source", 1);
    if (this.source == 3)
    {
      setMMTitle(R.l.mig_free_wifi_tile);
      ((TextView)findViewById(R.h.free_wifi_intro_tv)).setText(R.l.mig_free_wifi_intro_tips);
      ((TextView)findViewById(R.h.free_wifi_desc_tv)).setText(R.l.mig_free_wifi_desc);
      this.jlX.setVisibility(8);
    }
    for (;;)
    {
      setBackBtn(new FreeWifiIntroductionUI.1(this));
      this.jnr.setOnClickListener(new FreeWifiIntroductionUI.2(this));
      this.jnt.setOnCheckedChangeListener(new FreeWifiIntroductionUI.3(this));
      this.jns.setOnClickListener(new FreeWifiIntroductionUI.4(this));
      this.jlX.setOnClickListener(new FreeWifiIntroductionUI.5(this));
      return;
      setMMTitle(R.l.free_wifi_title);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiIntroductionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */