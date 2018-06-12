package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.protocal.c.adj;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.io.IOException;

public final class l
  extends i<k>
  implements g.a
{
  public static final String[] diD = { i.a(k.dhO, "EmotionRewardInfo") };
  public e diF;
  
  public l(e parame)
  {
    super(parame, k.dhO, "EmotionRewardInfo", null);
    this.diF = parame;
  }
  
  public final adj ZF(String paramString)
  {
    Object localObject = null;
    Cursor localCursor = null;
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
      localObject = localCursor;
    }
    for (;;)
    {
      return (adj)localObject;
      localCursor = this.diF.a("EmotionRewardInfo", new String[] { "content" }, "productID=?", new String[] { paramString }, null, null, null, 2);
      paramString = (String)localObject;
      if (localCursor != null)
      {
        paramString = (String)localObject;
        if (!localCursor.moveToFirst()) {}
      }
      try
      {
        paramString = new adj();
        paramString.aG(localCursor.getBlob(0));
        localObject = paramString;
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        return paramString;
      }
      catch (IOException paramString)
      {
        for (;;)
        {
          x.e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", new Object[] { bi.i(paramString) });
          paramString = (String)localObject;
        }
      }
    }
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */