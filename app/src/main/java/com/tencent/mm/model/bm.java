package com.tencent.mm.model;

import android.database.Cursor;
import android.database.MergeCursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class bm
{
  private ay dDg;
  private e diF;
  
  public bm(e parame, ay paramay)
  {
    this.diF = parame;
    this.dDg = paramay;
  }
  
  private static String a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(" and (username in (");
    localStringBuffer.append("select chatroomname from chatroom where ");
    if ((paramArrayList2 != null) && (paramArrayList2.size() != 0))
    {
      paramArrayList2 = paramArrayList2.iterator();
      while (paramArrayList2.hasNext())
      {
        String str = (String)paramArrayList2.next();
        localStringBuffer.append("chatroomname != '" + str + "' and ");
      }
    }
    localStringBuffer.append("(memberlist like '%" + paramString + "%'");
    paramString = paramArrayList1.iterator();
    while (paramString.hasNext())
    {
      paramArrayList1 = (String)paramString.next();
      localStringBuffer.append(" or memberlist like '%" + paramArrayList1 + "%'");
    }
    if ((paramArrayList3 != null) && (paramArrayList3.size() != 0))
    {
      paramString = paramArrayList3.iterator();
      while (paramString.hasNext())
      {
        paramArrayList1 = (String)paramString.next();
        localStringBuffer.append(" or chatroomname = '" + paramArrayList1 + "'");
      }
    }
    localStringBuffer.append(")))");
    return localStringBuffer.toString();
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    return a(paramString1, paramString2, paramList1, true, 2, paramList2);
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList, boolean paramBoolean)
  {
    return a(paramString1, paramString2, paramList, paramBoolean, 1, null);
  }
  
  public final Cursor a(String paramString1, String paramString2, List<String> paramList1, boolean paramBoolean, int paramInt, List<String> paramList2)
  {
    Object localObject = "select * ,rowid from rcontact ";
    if (paramInt == 2) {
      localObject = "select 2, *,rowid from rcontact ";
    }
    paramString2 = (String)localObject + this.dDg.e(paramString2, null, paramList1) + this.dDg.Yn(paramString1) + this.dDg.MD();
    x.v("Micro.SimpleSearchConversationModel", paramString2);
    paramString2 = this.diF.rawQuery(paramString2, null);
    if (paramBoolean)
    {
      localObject = new ArrayList();
      ArrayList localArrayList = new ArrayList();
      while (paramString2.moveToNext())
      {
        String str = paramString2.getString(paramString2.getColumnIndex("username"));
        if (!str.endsWith("@chatroom")) {
          ((ArrayList)localObject).add(str);
        } else {
          localArrayList.add(str);
        }
      }
      if ((paramList2 != null) && (paramList2.size() != 0)) {
        ((ArrayList)localObject).addAll(paramList2);
      }
      if (((ArrayList)localObject).size() != 0) {
        return new MergeCursor(new Cursor[] { paramString2, a(paramString1, (ArrayList)localObject, localArrayList, null, paramList1) });
      }
    }
    return paramString2;
  }
  
  public final Cursor a(String paramString, ArrayList<String> paramArrayList1, ArrayList<String> paramArrayList2, ArrayList<String> paramArrayList3, List<String> paramList)
  {
    paramString = "select * ,rowid from rcontact " + this.dDg.e("@all.contact.android", "", paramList) + a(paramString, paramArrayList1, paramArrayList2, paramArrayList3) + this.dDg.MD();
    x.v("Micro.SimpleSearchConversationModel", "roomsSql " + paramString);
    return this.diF.rawQuery(paramString, null);
  }
  
  public final Cursor b(String paramString1, String paramString2, List<String> paramList1, List<String> paramList2)
  {
    return a(paramString1, paramString2, paramList1, true, 2, paramList2);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/model/bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */