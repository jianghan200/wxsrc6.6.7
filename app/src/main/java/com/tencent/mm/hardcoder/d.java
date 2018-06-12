package com.tencent.mm.hardcoder;

import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class d
{
  private static a dkX = null;
  
  public static void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4)
  {
    if (dkX != null) {
      dkX.a(paramInt1, paramLong, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public static void a(a.a parama)
  {
    int i1 = (int)(parama.dkw - parama.dkg);
    int j;
    int k;
    label28:
    int i2;
    int m;
    label46:
    int i3;
    long l1;
    int i4;
    int i5;
    int[] arrayOfInt1;
    int i6;
    int i7;
    int i;
    if (HardCoderJNI.hcEnable)
    {
      j = 1;
      if (!HardCoderJNI.isHCEnable()) {
        break label232;
      }
      k = 1;
      i2 = HardCoderJNI.isRunning();
      if (i1 - parama.delay > 0) {
        break label237;
      }
      m = 1;
      i3 = parama.scene;
      l1 = parama.dkf;
      i4 = parama.dkc;
      i5 = parama.dkd;
      arrayOfInt1 = parama.dkn;
      i6 = (int)(parama.dkh - parama.startTime);
      i7 = parama.dkr;
      i = 0;
      if (parama.dkt != null) {
        i = (int)(0L + parama.dkt.dlh);
      }
      if (parama.dku == null) {
        break label648;
      }
      i = (int)(i + parama.dku.dlh);
    }
    label232:
    label237:
    label648:
    for (;;)
    {
      int i8 = HardCoderJNI.TICK_RATE;
      long l2 = parama.dks;
      int[] arrayOfInt2 = parama.dkl;
      int[] arrayOfInt3 = parama.dkm;
      StringBuilder localStringBuilder1 = new StringBuilder();
      int i9;
      int n;
      int i10;
      if (arrayOfInt1 != null)
      {
        i9 = arrayOfInt1.length;
        n = 0;
        for (;;)
        {
          if (n < i9)
          {
            i10 = arrayOfInt1[n];
            localStringBuilder1.append(i10 + "#");
            n += 1;
            continue;
            j = 0;
            break;
            k = 0;
            break label28;
            m = 0;
            break label46;
          }
        }
      }
      StringBuilder localStringBuilder2 = new StringBuilder();
      if (arrayOfInt2 != null)
      {
        i9 = arrayOfInt2.length;
        n = 0;
        while (n < i9)
        {
          i10 = arrayOfInt2[n];
          localStringBuilder2.append(i10 + "#");
          n += 1;
        }
      }
      StringBuilder localStringBuilder3 = new StringBuilder();
      if (arrayOfInt3 != null)
      {
        i9 = arrayOfInt3.length;
        n = 0;
        while (n < i9)
        {
          i10 = arrayOfInt3[n];
          localStringBuilder3.append(i10 + "#");
          n += 1;
        }
      }
      if ((parama.dke != 0) && (HardCoderJNI.hcDebug)) {
        x.i("MicroMsg.HardCoderReporter", "[oneliang]performance report,hash:%s,threadId:%s,enable:%s, speedUp:%s,engineStatus:%s,cancelInDelay:%s,scene:%s,action:%s,lastCpuLevel:%s,cpuLevel:%s,lastIoLevel:%s,ioLevel:%s,bindCoreIds:%s,executeTime:%s,runtime:%s,threadJiffies:%s, phonePower:%s, phoneHZ:%s, processJiffies:%s,cpuLevelTimeArray:%s, ioLevelTimeArray:%s", new Object[] { Integer.valueOf(parama.hashCode()), Integer.valueOf(parama.dke), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i2), Integer.valueOf(m), Integer.valueOf(i3), Long.valueOf(l1), Integer.valueOf(parama.dkj), Integer.valueOf(i4), Integer.valueOf(parama.dkk), Integer.valueOf(i5), localStringBuilder1.toString(), Integer.valueOf(i6), Integer.valueOf(i1), Integer.valueOf(i7), Integer.valueOf(i), Integer.valueOf(i8), Long.valueOf(l2), localStringBuilder2.toString(), localStringBuilder3.toString() });
      }
      if (dkX != null) {
        dkX.a(parama.dke, j, k, i2, m, i3, l1, i4, i5, arrayOfInt1, i6, i1, i7, i, i8, l2, arrayOfInt2, arrayOfInt3);
      }
      return;
    }
  }
  
  public static void a(b.a parama)
  {
    if (dkX != null) {
      dkX.a(parama.scene, parama.dkf, parama.type, parama.dkA, parama.dkB);
    }
  }
  
  public static void a(a parama)
  {
    if (dkX == null)
    {
      x.i("MicroMsg.HardCoderReporter", "hardcoder setReporter[%s], stack[%s]", new Object[] { parama, bi.cjd() });
      dkX = parama;
    }
  }
  
  public static void reportIDKey(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    if (dkX != null) {
      dkX.reportIDKey(paramBoolean1, paramInt1, paramInt2, paramBoolean2);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, long paramLong1, int paramInt7, int paramInt8, int[] paramArrayOfInt1, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, long paramLong2, int[] paramArrayOfInt2, int[] paramArrayOfInt3);
    
    public abstract void a(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4);
    
    public abstract void a(int paramInt1, long paramLong1, int paramInt2, long paramLong2, long paramLong3);
    
    public abstract void reportIDKey(boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/hardcoder/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */