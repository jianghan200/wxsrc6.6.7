package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends i<k>
{
  public static final String[] diD = { i.a(k.dhO, "CardQrCodeDataInfo") };
  public e diF;
  
  public l(e parame)
  {
    super(parame, k.dhO, "CardQrCodeDataInfo", k.ciG);
    this.diF = parame;
  }
  
  public final boolean ca(String paramString1, String paramString2)
  {
    k localk = new k();
    localk.field_card_id = paramString1;
    localk.field_code_id = paramString2;
    boolean bool = a(localk, new String[] { "card_id", "code_id" });
    if (!bool)
    {
      x.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  failure! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
      return bool;
    }
    x.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  success! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
    return bool;
  }
  
  public final boolean jy(String paramString)
  {
    k localk = new k();
    localk.field_card_id = paramString;
    boolean bool = a(localk, new String[] { "card_id" });
    if (!bool)
    {
      x.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  failure! card_id = %s", new Object[] { paramString });
      return bool;
    }
    x.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  success! card_id = %s", new Object[] { paramString });
    return bool;
  }
  
  public final List<k> xo(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = this.diF.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { paramString });
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        if (paramString.moveToNext())
        {
          k localk = new k();
          localk.d(paramString);
          localArrayList.add(localk);
          continue;
        }
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeByCardId error!", new Object[] { localException.getMessage() });
        return localArrayList;
        return localArrayList;
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final k xp(String paramString)
  {
    localCursor = this.diF.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=0  limit 1", new String[] { paramString });
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToPosition(0);
          localObject1 = new k();
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        paramString = null;
        x.e("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId error!", new Object[] { localException1.getMessage() });
        localObject2 = paramString;
        return paramString;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      try
      {
        ((k)localObject1).d(localCursor);
        x.i("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId  success! card_id = %s, code_id = %s ", new Object[] { paramString, ((k)localObject1).field_code_id });
        paramString = (String)localObject1;
        localObject1 = paramString;
        if (localCursor != null)
        {
          localCursor.close();
          localObject1 = paramString;
        }
        return (k)localObject1;
      }
      catch (Exception localException2)
      {
        paramString = (String)localObject2;
        localObject2 = localException2;
        continue;
      }
      x.e("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId  is empty! card_id = %s", new Object[] { paramString });
      paramString = null;
    }
  }
  
  public final k xq(String paramString)
  {
    localCursor = this.diF.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=1  limit 1", new String[] { paramString });
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToPosition(0);
          localObject1 = new k();
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        paramString = null;
        x.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId error!", new Object[] { localException1.getMessage() });
        localObject2 = paramString;
        return paramString;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      try
      {
        ((k)localObject1).d(localCursor);
        x.i("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId  success! card_id = %s, code_id = %s ", new Object[] { paramString, ((k)localObject1).field_code_id });
        paramString = (String)localObject1;
        localObject1 = paramString;
        if (localCursor != null)
        {
          localCursor.close();
          localObject1 = paramString;
        }
        return (k)localObject1;
      }
      catch (Exception localException2)
      {
        paramString = (String)localObject2;
        localObject2 = localException2;
        continue;
      }
      x.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId  is empty! card_id = %s", new Object[] { paramString });
      paramString = null;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/card/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */