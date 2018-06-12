package com.tencent.tencentmap.mapsdk.a;

import java.util.HashMap;

public final class gq
  extends gu
{
  int b;
  
  private gq(gh paramgh, int paramInt)
  {
    super(paramgh);
    a(paramInt);
  }
  
  public static gq a(gh paramgh, int paramInt, gt paramgt, Object... paramVarArgs)
  {
    paramgh = new gq(paramgh, paramInt);
    paramgh.a(paramVarArgs);
    paramgh.a(paramgt);
    return paramgh;
  }
  
  public static gq a(gh paramgh, int paramInt, double... paramVarArgs)
  {
    paramgh = new gq(paramgh, paramInt);
    paramgh.a(paramVarArgs);
    return paramgh;
  }
  
  public final void a(int paramInt)
  {
    if (this.e != null)
    {
      gr localgr = this.e[0];
      int i = localgr.b();
      this.f.remove(Integer.valueOf(i));
      this.f.put(Integer.valueOf(paramInt), localgr);
    }
    this.b = paramInt;
  }
  
  public final void a(double... paramVarArgs)
  {
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new gr[] { gr.a(this.b, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  public final void a(Object... paramVarArgs)
  {
    if ((this.e == null) || (this.e.length == 0))
    {
      a(new gr[] { gr.a(this.b, null, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  public final gq b()
  {
    return (gq)super.a();
  }
  
  public final String toString()
  {
    String str1 = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.g;
    String str2 = str1;
    if (this.e != null)
    {
      int i = 0;
      for (;;)
      {
        str2 = str1;
        if (i >= this.e.length) {
          break;
        }
        str1 = str1 + "\n    " + this.e[i].toString();
        i += 1;
      }
    }
    return str2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */