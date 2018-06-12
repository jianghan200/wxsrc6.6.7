package com.tencent.mm.sdk.platformtools;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ap
{
  public static aq sHS = null;
  
  public static String Fp(String paramString)
  {
    return fO(paramString, null);
  }
  
  public static String Wv(String paramString)
  {
    if (bi.oW(paramString)) {}
    while (!bi.Xd(paramString).booleanValue()) {
      return paramString;
    }
    new ap();
    String str1 = "86";
    Object localObject = paramString;
    if (paramString.startsWith("+"))
    {
      String str2 = paramString.replace("+", "");
      paramString = fO(str2, null);
      str1 = paramString;
      localObject = str2;
      if (paramString != null)
      {
        localObject = str2.substring(paramString.length());
        str1 = paramString;
      }
    }
    return formatNumber(str1, (String)localObject);
  }
  
  public static String Ww(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return paramString.replaceAll("[\\.\\-\\ ]", "").trim();
  }
  
  public static String Wx(String paramString)
  {
    if (bi.oW(paramString)) {
      return "";
    }
    return paramString.replace("+", "");
  }
  
  public static String Wy(String paramString)
  {
    String str;
    if (bi.oW(paramString)) {
      str = "";
    }
    do
    {
      return str;
      str = paramString;
    } while (paramString.startsWith("+"));
    return "+" + paramString;
  }
  
  private static String ao(String paramString1, String paramString2, String paramString3)
  {
    paramString1 = Pattern.compile(paramString1).matcher(paramString3);
    if (paramString1.find()) {
      paramString3 = paramString1.replaceAll(paramString2);
    }
    return paramString3;
  }
  
  private static int cW(String paramString, int paramInt)
  {
    Pattern localPattern = Pattern.compile(paramString);
    paramString = "1";
    int i = 0;
    while ((i < paramInt) && (!localPattern.matcher(paramString).find()))
    {
      paramString = paramString + "1";
      i += 1;
    }
    return i + 1;
  }
  
  public static String fO(String paramString1, String paramString2)
  {
    paramString1 = Ww(paramString1).replace("+", "");
    if (sHS == null) {
      sHS = new aq();
    }
    int i;
    if (bi.oW(paramString2))
    {
      paramString2 = sHS.sHT.iterator();
      do
      {
        do
        {
          if (!paramString2.hasNext()) {
            break;
          }
          localObject = (aq.a)paramString2.next();
        } while (!paramString1.startsWith(((aq.a)localObject).sHV));
        i = paramString1.length() - ((aq.a)localObject).sHV.length();
      } while ((i < ((aq.a)localObject).sHW) || (i > ((aq.a)localObject).sHX));
      x.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { ((aq.a)localObject).sHV, ((aq.a)localObject).sHU, Integer.valueOf(((aq.a)localObject).sHX), Integer.valueOf(((aq.a)localObject).sHX) });
      return ((aq.a)localObject).sHV;
    }
    Object localObject = sHS.sHT.iterator();
    while (((Iterator)localObject).hasNext())
    {
      aq.a locala = (aq.a)((Iterator)localObject).next();
      if (paramString1.startsWith(locala.sHV))
      {
        i = paramString1.length() - locala.sHV.length();
        if ((i >= locala.sHW) && (i <= locala.sHX) && (paramString2.equalsIgnoreCase(locala.sHU)))
        {
          x.i("MicroMsg.PhoneFormater", "[extractCountryCode] countrycode:%s country isocode: %s country.minlen:%d country.maxlen:%d", new Object[] { locala.sHV, locala.sHU, Integer.valueOf(locala.sHX), Integer.valueOf(locala.sHX) });
          return locala.sHV;
        }
      }
    }
    return null;
  }
  
  public static String fP(String paramString1, String paramString2)
  {
    if ((bi.oW(paramString1)) || (bi.oW(paramString2))) {
      return "";
    }
    return paramString1 + "（+" + paramString2 + "）";
  }
  
  public static String formatNumber(String paramString1, String paramString2)
  {
    Object localObject;
    if ((bi.oW(paramString1)) || (bi.oW(paramString2)))
    {
      localObject = paramString2;
      return (String)localObject;
    }
    if (sHS == null) {
      sHS = new aq();
    }
    Iterator localIterator1 = sHS.sHT.iterator();
    aq.a locala;
    String str;
    int n;
    int k;
    label371:
    label520:
    do
    {
      StringBuffer localStringBuffer;
      do
      {
        Iterator localIterator2;
        while (!localIterator2.hasNext())
        {
          do
          {
            if (!localIterator1.hasNext()) {
              break;
            }
            locala = (aq.a)localIterator1.next();
          } while ((locala.sHV == null) || (!paramString1.trim().toLowerCase().equals(locala.sHV.trim().toLowerCase())) || (locala.sHY == null));
          str = Ww(paramString2);
          if (str != null)
          {
            localObject = str;
            if (str.length() > locala.sHW) {
              break;
            }
          }
          localIterator2 = locala.sHY.iterator();
        }
        localObject = (aq.b)localIterator2.next();
        if (!bi.oW(((aq.b)localObject).sHZ)) {
          break label520;
        }
        if (locala.sHY.size() <= 1) {
          break label371;
        }
        localStringBuffer = new StringBuffer();
        localStringBuffer.append(str);
        m = str.length();
      } while (m > cW(((aq.b)localObject).sIb, locala.sHX));
      while (localStringBuffer.toString().length() < locala.sHX) {
        localStringBuffer.append("0");
      }
      paramString1 = ao(((aq.b)localObject).sIb, ((aq.b)localObject).sIa, localStringBuffer.toString());
      i = 0;
      j = 0;
      for (;;)
      {
        localObject = paramString1;
        if (i >= paramString1.length()) {
          break;
        }
        n = paramString1.charAt(i);
        paramString2 = paramString1;
        if (j >= m) {
          paramString2 = paramString1.substring(0, i);
        }
        k = j;
        if (n != 32)
        {
          k = j;
          if (n != 45)
          {
            k = j;
            if (n != 12290) {
              k = j + 1;
            }
          }
        }
        i += 1;
        j = k;
        paramString1 = paramString2;
      }
      paramString1 = new StringBuffer();
      paramString1.append(str);
      m = str.length();
      while (paramString1.toString().length() < locala.sHX) {
        paramString1.append("0");
      }
      paramString1 = ao(((aq.b)localObject).sIb, ((aq.b)localObject).sIa, paramString1.toString());
      i = 0;
      j = 0;
      while (i < paramString1.length())
      {
        n = paramString1.charAt(i);
        paramString2 = paramString1;
        if (j >= m) {
          paramString2 = paramString1.substring(0, i);
        }
        k = j;
        if (n != 32)
        {
          k = j;
          if (n != 45)
          {
            k = j;
            if (n != 12290) {
              k = j + 1;
            }
          }
        }
        i += 1;
        j = k;
        paramString1 = paramString2;
      }
      return paramString1;
    } while (!Pattern.compile(((aq.b)localObject).sHZ).matcher(str).lookingAt());
    paramString1 = new StringBuffer();
    paramString1.append(str);
    int m = str.length();
    while (paramString1.toString().length() < locala.sHX) {
      paramString1.append(str.charAt(m - 1));
    }
    paramString1 = ao(((aq.b)localObject).sIb, ((aq.b)localObject).sIa, paramString1.toString());
    int i = 0;
    int j = 0;
    for (;;)
    {
      localObject = paramString1;
      if (i >= paramString1.length()) {
        break;
      }
      n = paramString1.charAt(i);
      paramString2 = paramString1;
      if (j >= m) {
        paramString2 = paramString1.substring(0, i);
      }
      k = j;
      if (n != 32)
      {
        k = j;
        if (n != 45)
        {
          k = j;
          if (n != 12290) {
            k = j + 1;
          }
        }
      }
      i += 1;
      j = k;
      paramString1 = paramString2;
    }
    return paramString2;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/sdk/platformtools/ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */