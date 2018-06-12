package org.b.d;

import java.io.OutputStream;

public final class a
{
  public final String scope;
  public final String vKl;
  public final String vKm;
  public final String vKn;
  public final h vKp;
  private final OutputStream vKq;
  
  public a(String paramString1, String paramString2, String paramString3, h paramh, String paramString4, OutputStream paramOutputStream)
  {
    this.vKl = paramString1;
    this.vKm = paramString2;
    this.vKn = paramString3;
    this.vKp = paramh;
    this.scope = paramString4;
    this.vKq = paramOutputStream;
  }
  
  public final void sL(String paramString)
  {
    if (this.vKq != null) {
      paramString = paramString + "\n";
    }
    try
    {
      this.vKq.write(paramString.getBytes("UTF8"));
      return;
    }
    catch (Exception paramString)
    {
      throw new RuntimeException("there were problems while writting to the debug stream", paramString);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/org/b/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */