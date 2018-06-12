package com.google.android.gms.c;

import java.util.List;

public abstract class ay<M extends ay<M>>
  extends be
{
  protected ba aZY;
  
  private M qG()
  {
    ay localay = (ay)super.qH();
    bc.a(this, localay);
    return localay;
  }
  
  public void a(ax paramax)
  {
    if (this.aZY == null) {}
    for (;;)
    {
      return;
      int i = 0;
      while (i < this.aZY.size())
      {
        this.aZY.dM(i).a(paramax);
        i += 1;
      }
    }
  }
  
  protected final boolean a(aw paramaw, int paramInt)
  {
    int i = paramaw.getPosition();
    if (!paramaw.dA(paramInt)) {
      return false;
    }
    int j = bh.dP(paramInt);
    int k = paramaw.getPosition() - i;
    bg localbg;
    label69:
    Object localObject;
    if (k == 0)
    {
      paramaw = bh.bas;
      localbg = new bg(paramInt, paramaw);
      if (this.aZY != null) {
        break label162;
      }
      this.aZY = new ba();
      paramaw = null;
      localObject = paramaw;
      if (paramaw == null)
      {
        paramaw = new bb();
        localObject = this.aZY;
        paramInt = ((ba)localObject).dN(j);
        if (paramInt < 0) {
          break label205;
        }
        ((ba)localObject).bae[paramInt] = paramaw;
        localObject = paramaw;
      }
    }
    for (;;)
    {
      ((bb)localObject).bah.add(localbg);
      return true;
      localObject = new byte[k];
      int m = paramaw.aZO;
      System.arraycopy(paramaw.buffer, i + m, localObject, 0, k);
      paramaw = (aw)localObject;
      break;
      label162:
      paramaw = this.aZY;
      paramInt = paramaw.dN(j);
      if ((paramInt < 0) || (paramaw.bae[paramInt] == ba.bab))
      {
        paramaw = null;
        break label69;
      }
      paramaw = paramaw.bae[paramInt];
      break label69;
      label205:
      i = paramInt ^ 0xFFFFFFFF;
      if ((i < ((ba)localObject).fi) && (localObject.bae[i] == ba.bab))
      {
        ((ba)localObject).bad[i] = j;
        ((ba)localObject).bae[i] = paramaw;
        localObject = paramaw;
      }
      else
      {
        paramInt = i;
        if (((ba)localObject).bac)
        {
          paramInt = i;
          if (((ba)localObject).fi >= ((ba)localObject).bad.length)
          {
            ((ba)localObject).gc();
            paramInt = ((ba)localObject).dN(j) ^ 0xFFFFFFFF;
          }
        }
        if (((ba)localObject).fi >= ((ba)localObject).bad.length)
        {
          i = ba.ad(((ba)localObject).fi + 1);
          int[] arrayOfInt = new int[i];
          bb[] arrayOfbb = new bb[i];
          System.arraycopy(((ba)localObject).bad, 0, arrayOfInt, 0, ((ba)localObject).bad.length);
          System.arraycopy(((ba)localObject).bae, 0, arrayOfbb, 0, ((ba)localObject).bae.length);
          ((ba)localObject).bad = arrayOfInt;
          ((ba)localObject).bae = arrayOfbb;
        }
        if (((ba)localObject).fi - paramInt != 0)
        {
          System.arraycopy(((ba)localObject).bad, paramInt, ((ba)localObject).bad, paramInt + 1, ((ba)localObject).fi - paramInt);
          System.arraycopy(((ba)localObject).bae, paramInt, ((ba)localObject).bae, paramInt + 1, ((ba)localObject).fi - paramInt);
        }
        ((ba)localObject).bad[paramInt] = j;
        ((ba)localObject).bae[paramInt] = paramaw;
        ((ba)localObject).fi += 1;
        localObject = paramaw;
      }
    }
  }
  
  protected final boolean a(M paramM)
  {
    if ((this.aZY == null) || (this.aZY.isEmpty())) {
      return (paramM.aZY == null) || (paramM.aZY.isEmpty());
    }
    return this.aZY.equals(paramM.aZY);
  }
  
  protected int pU()
  {
    if (this.aZY != null)
    {
      int j = 0;
      for (int i = 0;; i = k + i)
      {
        k = i;
        if (j >= this.aZY.size()) {
          break;
        }
        k = this.aZY.dM(j).pU();
        j += 1;
      }
    }
    int k = 0;
    return k;
  }
  
  protected final int qF()
  {
    if ((this.aZY == null) || (this.aZY.isEmpty())) {
      return 0;
    }
    return this.aZY.hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/google/android/gms/c/ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */