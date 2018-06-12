package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.support.v4.app.i;
import android.support.v4.app.m;
import com.google.android.gms.common.internal.w;

public final class f
  extends i
{
  private DialogInterface.OnCancelListener aJE = null;
  private Dialog nt = null;
  
  public static f b(Dialog paramDialog, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    f localf = new f();
    paramDialog = (Dialog)w.j(paramDialog, "Cannot display null dialog");
    paramDialog.setOnCancelListener(null);
    paramDialog.setOnDismissListener(null);
    localf.nt = paramDialog;
    if (paramOnCancelListener != null) {
      localf.aJE = paramOnCancelListener;
    }
    return localf;
  }
  
  public final void a(m paramm, String paramString)
  {
    super.a(paramm, paramString);
  }
  
  public final Dialog bg()
  {
    if (this.nt == null) {
      this.nr = false;
    }
    return this.nt;
  }
  
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    if (this.aJE != null) {
      this.aJE.onCancel(paramDialogInterface);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/google/android/gms/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */