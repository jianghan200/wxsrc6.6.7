package com.tencent.mm.sdk.platformtools;

import com.tencent.mm.loader.stub.a;

public final class d
{
  public static String BUILD_TAG;
  public static String CLIENT_VERSION;
  public static String COMMAND;
  public static boolean DEBUG;
  public static boolean EX_DEVICE_LOGIN;
  public static String HOSTNAME;
  public static String OWNER;
  public static boolean REDESIGN_ENTRANCE;
  public static String REV;
  public static String SVNPATH;
  public static String TIME;
  public static boolean duK;
  public static boolean sFx;
  public static boolean sFy;
  
  public static String avA()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(String.format("[b.ver] %s\n", new Object[] { a.fM(CLIENT_VERSION, a.CLIENT_VERSION) }));
    localStringBuilder.append(String.format("[tag  ] %s\n", new Object[] { a.fM(BUILD_TAG, a.BUILD_TAG) }));
    localStringBuilder.append(String.format("[by   ] %s\n", new Object[] { a.fM(OWNER, a.OWNER) }));
    localStringBuilder.append(String.format("[host ] %s\n", new Object[] { a.fM(HOSTNAME, a.HOSTNAME) }));
    localStringBuilder.append(String.format("[time ] %s\n", new Object[] { a.fM(TIME, a.TIME) }));
    localStringBuilder.append(String.format("[cmd  ] %s\n", new Object[] { a.fM(COMMAND, a.COMMAND) }));
    localStringBuilder.append(String.format("[path ] %s\n", new Object[] { a.fM(a.fL(SVNPATH, "MicroMsg_proj"), a.fL(a.SVNPATH, "MicroMsg_proj")) }));
    localStringBuilder.append(String.format("[rev  ] %s\n", new Object[] { a.fM(REV, a.REV) }));
    if (a.patchEnabled()) {}
    for (String str = a.codeRevision();; str = "disabled")
    {
      localStringBuilder.append(String.format("[p.rev] %s\n", new Object[] { str }));
      return localStringBuilder.toString();
    }
  }
  
  private static final class a
  {
    public static String fL(String paramString1, String paramString2)
    {
      if (paramString1 == null) {
        paramString2 = null;
      }
      int i;
      do
      {
        return paramString2;
        i = paramString1.indexOf(paramString2);
        paramString2 = paramString1;
      } while (i < 0);
      return paramString1.substring(i);
    }
    
    public static String fM(String paramString1, String paramString2)
    {
      String str;
      if (paramString1 == null) {
        str = null;
      }
      do
      {
        return str;
        str = paramString1;
      } while (paramString1.equals(paramString2));
      return String.format("%s(%s)", new Object[] { paramString1, paramString2 });
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */