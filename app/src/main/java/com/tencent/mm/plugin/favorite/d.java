package com.tencent.mm.plugin.favorite;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.widget.Toast;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.fav.a.i;
import com.tencent.mm.plugin.fav.a.m;
import com.tencent.mm.plugin.fav.a.m.a;
import com.tencent.mm.plugin.fav.a.m.b;
import com.tencent.mm.plugin.fav.ui.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.f;
import com.tencent.mm.pluginsdk.ui.applet.g.a;
import com.tencent.mm.protocal.c.avq;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.wa;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wf;
import com.tencent.mm.protocal.c.wk;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.wu;
import com.tencent.mm.protocal.c.wy;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.bd.a;
import com.tencent.mm.ui.widget.a.c.a.b;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class d
{
  private static int[] jfV = { R.h.chatting_note_thumb_iv_0, R.h.chatting_note_thumb_iv_1, R.h.chatting_note_thumb_iv_2, R.h.chatting_note_thumb_iv_3, R.h.chatting_note_thumb_iv_4 };
  
  private static String G(com.tencent.mm.plugin.fav.a.g paramg)
  {
    if (paramg.field_favProto == null) {}
    do
    {
      return null;
      if ((paramg.field_favProto.rAN != null) && (!bi.oW(paramg.field_favProto.rAN.canvasPageXml))) {
        return paramg.field_favProto.rAN.thumbUrl;
      }
      paramg = paramg.field_favProto.rBI;
    } while ((paramg == null) || (paramg.size() != 1));
    return ((vx)paramg.get(0)).dwE;
  }
  
  private static void a(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, wn paramwn)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramg.field_localId);
    localIntent.putExtra("show_share", paramBoolean);
    a(paramwn, localIntent);
    i.cJ("FavRecordDetailUI", paramwn.bJK);
    com.tencent.mm.bg.d.b(paramContext, "record", ".ui.FavRecordDetailUI", localIntent);
  }
  
  private static void a(com.tencent.mm.plugin.fav.a.g paramg, wn paramwn, Intent paramIntent)
  {
    a(paramwn, paramIntent);
    paramIntent.putExtra("key_detail_info_id", paramg.field_localId);
  }
  
  public static void a(g.a parama, Context paramContext, com.tencent.mm.plugin.fav.a.g paramg)
  {
    Object localObject4 = null;
    Object localObject3 = null;
    if ((paramg == null) || (paramContext == null))
    {
      x.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      return;
    }
    vx localvx1 = com.tencent.mm.plugin.fav.a.b.c(paramg);
    if (paramg == null)
    {
      x.w("MicroMsg.FavItemLogic", "GetThumbUrlAndLocalPath favItemInfo is null");
      label39:
      localObject1 = null;
      label41:
      if (!(localObject1 instanceof String)) {
        break label1304;
      }
    }
    Object localObject2;
    for (Object localObject1 = (String)localObject1;; localObject1 = null)
    {
      localObject2 = paramg.field_favProto.rAN;
      switch (paramg.field_type)
      {
      case 3: 
      case 9: 
      case 10: 
      case 11: 
      case 12: 
      case 13: 
      case 15: 
      case 17: 
      default: 
        paramg = (com.tencent.mm.plugin.fav.a.g)localObject3;
        if (localObject2 != null)
        {
          paramg = (com.tencent.mm.plugin.fav.a.g)localObject3;
          if (!bi.oW(((xa)localObject2).title)) {
            paramg = ((xa)localObject2).title;
          }
        }
        localObject1 = paramg;
        if (bi.oW(paramg)) {
          localObject1 = localvx1.title;
        }
        parama.TH(paramContext.getResources().getString(R.l.app_app) + (String)localObject1);
        return;
        vx localvx2 = com.tencent.mm.plugin.fav.a.b.c(paramg);
        if (5 == paramg.field_type)
        {
          localObject1 = new File(com.tencent.mm.plugin.fav.a.b.c(localvx2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label41;
          }
          localObject1 = paramg.field_favProto.rAN;
          if (localObject1 == null) {}
          for (localObject1 = null;; localObject1 = ((xa)localObject1).thumbUrl)
          {
            localObject2 = localObject1;
            if (bi.oW((String)localObject1)) {
              localObject2 = localvx2.bJv;
            }
            localObject2 = com.tencent.mm.plugin.fav.a.b.Bd((String)localObject2);
            localObject1 = localObject2;
            if (!bi.oW((String)localObject2)) {
              break;
            }
            localObject1 = Integer.valueOf(R.k.app_attach_file_icon_webpage);
            break;
          }
        }
        if ((11 == paramg.field_type) || (10 == paramg.field_type))
        {
          localObject1 = paramg.field_favProto.rAP;
          if (localObject1 != null)
          {
            localObject2 = com.tencent.mm.plugin.fav.a.b.Bd(((wk)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bi.oW((String)localObject2)) {
              break label41;
            }
            localObject1 = Integer.valueOf(R.k.app_attach_file_icon_unknow);
            break label41;
          }
        }
        if ((15 == paramg.field_type) || (12 == paramg.field_type))
        {
          localObject1 = paramg.field_favProto.rAR;
          if (localObject1 != null)
          {
            localObject2 = com.tencent.mm.plugin.fav.a.b.Bd(((wu)localObject1).thumbUrl);
            localObject1 = localObject2;
            if (!bi.oW((String)localObject2)) {
              break label41;
            }
            localObject1 = Integer.valueOf(R.k.app_attach_file_icon_unknow);
            break label41;
          }
        }
        if ((2 == paramg.field_type) || (7 == paramg.field_type) || (16 == paramg.field_type) || (4 == paramg.field_type))
        {
          localObject1 = new File(com.tencent.mm.plugin.fav.a.b.c(localvx2));
          if (((File)localObject1).exists())
          {
            localObject1 = ((File)localObject1).getAbsolutePath();
            break label41;
          }
          localObject1 = com.tencent.mm.plugin.fav.a.b.Bd(localvx2.bJv);
          localObject2 = localObject1;
          if (bi.oW((String)localObject1))
          {
            com.tencent.mm.plugin.fav.a.b.a(paramg, localvx2);
            localObject2 = com.tencent.mm.plugin.fav.a.b.c(localvx2);
          }
          localObject1 = localObject2;
          if (!bi.oW((String)localObject2)) {
            break label41;
          }
        }
        switch (paramg.field_type)
        {
        default: 
          localObject1 = Integer.valueOf(R.k.app_attach_file_icon_video);
          break;
        case 2: 
          localObject1 = Integer.valueOf(R.g.app_attach_file_icon_pic);
          break;
        case 7: 
          localObject1 = Integer.valueOf(R.k.app_attach_file_icon_music);
          break;
          if ((3 == paramg.field_type) || (6 == paramg.field_type)) {
            break label39;
          }
          if (8 == paramg.field_type)
          {
            localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.Sz(localvx2.rzD));
            break;
          }
          if (17 == paramg.field_type)
          {
            au.HU();
            localObject1 = com.tencent.mm.model.c.FT().GR(localvx2.desc);
            if ((((bd.a)localObject1).otZ != null) && (((bd.a)localObject1).otZ.length() != 0))
            {
              localObject1 = new SpannableString(((bd.a)localObject1).otZ);
              break;
            }
            localObject1 = Integer.valueOf(R.g.default_avatar);
            break;
          }
          if ((14 != paramg.field_type) || (paramg.field_favProto.rBI == null)) {
            break label39;
          }
          localObject1 = paramg.field_favProto.rBI.iterator();
          do
          {
            do
            {
              if (!((Iterator)localObject1).hasNext()) {
                break;
              }
              localvx2 = (vx)((Iterator)localObject1).next();
            } while (localvx2.bjS == 1);
            if (localvx2.bjS == 3)
            {
              localObject1 = Integer.valueOf(R.k.app_attach_file_icon_voice);
              break label41;
            }
            if (localvx2.bjS == 6)
            {
              localObject1 = Integer.valueOf(R.k.app_attach_file_icon_location);
              break label41;
            }
            if (localvx2.bjS == 8)
            {
              localObject1 = Integer.valueOf(com.tencent.mm.pluginsdk.c.Sz(localvx2.rzD));
              break label41;
            }
            if ((localvx2.bjS == 2) || (localvx2.bjS == 7) || (localvx2.bjS == 15) || (localvx2.bjS == 4))
            {
              localObject1 = new File(com.tencent.mm.plugin.fav.a.b.c(localvx2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label41;
              }
              localObject1 = com.tencent.mm.plugin.fav.a.b.Bd(localvx2.bJv);
              if (bi.oW((String)localObject1)) {
                switch (localvx2.bjS)
                {
                default: 
                  localObject1 = Integer.valueOf(R.k.app_attach_file_icon_video);
                  break;
                case 2: 
                  localObject1 = Integer.valueOf(R.g.app_attach_file_icon_pic);
                  break;
                case 7: 
                  localObject1 = Integer.valueOf(R.k.app_attach_file_icon_music);
                  break;
                }
              }
              break label41;
            }
            if (localvx2.bjS == 5)
            {
              localObject1 = new File(com.tencent.mm.plugin.fav.a.b.c(localvx2));
              if (((File)localObject1).exists())
              {
                localObject1 = ((File)localObject1).getAbsolutePath();
                break label41;
              }
              localObject1 = localvx2.rAi.rAN;
              if (localObject1 == null) {}
              for (localObject1 = null;; localObject1 = ((xa)localObject1).thumbUrl)
              {
                localObject2 = localObject1;
                if (bi.oW((String)localObject1)) {
                  localObject2 = localvx2.bJv;
                }
                localObject2 = com.tencent.mm.plugin.fav.a.b.Bd((String)localObject2);
                localObject1 = localObject2;
                if (!bi.oW((String)localObject2)) {
                  break;
                }
                localObject1 = Integer.valueOf(R.k.app_attach_file_icon_webpage);
                break;
              }
            }
            if ((localvx2.bjS == 10) || (localvx2.bjS == 11))
            {
              localObject2 = localvx2.rAi.rAP;
              if (localObject2 != null)
              {
                localObject2 = com.tencent.mm.plugin.fav.a.b.Bd(((wk)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bi.oW((String)localObject2)) {
                  break label41;
                }
                localObject1 = Integer.valueOf(R.k.app_attach_file_icon_unknow);
                break label41;
              }
            }
            if ((localvx2.bjS == 12) || (localvx2.bjS == 14))
            {
              localObject2 = localvx2.rAi.rAR;
              if (localObject2 != null)
              {
                localObject2 = com.tencent.mm.plugin.fav.a.b.Bd(((wu)localObject2).thumbUrl);
                localObject1 = localObject2;
                if (!bi.oW((String)localObject2)) {
                  break label41;
                }
                localObject1 = Integer.valueOf(R.k.app_attach_file_icon_unknow);
                break label41;
              }
            }
          } while (localvx2.bjS != 16);
          au.HU();
          localObject1 = com.tencent.mm.model.c.FT().GR(localvx2.desc);
          if ((((bd.a)localObject1).otZ != null) && (((bd.a)localObject1).otZ.length() != 0))
          {
            localObject1 = new SpannableString(((bd.a)localObject1).otZ);
            break;
          }
          localObject1 = Integer.valueOf(R.g.default_avatar);
          break;
          label1304:
          if ((localObject1 instanceof Integer)) {
            ((Integer)localObject1).intValue();
          }
          break;
        }
        break;
      }
    }
    localObject1 = paramg.field_favProto.title;
    paramg = (com.tencent.mm.plugin.fav.a.g)localObject1;
    if (bi.oW((String)localObject1)) {
      paramg = localvx1.title;
    }
    parama.TH(paramContext.getResources().getString(R.l.app_file) + paramg);
    return;
    parama.TH(paramg.field_favProto.desc);
    parama.cdO();
    parama.a(new d.2(paramg, paramContext));
    return;
    paramg = paramg.field_favProto.rAL;
    parama.TH(paramContext.getString(R.l.app_location) + paramg.label);
    return;
    if ((localObject2 != null) && (!bi.oW(((xa)localObject2).title)))
    {
      paramg = ((xa)localObject2).title;
      localObject1 = ((xa)localObject2).desc;
    }
    for (;;)
    {
      localObject2 = paramg;
      if (bi.oW(paramg)) {
        localObject2 = localvx1.title;
      }
      if (bi.oW((String)localObject1)) {
        paramg = localvx1.desc;
      }
      parama.TH(paramContext.getResources().getString(R.l.app_url) + (String)localObject2);
      return;
      paramg = h.a.a(paramContext, paramg).title;
      parama.TH(paramContext.getResources().getString(R.l.app_record) + paramg);
      return;
      parama.c(com.tencent.mm.sdk.platformtools.c.Wb((String)localObject1), 3);
      return;
      parama.c(com.tencent.mm.sdk.platformtools.c.Wb((String)localObject1), 2);
      return;
      parama.c(com.tencent.mm.sdk.platformtools.c.Wb((String)localObject1), 2);
      return;
      localObject1 = paramContext.getResources().getString(R.l.app_note);
      paramContext = h.a.a(paramContext, paramg).desc.replaceAll("\n", " ");
      parama.TH((String)localObject1 + paramContext);
      return;
      paramg = (com.tencent.mm.plugin.fav.a.g)localObject4;
      if (localObject2 != null)
      {
        paramg = (com.tencent.mm.plugin.fav.a.g)localObject4;
        if (!bi.oW(((xa)localObject2).title)) {
          paramg = ((xa)localObject2).title;
        }
      }
      localObject1 = paramg;
      if (bi.oW(paramg)) {
        localObject1 = localvx1.title;
      }
      parama.TH(paramContext.getResources().getString(R.l.app_music) + (String)localObject1);
      return;
      localObject1 = null;
      paramg = null;
    }
  }
  
  private static void a(wn paramwn, Intent paramIntent)
  {
    paramIntent.putExtra("key_detail_fav_scene", paramwn.scene);
    paramIntent.putExtra("key_detail_fav_sub_scene", paramwn.iVT);
    paramIntent.putExtra("key_detail_fav_index", paramwn.index);
    paramIntent.putExtra("key_detail_fav_query", paramwn.bWm);
    paramIntent.putExtra("key_detail_fav_sessionid", paramwn.bJK);
    paramIntent.putExtra("key_detail_fav_tags", paramwn.iVW);
  }
  
  public static void b(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, wn paramwn)
  {
    if (paramContext == null) {
      x.w("MicroMsg.FavItemLogic", "Context is null");
    }
    do
    {
      return;
      if (paramg == null)
      {
        x.w("MicroMsg.FavItemLogic", "Fav item is null");
        return;
      }
      x.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", new Object[] { Long.valueOf(paramg.field_localId), Integer.valueOf(paramg.field_type) });
      long l;
      Object localObject2;
      Object localObject3;
      switch (paramg.field_type)
      {
      case -1: 
      case 0: 
      case 9: 
      case 13: 
      default: 
        x.w("MicroMsg.FavItemLogic", "Do not match any type %d", new Object[] { Integer.valueOf(paramg.field_type) });
        return;
      case 1: 
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("key_detail_text", paramg.field_favProto.desc);
        ((Intent)localObject1).putExtra("key_detail_info_id", paramg.field_localId);
        ((Intent)localObject1).putExtra("key_detail_can_share_to_friend", paramg.aLd());
        ((Intent)localObject1).putExtra("key_detail_time", paramg.field_updateTime);
        if (paramg.field_sourceCreateTime <= 0L) {}
        for (l = paramg.field_updateTime;; l = paramg.field_sourceCreateTime)
        {
          ((Intent)localObject1).putExtra("key_detail_create_time", l);
          a(paramwn, (Intent)localObject1);
          i.cJ("FavoriteTextDetailUI", paramwn.bJK);
          com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteTextDetailUI", (Intent)localObject1);
          return;
        }
      case 2: 
        e(paramContext, paramg, paramwn);
        return;
      case 3: 
        localObject1 = new Intent();
        a(paramg, paramwn, (Intent)localObject1);
        ((Intent)localObject1).putExtra("key_detail_create_time", paramg.field_favProto.rBG.createTime);
        i.cJ("FavoriteVoiceDetailUI", paramwn.bJK);
        com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteVoiceDetailUI", (Intent)localObject1);
        return;
      case 16: 
        localObject1 = com.tencent.mm.plugin.fav.a.b.c(paramg);
        if ((localObject1 != null) && (((vx)localObject1).rAo != null) && ((!bi.oW(((vx)localObject1).rAo.dyJ)) || (!bi.oW(((vx)localObject1).rAo.dyN))))
        {
          x.i("MicroMsg.FavItemLogic", "it is ad sight.");
          c(paramContext, paramg, paramwn);
          return;
        }
        d(paramContext, paramg, paramwn);
        return;
      case 4: 
        d(paramContext, paramg, paramwn);
        return;
      case 5: 
        d(paramContext, paramg, true, paramwn);
        return;
      case 6: 
        localObject2 = paramg.field_favProto.rAL;
        localObject3 = paramg.field_favProto.fky;
        localObject1 = paramg.field_favProto.rBG;
        if ((localObject1 != null) && (!bi.oW(((wr)localObject1).rBh))) {}
        for (localObject1 = r.gT(((wr)localObject1).rBh);; localObject1 = r.gT(paramg.field_fromUser))
        {
          ArrayList localArrayList = new ArrayList();
          if (paramg.field_tagProto.rBX != null) {
            localArrayList.addAll(paramg.field_tagProto.rBX);
          }
          i.cJ("RedirectUI", paramwn.bJK);
          com.tencent.mm.plugin.fav.a.b.a(paramg.field_localId, (we)localObject2, (String)localObject1, (String)localObject3, localArrayList, paramContext);
          return;
        }
      case 7: 
        localObject2 = paramg.field_favProto.rBG;
        localObject3 = com.tencent.mm.plugin.fav.a.b.c(paramg);
        localObject1 = new File(com.tencent.mm.plugin.fav.a.b.c((vx)localObject3));
        if (!((File)localObject1).exists()) {
          if (((vx)localObject3).bJv == null) {
            localObject1 = "";
          }
        }
        for (;;)
        {
          localObject1 = ((com.tencent.mm.an.a.b)com.tencent.mm.kernel.g.l(com.tencent.mm.an.a.b.class)).a(6, null, ((vx)localObject3).title, ((vx)localObject3).desc, ((vx)localObject3).rzv, ((vx)localObject3).rzz, ((vx)localObject3).rzx, ((vx)localObject3).jdM, com.tencent.mm.plugin.fav.a.b.aKV(), (String)localObject1, "", ((wr)localObject2).appId);
          com.tencent.mm.an.b.b((avq)localObject1);
          ((avq)localObject1).eaZ = String.valueOf(paramg.field_localId);
          paramg = new Intent();
          paramg.putExtra("key_scene", 2);
          i.cJ("MusicMainUI", paramwn.bJK);
          com.tencent.mm.bg.d.b(paramContext, "music", ".ui.MusicMainUI", paramg);
          return;
          localObject1 = new File(com.tencent.mm.plugin.fav.a.b.aKO() + com.tencent.mm.a.g.u(((vx)localObject3).bJv.getBytes()));
          if (((File)localObject1).exists()) {}
          for (localObject1 = ((File)localObject1).getAbsolutePath();; localObject1 = "") {
            break;
          }
          localObject1 = ((File)localObject1).getAbsolutePath();
        }
      case 8: 
        c(paramContext, paramg, true, paramwn);
        return;
      case 10: 
        x.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
        l = paramg.field_localId;
        paramg = paramg.field_favProto.rAP.info;
        paramwn = new Intent();
        paramwn.putExtra("key_is_favorite_item", true);
        paramwn.putExtra("key_favorite_local_id", l);
        paramwn.putExtra("key_Product_xml", paramg);
        paramwn.putExtra("key_can_delete_favorite_item", true);
        paramwn.putExtra("key_ProductUI_getProductInfoScene", 3);
        com.tencent.mm.bg.d.b(paramContext, "scanner", ".ui.ProductUI", paramwn);
        return;
      case 12: 
      case 15: 
        x.d("MicroMsg.FavItemLogic", "start tv ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
        l = paramg.field_localId;
        paramg = paramg.field_favProto.rAR.info;
        paramwn = new Intent();
        paramwn.putExtra("key_TV_getProductInfoScene", 3);
        paramwn.putExtra("key_is_favorite_item", true);
        paramwn.putExtra("key_favorite_local_id", l);
        paramwn.putExtra("key_TV_xml", paramg);
        paramwn.putExtra("key_can_delete_favorite_item", true);
        com.tencent.mm.bg.d.b(paramContext, "shake", ".ui.TVInfoUI", paramwn);
        return;
      case 11: 
        x.d("MicroMsg.FavItemLogic", "start product ui, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
        paramwn = new Intent();
        paramwn.putExtra("key_product_scene", 4);
        paramwn.putExtra("key_product_info", paramg.field_favProto.rAP.info);
        com.tencent.mm.bg.d.b(paramContext, "product", ".ui.MallProductUI", paramwn);
        return;
      case 14: 
        a(paramContext, paramg, true, paramwn);
        return;
      case 17: 
        paramg = com.tencent.mm.plugin.fav.a.b.c(paramg).desc;
        au.HU();
        paramg = com.tencent.mm.model.c.FT().GR(paramg);
      }
    } while (paramg == null);
    Object localObject1 = new Intent();
    ((Intent)localObject1).putExtra("Contact_User", paramg.otZ);
    ((Intent)localObject1).putExtra("Contact_Alias", paramg.cCR);
    ((Intent)localObject1).putExtra("Contact_Nick", paramg.nickname);
    ((Intent)localObject1).putExtra("Contact_QuanPin", paramg.eLA);
    ((Intent)localObject1).putExtra("Contact_PyInitial", paramg.eLz);
    ((Intent)localObject1).putExtra("Contact_Uin", paramg.lWQ);
    ((Intent)localObject1).putExtra("Contact_Mobile_MD5", paramg.tbE);
    ((Intent)localObject1).putExtra("Contact_full_Mobile_MD5", paramg.tbF);
    ((Intent)localObject1).putExtra("Contact_QQNick", paramg.cmJ());
    ((Intent)localObject1).putExtra("User_From_Fmessage", false);
    ((Intent)localObject1).putExtra("Contact_Scene", paramg.scene);
    ((Intent)localObject1).putExtra("Contact_FMessageCard", true);
    ((Intent)localObject1).putExtra("Contact_RemarkName", paramg.eLE);
    ((Intent)localObject1).putExtra("Contact_VUser_Info_Flag", paramg.pOR);
    ((Intent)localObject1).putExtra("Contact_VUser_Info", paramg.csP);
    ((Intent)localObject1).putExtra("Contact_BrandIconURL", paramg.lUI);
    ((Intent)localObject1).putExtra("Contact_Province", paramg.getProvince());
    ((Intent)localObject1).putExtra("Contact_City", paramg.getCity());
    ((Intent)localObject1).putExtra("Contact_Sex", paramg.sex);
    ((Intent)localObject1).putExtra("Contact_Signature", paramg.signature);
    ((Intent)localObject1).putExtra("Contact_ShowUserName", false);
    ((Intent)localObject1).putExtra("Contact_KSnsIFlag", 0);
    i.cJ("ContactInfoUI", paramwn.bJK);
    com.tencent.mm.bg.d.b(paramContext, "profile", ".ui.ContactInfoUI", (Intent)localObject1);
    com.tencent.mm.bh.a.Cy(paramg.scene);
    return;
    b(paramContext, paramg, true, paramwn);
    return;
    Toast.makeText(paramContext, R.l.favorite_unknown_type, 0).show();
  }
  
  private static void b(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, wn paramwn)
  {
    x.i("MicroMsg.FavItemLogic", "click WNNoteItem, handleWNNoteItem");
    kp localkp = new kp();
    localkp.bUP.field_localId = paramg.field_localId;
    if (paramg.field_localId == -1L) {
      localkp.bUP.bUW = 4;
    }
    for (;;)
    {
      localkp.bUP.context = paramContext;
      paramContext = new Bundle();
      wf localwf = paramg.field_favProto.qYa;
      if (localwf != null)
      {
        paramContext.putString("noteauthor", localwf.rBz);
        paramContext.putString("noteeditor", localwf.rBA);
      }
      paramContext.putLong("edittime", paramg.field_updateTime);
      localkp.bUP.bUU = paramContext;
      localkp.bUP.field_favProto = paramg.field_favProto;
      localkp.bUP.type = 2;
      localkp.bUP.bUY = paramBoolean;
      localkp.bUP.bUZ = paramwn;
      com.tencent.mm.sdk.b.a.sFg.m(localkp);
      i.cJ("NoteEditorUI", paramwn.bJK);
      return;
      localkp.bUP.bUR = paramg.field_xml;
    }
  }
  
  public static void b(g.a parama, final Context paramContext, final com.tencent.mm.plugin.fav.a.g paramg)
  {
    if ((paramg == null) || (paramContext == null))
    {
      x.w("MicroMsg.FavItemLogic", "getDisplayInfo favItemInfo is null");
      return;
    }
    vx localvx = com.tencent.mm.plugin.fav.a.b.c(paramg);
    switch (paramg.field_type)
    {
    case 3: 
    case 7: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 15: 
    case 17: 
    default: 
      return;
    case 1: 
      parama.a(new c.a.b()
      {
        public final void aMV()
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("Retr_Msg_content", this.iVw.field_favProto.desc);
          com.tencent.mm.bg.d.e(paramContext, ".ui.transmit.RetransmitPreviewUI", localIntent);
          com.tencent.mm.ui.base.b.gE(paramContext);
        }
      });
      return;
    case 8: 
      parama.a(new d.3(paramContext, paramg));
      return;
    case 6: 
      parama.a(new d.5(paramg.field_favProto.rAL, paramContext));
      return;
    case 5: 
      parama.a(new c.a.b()
      {
        public final void aMV()
        {
          d.g(this.val$context, paramg, new wn());
        }
      });
      return;
    case 14: 
      parama.a(new d.7(paramContext, paramg));
      return;
    case 2: 
      parama.a(new d.8(paramg, localvx, paramContext));
      return;
    case 4: 
    case 16: 
      parama.a(new c.a.b()
      {
        public final void aMV()
        {
          vx localvx = com.tencent.mm.plugin.fav.a.b.c(this.iVw);
          if (localvx == null)
          {
            x.e("MicroMsg.FavItemLogic", "goPlayView, but dataitem is null , exit");
            return;
          }
          if ((localvx.rAo != null) && ((!bi.oW(localvx.rAo.dyJ)) || (!bi.oW(localvx.rAo.dyN))))
          {
            x.i("MicroMsg.FavItemLogic", "it is ad sight.use sight play");
            localIntent = new Intent();
            localIntent.putExtra("key_detail_info_id", this.iVw.field_localId);
            localIntent.putExtra("key_detail_data_id", localvx.jdM);
            localIntent.putExtra("key_detail_can_delete", false);
            com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteFileDetailUI", localIntent);
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("key_detail_info_id", this.iVw.field_localId);
          localIntent.putExtra("key_detail_fav_path", com.tencent.mm.plugin.fav.a.b.b(localvx));
          localIntent.putExtra("key_detail_fav_thumb_path", com.tencent.mm.plugin.fav.a.b.c(localvx));
          localIntent.putExtra("key_detail_fav_video_duration", localvx.duration);
          localIntent.putExtra("key_detail_statExtStr", localvx.bZN);
          localIntent.putExtra("show_share", false);
          com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteVideoPlayUI", localIntent);
        }
      });
      return;
    }
    parama.a(new d.1(paramContext, paramg));
  }
  
  private static void c(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, wn paramwn)
  {
    m.a(m.a.iWj, paramg);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_info_id", paramg.field_localId);
    a(paramwn, localIntent);
    com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteSightDetailUI", localIntent);
  }
  
  private static void c(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, wn paramwn)
  {
    Object localObject = com.tencent.mm.plugin.fav.a.b.c(paramg);
    if (com.tencent.mm.plugin.fav.a.b.f((vx)localObject))
    {
      if (com.tencent.mm.plugin.fav.a.b.g((vx)localObject)) {
        e(paramContext, paramg, paramwn);
      }
      while (!com.tencent.mm.pluginsdk.ui.tools.a.a((Activity)paramContext, com.tencent.mm.plugin.fav.a.b.b((vx)localObject), ((vx)localObject).rzD, 2)) {
        return;
      }
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("key_detail_info_id", paramg.field_localId);
    ((Intent)localObject).putExtra("show_share", paramBoolean);
    a(paramwn, (Intent)localObject);
    i.cJ("FavoriteFileDetailUI", paramwn.bJK);
    com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteFileDetailUI", (Intent)localObject);
  }
  
  private static void d(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, wn paramwn)
  {
    vx localvx = com.tencent.mm.plugin.fav.a.b.c(paramg);
    Object localObject1 = localvx.rAo;
    if ((localObject1 == null) || (bi.oW(((wa)localObject1).dyJ))) {}
    Object localObject2;
    for (int i = 0; i != 0; i = 1)
    {
      return;
      m.a(m.a.iWl, paramg);
      localObject2 = com.tencent.mm.plugin.fav.a.b.c(localvx);
      Intent localIntent = new Intent();
      localIntent.putExtra("IsAd", false);
      localIntent.putExtra("KStremVideoUrl", ((wa)localObject1).dyJ);
      localIntent.putExtra("StreamWording", ((wa)localObject1).dyM);
      localIntent.putExtra("StremWebUrl", ((wa)localObject1).dyN);
      localIntent.putExtra("KThumUrl", ((wa)localObject1).dyO);
      localIntent.putExtra("KSta_StremVideoAduxInfo", ((wa)localObject1).dyP);
      localIntent.putExtra("KSta_StremVideoPublishId", ((wa)localObject1).dyQ);
      localIntent.putExtra("KSta_SourceType", 2);
      localIntent.putExtra("KSta_Scene", m.b.iWv.value);
      localIntent.putExtra("KSta_FromUserName", paramg.field_fromUser);
      localIntent.putExtra("KSta_FavID", paramg.field_id);
      localIntent.putExtra("KSta_SnsStatExtStr", localvx.bZN);
      localIntent.putExtra("KBlockFav", true);
      localIntent.putExtra("KMediaId", "fakeid_" + paramg.field_id);
      localIntent.putExtra("KThumbPath", (String)localObject2);
      localIntent.putExtra("KMediaVideoTime", ((wa)localObject1).rBq);
      localIntent.putExtra("KMediaTitle", ((wa)localObject1).dyL);
      com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.VideoAdPlayerUI", localIntent);
    }
    if ((bi.oW(localvx.rzF)) || (localvx.rzJ <= 0L))
    {
      x.w("MicroMsg.FavItemLogic", "full md5[%s], fullsize[%d], start use url", new Object[] { localvx.rzF, Long.valueOf(localvx.rzJ) });
      localObject2 = com.tencent.mm.plugin.fav.a.b.c(paramg).rzv;
      localObject1 = localObject2;
      if (bi.oW((String)localObject2)) {
        localObject1 = com.tencent.mm.plugin.fav.a.b.c(paramg).rzz;
      }
      if (bi.oW((String)localObject1))
      {
        x.w("MicroMsg.FavItemLogic", "onClick video url null, return");
        c(paramContext, paramg, paramwn);
        return;
      }
      paramwn = new Intent();
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("key_snsad_statextstr", localvx.bZN);
      ((Bundle)localObject2).putLong("favlocalid", paramg.field_localId);
      paramwn.putExtra("jsapiargs", (Bundle)localObject2);
      paramwn.putExtra("rawUrl", (String)localObject1);
      paramwn.putExtra("is_favorite_item", true);
      paramwn.putExtra("fav_local_id", paramg.field_localId);
      paramwn.putExtra("geta8key_scene", 14);
      x.d("MicroMsg.FavItemLogic", "start video webview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
      paramwn.putExtra("geta8key_scene", 14);
      com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", paramwn);
      return;
    }
    localObject1 = new Intent();
    a(paramg, paramwn, (Intent)localObject1);
    i.cJ("FavoriteSightDetailUI", paramwn.bJK);
    com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteSightDetailUI", (Intent)localObject1);
  }
  
  private static void d(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, boolean paramBoolean, wn paramwn)
  {
    if (paramg.field_favProto != null) {
      if ((paramg.field_favProto.rAN != null) && (!bi.oW(paramg.field_favProto.rAN.canvasPageXml)))
      {
        localObject1 = paramg.field_favProto.rAN.canvasPageXml;
        if (bi.oW((String)localObject1)) {
          break label200;
        }
        paramwn = new Intent();
        paramwn.putExtra("sns_landing_pages_xml", (String)localObject1);
        paramwn.putExtra("sns_landig_pages_from_source", 7);
        paramwn.putExtra("sns_landing_pages_share_thumb_url", G(paramg));
        paramwn.putExtra("sns_landing_favid", q.GF() + "_" + paramg.field_id);
        paramwn.addFlags(268435456);
        com.tencent.mm.bg.d.b(paramContext, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", paramwn);
      }
    }
    label200:
    wr localwr;
    Object localObject3;
    Object localObject4;
    do
    {
      return;
      localObject1 = paramg.field_favProto.rBI;
      if ((localObject1 != null) && (((List)localObject1).size() == 1))
      {
        localObject1 = ((vx)((List)localObject1).get(0)).canvasPageXml;
        break;
      }
      localObject1 = null;
      break;
      localwr = paramg.field_favProto.rBG;
      localObject3 = "";
      localObject1 = "";
      localObject2 = "";
      if (paramg.field_favProto.rAN != null)
      {
        localObject2 = paramg.field_favProto.rAN;
        localObject3 = ((xa)localObject2).rCn;
        localObject1 = ((xa)localObject2).title;
        localObject2 = ((xa)localObject2).desc;
      }
      localObject4 = localObject3;
      if (localwr != null)
      {
        localObject4 = localObject3;
        if (bi.oW((String)localObject3)) {
          localObject4 = localwr.egr;
        }
      }
    } while (bi.oW((String)localObject4));
    vx localvx = com.tencent.mm.plugin.fav.a.b.c(paramg);
    Object localObject5 = localObject1;
    Object localObject6 = localObject2;
    if (localvx != null)
    {
      localObject3 = localObject1;
      if (bi.oW((String)localObject1)) {
        localObject3 = localvx.title;
      }
      localObject5 = localObject3;
      localObject6 = localObject2;
      if (bi.oW((String)localObject2))
      {
        localObject6 = localvx.desc;
        localObject5 = localObject3;
      }
    }
    x.d("MicroMsg.FavItemLogic", "start web view, fav id %d, fav local id %d", new Object[] { Integer.valueOf(paramg.field_id), Long.valueOf(paramg.field_localId) });
    Object localObject1 = new Intent();
    ((Intent)localObject1).putExtra("rawUrl", (String)localObject4);
    ((Intent)localObject1).putExtra("showShare", paramBoolean);
    ((Intent)localObject1).putExtra("is_favorite_item", true);
    ((Intent)localObject1).putExtra("fav_local_id", paramg.field_localId);
    Object localObject2 = new Bundle();
    ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_chat", paramg.aLd());
    ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_sns", paramg.aLe());
    if ((paramg.field_favProto.rAW & 0x4) != 0)
    {
      paramBoolean = true;
      ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_weibo", paramBoolean);
      if ((paramg.field_favProto.rAW & 0x8) == 0) {
        break label1053;
      }
      paramBoolean = true;
      label521:
      ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_cplink", paramBoolean);
      if ((paramg.field_favProto.rAW & 0x10) == 0) {
        break label1058;
      }
      paramBoolean = true;
      label545:
      ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_browser", paramBoolean);
      if ((paramg.field_favProto.rAW & 0x20) == 0) {
        break label1063;
      }
      paramBoolean = true;
      label569:
      ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_weiyun", paramBoolean);
      if ((paramg.field_favProto.rAW & 0x40) == 0) {
        break label1068;
      }
    }
    label1053:
    label1058:
    label1063:
    label1068:
    for (paramBoolean = true;; paramBoolean = false)
    {
      ((Bundle)localObject2).putBoolean("key_ctrl_flag_open_facebook", paramBoolean);
      x.i("MicroMsg.FavItemInfo", "get ctrl args=[%s]", new Object[] { ((Bundle)localObject2).toString() });
      ((Intent)localObject1).putExtra("favorite_control_argument", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("sentUsername", paramg.field_fromUser);
      if ((localwr != null) && (!bi.oW(localwr.bGy))) {
        ((Intent)localObject1).putExtra("srcDisplayname", r.gT(localwr.bGy));
      }
      ((Intent)localObject1).putExtra("mode", 1);
      ((Intent)localObject1).putExtra("geta8key_scene", 14);
      localObject2 = new Bundle();
      ((Bundle)localObject2).putString("key_snsad_statextstr", com.tencent.mm.plugin.fav.a.b.c(paramg).bZN);
      ((Bundle)localObject2).putLong("favlocalid", paramg.field_localId);
      ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("from_scence", 4);
      localObject2 = "fav_" + q.GF() + "_" + paramg.field_id;
      ((Intent)localObject1).putExtra("KPublisherId", (String)localObject2);
      ((Intent)localObject1).putExtra("pre_username", paramg.field_fromUser);
      ((Intent)localObject1).putExtra("prePublishId", (String)localObject2);
      ((Intent)localObject1).putExtra("preUsername", paramg.field_fromUser);
      ((Intent)localObject1).putExtra("share_report_pre_msg_url", (String)localObject4);
      ((Intent)localObject1).putExtra("share_report_pre_msg_title", (String)localObject5);
      ((Intent)localObject1).putExtra("share_report_pre_msg_desc", (String)localObject6);
      ((Intent)localObject1).putExtra("share_report_pre_msg_icon_url", G(paramg));
      ((Intent)localObject1).putExtra("share_report_pre_msg_appid", "");
      ((Intent)localObject1).putExtra("share_report_from_scene", 4);
      localObject2 = com.tencent.mm.modelstat.a.b.no(com.tencent.mm.pluginsdk.model.d.class.getName());
      ((Bundle)localObject2).putInt("mm_rpt_fav_id", paramg.field_id);
      ((Bundle)localObject2).putInt("key_detail_fav_scene", paramwn.scene);
      ((Bundle)localObject2).putInt("key_detail_fav_sub_scene", paramwn.iVT);
      ((Bundle)localObject2).putInt("key_detail_fav_index", paramwn.index);
      ((Bundle)localObject2).putString("key_detail_fav_query", paramwn.bWm);
      ((Bundle)localObject2).putString("key_detail_fav_sessionid", paramwn.bJK);
      ((Bundle)localObject2).putString("key_detail_fav_tags", paramwn.iVW);
      i.cJ("WebViewUI", paramwn.bJK);
      ((Intent)localObject1).putExtra("mm_report_bundle", (Bundle)localObject2);
      ((Intent)localObject1).putExtra("geta8key_scene", 14);
      com.tencent.mm.bg.d.b(paramContext, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      return;
      paramBoolean = false;
      break;
      paramBoolean = false;
      break label521;
      paramBoolean = false;
      break label545;
      paramBoolean = false;
      break label569;
    }
  }
  
  private static void e(Context paramContext, com.tencent.mm.plugin.fav.a.g paramg, wn paramwn)
  {
    Intent localIntent = new Intent();
    a(paramg, paramwn, localIntent);
    i.cJ("FavoriteImgDetailUI", paramwn.bJK);
    com.tencent.mm.plugin.fav.a.b.a(paramContext, ".ui.detail.FavoriteImgDetailUI", localIntent);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/favorite/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */