package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.Toast;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.downloader.model.d;
import com.tencent.mm.plugin.game.a.b;
import com.tencent.mm.plugin.game.d.ab;
import com.tencent.mm.plugin.game.e.a.a;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.ui.GameRegionPreference.a;
import com.tencent.mm.pluginsdk.model.app.g.a;
import com.tencent.mm.pluginsdk.model.app.m;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class f
{
  private static String jLC = "";
  
  private static String Dv(String paramString)
  {
    Object localObject3 = null;
    label68:
    String str2;
    for (Object localObject1 = null;; str2 = "")
    {
      try
      {
        localInputStream = ad.getContext().getAssets().open("game_region_default.txt");
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localObject4 = new byte[localInputStream.available()];
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localInputStream.read((byte[])localObject4);
        localObject1 = localInputStream;
        localObject3 = localInputStream;
        localObject4 = new String((byte[])localObject4);
        localObject1 = localObject4;
        if (localInputStream == null) {}
      }
      catch (IOException localIOException4)
      {
        for (;;)
        {
          InputStream localInputStream;
          Object localObject4;
          Object localObject2;
          localObject3 = localObject2;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bi.i(localIOException4) });
          if (localObject2 == null) {
            break;
          }
          try
          {
            ((InputStream)localObject2).close();
            localObject2 = "";
          }
          catch (IOException localIOException2)
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bi.i(localIOException2) });
            String str1 = "";
          }
        }
      }
      finally
      {
        if (localObject3 == null) {
          continue;
        }
        try
        {
          ((InputStream)localObject3).close();
          throw paramString;
        }
        catch (IOException localIOException3)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bi.i(localIOException3) });
          continue;
        }
        if (!"zh_CN".equalsIgnoreCase(paramString)) {
          continue;
        }
        return localObject3[0];
        if ((!"zh_TW".equalsIgnoreCase(paramString)) && (!"zh_HK".equalsIgnoreCase(paramString))) {
          continue;
        }
        return localObject3[1];
        return localObject3[2];
      }
      try
      {
        localInputStream.close();
        localObject1 = localObject4;
      }
      catch (IOException localIOException1)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "exception:%s", new Object[] { bi.i(localIOException1) });
        localObject2 = localObject4;
        break label68;
      }
      localObject3 = ((String)localObject1).trim().split("\\|");
      if (localObject3.length < 3)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "this region default title has problem %s", new Object[] { localObject1 });
        return "";
      }
    }
  }
  
  public static void F(Context paramContext, int paramInt)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("game_top_banner_id", paramInt).apply();
  }
  
  public static String a(GameRegionPreference.a parama)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    String str;
    if (parama != null)
    {
      str = bi.oV(w.chP());
      if (!"zh_CN".equalsIgnoreCase(str)) {
        break label42;
      }
      localStringBuffer.append(parama.kby);
    }
    for (;;)
    {
      return localStringBuffer.toString();
      label42:
      if (("zh_TW".equalsIgnoreCase(str)) || ("zh_HK".equalsIgnoreCase(str))) {
        localStringBuffer.append(parama.kbz);
      } else {
        localStringBuffer.append(parama.kbA);
      }
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3, g.a parama)
  {
    if (bi.oW(paramString1))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "null or nil appid");
      if (parama != null) {
        parama.cI(false);
      }
    }
    paramString1 = com.tencent.mm.pluginsdk.model.app.g.bl(paramString1, true);
    if ((paramString1 == null) || (bi.oW(paramString1.field_appId)))
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "appinfo is null or appid is null");
      if (parama != null) {
        parama.cI(false);
      }
    }
    do
    {
      return;
      if (p.b(paramContext, paramString1)) {
        break;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GameCenterLogic", "The app %s signature is incorrect.", new Object[] { paramString1.field_appName });
      Toast.makeText(paramContext, paramContext.getString(f.i.game_launch_fail_alert, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(paramContext, paramString1, null) }), 1).show();
    } while (parama == null);
    parama.cI(false);
    return;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage(new WXAppExtendObject());
    localWXMediaMessage.sdkVer = 620823808;
    localWXMediaMessage.messageAction = paramString2;
    localWXMediaMessage.messageExt = paramString3;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GameCenterLogic", "launch game app from wx: appid: [%s], appname:[%s], openid:[%s]", new Object[] { paramString1.field_appId, paramString1.field_appName, paramString1.field_openId });
    if (bi.oW(paramString1.field_openId))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameCenterLogic", "open id is null or nil, try to get from server:[%s]", new Object[] { paramString1.field_appName });
      com.tencent.mm.plugin.ac.a.bmh().pS(paramString1.field_appId);
    }
    com.tencent.mm.bu.a.post(new f.2(paramContext, paramString1, localWXMediaMessage, parama));
  }
  
  public static void a(Context paramContext, Set<String> paramSet)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putStringSet("show_download_gift_tips", paramSet).commit();
  }
  
  public static String aTA()
  {
    String str2 = bi.fS(ad.getContext());
    String str1 = str2;
    if (bi.oW(str2)) {
      str1 = "CN";
    }
    return str1.toUpperCase();
  }
  
  public static String aTB()
  {
    Object localObject = aTA();
    localObject = (GameRegionPreference.a)a.a.aVh().aVg().get(localObject);
    StringBuffer localStringBuffer = new StringBuffer();
    if (localObject != null)
    {
      localStringBuffer.append(((GameRegionPreference.a)localObject).kby);
      localStringBuffer.append(Dv("zh_CN"));
    }
    return localStringBuffer.toString();
  }
  
  public static String aTC()
  {
    Object localObject = aTA();
    localObject = (GameRegionPreference.a)a.a.aVh().aVg().get(localObject);
    StringBuffer localStringBuffer = new StringBuffer();
    if (localObject != null)
    {
      localStringBuffer.append(((GameRegionPreference.a)localObject).kbz);
      localStringBuffer.append(Dv("zh_TW"));
    }
    return localStringBuffer.toString();
  }
  
  public static String aTD()
  {
    Object localObject = aTA();
    localObject = (GameRegionPreference.a)a.a.aVh().aVg().get(localObject);
    StringBuffer localStringBuffer = new StringBuffer();
    if (localObject != null)
    {
      localStringBuffer.append(((GameRegionPreference.a)localObject).kbA);
      localStringBuffer.append(Dv("en"));
    }
    return localStringBuffer.toString();
  }
  
  public static void aTE()
  {
    String str = w.chP();
    ad.getContext().getSharedPreferences("game_center_pref", 0).edit().putString("game_center_pref_lang", str).commit();
  }
  
  public static String aTF()
  {
    return ad.getContext().getSharedPreferences("game_center_pref", 0).getString("game_center_pref_lang", w.chP());
  }
  
  public static boolean aTG()
  {
    long l = ((Long)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sON, Long.valueOf(0L))).longValue();
    return System.currentTimeMillis() - l > 86400000L;
  }
  
  public static void aTH()
  {
    com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sON, Long.valueOf(System.currentTimeMillis()));
  }
  
  public static String aTI()
  {
    ab localab = h.aTL().aTM();
    if (localab != null) {
      return localab.jOU;
    }
    return "";
  }
  
  public static int aTJ()
  {
    ab localab = h.aTL().aTM();
    if (localab != null) {
      return localab.jQq;
    }
    return 0;
  }
  
  public static String aTK()
  {
    return jLC;
  }
  
  public static LinkedList<com.tencent.mm.pluginsdk.model.app.f> aTy()
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GameCenterLogic", "getShowInGameCenterGames");
    LinkedList localLinkedList1 = new LinkedList();
    localLinkedList1.addAll(((b)com.tencent.mm.kernel.g.l(b.class)).aSf().jLa);
    LinkedList localLinkedList2 = new LinkedList();
    Iterator localIterator = localLinkedList1.iterator();
    label156:
    while (localIterator.hasNext())
    {
      com.tencent.mm.pluginsdk.model.app.f localf = (com.tencent.mm.pluginsdk.model.app.f)localIterator.next();
      if (localf != null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameCenterLogic", "appinfo:[%s], appinfo flag:[%d]", new Object[] { localf.field_appId, Integer.valueOf(localf.field_appInfoFlag) });
        if ((localf.field_appInfoFlag & 0x4) <= 0) {}
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label156;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameCenterLogic", "app should not show in gamecenter:[%s]", new Object[] { localf.field_appName });
        localLinkedList2.add(localf);
        break;
      }
    }
    if (localLinkedList2.size() > 0) {
      localLinkedList1.removeAll(localLinkedList2);
    }
    return localLinkedList1;
  }
  
  public static LinkedList<String> aTz()
  {
    LinkedList localLinkedList = new LinkedList();
    localLinkedList.addAll(((b)com.tencent.mm.kernel.g.l(b.class)).aSf().jKZ);
    return localLinkedList;
  }
  
  public static void ah(Context paramContext, String paramString)
  {
    a(paramContext, paramString, null, "WX_GameCenter", new f.1(paramString));
  }
  
  public static void ai(Context paramContext, String paramString)
  {
    int i = 0;
    String str2 = String.valueOf(System.currentTimeMillis() / 1000L);
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    Object localObject = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bi.oW((String)localObject))
    {
      paramContext = paramString + "-" + str2;
      localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).commit();
      return;
    }
    if (((String)localObject).contains(paramString))
    {
      paramContext = new String();
      String[] arrayOfString = ((String)localObject).split(",");
      if (i < arrayOfString.length)
      {
        String str1 = arrayOfString[i];
        localObject = str1;
        if (str1.contains(paramString)) {
          localObject = paramString + "-" + str2;
        }
        if (i == arrayOfString.length - 1) {}
        for (paramContext = paramContext + (String)localObject;; paramContext = paramContext + (String)localObject + ",")
        {
          i += 1;
          break;
        }
      }
      localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
      return;
    }
    paramContext = (String)localObject + "," + paramString + "-" + str2;
    localSharedPreferences.edit().putString("download_app_id_time_map", paramContext).apply();
  }
  
  public static void aj(Context paramContext, String paramString)
  {
    int i = 0;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    paramContext = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bi.oW(paramContext)) {}
    while (!paramContext.contains(paramString)) {
      return;
    }
    Object localObject = new String();
    String[] arrayOfString = paramContext.split(",");
    if (i < arrayOfString.length)
    {
      String str = arrayOfString[i];
      paramContext = (Context)localObject;
      if (!str.contains(paramString)) {
        if (i != arrayOfString.length - 1) {
          break label119;
        }
      }
      label119:
      for (paramContext = (String)localObject + str;; paramContext = (String)localObject + str + ",")
      {
        i += 1;
        localObject = paramContext;
        break;
      }
    }
    localSharedPreferences.edit().putString("download_app_id_time_map", (String)localObject).apply();
  }
  
  public static void ak(Context paramContext, String paramString)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putString("game_region_code", paramString).commit();
  }
  
  public static ShapeDrawable cm(int paramInt1, int paramInt2)
  {
    ShapeDrawable localShapeDrawable = new ShapeDrawable(new RoundRectShape(new float[] { paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2, paramInt2 }, null, null));
    localShapeDrawable.getPaint().setColor(paramInt1);
    return localShapeDrawable;
  }
  
  public static boolean dA(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) != 1;
  }
  
  public static void dB(Context paramContext)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
  }
  
  public static void dn(Context paramContext)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putString("notified_game_for_yyb_download_key", "").commit();
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putInt("total_notify_times_for_yyb_download_key", 0).commit();
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("delete_message_by_time_key", false).commit();
  }
  
  public static GameRegionPreference.a dr(Context paramContext)
  {
    String str = dz(paramContext);
    paramContext = str;
    if (bi.oW(str)) {
      paramContext = aTA();
    }
    return (GameRegionPreference.a)a.a.aVh().aVg().get(paramContext);
  }
  
  public static void ds(Context paramContext)
  {
    long l = System.currentTimeMillis() / 1000L;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("game_center_pref", 0);
    Object localObject1 = localSharedPreferences.getString("download_app_id_time_map", "");
    if (bi.oW((String)localObject1)) {}
    label173:
    do
    {
      return;
      String[] arrayOfString1 = ((String)localObject1).split(",");
      localObject1 = new String();
      int j = arrayOfString1.length;
      int i = 0;
      if (i < j)
      {
        Object localObject3 = arrayOfString1[i];
        String[] arrayOfString2 = ((String)localObject3).split("-");
        String str = arrayOfString2[0];
        Object localObject2 = localObject1;
        if (!bi.oW(str))
        {
          localObject2 = localObject1;
          if (!com.tencent.mm.pluginsdk.model.app.g.r(paramContext, str))
          {
            if (l - bi.getLong(arrayOfString2[1], 0L) >= 86400L) {
              break label173;
            }
            localObject2 = (String)localObject1 + (String)localObject3 + ",";
          }
        }
        for (;;)
        {
          i += 1;
          localObject1 = localObject2;
          break;
          localObject3 = d.aCU().yO(str);
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GameCenterLogic", "checkGameDownloadTime, status = %d, id = %d", new Object[] { Integer.valueOf(((FileDownloadTaskInfo)localObject3).status), Long.valueOf(((FileDownloadTaskInfo)localObject3).id) });
          if (((FileDownloadTaskInfo)localObject3).status == 2)
          {
            d.aCU().cl(((FileDownloadTaskInfo)localObject3).id);
            localObject2 = localObject1;
          }
          else if (((FileDownloadTaskInfo)localObject3).status != 0)
          {
            localObject2 = localObject1;
            if (((FileDownloadTaskInfo)localObject3).status != 4) {}
          }
          else
          {
            localObject2 = localObject1;
            if (com.tencent.mm.a.e.cn(((FileDownloadTaskInfo)localObject3).path))
            {
              com.tencent.mm.a.e.deleteFile(((FileDownloadTaskInfo)localObject3).path);
              localObject2 = localObject1;
            }
          }
        }
      }
    } while (bi.oW((String)localObject1));
    paramContext = (Context)localObject1;
    if (((String)localObject1).charAt(((String)localObject1).length() - 1) == ',') {
      paramContext = ((String)localObject1).substring(0, ((String)localObject1).length() - 1);
    }
    localSharedPreferences.edit().putString("download_app_id_time_map", paramContext.toString()).apply();
  }
  
  public static boolean dt(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_open_download_authority_tips", false);
  }
  
  public static void du(Context paramContext)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_open_download_authority_tips", true).commit();
  }
  
  public static Set<String> dv(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getStringSet("show_download_gift_tips", new HashSet());
  }
  
  public static boolean dw(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getBoolean("show_message_tips", true);
  }
  
  public static void dx(Context paramContext)
  {
    paramContext.getSharedPreferences("game_center_pref", 0).edit().putBoolean("show_message_tips", false).apply();
  }
  
  public static int dy(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getInt("game_top_banner_id", 0);
  }
  
  public static String dz(Context paramContext)
  {
    return paramContext.getSharedPreferences("game_center_pref", 0).getString("game_region_code", "");
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/game/model/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */