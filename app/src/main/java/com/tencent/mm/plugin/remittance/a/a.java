package com.tencent.mm.plugin.remittance.a;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.remittance.ui.RemittanceAdapterUI;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.wallet_core.c;

public class a
  extends c
{
  public c a(Activity paramActivity, Bundle paramBundle)
  {
    x.d("MicroMsg.RemittanceProcess", "start Process : RemittanceProcess");
    c(paramActivity, RemittanceAdapterUI.class, paramBundle);
    return this;
  }
  
  public final void a(Activity paramActivity, int paramInt, Bundle paramBundle) {}
  
  public final String aNK()
  {
    return "RemittanceProcess";
  }
  
  public final void b(Activity paramActivity, Bundle paramBundle)
  {
    super.ag(paramActivity);
  }
  
  public final void c(Activity paramActivity, int paramInt)
  {
    z(paramActivity);
  }
  
  public final boolean c(Activity paramActivity, Bundle paramBundle)
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/remittance/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */