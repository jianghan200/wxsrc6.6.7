package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Button;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.s;

public class SnsSettingIntroduceUI
  extends MMActivity
{
  private Button oaP;
  private Button oaQ;
  private Intent oaR;
  
  protected final int getLayoutId()
  {
    return i.g.sns_setting_introduce_ui;
  }
  
  @TargetApi(17)
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    this.oaR = getIntent();
    this.oaP = ((Button)findViewById(i.f.back_btn));
    this.oaP.setOnClickListener(new SnsSettingIntroduceUI.1(this));
    h.mEJ.h(14090, new Object[] { Integer.valueOf(1) });
    this.oaQ = ((Button)findViewById(i.f.go_btn));
    this.oaQ.setOnClickListener(new SnsSettingIntroduceUI.2(this));
  }
  
  public void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      h.mEJ.h(14090, new Object[] { Integer.valueOf(3) });
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/sns/ui/SnsSettingIntroduceUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */