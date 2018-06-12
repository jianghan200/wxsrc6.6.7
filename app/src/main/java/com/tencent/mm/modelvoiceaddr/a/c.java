package com.tencent.mm.modelvoiceaddr.a;

import android.content.SharedPreferences;
import android.os.Looper;
import com.qq.wx.voice.vad.EVadNative;
import com.qq.wx.voice.vad.MMVoipVadNative;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.d;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Map;

public class c
{
  private static final String TAG = c.class.getSimpleName();
  public static SharedPreferences duR = ad.chZ();
  private boolean erb = true;
  private int erc = 3;
  private boolean erd = false;
  private boolean ere = false;
  private long erf = 0L;
  private int erg = 3500;
  private boolean erh = false;
  private a eri = null;
  private com.qq.wx.voice.vad.a erj = null;
  public a erk;
  private short[] erl;
  private ag handler = new c.1(this, Looper.getMainLooper());
  
  public c()
  {
    this(3500, duR.getInt("sil_time", 1000), duR.getFloat("s_n_ration", 2.5F), duR.getInt("s_window", 500), duR.getInt("s_length", 350), duR.getInt("s_delay_time", 550), true, true);
  }
  
  public c(int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean1, boolean paramBoolean2)
  {
    this.erg = paramInt1;
    this.erj = new com.qq.wx.voice.vad.a();
    int j = 0;
    int i = j;
    Object localObject;
    if (ad.cic())
    {
      localObject = com.tencent.mm.model.c.c.Jx().fJ("100235");
      i = j;
      if (((com.tencent.mm.storage.c)localObject).isValid()) {
        i = bi.getInt((String)((com.tencent.mm.storage.c)localObject).ckq().get("MMVoipVadOn"), 0);
      }
    }
    x.i(TAG, "VoiceSilentDetectAPI: abTestFlag = [%s]", new Object[] { Integer.valueOf(i) });
    if (i == 0)
    {
      com.qq.wx.voice.vad.a.ay(false);
      localObject = this.erj;
      if (!com.qq.wx.voice.vad.a.bgy) {
        break label290;
      }
      ((com.qq.wx.voice.vad.a)localObject).bgv = ((com.qq.wx.voice.vad.a)localObject).bgx.Init(16000, paramInt2, paramFloat, paramInt3, paramInt4);
      label201:
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad Init handle = " + ((com.qq.wx.voice.vad.a)localObject).bgv);
      }
      if (((com.qq.wx.voice.vad.a)localObject).bgv != 0L) {
        break label315;
      }
      paramInt2 = 1;
      label245:
      if (paramInt2 != 1)
      {
        localObject = this.erj;
        if (((com.qq.wx.voice.vad.a)localObject).bgv != 0L) {
          break label320;
        }
        paramInt2 = 1;
      }
    }
    for (;;)
    {
      if (paramInt2 != 1) {
        break label392;
      }
      throw new b("Init ERROR");
      com.qq.wx.voice.vad.a.ay(true);
      break;
      label290:
      ((com.qq.wx.voice.vad.a)localObject).bgv = ((com.qq.wx.voice.vad.a)localObject).bgw.Init(16000, paramInt2, paramFloat, paramInt3, paramInt4);
      break label201;
      label315:
      paramInt2 = 0;
      break label245;
      label320:
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad Reset handle = " + ((com.qq.wx.voice.vad.a)localObject).bgv);
      }
      if (com.qq.wx.voice.vad.a.bgy) {
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).bgx.Reset(((com.qq.wx.voice.vad.a)localObject).bgv);
      } else {
        paramInt2 = ((com.qq.wx.voice.vad.a)localObject).bgw.Reset(((com.qq.wx.voice.vad.a)localObject).bgv);
      }
    }
    label392:
    this.eri = new a(paramInt5 * 16);
    this.erl = new short['ྠ'];
    this.handler.removeMessages(0);
    this.handler.sendEmptyMessageDelayed(0, paramInt1);
    this.erd = paramBoolean1;
    this.ere = paramBoolean2;
  }
  
  public static String Ug()
  {
    return String.format(Locale.CHINA, "%s: %s\n%s: %s\n%s: %s\n%s: %s\n%s: %s", new Object[] { "sil_time", Integer.valueOf(duR.getInt("sil_time", 500)), "s_n_ration", Float.valueOf(duR.getFloat("s_n_ration", 2.5F)), "s_window", Integer.valueOf(duR.getInt("s_window", 500)), "s_length", Integer.valueOf(duR.getInt("s_length", 350)), "s_delay_time", Integer.valueOf(duR.getInt("s_delay_time", 550)) });
  }
  
  public final void d(short[] paramArrayOfShort, int paramInt)
  {
    x.d(TAG, "input() called with: voice = [%s], length = [%s]", new Object[] { paramArrayOfShort, Integer.valueOf(paramInt) });
    if ((paramArrayOfShort == null) || (paramArrayOfShort.length == 0) || (paramInt <= 0) || (paramInt > paramArrayOfShort.length)) {}
    Object localObject;
    int i;
    label79:
    long l;
    do
    {
      return;
      if (this.erh)
      {
        x.i(TAG, "VoiceSilentDetectAPI is released.");
        return;
      }
      localObject = this.erj;
      if (((com.qq.wx.voice.vad.a)localObject).bgv != 0L) {
        break;
      }
      i = 1;
      x.d(TAG, "currState = %s,prevState = %s,directFirstStart = %s,directTempState = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(this.erc), Boolean.valueOf(this.erd), Boolean.valueOf(this.ere) });
      if (!this.erd) {
        break label735;
      }
      if (!this.ere) {
        break label679;
      }
      l = System.currentTimeMillis();
      if (this.erk != null) {
        this.erk.Uc();
      }
      this.erf = l;
    } while (this.erh);
    int j = this.eri.eqZ;
    int m = this.erl.length;
    label193:
    if (j > 0) {
      if (m <= j) {
        break label1156;
      }
    }
    label377:
    label408:
    label453:
    label503:
    label553:
    label618:
    label679:
    label735:
    label824:
    label1038:
    label1040:
    label1050:
    label1073:
    label1138:
    label1144:
    label1149:
    label1156:
    for (int k = j;; k = m)
    {
      this.eri.c(this.erl, k);
      int n = j - k;
      j = n;
      if (this.erk == null) {
        break label193;
      }
      this.erk.b(this.erl, k);
      j = n;
      break label193;
      if (com.qq.wx.voice.vad.a.DEBUG) {
        System.out.println("EVad AddData handle = " + ((com.qq.wx.voice.vad.a)localObject).bgv);
      }
      if (com.qq.wx.voice.vad.a.bgy)
      {
        i = ((com.qq.wx.voice.vad.a)localObject).bgx.AddData(((com.qq.wx.voice.vad.a)localObject).bgv, paramArrayOfShort, paramInt);
        break label79;
      }
      i = ((com.qq.wx.voice.vad.a)localObject).bgw.AddData(((com.qq.wx.voice.vad.a)localObject).bgv, paramArrayOfShort, paramInt);
      break label79;
      this.ere = false;
      this.handler.removeMessages(0);
      this.handler.sendEmptyMessageDelayed(0, this.erg);
      for (;;)
      {
        this.erb = false;
        this.erc = i;
        if (this.erh) {
          break label1038;
        }
        localObject = this.eri;
        if (paramArrayOfShort.length >= 0)
        {
          if (paramInt <= paramArrayOfShort.length + 0) {
            break label1144;
          }
          i = paramArrayOfShort.length + 0;
          if (i != 0)
          {
            j = ((a)localObject).era.length - ((a)localObject).eqZ;
            if (i > j)
            {
              j = i - j;
              if (j != 0)
              {
                if (j >= ((a)localObject).eqZ) {
                  break label1040;
                }
                if (j > ((a)localObject).era.length - ((a)localObject).eqX) {
                  break label1050;
                }
                ((a)localObject).eqX += j;
                if (((a)localObject).eqX >= ((a)localObject).era.length) {
                  ((a)localObject).eqX = 0;
                }
                ((a)localObject).eqZ -= j;
              }
            }
            if (i <= ((a)localObject).era.length) {
              break label1138;
            }
            j = ((a)localObject).era.length;
            k = ((a)localObject).era.length;
            j = i - j + 0;
            i = k;
            if (i > ((a)localObject).era.length - ((a)localObject).eqY) {
              break label1073;
            }
            System.arraycopy(paramArrayOfShort, j, ((a)localObject).era, ((a)localObject).eqY, i);
            ((a)localObject).eqY += i;
            if (((a)localObject).eqY >= ((a)localObject).era.length) {
              ((a)localObject).eqY = 0;
            }
            ((a)localObject).eqZ = (i + ((a)localObject).eqZ);
          }
        }
        x.d(TAG, "isSilent %s", new Object[] { Boolean.valueOf(this.erb) });
        if ((this.erb) || (this.erk == null)) {
          break;
        }
        this.erk.b(paramArrayOfShort, paramInt);
        return;
        if ((this.erc == 3) && (i == 2)) {
          this.erd = false;
        }
        if ((this.erc != 3) || (i != 3))
        {
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.erg);
        }
      }
      if ((this.erc == 3) && (i == 2))
      {
        this.erc = i;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.erg);
        l = System.currentTimeMillis();
        if (this.erk != null) {
          this.erk.Uc();
        }
        this.erf = l;
        if (this.erh) {
          break;
        }
        i = this.eri.eqZ;
        k = this.erl.length;
        if (i > 0) {
          if (k <= i) {
            break label1149;
          }
        }
      }
      for (j = i;; j = k)
      {
        this.eri.c(this.erl, j);
        m = i - j;
        i = m;
        if (this.erk == null) {
          break label824;
        }
        this.erk.b(this.erl, j);
        i = m;
        break label824;
        this.erb = false;
        break label377;
        if ((this.erc == 2) && (i == 3))
        {
          this.erc = i;
          this.erb = true;
          this.handler.removeMessages(0);
          this.handler.sendEmptyMessageDelayed(0, this.erg);
          l = System.currentTimeMillis();
          if (this.erk != null) {
            this.erk.Ub();
          }
          this.erf = l;
          if (!this.erh) {
            break label377;
          }
          return;
        }
        if ((this.erc == 3) && (i == 3))
        {
          this.erb = true;
          break label377;
        }
        if ((this.erc != 2) || (i != 2)) {
          break label377;
        }
        this.erb = false;
        this.handler.removeMessages(0);
        this.handler.sendEmptyMessageDelayed(0, this.erg);
        break label377;
        break;
        j = ((a)localObject).eqZ;
        break label453;
        ((a)localObject).eqX = (j - (((a)localObject).era.length - ((a)localObject).eqX));
        break label503;
        k = ((a)localObject).era.length - ((a)localObject).eqY;
        System.arraycopy(paramArrayOfShort, j, ((a)localObject).era, ((a)localObject).eqY, k);
        m = i - k;
        System.arraycopy(paramArrayOfShort, k + j, ((a)localObject).era, 0, m);
        ((a)localObject).eqY = m;
        break label618;
        j = 0;
        break label553;
        i = paramInt;
        break label408;
      }
    }
  }
  
  public final void release()
  {
    x.d(TAG, "released");
    this.erh = true;
    this.erd = false;
    this.ere = false;
    if (this.erj != null)
    {
      com.qq.wx.voice.vad.a locala = this.erj;
      int i;
      if (locala.bgv == 0L) {
        i = 1;
      }
      while (i == 1)
      {
        throw new b();
        if (com.qq.wx.voice.vad.a.DEBUG) {
          System.out.println("EVad Release handle = " + locala.bgv);
        }
        if (com.qq.wx.voice.vad.a.bgy) {
          i = locala.bgx.Release(locala.bgv);
        } else {
          i = locala.bgw.Release(locala.bgv);
        }
      }
      this.erj = null;
    }
    this.eri = null;
    this.erl = null;
    if (this.handler != null)
    {
      this.handler.removeMessages(0);
      this.handler = null;
    }
    this.erk = null;
  }
  
  public static abstract interface a
  {
    public abstract void Ub();
    
    public abstract void Uc();
    
    public abstract void b(short[] paramArrayOfShort, int paramInt);
    
    public abstract void vU();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/modelvoiceaddr/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */