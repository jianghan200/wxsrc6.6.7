package com.google.android.exoplayer2.c.c;

import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.i;
import com.google.android.exoplayer2.i.j;
import java.util.Arrays;
import java.util.Collections;

public final class d
  implements h
{
  private static final byte[] amT = { 73, 68, 51 };
  private final String aem;
  long aih;
  private k alX;
  private int amO;
  private long amQ;
  private final boolean amU;
  private final i amV = new i(new byte[7]);
  private final j amW = new j(Arrays.copyOf(amT, 10));
  private String amX;
  private k amY;
  private int amZ;
  private boolean ana;
  private boolean anb;
  private k anc;
  private long ane;
  private int sampleSize;
  private int state;
  
  public d()
  {
    this(true, null);
  }
  
  public d(boolean paramBoolean, String paramString)
  {
    jZ();
    this.amU = paramBoolean;
    this.aem = paramString;
  }
  
  private void a(k paramk, long paramLong, int paramInt1, int paramInt2)
  {
    this.state = 3;
    this.amO = paramInt1;
    this.anc = paramk;
    this.ane = paramLong;
    this.sampleSize = paramInt2;
  }
  
  private boolean a(j paramj, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Math.min(paramj.me(), paramInt - this.amO);
    paramj.readBytes(paramArrayOfByte, this.amO, i);
    this.amO = (i + this.amO);
    return this.amO == paramInt;
  }
  
  private void jZ()
  {
    this.state = 0;
    this.amO = 0;
    this.amZ = 256;
  }
  
  public final void a(f paramf, u.d paramd)
  {
    paramd.kf();
    this.amX = paramd.kh();
    this.alX = paramf.cp(paramd.kg());
    if (this.amU)
    {
      paramd.kf();
      this.amY = paramf.cp(paramd.kg());
      this.amY.f(Format.h(paramd.kh(), "application/id3"));
      return;
    }
    this.amY = new com.google.android.exoplayer2.c.c();
  }
  
  public final void b(j paramj)
  {
    label0:
    Object localObject;
    int i;
    int j;
    boolean bool;
    for (;;)
    {
      if (paramj.me() > 0) {
        switch (this.state)
        {
        default: 
          break;
        case 0: 
          localObject = paramj.data;
          i = paramj.position;
          int k = paramj.limit;
          if (i >= k) {
            break label704;
          }
          j = i + 1;
          i = localObject[i] & 0xFF;
          if ((this.amZ == 512) && (i >= 240) && (i != 255)) {
            if ((i & 0x1) == 0)
            {
              bool = true;
              label112:
              this.ana = bool;
              this.state = 2;
              this.amO = 0;
            }
          }
          break;
        }
      }
    }
    for (;;)
    {
      paramj.setPosition(j);
      break;
      bool = false;
      break label112;
      switch (i | this.amZ)
      {
      default: 
        if (this.amZ != 256)
        {
          this.amZ = 256;
          i = j - 1;
        }
        break;
      case 511: 
        this.amZ = 512;
        i = j;
        break;
      case 329: 
        this.amZ = 768;
        i = j;
        break;
      case 836: 
        this.amZ = 1024;
        i = j;
        break;
      case 1075: 
        this.state = 1;
        this.amO = amT.length;
        this.sampleSize = 0;
        this.amW.setPosition(0);
        continue;
        if (!a(paramj, this.amW.data, 10)) {
          break label0;
        }
        this.amY.a(this.amW, 10);
        this.amW.setPosition(6);
        a(this.amY, 0L, 10, this.amW.mg() + 10);
        break label0;
        if (this.ana)
        {
          i = 7;
          label356:
          if (!a(paramj, this.amV.data, i)) {
            break label0;
          }
          this.amV.setPosition(0);
          if (this.anb) {
            break label597;
          }
          j = this.amV.cY(2) + 1;
          i = j;
          if (j != 2)
          {
            new StringBuilder("Detected audio object type: ").append(j).append(", but assuming AAC LC.");
            i = 2;
          }
          j = this.amV.cY(4);
          this.amV.cX(1);
          localObject = com.google.android.exoplayer2.i.c.t(i, j, this.amV.cY(3));
          Pair localPair = com.google.android.exoplayer2.i.c.i((byte[])localObject);
          localObject = Format.a(this.amX, "audio/mp4a-latm", -1, -1, ((Integer)localPair.second).intValue(), ((Integer)localPair.first).intValue(), Collections.singletonList(localObject), null, this.aem);
          this.amQ = (1024000000L / ((Format)localObject).sampleRate);
          this.alX.f((Format)localObject);
          this.anb = true;
        }
        for (;;)
        {
          this.amV.cX(4);
          j = this.amV.cY(13) - 2 - 5;
          i = j;
          if (this.ana) {
            i = j - 2;
          }
          a(this.alX, this.amQ, 0, i);
          break;
          i = 5;
          break label356;
          label597:
          this.amV.cX(10);
        }
        i = Math.min(paramj.me(), this.sampleSize - this.amO);
        this.anc.a(paramj, i);
        this.amO = (i + this.amO);
        if (this.amO != this.sampleSize) {
          break label0;
        }
        this.anc.a(this.aih, 1, this.sampleSize, 0, null);
        this.aih += this.ane;
        jZ();
        break label0;
        return;
        i = j;
        break;
        label704:
        j = i;
      }
    }
  }
  
  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aih = paramLong;
  }
  
  public final void jX()
  {
    jZ();
  }
  
  public final void jY() {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/google/android/exoplayer2/c/c/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */