package com.tencent.sqlitelint.a;

import com.tencent.sqlitelint.e;
import com.tencent.sqlitelint.e.a;
import com.tencent.sqlitelint.e.b;
import java.util.ArrayList;
import java.util.List;

public final class a
{
  public final List<a> vnW;
  
  public a(int paramInt)
  {
    e.Hs(paramInt);
    this.vnW = new ArrayList();
  }
  
  public static final class a
  {
    public final e.a vnX;
    public final e.b vnY;
    public int vnZ;
    public final List<String> voa = new ArrayList();
    
    static
    {
      if (!a.class.desiredAssertionStatus()) {}
      for (boolean bool = true;; bool = false)
      {
        $assertionsDisabled = bool;
        return;
      }
    }
    
    public a(e.a parama, e.b paramb)
    {
      this.vnX = parama;
      this.vnY = paramb;
    }
    
    public final a acL(String paramString)
    {
      this.voa.add(paramString);
      return this;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/sqlitelint/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */