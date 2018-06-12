package com.tencent.mm.plugin.nfc.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.Button;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.hce.a.b;
import com.tencent.mm.plugin.nfc.HCEService;
import com.tencent.mm.ui.MMActivity;

public class HceTestUI
  extends MMActivity
{
  private Button lFn;
  private Button lFo;
  private Intent lFp;
  
  protected final int getLayoutId()
  {
    return R.i.hce_test_ui;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (b.aVV())
    {
      this.lFp = new Intent(this, HCEService.class);
      startService(this.lFp);
    }
    this.lFn = ((Button)findViewById(R.h.start_nfc_setting));
    this.lFo = ((Button)findViewById(R.h.set_default_nfc_pay_app));
    this.lFn.setOnClickListener(new HceTestUI.1(this));
    this.lFo.setOnClickListener(new HceTestUI.2(this));
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        HceTestUI.this.finish();
        return false;
      }
    });
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (this.lFp != null) {
      stopService(this.lFp);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/nfc/ui/HceTestUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */