package com.tencent.mm.plugin.label.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

public class ContactLabelBaseUI
  extends MMActivity
{
  private ProgressDialog eEX;
  
  public final void FE(String paramString)
  {
    getString(R.l.app_tip);
    this.eEX = h.a(this, paramString, true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        au.DF().cancel(636);
      }
    });
  }
  
  public final void aYM()
  {
    if ((this.eEX != null) && (this.eEX.isShowing())) {
      this.eEX.dismiss();
    }
  }
  
  protected int getLayoutId()
  {
    return 0;
  }
  
  public final void zK(String paramString)
  {
    h.a(this, paramString, "", new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/label/ui/ContactLabelBaseUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */