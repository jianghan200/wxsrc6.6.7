package com.tencent.mm.plugin.facedetect.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.np.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

@com.tencent.mm.ui.base.a(3)
public class FaceTransparentStubUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    x.i("MicroMsg.FaceTransparentStubUI", "hy: on activity result in FaceTransparentStubUI");
    setResult(paramInt2, paramIntent);
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = getIntent().getIntExtra("KEY_REQUEST_CODE", 1000);
    Object localObject = getIntent().getBundleExtra("KEY_EXTRAS");
    if (!((Bundle)localObject).containsKey("k_user_name"))
    {
      g.Eg();
      if (com.tencent.mm.kernel.a.Dw()) {
        ((Bundle)localObject).putString("k_user_name", q.GI());
      }
    }
    paramBundle = new np();
    paramBundle.bYG.context = this;
    paramBundle.bYG.bYI = i;
    paramBundle.bYG.extras = ((Bundle)localObject);
    com.tencent.mm.sdk.b.a.sFg.m(paramBundle);
    x.i("MicroMsg.FaceTransparentStubUI", "hy: start face detect event result: %b", new Object[] { Boolean.valueOf(paramBundle.bYH.bYJ) });
    if (!paramBundle.bYH.bYJ)
    {
      if (paramBundle.bYH.extras == null) {
        break label171;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtras(paramBundle.bYH.extras);
      setResult(1, (Intent)localObject);
    }
    for (;;)
    {
      finish();
      return;
      label171:
      setResult(1);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/facedetect/ui/FaceTransparentStubUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */