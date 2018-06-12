package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.g.a.fz;
import com.tencent.mm.g.a.fz.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.ui.c;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.plugin.wenote.model.a.r;
import com.tencent.mm.plugin.wenote.model.a.t;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class g
  extends d
  implements e
{
  private static HashMap<com.tencent.mm.plugin.fav.a.g, com.tencent.mm.plugin.wenote.model.a.l> qnX = new HashMap();
  private wn bOW = new wn();
  public boolean bUY = true;
  public long bVe = -1L;
  private com.tencent.mm.plugin.fav.a.g jaq;
  public String qnV;
  public String qnW = "";
  private int qnY = 0;
  private int qnZ = 0;
  public String qoa;
  public int qob = 0;
  public long qoc = 0L;
  public String qod;
  public String qoe;
  
  public g()
  {
    this.qnG.clear();
    this.qnF = null;
    qnL = "";
    this.qnN = false;
    c.aMi();
    au.DF().a(426, this);
  }
  
  private String Sg(String paramString)
  {
    Object localObject = f.eo(this.bVe);
    if (localObject == null) {
      return ((n)this.qnI.get(paramString)).jdM;
    }
    localObject = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rBI.iterator();
    while (((Iterator)localObject).hasNext())
    {
      vx localvx = (vx)((Iterator)localObject).next();
      if ((!bi.oW(localvx.rAq)) && (localvx.rAq.equals(paramString))) {
        return localvx.jdM;
      }
    }
    return ((n)this.qnI.get(paramString)).jdM;
  }
  
  public final void R(Context paramContext, int paramInt)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("note_open_from_scene", paramInt);
    if (paramInt == 4)
    {
      localIntent.putExtra("fav_note_thumbpath", this.qod);
      localIntent.putExtra("fav_note_link_sns_xml", this.qoe);
    }
    localIntent.putExtra("edit_status", this.qnN);
    localIntent.putExtra("show_share", this.bUY);
    localIntent.putExtra("note_fav_localid", this.bVe);
    localIntent.putExtra("note_link_sns_localid", this.qnV);
    localIntent.putExtra("fav_note_xml", this.qnW);
    localIntent.putExtra("fav_note_scroll_to_position", this.qnY);
    localIntent.putExtra("fav_note_scroll_to_offset", this.qnZ);
    localIntent.putExtra("fav_note_link_source_info", this.qoa);
    localIntent.putExtra("note_fav_post_scene", this.qob);
    localIntent.putExtra("key_detail_fav_scene", this.bOW.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.bOW.iVT);
    localIntent.putExtra("key_detail_fav_index", this.bOW.index);
    localIntent.putExtra("key_detail_fav_query", this.bOW.bWm);
    localIntent.putExtra("key_detail_fav_sessionid", this.bOW.bJK);
    localIntent.putExtra("key_detail_fav_tags", this.bOW.iVW);
    com.tencent.mm.bg.d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", localIntent);
  }
  
  public final void Sd(String paramString)
  {
    this.qnW = paramString;
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    if (paraml.getType() == 426)
    {
      paramString = new fz();
      paramString.bOL.bKq = paraml;
      paramString.bOL.type = 31;
      a.sFg.m(paramString);
      if ((!bi.oW(paramString.bOM.path)) && (paramInt2 == 65101)) {
        x.e("MicroMsg.WNNoteFavProcess", "wenote conflict when commit");
      }
      au.DF().b(426, this);
    }
  }
  
  public final void a(long paramLong, Context paramContext, Boolean paramBoolean, int paramInt1, int paramInt2, wn paramwn)
  {
    this.bVe = paramLong;
    this.bUY = paramBoolean.booleanValue();
    this.qnY = paramInt1;
    this.qnZ = paramInt2;
    this.bOW = paramwn;
    this.jaq = f.eo(this.bVe);
    if (this.jaq != null)
    {
      if (this.qoc <= 0L) {
        this.qoc = this.jaq.field_updateTime;
      }
      this.qnO = this.jaq.field_favProto;
      this.qnF = this.jaq;
    }
    if ((this.qob == 0) && (this.qnO.rBG != null)) {
      this.qob = this.qnO.rBG.bJt;
    }
    R(paramContext, 2);
    au.Em().H(new g.2(this));
  }
  
  public final void a(vx paramvx, String paramString)
  {
    com.tencent.mm.plugin.wenote.model.a.l locall = this.qnE;
    fz localfz = new fz();
    localfz.bOL.type = 28;
    localfz.bOL.bJA = locall.msw.field_localId;
    localfz.bOL.bON = paramvx;
    localfz.bOL.path = paramString;
    localfz.bOL.bOS = 18;
    a.sFg.m(localfz);
  }
  
  public final void aX(Context paramContext, String paramString)
  {
    t localt = (t)this.qnI.get(paramString);
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.qnW);
    if (localt != null) {
      localIntent.putExtra("key_detail_data_id", Sg(paramString));
    }
    localIntent.putExtra("key_detail_can_delete", false);
    localIntent.putExtra("key_detail_info_id", this.bVe);
    localIntent.putExtra("key_detail_fav_scene", this.bOW.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.bOW.iVT);
    localIntent.putExtra("key_detail_fav_index", this.bOW.index);
    b.a(paramContext, ".ui.detail.FavoriteFileDetailUI", localIntent, 1);
  }
  
  public final void aY(Context paramContext, String paramString)
  {
    paramString = (r)this.qnI.get(paramString);
    if (paramString == null)
    {
      h.bA(paramContext, ad.getContext().getString(R.l.favorite_record_loc_error));
      return;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("kwebmap_slat", paramString.lat);
    localIntent.putExtra("kwebmap_lng", paramString.lng);
    localIntent.putExtra("kPoiName", paramString.kFa);
    localIntent.putExtra("Kwebmap_locaion", paramString.dRH);
    if (paramString.qpq >= 0.0D) {
      localIntent.putExtra("kwebmap_scale", paramString.qpq);
    }
    localIntent.putExtra("kisUsername", "");
    localIntent.putExtra("kwebmap_from_to", true);
    localIntent.putExtra("KFavLocSigleView", true);
    localIntent.putExtra("map_view_type", 2);
    localIntent.putExtra("kFavInfoLocalId", this.bVe);
    localIntent.putExtra("kFavCanDel", false);
    localIntent.putExtra("kFavCanRemark", false);
    com.tencent.mm.bg.d.b(paramContext, "location", ".ui.RedirectUI", localIntent, 1);
  }
  
  public final void aZ(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("fav_open_from_wnnote", true);
    localIntent.putExtra("fav_note_xml", this.qnW);
    if (this.qnI.get(paramString) != null) {
      localIntent.putExtra("key_detail_data_id", ((n)this.qnI.get(paramString)).jdM);
    }
    localIntent.putExtra("key_detail_info_id", this.bVe);
    localIntent.putExtra("key_detail_fav_scene", this.bOW.scene);
    localIntent.putExtra("key_detail_fav_sub_scene", this.bOW.iVT);
    localIntent.putExtra("key_detail_fav_index", this.bOW.index);
    b.a(paramContext, ".ui.FavImgGalleryUI", localIntent, 1);
  }
  
  public final String b(vx paramvx)
  {
    return f.o(paramvx);
  }
  
  public final String bZc()
  {
    return this.qnW;
  }
  
  public final String c(vx paramvx)
  {
    return f.c(paramvx);
  }
  
  public final void n(vx paramvx)
  {
    com.tencent.mm.plugin.wenote.model.a.l locall = this.qnE;
    fz localfz = new fz();
    localfz.bOL.type = 28;
    localfz.bOL.bJA = locall.msw.field_localId;
    localfz.bOL.bON = paramvx;
    localfz.bOL.path = "";
    localfz.bOL.bOS = 18;
    a.sFg.m(localfz);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */