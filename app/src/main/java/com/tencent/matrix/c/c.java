package com.tencent.matrix.c;

import java.util.HashSet;

public class c
{
  private final a bro;
  private final HashSet<String> brp = new HashSet();
  
  public c(a parama)
  {
    this.bro = parama;
  }
  
  public final void c(b paramb)
  {
    if (this.bro == null) {
      throw new RuntimeException("publish issue, but issue listener is null");
    }
    this.bro.a(paramb);
  }
  
  public void ca(String paramString)
  {
    if (paramString == null) {
      return;
    }
    this.brp.add(paramString);
  }
  
  public boolean cb(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    return this.brp.contains(paramString);
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/matrix/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */