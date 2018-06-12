package com.tencent.mm.plugin.exdevice.ui;

import android.os.Bundle;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ui.MMActivity;

public class ExdeviceExpireUI
  extends MMActivity
{
  protected final int getLayoutId()
  {
    return R.i.exdevice_expire_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.exdevice_rank_tile);
    setBackBtn(new ExdeviceExpireUI.1(this));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/exdevice/ui/ExdeviceExpireUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */