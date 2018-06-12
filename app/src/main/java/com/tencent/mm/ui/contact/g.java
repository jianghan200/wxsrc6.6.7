package com.tencent.mm.ui.contact;

import android.database.Cursor;
import com.tencent.mm.g.c.am;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.storage.ai;
import com.tencent.mm.storage.az;
import java.util.ArrayList;
import java.util.List;

public final class g
{
  private static final boolean NY(String paramString)
  {
    String[] arrayOfString = s.dAV;
    int j = arrayOfString.length;
    int i = 0;
    if (i < j) {
      if (!paramString.equals(arrayOfString[i])) {}
    }
    while ((s.fq(paramString)) || (s.hf(paramString)))
    {
      return false;
      i += 1;
      break;
    }
    return true;
  }
  
  static final List<String> dR(List<String> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = ((i)com.tencent.mm.kernel.g.l(i.class)).FW().a(s.dAN, paramList, true, null);
    if (paramList.moveToFirst())
    {
      int i = 0;
      do
      {
        ai localai = new ai();
        localai.d(paramList);
        int j = i;
        if (NY(localai.field_username))
        {
          localArrayList.add(localai.field_username);
          j = i + 1;
          if (j >= 4) {
            break;
          }
        }
        i = j;
      } while (paramList.moveToNext());
    }
    paramList.close();
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/contact/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */