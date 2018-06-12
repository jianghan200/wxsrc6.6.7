package com.tencent.mm.model;

import android.database.Cursor;
import com.tencent.mm.kernel.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.az;

public final class k
{
  public static int GB()
  {
    int j;
    if (!g.Eg().Dx())
    {
      x.w("MicroMsg.BottleConversationLogic", "get Bottle Total Conversation Unread, but has not set uin");
      j = 0;
      return j;
    }
    Cursor localCursor = ((i)g.l(i.class)).FW().clJ();
    if ((localCursor != null) && (localCursor.getCount() > 0)) {
      localCursor.moveToFirst();
    }
    for (int i = localCursor.getInt(0);; i = 0)
    {
      j = i;
      if (localCursor == null) {
        break;
      }
      localCursor.close();
      return i;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */