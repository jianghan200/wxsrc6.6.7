package com.tencent.mm.kiss.widget.textview;

import android.text.Layout.Alignment;
import android.text.TextPaint;

public final class e
{
  private final d[] dud = new d[3];
  private final Object mLock = new Object();
  private int tN;
  
  public final d Fb()
  {
    synchronized (this.mLock)
    {
      if (this.tN > 0)
      {
        int i = this.tN - 1;
        d locald = this.dud[i];
        this.dud[i] = null;
        this.tN -= 1;
        return locald;
      }
      return null;
    }
  }
  
  public final boolean a(d paramd)
  {
    Object localObject = this.mLock;
    int i = 0;
    for (;;)
    {
      try
      {
        if (i >= this.tN) {
          break label55;
        }
        if (this.dud[i] == paramd)
        {
          i = 1;
          if (i == 0) {
            break;
          }
          throw new IllegalStateException("Already in the pool!");
        }
      }
      finally {}
      i += 1;
      continue;
      label55:
      i = 0;
    }
    paramd.dtQ = null;
    paramd.dtR = null;
    paramd.dtS = 0;
    paramd.dtT = 0;
    paramd.dtU = new TextPaint();
    paramd.width = 0;
    paramd.dtV = Layout.Alignment.ALIGN_NORMAL;
    paramd.gravity = 51;
    paramd.dtW = null;
    paramd.dtX = 0;
    paramd.maxLines = Integer.MAX_VALUE;
    paramd.dtY = null;
    paramd.dtZ = 0.0F;
    paramd.dua = 1.0F;
    paramd.dub = false;
    paramd.maxLength = 0;
    paramd.duc = null;
    if (this.tN < this.dud.length)
    {
      this.dud[this.tN] = paramd;
      this.tN += 1;
      return true;
    }
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kiss/widget/textview/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */