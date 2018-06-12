package com.tencent.mm.plugin.j.a;

import com.tencent.mm.g.c.cm;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  protected static com.tencent.mm.plugin.j.b.a N(bd parambd)
  {
    com.tencent.mm.plugin.j.b.a locala = new com.tencent.mm.plugin.j.b.a();
    locala.field_msgId = parambd.field_msgId;
    locala.field_msgType = parambd.getType();
    locala.field_username = parambd.field_talker;
    locala.field_msgtime = parambd.field_createTime;
    return locala;
  }
  
  private static int a(List<com.tencent.mm.plugin.j.b.a> paramList1, List<com.tencent.mm.plugin.j.b.a> paramList2, List<com.tencent.mm.plugin.j.b.a> paramList3, List<com.tencent.mm.plugin.j.b.a> paramList4)
  {
    if ((paramList2 == null) || (paramList2.isEmpty())) {
      return -1;
    }
    if ((paramList1 == null) || (paramList1.isEmpty()))
    {
      paramList1 = paramList2.iterator();
      while (paramList1.hasNext()) {
        paramList3.add((com.tencent.mm.plugin.j.b.a)paramList1.next());
      }
      return 0;
    }
    int k = paramList1.size();
    int m = paramList2.size();
    int i = 0;
    int j = 0;
    while (i < m)
    {
      com.tencent.mm.plugin.j.b.a locala2 = (com.tencent.mm.plugin.j.b.a)paramList2.get(i);
      if (locala2 == null) {
        break;
      }
      com.tencent.mm.plugin.j.b.a locala1;
      if (j < k)
      {
        locala1 = (com.tencent.mm.plugin.j.b.a)paramList1.get(j);
        label132:
        if (locala1 == null) {
          break;
        }
        if (locala2.field_msgSubType != locala1.field_msgSubType) {
          break label244;
        }
        if (bi.fS(locala2.field_path, locala1.field_path)) {
          break label206;
        }
        locala2.sKx = locala1.sKx;
        paramList4.add(locala2);
      }
      for (;;)
      {
        i += 1;
        j += 1;
        break;
        locala1 = null;
        break label132;
        label206:
        if (!bi.K(locala2.field_size, locala1.field_size))
        {
          locala2.sKx = locala1.sKx;
          paramList4.add(locala2);
        }
      }
      label244:
      if (locala2.field_msgSubType >= locala1.field_msgSubType) {
        break;
      }
      paramList3.add(locala2);
      i += 1;
    }
    return 1;
  }
  
  public final void L(bd parambd)
  {
    int j = 0;
    if (parambd == null) {
      return;
    }
    List localList = com.tencent.mm.plugin.j.b.avr().avs().O(parambd);
    parambd = M(parambd);
    ArrayList localArrayList1 = new ArrayList();
    ArrayList localArrayList2 = new ArrayList();
    int k = a(localList, parambd, localArrayList1, localArrayList2);
    String str = avA();
    if (localList != null) {}
    for (int i = localList.size();; i = 0)
    {
      if (parambd != null) {
        j = parambd.size();
      }
      x.i("MicroMsg.AbstractMsgHandler", "%s handle compare[%d] db[%d] create[%d] insert[%d] update[%d]", new Object[] { str, Integer.valueOf(k), Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()) });
      if (k < 0) {
        break;
      }
      if (!localArrayList1.isEmpty()) {
        com.tencent.mm.plugin.j.b.avr().avs().aw(localArrayList1);
      }
      if (localArrayList2.isEmpty()) {
        break;
      }
      com.tencent.mm.plugin.j.b.avr().avs().ax(localArrayList2);
      return;
    }
  }
  
  protected abstract List<com.tencent.mm.plugin.j.b.a> M(bd parambd);
  
  protected abstract String avA();
  
  protected final String wZ(String paramString)
  {
    if (bi.oW(paramString)) {
      str1 = "";
    }
    String str2;
    int i;
    do
    {
      return str1;
      str2 = g.Ei().dqo;
      i = paramString.indexOf(str2);
      str1 = paramString;
    } while (i < 0);
    String str1 = paramString.substring(i + str2.length());
    x.d("MicroMsg.AbstractMsgHandler", "%s cut down result[%s] root[%s] path[%s]", new Object[] { avA(), str1, str2, paramString });
    return str1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/j/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */