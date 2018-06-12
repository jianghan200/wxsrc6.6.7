package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements g.a
{
  public static final String[] diD = { com.tencent.mm.sdk.e.i.a(i.dhO, "EmotionDetailInfo") };
  public e diF;
  
  public j(e parame)
  {
    super(parame, i.dhO, "EmotionDetailInfo", null);
    this.diF = parame;
  }
  
  public final i ZE(String paramString)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
      paramString = (String)localObject1;
    }
    Cursor localCursor;
    do
    {
      return paramString;
      localCursor = this.diF.a("EmotionDetailInfo", new String[] { "content", "lan" }, "productID=?", new String[] { paramString }, null, null, null, 2);
      localObject1 = localObject2;
      if (localCursor != null)
      {
        localObject1 = localObject2;
        if (localCursor.moveToFirst())
        {
          localObject1 = new i();
          ((i)localObject1).field_content = localCursor.getBlob(0);
          ((i)localObject1).field_lan = localCursor.getString(1);
          ((i)localObject1).field_productID = paramString;
        }
      }
      paramString = (String)localObject1;
    } while (localCursor == null);
    localCursor.close();
    return (i)localObject1;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
  
  public final String getTableName()
  {
    return "EmotionDetailInfo";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */