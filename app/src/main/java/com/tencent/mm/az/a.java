package com.tencent.mm.az;

import android.database.Cursor;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ba;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bd.d;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import java.util.ArrayList;

public final class a
{
  public static ArrayList<bd> d(long[] paramArrayOfLong)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfLong != null)
    {
      int i = 0;
      while (i < paramArrayOfLong.length)
      {
        com.tencent.mm.model.au.HU();
        localArrayList.add(c.FT().dW(paramArrayOfLong[i]));
        i += 1;
      }
    }
    return localArrayList;
  }
  
  public static ArrayList<String> nv(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = d.SG().dd(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(paramString[i].field_sayhicontent);
        i += 1;
      }
    }
    x.d("MicroMsg.ExposeDataLogic", "get lbs sayhi msg content");
    return localArrayList;
  }
  
  public static ArrayList<String> nw(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = d.SH().df(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        localArrayList.add(paramString[i].field_sayhicontent);
        i += 1;
      }
    }
    x.d("MicroMsg.ExposeDataLogic", "get shake sayhi msg content");
    return localArrayList;
  }
  
  public static ArrayList<String> nx(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.model.au.HU();
    paramString = c.FT().GN(paramString);
    int i;
    if ((paramString != null) && (paramString.getCount() != 0)) {
      if (paramString.moveToFirst())
      {
        i = 0;
        if (!paramString.isAfterLast())
        {
          bd localbd = new bd();
          localbd.d(paramString);
          paramString.moveToNext();
          if (!localbd.isText()) {
            break label115;
          }
          localArrayList.add(localbd.field_content);
        }
      }
    }
    for (;;)
    {
      int j = i + 1;
      i = j;
      if (j != 10) {
        break;
      }
      paramString.close();
      return localArrayList;
      label115:
      localArrayList.add("");
    }
  }
  
  public static ArrayList<String> v(int paramInt, String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = d.SE().dc(paramString, 10);
    if (paramString != null)
    {
      int j = paramString.length;
      int i = 0;
      while (i < j)
      {
        Object localObject = paramString[i];
        if (((at)localObject).field_type == 1) {
          localArrayList.add(bi.oV(bd.d.YY(((at)localObject).field_msgContent).content));
        }
        i += 1;
      }
    }
    x.d("MicroMsg.ExposeDataLogic", "getFMessageContent,scene:%d", new Object[] { Integer.valueOf(paramInt) });
    return localArrayList;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/az/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */