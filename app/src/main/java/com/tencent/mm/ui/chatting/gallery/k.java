package com.tencent.mm.ui.chatting.gallery;

import com.tencent.mm.ab.l;
import com.tencent.mm.ak.d.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.HashSet;

public final class k
  implements d.a
{
  private static k tXu;
  HashSet<Long> tXv = new HashSet();
  d.a tXw;
  
  public static k cxA()
  {
    if (tXu == null) {
      tXu = new k();
    }
    return tXu;
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject)
  {
    if (this.tXw != null) {
      this.tXw.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject);
    }
    this.tXv.remove(Long.valueOf(paramLong2));
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, l paraml)
  {
    if (this.tXw != null) {
      this.tXw.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paraml);
    }
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, l paraml)
  {
    if (this.tXw != null) {
      this.tXw.a(paramLong1, paramLong2, paramInt1, paramInt2, paramObject, paramInt3, paramInt4, paramString, paraml);
    }
    for (;;)
    {
      this.tXv.remove(Long.valueOf(paramLong2));
      return;
      au.HU();
      paramObject = c.FT().dW(paramLong2);
      x.i("MicroMsg.ImageHDDownloadAndSaveMgr", "[oreh download_and_save] hdImg end at background, msgLocalId:%d", new Object[] { Long.valueOf(((cm)paramObject).field_msgId) });
      b.b(ad.getContext(), (bd)paramObject, false);
    }
  }
  
  public final boolean gL(long paramLong)
  {
    return this.tXv.contains(Long.valueOf(paramLong));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */