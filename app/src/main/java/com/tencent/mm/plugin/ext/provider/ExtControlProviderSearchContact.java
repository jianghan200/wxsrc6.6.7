package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bm;
import com.tencent.mm.model.c;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.bd;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderSearchContact
  extends ExtContentProviderBase
{
  private static List<String> gRN;
  private static final String[] iKv;
  private Cursor iKz = null;
  
  static
  {
    int i = 0;
    iKv = new String[] { "userId", "nickname", "avatar", "content", "msgId", "msgType" };
    gRN = new ArrayList();
    String[] arrayOfString = s.dAV;
    int j = arrayOfString.length;
    while (i < j)
    {
      String str = arrayOfString[i];
      gRN.add(str);
      i += 1;
    }
    gRN.add("officialaccounts");
    gRN.add("helper_entry");
  }
  
  public static Cursor h(Cursor paramCursor)
  {
    com.tencent.mm.bt.e locale = new com.tencent.mm.bt.e(iKv, (byte)0);
    for (;;)
    {
      try
      {
        if (paramCursor.moveToFirst())
        {
          int i = 0;
          i += 1;
          localObject2 = new ab();
          ((ab)localObject2).d(paramCursor);
          if (!s.fq(((ai)localObject2).field_username))
          {
            localObject3 = q.KJ().b(((ai)localObject2).field_username, true, 0);
            if (localObject3 != null)
            {
              localObject1 = new ByteArrayOutputStream();
              ((Bitmap)localObject3).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject1);
              au.HU();
              localObject3 = c.FT().bH(((ai)localObject2).field_username, 1);
              if ((localObject3 == null) || (localObject3.length != 1)) {
                continue;
              }
              String str1 = com.tencent.mm.plugin.ext.a.a.dc((int)((com.tencent.mm.l.a)localObject2).dhP);
              String str2 = ((ab)localObject2).BL();
              if (localObject1 != null) {
                continue;
              }
              localObject1 = null;
              if (localObject3[0].getType() != 1) {
                break label383;
              }
              localObject2 = localObject3[0].field_content;
              locale.addRow(new Object[] { str1, str2, localObject1, localObject2, com.tencent.mm.plugin.ext.a.a.dc(localObject3[0].field_msgId), Integer.valueOf(com.tencent.mm.plugin.ext.b.b.P(localObject3[0])) });
            }
          }
          else
          {
            if ((paramCursor.moveToNext()) && (i < 15)) {
              break label380;
            }
          }
        }
        else
        {
          paramCursor.close();
          return locale;
        }
        x.w("MicroMsg.ExtControlProviderSearchContact", "get useravatar is null");
        Object localObject1 = null;
        continue;
        localObject1 = ((ByteArrayOutputStream)localObject1).toByteArray();
        continue;
        x.w("MicroMsg.ExtControlProviderSearchContact", "get msginfo failed");
        Object localObject3 = com.tencent.mm.plugin.ext.a.a.dc((int)((com.tencent.mm.l.a)localObject2).dhP);
        localObject2 = ((ab)localObject2).BL();
        if (localObject1 == null)
        {
          localObject1 = null;
          locale.addRow(new Object[] { localObject3, localObject2, localObject1, "", "0", Integer.valueOf(0) });
          continue;
        }
        byte[] arrayOfByte = localException.toByteArray();
      }
      catch (Exception localException)
      {
        x.e("MicroMsg.ExtControlProviderSearchContact", localException.getMessage());
        x.printErrStackTrace("MicroMsg.ExtControlProviderSearchContact", localException, "", new Object[0]);
        if (paramCursor != null) {
          paramCursor.close();
        }
        locale.close();
        return null;
      }
      continue;
      label380:
      continue;
      label383:
      Object localObject2 = "";
    }
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }
  
  public boolean onCreate()
  {
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    x.d("MicroMsg.ExtControlProviderSearchContact", "query()");
    a(paramUri, getContext(), 16);
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
    if (!atA())
    {
      pr(1);
      return this.hdQ;
    }
    if (!df(getContext()))
    {
      x.w("MicroMsg.ExtControlProviderSearchContact", "invalid appid ! return null");
      pr(2);
      return null;
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length == 0))
    {
      x.e("MicroMsg.ExtControlProviderSearchContact", "invaild selections");
      pr(3);
      return null;
    }
    paramUri = paramArrayOfString2[0].trim();
    if (bi.oW(paramUri))
    {
      x.e("MicroMsg.ExtControlProviderSearchContact", "filter should not be null or nil");
      pr(3);
      return null;
    }
    paramUri = au.HU().dAc.a(paramUri, "@micromsg.no.verify.biz.qq.com", gRN, false, 1, null);
    if (paramUri == null)
    {
      x.e("MicroMsg.ExtControlProviderSearchContact", "cursor is null");
      pr(3);
      return null;
    }
    paramArrayOfString1 = new com.tencent.mm.pluginsdk.d.a.b();
    paramArrayOfString1.b(4000L, new ExtControlProviderSearchContact.1(this, paramUri, paramArrayOfString1));
    if (this.iKz != null) {
      pr(0);
    }
    for (;;)
    {
      return this.iKz;
      pr(4);
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderSearchContact.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */