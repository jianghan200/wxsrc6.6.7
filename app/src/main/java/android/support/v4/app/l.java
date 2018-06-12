package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class l<E>
  extends j
{
  final Activity mActivity;
  boolean mCheckedForLoaderManager;
  final Context mContext;
  final n mFragmentManager = new n();
  final Handler mHandler;
  u mLoaderManager;
  boolean mLoadersStarted;
  final int nD;
  android.support.v4.e.j<String, t> nE;
  boolean nF;
  
  private l(Activity paramActivity, Context paramContext, Handler paramHandler)
  {
    this.mActivity = paramActivity;
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.nD = 0;
  }
  
  l(FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, paramFragmentActivity.mHandler);
  }
  
  public boolean H(String paramString)
  {
    return false;
  }
  
  final void I(String paramString)
  {
    if (this.nE != null)
    {
      u localu = (u)this.nE.get(paramString);
      if ((localu != null) && (!localu.mRetaining))
      {
        localu.bw();
        this.nE.remove(paramString);
      }
    }
  }
  
  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt != -1) {
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    this.mContext.startActivity(paramIntent);
  }
  
  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt) {}
  
  public void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString) {}
  
  final u b(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.nE == null) {
      this.nE = new android.support.v4.e.j();
    }
    u localu = (u)this.nE.get(paramString);
    if (localu == null)
    {
      if (paramBoolean2)
      {
        localu = new u(paramString, this, paramBoolean1);
        this.nE.put(paramString, localu);
      }
      return localu;
    }
    localu.mHost = this;
    return localu;
  }
  
  public boolean bh()
  {
    return true;
  }
  
  public void bi() {}
  
  final android.support.v4.e.j<String, t> bj()
  {
    int k;
    if (this.nE != null)
    {
      int m = this.nE.size();
      u[] arrayOfu = new u[m];
      int i = m - 1;
      while (i >= 0)
      {
        arrayOfu[i] = ((u)this.nE.valueAt(i));
        i -= 1;
      }
      int j = 0;
      i = 0;
      k = i;
      if (j < m)
      {
        u localu = arrayOfu[j];
        if (localu.mRetaining) {
          i = 1;
        }
        for (;;)
        {
          j += 1;
          break;
          localu.bw();
          this.nE.remove(localu.mWho);
        }
      }
    }
    else
    {
      k = 0;
    }
    if (k != 0) {
      return this.nE;
    }
    return null;
  }
  
  void onAttachFragment(Fragment paramFragment) {}
  
  public View onFindViewById(int paramInt)
  {
    return null;
  }
  
  public abstract E onGetHost();
  
  public LayoutInflater onGetLayoutInflater()
  {
    return (LayoutInflater)this.mContext.getSystemService("layout_inflater");
  }
  
  public int onGetWindowAnimations()
  {
    return this.nD;
  }
  
  public boolean onHasView()
  {
    return true;
  }
  
  public boolean onHasWindowAnimations()
  {
    return true;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/v4/app/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */