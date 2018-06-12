package com.tencent.mm.plugin.setting.ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.setting.a.f;
import com.tencent.mm.plugin.setting.a.g;
import com.tencent.mm.plugin.setting.a.i;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class SendFeedBackUI
  extends MMActivity
  implements e
{
  private ProgressDialog eHw = null;
  private TextView mQC = null;
  private EditText meN;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (this.eHw != null)
    {
      this.eHw.dismiss();
      this.eHw = null;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      h.a(this, getString(a.i.settings_feedbackui_succ), getString(a.i.app_tip), new SendFeedBackUI.4(this));
      return;
    }
    h.a(this, getString(a.i.settings_feedbackui_err), getString(a.i.app_tip), new SendFeedBackUI.5(this));
  }
  
  protected final int getLayoutId()
  {
    return a.g.edit_signature;
  }
  
  protected final void initView()
  {
    setMMTitle(a.i.settings_feedbackui_title);
    this.meN = ((EditText)findViewById(a.f.content));
    String str = getIntent().getStringExtra("intentKeyFrom");
    if ((str != null) && (str.equals("fromEnjoyAppDialog")))
    {
      this.mQC = ((TextView)findViewById(a.f.view_question_text_view));
      this.mQC.setVisibility(0);
      this.mQC.setOnClickListener(new SendFeedBackUI.1(this));
    }
    setBackBtn(new SendFeedBackUI.2(this));
    addTextOptionMenu(0, getString(a.i.app_send), new SendFeedBackUI.3(this));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    initView();
  }
  
  public void onDestroy()
  {
    g.DF().b(153, this);
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/setting/ui/setting/SendFeedBackUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */