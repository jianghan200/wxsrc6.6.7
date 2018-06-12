package com.tencent.mm.modelsns;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.mm.protocal.c.bqt;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.concurrent.atomic.AtomicInteger;

public final class b
{
  private static boolean eet = false;
  private static AtomicInteger egZ = new AtomicInteger(0);
  public Object egQ = null;
  public int egR = 1;
  public int egS;
  public int egT;
  public int egU;
  public StringBuffer egV = new StringBuffer();
  public StringBuffer egW = new StringBuffer();
  public StringBuffer egX = new StringBuffer();
  public StringBuffer egY = new StringBuffer();
  public int opType = 0;
  public long timeStamp;
  
  public b(int paramInt1, int paramInt2)
  {
    this.opType = paramInt1;
    this.egU = paramInt2;
    if (!Rz()) {
      return;
    }
    this.timeStamp = System.currentTimeMillis();
    if (ao.isWifi(ad.getContext())) {
      this.egT = 4;
    }
    for (;;)
    {
      this.egS = egZ.incrementAndGet();
      return;
      if (ao.is4G(ad.getContext())) {
        this.egT = 3;
      } else if (ao.is3G(ad.getContext())) {
        this.egT = 2;
      } else if (ao.is2G(ad.getContext())) {
        this.egT = 1;
      } else {
        this.egT = 0;
      }
    }
  }
  
  private static b L(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    bqt localbqt = new bqt();
    try
    {
      localbqt.aG(paramArrayOfByte);
      paramArrayOfByte = new b(localbqt.opType, localbqt.egU);
      paramArrayOfByte.egR = localbqt.egR;
      paramArrayOfByte.timeStamp = localbqt.timeStamp;
      paramArrayOfByte.egS = localbqt.egS;
      paramArrayOfByte.egT = localbqt.egT;
      paramArrayOfByte.egV = new StringBuffer(localbqt.soR);
      paramArrayOfByte.egY = new StringBuffer(localbqt.soS);
      paramArrayOfByte.egW = new StringBuffer(localbqt.soT);
      paramArrayOfByte.egX = new StringBuffer(localbqt.soU);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      x.e("MicroMsg.StatisticsOplog", "putIntent " + paramArrayOfByte.getMessage());
    }
    return null;
  }
  
  public static void RC()
  {
    x.i("MicroMsg.StatisticsOplog", "wait op");
  }
  
  public static b c(Intent paramIntent, String paramString)
  {
    paramIntent = paramIntent.getByteArrayExtra(paramString);
    if (paramIntent == null) {
      return null;
    }
    return L(paramIntent);
  }
  
  public static b io(int paramInt)
  {
    return new b(paramInt, 1);
  }
  
  public static b ip(int paramInt)
  {
    return new b(paramInt, 4);
  }
  
  public static b j(Bundle paramBundle)
  {
    paramBundle = paramBundle.getByteArray("intent_key_StatisticsOplog");
    if (paramBundle == null) {
      return null;
    }
    return L(paramBundle);
  }
  
  public static b p(Intent paramIntent)
  {
    return c(paramIntent, "intent_key_StatisticsOplog");
  }
  
  public final byte[] Lv()
  {
    Object localObject = new bqt();
    ((bqt)localObject).opType = this.opType;
    ((bqt)localObject).egU = this.egU;
    ((bqt)localObject).egR = this.egR;
    ((bqt)localObject).timeStamp = this.timeStamp;
    ((bqt)localObject).egS = this.egS;
    ((bqt)localObject).egT = this.egT;
    ((bqt)localObject).soR = this.egV.toString();
    ((bqt)localObject).soS = this.egY.toString();
    ((bqt)localObject).soT = this.egW.toString();
    ((bqt)localObject).soU = this.egX.toString();
    try
    {
      localObject = ((bqt)localObject).toByteArray();
      return (byte[])localObject;
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.StatisticsOplog", "putIntent " + localException.getMessage());
    }
    return null;
  }
  
  public final b RA()
  {
    this.egW = new StringBuffer();
    return this;
  }
  
  public final b RB()
  {
    this.egV = new StringBuffer();
    return this;
  }
  
  public final boolean RD()
  {
    if (!Rz()) {
      return false;
    }
    e.post(new b.1(this), "StatisticsOplog");
    return true;
  }
  
  public final boolean Rz()
  {
    boolean bool2 = true;
    int i = c.ehb;
    boolean bool1;
    if (i == 0) {
      bool1 = false;
    }
    label63:
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                return bool1;
                if (i != 1) {
                  break label63;
                }
                if (this.opType < 501) {
                  break;
                }
                bool1 = bool2;
              } while (this.opType <= 700);
              if (this.opType < 701) {
                break;
              }
              bool1 = bool2;
            } while (this.opType <= 1000);
            if ((i != 2) || (this.opType < 701)) {
              break;
            }
            bool1 = bool2;
          } while (this.opType <= 1000);
          if ((i != 3) || (this.opType < 501)) {
            break;
          }
          bool1 = bool2;
        } while (this.opType <= 700);
        if (i != 4) {
          break label166;
        }
        if (this.opType < 701) {
          break;
        }
        bool1 = bool2;
      } while (this.opType <= 1000);
      if (this.opType < 501) {
        break;
      }
      bool1 = bool2;
    } while (this.opType <= 700);
    label166:
    return false;
  }
  
  public final void b(Intent paramIntent, String paramString)
  {
    byte[] arrayOfByte = Lv();
    if (arrayOfByte == null) {
      return;
    }
    paramIntent.putExtra(paramString, arrayOfByte);
  }
  
  public final b bP(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (String str = "1";; str = "0") {
      return nb(str);
    }
  }
  
  public final boolean iq(int paramInt)
  {
    this.egQ = Integer.valueOf(paramInt);
    return true;
  }
  
  public final b ir(int paramInt)
  {
    return nb(String.valueOf(paramInt));
  }
  
  public final b is(int paramInt)
  {
    if (!Rz()) {
      return this;
    }
    if (this.egW.length() == 0)
    {
      this.egW.append(paramInt);
      return this;
    }
    this.egW.append("||" + paramInt);
    return this;
  }
  
  public final b nb(String paramString)
  {
    if (!Rz()) {
      return this;
    }
    if (this.egV.length() == 0)
    {
      if (bi.oW(paramString))
      {
        this.egV.append(" ");
        return this;
      }
      this.egV.append(paramString);
      return this;
    }
    this.egV.append("||" + paramString);
    return this;
  }
  
  public final b nc(String paramString)
  {
    if (!Rz()) {
      return this;
    }
    if (this.egW.length() == 0)
    {
      this.egW.append(paramString);
      return this;
    }
    this.egW.append("||" + paramString);
    return this;
  }
  
  public final b nd(String paramString)
  {
    if (!Rz()) {
      return this;
    }
    if (this.egX.length() == 0)
    {
      this.egX.append(paramString);
      return this;
    }
    this.egX.append("||" + paramString);
    return this;
  }
  
  public final void update()
  {
    if (!Rz()) {
      return;
    }
    this.timeStamp = System.currentTimeMillis();
    this.egS = egZ.incrementAndGet();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/modelsns/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */