package com.tencent.mm.plugin.fingerprint.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.s;

public class SoterPayTestUI
  extends MMActivity
  implements e
{
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    x.i("MicroMsg.SoterPayTestUI", "hy: on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    s.makeText(this, String.format("on scene end: errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString }), 1).show();
    g.Ek();
    g.Eh().dpP.b(paraml.getType(), this);
  }
  
  protected final int getLayoutId()
  {
    return a.g.fingerprint_soter_cgi_test;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    findViewById(a.f.soter_cgi_test_get_challenge).setOnClickListener(new SoterPayTestUI.1(this));
    findViewById(a.f.regen_upload_ask).setOnClickListener(new SoterPayTestUI.2(this));
    findViewById(a.f.regen_upload_pay_auth_key).setOnClickListener(new SoterPayTestUI.3(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */