package com.tencent.mm.protocal;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import com.tencent.mm.a.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Locale;

public final class w
{
  public static final class a
    extends k.d
    implements k.b
  {
    public byte[] dZu = new byte[0];
    public byte[] dpW;
    public int netType;
    public int qWE;
    public int uin = 0;
    
    public final byte[] Ie()
    {
      int j = this.uin;
      if (this.dZu == null) {}
      for (int i = -1;; i = this.dZu.length)
      {
        x.d("MicroMsg.MMSyncCheck", "toProtoBuf dksynccheck uin:%d keybuf:%d, stack[%s]", new Object[] { Integer.valueOf(j), Integer.valueOf(i), bi.cjd() });
        if ((this.uin != 0) && (!bi.bC(this.dZu))) {
          break;
        }
        return new byte[0];
      }
      i = (this.uin >> 13 & 0x7FFFF | this.dZu.length << 19) ^ 0x5601F281;
      j = 0x5601F281 ^ (this.dZu.length >> 13 & 0x7FFFF | this.uin << 19);
      byte[] arrayOfByte = new byte[this.dZu.length + 32];
      x.d("MicroMsg.MMSyncCheck", "dksynccheck uin=[%d/%d], keyBufLen=[%d/%d] outBuf=[%d]", new Object[] { Integer.valueOf(this.uin), Integer.valueOf(i), Integer.valueOf(this.dZu.length), Integer.valueOf(j), Integer.valueOf(arrayOfByte.length) });
      arrayOfByte[0] = ((byte)(i >> 24 & 0xFF));
      arrayOfByte[1] = ((byte)(i >> 16 & 0xFF));
      arrayOfByte[2] = ((byte)(i >> 8 & 0xFF));
      arrayOfByte[3] = ((byte)(i & 0xFF));
      arrayOfByte[4] = ((byte)(j >> 24 & 0xFF));
      arrayOfByte[5] = ((byte)(j >> 16 & 0xFF));
      arrayOfByte[6] = ((byte)(j >> 8 & 0xFF));
      arrayOfByte[7] = ((byte)(j & 0xFF));
      System.arraycopy(this.dZu, 0, arrayOfByte, 8, this.dZu.length);
      arrayOfByte[(arrayOfByte.length - 24)] = ((byte)(d.qVN >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 23)] = ((byte)(d.qVN >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 22)] = ((byte)(d.qVN >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 21)] = ((byte)(d.qVN & 0xFF));
      String str = Locale.getDefault().toString();
      Object localObject = str;
      if (str.length() > 8) {
        localObject = str.substring(0, 8);
      }
      localObject = ((String)localObject).getBytes();
      System.arraycopy(localObject, 0, arrayOfByte, arrayOfByte.length - 20, localObject.length);
      x.d("MicroMsg.MMSyncCheck", "language:%x" + Arrays.toString((byte[])localObject));
      arrayOfByte[(arrayOfByte.length - 12)] = 0;
      arrayOfByte[(arrayOfByte.length - 11)] = 0;
      arrayOfByte[(arrayOfByte.length - 10)] = 0;
      arrayOfByte[(arrayOfByte.length - 9)] = 2;
      arrayOfByte[(arrayOfByte.length - 8)] = ((byte)(this.netType >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 7)] = ((byte)(this.netType >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 6)] = ((byte)(this.netType >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 5)] = ((byte)(this.netType & 0xFF));
      arrayOfByte[(arrayOfByte.length - 4)] = ((byte)(this.qWE >> 24 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 3)] = ((byte)(this.qWE >> 16 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 2)] = ((byte)(this.qWE >> 8 & 0xFF));
      arrayOfByte[(arrayOfByte.length - 1)] = ((byte)(this.qWE & 0xFF));
      x.d("MicroMsg.MMSyncCheck", "outbuf:%x" + Arrays.toString(arrayOfByte));
      this.dpW = g.v(arrayOfByte);
      return arrayOfByte;
    }
    
    public final int If()
    {
      return 0;
    }
    
    public final boolean LB()
    {
      return false;
    }
    
    public final boolean cgo()
    {
      return true;
    }
    
    public final void eK(int paramInt)
    {
      this.uin = paramInt;
    }
    
    public final int getCmdId()
    {
      return 205;
    }
  }
  
  public static final class b
    extends k.e
    implements k.c
  {
    private String bVv = null;
    public byte[] dpW = null;
    public long qXc = 7L;
    private byte[] qXd;
    
    public final int G(byte[] paramArrayOfByte)
    {
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length < 12))
      {
        StringBuilder localStringBuilder = new StringBuilder("dksynccheck err resp buf:");
        if (paramArrayOfByte == null) {}
        for (i = -1;; i = paramArrayOfByte.length)
        {
          x.e("MicroMsg.MMSyncCheck", i);
          return -1;
        }
      }
      this.qXc = (paramArrayOfByte[3] & 0xFF | (paramArrayOfByte[2] & 0xFF) << 8 | (paramArrayOfByte[1] & 0xFF) << 16 | (paramArrayOfByte[0] & 0xFF) << 24);
      int i = paramArrayOfByte[7] & 0xFF | (paramArrayOfByte[6] & 0xFF) << 8 | (paramArrayOfByte[5] & 0xFF) << 16 | (paramArrayOfByte[4] & 0xFF) << 24;
      int j = paramArrayOfByte[11] & 0xFF | (paramArrayOfByte[10] & 0xFF) << 8 | (paramArrayOfByte[9] & 0xFF) << 16 | (paramArrayOfByte[8] & 0xFF) << 24;
      x.d("MicroMsg.MMSyncCheck", " fromProtoBuf oreh synccheck resp selector:%d, redCode:%d, keyLen:%d", new Object[] { Long.valueOf(this.qXc), Integer.valueOf(i), Integer.valueOf(j) });
      if (i != 62534)
      {
        this.bVv = "";
        return i;
      }
      if ((j != paramArrayOfByte.length - 12) && (j != paramArrayOfByte.length - 12 - 16))
      {
        x.e("MicroMsg.MMSyncCheck", " the key len is invalid keyLen:%d, bufLen:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(paramArrayOfByte.length) });
        return -1;
      }
      if (j == paramArrayOfByte.length - 12 - 16)
      {
        this.dpW = new byte[16];
        System.arraycopy(paramArrayOfByte, paramArrayOfByte.length - 16, this.dpW, 0, 16);
      }
      this.qXd = new byte[j];
      System.arraycopy(paramArrayOfByte, 12, this.qXd, 0, j);
      return i;
    }
    
    public final boolean cgo()
    {
      return true;
    }
    
    @TargetApi(9)
    public final String cgq()
    {
      if (this.dpW == null) {
        return "";
      }
      byte[] arrayOfByte;
      if (this.bVv == null)
      {
        arrayOfByte = MMProtocalJni.aesDecrypt(this.qXd, this.dpW);
        if (bi.bC(arrayOfByte)) {
          return "";
        }
        if (Build.VERSION.SDK_INT < 9) {
          break label69;
        }
      }
      label69:
      for (this.bVv = new String(arrayOfByte, Charset.forName("UTF-8"));; this.bVv = new String(arrayOfByte)) {
        return this.bVv;
      }
    }
    
    public final int getCmdId()
    {
      return 1000000205;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */