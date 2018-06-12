package org.b.d;

import java.io.Serializable;
import org.b.g.d;

public final class i
  implements Serializable
{
  public final String rWk;
  public final String token;
  private final String vKH;
  
  public i(String paramString1, String paramString2)
  {
    this(paramString1, paramString2, null);
  }
  
  public i(String paramString1, String paramString2, String paramString3)
  {
    d.j(paramString1, "Token can't be null");
    d.j(paramString2, "Secret can't be null");
    this.token = paramString1;
    this.rWk = paramString2;
    this.vKH = paramString3;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      return true;
      if ((paramObject == null) || (getClass() != paramObject.getClass())) {
        return false;
      }
      paramObject = (i)paramObject;
    } while ((this.token.equals(((i)paramObject).token)) && (this.rWk.equals(((i)paramObject).rWk)));
    return false;
  }
  
  public final int hashCode()
  {
    return this.token.hashCode() * 31 + this.rWk.hashCode();
  }
  
  public final String toString()
  {
    return String.format("Token[%s , %s]", new Object[] { this.token, this.rWk });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */