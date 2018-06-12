package com.google.android.exoplayer2.b;

public abstract class a
{
  public int flags;
  
  public final void cf(int paramInt)
  {
    this.flags |= paramInt;
  }
  
  protected final boolean cg(int paramInt)
  {
    return (this.flags & paramInt) == paramInt;
  }
  
  public void clear()
  {
    this.flags = 0;
  }
  
  public final boolean jx()
  {
    return cg(Integer.MIN_VALUE);
  }
  
  public final boolean jy()
  {
    return cg(4);
  }
  
  public final boolean jz()
  {
    return cg(1);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */