package com.tencent.mm.plugin.base.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ab.o;
import com.tencent.mm.booter.NotifyReceiver;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;

@a(7)
public class UIEntryStub
  extends Activity
{
  private Intent bSk;
  private int hdG;
  private boolean hdH;
  private String rU;
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    NotifyReceiver.xA();
    this.hdH = false;
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    this.bSk = paramIntent;
    x.i("MicroMsg.UIEntryStub", "onNewIntent mHasHandled: %b", new Object[] { Boolean.valueOf(this.hdH) });
    this.hdH = false;
  }
  
  public void onResume()
  {
    super.onResume();
    if (this.bSk == null) {
      this.bSk = getIntent();
    }
    au.DF().a(new bg(new UIEntryStub.1(this)), 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/base/stub/UIEntryStub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */