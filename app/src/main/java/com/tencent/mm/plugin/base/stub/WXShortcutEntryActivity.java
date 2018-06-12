package com.tencent.mm.plugin.base.stub;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import com.tencent.mm.plugin.ah.b;
import com.tencent.mm.plugin.ah.c;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity;
import com.tencent.mm.pluginsdk.ui.AutoLoginActivity.a;
import com.tencent.mm.sdk.platformtools.s;
import com.tencent.mm.sdk.platformtools.x;

public class WXShortcutEntryActivity
  extends AutoLoginActivity
{
  protected final boolean A(Intent paramIntent)
  {
    return true;
  }
  
  protected final void a(AutoLoginActivity.a parama, Intent paramIntent)
  {
    if (paramIntent == null)
    {
      x.e("MicroMsg.WXShortcutEntryActivity", "intent is null");
      finish();
      return;
    }
    parama = c.nbP;
    int i = s.a(paramIntent, "type", 0);
    if (paramIntent != null)
    {
      parama = (b)parama.nbQ.get(i);
      if (parama != null) {
        parama.l(this, paramIntent);
      }
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/base/stub/WXShortcutEntryActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */