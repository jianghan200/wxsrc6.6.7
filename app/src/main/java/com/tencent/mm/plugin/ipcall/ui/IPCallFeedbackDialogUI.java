package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.s;

@a(7)
public class IPCallFeedbackDialogUI
  extends MMActivity
{
  private g kwk;
  
  public void finish()
  {
    x.i("MicroMsg.IPCallFeedbackDialogUI", "finish");
    if ((this.kwk != null) && (this.kwk.isShowing()))
    {
      this.kwk.dismiss();
      this.kwk = null;
    }
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.i("MicroMsg.IPCallFeedbackDialogUI", "onCreate");
    this.kwk = new g(this, this.mController.tml, getIntent().getIntExtra("IPCallFeedbackDialogUI_KRoomId", 0), getIntent().getLongExtra("IPCallFeedbackDialogUI_KCallseq", 0L));
    this.kwk.setOnDismissListener(new IPCallFeedbackDialogUI.1(this));
    this.kwk.getWindow().setSoftInputMode(16);
    this.kwk.show();
  }
  
  public void onDestroy()
  {
    x.d("MicroMsg.IPCallFeedbackDialogUI", "onDestroy");
    super.onDestroy();
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.d("MicroMsg.IPCallFeedbackDialogUI", "onNewIntent");
    super.onNewIntent(paramIntent);
  }
  
  public void onResume()
  {
    x.d("MicroMsg.IPCallFeedbackDialogUI", "onResume");
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallFeedbackDialogUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */