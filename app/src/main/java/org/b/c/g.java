package org.b.c;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.b.b.b;
import org.b.d.i;
import org.b.g.c;
import org.b.g.d;

public final class g
  implements a, f
{
  private static final Pattern vKr = Pattern.compile("oauth_token=([^&]+)");
  private static final Pattern vKs = Pattern.compile("oauth_token_secret=([^&]*)");
  
  private static String g(String paramString, Pattern paramPattern)
  {
    paramPattern = paramPattern.matcher(paramString);
    if ((paramPattern.find()) && (paramPattern.groupCount() > 0)) {
      return c.decode(paramPattern.group(1));
    }
    throw new b("Response body is incorrect. Can't extract token and secret from this: '" + paramString + "'", null);
  }
  
  public final i adT(String paramString)
  {
    d.gE(paramString, "Response body is incorrect. Can't extract a token from an empty string");
    return new i(g(paramString, vKr), g(paramString, vKs), paramString);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/org/b/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */