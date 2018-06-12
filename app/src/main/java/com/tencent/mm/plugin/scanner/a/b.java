package com.tencent.mm.plugin.scanner.a;

import android.app.Activity;
import com.tencent.mm.plugin.scanner.util.a;
import com.tencent.mm.plugin.scanner.util.e;
import com.tencent.mm.plugin.scanner.util.e.a;
import com.tencent.mm.sdk.b.c;

public final class b
{
  Activity mActivity;
  String mFE;
  e mFF;
  a mFG;
  e.a mFH = new b.1(this);
  public c mFI = new b.2(this);
  public c mFJ = new b.3(this);
  
  public final void bsa()
  {
    if (this.mFF != null)
    {
      this.mFF.bsY();
      this.mFF = null;
    }
    this.mActivity = null;
    this.mFE = null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/scanner/a/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */