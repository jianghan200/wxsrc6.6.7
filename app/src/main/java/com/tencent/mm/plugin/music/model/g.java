package com.tencent.mm.plugin.music.model;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.ak.o;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.js;
import com.tencent.mm.g.a.js.b;
import com.tencent.mm.g.a.qu;
import com.tencent.mm.model.q;
import com.tencent.mm.model.u;
import com.tencent.mm.model.u.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.plugin.music.b.a;
import com.tencent.mm.plugin.music.b.b;
import com.tencent.mm.plugin.music.b.e;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.a.c.a;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public final class g
{
  private static final Pattern eXs = Pattern.compile("songid=([0-9]+)");
  private static final String[] lys = { "#", "?", "&" };
  private static String lyt = null;
  private static String lyu = null;
  
  public static void F(String paramString1, String paramString2, int paramInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "gotoAppbrand(), appId:%s, appUserName:%s, pkgType:%d", new Object[] { paramString1, paramString2, Integer.valueOf(paramInt) });
    qu localqu = new qu();
    localqu.cbq.appId = paramString1;
    localqu.cbq.cbu = -1;
    localqu.cbq.cbt = paramInt;
    localqu.cbq.userName = paramString2;
    localqu.cbq.scene = 1056;
    if (paramInt == 1) {
      localqu.cbq.cbx = true;
    }
    com.tencent.mm.sdk.b.a.sFg.m(localqu);
  }
  
  private static String It(String paramString)
  {
    Object localObject5 = null;
    Object localObject2;
    if (bi.oW(paramString)) {
      localObject2 = localObject5;
    }
    Object localObject1;
    do
    {
      Object localObject4;
      do
      {
        return (String)localObject2;
        if ((lyt != null) && (paramString.equals(lyt))) {
          return lyu;
        }
        localObject2 = "";
        String[] arrayOfString = lys;
        j = arrayOfString.length;
        i = 0;
        localObject1 = null;
        for (;;)
        {
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (i >= j) {
            break;
          }
          localObject2 = arrayOfString[i];
          localObject2 = (String)localObject2 + "p=";
          if (paramString.contains((CharSequence)localObject2)) {
            localObject1 = paramString;
          }
          localObject3 = localObject2;
          localObject4 = localObject1;
          if (localObject1 != null) {
            break;
          }
          i += 1;
        }
        localObject2 = localObject5;
      } while (localObject4 == null);
      int i = ((String)localObject4).indexOf((String)localObject3);
      if (i < 0)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Music.MusicUtil", "pIndex is %d, return", new Object[] { Integer.valueOf(i) });
        return null;
      }
      localObject1 = ((String)localObject4).substring(((String)localObject3).length() + i);
      Object localObject3 = lys;
      int j = localObject3.length;
      i = 0;
      while (i < j)
      {
        int k = ((String)localObject1).indexOf(localObject3[i]);
        localObject2 = localObject1;
        if (k > 0) {
          localObject2 = ((String)localObject1).substring(0, k);
        }
        i += 1;
        localObject1 = localObject2;
      }
      localObject2 = localObject1;
    } while (localObject1 == null);
    lyt = paramString;
    lyu = (String)localObject1;
    return (String)localObject1;
  }
  
  private static byte[] Iu(String paramString)
  {
    byte[] arrayOfByte2 = new byte[paramString.length() / 2 + paramString.length() % 2];
    int i = 0;
    int j = 0;
    byte[] arrayOfByte1 = arrayOfByte2;
    for (;;)
    {
      try
      {
        if (i < paramString.length())
        {
          k = i + 1;
          int n = m(paramString.charAt(i));
          if (k >= paramString.length()) {
            break label93;
          }
          i = k + 1;
          k = m(paramString.charAt(k));
          arrayOfByte2[j] = ((byte)(k | n << 4));
          j += 1;
        }
      }
      catch (Exception paramString)
      {
        arrayOfByte1 = null;
      }
      return arrayOfByte1;
      label93:
      int m = 0;
      i = k;
      int k = m;
    }
  }
  
  private static int Iv(String paramString)
  {
    if (bi.oW(paramString)) {}
    do
    {
      return 0;
      paramString = eXs.matcher(paramString);
    } while (!paramString.find());
    paramString = paramString.group(1);
    try
    {
      int i = Integer.valueOf(paramString).intValue();
      return i;
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicUtil", paramString, "getSongId", new Object[0]);
    }
    return 0;
  }
  
  private static com.tencent.mm.ui.widget.a.c J(Context paramContext, int paramInt)
  {
    paramContext = new c.a(paramContext);
    paramContext.Gq(b.e.app_tip);
    paramContext.Gr(paramInt);
    paramContext.Gt(b.e.welcome_i_know).a(null);
    paramContext.mF(true);
    paramContext = paramContext.anj();
    paramContext.show();
    return paramContext;
  }
  
  public static String a(String paramString1, String paramString2, boolean paramBoolean, PBool paramPBool)
  {
    if ((paramBoolean) || (bi.oW(paramString2))) {}
    for (String str = paramString1; bi.oW(str); str = paramString2) {
      return str;
    }
    PString localPString = new PString();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "url[%s], lowBandUrl[%s], isWifi[%B]", new Object[] { paramString1, paramString2, Boolean.valueOf(paramBoolean) });
    paramString1 = It(str);
    if (paramString1 != null) {
      if (a(paramString1, paramBoolean, localPString)) {
        paramPBool.value = paramBoolean;
      }
    }
    for (;;)
    {
      return localPString.value;
      if (str.contains("wechat_music_url=")) {
        a(str.substring(str.indexOf("wechat_music_url=") + 17), paramBoolean, localPString);
      } else {
        localPString.value = str;
      }
    }
  }
  
  public static void a(avq paramavq, Activity paramActivity)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.k(10910, "3");
    ch localch = new ch();
    wl localwl = new wl();
    wr localwr = new wr();
    vx localvx = new vx();
    localwr.Vw(q.GF());
    localwr.Vx(q.GF());
    localwr.CO(5);
    localwr.fU(bi.VF());
    localwr.VC(j(paramavq));
    localvx.UI(paramavq.rYp);
    localvx.UJ(paramavq.rYq);
    localvx.UH(paramavq.rYr);
    Object localObject = h.bid().IC(com.tencent.mm.plugin.music.d.a.x(paramavq));
    if (((com.tencent.mm.an.a)localObject).PU())
    {
      localvx.UK(((com.tencent.mm.an.a)localObject).field_songHAlbumUrl);
      localvx.kX(true);
      localObject = i(paramavq);
      if (!FileOp.cn((String)localObject)) {
        break label303;
      }
      localvx.UQ((String)localObject);
    }
    for (;;)
    {
      localvx.UB(paramavq.rYl);
      localvx.UC(paramavq.rYm);
      localvx.CF(7);
      localch.bJF.title = paramavq.rYl;
      localch.bJF.desc = paramavq.rYm;
      localch.bJF.bJH = localwl;
      localch.bJF.type = 7;
      localwl.a(localwr);
      localwl.rBI.add(localvx);
      localch.bJF.activity = paramActivity;
      localch.bJF.bJM = 3;
      com.tencent.mm.sdk.b.a.sFg.m(localch);
      return;
      localvx.UK(((com.tencent.mm.an.a)localObject).field_songAlbumUrl);
      break;
      label303:
      localvx.kY(true);
    }
  }
  
  public static void a(avq paramavq, Intent paramIntent, MMActivity paramMMActivity)
  {
    String str1 = paramIntent.getStringExtra("Select_Conv_User");
    paramIntent = new WXMusicObject();
    paramIntent.musicUrl = paramavq.rYr;
    paramIntent.musicDataUrl = paramavq.rYp;
    paramIntent.musicLowBandUrl = paramavq.rYq;
    paramIntent.musicLowBandDataUrl = paramavq.rYq;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = paramIntent;
    localWXMediaMessage.title = paramavq.rYl;
    localWXMediaMessage.description = paramavq.rYm;
    Object localObject = null;
    String str2 = i(paramavq);
    paramIntent = (Intent)localObject;
    if (str2 != null)
    {
      paramIntent = (Intent)localObject;
      if (FileOp.cn(str2))
      {
        int i = (int)paramMMActivity.getResources().getDimension(b.a.NormalAvatarSize);
        paramIntent = com.tencent.mm.sdk.platformtools.c.aj(str2, i, i);
      }
    }
    if (paramIntent != null) {}
    for (localWXMediaMessage.thumbData = bi.U(paramIntent);; localWXMediaMessage.thumbData = bi.U(com.tencent.mm.sdk.platformtools.c.CV(b.b.default_icon_music)))
    {
      b.ezn.a(paramMMActivity, j(paramavq), localWXMediaMessage, str1, k(paramavq));
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "succeed to share to friend:%s", new Object[] { str1 });
      return;
    }
  }
  
  private static boolean a(String paramString, boolean paramBoolean, PString paramPString)
  {
    Object localObject2 = new String(Iu(paramString));
    int i = ((String)localObject2).indexOf("{");
    Object localObject1 = localObject2;
    if (i != -1) {
      localObject1 = ((String)localObject2).substring(i);
    }
    try
    {
      localObject2 = new JSONObject((String)localObject1);
      localObject1 = ((JSONObject)localObject2).getString("song_WapLiveURL");
      localObject2 = ((JSONObject)localObject2).getString("song_WifiURL");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Music.MusicUtil", "waplive: " + (String)localObject1 + "  wifi:" + (String)localObject2);
      if (paramBoolean) {
        localObject1 = localObject2;
      }
      for (;;)
      {
        paramPString.value = ((String)localObject1);
        return true;
      }
      return false;
    }
    catch (Exception localException)
    {
      paramPString.value = paramString;
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicUtil", localException, "decodeJson", new Object[0]);
    }
  }
  
  public static boolean b(avq paramavq, Activity paramActivity)
  {
    com.tencent.mm.plugin.report.service.h.mEJ.k(10910, "4");
    if (paramavq == null) {
      return false;
    }
    String str = paramavq.rYr;
    int i;
    if (str == null)
    {
      i = -1;
      if (i >= 0) {
        break label99;
      }
      paramavq = null;
      label35:
      if (paramavq != null) {
        break label110;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.Music.MusicUtil", "wtf, get qq music data fail, url %s", new Object[] { str });
    }
    Uri localUri;
    for (paramavq = "androidqqmusic://";; paramavq = String.format("androidqqmusic://from=webPlayer&data=%s", new Object[] { paramavq }))
    {
      localUri = Uri.parse(paramavq);
      if (localUri != null) {
        break label144;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.Music.MusicUtil", "parse qq music action url fail, url %s", new Object[] { paramavq });
      return false;
      i = str.indexOf("#p=");
      break;
      label99:
      paramavq = str.substring(i + 3);
      break label35;
      label110:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "get qq music data %s", new Object[] { paramavq });
    }
    label144:
    com.tencent.mm.an.b.PW();
    paramavq = new Intent("android.intent.action.VIEW", localUri);
    paramavq.addFlags(268435456);
    if (bi.k(paramActivity, paramavq))
    {
      paramActivity.startActivity(paramavq);
      return true;
    }
    paramavq = new Intent();
    paramavq.putExtra("rawUrl", str);
    b.ezn.j(paramavq, paramActivity);
    return false;
  }
  
  public static void c(avq paramavq, Activity paramActivity)
  {
    Object localObject1 = new WXMusicObject();
    ((WXMusicObject)localObject1).musicUrl = paramavq.rYr;
    ((WXMusicObject)localObject1).musicDataUrl = paramavq.rYp;
    ((WXMusicObject)localObject1).musicLowBandUrl = paramavq.rYq;
    ((WXMusicObject)localObject1).musicLowBandDataUrl = paramavq.rYq;
    WXMediaMessage localWXMediaMessage = new WXMediaMessage();
    localWXMediaMessage.mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
    localWXMediaMessage.title = paramavq.rYl;
    localWXMediaMessage.description = paramavq.rYm;
    Bundle localBundle = null;
    Object localObject2 = i(paramavq);
    localObject1 = localBundle;
    if (localObject2 != null)
    {
      localObject1 = localBundle;
      if (FileOp.cn((String)localObject2))
      {
        int i = (int)paramActivity.getResources().getDimension(b.a.NormalAvatarSize);
        localObject1 = com.tencent.mm.sdk.platformtools.c.aj((String)localObject2, i, i);
      }
    }
    if (localObject1 != null) {}
    for (localWXMediaMessage.thumbData = bi.U((Bitmap)localObject1);; localWXMediaMessage.thumbData = bi.U(com.tencent.mm.sdk.platformtools.c.CV(b.b.default_icon_music)))
    {
      localObject1 = new Intent();
      localBundle = new Bundle();
      localObject2 = new SendMessageToWX.Req();
      ((SendMessageToWX.Req)localObject2).message = localWXMediaMessage;
      ((SendMessageToWX.Req)localObject2).toBundle(localBundle);
      ((Intent)localObject1).putExtra("Ksnsupload_timeline", localBundle);
      ((Intent)localObject1).putExtra("Ksnsupload_musicid", paramavq.rsp);
      ((Intent)localObject1).putExtra("Ksnsupload_appid", j(paramavq));
      ((Intent)localObject1).putExtra("Ksnsupload_appname", k(paramavq));
      paramavq = u.ic("music_player");
      u.Hx().v(paramavq, true).p("prePublishId", "music_player");
      ((Intent)localObject1).putExtra("reportSessionId", paramavq);
      b.ezn.m((Intent)localObject1, paramActivity);
      return;
    }
  }
  
  public static int cH(String paramString)
  {
    if (paramString != null) {
      try
      {
        if (paramString.length() <= 0) {
          return 0;
        }
        int i = Integer.valueOf(paramString).intValue();
        return i;
      }
      catch (NumberFormatException paramString)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicUtil", paramString, "getInt", new Object[0]);
      }
    }
    return 0;
  }
  
  public static String dV(Context paramContext)
  {
    String str = "";
    Object localObject2 = ad.getPackageName();
    if (localObject2 == null) {}
    Object localObject1;
    for (;;)
    {
      return "";
      localObject1 = str;
      try
      {
        localObject2 = paramContext.getPackageManager().getPackageInfo((String)localObject2, 0);
        if (localObject2 != null)
        {
          localObject1 = str;
          paramContext = "" + ((PackageInfo)localObject2).versionName;
          localObject1 = paramContext;
          paramContext = paramContext + "." + ((PackageInfo)localObject2).versionCode;
          return paramContext;
        }
      }
      catch (PackageManager.NameNotFoundException paramContext)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicUtil", paramContext, "", new Object[0]);
      }
    }
    return (String)localObject1;
  }
  
  public static boolean f(com.tencent.mm.an.a parama)
  {
    boolean bool = false;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Music.MusicUtil", "music urls: %s,  %s,  %s", new Object[] { parama.field_songWapLinkUrl, parama.field_songWebUrl, parama.field_songWifiUrl });
    if ((!bi.oW(parama.field_songWapLinkUrl)) || (!bi.oW(parama.field_songWebUrl)) || (!bi.oW(parama.field_songWifiUrl))) {
      bool = true;
    }
    return bool;
  }
  
  private static String g(avq paramavq)
  {
    String str2 = null;
    String str1;
    if (paramavq != null) {
      if (!bi.oW(paramavq.rYp))
      {
        str1 = paramavq.rYp;
        if (str1 != null) {
          break label70;
        }
        str1 = str2;
      }
    }
    label70:
    do
    {
      do
      {
        return str1;
        if (!bi.oW(paramavq.rYr))
        {
          str1 = paramavq.rYr;
          break;
        }
        if (!bi.oW(paramavq.rYq))
        {
          str1 = paramavq.rYq;
          break;
        }
        str1 = null;
        break;
        str2 = It(paramavq.rYp);
        str1 = str2;
      } while (str2 != null);
      str2 = It(paramavq.rYr);
      str1 = str2;
    } while (str2 != null);
    return It(paramavq.rYq);
  }
  
  public static boolean g(com.tencent.mm.an.a parama)
  {
    if (parama == null) {}
    while ((TextUtils.isEmpty(parama.field_songWifiUrl)) && (TextUtils.isEmpty(parama.field_songWapLinkUrl)) && (TextUtils.isEmpty(parama.field_songWebUrl))) {
      return false;
    }
    return true;
  }
  
  public static avq h(avq paramavq)
  {
    if (paramavq != null)
    {
      paramavq.rKe = Iv(paramavq.rYp);
      if (paramavq.rKe <= 0)
      {
        paramavq.rKe = Iv(paramavq.rYr);
        if (paramavq.rKe <= 0)
        {
          paramavq.rKe = Iv(paramavq.rYq);
          i = paramavq.rKe;
        }
      }
    }
    if ((paramavq == null) || (g(paramavq) == null)) {}
    long l;
    do
    {
      return paramavq;
      l = System.currentTimeMillis();
      localObject = g(paramavq);
    } while (localObject == null);
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Music.MusicUtil", "bcdUrl: %s", new Object[] { localObject });
    String str = new String(Iu((String)localObject));
    int i = str.indexOf("{");
    Object localObject = str;
    if (i != -1) {
      localObject = str.substring(i);
    }
    try
    {
      localObject = new JSONObject((String)localObject);
      paramavq.rKe = ((JSONObject)localObject).optInt("song_ID");
      if (bi.oW(paramavq.rYl)) {
        paramavq.rYl = ((JSONObject)localObject).optString("song_Name");
      }
      if (bi.oW(paramavq.rYq)) {
        paramavq.rYq = ((JSONObject)localObject).optString("song_WapLiveURL");
      }
      if (bi.oW(paramavq.rYp)) {
        paramavq.rYp = ((JSONObject)localObject).optString("song_WifiURL");
      }
      if (bi.oW(paramavq.rYn)) {
        paramavq.rYn = ((JSONObject)localObject).optString("song_Album");
      }
      if (bi.oW(paramavq.rYm)) {
        paramavq.rYm = ((JSONObject)localObject).optString("song_Singer");
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.Music.MusicUtil", localException, "", new Object[0]);
      }
    }
    if (paramavq.rKe == 0) {
      paramavq.rKe = Iv(lyt);
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "parseBCDForMusicWrapper %s: expend: %d %d", new Object[] { paramavq.rsp, Long.valueOf(System.currentTimeMillis() - l), Integer.valueOf(paramavq.rKe) });
    return paramavq;
  }
  
  private static String i(avq paramavq)
  {
    com.tencent.mm.an.a locala = h.bid().IC(com.tencent.mm.plugin.music.d.a.x(paramavq));
    if (locala == null) {
      return "";
    }
    Object localObject2 = com.tencent.mm.plugin.music.d.a.h(locala, true);
    Object localObject1 = localObject2;
    if (!FileOp.cn((String)localObject2)) {
      switch (paramavq.rYj)
      {
      case 1: 
      case 2: 
      case 3: 
      case 8: 
      case 9: 
      default: 
        localObject1 = localObject2;
        if (n.nky != null)
        {
          localObject1 = new ate();
          ((ate)localObject1).ksA = paramavq.rvP;
          ((ate)localObject1).rVE = paramavq.rYo;
          ((ate)localObject1).rVF = paramavq.rYv;
          ((ate)localObject1).jPK = ((ate)localObject1).rVE;
          localObject1 = n.nkx.a((ate)localObject1);
        }
        break;
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.Music.MusicUtil", "real album path = %s", new Object[] { localObject1 });
      return (String)localObject1;
      localObject1 = new js();
      ((js)localObject1).bTw.action = 12;
      ((js)localObject1).bTw.bTB = paramavq.rYo;
      com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
      localObject1 = ((js)localObject1).bTx.bTD;
      localObject2 = localObject1;
      if (bi.oW((String)localObject1)) {
        localObject2 = paramavq.rYt;
      }
      localObject1 = localObject2;
      if (!FileOp.cn((String)localObject2))
      {
        localObject1 = com.tencent.mm.plugin.music.d.a.h(locala, false);
        continue;
        localObject1 = o.Pf().E(paramavq.rYt, true);
        continue;
        if (paramavq.rYt == null)
        {
          localObject1 = "";
        }
        else
        {
          localObject1 = paramavq.rYt;
          continue;
          if (paramavq.rYt == null)
          {
            localObject1 = "";
          }
          else
          {
            localObject1 = paramavq.rYt;
            continue;
            if (paramavq.rYt == null) {
              localObject1 = "";
            } else {
              localObject1 = paramavq.rYt;
            }
          }
        }
      }
    }
  }
  
  public static String j(avq paramavq)
  {
    String str = paramavq.jQb;
    if (bi.oW(str)) {}
    switch (paramavq.rYj)
    {
    default: 
      return str;
    case 5: 
      return "wx482a4001c37e2b74";
    }
    return "wx485a97c844086dc9";
  }
  
  private static String k(avq paramavq)
  {
    switch (paramavq.rYj)
    {
    case 2: 
    case 3: 
    case 6: 
    case 7: 
    default: 
      return ad.getContext().getString(b.e.default_music_prefix);
    case 0: 
    case 1: 
    case 8: 
      return ad.getContext().getString(b.e.sns_music_prefix);
    case 5: 
      return ad.getContext().getString(b.e.scan_music_prefix);
    }
    return ad.getContext().getString(b.e.shake_music_app);
  }
  
  public static boolean l(avq paramavq)
  {
    if (paramavq == null) {}
    do
    {
      do
      {
        return false;
      } while (TextUtils.isEmpty(paramavq.protocol));
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.Music.MusicUtil", "protocol:%s", new Object[] { paramavq.protocol });
    } while (!"hls".equalsIgnoreCase(paramavq.protocol));
    return true;
  }
  
  private static int m(char paramChar)
  {
    int j = 0;
    int i;
    if ((paramChar >= '1') && (paramChar <= '9')) {
      i = paramChar - '0';
    }
    do
    {
      do
      {
        return i;
        i = j;
      } while (paramChar < 'A');
      i = j;
    } while (paramChar > 'F');
    return paramChar - 'A' + 10;
  }
  
  public static boolean tB(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      if (!com.tencent.mm.plugin.music.model.e.f.tI(paramInt)) {
        break;
      }
    case 10: 
    case 11: 
      return true;
    }
    return false;
  }
  
  public static void x(Activity paramActivity)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("scene_from", 6);
    d.b(paramActivity, ".ui.transmit.SelectConversationUI", localIntent, 1);
  }
  
  public static void y(Activity paramActivity)
  {
    if (((Boolean)com.tencent.mm.kernel.g.Ei().DT().get(82, Boolean.valueOf(true))).booleanValue())
    {
      com.tencent.mm.kernel.g.Ei().DT().set(82, Boolean.valueOf(false));
      switch (h.bic().bhR().field_musicType)
      {
      case 2: 
      case 3: 
      case 5: 
      case 7: 
      default: 
        return;
      case 0: 
        J(paramActivity, b.e.shake_first_time_chatting);
        return;
      case 6: 
        J(paramActivity, b.e.shake_first_time_favorite);
        return;
      case 4: 
        J(paramActivity, b.e.shake_first_time_shake);
        return;
      }
      J(paramActivity, b.e.shake_first_time_timeline);
      return;
    }
    if (h.bic().mode == 2)
    {
      Toast.makeText(ad.getContext(), b.e.switch_to_multi_music, 0).show();
      return;
    }
    Toast.makeText(ad.getContext(), b.e.switch_to_single_music, 0).show();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */