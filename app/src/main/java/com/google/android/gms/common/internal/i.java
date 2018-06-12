package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.Fragment;

public final class i
  implements DialogInterface.OnClickListener
{
  private final Intent Hq;
  private final Fragment aNT;
  private final int aNU;
  private final Activity mActivity;
  
  public i(Activity paramActivity, Intent paramIntent)
  {
    this.mActivity = paramActivity;
    this.aNT = null;
    this.Hq = paramIntent;
    this.aNU = 2;
  }
  
  public i(Fragment paramFragment, Intent paramIntent)
  {
    this.mActivity = null;
    this.aNT = paramFragment;
    this.Hq = paramIntent;
    this.aNU = 2;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    try
    {
      if ((this.Hq != null) && (this.aNT != null)) {
        this.aNT.startActivityForResult(this.Hq, this.aNU);
      }
      for (;;)
      {
        paramDialogInterface.dismiss();
        return;
        if (this.Hq != null) {
          this.mActivity.startActivityForResult(this.Hq, this.aNU);
        }
      }
      return;
    }
    catch (ActivityNotFoundException paramDialogInterface) {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/gms/common/internal/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */