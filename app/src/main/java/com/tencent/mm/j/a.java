package com.tencent.mm.j;

import com.tencent.mm.storage.bd;

public abstract interface a
{
  public abstract void c(bd parambd);
  
  public abstract String d(bd parambd);
  
  public abstract boolean eZ(String paramString);
  
  public abstract String z(String paramString, int paramInt);
  
  public static final class a
  {
    private static a daD = null;
    
    public static void a(a parama)
    {
      daD = parama;
    }
    
    public static a yw()
    {
      return daD;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */