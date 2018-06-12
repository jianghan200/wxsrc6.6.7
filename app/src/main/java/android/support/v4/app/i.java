package android.support.v4.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;

public class i
  extends Fragment
  implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener
{
  int no = 0;
  int np = 0;
  boolean nq = true;
  public boolean nr = true;
  int ns = -1;
  Dialog nt;
  boolean nu;
  boolean nv;
  boolean nw;
  
  public void a(m paramm, String paramString)
  {
    this.nv = false;
    this.nw = true;
    paramm = paramm.bk();
    paramm.a(this, paramString);
    paramm.commit();
  }
  
  public Dialog bg()
  {
    return new Dialog(getActivity(), this.np);
  }
  
  public LayoutInflater getLayoutInflater(Bundle paramBundle)
  {
    if (!this.nr) {
      return super.getLayoutInflater(paramBundle);
    }
    this.nt = bg();
    if (this.nt != null)
    {
      paramBundle = this.nt;
      switch (this.no)
      {
      }
      for (;;)
      {
        return (LayoutInflater)this.nt.getContext().getSystemService("layout_inflater");
        paramBundle.getWindow().addFlags(24);
        paramBundle.requestWindowFeature(1);
      }
    }
    return (LayoutInflater)this.mHost.mContext.getSystemService("layout_inflater");
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    if (!this.nr) {}
    do
    {
      do
      {
        return;
        View localView = getView();
        if (localView != null)
        {
          if (localView.getParent() != null) {
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
          }
          this.nt.setContentView(localView);
        }
        this.nt.setOwnerActivity(getActivity());
        this.nt.setCancelable(this.nq);
        this.nt.setOnCancelListener(this);
        this.nt.setOnDismissListener(this);
      } while (paramBundle == null);
      paramBundle = paramBundle.getBundle("android:savedDialogState");
    } while (paramBundle == null);
    this.nt.onRestoreInstanceState(paramBundle);
  }
  
  public void onAttach(Activity paramActivity)
  {
    super.onAttach(paramActivity);
    if (!this.nw) {
      this.nv = false;
    }
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {}
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (this.mContainerId == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.nr = bool;
      if (paramBundle != null)
      {
        this.no = paramBundle.getInt("android:style", 0);
        this.np = paramBundle.getInt("android:theme", 0);
        this.nq = paramBundle.getBoolean("android:cancelable", true);
        this.nr = paramBundle.getBoolean("android:showsDialog", this.nr);
        this.ns = paramBundle.getInt("android:backStackId", -1);
      }
      return;
    }
  }
  
  public void onDestroyView()
  {
    super.onDestroyView();
    if (this.nt != null)
    {
      this.nu = true;
      this.nt.dismiss();
      this.nt = null;
    }
  }
  
  public void onDetach()
  {
    super.onDetach();
    if ((!this.nw) && (!this.nv)) {
      this.nv = true;
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    if ((!this.nu) && (!this.nv))
    {
      this.nv = true;
      this.nw = false;
      if (this.nt != null)
      {
        this.nt.dismiss();
        this.nt = null;
      }
      this.nu = true;
      if (this.ns >= 0)
      {
        getFragmentManager().S(this.ns);
        this.ns = -1;
      }
    }
    else
    {
      return;
    }
    paramDialogInterface = getFragmentManager().bk();
    paramDialogInterface.a(this);
    paramDialogInterface.commitAllowingStateLoss();
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    if (this.nt != null)
    {
      Bundle localBundle = this.nt.onSaveInstanceState();
      if (localBundle != null) {
        paramBundle.putBundle("android:savedDialogState", localBundle);
      }
    }
    if (this.no != 0) {
      paramBundle.putInt("android:style", this.no);
    }
    if (this.np != 0) {
      paramBundle.putInt("android:theme", this.np);
    }
    if (!this.nq) {
      paramBundle.putBoolean("android:cancelable", this.nq);
    }
    if (!this.nr) {
      paramBundle.putBoolean("android:showsDialog", this.nr);
    }
    if (this.ns != -1) {
      paramBundle.putInt("android:backStackId", this.ns);
    }
  }
  
  public void onStart()
  {
    super.onStart();
    if (this.nt != null)
    {
      this.nu = false;
      this.nt.show();
    }
  }
  
  public void onStop()
  {
    super.onStop();
    if (this.nt != null) {
      this.nt.hide();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */