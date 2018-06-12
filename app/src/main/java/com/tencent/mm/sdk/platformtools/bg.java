package com.tencent.mm.sdk.platformtools;

import android.os.SystemClock;
import java.util.ArrayList;

public final class bg
{
  private boolean gnY;
  private String mTag;
  private String sJj;
  ArrayList<Long> sJk;
  ArrayList<String> sJl;
  
  public bg(String paramString1, String paramString2)
  {
    this.mTag = paramString1;
    this.sJj = paramString2;
    this.gnY = false;
    if (!this.gnY)
    {
      if (this.sJk != null) {
        break label61;
      }
      this.sJk = new ArrayList();
      this.sJl = new ArrayList();
    }
    for (;;)
    {
      addSplit(null);
      return;
      label61:
      this.sJk.clear();
      this.sJl.clear();
    }
  }
  
  public final void addSplit(String paramString)
  {
    if (this.gnY) {
      return;
    }
    long l = SystemClock.elapsedRealtime();
    this.sJk.add(Long.valueOf(l));
    this.sJl.add(paramString);
  }
  
  public final void dumpToLog()
  {
    if (this.gnY) {
      return;
    }
    x.d(this.mTag, this.sJj + ": begin");
    long l2 = ((Long)this.sJk.get(0)).longValue();
    int i = 1;
    long l1 = l2;
    while (i < this.sJk.size())
    {
      l1 = ((Long)this.sJk.get(i)).longValue();
      String str = (String)this.sJl.get(i);
      long l3 = ((Long)this.sJk.get(i - 1)).longValue();
      x.d(this.mTag, this.sJj + ":      " + (l1 - l3) + " ms, " + str);
      i += 1;
    }
    x.d(this.mTag, this.sJj + ": end, " + (l1 - l2) + " ms");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/sdk/platformtools/bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */