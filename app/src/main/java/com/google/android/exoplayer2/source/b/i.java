package com.google.android.exoplayer2.source.b;

import android.media.MediaCodec.CryptoInfo;
import android.media.MediaCodec.CryptoInfo.Pattern;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.b.b;
import com.google.android.exoplayer2.b.b.a;
import com.google.android.exoplayer2.b.e;
import com.google.android.exoplayer2.c.k.a;
import com.google.android.exoplayer2.h.a;
import com.google.android.exoplayer2.i.t;
import com.google.android.exoplayer2.k;
import com.google.android.exoplayer2.source.a.a;
import com.google.android.exoplayer2.source.a.a.5;
import com.google.android.exoplayer2.source.g;
import com.google.android.exoplayer2.source.g.a;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.h.a;
import java.nio.ByteBuffer;
import java.util.LinkedList;

final class i
  implements com.google.android.exoplayer2.source.i
{
  private final j atZ;
  public final int group;
  
  public i(j paramj, int paramInt)
  {
    this.atZ = paramj;
    this.group = paramInt;
  }
  
  public final void H(long paramLong)
  {
    j localj = this.atZ;
    int i = this.group;
    h localh = localj.auh[i];
    if ((localj.auv) && (paramLong > localh.asn.kI()))
    {
      localh.asn.kJ();
      return;
    }
    localh.e(paramLong, true);
  }
  
  public final int b(k paramk, e parame, boolean paramBoolean)
  {
    Object localObject1 = this.atZ;
    int k = this.group;
    if (((j)localObject1).le()) {
      return -3;
    }
    int m;
    int i;
    label65:
    Object localObject2;
    int j;
    label130:
    label167:
    label182:
    Object localObject4;
    Object localObject5;
    if (!((j)localObject1).auf.isEmpty())
    {
      if (((j)localObject1).auf.size() > 1)
      {
        m = ((f)((j)localObject1).auf.getFirst()).uid;
        i = 0;
        if (i < ((j)localObject1).auh.length) {
          if (localObject1.aup[i] != 0)
          {
            localObject2 = localObject1.auh[i].asn;
            j = ((g)localObject2).cI(((g)localObject2).ase);
            if (((g)localObject2).kG())
            {
              j = localObject2.arY[j];
              if (j != m) {
                break label167;
              }
            }
          }
        }
        for (i = 0;; i = 1)
        {
          if (i == 0) {
            break label182;
          }
          ((j)localObject1).auf.removeFirst();
          break;
          j = ((g)localObject2).ask;
          break label130;
          i += 1;
          break label65;
        }
      }
      localObject2 = (f)((j)localObject1).auf.getFirst();
      localObject3 = ((f)localObject2).asK;
      if (!((Format)localObject3).equals(((j)localObject1).aul))
      {
        localObject4 = ((j)localObject1).atP;
        i = ((j)localObject1).aci;
        j = ((f)localObject2).asL;
        localObject5 = ((f)localObject2).asM;
        l1 = ((f)localObject2).asN;
        if (((a.a)localObject4).aru != null) {
          ((a.a)localObject4).handler.post(new a.a.5((a.a)localObject4, i, (Format)localObject3, j, localObject5, l1));
        }
      }
      ((j)localObject1).aul = ((Format)localObject3);
    }
    Object localObject3 = localObject1.auh[k];
    boolean bool = ((j)localObject1).auv;
    long l1 = ((j)localObject1).aur;
    switch (((h)localObject3).asn.a(paramk, parame, paramBoolean, bool, ((h)localObject3).ass, ((h)localObject3).aso))
    {
    default: 
      throw new IllegalStateException();
    case -5: 
      ((h)localObject3).ass = paramk.aep;
      return -5;
    case -4: 
      if (!parame.jy())
      {
        if (parame.aih < l1) {
          parame.cf(Integer.MIN_VALUE);
        }
        long l2;
        if (parame.jD())
        {
          localObject4 = ((h)localObject3).aso;
          l1 = ((g.a)localObject4).mb;
          ((h)localObject3).aiZ.reset(1);
          ((h)localObject3).a(l1, ((h)localObject3).aiZ.data, 1);
          l1 = 1L + l1;
          i = localObject3.aiZ.data[0];
          if ((i & 0x80) != 0)
          {
            j = 1;
            i &= 0x7F;
            if (parame.aif.iv == null) {
              parame.aif.iv = new byte[16];
            }
            ((h)localObject3).a(l1, parame.aif.iv, i);
            l1 += i;
            if (j == 0) {
              break label759;
            }
            ((h)localObject3).aiZ.reset(2);
            ((h)localObject3).a(l1, ((h)localObject3).aiZ.data, 2);
            l1 += 2L;
          }
          label759:
          for (i = ((h)localObject3).aiZ.readUnsignedShort();; i = 1)
          {
            localObject1 = parame.aif.numBytesOfClearData;
            if (localObject1 != null)
            {
              paramk = (k)localObject1;
              if (localObject1.length >= i) {}
            }
            else
            {
              paramk = new int[i];
            }
            localObject2 = parame.aif.numBytesOfEncryptedData;
            if (localObject2 != null)
            {
              localObject1 = localObject2;
              if (localObject2.length >= i) {}
            }
            else
            {
              localObject1 = new int[i];
            }
            if (j == 0) {
              break label765;
            }
            j = i * 6;
            ((h)localObject3).aiZ.reset(j);
            ((h)localObject3).a(l1, ((h)localObject3).aiZ.data, j);
            l2 = l1 + j;
            ((h)localObject3).aiZ.setPosition(0);
            j = 0;
            for (;;)
            {
              l1 = l2;
              if (j >= i) {
                break;
              }
              paramk[j] = ((h)localObject3).aiZ.readUnsignedShort();
              localObject1[j] = ((h)localObject3).aiZ.mh();
              j += 1;
            }
            j = 0;
            break;
          }
          label765:
          paramk[0] = 0;
          localObject1[0] = (((g.a)localObject4).size - (int)(l1 - ((g.a)localObject4).mb));
          localObject5 = ((g.a)localObject4).aml;
          localObject2 = parame.aif;
          byte[] arrayOfByte1 = ((k.a)localObject5).aiS;
          byte[] arrayOfByte2 = parame.aif.iv;
          j = ((k.a)localObject5).aiR;
          k = ((k.a)localObject5).ahT;
          m = ((k.a)localObject5).ahU;
          ((b)localObject2).numSubSamples = i;
          ((b)localObject2).numBytesOfClearData = paramk;
          ((b)localObject2).numBytesOfEncryptedData = ((int[])localObject1);
          ((b)localObject2).key = arrayOfByte1;
          ((b)localObject2).iv = arrayOfByte2;
          ((b)localObject2).mode = j;
          ((b)localObject2).ahT = k;
          ((b)localObject2).ahU = m;
          if (t.SDK_INT >= 16)
          {
            ((b)localObject2).ahV.numSubSamples = ((b)localObject2).numSubSamples;
            ((b)localObject2).ahV.numBytesOfClearData = ((b)localObject2).numBytesOfClearData;
            ((b)localObject2).ahV.numBytesOfEncryptedData = ((b)localObject2).numBytesOfEncryptedData;
            ((b)localObject2).ahV.key = ((b)localObject2).key;
            ((b)localObject2).ahV.iv = ((b)localObject2).iv;
            ((b)localObject2).ahV.mode = ((b)localObject2).mode;
            if (t.SDK_INT >= 24)
            {
              paramk = ((b)localObject2).ahW;
              i = ((b)localObject2).ahT;
              j = ((b)localObject2).ahU;
              paramk.ahX.set(i, j);
              paramk.ahV.setPattern(paramk.ahX);
            }
          }
          i = (int)(l1 - ((g.a)localObject4).mb);
          ((g.a)localObject4).mb += i;
          ((g.a)localObject4).size -= i;
        }
        parame.ch(((h)localObject3).aso.size);
        l1 = ((h)localObject3).aso.mb;
        paramk = parame.aig;
        i = ((h)localObject3).aso.size;
        ((h)localObject3).K(l1);
        while (i > 0)
        {
          k = Math.min(i, (int)(((h)localObject3).asq.ald - l1));
          paramk.put(((h)localObject3).asq.asA.data, ((h)localObject3).asq.M(l1), k);
          j = i - k;
          l2 = l1 + k;
          l1 = l2;
          i = j;
          if (l2 == ((h)localObject3).asq.ald)
          {
            ((h)localObject3).asq = ((h)localObject3).asq.asB;
            l1 = l2;
            i = j;
          }
        }
      }
      return -4;
    }
    return -3;
  }
  
  public final boolean hv()
  {
    j localj = this.atZ;
    int i = this.group;
    return (localj.auv) || ((!localj.le()) && (localj.auh[i].asn.kG()));
  }
  
  public final void kC()
  {
    this.atZ.kC();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/google/android/exoplayer2/source/b/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */