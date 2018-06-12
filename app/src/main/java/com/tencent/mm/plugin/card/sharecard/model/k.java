package com.tencent.mm.plugin.card.sharecard.model;

import android.database.Cursor;
import android.text.TextUtils;
import com.tencent.mm.plugin.card.sharecard.a.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class k
  extends i<ShareCardInfo>
{
  public static final String[] diD = { i.a(ShareCardInfo.dhO, "ShareCardInfo") };
  public e diF;
  
  public k(e parame)
  {
    super(parame, ShareCardInfo.dhO, "ShareCardInfo", null);
    this.diF = parame;
  }
  
  public static String nM(int paramInt)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    ArrayList localArrayList = b.nJ(paramInt);
    if ((localArrayList != null) && (localArrayList.size() > 0))
    {
      localStringBuilder.append(" (");
      paramInt = 0;
      while (paramInt < localArrayList.size())
      {
        if (paramInt != 0) {
          localStringBuilder.append(" OR ");
        }
        localStringBuilder.append("card_id").append(" = '" + (String)localArrayList.get(paramInt) + "' ");
        paramInt += 1;
      }
      localStringBuilder.append(") AND ");
      return localStringBuilder.toString();
    }
    return "";
  }
  
  public final boolean I(String paramString, int paramInt1, int paramInt2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "update ShareCardInfo set categoryType = '" + paramInt1 + "', itemIndex = '" + paramInt2 + "' " + localStringBuilder.toString();
    boolean bool = this.diF.fV("ShareCardInfo", paramString);
    paramString = new StringBuilder("updateCategoryInfo updateRet is ");
    if (bool) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      x.i("MicroMsg.ShareCardInfoStorage", paramInt1);
      return bool;
    }
  }
  
  public final String ce(String paramString1, String paramString2)
  {
    x.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString2 + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 2");
    paramString2 = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    Cursor localCursor = this.diF.b(paramString2, null, 2);
    if (localCursor == null)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), cursor == null");
      return "";
    }
    int i = localCursor.getColumnIndex("card_id");
    if (i == -1)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryNewCardIdByCardtpId(), index is wrong");
      localCursor.close();
      return "";
    }
    paramString2 = "";
    while (localCursor.moveToNext())
    {
      localObject = localCursor.getString(i);
      paramString2 = (String)localObject;
      if (paramString1 != null)
      {
        paramString2 = (String)localObject;
        if (!paramString1.equals(localObject)) {
          paramString2 = (String)localObject;
        }
      }
    }
    localCursor.close();
    return paramString2;
  }
  
  public final boolean nN(int paramInt)
  {
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (");
    ((StringBuilder)localObject).append("categoryType").append(" = '" + paramInt + "'");
    ((StringBuilder)localObject).append(")");
    localObject = "update ShareCardInfo set categoryType = '0' , itemIndex = '0' " + ((StringBuilder)localObject).toString();
    boolean bool = this.diF.fV("ShareCardInfo", (String)localObject);
    localObject = new StringBuilder("resetCategoryInfo updateRet is ");
    if (bool) {}
    for (paramInt = 1;; paramInt = 0)
    {
      x.i("MicroMsg.ShareCardInfoStorage", paramInt);
      return bool;
    }
  }
  
  public final String xA(String paramString)
  {
    x.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId()");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 1");
    paramString = "select ShareCardInfo.card_id from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.diF.b(paramString, null, 2);
    if (localObject == null)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), cursor == null");
      return "";
    }
    int i = ((Cursor)localObject).getColumnIndex("card_id");
    if (i == -1)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryCardIdByCardtpId(), index is wrong");
      ((Cursor)localObject).close();
      return "";
    }
    paramString = "";
    if (((Cursor)localObject).moveToFirst()) {
      paramString = ((Cursor)localObject).getString(i);
    }
    ((Cursor)localObject).close();
    return paramString;
  }
  
  public final void xB(String paramString)
  {
    paramString = "delete from ShareCardInfo where card_id = '" + paramString + "'";
    this.diF.fV("ShareCardInfo", paramString);
  }
  
  public final ShareCardInfo xC(String paramString)
  {
    ShareCardInfo localShareCardInfo = new ShareCardInfo();
    localShareCardInfo.field_card_id = paramString;
    if (super.b(localShareCardInfo, new String[0])) {
      return localShareCardInfo;
    }
    return null;
  }
  
  public final ArrayList<String> xy(String paramString)
  {
    x.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), limit is 99");
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(" where ( status=0) ");
    ((StringBuilder)localObject).append(" AND (card_tp_id = '" + paramString + "' )");
    ((StringBuilder)localObject).append(" order by share_time desc ");
    ((StringBuilder)localObject).append(" limit 99");
    localObject = "select ShareCardInfo.from_username from ShareCardInfo" + ((StringBuilder)localObject).toString();
    localObject = this.diF.b((String)localObject, null, 2);
    if (localObject == null)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), cursor == null");
      return null;
    }
    int i = ((Cursor)localObject).getColumnIndex("from_username");
    if (i == -1)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "queryNameByCardtpId(), index is wrong");
      ((Cursor)localObject).close();
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    for (;;)
    {
      if (((Cursor)localObject).moveToNext())
      {
        String str = ((Cursor)localObject).getString(i);
        if ((TextUtils.isEmpty(str)) || (localArrayList.contains(str))) {
          break label209;
        }
        localArrayList.add(str);
      }
      while (localArrayList.size() >= 99)
      {
        ((Cursor)localObject).close();
        return localArrayList;
        label209:
        x.e("MicroMsg.ShareCardInfoStorage", "the field_from_username is empty or username is added!, the card id is " + paramString);
      }
    }
  }
  
  public final int xz(String paramString)
  {
    int i = 0;
    x.i("MicroMsg.ShareCardInfoStorage", "getNormalCount()");
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(" where ( status=0) ");
    localStringBuilder.append(" AND (card_tp_id = '" + paramString + "' )");
    paramString = "select count(*) from ShareCardInfo" + localStringBuilder.toString();
    paramString = this.diF.b(paramString, null, 2);
    if (paramString == null)
    {
      x.i("MicroMsg.ShareCardInfoStorage", "getNormalCount(), cursor == null");
      return 0;
    }
    if (paramString.moveToFirst()) {
      i = paramString.getInt(0);
    }
    paramString.close();
    return i;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/card/sharecard/model/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */