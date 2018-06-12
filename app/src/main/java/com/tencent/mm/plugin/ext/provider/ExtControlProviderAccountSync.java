package com.tencent.mm.plugin.ext.provider;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.g.a.fe;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderAccountSync
  extends ExtContentProviderBase
{
  private static final UriMatcher iJT;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iJT = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.AccountSync", "accountSync", 1);
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
    x.d("MicroMsg.ExtControlAccountSyncProvider", "query()");
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
    if (!atA())
    {
      pr(1);
      return this.hdQ;
    }
    if (!df(getContext()))
    {
      x.w("MicroMsg.ExtControlAccountSyncProvider", "invalid appid ! return null");
      pr(2);
      return null;
    }
    switch (iJT.match(paramUri))
    {
    default: 
      pr(3);
      return null;
    }
    x.i("MicroMsg.ExtControlAccountSyncProvider", "startContactSync()");
    paramUri = new fe();
    if (a.sFg.m(paramUri))
    {
      pr(0);
      return null;
    }
    x.e("MicroMsg.ExtControlAccountSyncProvider", "AccountHelper == null");
    pr(4);
    return null;
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderAccountSync.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */