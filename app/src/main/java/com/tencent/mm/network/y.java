package com.tencent.mm.network;

import com.tencent.mm.a.n;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class y
{
  private static final byte[] ete = n.eo(7);
  public m etf;
  
  public final void onPush(int paramInt, byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder("onNotify, datalen=");
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      x.i("MicroMsg.MMNativeNetNotifyAdapter", i + " cmd= " + paramInt);
    }
    switch (paramInt)
    {
    case 11: 
    case 12: 
    default: 
    case 5: 
    case 24: 
    case 2147480001: 
    case 39: 
    case 61: 
    case 8: 
    case 120: 
    case 122: 
      do
      {
        do
        {
          do
          {
            return;
            i = paramArrayOfByte.length;
            break;
            x.i("MicroMsg.MMNativeNetNotifyAdapter", "old notify");
            this.etf.e(138, ete);
            return;
            x.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush new notify [%s]", new Object[] { bi.bB(paramArrayOfByte) });
            this.etf.e(138, paramArrayOfByte);
            return;
            x.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush GCM notify [%s]", new Object[] { bi.bB(paramArrayOfByte) });
            this.etf.e(2147480001, paramArrayOfByte);
            return;
            x.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do synccheck");
            this.etf.e(39, null);
            return;
            this.etf.e(174, paramArrayOfByte);
            return;
          } while (paramArrayOfByte.length <= 0);
          this.etf.e(10, paramArrayOfByte);
          return;
          x.i("MicroMsg.MMNativeNetNotifyAdapter", "MM_PKT_VOIP_REQ");
        } while (paramArrayOfByte.length <= 0);
        this.etf.e(120, paramArrayOfByte);
        return;
        x.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush MM_PKT_PUSH_DATA_REQ");
      } while (paramArrayOfByte.length <= 0);
      this.etf.e(268369921, paramArrayOfByte);
      return;
    case 1000000205: 
      this.etf.e(1000000205, paramArrayOfByte);
      return;
    case 192: 
      this.etf.e(192, paramArrayOfByte);
      return;
    case 268369923: 
      x.i("MicroMsg.MMNativeNetNotifyAdapter", "dkpush do oob do notify");
      this.etf.e(268369923, paramArrayOfByte);
      return;
    case 241: 
      x.i("MicroMsg.MMNativeNetNotifyAdapter", "jacks do voice notify PUSH");
      this.etf.e(241, paramArrayOfByte);
      return;
    case 244: 
      x.i("MicroMsg.MMNativeNetNotifyAdapter", "pandy do gamesync notify");
      this.etf.e(244, paramArrayOfByte);
      return;
    case 319: 
      x.i("MicroMsg.MMNativeNetNotifyAdapter", "hy: on notify new year shake");
      this.etf.e(319, paramArrayOfByte);
      return;
    case 311: 
      x.i("MicroMsg.MMNativeNetNotifyAdapter", "on notify F2F data");
      this.etf.e(311, paramArrayOfByte);
      return;
    }
    x.i("MicroMsg.MMNativeNetNotifyAdapter", "summerbadcr on silence notify");
    this.etf.e(318, paramArrayOfByte);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/network/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */