package com.tencent.mm.plugin.music.cache;

import android.text.TextUtils;
import com.tencent.mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.mm.plugin.music.cache.ipc.IPCAudioParamRequest;
import com.tencent.mm.plugin.music.cache.ipc.a;
import com.tencent.mm.plugin.music.cache.ipc.a.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.BitSet;

public final class c
{
  public int count = 0;
  public long eyz = -1L;
  public BitSet lxw = new BitSet();
  public String lxx = "";
  public String mUrl;
  
  public c(String paramString)
  {
    this.mUrl = paramString;
  }
  
  private void tu(int paramInt)
  {
    x.i("MicroMsg.IndexBitMgr", "setFileCacheComplete %d", new Object[] { Integer.valueOf(paramInt) });
    if (!TextUtils.isEmpty(this.lxx))
    {
      String str = this.lxx;
      IPCAudioParamRequest localIPCAudioParamRequest = new IPCAudioParamRequest();
      localIPCAudioParamRequest.lxx = str;
      localIPCAudioParamRequest.lxH = paramInt;
      x.d("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "updateMusicFileCacheComplete");
      XIPCInvoker.a("com.tencent.mm", localIPCAudioParamRequest, a.i.class);
      x.d("MicroMsg.Audio.MusicDataSourceCrossProcessImp", "updateMusicFileCacheComplete end");
    }
  }
  
  public final void bhK()
  {
    int k = 0;
    if (!TextUtils.isEmpty(this.lxx))
    {
      BitSet localBitSet = this.lxw;
      byte[] arrayOfByte = new byte[localBitSet.size() / 8];
      i = 0;
      if (i < localBitSet.size())
      {
        int m = i / 8;
        int n = arrayOfByte[m];
        if (localBitSet.get(i)) {}
        for (int j = 1;; j = 0)
        {
          arrayOfByte[m] = ((byte)(j << 7 - i % 8 | n));
          i += 1;
          break;
        }
      }
      a.k(this.lxx, arrayOfByte);
    }
    x.d("MicroMsg.IndexBitMgr", "saveBitCache bitSet:%s", new Object[] { this.lxw.toString() });
    x.i("MicroMsg.IndexBitMgr", "saveBitCache bitSet count %d, cardinality:" + this.count + "," + this.lxw.cardinality());
    x.i("MicroMsg.IndexBitMgr", "isCacheComplete, count:%d, cardinality:%d", new Object[] { Integer.valueOf(this.count), Integer.valueOf(this.lxw.cardinality()) });
    int i = k;
    if (this.count > 0)
    {
      i = k;
      if (this.count == this.lxw.cardinality()) {
        i = 1;
      }
    }
    if (i != 0) {
      tu(1);
    }
  }
  
  public final boolean cV(int paramInt1, int paramInt2)
  {
    if ((paramInt1 < 0) || (paramInt2 < 0) || (paramInt1 > this.eyz) || (paramInt1 + paramInt2 > this.eyz))
    {
      x.e("MicroMsg.IndexBitMgr", "canReadFromCache offset %d, size %d, fileLength %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(this.eyz) });
      x.e("MicroMsg.IndexBitMgr", "canReadFromCache invalid parameter!");
      return false;
    }
    int i = getIndex(paramInt1);
    paramInt2 = getIndex(paramInt1 + paramInt2);
    paramInt1 = i;
    while (paramInt1 <= paramInt2)
    {
      if (!tv(i))
      {
        x.d("MicroMsg.IndexBitMgr", "index %d, indexBit 0", new Object[] { Integer.valueOf(paramInt1) });
        return false;
      }
      paramInt1 += 1;
    }
    return true;
  }
  
  public final void clearCache()
  {
    x.i("MicroMsg.IndexBitMgr", "clearCache");
    this.lxw = new BitSet(this.count);
    tu(0);
    if (!TextUtils.isEmpty(this.lxx)) {
      a.k(this.lxx, null);
    }
  }
  
  public final int getIndex(int paramInt)
  {
    if (paramInt > this.eyz)
    {
      x.e("MicroMsg.IndexBitMgr", "getIndex, offset is invalid, offset:%d, fileLength:%d", new Object[] { Integer.valueOf(paramInt), Long.valueOf(this.eyz) });
      return 0;
    }
    return paramInt / 8192;
  }
  
  public final boolean tv(int paramInt)
  {
    return this.lxw.get(paramInt);
  }
  
  public final void tw(int paramInt)
  {
    this.lxw.set(paramInt);
  }
  
  public static final class a
  {
    public static BitSet aC(byte[] paramArrayOfByte)
    {
      BitSet localBitSet = new BitSet(paramArrayOfByte.length * 8);
      int i = 0;
      int j = 0;
      while (i < paramArrayOfByte.length)
      {
        int k = 7;
        if (k >= 0)
        {
          if ((paramArrayOfByte[i] & 1 << k) >> k == 1) {}
          for (boolean bool = true;; bool = false)
          {
            localBitSet.set(j, bool);
            k -= 1;
            j += 1;
            break;
          }
        }
        i += 1;
      }
      return localBitSet;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/music/cache/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */