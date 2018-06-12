package com.tencent.mm.ui;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.R.l;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

@a(19)
public class DataTransferUI
  extends MMBaseActivity
{
  private p guT;
  private long startTime = 0L;
  
  private void as(Intent paramIntent)
  {
    boolean bool = paramIntent.getBooleanExtra("finish_data_transfer", false);
    x.d("MicroMsg.DataTransferUI", "tryFinish, timestamp = " + System.currentTimeMillis() + ", finish = " + bool);
    if (bool) {
      finish();
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    x.d("MicroMsg.DataTransferUI", "onCreate, timestamp = " + System.currentTimeMillis());
    this.startTime = System.currentTimeMillis();
    getString(R.l.app_tip);
    this.guT = h.a(this, getString(R.l.app_data_transfering), false, null);
    new DataTransferUI.1(this).sendEmptyMessageDelayed(0, 60000L);
    as(getIntent());
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    x.d("MicroMsg.DataTransferUI", "onDestroy");
    if ((this.guT != null) && (this.guT.isShowing())) {
      this.guT.dismiss();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    x.d("MicroMsg.DataTransferUI", "onNewIntent, timestamp = " + System.currentTimeMillis());
    as(paramIntent);
  }
  
  protected void onPause()
  {
    x.d("MicroMsg.DataTransferUI", "edw DataTransferUI duration time = " + (System.currentTimeMillis() - this.startTime));
    super.onPause();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/ui/DataTransferUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */