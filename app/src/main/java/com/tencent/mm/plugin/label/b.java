package com.tencent.mm.plugin.label;

import com.tencent.mm.ab.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.label.b.a;
import com.tencent.mm.plugin.label.b.d;
import com.tencent.mm.protocal.c.bxe;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.ag;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  implements com.tencent.mm.plugin.label.a.b
{
  ArrayList<String> kAx;
  ArrayList<String> kAy;
  private com.tencent.mm.ab.e kAz = new b.1(this);
  String username;
  
  static void g(String paramString, ArrayList<String> paramArrayList)
  {
    if (paramArrayList == null) {}
    for (Object localObject1 = "";; localObject1 = paramArrayList.toString())
    {
      x.d("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveContact] username:%s,list:%s", new Object[] { paramString, localObject1 });
      if ((!bi.oW(paramString)) && (paramArrayList != null) && (paramArrayList.size() > 0)) {
        break;
      }
      x.e("MicroMsg.Label.ContactLabelManagerImpl", "add contact label faild.");
      return;
    }
    Object localObject2 = "";
    localObject1 = localObject2;
    if (paramArrayList != null)
    {
      localObject1 = localObject2;
      if (paramArrayList.size() > 0) {
        localObject1 = c.bq(e.aYJ().ab(paramArrayList));
      }
    }
    paramArrayList = new LinkedList();
    localObject2 = new bxe();
    ((bxe)localObject2).rvl = ((String)localObject1);
    ((bxe)localObject2).hbL = paramString;
    paramArrayList.add(localObject2);
    paramString = new d(paramArrayList);
    au.DF().a(paramString, 0);
  }
  
  public final String FA(String paramString)
  {
    return e.aYJ().FA(paramString);
  }
  
  public final List<String> FB(String paramString)
  {
    if (bi.oW(paramString)) {
      x.w("MicroMsg.Label.ContactLabelManagerImpl", "labels is null.");
    }
    do
    {
      return null;
      paramString = paramString.split(",");
    } while ((paramString == null) || (paramString.length <= 0));
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(Arrays.asList(paramString));
    return localArrayList;
  }
  
  public final String Fz(String paramString)
  {
    return e.aYJ().Fz(paramString);
  }
  
  public final void a(j.a parama)
  {
    e.aYJ().c(parama);
  }
  
  public final void aYE()
  {
    e.aYJ().aYE();
  }
  
  public final List<String> aYF()
  {
    ag localag = e.aYJ();
    long l = bi.VF();
    ArrayList localArrayList1 = localag.cle();
    if (localArrayList1 == null) {
      return null;
    }
    localag.clf();
    ArrayList localArrayList2 = new ArrayList();
    int i = 0;
    while (i < localArrayList1.size())
    {
      ArrayList localArrayList3 = (ArrayList)localag.tal.get(Integer.valueOf(((ad)localArrayList1.get(i)).field_labelID));
      if ((localArrayList3 != null) && (localArrayList3.size() > 0)) {
        localArrayList2.add(((ad)localArrayList1.get(i)).field_labelName);
      }
      i += 1;
    }
    x.i("MicroMsg.Label.ContactLabelStorage", "getAllLabelHasContact time:%s all:%s hascontact:%s stack:%s", new Object[] { Long.valueOf(bi.bH(l)), Integer.valueOf(localArrayList1.size()), Integer.valueOf(localArrayList2.size()), bi.cjd() });
    return localArrayList2;
  }
  
  final void aYG()
  {
    this.username = null;
    this.kAx = null;
    this.kAy = null;
    au.DF().b(635, this.kAz);
    au.DF().b(638, this.kAz);
  }
  
  public final void b(j.a parama)
  {
    e.aYJ().d(parama);
  }
  
  public final String bo(List<String> paramList)
  {
    if ((paramList == null) || (paramList.isEmpty()))
    {
      x.w("MicroMsg.Label.ContactLabelManagerImpl", "labelList is empty");
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramList.size();
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append((String)paramList.get(i));
      if (i < j - 1) {
        localStringBuilder.append(",");
      }
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public final void bp(List<String> paramList)
  {
    paramList = new a(paramList);
    au.DF().a(paramList, 0);
  }
  
  public final void dw(String paramString1, String paramString2)
  {
    try
    {
      x.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] user:%s labels:%s", new Object[] { paramString1, paramString2 });
      if (bi.oW(paramString2)) {
        x.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labels is null.");
      }
      for (;;)
      {
        return;
        paramString2 = (ArrayList)FB(paramString2);
        if ((paramString2 != null) && (!paramString2.isEmpty())) {
          break;
        }
        x.w("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel] labelList is null.");
      }
      this.username = paramString1;
    }
    finally {}
    this.kAx = paramString2;
    int j = paramString2.size();
    this.kAy = new ArrayList();
    int i = 0;
    for (;;)
    {
      if (i < j)
      {
        ad localad = e.aYJ().XX((String)paramString2.get(i));
        if ((localad != null) && (localad.field_isTemporary)) {
          this.kAy.add(paramString2.get(i));
        }
      }
      else
      {
        au.DF().a(635, this.kAz);
        au.DF().a(638, this.kAz);
        if ((this.kAy == null) || (this.kAy.isEmpty()))
        {
          g(paramString1, paramString2);
          aYG();
          break;
        }
        x.i("MicroMsg.Label.ContactLabelManagerImpl", "cpan[saveStrangerLabel]addList:%s", new Object[] { this.kAy.toString() });
        paramString1 = new a(this.kAy);
        au.DF().a(paramString1, 0);
        break;
      }
      i += 1;
    }
  }
  
  public final void g(List<String> paramList1, List<String> paramList2)
  {
    Object localObject1 = new HashMap();
    LinkedList localLinkedList = new LinkedList();
    Object localObject2;
    if (paramList1.size() > 0)
    {
      paramList1 = paramList1.iterator();
      paramList2 = paramList2.iterator();
      while (paramList1.hasNext())
      {
        localObject2 = (String)paramList1.next();
        Object localObject3 = bi.F(((String)paramList2.next()).split(","));
        if ((localObject3 != null) && (((List)localObject3).size() > 0))
        {
          localObject3 = ((List)localObject3).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            String str1 = (String)((Iterator)localObject3).next();
            Object localObject4;
            String str2;
            if (((Map)localObject1).containsKey(str1))
            {
              localObject4 = (String)((Map)localObject1).get(str1);
              str2 = c.dx((String)localObject4, (String)localObject2);
              if (!str2.equalsIgnoreCase((String)localObject4)) {
                ((Map)localObject1).put(str1, str2);
              }
            }
            else
            {
              au.HU();
              localObject4 = com.tencent.mm.model.c.FR().Yg(str1);
              if (localObject4 != null)
              {
                localObject4 = ((ai)localObject4).field_contactLabelIds;
                str2 = c.dx((String)localObject4, (String)localObject2);
                if (!str2.equalsIgnoreCase((String)localObject4)) {
                  ((Map)localObject1).put(str1, str2);
                }
              }
            }
          }
        }
      }
    }
    paramList1 = ((Map)localObject1).entrySet().iterator();
    while (paramList1.hasNext())
    {
      localObject1 = (Map.Entry)paramList1.next();
      paramList2 = (String)((Map.Entry)localObject1).getKey();
      localObject1 = (String)((Map.Entry)localObject1).getValue();
      localObject2 = new bxe();
      ((bxe)localObject2).hbL = paramList2;
      ((bxe)localObject2).rvl = ((String)localObject1);
      localLinkedList.add(localObject2);
    }
    if (localLinkedList.size() > 0)
    {
      paramList1 = new d(localLinkedList);
      au.DF().a(paramList1, 0);
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/label/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */