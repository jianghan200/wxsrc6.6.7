package org.b.g;

import java.util.regex.Pattern;

public final class d
{
  private static final Pattern vKY = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*://\\S+");
  
  public static void gE(String paramString1, String paramString2)
  {
    if ((paramString1 != null) && (!paramString1.trim().equals(""))) {}
    for (boolean bool = true;; bool = false)
    {
      r(bool, paramString2);
      return;
    }
  }
  
  public static void j(Object paramObject, String paramString)
  {
    if (paramObject != null) {}
    for (boolean bool = true;; bool = false)
    {
      r(bool, paramString);
      return;
    }
  }
  
  private static void r(boolean paramBoolean, String paramString)
  {
    String str;
    if (paramString != null)
    {
      str = paramString;
      if (paramString.trim().length() > 0) {}
    }
    else
    {
      str = "Received an invalid parameter";
    }
    if (!paramBoolean) {
      throw new IllegalArgumentException(str);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/org/b/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */