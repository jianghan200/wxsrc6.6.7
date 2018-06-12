package com.tencent.mm.plugin.emoji.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.tencent.mm.bt.h;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.emoji.e.l;
import com.tencent.mm.plugin.emoji.model.i;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.o;
import java.util.ArrayList;

public class EmotionContentProvider
  extends ContentProvider
{
  private static final UriMatcher ijd;
  
  static
  {
    UriMatcher localUriMatcher = new UriMatcher(-1);
    ijd = localUriMatcher;
    localUriMatcher.addURI("com.tencent.mm.storage.provider.emotion", "EmojiGroupInfo", 1);
    ijd.addURI("com.tencent.mm.storage.provider.emotion", "userinfo", 2);
    ijd.addURI("com.tencent.mm.storage.provider.emotion", "GetEmotionListCache", 3);
    ijd.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfo", 4);
    ijd.addURI("com.tencent.mm.storage.provider.emotion", "EmojiInfoDesc", 5);
  }
  
  public Bundle call(String paramString1, String paramString2, Bundle paramBundle)
  {
    boolean bool = true;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.EmotionContentProvider", "[call] method:%s", new Object[] { paramString1 });
    if (paramString1.equals("getAccPath"))
    {
      paramString1 = new Bundle();
      paramString1.putString("path", g.Ei().dqp);
      return paramString1;
    }
    if (paramString1.equals("getEmojiKey"))
    {
      paramString1 = new Bundle();
      paramString1.putString("key", i.aEA().igx.getKey());
      return paramString1;
    }
    if (paramString1.equals("ConfigStorage.getBoolean"))
    {
      paramString1 = new Bundle();
      au.HU();
      paramString1.putBoolean("key", ((Boolean)com.tencent.mm.model.c.DT().get(paramBundle.getInt("key"), Boolean.valueOf(false))).booleanValue());
      return paramString1;
    }
    if (paramString1.equals("ConfigStorage.getString"))
    {
      paramString1 = new Bundle();
      au.HU();
      paramString1.putString("key", (String)com.tencent.mm.model.c.DT().get(paramBundle.getInt("key"), ""));
      return paramString1;
    }
    if (paramString1.equals("getAllCustomEmoji"))
    {
      paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
      paramString1.putParcelableArrayList("data", i.aEA().aDY());
      return paramString1;
    }
    if (paramString1.equals("getRamdomEmoji"))
    {
      if (paramBundle != null)
      {
        paramBundle.setClassLoader(EmojiInfo.class.getClassLoader());
        paramString1 = (EmojiInfo)paramBundle.getParcelable("emoji");
        paramString2 = new Bundle(EmojiInfo.class.getClassLoader());
        paramString2.putParcelable("data", ((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().c(paramString1));
        return paramString2;
      }
      if (paramBundle == null) {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.EmotionContentProvider", "[getRamdomEmoji] extras:%s", new Object[] { Boolean.valueOf(bool) });
      }
    }
    do
    {
      return null;
      bool = false;
      break;
      if (paramString1.equals("getCurLangDesc"))
      {
        paramString1 = new Bundle();
        paramString1.putString("data", i.aEv().zf(paramString2));
        return paramString1;
      }
      if (paramString1.equals("countCustomEmoji"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", i.aEA().igx.ln(true));
        return paramString1;
      }
      if (paramString1.equals("countProductId"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", i.aEA().igx.zs(paramString2));
        return paramString1;
      }
      if (paramString1.equals("getDownloadedCount"))
      {
        paramString1 = new Bundle();
        paramString1.putInt("data", i.aEA().aDX());
        return paramString1;
      }
      if (paramString1.equals("getEmojiListByGroupId"))
      {
        paramString1 = new Bundle(EmojiInfo.class.getClassLoader());
        paramString1.putParcelableArrayList("data", (ArrayList)((com.tencent.mm.plugin.emoji.b.c)g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zk(paramString2));
        return paramString1;
      }
    } while (!paramString1.equals("getEmojiGroupInfoList"));
    paramString1 = new Bundle(EmojiGroupInfo.class.getClassLoader());
    paramString1.putParcelableArrayList("data", i.aEA().aDW());
    return paramString1;
  }
  
  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    switch (ijd.match(paramUri))
    {
    default: 
      return 0;
    }
    au.HU();
    return com.tencent.mm.model.c.FO().delete("GetEmotionListCache", paramString, paramArrayOfString);
  }
  
  public String getType(Uri paramUri)
  {
    return null;
  }
  
  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    switch (ijd.match(paramUri))
    {
    default: 
      return paramUri;
    }
    au.HU();
    return Uri.withAppendedPath(paramUri, String.valueOf(com.tencent.mm.model.c.FO().insert("GetEmotionListCache", o.dhO.sKz, paramContentValues)));
  }
  
  public boolean onCreate()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.EmotionContentProvider", "[onCreate]");
    return true;
  }
  
  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.EmotionContentProvider", "[query] path:%s selection:%s", new Object[] { paramUri.getPath(), paramString1 });
    switch (ijd.match(paramUri))
    {
    case 2: 
    default: 
      return null;
    case 1: 
      au.HU();
      return com.tencent.mm.model.c.FO().b(paramString1, paramArrayOfString2, 2);
    case 3: 
      au.HU();
      return com.tencent.mm.model.c.FO().b(paramString1, paramArrayOfString2, 2);
    case 4: 
      au.HU();
      return com.tencent.mm.model.c.FO().b(paramString1, paramArrayOfString2, 2);
    }
    au.HU();
    return com.tencent.mm.model.c.FO().b(paramString1, paramArrayOfString2, 2);
  }
  
  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    if (!g.Eg().Dx()) {
      return -1;
    }
    switch (ijd.match(paramUri))
    {
    default: 
      return -1;
    case 1: 
      au.HU();
      return com.tencent.mm.model.c.FO().update("EmojiGroupInfo", paramContentValues, paramString, paramArrayOfString);
    }
    au.HU();
    com.tencent.mm.model.c.DT().set(((Integer)paramContentValues.get("type")).intValue(), paramContentValues.get("value"));
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/emoji/provider/EmotionContentProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */