package com.tencent.mm.plugin.j.a;

import com.tencent.mm.ak.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.List;

public final class d
  extends a
{
  protected final List<com.tencent.mm.plugin.j.b.a> M(bd parambd)
  {
    if (parambd == null) {
      return null;
    }
    com.tencent.mm.ak.e locale = o.Pf().q(parambd);
    if ((locale == null) || (locale.dTK == 0L))
    {
      x.w("MicroMsg.ImageMsgHandler", "%s can not get imgInfo", new Object[] { avA() });
      return null;
    }
    String str2 = o.Pf().o(locale.dTL, "", "");
    long l7 = com.tencent.mm.a.e.cm(str2);
    String str1 = o.Pf().o(locale.dTN, "", "");
    long l8 = com.tencent.mm.a.e.cm(str1);
    Object localObject7 = o.Pf().o(locale.dTN, "", "") + "hd";
    long l9 = com.tencent.mm.a.e.cm((String)localObject7);
    Object localObject4 = null;
    Object localObject5 = null;
    Object localObject6 = null;
    long l1 = 0L;
    long l2 = 0L;
    long l6 = 0L;
    long l3 = l1;
    long l4 = l2;
    long l5 = l6;
    Object localObject1 = localObject6;
    Object localObject2 = localObject5;
    Object localObject3 = localObject4;
    if (locale.ON())
    {
      locale = o.Pf().hQ(locale.dTU);
      l3 = l1;
      l4 = l2;
      l5 = l6;
      localObject1 = localObject6;
      localObject2 = localObject5;
      localObject3 = localObject4;
      if (locale != null)
      {
        localObject4 = o.Pf().o(locale.dTL, "", "");
        if (!bi.fS((String)localObject4, str2)) {
          l1 = com.tencent.mm.a.e.cm((String)localObject4);
        }
        localObject5 = o.Pf().o(locale.dTN, "", "");
        if (!bi.fS((String)localObject5, str1)) {
          l2 = com.tencent.mm.a.e.cm((String)localObject5);
        }
        localObject6 = o.Pf().o(locale.dTN, "", "") + "hd";
        l3 = l1;
        l4 = l2;
        l5 = l6;
        localObject1 = localObject6;
        localObject2 = localObject5;
        localObject3 = localObject4;
        if (!bi.fS((String)localObject6, (String)localObject7))
        {
          l5 = com.tencent.mm.a.e.cm((String)localObject6);
          localObject3 = localObject4;
          localObject2 = localObject5;
          localObject1 = localObject6;
          l4 = l2;
          l3 = l1;
        }
      }
    }
    localObject4 = N(parambd);
    ((com.tencent.mm.plugin.j.b.a)localObject4).field_msgSubType = 20;
    ((com.tencent.mm.plugin.j.b.a)localObject4).field_path = wZ(str2);
    ((com.tencent.mm.plugin.j.b.a)localObject4).field_size = l7;
    localObject5 = N(parambd);
    ((com.tencent.mm.plugin.j.b.a)localObject5).field_msgSubType = 21;
    ((com.tencent.mm.plugin.j.b.a)localObject5).field_path = wZ(str1);
    ((com.tencent.mm.plugin.j.b.a)localObject5).field_size = l8;
    localObject6 = N(parambd);
    ((com.tencent.mm.plugin.j.b.a)localObject6).field_msgSubType = 22;
    ((com.tencent.mm.plugin.j.b.a)localObject6).field_path = wZ((String)localObject7);
    ((com.tencent.mm.plugin.j.b.a)localObject6).field_size = l9;
    localObject7 = N(parambd);
    ((com.tencent.mm.plugin.j.b.a)localObject7).field_msgSubType = 23;
    ((com.tencent.mm.plugin.j.b.a)localObject7).field_path = wZ((String)localObject3);
    ((com.tencent.mm.plugin.j.b.a)localObject7).field_size = l3;
    localObject3 = N(parambd);
    ((com.tencent.mm.plugin.j.b.a)localObject3).field_msgSubType = 24;
    ((com.tencent.mm.plugin.j.b.a)localObject3).field_path = wZ((String)localObject2);
    ((com.tencent.mm.plugin.j.b.a)localObject3).field_size = l4;
    parambd = N(parambd);
    parambd.field_msgSubType = 25;
    parambd.field_path = wZ((String)localObject1);
    parambd.field_size = l5;
    x.i("MicroMsg.ImageMsgHandler", "%s create image wx file index bigItem[%s] thumb[%s][%s] hd[%s %s %s]", new Object[] { avA(), localObject4, localObject5, localObject6, localObject7, localObject3, parambd });
    localObject1 = new ArrayList();
    ((List)localObject1).add(localObject4);
    ((List)localObject1).add(localObject5);
    ((List)localObject1).add(localObject6);
    ((List)localObject1).add(localObject7);
    ((List)localObject1).add(localObject3);
    ((List)localObject1).add(parambd);
    return (List<com.tencent.mm.plugin.j.b.a>)localObject1;
  }
  
  protected final String avA()
  {
    return "image_" + hashCode();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/j/a/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */