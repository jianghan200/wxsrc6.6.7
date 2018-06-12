package com.tencent.tencentmap.mapsdk.a;

import java.util.ArrayList;

class gk
  extends gp
{
  private boolean g = true;
  
  public gk(go.a... paramVarArgs)
  {
    super(paramVarArgs);
  }
  
  public gk a()
  {
    ArrayList localArrayList = this.e;
    int j = this.e.size();
    go.a[] arrayOfa = new go.a[j];
    int i = 0;
    while (i < j)
    {
      arrayOfa[i] = ((go.a)((go)localArrayList.get(i)).d());
      i += 1;
    }
    return new gk(arrayOfa);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/tencentmap/mapsdk/a/gk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */