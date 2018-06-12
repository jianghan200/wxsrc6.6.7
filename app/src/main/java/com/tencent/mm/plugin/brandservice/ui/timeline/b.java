package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.widget.ImageView;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.a.a;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.d.a;
import com.tencent.mm.ak.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.plugin.brandservice.b.a;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.q;
import java.util.HashMap;

public final class b
  implements d.a
{
  public HashMap<Long, Integer> hre = new HashMap();
  private i hrf;
  
  public b(i parami)
  {
    this.hrf = parami;
  }
  
  public static void a(String paramString, ImageView paramImageView)
  {
    a locala = o.Pj();
    c.a locala1 = new c.a();
    locala1.dXR = b.a.chatting_item_biz_default_bg;
    locala1.dXD = 1;
    locala.a(paramString, paramImageView, locala1.Pt());
  }
  
  public static com.tencent.mm.ak.e b(q paramq)
  {
    com.tencent.mm.ak.e locale1 = null;
    if (paramq.field_msgId > 0L) {
      locale1 = o.Pf().br(paramq.field_msgId);
    }
    com.tencent.mm.ak.e locale2;
    if (locale1 != null)
    {
      locale2 = locale1;
      if (locale1.dTK > 0L) {}
    }
    else
    {
      locale2 = locale1;
      if (paramq.field_msgSvrId > 0L) {
        locale2 = o.Pf().bq(paramq.field_msgSvrId);
      }
    }
    return locale2;
  }
  
  public static String f(com.tencent.mm.ak.e parame)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (parame == null) {
      parame = (com.tencent.mm.ak.e)localObject1;
    }
    String str;
    do
    {
      return parame;
      str = parame.dTL;
      localObject1 = localObject2;
      if (parame.ON())
      {
        parame = o.Pf().d(parame);
        localObject1 = localObject2;
        if (parame != null)
        {
          parame = o.Pf().o(parame, "", "");
          localObject1 = localObject2;
          if (com.tencent.mm.a.e.cn(parame))
          {
            x.i("MicroMsg.BizTimeLineImgMsgHandler", "hasHdImg");
            localObject1 = parame;
          }
        }
      }
      parame = (com.tencent.mm.ak.e)localObject1;
    } while (localObject1 != null);
    return o.Pf().o(str, "", "");
  }
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, l paraml) {}
  
  public final void a(long paramLong1, long paramLong2, int paramInt1, int paramInt2, Object paramObject, int paramInt3, int paramInt4, String paramString, l paraml)
  {
    if ((paramInt3 != 0) || (paramInt4 != 0))
    {
      x.i("MicroMsg.BizTimeLineImgMsgHandler", "onImgTaskEnd errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
      if (paramInt4 == -5103059)
      {
        j(paramLong2, 2);
        return;
      }
      j(paramLong2, 3);
      return;
    }
    j(paramLong2, 1);
    this.hrf.avj();
  }
  
  public final int cb(long paramLong)
  {
    if (this.hre.containsKey(Long.valueOf(paramLong))) {
      return ((Integer)this.hre.get(Long.valueOf(paramLong))).intValue();
    }
    return 0;
  }
  
  public final void j(long paramLong, int paramInt)
  {
    this.hre.put(Long.valueOf(paramLong), Integer.valueOf(paramInt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/timeline/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */