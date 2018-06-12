package com.tencent.mm.plugin.fts.a.b;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;

public final class b
{
  private HashSet<String> jsP = new HashSet();
  public c jsQ = new c(' ');
  
  public final void CC(String paramString)
  {
    if (!this.jsP.add(paramString)) {
      return;
    }
    c localc = this.jsQ;
    char[] arrayOfChar = paramString.toLowerCase().toCharArray();
    int i = 0;
    paramString = localc;
    while (i < arrayOfChar.length)
    {
      int j = arrayOfChar[i] - 'a';
      if (paramString.jsR[j] == null) {
        paramString.jsR[j] = new c(arrayOfChar[i]);
      }
      paramString = paramString.jsR[j];
      i += 1;
    }
    paramString.jsO = true;
  }
  
  public final List<List<String>> CD(String paramString)
  {
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.offer(new a(0, 0, null));
    char[] arrayOfChar = paramString.toLowerCase().toCharArray();
    ArrayList localArrayList = new ArrayList();
    while (!localArrayDeque.isEmpty())
    {
      a locala = (a)localArrayDeque.poll();
      if (locala == null) {
        break;
      }
      int i = locala.end;
      Object localObject1 = this.jsQ;
      Object localObject2;
      while (i < arrayOfChar.length)
      {
        int j = arrayOfChar[i] - 'a';
        if (localObject1.jsR[j] == null) {
          break;
        }
        localObject1 = localObject1.jsR[j];
        if ((((c)localObject1).jsO) || (i == arrayOfChar.length - 1))
        {
          if (locala.ayR == null) {
            locala.ayR = new ArrayList();
          }
          localObject2 = new a(locala.end, i + 1, locala);
          locala.ayR.add(localObject2);
          if (((a)localObject2).end == arrayOfChar.length) {
            ((a)localObject2).jsO = true;
          }
          localArrayDeque.offer(localObject2);
        }
        i += 1;
      }
      if (locala.jsO)
      {
        localObject2 = new ArrayList();
        for (localObject1 = locala; localObject1 != null; localObject1 = ((a)localObject1).jsN) {
          if (((a)localObject1).end > ((a)localObject1).start) {
            ((List)localObject2).add(paramString.substring(((a)localObject1).start, ((a)localObject1).end));
          }
        }
        Collections.reverse((List)localObject2);
        localArrayList.add(localObject2);
      }
    }
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fts/a/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */