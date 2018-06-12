package com.tencent.liteav.basic.f;

public class a
  implements Cloneable
{
  public int a;
  public int b;
  public int c;
  public int d;
  public long e;
  public byte[] f;
  
  public Object clone()
  {
    try
    {
      a locala = (a)super.clone();
      return locala;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/liteav/basic/f/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */