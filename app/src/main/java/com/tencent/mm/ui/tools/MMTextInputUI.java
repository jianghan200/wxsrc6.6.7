package com.tencent.mm.ui.tools;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.k;

public class MMTextInputUI
  extends MMActivity
{
  private int daw;
  private int hmI;
  private EditText jzo;
  private TextView uAF;
  private int uAG;
  private boolean uAH;
  
  private void goBack()
  {
    if (getIntent().getBooleanExtra("key_show_confirm", false))
    {
      h.a(this.mController.tml, getString(a.k.quit_confirm_tips), "", new MMTextInputUI.1(this), null);
      return;
    }
    YC();
    setResult(0);
    finish();
  }
  
  public int getLayoutId()
  {
    return a.h.input_text_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.jzo = ((EditText)findViewById(a.g.text_edit));
    this.uAF = ((TextView)findViewById(a.g.state_tv));
    this.jzo.setHint(bi.aG(getIntent().getStringExtra("key_hint"), ""));
    this.jzo.append(bi.aG(getIntent().getStringExtra("key_value"), ""));
    this.daw = (getIntent().getIntExtra("key_max_count", -1) << 1);
    this.hmI = 0;
    this.uAG = Math.max(this.daw - 120, this.daw * 9 / 10);
    this.uAH = getIntent().getBooleanExtra("key_nullable", false);
    setBackBtn(new MMTextInputUI.2(this));
    a(0, getString(a.k.app_finish), new MMTextInputUI.3(this), s.b.tmX);
    enableOptionMenu(this.uAH);
    if ((!this.uAH) || (this.daw > 0)) {
      this.jzo.addTextChangedListener(new MMTextInputUI.4(this));
    }
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (4 == paramInt)
    {
      x.i("MicroMsg.MMTextInputUI", "on back key down");
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
  
  public void w(CharSequence paramCharSequence) {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/tools/MMTextInputUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */