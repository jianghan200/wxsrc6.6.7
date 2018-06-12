package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.bt.e;
import com.tencent.mm.g.a.ex;
import com.tencent.mm.g.a.ex.b;
import com.tencent.mm.g.a.ey;
import com.tencent.mm.g.a.ey.b;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import java.util.List;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public final class ExtControlProviderSNS
  extends ExtContentProviderBase
{
  private static final UriMatcher iJT;
  private static boolean iKs = false;
  private static al iKt = new al(new ExtControlProviderSNS.1(), false);
  private static final String[] iKv = { "feedId", "desc", "url", "nickname", "avatar", "timestamp", "mediaCount", "type", "bigImgUrl", "firstImgWidth", "firstImgHeight" };
  private boolean bNt = false;
  private boolean bNu = false;
  private int bNv = 0;
  private String iKw = "";
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iJT = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.SNS", "snsInfo", 17);
  }
  
  private Cursor aJb()
  {
    x.i("MicroMsg.ExtControlProviderSNS", "getSnsCursor() , needDownload = true");
    e locale = new e(iKv, (byte)0);
    Object localObject1 = new ex();
    ((ex)localObject1).bMJ.bML = this.iKw;
    if (!com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1))
    {
      locale.close();
      return null;
    }
    Cursor localCursor = ((ex)localObject1).bMK.bMC;
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        i = localCursor.getCount();
        x.i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), snsCount = " + i);
        ey localey;
        if ((i > 0) && (localCursor.moveToFirst()))
        {
          if (localCursor != null)
          {
            localey = new ey();
            localey.bMM.bMO = localCursor;
            if (!com.tencent.mm.sdk.b.a.sFg.m(localey)) {
              x.w("MicroMsg.ExtControlProviderSNS", "ExtGetSnsDataEvent publish error");
            }
          }
          else
          {
            if (localCursor.moveToNext()) {
              continue;
            }
          }
        }
        else
        {
          x.i("MicroMsg.ExtControlProviderSNS", "in getSnsCursor(), matrixCursor Count = " + locale.getCount());
          localCursor.close();
          break label809;
        }
        au.HU();
        Object localObject2 = com.tencent.mm.model.c.FR().Ye(localey.bMN.bMP);
        if ((localObject2 == null) || ((int)((com.tencent.mm.l.a)localObject2).dhP <= 0)) {
          continue;
        }
        String str3 = "";
        switch (localey.bMN.bMT)
        {
        case 2: 
          if ((localey.bMN.bMV == null) || (localey.bMN.bMV.size() <= 0) || (getContext() == null)) {
            break label803;
          }
          x.d("MicroMsg.ExtControlProviderSNS", "uris.size() = [%s]", new Object[] { Integer.valueOf(localey.bMN.bMV.size()) });
          if ((i != 2) && (i != 6) && (i != 3) && (i != 4)) {
            break label803;
          }
          localObject1 = (String)localey.bMN.bMV.get(0);
          String str2 = str3;
          if (localey.bMN.bMW != null)
          {
            str2 = str3;
            if (localey.bMN.bMW.size() > 0)
            {
              str2 = str3;
              if (getContext() != null)
              {
                x.d("MicroMsg.ExtControlProviderSNS", "bigImgUris.size() = [%s], firstImgWidth = [%s], firstImgHeight = [%s]", new Object[] { Integer.valueOf(localey.bMN.bMW.size()), Integer.valueOf(localey.bMN.bMX), Integer.valueOf(localey.bMN.bMY) });
                if ((i != 2) && (i != 6) && (i != 3))
                {
                  str2 = str3;
                  if (i != 4) {}
                }
                else
                {
                  str2 = (String)localey.bMN.bMW.get(0);
                }
              }
            }
          }
          str3 = com.tencent.mm.aa.c.A(localey.bMN.bMP, false);
          try
          {
            String str4 = com.tencent.mm.plugin.ext.a.a.dc(localey.bMN.bMQ);
            String str5 = localey.bMN.bMR;
            String str6 = ((ab)localObject2).BL();
            localObject2 = str3;
            if (str3 == null) {
              localObject2 = "";
            }
            locale.addRow(new Object[] { str4, str5, localObject1, str6, localObject2, Long.valueOf(localey.bMN.bMS), Integer.valueOf(localey.bMN.bMU), Integer.valueOf(i), str2, Integer.valueOf(localey.bMN.bMX), Integer.valueOf(localey.bMN.bMY) });
          }
          catch (Exception localException1)
          {
            x.e("MicroMsg.ExtControlProviderSNS", localException1.getMessage());
            x.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException1, "", new Object[0]);
          }
          continue;
          i = 1;
        }
      }
      catch (Exception localException2)
      {
        x.e("MicroMsg.ExtControlProviderSNS", localException2.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException2, "", new Object[0]);
        if (localCursor != null) {
          localCursor.close();
        }
        locale.close();
        return null;
      }
      continue;
      int i = 2;
      continue;
      i = 3;
      continue;
      i = 6;
      continue;
      i = 4;
      continue;
      label803:
      String str1 = "";
      continue;
      label809:
      return locale;
      i = 5;
    }
  }
  
  private static void cz(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      iKs = true;
      iKt.J(15000L, 15000L);
      return;
    }
    iKt.J(0L, 0L);
  }
  
  private Cursor dd(long paramLong)
  {
    int i = 1;
    x.i("MicroMsg.ExtControlProviderSNS", "handleGetSnsInfo() userId = " + paramLong);
    try
    {
      x.i("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo, userId=[%s]", new Object[] { Long.valueOf(paramLong) });
      ab localab;
      if (paramLong == 0L)
      {
        au.HU();
        localab = com.tencent.mm.model.c.FR().Ye(q.GF());
        if ((localab != null) && ((int)localab.dhP > 0)) {
          break label122;
        }
        x.e("MicroMsg.ExtControlProviderSNS", "ct == null");
        i = 0;
      }
      for (;;)
      {
        if (i != 0) {
          break label243;
        }
        x.w("MicroMsg.ExtControlProviderSNS", "startGetSNSInfo() return false");
        return null;
        au.HU();
        localab = com.tencent.mm.model.c.FR().gl(paramLong);
        break;
        label122:
        this.bNt = com.tencent.mm.l.a.gd(localab.field_type);
        this.bNu = q.gQ(localab.field_username);
        x.d("MicroMsg.ExtControlProviderSNS", "ct.getUsername()=[%s], isFriend=[%s], isSelf=[%s]", new Object[] { localab.field_username, Boolean.valueOf(this.bNt), Boolean.valueOf(this.bNu) });
        com.tencent.mm.pluginsdk.d.a.b localb = new com.tencent.mm.pluginsdk.d.a.b();
        localb.b(10000L, new ExtControlProviderSNS.2(this, localab, localb));
      }
      return aJb();
    }
    catch (Exception localException)
    {
      x.e("MicroMsg.ExtControlProviderSNS", localException.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlProviderSNS", localException, "", new Object[0]);
    }
  }
  
  public final int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public final String getType(Uri paramUri)
  {
    return null;
  }
  
  public final Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public final boolean onCreate()
  {
    return false;
  }
  
  public final Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.i("MicroMsg.ExtControlProviderSNS", "query() " + paramUri);
    a(paramUri, getContext(), iJT);
    if (paramUri == null)
    {
      pr(3);
      return null;
    }
    if ((bi.oW(this.iJN)) || (bi.oW(aIW())))
    {
      pr(3);
      return null;
    }
    if (iKs)
    {
      x.w("MicroMsg.ExtControlProviderSNS", "isBusy, return null");
      pr(5);
      return null;
    }
    cz(true);
    if (!atA())
    {
      cz(false);
      pr(1);
      return this.hdQ;
    }
    if (!df(getContext()))
    {
      x.w("MicroMsg.ExtControlProviderSNS", "invalid appid ! return null");
      cz(false);
      pr(2);
      return null;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
    {
      x.e("MicroMsg.ExtControlProviderSNS", "invaild selections");
      cz(false);
      pr(3);
      return null;
    }
    paramArrayOfString1 = paramArrayOfString2[0];
    if (bi.oW(paramArrayOfString1))
    {
      x.e("MicroMsg.ExtControlProviderSNS", "userIdStr should not be null or nil");
      cz(false);
      pr(3);
      return null;
    }
    for (;;)
    {
      try
      {
        boolean bool = "0".equals(paramArrayOfString1.trim());
        long l;
        if (bool) {
          l = 0L;
        }
        switch (iJT.match(paramUri))
        {
        default: 
          paramUri = null;
          if (paramUri == null) {
            break label334;
          }
          pr(0);
          cz(false);
          return paramUri;
          l = Long.valueOf(com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString1.trim())).longValue();
          break;
        case 17: 
          paramUri = dd(l);
        }
      }
      catch (Exception paramUri)
      {
        x.e("MicroMsg.ExtControlProviderSNS", paramUri.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderSNS", paramUri, "", new Object[0]);
        cz(false);
        pr(4);
        return null;
      }
      continue;
      label334:
      pr(4);
    }
  }
  
  public final int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderSNS.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */