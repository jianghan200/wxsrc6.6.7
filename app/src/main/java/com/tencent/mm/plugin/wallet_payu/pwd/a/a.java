package com.tencent.mm.plugin.wallet_payu.pwd.a;

import android.os.Bundle;
import com.tencent.mm.ab.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.d.g;
import com.tencent.mm.wallet_core.d.i;

public class a
  extends g
{
  private Bundle jfZ;
  
  public a(MMActivity paramMMActivity, i parami, Bundle paramBundle)
  {
    super(paramMMActivity, parami);
    this.jfZ = paramBundle;
  }
  
  public final boolean d(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if ((paraml instanceof c))
    {
      paramString = (c)paraml;
      if (bi.oW(paramString.token)) {
        break label57;
      }
      x.d("MicroMsg.CommonCheckPwdController", "hy: check pwd pass");
      this.jfZ.putString("payu_reference", paramString.token);
      com.tencent.mm.wallet_core.a.j(this.fEY, this.jfZ);
    }
    for (;;)
    {
      return false;
      label57:
      x.w("MicroMsg.CommonCheckPwdController", "hy: check pwd failed");
    }
  }
  
  public final boolean m(Object... paramVarArgs)
  {
    this.jfZ.putString("key_pwd1", (String)paramVarArgs[0]);
    this.uXK.a(new c(this.jfZ.getString("key_pwd1")), true);
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/wallet_payu/pwd/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */