package com.tencent.mm.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bg;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

public class JSAPIUploadLogHelperUI
  extends MMBaseActivity
{
  private static volatile boolean mIsRunning = false;
  private static byte[] tkf = new byte[0];
  
  protected void onCreate(Bundle arg1)
  {
    x.i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onCreate(???);
    setContentView(R.i.background_transparent);
    int i;
    for (;;)
    {
      synchronized (tkf)
      {
        if (mIsRunning)
        {
          x.w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
          finish();
        }
        ??? = getIntent().getStringExtra("key_user");
        i = getIntent().getIntExtra("key_time", 0);
        if ((??? != null) && (???.equals(q.GF())))
        {
          bool = true;
          x.i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
          if (??? != null) {
            break;
          }
          x.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
          finish();
          return;
        }
      }
      boolean bool = false;
    }
    if (i < 0)
    {
      x.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", new Object[] { Integer.valueOf(i) });
      finish();
      return;
    }
    getString(R.l.app_tip);
    p localp = h.a(this, getString(R.l.wv_uploading), false, null);
    au.DF().a(new bg(new JSAPIUploadLogHelperUI.1(this, ???, i)), 0);
    au.a(new JSAPIUploadLogHelperUI.3(this, localp, new DialogInterface.OnDismissListener()
    {
      public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
      {
        if (!JSAPIUploadLogHelperUI.this.isFinishing()) {
          JSAPIUploadLogHelperUI.this.finish();
        }
      }
    }));
  }
  
  protected void onDestroy()
  {
    x.i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onDestroy();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/ui/JSAPIUploadLogHelperUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */