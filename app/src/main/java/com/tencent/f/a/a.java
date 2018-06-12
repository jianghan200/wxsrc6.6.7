package com.tencent.f.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
{
  public Object sNC = new Object();
  public HashMap<String, Object> vwN = new HashMap();
  c vwO;
  
  public final void a(d paramd, String[] paramArrayOfString)
  {
    if ((paramd == null) || (paramArrayOfString == null)) {
      return;
    }
    for (;;)
    {
      int i;
      Object localObject2;
      Object localObject3;
      synchronized (this.sNC)
      {
        int j = paramArrayOfString.length;
        i = 0;
        if (i >= j) {
          break label178;
        }
        localObject2 = paramArrayOfString[i];
        if (localObject2 == null) {
          break label182;
        }
        localObject3 = this.vwN.get(localObject2);
        if (localObject3 == null)
        {
          this.vwN.put(localObject2, paramd);
          break label182;
        }
        if (!(localObject3 instanceof d)) {
          break label140;
        }
        localObject3 = (d)localObject3;
        if (localObject3 == paramd) {
          return;
        }
      }
      LinkedList localLinkedList = new LinkedList();
      localLinkedList.add(localObject3);
      localLinkedList.add(paramd);
      this.vwN.put(localObject2, localLinkedList);
      break label182;
      label140:
      if ((localObject3 instanceof List))
      {
        localObject2 = (LinkedList)localObject3;
        if (((LinkedList)localObject2).indexOf(paramd) >= 0) {
          return;
        }
        ((LinkedList)localObject2).add(paramd);
        break label182;
        label178:
        return;
      }
      label182:
      i += 1;
    }
  }
  
  public final void c(String arg1, int paramInt, Object paramObject)
  {
    Object localObject2 = this.vwO;
    Object localObject1 = ((com.tencent.f.d)localObject2).cHq();
    if (localObject1 == null)
    {
      localObject1 = ((com.tencent.f.d)localObject2).cHp();
      localObject1 = (e)localObject1;
      ((e)localObject1).bTQ = ???;
      ((e)localObject1).vwQ = paramInt;
      ((e)localObject1).arg1 = 0;
      ((e)localObject1).arg2 = 0;
      ((e)localObject1).obj = paramObject;
      if ((localObject1 != null) && (((e)localObject1).bTQ != null))
      {
        System.currentTimeMillis();
        localObject2 = ((e)localObject1).bTQ;
      }
    }
    else
    {
      for (;;)
      {
        synchronized (this.sNC)
        {
          ??? = this.vwN.get(localObject2);
          if (??? == null) {
            break label279;
          }
          if ((??? instanceof d))
          {
            ??? = (d)???;
            paramObject = null;
            if (??? != null) {
              ???.dE((String)localObject2, ((e)localObject1).vwQ);
            }
            if (paramObject == null) {
              break label224;
            }
            ??? = ((LinkedList)paramObject).iterator();
            if (!???.hasNext()) {
              break label224;
            }
            ((d)???.next()).dE((String)localObject2, ((e)localObject1).vwQ);
            continue;
            ((com.tencent.f.e)localObject1).reset();
            break;
          }
          if (!(??? instanceof List)) {
            break label279;
          }
          paramObject = (LinkedList)((LinkedList)???).clone();
          ??? = null;
        }
        label224:
        paramObject = this.vwO;
        synchronized (((com.tencent.f.d)paramObject).mLock)
        {
          paramInt = ((com.tencent.f.d)paramObject).vwz.length;
          if (((com.tencent.f.d)paramObject).ndo < paramInt)
          {
            ((com.tencent.f.d)paramObject).vwz[paramObject.ndo] = localObject1;
            ((com.tencent.f.d)paramObject).ndo += 1;
          }
          return;
        }
        label279:
        ??? = null;
        paramObject = null;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/f/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */