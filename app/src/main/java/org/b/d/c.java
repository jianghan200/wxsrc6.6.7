package org.b.d;

import java.util.HashMap;
import java.util.Map;

public final class c
  extends f
{
  public Map<String, String> vKu = new HashMap();
  
  public c(j paramj, String paramString)
  {
    super(paramj, paramString);
  }
  
  public final void gC(String paramString1, String paramString2)
  {
    Map localMap = this.vKu;
    if ((paramString1.startsWith("oauth_")) || (paramString1.equals("scope")))
    {
      localMap.put(paramString1, paramString2);
      return;
    }
    throw new IllegalArgumentException(String.format("OAuth parameters must either be '%s' or start with '%s'", new Object[] { "scope", "oauth_" }));
  }
  
  public final String toString()
  {
    return String.format("@OAuthRequest(%s, %s)", new Object[] { super.cKt(), super.getUrl() });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/org/b/d/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */