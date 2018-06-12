package com.tencent.mm.booter;

import com.tencent.mm.model.au;
import com.tencent.mm.model.br;
import com.tencent.mm.protocal.c.aqa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.w;
import java.util.LinkedList;

public final class i
{
  public static void run()
  {
    LinkedList localLinkedList = new LinkedList();
    int j = bi.a((Integer)au.HS().get(19), 0);
    int i = 0;
    aqa localaqa;
    while (i < j)
    {
      localaqa = new aqa();
      localaqa.mEb = 31;
      localaqa.mEl = "0";
      localLinkedList.add(localaqa);
      i += 1;
    }
    j = bi.a((Integer)au.HS().get(20), 0);
    i = 0;
    while (i < j)
    {
      localaqa = new aqa();
      localaqa.mEb = 31;
      localaqa.mEl = "1";
      localLinkedList.add(localaqa);
      i += 1;
    }
    if (localLinkedList.size() > 0)
    {
      br.b(localLinkedList);
      au.HS().set(19, Integer.valueOf(0));
      au.HS().set(20, Integer.valueOf(0));
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/booter/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */