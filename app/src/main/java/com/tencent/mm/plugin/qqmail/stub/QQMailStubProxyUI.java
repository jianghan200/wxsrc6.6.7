package com.tencent.mm.plugin.qqmail.stub;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.mm.plugin.qqmail.ui.c;
import com.tencent.mm.plugin.qqmail.ui.c.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;

@a(7)
public class QQMailStubProxyUI
  extends Activity
{
  protected void onCreate(final Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.QQMail.QQMailStubProxyUI", "onCreate");
    paramBundle = new c(this);
    paramBundle.a(new c.a()
    {
      public final void boA()
      {
        x.e("MicroMsg.QQMail.QQMailStubProxyUI", "onVerifyFail, finish self");
        paramBundle.release();
        QQMailStubProxyUI.this.setResult(0);
        QQMailStubProxyUI.this.finish();
      }
      
      public final void boz()
      {
        x.d("MicroMsg.QQMail.QQMailStubProxyUI", "onAfterVerify");
        paramBundle.release();
        QQMailStubProxyUI.this.setResult(-1);
        QQMailStubProxyUI.this.finish();
      }
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/qqmail/stub/QQMailStubProxyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */