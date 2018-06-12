package com.google.android.exoplayer2.c.b;

import com.google.android.exoplayer2.c.k.a;
import com.google.android.exoplayer2.i.a;

public final class f
{
  public final boolean amj;
  public final String amk;
  public final k.a aml;
  public final int amm;
  public final byte[] amn;
  
  public f(boolean paramBoolean, String paramString, int paramInt1, byte[] paramArrayOfByte1, int paramInt2, int paramInt3, byte[] paramArrayOfByte2)
  {
    int i;
    int j;
    if (paramInt1 == 0)
    {
      i = 1;
      if (paramArrayOfByte2 != null) {
        break label88;
      }
      j = 1;
      label25:
      a.ao(j ^ i);
      this.amj = paramBoolean;
      this.amk = paramString;
      this.amm = paramInt1;
      this.amn = paramArrayOfByte2;
      if (paramString != null) {
        break label94;
      }
      i = k;
    }
    for (;;)
    {
      label62:
      this.aml = new k.a(i, paramArrayOfByte1, paramInt2, paramInt3);
      return;
      i = 0;
      break;
      label88:
      j = 0;
      break label25;
      label94:
      switch (paramString.hashCode())
      {
      default: 
        label140:
        paramInt1 = -1;
      }
      for (;;)
      {
        i = k;
        switch (paramInt1)
        {
        case 0: 
        case 1: 
        default: 
          new StringBuilder("Unsupported protection scheme type '").append(paramString).append("'. Assuming AES-CTR crypto mode.");
          i = k;
          break label62;
          if (!paramString.equals("cenc")) {
            break label140;
          }
          paramInt1 = m;
          continue;
          if (!paramString.equals("cens")) {
            break label140;
          }
          paramInt1 = 1;
          continue;
          if (!paramString.equals("cbc1")) {
            break label140;
          }
          paramInt1 = 2;
          continue;
          if (!paramString.equals("cbcs")) {
            break label140;
          }
          paramInt1 = 3;
        }
      }
      i = 2;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/c/b/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */