package com.tencent.mm.storage.emotion;

import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.bt.h;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;

public final class f
  extends i<e>
  implements g.a
{
  public static final String[] diD = { i.a(e.dhO, "EmojiSuggestDescInfo") };
  private com.tencent.mm.sdk.e.e diF;
  
  public f(com.tencent.mm.sdk.e.e parame)
  {
    this(parame, e.dhO, "EmojiSuggestDescInfo");
  }
  
  private f(com.tencent.mm.sdk.e.e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.diF = parame;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final boolean ad(ArrayList<ArrayList<String>> paramArrayList)
  {
    if (paramArrayList.isEmpty())
    {
      x.i("MicroMsg.emoji.EmojiDescMapStorage", "group list is null.");
      return false;
    }
    h localh;
    long l;
    if ((this.diF instanceof h))
    {
      localh = (h)this.diF;
      l = localh.dO(Thread.currentThread().getId());
    }
    for (;;)
    {
      this.diF.delete("EmojiSuggestDescInfo", "", null);
      paramArrayList = paramArrayList.iterator();
      int i = 0;
      if (paramArrayList.hasNext())
      {
        Object localObject = (ArrayList)paramArrayList.next();
        if ((localObject == null) || (((ArrayList)localObject).isEmpty())) {
          break label204;
        }
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext())
        {
          String str = (String)((Iterator)localObject).next();
          if (!bi.oW(str))
          {
            x.d("MicroMsg.emoji.EmojiDescMapStorage", "insert groupID%s, word:%s", new Object[] { String.valueOf(i), str });
            b(new e(String.valueOf(i), str));
          }
        }
        i += 1;
      }
      label204:
      for (;;)
      {
        break;
        if (localh == null) {
          break label205;
        }
        localh.gp(l);
        return false;
      }
      label205:
      break;
      l = -1L;
      localh = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */