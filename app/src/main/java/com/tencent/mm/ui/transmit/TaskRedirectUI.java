package com.tencent.mm.ui.transmit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.base.a;

@a(7)
public class TaskRedirectUI
  extends Activity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, LauncherUI.class);
    paramBundle.addFlags(268435456);
    paramBundle.addFlags(67108864);
    startActivity(paramBundle);
    finish();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/transmit/TaskRedirectUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */