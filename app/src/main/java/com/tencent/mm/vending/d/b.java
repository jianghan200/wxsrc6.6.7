package com.tencent.mm.vending.d;

import java.util.ArrayList;
import java.util.List;

public final class b<T>
{
  private volatile List<T> uQH;
  
  private b(List paramList)
  {
    this.uQH = paramList;
  }
  
  public final T get(int paramInt)
  {
    return (T)this.uQH.get(paramInt);
  }
  
  public final int size()
  {
    return this.uQH.size();
  }
  
  public static final class a<T>
  {
    private ArrayList<T> uQI = new ArrayList();
    
    private void ccG()
    {
      if (this.uQI == null) {
        throw new IllegalAccessError();
      }
    }
    
    public final b<T> cBD()
    {
      ccG();
      ArrayList localArrayList = this.uQI;
      this.uQI = null;
      return new b(localArrayList, (byte)0);
    }
    
    public final a<T> u(T... paramVarArgs)
    {
      ccG();
      int i = 0;
      while (i <= 0)
      {
        T ? = paramVarArgs[0];
        this.uQI.add(?);
        i += 1;
      }
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/vending/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */