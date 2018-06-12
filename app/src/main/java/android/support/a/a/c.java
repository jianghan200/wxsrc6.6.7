package android.support.a.a;

import android.graphics.Path;
import java.util.ArrayList;

final class c
{
  private static float[] A(String paramString)
  {
    int i;
    if (paramString.charAt(0) == 'z')
    {
      i = 1;
      if (paramString.charAt(0) != 'Z') {
        break label39;
      }
    }
    label39:
    for (int j = 1;; j = 0)
    {
      if ((i | j) == 0) {
        break label44;
      }
      return new float[0];
      i = 0;
      break;
    }
    for (;;)
    {
      label44:
      int i1;
      int m;
      int n;
      try
      {
        float[] arrayOfFloat = new float[paramString.length()];
        a locala = new a((byte)0);
        int i2 = paramString.length();
        k = 1;
        j = 0;
        if (k < i2)
        {
          locala.jG = false;
          i = 0;
          i1 = 0;
          m = 0;
          n = k;
          if (n >= paramString.length()) {}
        }
        switch (paramString.charAt(n))
        {
        case '-': 
          if ((n == k) || (i != 0)) {
            break label309;
          }
          locala.jG = true;
          i = 0;
          m = 1;
          break label311;
          label192:
          locala.jG = true;
          i = 0;
          m = 1;
          break label311;
          locala.jF = n;
          m = locala.jF;
          if (k < m)
          {
            i = j + 1;
            arrayOfFloat[j] = Float.parseFloat(paramString.substring(k, m));
            if (!locala.jG) {
              break label351;
            }
            k = m;
            j = i;
            continue;
            arrayOfFloat = b(arrayOfFloat, j);
            return arrayOfFloat;
          }
          break;
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        throw new RuntimeException("error in parsing \"" + paramString + "\"", localNumberFormatException);
      }
      i = j;
      continue;
      label309:
      i = 0;
      for (;;)
      {
        label311:
        if (m != 0) {
          break label349;
        }
        n += 1;
        break;
        i = 0;
        m = 1;
        continue;
        if (i1 != 0) {
          break label192;
        }
        i = 0;
        i1 = 1;
        continue;
        i = 1;
      }
      label349:
      continue;
      label351:
      int k = m + 1;
      j = i;
    }
  }
  
  private static void a(ArrayList<b> paramArrayList, char paramChar, float[] paramArrayOfFloat)
  {
    paramArrayList.add(new b(paramChar, paramArrayOfFloat, (byte)0));
  }
  
  public static b[] a(b[] paramArrayOfb)
  {
    if (paramArrayOfb == null) {
      return null;
    }
    b[] arrayOfb = new b[paramArrayOfb.length];
    int i = 0;
    while (i < paramArrayOfb.length)
    {
      arrayOfb[i] = new b(paramArrayOfb[i], 0);
      i += 1;
    }
    return arrayOfb;
  }
  
  static float[] b(float[] paramArrayOfFloat, int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException();
    }
    int i = paramArrayOfFloat.length;
    if (i < 0) {
      throw new ArrayIndexOutOfBoundsException();
    }
    paramInt += 0;
    i = Math.min(paramInt, i + 0);
    float[] arrayOfFloat = new float[paramInt];
    System.arraycopy(paramArrayOfFloat, 0, arrayOfFloat, 0, i);
    return arrayOfFloat;
  }
  
  private static int f(String paramString, int paramInt)
  {
    for (;;)
    {
      if (paramInt < paramString.length())
      {
        int i = paramString.charAt(paramInt);
        if ((((i - 65) * (i - 90) > 0) && ((i - 97) * (i - 122) > 0)) || (i == 101) || (i == 69)) {}
      }
      else
      {
        return paramInt;
      }
      paramInt += 1;
    }
  }
  
  public static b[] z(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    int j = 1;
    int i = 0;
    while (j < paramString.length())
    {
      j = f(paramString, j);
      String str = paramString.substring(i, j).trim();
      if (str.length() > 0)
      {
        float[] arrayOfFloat = A(str);
        a(localArrayList, str.charAt(0), arrayOfFloat);
      }
      int k = j + 1;
      i = j;
      j = k;
    }
    if ((j - i == 1) && (i < paramString.length())) {
      a(localArrayList, paramString.charAt(i), new float[0]);
    }
    return (b[])localArrayList.toArray(new b[localArrayList.size()]);
  }
  
  private static final class a
  {
    int jF;
    boolean jG;
  }
  
  public static final class b
  {
    char jH;
    float[] jI;
    
    private b(char paramChar, float[] paramArrayOfFloat)
    {
      this.jH = paramChar;
      this.jI = paramArrayOfFloat;
    }
    
    private b(b paramb)
    {
      this.jH = paramb.jH;
      this.jI = c.b(paramb.jI, paramb.jI.length);
    }
    
    static void a(Path paramPath, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, boolean paramBoolean1, boolean paramBoolean2)
    {
      double d6;
      double d11;
      double d12;
      double d5;
      double d7;
      double d4;
      double d9;
      double d8;
      double d3;
      double d2;
      double d13;
      for (;;)
      {
        d6 = Math.toRadians(paramFloat7);
        d11 = Math.cos(d6);
        d12 = Math.sin(d6);
        d5 = (paramFloat1 * d11 + paramFloat2 * d12) / paramFloat5;
        d7 = (-paramFloat1 * d12 + paramFloat2 * d11) / paramFloat6;
        d1 = (paramFloat3 * d11 + paramFloat4 * d12) / paramFloat5;
        d4 = (-paramFloat3 * d12 + paramFloat4 * d11) / paramFloat6;
        d9 = d5 - d1;
        d8 = d7 - d4;
        d3 = (d5 + d1) / 2.0D;
        d2 = (d7 + d4) / 2.0D;
        d10 = d9 * d9 + d8 * d8;
        if (d10 == 0.0D) {
          return;
        }
        d13 = 1.0D / d10 - 0.25D;
        if (d13 >= 0.0D) {
          break;
        }
        float f = (float)(Math.sqrt(d10) / 1.99999D);
        paramFloat5 *= f;
        paramFloat6 *= f;
      }
      double d10 = Math.sqrt(d13);
      d9 *= d10;
      d8 *= d10;
      if (paramBoolean1 == paramBoolean2)
      {
        d3 -= d8;
        d2 = d9 + d2;
        label239:
        d5 = Math.atan2(d7 - d2, d5 - d3);
        d4 = Math.atan2(d4 - d2, d1 - d3) - d5;
        if (d4 < 0.0D) {
          break label713;
        }
        paramBoolean1 = true;
        label282:
        d1 = d4;
        if (paramBoolean2 != paramBoolean1) {
          if (d4 <= 0.0D) {
            break label719;
          }
        }
      }
      label713:
      label719:
      for (double d1 = d4 - 6.283185307179586D;; d1 = d4 + 6.283185307179586D)
      {
        d13 = d3 * paramFloat5;
        double d14 = d2 * paramFloat6;
        double d15 = paramFloat5;
        double d16 = paramFloat6;
        d4 = paramFloat1;
        d3 = paramFloat2;
        int j = (int)Math.ceil(Math.abs(4.0D * d1 / 3.141592653589793D));
        double d17 = Math.cos(d6);
        double d18 = Math.sin(d6);
        d6 = Math.cos(d5);
        d7 = Math.sin(d5);
        d2 = -d15 * d17 * d7 - d16 * d18 * d6;
        d6 = d6 * (d16 * d17) + d7 * (-d15 * d18);
        double d19 = d1 / j;
        int i = 0;
        d1 = d6;
        while (i < j)
        {
          d8 = d5 + d19;
          d10 = Math.sin(d8);
          double d20 = Math.cos(d8);
          d6 = d15 * d17 * d20 + (d13 * d11 - d14 * d12) - d16 * d18 * d10;
          d7 = d16 * d17 * d10 + (d15 * d18 * d20 + (d13 * d12 + d14 * d11));
          d9 = -d15 * d17 * d10 - d16 * d18 * d20;
          d10 = d10 * (-d15 * d18) + d20 * (d16 * d17);
          d20 = Math.tan((d8 - d5) / 2.0D);
          d5 = Math.sin(d8 - d5) * (Math.sqrt(d20 * (3.0D * d20) + 4.0D) - 1.0D) / 3.0D;
          paramPath.cubicTo((float)(d2 * d5 + d4), (float)(d1 * d5 + d3), (float)(d6 - d5 * d9), (float)(d7 - d5 * d10), (float)d6, (float)d7);
          d1 = d10;
          d2 = d9;
          d5 = d8;
          i += 1;
          d3 = d7;
          d4 = d6;
        }
        break;
        d3 = d8 + d3;
        d2 -= d9;
        break label239;
        paramBoolean1 = false;
        break label282;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/android/support/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */