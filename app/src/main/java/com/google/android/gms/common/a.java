package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.google.android.gms.common.internal.w;

public final class a
  extends DialogFragment
{
  private DialogInterface.OnCancelListener aJE = null;
  private Dialog nt = null;
  
  public static a a(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    a locala = new a();
    paramDialog = (Dialog)w.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    locala.nt = paramDialog;
    if (paramOnCancelListener != null) {
      locala.aJE = paramOnCancelListener;
    }
    return locala;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.aJE != null) {
      this.aJE.onCancel(paramDialogInterface);
    }
  }
  
  public final Dialog onCreateDialog(Bundle paramBundle)
  {
    if (this.nt == null) {
      setShowsDialog(false);
    }
    return this.nt;
  }
  
  public final void show(FragmentManager paramFragmentManager, String paramString)
  {
    super.show(paramFragmentManager, paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */