package com.google.android.exoplayer2.h;

import android.os.Handler;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.b;
import com.google.android.exoplayer2.i.n;
import com.google.android.exoplayer2.i.n.a;
import java.util.ArrayList;
import java.util.Collections;

public final class k
  implements d, t<Object>
{
  private final d.a aAT;
  private final n aAU;
  private final b aAV;
  private int aAW;
  private long aAX;
  private long aAY;
  private long aAZ;
  private long aBa;
  private long aBb;
  private final Handler acJ;
  
  public k()
  {
    this(null, null);
  }
  
  public k(Handler paramHandler, d.a parama)
  {
    this(paramHandler, parama, (byte)0);
  }
  
  private k(Handler paramHandler, d.a parama, byte paramByte)
  {
    this(paramHandler, parama, b.aBU);
  }
  
  private k(Handler paramHandler, d.a parama, b paramb)
  {
    this.acJ = paramHandler;
    this.aAT = parama;
    this.aAU = new n();
    this.aAV = paramb;
    this.aBb = -1L;
  }
  
  public final void cW(int paramInt)
  {
    try
    {
      this.aAY += paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void lS()
  {
    try
    {
      if (this.aAW == 0) {
        this.aAX = this.aAV.elapsedRealtime();
      }
      this.aAW += 1;
      return;
    }
    finally {}
  }
  
  public final void lT()
  {
    long l2;
    int k;
    float f;
    Object localObject4;
    int i;
    int j;
    label340:
    Object localObject3;
    for (;;)
    {
      try
      {
        if (this.aAW > 0)
        {
          bool = true;
          a.ap(bool);
          l2 = this.aAV.elapsedRealtime();
          k = (int)(l2 - this.aAX);
          this.aAZ += k;
          this.aBa += this.aAY;
          if (k <= 0) {
            break label512;
          }
          f = (float)(this.aAY * 8000L / k);
          localObject4 = this.aAU;
          i = (int)Math.sqrt(this.aAY);
          if (((n)localObject4).aCz != 1)
          {
            Collections.sort(((n)localObject4).aCx, n.aCu);
            ((n)localObject4).aCz = 1;
          }
          if (((n)localObject4).aCC <= 0) {
            break label340;
          }
          Object localObject1 = ((n)localObject4).aCy;
          j = ((n)localObject4).aCC - 1;
          ((n)localObject4).aCC = j;
          localObject1 = localObject1[j];
          j = ((n)localObject4).aCA;
          ((n)localObject4).aCA = (j + 1);
          ((n.a)localObject1).index = j;
          ((n.a)localObject1).weight = i;
          ((n.a)localObject1).value = f;
          ((n)localObject4).aCx.add(localObject1);
          ((n)localObject4).aCB += i;
          if (((n)localObject4).aCB <= ((n)localObject4).aCw) {
            break;
          }
          i = ((n)localObject4).aCB - ((n)localObject4).aCw;
          localObject1 = (n.a)((n)localObject4).aCx.get(0);
          if (((n.a)localObject1).weight > i) {
            break label353;
          }
          ((n)localObject4).aCB -= ((n.a)localObject1).weight;
          ((n)localObject4).aCx.remove(0);
          if (((n)localObject4).aCC >= 5) {
            continue;
          }
          n.a[] arrayOfa = ((n)localObject4).aCy;
          i = ((n)localObject4).aCC;
          ((n)localObject4).aCC = (i + 1);
          arrayOfa[i] = localObject1;
          continue;
        }
        boolean bool = false;
      }
      finally {}
      continue;
      localObject3 = new n.a((byte)0);
      continue;
      label353:
      ((n.a)localObject3).weight -= i;
      ((n)localObject4).aCB -= i;
    }
    if ((this.aAZ >= 2000L) || (this.aBa >= 524288L))
    {
      localObject3 = this.aAU;
      if (((n)localObject3).aCz != 0)
      {
        Collections.sort(((n)localObject3).aCx, n.aCv);
        ((n)localObject3).aCz = 0;
      }
      f = ((n)localObject3).aCB;
      i = 0;
      j = 0;
      if (i >= ((n)localObject3).aCx.size()) {
        break label597;
      }
      localObject4 = (n.a)((n)localObject3).aCx.get(i);
      j = ((n.a)localObject4).weight + j;
      if (j < 0.5F * f) {
        break label590;
      }
      f = ((n.a)localObject4).value;
      label494:
      if (!Float.isNaN(f)) {
        break label642;
      }
    }
    label512:
    label590:
    label597:
    label642:
    for (long l1 = -1L;; l1 = f)
    {
      this.aBb = l1;
      l1 = this.aAY;
      long l3 = this.aBb;
      if ((this.acJ != null) && (this.aAT != null)) {
        this.acJ.post(new k.1(this, k, l1, l3));
      }
      i = this.aAW - 1;
      this.aAW = i;
      if (i > 0) {
        this.aAX = l2;
      }
      this.aAY = 0L;
      return;
      i += 1;
      break;
      if (((n)localObject3).aCx.isEmpty())
      {
        f = NaN.0F;
        break label494;
      }
      f = ((n.a)((n)localObject3).aCx.get(((n)localObject3).aCx.size() - 1)).value;
      break label494;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/exoplayer2/h/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */