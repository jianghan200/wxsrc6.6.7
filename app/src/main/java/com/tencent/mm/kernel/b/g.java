package com.tencent.mm.kernel.b;

import android.app.Application;
import com.tencent.mm.kernel.a.a;

public abstract class g
{
  public String dox;
  public a dqh;
  public Application dsQ;
  private Boolean dsR;
  
  public g(String paramString, Application paramApplication)
  {
    this.dox = paramString;
    this.dqh = new a();
    this.dsQ = paramApplication;
  }
  
  public final boolean ES()
  {
    if (this.dsR == null) {
      this.dsR = Boolean.valueOf(gn(""));
    }
    return this.dsR.booleanValue();
  }
  
  public abstract String getPackageName();
  
  public final boolean gn(String paramString)
  {
    return (this.dox != null) && (this.dox.equals(getPackageName() + paramString));
  }
  
  public String toString()
  {
    if (this.dox != null) {
      return this.dox;
    }
    return super.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/kernel/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */