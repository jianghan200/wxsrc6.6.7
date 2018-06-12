package com.tencent.mm.storage.emotion;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.tencent.mm.bt.g;
import com.tencent.mm.bt.g.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.x;

public final class c
  extends i<b>
  implements g.a
{
  public static final String[] diD = { i.a(b.dhO, "EmojiInfoDesc") };
  public e diF;
  public SharedPreferences tcX;
  
  public c(e parame)
  {
    this(parame, b.dhO, "EmojiInfoDesc");
  }
  
  private c(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    this.diF = parame;
    this.tcX = PreferenceManager.getDefaultSharedPreferences(ad.getContext());
  }
  
  public final boolean Zv(String paramString)
  {
    bool2 = true;
    bool4 = false;
    boolean bool3 = false;
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "click_flag", "EmojiInfoDesc", "groupId" });
    localObject = null;
    str1 = null;
    for (;;)
    {
      try
      {
        paramString = this.diF.b(str2, new String[] { paramString }, 2);
        bool1 = bool3;
        if (paramString != null)
        {
          bool1 = bool3;
          str1 = paramString;
          localObject = paramString;
          if (paramString.moveToFirst())
          {
            str1 = paramString;
            localObject = paramString;
            int i = paramString.getInt(paramString.getColumnIndex("click_flag"));
            if ((i & 0x1) != 1) {
              continue;
            }
            bool1 = bool2;
          }
        }
        bool2 = bool1;
        if (paramString != null)
        {
          paramString.close();
          bool2 = bool1;
        }
      }
      catch (Exception paramString)
      {
        boolean bool1;
        localObject = str1;
        x.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool2 = bool4;
        if (str1 == null) {
          continue;
        }
        str1.close();
        return false;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      return bool2;
      bool1 = false;
    }
  }
  
  public final boolean Zw(String paramString)
  {
    bool2 = true;
    bool4 = false;
    boolean bool3 = false;
    String str2 = String.format("select %s from %s where %s=?", new Object[] { "download_flag", "EmojiInfoDesc", "groupId" });
    localObject = null;
    str1 = null;
    for (;;)
    {
      try
      {
        paramString = this.diF.b(str2, new String[] { paramString }, 2);
        bool1 = bool3;
        if (paramString != null)
        {
          bool1 = bool3;
          str1 = paramString;
          localObject = paramString;
          if (paramString.moveToFirst())
          {
            str1 = paramString;
            localObject = paramString;
            int i = paramString.getInt(paramString.getColumnIndex("download_flag"));
            if ((i & 0x1) != 1) {
              continue;
            }
            bool1 = bool2;
          }
        }
        bool2 = bool1;
        if (paramString != null)
        {
          paramString.close();
          bool2 = bool1;
        }
      }
      catch (Exception paramString)
      {
        boolean bool1;
        localObject = str1;
        x.w("MicroMsg.emoji.EmojiInfoDescStorage", "[isPurChase] Exception:%s", new Object[] { paramString.toString() });
        bool2 = bool4;
        if (str1 == null) {
          continue;
        }
        str1.close();
        return false;
      }
      finally
      {
        if (localObject == null) {
          continue;
        }
        ((Cursor)localObject).close();
      }
      return bool2;
      bool1 = false;
    }
  }
  
  public final boolean Zx(String paramString)
  {
    bool4 = false;
    boolean bool3 = false;
    bool2 = bool4;
    String str2;
    if (!TextUtils.isEmpty(paramString))
    {
      str2 = String.format("select %s from %s where %s=?", new Object[] { "desc", "EmojiInfoDesc", "groupId" });
      localObject = null;
      str1 = null;
    }
    try
    {
      paramString = this.diF.b(str2, new String[] { paramString }, 2);
      boolean bool1 = bool3;
      if (paramString != null)
      {
        str1 = paramString;
        localObject = paramString;
        bool2 = paramString.moveToFirst();
        bool1 = bool3;
        if (bool2) {
          bool1 = true;
        }
      }
      bool2 = bool1;
      if (paramString != null)
      {
        paramString.close();
        bool2 = bool1;
      }
    }
    catch (Exception paramString)
    {
      do
      {
        localObject = str1;
        x.w("MicroMsg.emoji.EmojiInfoDescStorage", paramString.toString());
        bool2 = bool4;
      } while (str1 == null);
      str1.close();
      return false;
    }
    finally
    {
      if (localObject == null) {
        break label158;
      }
      ((Cursor)localObject).close();
    }
    return bool2;
  }
  
  public final int a(g paramg)
  {
    if (paramg != null) {
      this.diF = paramg;
    }
    return 0;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/storage/emotion/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */