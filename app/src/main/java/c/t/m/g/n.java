package c.t.m.g;

import android.text.TextUtils;

public final class n
{
  public String a = "";
  public int b = -1;
  public int c = -1;
  
  public n() {}
  
  public n(String paramString, int paramInt)
  {
    this.a = paramString;
    this.b = paramInt;
  }
  
  public final String a()
  {
    return this.a + ":" + this.b;
  }
  
  public final boolean a(n paramn)
  {
    return (paramn != null) && (this.a.equals(paramn.a)) && (this.b == paramn.b);
  }
  
  public final boolean a(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    for (;;)
    {
      return false;
      paramString = paramString.split(":");
      if (paramString.length == 2)
      {
        this.a = paramString[0];
        if (ci.d(this.a)) {
          try
          {
            this.b = Integer.parseInt(paramString[1]);
            if (this.b >= 0)
            {
              int i = this.b;
              if (i <= 65535) {
                return true;
              }
            }
          }
          catch (NumberFormatException paramString) {}
        }
      }
    }
    return false;
  }
  
  public final boolean b()
  {
    return this.b == -1;
  }
  
  public final String toString()
  {
    return a();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/c/t/m/g/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */