package com.tencent.mm.plugin.ext.ui;

import android.app.Activity;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public class RedirectToChattingByPhoneStubUI
  extends Activity
  implements e
{
  private p iKZ = null;
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    finish();
  }
  
  public final boolean hideVKB()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)getSystemService("input_method");
    if (localInputMethodManager == null) {}
    Object localObject;
    do
    {
      do
      {
        return false;
        localObject = getCurrentFocus();
      } while (localObject == null);
      localObject = ((View)localObject).getWindowToken();
    } while (localObject == null);
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      x.v("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        x.e("MicroMsg.RedirectToChattingByPhoneStubUI", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
        boolean bool = false;
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getString(R.l.app_waiting);
    this.iKZ = h.a(this, "", false, null);
    ah.i(new RedirectToChattingByPhoneStubUI.1(this), 500L);
    au.DF().a(106, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(106, this);
    if (this.iKZ != null)
    {
      this.iKZ.dismiss();
      this.iKZ = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ext/ui/RedirectToChattingByPhoneStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */