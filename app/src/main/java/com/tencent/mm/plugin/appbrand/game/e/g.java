package com.tencent.mm.plugin.appbrand.game.e;

public final class g
{
  private static String[][] fDp;
  
  static
  {
    String[] arrayOfString1 = { "\"", "\\\"" };
    String[] arrayOfString2 = { "\r", "\\r" };
    fDp = new String[][] { { "\\", "\\\\" }, { "'", "\\'" }, arrayOfString1, { "\n", "\\n" }, { "\t", "\\t" }, { "\b", "\\b" }, { "\f", "\\f" }, arrayOfString2 };
  }
  
  public static String tc(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {}
    String str;
    for (int i = 1; i != 0; i = 0)
    {
      str = paramString;
      return str;
    }
    String[][] arrayOfString = fDp;
    int j = arrayOfString.length;
    i = 0;
    for (;;)
    {
      str = paramString;
      if (i >= j) {
        break;
      }
      str = arrayOfString[i];
      paramString = paramString.replace(str[0], str[1]);
      i += 1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/appbrand/game/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */