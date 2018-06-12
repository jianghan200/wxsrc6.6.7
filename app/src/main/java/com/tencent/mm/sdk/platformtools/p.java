package com.tencent.mm.sdk.platformtools;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class p
{
  private static final Pattern sFM = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
  private static final Pattern sFN = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
  private static final Pattern sFO = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
  
  public static InetAddress Wh(String paramString)
  {
    if (isIPv4Address(paramString)) {
      return InetAddress.getByName(paramString);
    }
    if (isIPv6Address(paramString)) {
      return InetAddress.getByName(paramString);
    }
    throw new UnknownHostException("invalid ipv4 or ipv6 dotted string");
  }
  
  public static boolean isIPv4Address(String paramString)
  {
    return sFM.matcher(paramString).matches();
  }
  
  public static boolean isIPv6Address(String paramString)
  {
    return (sFN.matcher(paramString).matches()) || (sFO.matcher(paramString).matches());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/sdk/platformtools/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */