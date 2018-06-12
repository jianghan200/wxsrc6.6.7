package org.b.a;

import java.io.OutputStream;
import org.b.b.b;
import org.b.d.h;
import org.b.g.d;

public final class a
{
  public String scope;
  public String vKl;
  public String vKm;
  public String vKn = "oob";
  public org.b.a.a.a vKo;
  public h vKp = h.vKE;
  public OutputStream vKq = null;
  
  public static org.b.a.a.a Y(Class<? extends org.b.a.a.a> paramClass)
  {
    d.j(paramClass, "Api class cannot be null");
    try
    {
      paramClass = (org.b.a.a.a)paramClass.newInstance();
      return paramClass;
    }
    catch (Exception paramClass)
    {
      throw new b("Error while creating the Api object", paramClass);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */