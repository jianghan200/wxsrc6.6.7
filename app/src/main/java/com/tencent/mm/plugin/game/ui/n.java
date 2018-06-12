package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.mm.a.f;
import com.tencent.mm.bp.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.e.e;
import com.tencent.mm.plugin.game.e.e.a.a;
import com.tencent.mm.plugin.game.f.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.d;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.f;
import com.tencent.mm.plugin.game.f.i;
import com.tencent.mm.plugin.game.model.s;
import com.tencent.mm.plugin.game.model.s.e;
import com.tencent.mm.plugin.game.model.s.f;
import com.tencent.mm.plugin.game.model.s.g;
import com.tencent.mm.plugin.game.model.s.h;
import com.tencent.mm.plugin.game.model.t;
import com.tencent.mm.plugin.game.model.t.a;
import com.tencent.mm.plugin.messenger.foundation.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.r;
import com.tencent.mm.ui.r.a;
import java.util.LinkedList;
import java.util.Map;

public final class n
  extends r<s>
{
  private static w kap;
  private int bGz = 0;
  int edl = 0;
  int hFO = 15;
  private int jNv = 0;
  private View.OnClickListener kaq;
  private View.OnClickListener kar;
  private v kas;
  private v kat;
  private long kau = 0L;
  private int kav = 0;
  private t kaw;
  private f<String, Bitmap> kax;
  private Context mContext;
  
  public n(Context paramContext, s params, int paramInt)
  {
    super(paramContext, params);
    this.mContext = paramContext;
    this.jNv = paramInt;
    params = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
    String str = com.tencent.mm.plugin.game.model.w.m(new int[] { 2, 5, 6, 10, 11, 100 });
    params = params.rawQuery("select count(*) from GameRawMessage where " + str + " and showInMsgList = 1 and isHidden = 0", new String[0]);
    if (params == null)
    {
      this.edl = i;
      this.bGz = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj().aUf();
      kap = new w();
      this.kaq = new o(paramContext, paramInt);
      this.kar = new p(paramContext, paramInt);
      this.kas = new v(paramContext);
      this.kas.cI(paramInt, 1);
      this.kat = new v(paramContext);
      this.kat.cI(paramInt, 2);
      this.kaw = new t(paramContext, this.jNv);
      paramInt = com.tencent.mm.plugin.game.e.c.getScreenWidth(this.mContext);
      i = this.mContext.getResources().getDimensionPixelSize(f.c.GameRankIconSize);
      int j = this.mContext.getResources().getDimensionPixelSize(f.c.BiggerPadding);
      int k = this.mContext.getResources().getDimensionPixelSize(f.c.MiddlePadding);
      this.kav = (a.ag(this.mContext, paramInt - j * 2 - i - k) / 34);
      this.kax = new f(30);
      return;
    }
    if (params.moveToFirst()) {}
    for (i = params.getInt(0);; i = 0)
    {
      params.close();
      break;
    }
  }
  
  private static s a(s params, Cursor paramCursor)
  {
    s locals = params;
    if (params == null) {
      locals = new s();
    }
    locals.d(paramCursor);
    return locals;
  }
  
  private void a(s params, a parama)
  {
    LinkedList localLinkedList = new LinkedList();
    int i = 1;
    while (i < params.jMr.size())
    {
      localLinkedList.add(params.jMr.get(i));
      i += 1;
    }
    parama.kaL.a(params, localLinkedList, this.kav, this.jNv, this.kax);
  }
  
  private void c(ImageView paramImageView, String paramString)
  {
    if (bi.oW(paramString))
    {
      a.b.a(paramImageView, paramString);
      return;
    }
    if (!this.kax.bb(paramString))
    {
      d(paramImageView, paramString);
      return;
    }
    Bitmap localBitmap = (Bitmap)this.kax.get(paramString);
    if ((localBitmap == null) || (localBitmap.isRecycled()))
    {
      d(paramImageView, paramString);
      return;
    }
    paramImageView.setImageBitmap(localBitmap);
  }
  
  private void d(ImageView paramImageView, String paramString)
  {
    paramImageView = e.aVj().h(paramImageView, paramString);
    if (paramImageView != null) {
      this.kax.put(paramString, paramImageView);
    }
  }
  
  private void e(ImageView paramImageView, String paramString)
  {
    if (this.kax.bb(paramString))
    {
      Bitmap localBitmap = (Bitmap)this.kax.get(paramString);
      if ((localBitmap == null) || (localBitmap.isRecycled()))
      {
        f(paramImageView, paramString);
        return;
      }
      paramImageView.setImageBitmap(localBitmap);
      return;
    }
    f(paramImageView, paramString);
  }
  
  private void f(ImageView paramImageView, String paramString)
  {
    e.a.a locala = new e.a.a();
    locala.dXw = false;
    e.aVj().a(paramImageView, paramString, locala.aVk(), new n.1(this, paramString));
  }
  
  private s qZ(int paramInt)
  {
    if (qY(paramInt)) {
      localObject = (s)this.tlE;
    }
    s locals;
    do
    {
      return (s)localObject;
      if (this.tlF == null) {
        break;
      }
      locals = (s)this.tlF.get(Integer.valueOf(paramInt));
      localObject = locals;
    } while (locals != null);
    if ((this.edl > this.bGz) && (this.bGz > 0) && (paramInt > this.bGz))
    {
      i = 1;
      if (i == 0) {
        break label111;
      }
    }
    label111:
    for (int i = paramInt - 1;; i = paramInt)
    {
      if ((paramInt >= 0) && (getCursor().moveToPosition(i))) {
        break label116;
      }
      return null;
      i = 0;
      break;
    }
    label116:
    if (this.tlF == null) {
      return a((s)this.tlE, getCursor());
    }
    Object localObject = a(null, getCursor());
    this.tlF.put(Integer.valueOf(paramInt), localObject);
    return (s)localObject;
  }
  
  protected final void WS()
  {
    aYc();
    WT();
  }
  
  public final void WT()
  {
    com.tencent.mm.plugin.game.model.w localw = ((com.tencent.mm.plugin.game.a.c)g.l(com.tencent.mm.plugin.game.a.c.class)).aSj();
    int i = this.hFO;
    String str = com.tencent.mm.plugin.game.model.w.m(new int[] { 2, 5, 6, 10, 11, 100 });
    setCursor(localw.rawQuery("select * from GameRawMessage where " + str + " and showInMsgList = 1 and isHidden = 0 order by isRead, createTime desc limit " + i, new String[0]));
    this.hFO = getCount();
    if (this.tlG != null) {
      this.tlG.Xb();
    }
    super.notifyDataSetChanged();
  }
  
  protected final int aUZ()
  {
    if ((this.edl > this.bGz) && (this.bGz > 0)) {
      return 1;
    }
    return 0;
  }
  
  public final boolean ayQ()
  {
    return this.hFO >= this.edl;
  }
  
  public final int getCount()
  {
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    if (this.count <= 0) {
      return 0;
    }
    return this.count + aUZ();
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    a locala;
    View localView;
    s locals;
    if (paramView == null)
    {
      locala = new a();
      localView = View.inflate(this.context, f.f.game_message_item, null);
      locala.kaA = ((ImageView)localView.findViewById(f.e.icon_iv));
      locala.kaz = ((LinearLayout)localView.findViewById(f.e.msg));
      locala.kaB = ((LinearLayout)localView.findViewById(f.e.msg_content));
      locala.eTm = ((TextView)localView.findViewById(f.e.nickname_tv));
      locala.kaC = ((ImageView)localView.findViewById(f.e.badge_icon));
      locala.gmo = ((TextView)localView.findViewById(f.e.tips_tv));
      locala.kaD = ((TextView)localView.findViewById(f.e.msg_first_line_text));
      locala.kaE = ((LinearLayout)localView.findViewById(f.e.msg_second_line));
      locala.kaF = ((TextView)localView.findViewById(f.e.msg_second_line_text));
      locala.kaG = ((ImageView)localView.findViewById(f.e.msg_second_line_icon));
      locala.kaH = ((ImageView)localView.findViewById(f.e.msg_img_iv));
      locala.kaI = ((TextView)localView.findViewById(f.e.msg_time_tv));
      locala.kaJ = ((TextView)localView.findViewById(f.e.msg_sourcename_tv));
      locala.kaL = ((GameMessageListContainerView)localView.findViewById(f.e.msg_user_icon_view));
      locala.kaK = ((LinearLayout)localView.findViewById(f.e.msg_dividing));
      localView.setTag(locala);
      locals = qZ(paramInt);
      if ((locals == null) || (!locals.jNe)) {
        break label330;
      }
      locala.kaz.setVisibility(8);
      locala.kaK.setVisibility(0);
    }
    label330:
    while (locals == null)
    {
      return localView;
      locala = (a)paramView.getTag();
      localView = paramView;
      break;
    }
    locals.aTW();
    locala.kaz.setVisibility(0);
    locala.kaK.setVisibility(8);
    locala.kaI.setText(b.g(this.context, locals.field_createTime * 1000L));
    label506:
    label618:
    label696:
    label705:
    label753:
    label847:
    label918:
    label1127:
    label1140:
    label1200:
    Object localObject;
    if (locals.field_msgType == 100)
    {
      if (locals.jMV != null)
      {
        e(locala.kaA, locals.jMV.jNm);
        locala.kaA.setVisibility(0);
        if (!bi.oW(locals.jMV.jNl))
        {
          locala.eTm.setText(locals.jMV.jNl);
          locala.eTm.setVisibility(0);
          if (bi.oW(locals.jMV.jNn)) {
            break label1127;
          }
          e(locala.kaC, locals.jMV.jNn);
          locala.kaC.setVisibility(0);
          if (bi.oW(locals.jMV.jNh)) {
            break label1140;
          }
          locala.eTm.setEnabled(true);
          locala.kaA.setEnabled(true);
          paramView = new t.a(locals, locals.jMV.jNh, 1);
          paramViewGroup = new t.a(locals, locals.jMV.jNh, 2);
          locala.eTm.setTag(paramView);
          locala.eTm.setOnClickListener(this.kaw);
          locala.kaA.setTag(paramViewGroup);
          locala.kaA.setOnClickListener(this.kaw);
          if (bi.oW(locals.jMR)) {
            break label1580;
          }
          paramInt = locals.jMr.size();
          if (paramInt <= 1) {
            break label1564;
          }
          locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_user_count, new Object[] { Integer.valueOf(paramInt) }) + locals.jMR);
          locala.gmo.setVisibility(0);
          if (bi.oW(locals.jMS)) {
            break label1593;
          }
          locala.kaD.setText(j.a(this.context, locals.jMS, locala.kaD.getTextSize()));
          locala.kaD.setVisibility(0);
          a(locals, locala);
          if (bi.oW(locals.jMW.jNk)) {
            break label1631;
          }
          locala.kaE.setVisibility(0);
          if (bi.oW(locals.jMW.jNh)) {
            break label1606;
          }
          paramView = new t.a(locals, locals.jMW.jNh, 3);
          locala.kaE.setTag(paramView);
          locala.kaE.setOnClickListener(this.kaw);
          locala.kaE.setEnabled(true);
          locala.kaF.setText(j.a(this.context, locals.jMW.jNk, locala.kaF.getTextSize()));
          if (bi.oW(locals.jMW.jNg)) {
            break label1618;
          }
          e(locala.kaG, locals.jMW.jNg);
          locala.kaG.setVisibility(0);
          if (bi.oW(locals.jMT)) {
            break label1656;
          }
          e(locala.kaH, locals.jMT);
          locala.kaH.setVisibility(0);
          if (bi.oW(locals.jMU)) {
            break label1644;
          }
          paramView = new t.a(locals, locals.jMU, 3);
          locala.kaH.setTag(paramView);
          locala.kaH.setOnClickListener(this.kaw);
          locala.kaH.setEnabled(true);
        }
      }
      for (;;)
      {
        if (!bi.oW(locals.jMX.mName))
        {
          locala.kaJ.setText(locals.jMX.mName);
          locala.kaJ.setVisibility(0);
          if (!bi.oW(locals.jMX.jNh))
          {
            paramView = new t.a(locals, locals.jMX.jNh, 5);
            locala.kaJ.setTag(paramView);
            locala.kaJ.setOnClickListener(this.kaw);
            locala.kaJ.setEnabled(true);
            return localView;
            locala.eTm.setVisibility(8);
            break;
            locala.kaC.setVisibility(8);
            break label506;
            locala.eTm.setEnabled(false);
            locala.kaA.setEnabled(false);
            break label618;
            if (!bi.cX(locals.jMr))
            {
              paramViewGroup = (s.h)locals.jMr.get(0);
              if (!bi.oW(paramViewGroup.bgn))
              {
                paramView = paramViewGroup.bgn;
                if (bi.oW(paramViewGroup.jNs)) {
                  break label1468;
                }
                locala.eTm.setEnabled(true);
                locala.kaA.setEnabled(true);
                localObject = new t.a(locals, paramViewGroup.jNs, 1);
                t.a locala1 = new t.a(locals, paramViewGroup.jNs, 2);
                locala.eTm.setTag(localObject);
                locala.eTm.setOnClickListener(this.kaw);
                locala.kaA.setTag(locala1);
                locala.kaA.setOnClickListener(this.kaw);
                label1304:
                if (bi.oW(paramView)) {
                  break label1489;
                }
                locala.eTm.setText(j.a(this.context, paramView, locala.eTm.getTextSize()), TextView.BufferType.SPANNABLE);
                locala.eTm.setVisibility(0);
                label1347:
                locala.kaA.setVisibility(0);
                if (bi.oW(paramViewGroup.jNp)) {
                  break label1502;
                }
                e(locala.kaA, paramViewGroup.jNp);
              }
              for (;;)
              {
                if (bi.oW(paramViewGroup.jNr)) {
                  break label1518;
                }
                e(locala.kaC, paramViewGroup.jNr);
                locala.kaC.setVisibility(0);
                break;
                paramView = ((i)g.l(i.class)).FR().Yg(paramViewGroup.userName);
                if ((paramView == null) || (bi.oW(paramView.BL())))
                {
                  paramView = paramViewGroup.userName;
                  break label1200;
                }
                paramView = paramView.BL();
                break label1200;
                label1468:
                locala.eTm.setEnabled(false);
                locala.kaA.setEnabled(false);
                break label1304;
                label1489:
                locala.eTm.setVisibility(8);
                break label1347;
                label1502:
                c(locala.kaA, paramViewGroup.userName);
              }
              label1518:
              locala.kaC.setVisibility(8);
              break label618;
            }
            locala.kaA.setVisibility(8);
            locala.eTm.setVisibility(8);
            locala.kaC.setVisibility(8);
            break label618;
            label1564:
            locala.gmo.setText(locals.jMR);
            break label696;
            label1580:
            locala.gmo.setVisibility(8);
            break label705;
            label1593:
            locala.kaD.setVisibility(8);
            break label753;
            label1606:
            locala.kaE.setEnabled(false);
            break label847;
            label1618:
            locala.kaG.setVisibility(8);
            break label918;
            label1631:
            locala.kaE.setVisibility(8);
            break label918;
            label1644:
            locala.kaH.setEnabled(false);
            continue;
            label1656:
            locala.kaH.setVisibility(8);
            continue;
          }
          locala.kaJ.setEnabled(false);
          return localView;
        }
      }
      locala.kaJ.setVisibility(8);
      return localView;
    }
    locala.gmo.setVisibility(8);
    locala.kaD.setVisibility(8);
    locala.kaE.setVisibility(8);
    locala.kaG.setVisibility(8);
    locala.kaH.setVisibility(8);
    locala.kaJ.setVisibility(8);
    locala.kaJ.setEnabled(false);
    locala.kaH.setEnabled(false);
    locala.kaA.setEnabled(false);
    locala.eTm.setEnabled(false);
    locala.kaL.setVisibility(8);
    locala.kaC.setVisibility(8);
    if (!bi.cX(locals.jMr))
    {
      localObject = (s.h)locals.jMr.get(0);
      paramView = ((i)g.l(i.class)).FR().Yg(((s.h)localObject).userName);
      if (paramView != null)
      {
        paramView = paramView.BL();
        label1869:
        paramViewGroup = paramView;
        if (bi.oW(paramView)) {
          paramViewGroup = ((s.h)localObject).bgn;
        }
        if (!bi.oW(((s.h)localObject).jNq)) {
          paramInt = 1;
        }
      }
    }
    for (;;)
    {
      int i = locals.jMr.size();
      int j;
      if ((!bi.oW(locals.jMp)) && ((locals.jMF & 1L) == 0L))
      {
        locala.kaJ.setText(locals.jMp);
        locala.kaJ.setVisibility(0);
        if ((locals.jMF & 0x2) > 0L)
        {
          j = this.context.getResources().getColor(f.b.gc_link_color);
          locala.kaJ.setTextColor(j);
          locala.kaJ.setBackgroundResource(f.d.game_click_change_bg_selector);
          locala.kaJ.setOnClickListener(this.kaq);
          locala.kaJ.setTag(locals);
          locala.kaJ.setEnabled(true);
        }
      }
      else
      {
        label2033:
        if ((locals.field_msgType != 10) && (locals.field_msgType != 11)) {
          break label2305;
        }
        if (bi.oW(locals.mAppName)) {
          break label2249;
        }
        locala.eTm.setText(j.a(this.context, locals.mAppName, locala.eTm.getTextSize()), TextView.BufferType.SPANNABLE);
        locala.eTm.setVisibility(0);
      }
      for (;;)
      {
        switch (locals.field_msgType)
        {
        case 3: 
        case 4: 
        case 7: 
        case 8: 
        case 9: 
        default: 
          x.e("MicroMsg.GameMessageAdapter", "error msgtype: " + locals.field_msgType);
          return localView;
          j = this.context.getResources().getColor(f.b.game_msg_text_color);
          locala.kaJ.setTextColor(j);
          locala.kaJ.setBackgroundResource(0);
          locala.kaJ.setOnClickListener(null);
          locala.kaJ.setEnabled(false);
          break label2033;
          label2249:
          if (!bi.oW(paramViewGroup))
          {
            locala.eTm.setText(j.a(this.context, paramViewGroup, locala.eTm.getTextSize()));
            locala.eTm.setVisibility(0);
          }
          else
          {
            locala.eTm.setVisibility(8);
            continue;
            label2305:
            if (!bi.oW(paramViewGroup))
            {
              locala.eTm.setText(j.a(this.context, paramViewGroup, locala.eTm.getTextSize()));
              locala.eTm.setVisibility(0);
              if (paramInt != 0)
              {
                locala.eTm.setOnClickListener(this.kas);
                locala.eTm.setTag(locals);
                locala.eTm.setEnabled(true);
              }
            }
            else
            {
              locala.eTm.setVisibility(8);
            }
          }
          break;
        }
      }
      if (!bi.oW(locals.jMl))
      {
        e(locala.kaA, locals.jMl);
        locala.kaA.setVisibility(0);
        label2430:
        if (!bi.oW(locals.ikW))
        {
          if (bi.oW(locals.jMx)) {
            break label2581;
          }
          locala.kaD.setText(locals.ikW);
          locala.kaD.setVisibility(0);
        }
      }
      while (!bi.oW(locals.jMx))
      {
        e(locala.kaH, locals.jMx);
        locala.kaH.setTag(Long.valueOf(locals.field_msgId));
        locala.kaH.setOnTouchListener(kap);
        locala.kaH.setOnClickListener(this.kar);
        locala.kaH.setVisibility(0);
        locala.kaH.setEnabled(true);
        return localView;
        x.e("MicroMsg.GameMessageAdapter", "mAppIcon is null");
        locala.kaA.setVisibility(8);
        break label2430;
        label2581:
        locala.kaE.setVisibility(0);
        locala.kaF.setText(locals.ikW);
        locala.kaE.setOnClickListener(this.kar);
        locala.kaE.setTag(Long.valueOf(locals.field_msgId));
      }
      if (!bi.cX(locals.jMr))
      {
        locala.kaA.setVisibility(0);
        if (!bi.oW(((s.h)locals.jMr.get(0)).jNp))
        {
          e(locala.kaA, ((s.h)locals.jMr.get(0)).jNp);
          if (!bi.oW(((s.h)locals.jMr.get(0)).jNq))
          {
            locala.kaA.setOnClickListener(this.kat);
            locala.kaA.setTag(locals);
            locala.kaA.setEnabled(true);
          }
        }
      }
      for (;;)
      {
        locala.kaE.setVisibility(0);
        locala.kaE.setOnClickListener(this.kar);
        locala.kaE.setTag(Long.valueOf(locals.field_msgId));
        if (locals.jMZ != 1) {
          break label2890;
        }
        locala.kaD.setVisibility(0);
        locala.kaD.setText(j.a(this.context, locals.jMJ, locala.kaD.getTextSize()));
        locala.kaF.setText(locals.jMM);
        return localView;
        c(locala.kaA, ((s.h)locals.jMr.get(0)).userName);
        break;
        locala.kaA.setVisibility(8);
      }
      label2890:
      if (locals.jMZ == 2)
      {
        locala.kaD.setVisibility(0);
        locala.kaD.setText(j.a(this.context, locals.jMJ, locala.kaD.getTextSize()));
        locala.kaF.setText(locals.jMK);
        return localView;
      }
      if (locals.jMZ != 3) {
        break;
      }
      locala.gmo.setVisibility(0);
      if (i > 1)
      {
        locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_group_like_more, new Object[] { String.valueOf(i) }));
        a(locals, locala);
      }
      for (;;)
      {
        locala.kaF.setText(locals.jMM);
        return localView;
        locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_group_like_one));
      }
      e(locala.kaA, locals.jMl);
      paramView = "礼物";
      if (locals.jMC.contains("爱心"))
      {
        paramView = "爱心";
        if (i <= 1) {
          break label3177;
        }
        locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_share_more, new Object[] { String.valueOf(i), paramView }));
      }
      for (;;)
      {
        locala.gmo.setVisibility(0);
        a(locals, locala);
        return localView;
        if (!locals.jMC.contains("体力")) {
          break;
        }
        paramView = "体力";
        break;
        label3177:
        locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_share_one, new Object[] { paramView }));
      }
      if (!bi.cX(locals.jMr))
      {
        locala.kaA.setVisibility(0);
        if (!bi.oW(((s.h)locals.jMr.get(0)).jNp))
        {
          e(locala.kaA, ((s.h)locals.jMr.get(0)).jNp);
          label3274:
          if (!bi.oW(((s.h)locals.jMr.get(0)).jNq))
          {
            locala.kaA.setOnClickListener(this.kat);
            locala.kaA.setTag(locals);
            locala.kaA.setEnabled(true);
          }
          label3326:
          if (i <= 1) {
            break label3509;
          }
          locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_like_more, new Object[] { String.valueOf(i) }));
          a(locals, locala);
        }
      }
      for (;;)
      {
        locala.kaE.setVisibility(0);
        locala.gmo.setVisibility(0);
        locala.kaF.setText(locals.jMN);
        locala.kaE.setOnClickListener(this.kar);
        locala.kaE.setTag(Long.valueOf(locals.field_msgId));
        if (bi.oW(locals.jMP)) {
          break;
        }
        locala.kaG.setVisibility(0);
        e(locala.kaG, locals.jMP);
        return localView;
        c(locala.kaA, ((s.h)locals.jMr.get(0)).userName);
        break label3274;
        locala.kaA.setVisibility(8);
        break label3326;
        label3509:
        locala.gmo.setText(this.context.getResources().getString(f.i.game_msg_like_one));
      }
      paramInt = 0;
      continue;
      paramView = null;
      break label1869;
      paramInt = 0;
      paramViewGroup = null;
    }
  }
  
  public final boolean qY(int paramInt)
  {
    return (this.edl > this.bGz) && (this.bGz > 0) && (paramInt == this.bGz);
  }
  
  static final class a
  {
    public TextView eTm;
    public TextView gmo;
    public ImageView kaA;
    public LinearLayout kaB;
    public ImageView kaC;
    public TextView kaD;
    public LinearLayout kaE;
    public TextView kaF;
    public ImageView kaG;
    public ImageView kaH;
    public TextView kaI;
    public TextView kaJ;
    public LinearLayout kaK;
    public GameMessageListContainerView kaL;
    public LinearLayout kaz;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/game/ui/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */