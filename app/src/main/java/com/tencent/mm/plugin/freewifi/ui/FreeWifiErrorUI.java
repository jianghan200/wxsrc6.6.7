package com.tencent.mm.plugin.freewifi.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.freewifi.m;
import com.tencent.mm.ui.MMActivity;

public class FreeWifiErrorUI
  extends MMActivity
{
  private ImageView jmK;
  private TextView jmL;
  private TextView jmM;
  private TextView jmN;
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.free_wifi_error;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.free_wifi_title);
    this.jmK = ((ImageView)findViewById(R.h.free_wifi_error));
    if (getIntent().getIntExtra("free_wifi_show_detail_error", 0) == 1) {
      this.jmK.setImageResource(R.g.free_wifi_detail_error);
    }
    this.jmL = ((TextView)findViewById(R.h.free_wifi_errmsg));
    this.jmM = ((TextView)findViewById(R.h.free_wifi_detail_errmsg1));
    this.jmN = ((TextView)findViewById(R.h.free_wifi_detail_errmsg2));
    paramBundle = getIntent().getStringExtra("free_wifi_error_ui_error_msg");
    String str1 = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail1");
    String str2 = getIntent().getStringExtra("free_wifi_error_ui_error_msg_detail12");
    if (!m.isEmpty(paramBundle)) {
      this.jmL.setText(paramBundle);
    }
    if (!m.isEmpty(str1)) {
      this.jmM.setText(str1);
    }
    if (!m.isEmpty(str2)) {
      this.jmN.setText(str2);
    }
    setBackBtn(new FreeWifiErrorUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/freewifi/ui/FreeWifiErrorUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */