package com.tencent.mm.plugin.music.model.e;

import android.text.TextUtils;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.d;
import java.util.HashMap;
import java.util.Map;

public final class f
{
  private static HashMap<Integer, Boolean> lzR = new HashMap();
  private static HashMap<Integer, Long> lzS = new HashMap();
  
  static
  {
    lzR.put(Integer.valueOf(0), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(1), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(4), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(5), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(6), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(7), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(8), Boolean.valueOf(false));
    lzR.put(Integer.valueOf(9), Boolean.valueOf(false));
    lzS.put(Integer.valueOf(0), Long.valueOf(0L));
    lzS.put(Integer.valueOf(1), Long.valueOf(0L));
    lzS.put(Integer.valueOf(4), Long.valueOf(0L));
    lzS.put(Integer.valueOf(5), Long.valueOf(0L));
    lzS.put(Integer.valueOf(6), Long.valueOf(0L));
    lzS.put(Integer.valueOf(7), Long.valueOf(0L));
    lzS.put(Integer.valueOf(8), Long.valueOf(0L));
    lzS.put(Integer.valueOf(9), Long.valueOf(0L));
  }
  
  private static boolean da(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && ((paramInt2 & 0x1) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support CHATTING_UI");
      return true;
    }
    if ((paramInt1 == 1) && ((paramInt2 & 0x2) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support SNS_TIMELINE_UI");
      return true;
    }
    if ((paramInt1 == 4) && ((paramInt2 & 0x4) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support SHAKE_MUSIC_UI");
      return true;
    }
    if ((paramInt1 == 5) && ((paramInt2 & 0x8) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support PRODUCT_UI");
      return true;
    }
    if ((paramInt1 == 6) && ((paramInt2 & 0x10) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support FAVORITE_UI");
      return true;
    }
    if ((paramInt1 == 7) && ((paramInt2 & 0x20) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support WEBVIEW_UI");
      return true;
    }
    if ((paramInt1 == 8) && ((paramInt2 & 0x40) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support SNS_USER_TIMELINE_UI");
      return true;
    }
    if ((paramInt1 == 9) && ((paramInt2 & 0x80) > 0))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "support SEARCH_TIMELINE_UI");
      return true;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "QQMusicPlayer not support this scene %d", new Object[] { Integer.valueOf(paramInt1) });
    return false;
  }
  
  public static boolean tI(int paramInt)
  {
    long l = System.currentTimeMillis();
    if (l - ((Long)lzS.get(Integer.valueOf(paramInt))).longValue() < 10000L) {
      return ((Boolean)lzR.get(Integer.valueOf(paramInt))).booleanValue();
    }
    lzS.put(Integer.valueOf(paramInt), Long.valueOf(l));
    com.tencent.mm.storage.c localc = com.tencent.mm.model.c.c.Jx().fJ("100283");
    if (!localc.isValid())
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer item.isValid is false");
      return tJ(paramInt);
    }
    Object localObject = localc.ckq();
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer args == null");
      return tJ(paramInt);
    }
    if (!((Map)localObject).containsKey("support_player_flag"))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the support_player_flag key");
      return tJ(paramInt);
    }
    if (TextUtils.isEmpty((CharSequence)((Map)localObject).get("support_player_flag")))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer not contain the the value is empty");
      return tJ(paramInt);
    }
    localObject = (String)((Map)localObject).get("support_player_flag");
    try
    {
      i = Integer.valueOf((String)localObject, 16).intValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "supportQQMusicPlayer contain support_player_flag:%s", new Object[] { localObject });
      l = ((Long)g.Ei().DT().get(aa.a.sWr, Long.valueOf(0L))).longValue();
      if (l == 0L)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is 0");
        g.Ei().DT().a(aa.a.sWr, Long.valueOf(localc.field_sequence));
        g.Ei().DT().a(aa.a.sWq, Integer.valueOf(i));
        bool = da(paramInt, i);
        lzR.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
        return bool;
      }
    }
    catch (NumberFormatException localNumberFormatException)
    {
      for (;;)
      {
        boolean bool;
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicPlayerSwitcher", localNumberFormatException, "supportQQMusicPlayer", new Object[0]);
        int i = 0;
        continue;
        if (l == localc.field_sequence)
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is equal, check flag from local switch flag");
          bool = da(paramInt, ((Integer)g.Ei().DT().get(aa.a.sWq, Integer.valueOf(i))).intValue());
        }
        else
        {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "sequence is diff, update local data");
          g.Ei().DT().a(aa.a.sWr, Long.valueOf(localc.field_sequence));
          g.Ei().DT().a(aa.a.sWq, Integer.valueOf(i));
          bool = da(paramInt, i);
        }
      }
    }
  }
  
  private static boolean tJ(int paramInt)
  {
    int i = ((Integer)g.Ei().DT().get(aa.a.sWq, Integer.valueOf(0))).intValue();
    boolean bool = da(paramInt, i);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicPlayerSwitcher", "checkLocalSupportPlayerFlag support_player_flag:%s", new Object[] { Integer.toHexString(i) });
    lzR.put(Integer.valueOf(paramInt), Boolean.valueOf(bool));
    return bool;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/model/e/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */