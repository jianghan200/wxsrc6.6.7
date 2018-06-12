package com.tencent.mm.plugin.ext.provider;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import com.jg.JgClassChecked;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.ext.b;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bu;
import com.tencent.mm.storage.bv;

@JgClassChecked(author=32, fComment="checked", lastDate="20141016", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class ExtControlProviderEntry
  extends ExtContentProviderBase
{
  private static final UriMatcher iJT;
  private String[] iJE = null;
  private int iJF = -1;
  private boolean iJU = false;
  private Context iJV;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    iJT = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.plugin.ext.entry", "view_profile", 2);
    iJT.addURI("com.tencent.mm.plugin.ext.entry", "to_chatting", 3);
    iJT.addURI("com.tencent.mm.plugin.ext.entry", "to_nearby", 4);
    iJT.addURI("com.tencent.mm.plugin.ext.entry", "sns_comment_detail", 5);
    iJT.addURI("com.tencent.mm.plugin.ext.entry", "share_time_line", 6);
  }
  
  public ExtControlProviderEntry() {}
  
  public ExtControlProviderEntry(String[] paramArrayOfString, int paramInt, Context paramContext)
  {
    this.iJU = true;
    this.iJE = paramArrayOfString;
    this.iJF = paramInt;
    this.iJV = paramContext;
  }
  
  private Cursor b(String[] paramArrayOfString, String paramString)
  {
    x.i("MicroMsg.ExtControlEntryProvider", "toChattingUI");
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      cw(3, 3601);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3601);
    }
    if (bi.oW(paramString))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "callSource == null");
      cw(3, 3602);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3602);
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
      cw(3, 3603);
      return com.tencent.mm.pluginsdk.d.a.a.BA(3603);
    }
    if ((paramString != null) && (paramString.equalsIgnoreCase("openapi"))) {}
    for (int i = 1;; i = 0)
    {
      if (i != 0) {}
      for (;;)
      {
        try
        {
          paramArrayOfString = b.aIM().Zq(paramArrayOfString);
          if ((paramArrayOfString == null) || (bi.oW(paramArrayOfString.field_openId)) || (bi.oW(paramArrayOfString.field_username)))
          {
            x.e("MicroMsg.ExtControlEntryProvider", "openidInApp is null");
            cw(3, 3604);
            return com.tencent.mm.pluginsdk.d.a.a.BA(3604);
          }
          au.HU();
          paramArrayOfString = c.FR().Yg(paramArrayOfString.field_username);
          if ((paramArrayOfString != null) && ((int)paramArrayOfString.dhP > 0) && (this.iJV != null)) {
            break;
          }
          x.e("MicroMsg.ExtControlEntryProvider", "wrong args ct");
          cw(3, 3605);
          return com.tencent.mm.pluginsdk.d.a.a.BA(3605);
        }
        catch (Exception paramArrayOfString)
        {
          x.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
          x.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
          H(5, 4, 12);
          return com.tencent.mm.pluginsdk.d.a.a.BA(12);
        }
        au.HU();
        paramArrayOfString = c.FR().gl(com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString));
      }
      paramString = new Intent();
      paramString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.chatting.ChattingUI"));
      paramString.putExtra("Chat_User", paramArrayOfString.field_username);
      paramString.putExtra("finish_direct", true);
      paramString.addFlags(268435456);
      paramString.addFlags(67108864);
      this.iJV.startActivity(paramString);
      H(4, 0, 1);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    }
  }
  
  private Cursor m(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      pr(3);
      return null;
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "contactId == null");
      pr(3);
      return null;
    }
    try
    {
      au.HU();
      paramArrayOfString = c.FR().gl(com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString));
      if ((paramArrayOfString == null) || ((int)paramArrayOfString.dhP <= 0) || (this.iJV == null))
      {
        pr(3);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      x.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
      pr(3);
      return null;
    }
    Intent localIntent = new Intent();
    localIntent.addFlags(268435456);
    localIntent.putExtra("Contact_User", paramArrayOfString.field_username);
    d.b(this.iJV, "profile", ".ui.ContactInfoUI", localIntent);
    pr(0);
    return com.tencent.mm.pluginsdk.d.a.a.BA(1);
  }
  
  private Cursor n(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      pr(3);
      return null;
    }
    paramArrayOfString = paramArrayOfString[0];
    if ((paramArrayOfString == null) || (paramArrayOfString.length() <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      pr(3);
      return null;
    }
    long l;
    try
    {
      l = com.tencent.mm.plugin.ext.a.a.AG(paramArrayOfString);
      if (l <= 0L)
      {
        pr(3);
        return null;
      }
    }
    catch (Exception paramArrayOfString)
    {
      x.w("MicroMsg.ExtControlEntryProvider", paramArrayOfString.getMessage());
      x.printErrStackTrace("MicroMsg.ExtControlEntryProvider", paramArrayOfString, "", new Object[0]);
      pr(3);
      return null;
    }
    if (this.iJV == null)
    {
      pr(4);
      return null;
    }
    paramArrayOfString = new Intent();
    paramArrayOfString.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.sns.ui.SnsCommentDetailUI"));
    paramArrayOfString.putExtra("INTENT_SNS_LOCAL_ID", (int)l);
    paramArrayOfString.addCategory("android.intent.category.DEFAULT");
    paramArrayOfString.addFlags(268435456);
    this.iJV.startActivity(paramArrayOfString);
    pr(0);
    return com.tencent.mm.pluginsdk.d.a.a.BA(1);
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
    x.i("MicroMsg.ExtControlEntryProvider", "ExtControlProviderEntry query() mIsLocalUsed :" + this.iJU);
    if (this.iJU)
    {
      a(paramUri, this.iJV, this.iJF, this.iJE);
      if (bi.oW(this.iJN))
      {
        x.e("MicroMsg.ExtControlEntryProvider", "AppID == null");
        cw(3, 7);
        return com.tencent.mm.pluginsdk.d.a.a.BA(7);
      }
      if (bi.oW(aIW()))
      {
        x.e("MicroMsg.ExtControlEntryProvider", "PkgName == null");
        cw(3, 6);
        return com.tencent.mm.pluginsdk.d.a.a.BA(6);
      }
      int i = aIX();
      if (i != 1)
      {
        x.e("MicroMsg.ExtControlEntryProvider", "invalid appid ! return code = " + i);
        cw(2, i);
        return com.tencent.mm.pluginsdk.d.a.a.BA(i);
      }
    }
    else
    {
      this.iJV = getContext();
      a(paramUri, this.iJV, iJT);
      if (paramUri == null)
      {
        pr(3);
        return null;
      }
      if ((bi.oW(this.iJN)) || (bi.oW(aIW())))
      {
        pr(3);
        return com.tencent.mm.pluginsdk.d.a.a.BA(3);
      }
      if (!atA())
      {
        pr(1);
        return this.hdQ;
      }
      if (!df(this.iJV))
      {
        x.w("MicroMsg.ExtControlEntryProvider", "invalid appid ! return null");
        pr(2);
        return null;
      }
    }
    paramArrayOfString1 = bi.oV(paramUri.getQueryParameter("source"));
    if (!this.iJU) {
      this.iJF = iJT.match(paramUri);
    }
    switch (this.iJF)
    {
    default: 
      cw(3, 15);
      return null;
    case 2: 
      return m(paramArrayOfString2);
    case 3: 
      return b(paramArrayOfString2, paramArrayOfString1);
    case 4: 
      if (this.iJV == null)
      {
        pr(4);
        return null;
      }
      paramUri = new Intent();
      paramUri.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.plugin.nearby.ui.NearbyFriendsUI"));
      paramUri.addFlags(268435456);
      this.iJV.startActivity(paramUri);
      pr(0);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    case 5: 
      return n(paramArrayOfString2);
    }
    if ((paramArrayOfString2 == null) || (paramArrayOfString2.length <= 0))
    {
      x.w("MicroMsg.ExtControlEntryProvider", "wrong args");
      pr(3);
      return null;
    }
    if (this.iJV == null)
    {
      pr(4);
      return null;
    }
    paramArrayOfString1 = new Intent();
    paramArrayOfString1.setComponent(new ComponentName("com.tencent.mm", "com.tencent.mm.ui.tools.ShareToTimeLineUI"));
    paramArrayOfString1.setAction("android.intent.action.SEND");
    paramArrayOfString1.addCategory("android.intent.category.DEFAULT");
    paramArrayOfString1.addFlags(268435456);
    if (paramArrayOfString2[1] == null) {}
    for (paramUri = "";; paramUri = paramArrayOfString2[1])
    {
      paramArrayOfString1.putExtra("android.intent.extra.TEXT", paramUri);
      if ((paramArrayOfString2[0] != null) && (paramArrayOfString2[0].trim().length() > 0)) {
        paramArrayOfString1.putExtra("android.intent.extra.STREAM", Uri.parse(paramArrayOfString2[0]));
      }
      paramArrayOfString1.putExtra("Ksnsupload_empty_img", true);
      paramArrayOfString1.setType("image/*");
      this.iJV.startActivity(paramArrayOfString1);
      pr(0);
      return com.tencent.mm.pluginsdk.d.a.a.BA(1);
    }
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/ext/provider/ExtControlProviderEntry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */