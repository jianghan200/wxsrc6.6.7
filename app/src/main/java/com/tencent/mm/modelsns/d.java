package com.tencent.mm.modelsns;

public final class d
{
  StringBuffer ehd = new StringBuffer();
  StringBuffer ehe = new StringBuffer();
  private int index = 0;
  
  public final void q(String paramString, Object paramObject)
  {
    this.ehd.append(this.index + " " + paramString + "->" + paramObject + "\n");
    this.ehe.append(paramObject);
    this.index += 1;
  }
  
  public final void r(String paramString, Object paramObject)
  {
    this.ehd.append(paramString + "->" + paramObject + "\n");
    this.ehe.append(paramObject);
  }
  
  public final String toString()
  {
    return this.ehe.toString();
  }
  
  public final String wF()
  {
    this.index = 0;
    this.ehd.append("--end--\n\n");
    return this.ehd.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/modelsns/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */