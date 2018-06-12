package org.a.a.a;

import java.io.File;

public final class a
{
  public static final String vKi = Character.toString('.');
  private static final char vKj;
  private static final char vKk = '\\';
  
  static
  {
    char c = File.separatorChar;
    vKj = c;
    if (c == '\\') {}
    for (int i = 1; i != 0; i = 0)
    {
      vKk = '/';
      return;
    }
  }
  
  private static String adO(String paramString)
  {
    int i = vKj;
    if (paramString == null) {
      localObject = null;
    }
    int m;
    do
    {
      return (String)localObject;
      adR(paramString);
      m = paramString.length();
      localObject = paramString;
    } while (m == 0);
    int i3 = adP(paramString);
    if (i3 < 0) {
      return null;
    }
    Object localObject = new char[m + 2];
    paramString.getChars(0, paramString.length(), (char[])localObject, 0);
    if (i == vKj) {}
    int k;
    for (int j = vKk;; j = vKj)
    {
      k = 0;
      while (k < localObject.length)
      {
        if (localObject[k] == j) {
          localObject[k] = i;
        }
        k += 1;
      }
    }
    if (localObject[(m - 1)] != i)
    {
      j = m + 1;
      localObject[m] = i;
      k = 0;
      m = j;
    }
    for (j = k;; j = 1)
    {
      k = i3 + 1;
      int n;
      while (k < m)
      {
        n = m;
        i1 = k;
        if (localObject[k] == i)
        {
          n = m;
          i1 = k;
          if (localObject[(k - 1)] == i)
          {
            System.arraycopy(localObject, k, localObject, k - 1, m - k);
            n = m - 1;
            i1 = k - 1;
          }
        }
        k = i1 + 1;
        m = n;
      }
      k = i3 + 1;
      int i2;
      while (k < m)
      {
        i2 = j;
        n = m;
        i1 = k;
        if (localObject[k] == i)
        {
          i2 = j;
          n = m;
          i1 = k;
          if (localObject[(k - 1)] == '.') {
            if (k != i3 + 1)
            {
              i2 = j;
              n = m;
              i1 = k;
              if (localObject[(k - 2)] != i) {}
            }
            else
            {
              if (k == m - 1) {
                j = 1;
              }
              System.arraycopy(localObject, k + 1, localObject, k - 1, m - k);
              n = m - 2;
              i1 = k - 1;
              i2 = j;
            }
          }
        }
        k = i1 + 1;
        j = i2;
        m = n;
      }
      k = i3 + 2;
      int i1 = m;
      if (k < i1)
      {
        i2 = j;
        m = i1;
        n = k;
        if (localObject[k] == i)
        {
          i2 = j;
          m = i1;
          n = k;
          if (localObject[(k - 1)] == '.')
          {
            i2 = j;
            m = i1;
            n = k;
            if (localObject[(k - 2)] == '.') {
              if (k != i3 + 2)
              {
                i2 = j;
                m = i1;
                n = k;
                if (localObject[(k - 3)] != i) {}
              }
              else
              {
                if (k == i3 + 2) {
                  return null;
                }
                if (k == i1 - 1) {
                  j = 1;
                }
                m = k - 4;
                label484:
                if (m < i3) {
                  break label562;
                }
                if (localObject[m] != i) {
                  break label553;
                }
                System.arraycopy(localObject, k + 1, localObject, m + 1, i1 - k);
                k = i1 - (k - m);
                n = m + 1;
                m = k;
              }
            }
          }
        }
        for (i2 = j;; i2 = j)
        {
          k = n + 1;
          j = i2;
          i1 = m;
          break;
          label553:
          m -= 1;
          break label484;
          label562:
          System.arraycopy(localObject, k + 1, localObject, i3, i1 - k);
          m = i1 - (k + 1 - i3);
          n = i3 + 1;
        }
      }
      if (i1 <= 0) {
        return "";
      }
      if (i1 <= i3) {
        return new String((char[])localObject, 0, i1);
      }
      if (j != 0) {
        return new String((char[])localObject, 0, i1);
      }
      return new String((char[])localObject, 0, i1 - 1);
    }
  }
  
  private static int adP(String paramString)
  {
    int j = 0;
    int i;
    if (paramString == null) {
      i = -1;
    }
    char c1;
    do
    {
      int m;
      do
      {
        do
        {
          return i;
          m = paramString.length();
          i = j;
        } while (m == 0);
        c1 = paramString.charAt(0);
        if (c1 == ':') {
          return -1;
        }
        if (m != 1) {
          break;
        }
        if (c1 == '~') {
          return 2;
        }
        i = j;
      } while (!isSeparator(c1));
      return 1;
      int k;
      if (c1 == '~')
      {
        k = paramString.indexOf('/', 1);
        j = paramString.indexOf('\\', 1);
        if ((k == -1) && (j == -1)) {
          return m + 1;
        }
        i = k;
        if (k == -1) {
          i = j;
        }
        k = j;
        if (j == -1) {
          k = i;
        }
        return Math.min(i, k) + 1;
      }
      char c2 = paramString.charAt(1);
      if (c2 == ':')
      {
        i = Character.toUpperCase(c1);
        if ((i >= 65) && (i <= 90))
        {
          if ((m == 2) || (!isSeparator(paramString.charAt(2)))) {
            return 2;
          }
          return 3;
        }
        if (i == 47) {
          return 1;
        }
        return -1;
      }
      if ((isSeparator(c1)) && (isSeparator(c2)))
      {
        i = paramString.indexOf('/', 2);
        j = paramString.indexOf('\\', 2);
        if (((i == -1) && (j == -1)) || (i == 2) || (j == 2)) {
          return -1;
        }
        if (i == -1) {
          i = j;
        }
        for (;;)
        {
          k = j;
          if (j == -1) {
            k = i;
          }
          return Math.min(i, k) + 1;
        }
      }
      i = j;
    } while (!isSeparator(c1));
    return 1;
  }
  
  private static int adQ(String paramString)
  {
    if (paramString == null) {
      return -1;
    }
    return Math.max(paramString.lastIndexOf('/'), paramString.lastIndexOf('\\'));
  }
  
  private static void adR(String paramString)
  {
    int j = paramString.length();
    int i = 0;
    while (i < j)
    {
      if (paramString.charAt(i) == 0) {
        throw new IllegalArgumentException("Null byte present in file/path name. There are no known legitimate use cases for such data, but several injection attacks may use it");
      }
      i += 1;
    }
  }
  
  public static String adS(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    int i;
    if (paramString == null) {
      i = -1;
    }
    while (i == -1)
    {
      return "";
      int j = paramString.lastIndexOf('.');
      i = j;
      if (adQ(paramString) > j) {
        i = -1;
      }
    }
    return paramString.substring(i + 1);
  }
  
  public static String gB(String paramString1, String paramString2)
  {
    int i = adP(paramString2);
    if (i < 0) {}
    do
    {
      return null;
      if (i > 0) {
        return adO(paramString2);
      }
    } while (paramString1 == null);
    i = paramString1.length();
    if (i == 0) {
      return adO(paramString2);
    }
    if (isSeparator(paramString1.charAt(i - 1))) {
      return adO(paramString1 + paramString2);
    }
    return adO(paramString1 + '/' + paramString2);
  }
  
  public static String getName(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    adR(paramString);
    return paramString.substring(adQ(paramString) + 1);
  }
  
  private static boolean isSeparator(char paramChar)
  {
    return (paramChar == '/') || (paramChar == '\\');
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/org/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */