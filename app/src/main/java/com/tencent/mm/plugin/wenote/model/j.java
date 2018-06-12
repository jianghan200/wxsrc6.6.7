package com.tencent.mm.plugin.wenote.model;

import android.content.Context;
import android.content.Intent;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.mw;
import com.tencent.mm.g.a.mw.b;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.wenote.model.a.l;
import com.tencent.mm.plugin.wenote.model.a.n;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.vy;
import com.tencent.mm.protocal.c.vz;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wf;
import com.tencent.mm.protocal.c.wn;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.base.h;
import java.util.HashMap;
import java.util.LinkedList;

public final class j
  extends d
{
  private static HashMap<String, l> qox = new HashMap();
  private wn bOW = new wn();
  private boolean bUY;
  private String bVJ;
  private com.tencent.mm.protocal.b.a.c msX = null;
  private int qnY = 0;
  private int qnZ = 0;
  private String qoa;
  private Long qov;
  private boolean qow = false;
  
  public j()
  {
    this.qnG.clear();
    com.tencent.mm.plugin.fav.ui.c.aMi();
  }
  
  public final void a(vx paramvx, String paramString)
  {
    mw localmw = new mw();
    localmw.bXL.type = 8;
    localmw.bXL.bOz = paramvx;
    localmw.bXL.bJC = this.qov.longValue();
    localmw.bXL.bOX = paramString;
    a.sFg.m(localmw);
  }
  
  public final void a(String paramString, Long paramLong, boolean paramBoolean, Context paramContext, int paramInt1, int paramInt2, wn paramwn)
  {
    this.bVJ = paramString;
    this.qov = paramLong;
    this.bUY = paramBoolean;
    this.qnY = paramInt1;
    this.qnZ = paramInt2;
    this.bOW = paramwn;
    paramLong = new mw();
    paramLong.bXL.type = 0;
    paramLong.bXL.bXN = paramString;
    a.sFg.m(paramLong);
    this.msX = paramLong.bXM.bXV;
    if ((this.msX != null) && (this.msX.dzs != null) && (this.msX.dzs.size() > 1))
    {
      paramString = new mw();
      paramString.bXL.type = 9;
      paramString.bXL.bOz = ((vx)this.msX.dzs.get(0));
      paramString.bXL.bJC = this.qov.longValue();
      a.sFg.m(paramString);
      this.qow = paramString.bXM.bXX;
    }
    if ((this.msX != null) && (this.msX.qYa != null)) {}
    for (this.qoa = (this.msX.qYa.rBz + ";" + this.msX.qYa.rBA + ";" + this.msX.qYb);; this.qoa = null)
    {
      paramString = new Intent();
      paramString.putExtra("note_open_from_scene", 1);
      paramString.putExtra("edit_status", this.qnN);
      paramString.putExtra("note_msgid", this.qov);
      paramString.putExtra("record_show_share", this.bUY);
      paramString.putExtra("fav_note_xml", this.bVJ);
      paramString.putExtra("fav_note_out_of_date", this.qow);
      paramString.putExtra("fav_note_scroll_to_position", this.qnY);
      paramString.putExtra("fav_note_scroll_to_offset", this.qnZ);
      paramString.putExtra("fav_note_scroll_to_offset", this.qnZ);
      if (!bi.oW(this.qoa)) {
        paramString.putExtra("fav_note_link_source_info", this.qoa);
      }
      paramString.putExtra("key_detail_fav_scene", this.bOW.scene);
      paramString.putExtra("key_detail_fav_sub_scene", this.bOW.iVT);
      paramString.putExtra("key_detail_fav_index", this.bOW.index);
      com.tencent.mm.bg.d.b(paramContext, "wenote", ".ui.nativenote.NoteEditorUI", paramString);
      au.Em().H(new j.1(this));
      return;
    }
  }
  
  public final void aX(Context paramContext, String paramString)
  {
    paramContext = new Intent();
    paramContext.putExtra("message_id", this.qov);
    paramContext.putExtra("record_xml", this.bVJ);
    paramContext.putExtra("record_data_id", ((n)this.qnI.get(paramString)).jdM);
    com.tencent.mm.bg.d.b(ad.getContext(), "record", ".ui.RecordMsgFileUI", paramContext);
  }
  
  public final void aY(Context paramContext, String paramString)
  {
    paramContext = null;
    Object localObject = ((n)this.qnI.get(paramString)).qpb;
    if (((vx)localObject).rAi != null) {
      we localwe = ((vx)localObject).rAi.rAL;
    }
    for (localObject = ((vx)localObject).rAi.rAJ;; localObject = null)
    {
      if (localObject != null) {
        if (bi.oW(((vz)localObject).rBh)) {
          break label96;
        }
      }
      label96:
      for (paramContext = com.tencent.mm.model.r.gT(((vz)localObject).rBh);; paramContext = com.tencent.mm.model.r.gT(((vz)localObject).bSS))
      {
        paramString = (com.tencent.mm.plugin.wenote.model.a.r)this.qnI.get(paramString);
        if (paramString != null) {
          break;
        }
        h.bA(ad.getContext(), ad.getContext().getString(R.l.favorite_record_loc_error));
        return;
      }
      localObject = new Intent();
      ((Intent)localObject).putExtra("map_view_type", 2);
      ((Intent)localObject).putExtra("kwebmap_slat", paramString.lat);
      ((Intent)localObject).putExtra("kwebmap_lng", paramString.lng);
      ((Intent)localObject).putExtra("kPoiName", paramString.kFa);
      ((Intent)localObject).putExtra("Kwebmap_locaion", paramString.dRH);
      if (paramString.qpq >= 0.0D) {
        ((Intent)localObject).putExtra("kwebmap_scale", paramString.qpq);
      }
      ((Intent)localObject).putExtra("kisUsername", paramContext);
      ((Intent)localObject).putExtra("kwebmap_from_to", true);
      ((Intent)localObject).putExtra("KFavLocSigleView", true);
      ((Intent)localObject).putExtra("kFavCanDel", false);
      ((Intent)localObject).putExtra("kFavCanRemark", false);
      com.tencent.mm.bg.d.b(ad.getContext(), "location", ".ui.RedirectUI", (Intent)localObject);
      return;
    }
  }
  
  public final void aZ(Context paramContext, String paramString)
  {
    paramContext = new Intent();
    paramContext.putExtra("message_id", this.qov);
    paramContext.putExtra("record_data_id", ((n)this.qnI.get(paramString)).jdM);
    paramContext.putExtra("record_xml", this.bVJ);
    com.tencent.mm.bg.d.b(ad.getContext(), "record", ".ui.RecordMsgImageUI", paramContext);
  }
  
  public final String b(vx paramvx)
  {
    mw localmw = new mw();
    localmw.bXL.type = 1;
    localmw.bXL.bOz = paramvx;
    localmw.bXL.bJC = this.qov.longValue();
    a.sFg.m(localmw);
    return localmw.bXM.bXW;
  }
  
  public final String c(vx paramvx)
  {
    mw localmw = new mw();
    localmw.bXL.type = 1;
    localmw.bXL.bOz = paramvx;
    localmw.bXL.bJC = this.qov.longValue();
    a.sFg.m(localmw);
    return localmw.bXM.bOX;
  }
  
  public final void n(vx paramvx)
  {
    mw localmw = new mw();
    localmw.bXL.type = 8;
    localmw.bXL.bOz = paramvx;
    localmw.bXL.bJC = this.qov.longValue();
    localmw.bXL.bOX = "";
    a.sFg.m(localmw);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/plugin/wenote/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */