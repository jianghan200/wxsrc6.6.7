package com.tencent.mm.ui.tools;

import android.content.Context;
import android.content.res.ColorStateList;
import com.tencent.mm.bp.a;
import com.tencent.mm.w.a.d;
import junit.framework.Assert;

public final class q
{
  private static q uCr = null;
  private ColorStateList[] tEk = new ColorStateList[2];
  private boolean uCs = false;
  
  private q(Context paramContext)
  {
    this.tEk[0] = a.ac(paramContext, a.d.mm_open_status);
    this.tEk[1] = a.ac(paramContext, a.d.mm_pref_summary);
  }
  
  private static q ha(Context paramContext)
  {
    if (paramContext != null) {}
    for (boolean bool = true;; bool = false)
    {
      Assert.assertTrue(bool);
      if ((uCr == null) || (!uCr.uCs)) {
        uCr = new q(paramContext);
      }
      return uCr;
    }
  }
  
  public static ColorStateList hb(Context paramContext)
  {
    return ha(paramContext).tEk[0];
  }
  
  public static ColorStateList hc(Context paramContext)
  {
    return ha(paramContext).tEk[1];
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/ui/tools/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */