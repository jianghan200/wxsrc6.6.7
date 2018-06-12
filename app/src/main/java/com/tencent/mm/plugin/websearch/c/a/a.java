package com.tencent.mm.plugin.websearch.c.a;

import com.tencent.mm.plugin.fts.a.a.l;
import java.util.List;

public abstract class a<T>
{
  protected String bWm;
  protected int pMZ;
  
  public a(String paramString)
  {
    this.bWm = paramString;
    this.pMZ = Integer.MAX_VALUE;
  }
  
  public abstract void cL(List<l> paramList);
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    for (;;)
    {
      return true;
      if (!(paramObject instanceof a)) {
        break;
      }
      paramObject = (a)paramObject;
      if ((this.bWm == ((a)paramObject).bWm) || ((this.bWm != null) && (this.bWm.equalsIgnoreCase(((a)paramObject).bWm)))) {}
      for (int i = 1; (((a)paramObject).pMZ != this.pMZ) || (i == 0); i = 0) {
        return false;
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/websearch/c/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */