package com.tencent.mm.pluginsdk.model.app;

import android.net.Uri;

public final class aq
{
  public static aq qBc = null;
  public static long qBd = -1L;
  public int code = -1;
  public String[] projection = null;
  public String qBa = "";
  public String[] qBb = null;
  public String selection = "";
  public String[] selectionArgs = null;
  public Uri uri = null;
  
  public aq(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt, String[] paramArrayOfString3)
  {
    this.uri = paramUri;
    this.projection = paramArrayOfString1;
    this.selection = paramString1;
    this.selectionArgs = paramArrayOfString2;
    this.qBa = paramString2;
    this.code = paramInt;
    this.qBb = paramArrayOfString3;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/pluginsdk/model/app/aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */