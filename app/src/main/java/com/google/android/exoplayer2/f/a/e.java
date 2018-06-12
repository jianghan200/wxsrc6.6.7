package com.google.android.exoplayer2.f.a;

import com.google.android.exoplayer2.f.i;
import java.util.LinkedList;

public final class e
  extends i
{
  private final d axy;
  
  public e(d paramd)
  {
    this.axy = paramd;
  }
  
  public final void release()
  {
    d locald = this.axy;
    clear();
    locald.axv.add(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/f/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */