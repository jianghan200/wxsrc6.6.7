package com.tencent.mm.plugin.webwx.ui;

import android.os.Bundle;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ui.MMActivity;

public class WebWeiXinIntroductionUI
  extends MMActivity
{
  private Button qmG;
  
  protected final int getLayoutId()
  {
    return R.i.web_weixin_introduction;
  }
  
  protected final void initView()
  {
    setMMTitle("");
    this.qmG = ((Button)findViewById(R.h.webwx_introduction_begin_btn));
    this.qmG.setOnClickListener(new WebWeiXinIntroductionUI.1(this));
    setBackBtn(new WebWeiXinIntroductionUI.2(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/webwx/ui/WebWeiXinIntroductionUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */