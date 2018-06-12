package com.tencent.mm.plugin.music.model.notification;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Looper;
import android.support.v4.app.z.d;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.g;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.jt;
import com.tencent.mm.plugin.music.b.a;
import com.tencent.mm.plugin.music.b.b;
import com.tencent.mm.plugin.music.b.c;
import com.tencent.mm.plugin.music.b.d;
import com.tencent.mm.plugin.music.ui.MusicMainUI;
import com.tencent.mm.plugin.sns.b.f;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.protocal.c.ate;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.c;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
{
  boolean huc = false;
  MMMusicPlayerService lzf;
  NotificationManager lzg;
  Runnable lzh = new a.1(this);
  BroadcastReceiver lzi;
  
  private static void a(View paramView, List<TextView> paramList)
  {
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i = 0;
      while (i < paramView.getChildCount())
      {
        a(paramView.getChildAt(i), paramList);
        i += 1;
      }
    }
    if ((paramView instanceof TextView)) {
      paramList.add((TextView)paramView);
    }
  }
  
  public static void a(com.tencent.mm.an.a parama, int paramInt, boolean paramBoolean)
  {
    x.i("MicroMsg.Music.MMMusicNotification", "sendMusicPlayerEvent action:%d", new Object[] { Integer.valueOf(paramInt) });
    jt localjt = new jt();
    localjt.bTE.action = paramInt;
    localjt.bTE.state = "";
    localjt.bTE.bTy = parama.PV();
    localjt.bTE.appId = "not from app brand appid";
    localjt.bTE.bTG = paramBoolean;
    com.tencent.mm.sdk.b.a.sFg.a(localjt, Looper.getMainLooper());
  }
  
  private static int j(ViewGroup paramViewGroup)
  {
    Object localObject = new ArrayList();
    a(paramViewGroup, (List)localObject);
    paramViewGroup = null;
    Iterator localIterator = ((List)localObject).iterator();
    if (localIterator.hasNext())
    {
      localObject = (TextView)localIterator.next();
      if (((TextView)localObject).getTextSize() <= -1.0F) {
        break label68;
      }
      paramViewGroup = (ViewGroup)localObject;
    }
    label68:
    for (;;)
    {
      break;
      if (paramViewGroup != null) {
        return paramViewGroup.getCurrentTextColor();
      }
      return -16777216;
    }
  }
  
  final Notification a(Context paramContext, com.tencent.mm.an.a parama, boolean paramBoolean)
  {
    Object localObject1 = new Intent(paramContext, MusicMainUI.class);
    ((Intent)localObject1).putExtra("key_scene", 5);
    localObject1 = PendingIntent.getActivity(paramContext, 0, (Intent)localObject1, 134217728);
    Object localObject2 = new z.d(paramContext);
    ((z.d)localObject2).pu = ((PendingIntent)localObject1);
    z.d locald = ((z.d)localObject2).Y(com.tencent.mm.bf.a.cbg());
    String str = parama.field_songName;
    localObject2 = parama.field_songSinger;
    if (!bi.oW(parama.field_songAlbum)) {
      localObject2 = (String)localObject2 + parama.field_songAlbum;
    }
    for (;;)
    {
      label147:
      label174:
      label201:
      label231:
      int k;
      int j;
      if (parama == null)
      {
        x.e("MicroMsg.Music.MMMusicNotification", "music is null, return");
        parama = null;
        localObject1 = new RemoteViews(paramContext.getPackageName(), b.d.remote_music_notification);
        if (parama == null) {
          break label943;
        }
        ((RemoteViews)localObject1).setImageViewBitmap(b.c.music_notification_album, parama);
        if (bi.oW(str)) {
          break label957;
        }
        ((RemoteViews)localObject1).setViewVisibility(b.c.music_notification_title, 0);
        ((RemoteViews)localObject1).setTextViewText(b.c.music_notification_title, str);
        if (bi.oW((String)localObject2)) {
          break label970;
        }
        ((RemoteViews)localObject1).setViewVisibility(b.c.music_notification_desc, 0);
        ((RemoteViews)localObject1).setTextViewText(b.c.music_notification_desc, (CharSequence)localObject2);
        parama = this.lzf;
        localObject2 = new z.d(parama).build().contentView;
        if (localObject2 != null) {
          break label983;
        }
        i = -16777216;
        k = i | 0xFF000000;
        i = Color.red(-16777216) - Color.red(k);
        j = Color.green(-16777216) - Color.green(k);
        k = Color.blue(-16777216) - Color.blue(k);
        if (Math.sqrt(k * k + (i * i + j * j)) >= 180.0D) {
          break label1040;
        }
        j = 1;
        label308:
        parama = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        parama.putExtra("mm_music_notification_action_key", "mm_music_notification_action_pre");
        parama = PendingIntent.getBroadcast(paramContext, 0, parama, 134217728);
        k = b.c.music_notification_pre;
        if (j == 0) {
          break label1046;
        }
        i = b.b.remote_notification_pre_dark;
        label354:
        ((RemoteViews)localObject1).setImageViewResource(k, i);
        ((RemoteViews)localObject1).setOnClickPendingIntent(b.c.music_notification_pre, parama);
        parama = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        if (!paramBoolean) {
          break label1054;
        }
        parama.putExtra("mm_music_notification_action_key", "mm_music_notification_action_pause");
        label398:
        parama = PendingIntent.getBroadcast(paramContext, 1, parama, 134217728);
        k = b.c.music_notification_pause;
        if (!paramBoolean) {
          break label1076;
        }
        if (j == 0) {
          break label1068;
        }
        i = b.b.remote_notification_pause_dark;
        label426:
        ((RemoteViews)localObject1).setImageViewResource(k, i);
        ((RemoteViews)localObject1).setOnClickPendingIntent(b.c.music_notification_pause, parama);
        parama = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        parama.putExtra("mm_music_notification_action_key", "mm_music_notification_action_next");
        parama = PendingIntent.getBroadcast(paramContext, 2, parama, 134217728);
        k = b.c.music_notification_next;
        if (j == 0) {
          break label1097;
        }
        i = b.b.remote_notification_next_dark;
        label490:
        ((RemoteViews)localObject1).setImageViewResource(k, i);
        ((RemoteViews)localObject1).setOnClickPendingIntent(b.c.music_notification_next, parama);
        parama = new Intent("com.tencent.mm.Intent.ACTION_MMMUSIC_NOTIFICATION_CLICK");
        parama.putExtra("mm_music_notification_action_key", "mm_music_notification_action_close");
        paramContext = PendingIntent.getBroadcast(paramContext, 3, parama, 134217728);
        k = b.c.music_notification_close;
        if (j == 0) {
          break label1105;
        }
      }
      label943:
      label957:
      label970:
      label983:
      label1040:
      label1046:
      label1054:
      label1068:
      label1076:
      label1097:
      label1105:
      for (int i = b.b.remote_notification_close_dark;; i = b.b.remote_notification_close_light)
      {
        ((RemoteViews)localObject1).setImageViewResource(k, i);
        ((RemoteViews)localObject1).setOnClickPendingIntent(b.c.music_notification_close, paramContext);
        locald.pQ.contentView = ((RemoteViews)localObject1);
        return locald.build();
        Object localObject3 = null;
        x.i("MicroMsg.Music.MMMusicNotification", "music.field_musicType %d", new Object[] { Integer.valueOf(parama.field_musicType) });
        localObject1 = localObject3;
        switch (parama.field_musicType)
        {
        default: 
          localObject1 = localObject3;
        }
        for (;;)
        {
          localObject3 = localObject1;
          if (localObject1 == null)
          {
            localObject1 = o.Pj().ma(parama.field_songAlbumUrl);
            localObject3 = localObject1;
            if (localObject1 == null)
            {
              localObject3 = com.tencent.mm.plugin.music.d.a.h(parama, false);
              localObject4 = new c.a();
              ((c.a)localObject4).dXA = com.tencent.mm.plugin.music.d.a.h(parama, false);
              ((c.a)localObject4).dXy = true;
              ((c.a)localObject4).bg(com.tencent.mm.bp.a.ad(this.lzf, b.a.notification_large_icon_width), com.tencent.mm.bp.a.ad(this.lzf, b.a.notification_large_icon_height));
              ((c.a)localObject4).dXw = true;
              o.Pj().a(parama.field_songAlbumUrl, ((c.a)localObject4).Pt(), new a.3(this, parama, (String)localObject3));
              localObject3 = localObject1;
            }
          }
          parama = c.a((Bitmap)localObject3, false, 12.0F, false);
          break;
          localObject1 = o.Pf().b(parama.field_songAlbumLocalPath, com.tencent.mm.bp.a.getDensity(this.lzf), true);
          continue;
          localObject1 = o.Pf().a(parama.field_songAlbumLocalPath, com.tencent.mm.bp.a.getDensity(this.lzf), true);
          continue;
          Object localObject4 = new ate();
          ((ate)localObject4).ksA = parama.field_songMediaId;
          ((ate)localObject4).rVE = parama.field_songAlbumUrl;
          ((ate)localObject4).rVF = parama.field_songAlbumType;
          ((ate)localObject4).jPK = ((ate)localObject4).rVE;
          localObject1 = localObject3;
          if (n.nkx != null) {
            localObject1 = n.nkx.b((ate)localObject4);
          }
        }
        ((RemoteViews)localObject1).setImageViewResource(b.c.music_notification_album, b.b.default_icon_music);
        break label147;
        ((RemoteViews)localObject1).setViewVisibility(b.c.music_notification_title, 8);
        break label174;
        ((RemoteViews)localObject1).setViewVisibility(b.c.music_notification_desc, 8);
        break label201;
        i = ((RemoteViews)localObject2).getLayoutId();
        parama = (ViewGroup)LayoutInflater.from(parama).inflate(i, null);
        localObject2 = (TextView)parama.findViewById(16908310);
        if (localObject2 != null)
        {
          i = ((TextView)localObject2).getCurrentTextColor();
          break label231;
        }
        i = j(parama);
        break label231;
        j = 0;
        break label308;
        i = b.b.remote_notification_pre_light;
        break label354;
        parama.putExtra("mm_music_notification_action_key", "mm_music_notification_action_play");
        break label398;
        i = b.b.remote_notification_pause_light;
        break label426;
        if (j != 0)
        {
          i = b.b.remote_notification_play_dark;
          break label426;
        }
        i = b.b.remote_notification_play_light;
        break label426;
        i = b.b.remote_notification_next_light;
        break label490;
      }
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/music/model/notification/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */