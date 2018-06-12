package com.google.android.exoplayer2.a;

import com.google.android.exoplayer2.i.a;
import java.util.Arrays;

final class k
{
  float aex;
  short[] ahA;
  private int ahB;
  short[] ahC;
  private int ahD;
  private short[] ahE;
  private int ahF;
  private int ahG;
  int ahH;
  int ahI;
  int ahJ;
  int ahK;
  private int ahL;
  private int ahM;
  private int ahN;
  private int ahO;
  final int ahu;
  private final int ahv;
  private final int ahw;
  final int ahx;
  private final short[] ahy;
  private int ahz;
  float pitch;
  private final int sampleRate;
  
  public k(int paramInt1, int paramInt2)
  {
    this.sampleRate = paramInt1;
    this.ahu = paramInt2;
    this.ahv = (paramInt1 / 400);
    this.ahw = (paramInt1 / 65);
    this.ahx = (this.ahw * 2);
    this.ahy = new short[this.ahx];
    this.ahz = this.ahx;
    this.ahA = new short[this.ahx * paramInt2];
    this.ahB = this.ahx;
    this.ahC = new short[this.ahx * paramInt2];
    this.ahD = this.ahx;
    this.ahE = new short[this.ahx * paramInt2];
    this.ahF = 0;
    this.ahG = 0;
    this.ahL = 0;
    this.aex = 1.0F;
    this.pitch = 1.0F;
  }
  
  private int a(short[] paramArrayOfShort, int paramInt1, int paramInt2, int paramInt3)
  {
    int j = 255;
    int m = 1;
    int i2 = paramInt1 * this.ahu;
    int i = 0;
    int k = 0;
    paramInt1 = paramInt2;
    int n;
    int i1;
    if (paramInt1 <= paramInt3)
    {
      n = 0;
      paramInt2 = 0;
      while (n < paramInt1)
      {
        paramInt2 += Math.abs(paramArrayOfShort[(i2 + n)] - paramArrayOfShort[(i2 + paramInt1 + n)]);
        n += 1;
      }
      i1 = m;
      n = k;
      if (paramInt2 * k < m * paramInt1)
      {
        i1 = paramInt2;
        n = paramInt1;
      }
      if (paramInt2 * j <= i * paramInt1) {
        break label151;
      }
      j = paramInt1;
    }
    for (;;)
    {
      paramInt1 += 1;
      i = paramInt2;
      m = i1;
      k = n;
      break;
      this.ahN = (m / k);
      this.ahO = (i / j);
      return k;
      label151:
      paramInt2 = i;
    }
  }
  
  private static void a(int paramInt1, int paramInt2, short[] paramArrayOfShort1, int paramInt3, short[] paramArrayOfShort2, int paramInt4, short[] paramArrayOfShort3, int paramInt5)
  {
    int i = 0;
    while (i < paramInt2)
    {
      int n = paramInt3 * paramInt2 + i;
      int j = paramInt5 * paramInt2 + i;
      int m = paramInt4 * paramInt2 + i;
      int k = 0;
      while (k < paramInt1)
      {
        paramArrayOfShort1[n] = ((short)((paramArrayOfShort2[m] * (paramInt1 - k) + paramArrayOfShort3[j] * k) / paramInt1));
        n += paramInt2;
        m += paramInt2;
        j += paramInt2;
        k += 1;
      }
      i += 1;
    }
  }
  
  private void a(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    cd(paramInt2);
    System.arraycopy(paramArrayOfShort, this.ahu * paramInt1, this.ahC, this.ahI * this.ahu, this.ahu * paramInt2);
    this.ahI += paramInt2;
  }
  
  private void b(short[] paramArrayOfShort, int paramInt1, int paramInt2)
  {
    int k = this.ahx / paramInt2;
    int m = this.ahu * paramInt2;
    int n = this.ahu;
    paramInt2 = 0;
    while (paramInt2 < k)
    {
      int i = 0;
      int j = 0;
      while (i < m)
      {
        j += paramArrayOfShort[(paramInt2 * m + paramInt1 * n + i)];
        i += 1;
      }
      i = j / m;
      this.ahy[paramInt2] = ((short)i);
      paramInt2 += 1;
    }
  }
  
  private void cd(int paramInt)
  {
    if (this.ahI + paramInt > this.ahB)
    {
      this.ahB += this.ahB / 2 + paramInt;
      this.ahC = Arrays.copyOf(this.ahC, this.ahB * this.ahu);
    }
  }
  
  final void ce(int paramInt)
  {
    if (this.ahH + paramInt > this.ahz)
    {
      this.ahz += this.ahz / 2 + paramInt;
      this.ahA = Arrays.copyOf(this.ahA, this.ahz * this.ahu);
    }
  }
  
  final void jw()
  {
    int n = this.ahI;
    float f = this.aex / this.pitch;
    int i1;
    int k;
    int i;
    int j;
    label149:
    short[] arrayOfShort1;
    if ((f > 1.00001D) || (f < 0.99999D))
    {
      if (this.ahH >= this.ahx)
      {
        i1 = this.ahH;
        k = 0;
        do
        {
          if (this.ahK <= 0) {
            break;
          }
          i = Math.min(this.ahx, this.ahK);
          a(this.ahA, k, i);
          this.ahK -= i;
          i = k + i;
          k = i;
        } while (this.ahx + i <= i1);
        j = this.ahH - i;
        System.arraycopy(this.ahA, this.ahu * i, this.ahA, 0, this.ahu * j);
        this.ahH = j;
      }
      if (this.pitch == 1.0F) {
        break label1158;
      }
      f = this.pitch;
      if (this.ahI == n) {
        break label1158;
      }
      j = (int)(this.sampleRate / f);
      i = this.sampleRate;
      while ((j > 16384) || (i > 16384))
      {
        j /= 2;
        i /= 2;
      }
      arrayOfShort1 = this.ahA;
      if (this.sampleRate > 4000)
      {
        i = this.sampleRate / 4000;
        label236:
        if ((this.ahu != 1) || (i != 1)) {
          break label395;
        }
        i = a(arrayOfShort1, k, this.ahv, this.ahw);
      }
    }
    for (;;)
    {
      label266:
      j = this.ahN;
      int m = this.ahO;
      if ((j == 0) || (this.ahL == 0))
      {
        j = 0;
        label290:
        if (j == 0) {
          break label556;
        }
        j = this.ahL;
        label299:
        this.ahM = this.ahN;
        this.ahL = i;
        if (f <= 1.0D) {
          break label581;
        }
        arrayOfShort1 = this.ahA;
        if (f < 2.0F) {
          break label561;
        }
        i = (int)(j / (f - 1.0F));
        label339:
        cd(i);
        a(i, this.ahu, this.ahC, this.ahI, arrayOfShort1, k, arrayOfShort1, k + j);
        this.ahI += i;
        i = k + (i + j);
        break;
        i = 1;
        break label236;
        label395:
        b(arrayOfShort1, k, i);
        j = a(this.ahy, 0, this.ahv / i, this.ahw / i);
        if (i == 1) {
          break label1168;
        }
        j *= i;
        m = j - i * 4;
        j += i * 4;
        if (m >= this.ahv) {
          break label1162;
        }
      }
      label556:
      label561:
      label581:
      label1102:
      label1158:
      label1162:
      for (i = this.ahv;; i = m)
      {
        if (j > this.ahw) {
          j = this.ahw;
        }
        for (;;)
        {
          if (this.ahu == 1)
          {
            i = a(arrayOfShort1, k, i, j);
            break label266;
          }
          b(arrayOfShort1, k, 1);
          i = a(this.ahy, 0, i, j);
          break label266;
          if (m > j * 3)
          {
            j = 0;
            break label290;
          }
          if (j * 2 <= this.ahM * 3)
          {
            j = 0;
            break label290;
          }
          j = 1;
          break label290;
          j = i;
          break label299;
          this.ahK = ((int)(j * (2.0F - f) / (f - 1.0F)));
          i = j;
          break label339;
          arrayOfShort1 = this.ahA;
          if (f < 0.5F) {}
          for (i = (int)(j * f / (1.0F - f));; i = j)
          {
            cd(j + i);
            System.arraycopy(arrayOfShort1, this.ahu * k, this.ahC, this.ahI * this.ahu, this.ahu * j);
            a(i, this.ahu, this.ahC, this.ahI + j, arrayOfShort1, k + j, arrayOfShort1, k);
            this.ahI += j + i;
            i = k + i;
            break;
            this.ahK = ((int)(j * (2.0F * f - 1.0F) / (1.0F - f)));
          }
          a(this.ahA, 0, this.ahH);
          this.ahH = 0;
          break label149;
          k = this.ahI - n;
          if (this.ahJ + k > this.ahD)
          {
            this.ahD += this.ahD / 2 + k;
            this.ahE = Arrays.copyOf(this.ahE, this.ahD * this.ahu);
          }
          System.arraycopy(this.ahC, this.ahu * n, this.ahE, this.ahJ * this.ahu, this.ahu * k);
          this.ahI = n;
          this.ahJ = (k + this.ahJ);
          k = 0;
          if (k < this.ahJ - 1)
          {
            while ((this.ahF + 1) * j > this.ahG * i)
            {
              cd(1);
              m = 0;
              while (m < this.ahu)
              {
                arrayOfShort1 = this.ahC;
                n = this.ahI;
                i1 = this.ahu;
                short[] arrayOfShort2 = this.ahE;
                int i3 = this.ahu * k + m;
                int i2 = arrayOfShort2[i3];
                i3 = arrayOfShort2[(i3 + this.ahu)];
                int i6 = this.ahG;
                int i4 = this.ahF;
                int i5 = (this.ahF + 1) * j;
                i6 = i5 - i6 * i;
                i4 = i5 - i4 * j;
                arrayOfShort1[(n * i1 + m)] = ((short)((i3 * (i4 - i6) + i2 * i6) / i4));
                m += 1;
              }
              this.ahG += 1;
              this.ahI += 1;
            }
            this.ahF += 1;
            if (this.ahF == i)
            {
              this.ahF = 0;
              if (this.ahG != j) {
                break label1102;
              }
            }
            for (boolean bool = true;; bool = false)
            {
              a.ap(bool);
              this.ahG = 0;
              k += 1;
              break;
            }
          }
          i = this.ahJ - 1;
          if (i != 0)
          {
            System.arraycopy(this.ahE, this.ahu * i, this.ahE, 0, (this.ahJ - i) * this.ahu);
            this.ahJ -= i;
          }
          return;
        }
      }
      label1168:
      i = j;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */