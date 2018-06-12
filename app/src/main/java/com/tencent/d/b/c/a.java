package com.tencent.d.b.c;

import android.annotation.SuppressLint;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import com.tencent.d.a.c.c;
import com.tencent.d.b.f.g;
import junit.framework.Assert;

public final class a
{
  public CancellationSignal vlR = null;
  
  public a()
  {
    if (Build.VERSION.SDK_INT >= 16) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      cFS();
      return;
    }
  }
  
  @SuppressLint({"NewApi"})
  public final void cFS()
  {
    this.vlR = new CancellationSignal();
  }
  
  @SuppressLint({"NewApi"})
  public final boolean mR(boolean paramBoolean)
  {
    c.v("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", new Object[] { Boolean.valueOf(paramBoolean) });
    if (!this.vlR.isCanceled())
    {
      if (Build.VERSION.SDK_INT < 23)
      {
        g.cGb().C(new a.1(this, paramBoolean));
        return true;
      }
      g.cGb().C(new a.2(this));
      g.cGb().l(new a.3(this), 350L);
      return true;
    }
    c.i("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new Object[0]);
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/d/b/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */