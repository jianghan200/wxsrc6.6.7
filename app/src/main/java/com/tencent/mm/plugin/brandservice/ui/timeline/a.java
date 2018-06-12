package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ac.z;
import com.tencent.mm.ak.a.a.c.a;
import com.tencent.mm.ak.d.a;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.plugin.brandservice.b.a;
import com.tencent.mm.plugin.brandservice.b.b;
import com.tencent.mm.plugin.brandservice.b.c;
import com.tencent.mm.plugin.brandservice.b.d;
import com.tencent.mm.plugin.brandservice.b.e;
import com.tencent.mm.plugin.brandservice.b.g;
import com.tencent.mm.plugin.brandservice.b.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.pluginsdk.ui.applet.f;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.r.a;
import com.tencent.mm.storage.r.b;
import com.tencent.mm.storage.r.c;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.chatting.ao;
import com.tencent.mm.ui.widget.MMNeatTextView;
import com.tencent.mm.y.l;
import com.tencent.mm.y.m;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class a
  extends BaseAdapter
  implements View.OnCreateContextMenuListener
{
  private static int hqD = 0;
  private static int hqE;
  private static int hqF = 0;
  private static int hqG = 0;
  private static Long hqM = null;
  List<com.tencent.mm.storage.q> gxs = new LinkedList();
  r.c hnE = new a.1(this);
  private int hpr = 0;
  private int hps = 0;
  private com.tencent.mm.ui.widget.e hpv;
  private BizTimeLineUI hqC;
  private com.tencent.mm.storage.q hqH;
  private int hqI;
  private int hqJ = 0;
  private boolean hqK = false;
  private long hqL;
  h hqN;
  boolean hqO = false;
  private b hqP;
  g hqQ = new g();
  private View.OnTouchListener hqR = new a.7(this);
  private View.OnClickListener hqS = new a.8(this);
  private View.OnLongClickListener hqT = new a.9(this);
  private View.OnClickListener hqU = new a.10(this);
  private n.d hqV = new a.13(this);
  boolean hqW = false;
  
  public a(BizTimeLineUI paramBizTimeLineUI, List<com.tencent.mm.storage.q> paramList, boolean paramBoolean)
  {
    this.hqC = paramBizTimeLineUI;
    this.hpv = new com.tencent.mm.ui.widget.e(this.hqC);
    int i;
    int j;
    if (hqD == 0)
    {
      hqD = paramBizTimeLineUI.getResources().getDimensionPixelSize(b.b.biz_time_line_item_cover_height);
      hqE = paramBizTimeLineUI.getResources().getDimensionPixelSize(b.b.chatting_item_biz_sub_item_pic_size);
      hqF = paramBizTimeLineUI.getResources().getDimensionPixelSize(b.b.biz_time_line_item_padding);
      hqG = paramBizTimeLineUI.getResources().getDimensionPixelSize(b.b.NormalPadding);
      i = com.tencent.mm.bp.a.fk(paramBizTimeLineUI);
      j = com.tencent.mm.bp.a.fl(paramBizTimeLineUI);
      if (i >= j) {
        break label288;
      }
    }
    for (;;)
    {
      hqD = (int)((i - (int)(com.tencent.mm.bp.a.getDensity(paramBizTimeLineUI) * 48.0F)) * 0.47F);
      z.Ne().a(this.hnE, Looper.getMainLooper());
      this.gxs = paramList;
      if (!paramBoolean) {
        hqM = null;
      }
      this.hqN = new h(this);
      this.hqO = paramBoolean;
      return;
      label288:
      i = j;
    }
  }
  
  private void a(int paramInt, com.tencent.mm.storage.q paramq, View paramView1, View paramView2)
  {
    int i = 1;
    if (paramInt > 0)
    {
      paramView1.setVisibility(0);
      if (hqM != null) {
        if (hqM.longValue() == paramq.field_msgId)
        {
          paramInt = i;
          if (paramInt == 0) {
            break label140;
          }
          paramView2.setVisibility(0);
        }
      }
    }
    for (;;)
    {
      a(paramq);
      com.tencent.mm.kernel.g.Em().H(new a.12(this, paramq));
      return;
      paramInt = 0;
      break;
      long l2 = paramq.ckx();
      long l1 = 0L;
      paramView1 = nz(paramInt - 1);
      if (paramView1 != null) {
        l1 = paramView1.ckx();
      }
      if ((l2 != l1) && (l1 == z.Ne().ckD()))
      {
        hqM = Long.valueOf(paramq.field_msgId);
        paramInt = i;
        break;
      }
      paramInt = 0;
      break;
      label140:
      paramView2.setVisibility(8);
      continue;
      paramView1.setVisibility(8);
    }
  }
  
  private static void a(View paramView, c.c paramc, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (paramc.hri == null) {
        paramc.cn(paramView);
      }
      if (paramc.hri != null) {
        paramc.hri.setVisibility(0);
      }
    }
    while (paramc.hri == null) {
      return;
    }
    paramc.hri.setVisibility(8);
  }
  
  private static void a(ImageView paramImageView, com.tencent.mm.storage.q paramq, int paramInt, String paramString)
  {
    ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramImageView, paramq.field_msgId, paramString, paramq.field_content, paramInt);
  }
  
  private void a(c.b paramb, m paramm, com.tencent.mm.storage.q paramq, int paramInt, boolean paramBoolean)
  {
    if (paramm.type == 5)
    {
      paramb.hrp.setVisibility(0);
      if (paramBoolean) {
        paramb.hrp.setImageResource(b.g.chatting_item_biz_video_small_icon);
      }
      for (;;)
      {
        paramb.hrp.setOnClickListener(new a.11(this, paramb));
        return;
        paramb.hrp.setImageResource(b.g.chatting_item_biz_video_small_loading_icon);
      }
    }
    if (paramm.type == 6)
    {
      paramb.hrp.setVisibility(0);
      if (paramBoolean) {
        if ((paramq.field_msgId + "_" + paramInt).equals(com.tencent.mm.plugin.brandservice.ui.b.b.avq())) {
          paramb.hrp.setImageResource(b.c.chatting_item_biz_music_pause_selector);
        }
      }
      for (;;)
      {
        a(paramb.hrp, paramq, paramInt, paramm.dzy);
        return;
        paramb.hrp.setImageResource(b.c.chatting_item_biz_music_play_selector);
        continue;
        if ((paramq.field_msgId + "_" + paramInt).equals(com.tencent.mm.plugin.brandservice.ui.b.b.avq())) {
          paramb.hrp.setImageResource(b.g.chatting_item_biz_music_pause_loading_icon);
        } else {
          paramb.hrp.setImageResource(b.g.chatting_item_biz_music_play_loading_icon);
        }
      }
    }
    if (paramm.type == 7)
    {
      paramb.hrp.setVisibility(0);
      Drawable localDrawable = paramb.hrp.getDrawable();
      if (((localDrawable instanceof AnimationDrawable)) && (((AnimationDrawable)localDrawable).isRunning())) {
        ((AnimationDrawable)localDrawable).stop();
      }
      if ((paramq.field_msgId + "_" + paramInt).equals(com.tencent.mm.plugin.brandservice.ui.b.b.avq()))
      {
        paramb.hrp.setImageResource(b.c.chatting_item_biz_voice_playing_selector);
        if ((paramb.hrp.getDrawable() instanceof AnimationDrawable)) {
          ((AnimationDrawable)paramb.hrp.getDrawable()).start();
        }
      }
      for (;;)
      {
        a(paramb.hrp, paramq, paramInt, paramm.dzy);
        return;
        paramb.hrp.setImageResource(b.c.chatting_item_biz_voice_play_selector);
      }
    }
    paramb.hrp.setVisibility(8);
  }
  
  private void a(c.c paramc, com.tencent.mm.storage.q paramq)
  {
    a.b.n(paramc.eCl, paramq.field_talker);
    String str = com.tencent.mm.model.r.gT(paramq.field_talker);
    paramc.hrt.setText(j.a(this.hqC, str, paramc.hrt.getTextSize()));
    paramc.hrs.setText(com.tencent.mm.plugin.brandservice.ui.b.a.e(this.hqC, paramq.field_createTime));
    paramc.hrr.setOnTouchListener(this.hqR);
    paramc.hrr.setTag(paramq);
    paramc.hrr.setOnLongClickListener(this.hqT);
    paramc.hrr.setOnClickListener(this.hqU);
  }
  
  private static void a(c.e parame, int paramInt1, int paramInt2)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramInt1 == 5)
    {
      bool1 = true;
      a(parame.hrw, parame.hrB, bool1);
      if (!bool1) {
        break label220;
      }
    }
    label40:
    label69:
    label98:
    label127:
    label191:
    label197:
    label203:
    label215:
    label220:
    for (int i = 1;; i = 0)
    {
      if (paramInt1 == 8)
      {
        bool1 = true;
        a(parame.hrw, parame.hrC, bool1);
        if (bool1) {
          i = 1;
        }
        if (paramInt1 != 7) {
          break label191;
        }
        bool1 = true;
        a(parame.hrw, parame.hrD, bool1);
        if (bool1) {
          i = 1;
        }
        if (paramInt1 != 6) {
          break label197;
        }
        bool1 = true;
        a(parame.hrw, parame.hrE, bool1);
        if (bool1) {
          i = 1;
        }
        if (paramInt1 != 10) {
          break label203;
        }
        bool1 = true;
        a(parame.hrw, parame.hrF, bool1);
        if (!bool1) {
          break label215;
        }
      }
      for (paramInt1 = 1;; paramInt1 = i)
      {
        LinearLayout localLinearLayout = parame.hrw;
        parame = parame.hrA;
        if ((paramInt1 == 0) && (paramInt2 > 0)) {}
        for (bool1 = bool2;; bool1 = false)
        {
          a(localLinearLayout, parame, bool1);
          return;
          bool1 = false;
          break;
          bool1 = false;
          break label40;
          bool1 = false;
          break label69;
          bool1 = false;
          break label98;
          bool1 = false;
          break label127;
        }
      }
    }
  }
  
  private void a(m paramm, com.tencent.mm.storage.q paramq, int paramInt1, l paraml, View paramView, boolean paramBoolean, int paramInt2)
  {
    ((com.tencent.mm.plugin.brandservice.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.brandservice.a.a.class)).a(paramm, paramq, paramInt1, paraml, paramView, paramBoolean);
    paramView.setOnTouchListener(this.hqR);
    paramView.setOnLongClickListener(new a.6(this, paramq, paramInt2));
  }
  
  private static void a(String paramString, ImageView paramImageView, int paramInt1, int paramInt2)
  {
    com.tencent.mm.ak.a.a locala = o.Pj();
    c.a locala1 = new c.a();
    locala1.dXw = true;
    locala1.dXN = b.a.chatting_item_biz_default_bg;
    locala1 = locala1.bg(paramInt1, paramInt2);
    locala1.dXD = 4;
    locala.a(paramString, paramImageView, locala1.Pt(), null, new com.tencent.mm.pluginsdk.ui.applet.e());
  }
  
  private static void a(String paramString1, ImageView paramImageView, int paramInt1, int paramInt2, int paramInt3, String paramString2, e.a parama)
  {
    if (com.tencent.mm.ak.q.Pn()) {
      paramString1 = com.tencent.mm.ak.q.lX(paramString1);
    }
    for (;;)
    {
      com.tencent.mm.ak.a.a locala = o.Pj();
      c.a locala1 = new c.a();
      locala1.dXR = b.a.chatting_item_biz_default_bg;
      locala1.dXy = true;
      locala1 = locala1.bg(paramInt2, paramInt3);
      locala1.dXn = new f();
      locala1.dXA = com.tencent.mm.pluginsdk.model.q.v(paramString1, paramInt1, paramString2);
      locala.a(paramString1, paramImageView, locala1.Pt(), null, new com.tencent.mm.pluginsdk.ui.applet.e(0, 0, 0, parama));
      return;
    }
  }
  
  private void a(String paramString, ImageView paramImageView, int paramInt1, int paramInt2, e.a parama)
  {
    if (com.tencent.mm.ak.q.Pn()) {
      paramString = com.tencent.mm.ak.q.lX(paramString);
    }
    for (;;)
    {
      int i = b.c.biz_time_line_cover_default_bg;
      int j = getContentWidth();
      com.tencent.mm.ak.a.a locala = o.Pj();
      c.a locala1 = new c.a();
      locala1.dXR = i;
      locala1.dXy = true;
      locala1 = locala1.bg(j, paramInt2);
      locala1.dXn = new f();
      locala1.dXA = com.tencent.mm.pluginsdk.model.q.v(paramString, paramInt1, "@T");
      locala.a(paramString, paramImageView, locala1.Pt(), null, new com.tencent.mm.pluginsdk.ui.applet.e(0, j, paramInt2, parama));
      return;
    }
  }
  
  public static void avg()
  {
    hqM = null;
  }
  
  private static void cm(View paramView)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    localLayoutParams.height = hqD;
    paramView.setLayoutParams(localLayoutParams);
  }
  
  private int getContentWidth()
  {
    return com.tencent.mm.bp.a.fk(this.hqC) - (int)(com.tencent.mm.bp.a.getDensity(this.hqC) * 48.0F);
  }
  
  private static void u(View paramView, int paramInt)
  {
    if (paramInt > 1)
    {
      paramView.setPadding(hqF, hqF, hqF, hqG);
      return;
    }
    paramView.setPadding(hqF, hqF, hqF, hqF);
  }
  
  public final void a(com.tencent.mm.storage.q paramq)
  {
    if (paramq == null) {
      x.w("MicroMsg.BizTimeLineAdapter", "updateGroupId info is null");
    }
    long l1;
    long l2;
    do
    {
      return;
      l1 = paramq.ckx();
      l2 = z.Ne().ckD();
      x.d("MicroMsg.BizTimeLineAdapter", "updateGroupId keep %b, groupId %d, maxGroupId %d", new Object[] { Boolean.valueOf(this.hqO), Long.valueOf(l1), Long.valueOf(l2) });
    } while ((this.hqO) || (l1 != l2) || (z.Ne().gi(paramq.field_orderFlag) <= 0));
    paramq = z.Ne();
    paramq.dCZ.fV("BizTimeLineInfo", "update BizTimeLineInfo set status = 4 where status != 4");
    r.a locala = new r.a();
    locala.sNY = r.b.sOc;
    paramq.b(locala);
    if (z.Ne().ckx() <= z.Ne().ckD()) {
      z.Ne().ckE();
    }
    this.hqC.avo();
  }
  
  public final com.tencent.mm.storage.q avf()
  {
    if (this.gxs.size() > 0) {
      return (com.tencent.mm.storage.q)this.gxs.get(this.gxs.size() - 1);
    }
    return null;
  }
  
  public final int getCount()
  {
    return this.gxs.size();
  }
  
  public final long getItemId(int paramInt)
  {
    return 0L;
  }
  
  public final int getItemViewType(int paramInt)
  {
    com.tencent.mm.storage.q localq = nz(paramInt);
    if (localq == null)
    {
      x.e("MicroMsg.BizTimeLineAdapter", "getItemViewType info is null");
      return 0;
    }
    switch (localq.field_type)
    {
    default: 
      return 0;
    case 1: 
      return 2;
    case 285212721: 
      return 1;
    case 34: 
      return 3;
    }
    return 4;
  }
  
  public final View getView(final int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    final com.tencent.mm.storage.q localq = nz(paramInt);
    if (localq == null)
    {
      x.e("MicroMsg.BizTimeLineAdapter", "getView info is null");
      return paramView;
    }
    Object localObject1 = this.hqQ;
    if (localq != null)
    {
      paramViewGroup = (g.a)((g)localObject1).hsb.get(Long.valueOf(localq.field_msgId));
      if (paramViewGroup != null) {
        break label582;
      }
      paramViewGroup = new g.a((byte)0);
      ((g)localObject1).hsb.put(Long.valueOf(localq.field_msgId), paramViewGroup);
      paramViewGroup.rjm = localq.field_talker;
      paramViewGroup.bIZ = ((int)localq.field_msgSvrId);
      paramViewGroup.rjo = 1;
      paramViewGroup.rjx = ((int)(System.currentTimeMillis() / 1000L));
      paramViewGroup.pos = paramInt;
      paramViewGroup.rjq = 0;
      paramViewGroup.rjs = 0;
      paramViewGroup.rjt = 0;
      paramViewGroup.rjw = 0;
      paramViewGroup.rju = 0;
      paramViewGroup.rjw = 0;
      if (!((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(localq.field_talker).BG()) {
        break label498;
      }
      paramViewGroup.rjv = 1;
      label192:
      if ((localq != null) && (localq.cky()))
      {
        localObject1 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(localq.field_content);
        if ((localObject1 == null) && (bi.cX(((l)localObject1).dzs))) {}
      }
    }
    for (;;)
    {
      try
      {
        localObject2 = (m)((l)localObject1).dzs.get(((l)localObject1).dzs.size() - 1);
        if ((localObject2 != null) && (!bi.oW(((m)localObject2).url)))
        {
          localObject2 = Uri.parse(((m)((l)localObject1).dzs.get(0)).url);
          i = bi.getInt(((Uri)localObject2).getQueryParameter("idx"), 0);
          long l = bi.getLong(((Uri)localObject2).getQueryParameter("mid"), 0L);
          paramViewGroup.rjn.add(Integer.valueOf(i));
          paramViewGroup.bIZ = l;
        }
        if (!localq.field_isExpand) {
          continue;
        }
        paramViewGroup.rjp = 2;
      }
      catch (UnsupportedOperationException paramViewGroup)
      {
        x.w("MicroMsg.BizTimeLineReport", "exposeLog exp %s", new Object[] { paramViewGroup.getMessage() });
        continue;
        paramViewGroup.rjp = 0;
        continue;
      }
      catch (Exception paramViewGroup)
      {
        label474:
        label498:
        x.w("MicroMsg.BizTimeLineReport", "exposeLog exp %s", new Object[] { paramViewGroup.getMessage() });
        continue;
      }
      if ((paramInt == getCount() - 1) && (!this.hqW)) {
        ah.i(new Runnable()
        {
          public final void run()
          {
            if ((paramInt == a.this.getCount() - 1) && (!a.this.hqW))
            {
              x.i("MicroMsg.BizTimeLineAdapter", "loadMoreData %d/%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(a.this.getCount()) });
              a locala = a.this;
              Object localObject = locala.avf();
              if (localObject == null) {
                break label175;
              }
              com.tencent.mm.storage.r localr = z.Ne();
              long l = ((com.tencent.mm.storage.q)localObject).field_orderFlag;
              localObject = com.tencent.mm.storage.r.n(localr.dCZ.query("BizTimeLineInfo", null, "orderFlag<?", new String[] { String.valueOf(l) }, null, null, "orderFlag DESC limit 10"));
              locala.gxs.addAll((Collection)localObject);
              locala.notifyDataSetChanged();
              if (((List)localObject).size() <= 0) {
                break label175;
              }
            }
            label175:
            for (int i = 1;; i = 0)
            {
              if (i == 0)
              {
                a.this.hqW = true;
                a.b(a.this).avm();
              }
              return;
            }
          }
        }, 500L);
      }
      switch (localq.field_type)
      {
      default: 
        if (paramView != null) {
          break label4559;
        }
        paramViewGroup = new c.m();
        paramView = this.hqC;
        if (paramViewGroup.hri == null) {
          break label4535;
        }
        paramView = paramViewGroup.hri;
        paramView.setTag(paramViewGroup);
        a(paramViewGroup, localq);
        a(paramInt, localq, paramViewGroup.hrh, paramViewGroup.hrg);
        return paramView;
        paramViewGroup.rjv = 0;
        break label192;
        if (((l)localObject1).dzs.size() > 2)
        {
          paramViewGroup.rjp = 1;
        }
        else
        {
          label582:
          paramViewGroup.rjo += 1;
          paramViewGroup.pos = paramInt;
          paramViewGroup.rjx = ((int)(System.currentTimeMillis() / 1000L));
          if (((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(localq.field_talker).BG()) {
            paramViewGroup.rjv = 1;
          } else {
            paramViewGroup.rjv = 0;
          }
        }
        break;
      }
    }
    if (paramView == null)
    {
      paramViewGroup = new c.e();
      paramView = View.inflate(this.hqC, b.e.biz_time_line_item, null);
      paramViewGroup.hrw = ((LinearLayout)paramView.findViewById(b.d.biz_time_line_content_ll));
      paramViewGroup.hrx = ((LinearLayout)paramView.findViewById(b.d.show_more_article_layout));
      paramViewGroup.hry = ((TextView)paramView.findViewById(b.d.show_more_article_tv));
      paramViewGroup.hrg = ((LinearLayout)paramView.findViewById(b.d.biz_time_line_new_tips_layout));
      paramViewGroup.hrh = ((LinearLayout)paramView.findViewById(b.d.biz_time_line_item_top));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      localObject1 = paramViewGroup.hrz.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c.b)((Iterator)localObject1).next();
        ao.L(((c.b)localObject2).hri, 3);
        paramViewGroup.hrw.removeView(((c.b)localObject2).hri);
      }
      paramViewGroup = (c.e)paramView.getTag();
    }
    paramViewGroup.hrz.clear();
    Object localObject2 = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(localq.field_content);
    Object localObject3 = ((l)localObject2).dzs;
    int j = ((List)localObject3).size();
    if (j == 0)
    {
      paramViewGroup.hrw.setVisibility(8);
      a(paramViewGroup, -1, 0);
      return paramView;
    }
    paramViewGroup.hrw.setVisibility(0);
    a(paramViewGroup, ((m)((List)localObject3).get(0)).type, j);
    Object localObject4 = this.hqC.getLayoutInflater();
    int i = paramViewGroup.hrz.size();
    label938:
    if (i < j)
    {
      localObject1 = ao.EX(3);
      if (localObject1 != null) {
        break label4570;
      }
      localObject1 = ((LayoutInflater)localObject4).inflate(b.e.biz_time_line_item_comm_slot, null);
    }
    label1305:
    label1333:
    label1479:
    label1482:
    label1560:
    label1694:
    label1736:
    label1816:
    label1831:
    label2092:
    label2133:
    label2250:
    label2356:
    label2370:
    label2386:
    label2438:
    label2475:
    label2497:
    label2543:
    label2701:
    label2716:
    label2732:
    label2738:
    label2787:
    label2827:
    label2915:
    label2951:
    label3028:
    label3182:
    label3188:
    label3200:
    label3219:
    label3342:
    label3376:
    label3389:
    label3395:
    label3446:
    label3690:
    label3746:
    label3820:
    label4087:
    label4098:
    label4145:
    label4359:
    label4535:
    label4559:
    label4570:
    for (;;)
    {
      LinearLayout localLinearLayout = paramViewGroup.hrw;
      c.b localb = new c.b();
      localb.hri = ((View)localObject1);
      localb.hrj = ((View)localObject1).findViewById(b.d.top_line);
      localb.hrk = ((View)localObject1).findViewById(b.d.content_ll);
      localb.hrl = ((MMNeatTextView)((View)localObject1).findViewById(b.d.title_neat_tv));
      localb.hrm = ((TextView)((View)localObject1).findViewById(b.d.summary));
      localb.hrn = ((View)localObject1).findViewById(b.d.cover_area);
      localb.hro = ((ImageView)((View)localObject1).findViewById(b.d.cover_iv));
      localb.hrp = ((ImageView)((View)localObject1).findViewById(b.d.play_icon));
      localLinearLayout.addView((View)localObject1, localLinearLayout.getChildCount());
      paramViewGroup.hrz.add(localb);
      i += 1;
      break label938;
      i = 0;
      while (i < paramViewGroup.hrz.size())
      {
        ((c.b)paramViewGroup.hrz.get(i)).hri.setVisibility(8);
        i += 1;
      }
      localObject1 = (m)((List)localObject3).get(0);
      if (((m)localObject1).type == 5)
      {
        cm(paramViewGroup.hrB.hrL);
        if (bi.oW(((m)localObject1).title))
        {
          paramViewGroup.hrB.hrI.setVisibility(8);
          paramViewGroup.hrB.hrq.setBackgroundResource(b.c.biz_time_line_mask);
          localObject4 = com.tencent.mm.y.i.gR(((m)localObject1).dzC);
          if (TextUtils.isEmpty((CharSequence)localObject4)) {
            break label1816;
          }
          paramViewGroup.hrB.hrP.setVisibility(0);
          paramViewGroup.hrB.hrP.setText((CharSequence)localObject4);
          paramViewGroup.hrB.hrP.setTextColor(this.hqC.getResources().getColor(b.a.light_grey_text_color));
          a(paramViewGroup.hrB, localq);
          localObject4 = paramViewGroup.hrB.hri;
          if (j <= 1) {
            break label1831;
          }
          bool = true;
          a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
          paramViewGroup.hrB.hrq.setVisibility(8);
          a(((m)localObject1).dzy, paramViewGroup.hrB.hro, localq.field_type, hqD, new a.3(this, paramViewGroup));
          u(paramViewGroup.hrB.hri, j);
          if ((j <= 2) || (localq.field_isExpand)) {
            break label3188;
          }
          paramViewGroup.hrx.setVisibility(0);
          paramViewGroup.hry.setText(this.hqC.getString(b.h.biz_time_line_show_more_article, new Object[] { Integer.valueOf(j - 2) }));
          paramViewGroup.hrx.setTag(localq);
          paramViewGroup.hrx.setOnClickListener(this.hqS);
          i = 1;
          if ((i >= j) || ((!localq.field_isExpand) && (i > 1))) {
            break label3395;
          }
          localObject1 = (m)((List)localObject3).get(i);
          localObject4 = (c.b)paramViewGroup.hrz.get(i - 1);
          if (i != j - 1) {
            break label3200;
          }
          ((c.b)localObject4).hrk.setPadding(0, hqG, 0, hqF);
          a((c.b)localObject4, (m)localObject1, localq, i, false);
          ((c.b)localObject4).hrl.Q(((m)localObject1).title);
          ((c.b)localObject4).hrl.setTextColor(this.hqC.getResources().getColor(b.a.black));
          if ((((m)localObject1).dzB != 0) && (((m)localObject1).dzB != 1)) {
            break label3342;
          }
          ((c.b)localObject4).hrn.setVisibility(0);
          ((c.b)localObject4).hrl.setTextColor(this.hqC.getResources().getColor(b.a.black));
          if (((m)localObject1).type != 7) {
            break label3219;
          }
          a(b.c.chatting_item_biz_play_icon_bg, ((c.b)localObject4).hro, hqE, hqE);
          if ((bi.oW(((m)localObject1).dzA)) || (((m)localObject1).type != 3)) {
            break label3376;
          }
          ((c.b)localObject4).hrm.setText(((m)localObject1).dzA);
          ((c.b)localObject4).hrm.setVisibility(0);
          ((c.b)localObject4).hri.setVisibility(0);
          localObject4 = ((c.b)localObject4).hri;
          if (j <= 1) {
            break label3389;
          }
        }
      }
      for (boolean bool = true;; bool = false)
      {
        a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, i);
        i += 1;
        break label1482;
        paramViewGroup.hrB.hrI.Q(((m)localObject1).title);
        paramViewGroup.hrB.hrI.setVisibility(0);
        break;
        paramViewGroup.hrB.hrP.setVisibility(8);
        break label1305;
        bool = false;
        break label1333;
        if (((m)localObject1).type == 8)
        {
          cm(paramViewGroup.hrC.hrL);
          paramViewGroup.hrC.hrM.setText(((m)localObject1).dzO);
          paramViewGroup.hrC.hrI.Q(((m)localObject1).title);
          paramViewGroup.hrC.hrq.setBackgroundResource(b.c.biz_time_line_cover_pic_mask);
          paramViewGroup.hrC.hrq.setVisibility(8);
          paramViewGroup.hrC.hrM.setTextColor(this.hqC.getResources().getColor(b.a.light_grey_text_color));
          paramViewGroup.hrC.gwj.setBackgroundResource(b.g.chatting_item_biz_pic_loading_icon);
          a(((m)localObject1).dzy, paramViewGroup.hrC.hro, localq.field_type, hqD, new a.5(this, paramViewGroup));
          a(paramViewGroup.hrC, localq);
          localObject4 = paramViewGroup.hrC.hri;
          if (j > 1) {}
          for (bool = true;; bool = false)
          {
            a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
            u(paramViewGroup.hrC.hri, j);
            break;
          }
        }
        if (((m)localObject1).type == 7)
        {
          if (bi.oW(((m)localObject1).title))
          {
            paramViewGroup.hrD.hrI.setVisibility(8);
            localObject4 = com.tencent.mm.y.i.gR(((m)localObject1).dzC);
            if (TextUtils.isEmpty((CharSequence)localObject4)) {
              break label2356;
            }
            paramViewGroup.hrD.hrQ.setVisibility(0);
            paramViewGroup.hrD.hrQ.setText((CharSequence)localObject4);
            localObject4 = paramViewGroup.hrD.hrp.getDrawable();
            if (((localObject4 instanceof AnimationDrawable)) && (((AnimationDrawable)localObject4).isRunning())) {
              ((AnimationDrawable)localObject4).stop();
            }
            if (!(localq.field_msgId + "_0").equals(com.tencent.mm.plugin.brandservice.ui.b.b.avq())) {
              break label2370;
            }
            paramViewGroup.hrD.hrp.setImageResource(b.c.chatting_item_biz_voice_playing_selector);
            if ((paramViewGroup.hrD.hrp.getDrawable() instanceof AnimationDrawable)) {
              ((AnimationDrawable)paramViewGroup.hrD.hrp.getDrawable()).start();
            }
            a(paramViewGroup.hrD.hrp, localq, 0, ((m)localObject1).dzy);
            a(paramViewGroup.hrD, localq);
            localObject4 = paramViewGroup.hrD.hri;
            if (j <= 1) {
              break label2386;
            }
          }
          for (bool = true;; bool = false)
          {
            a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
            u(paramViewGroup.hrD.hri, j);
            break;
            paramViewGroup.hrD.hrI.setVisibility(0);
            paramViewGroup.hrD.hrI.Q(((m)localObject1).title);
            break label2092;
            paramViewGroup.hrD.hrQ.setVisibility(4);
            break label2133;
            paramViewGroup.hrD.hrp.setImageResource(b.c.chatting_item_biz_voice_play_selector);
            break label2250;
          }
        }
        if (((m)localObject1).type == 6)
        {
          localObject1 = (m)((List)localObject3).get(0);
          if (bi.oW(((m)localObject1).title))
          {
            paramViewGroup.hrE.hrI.setVisibility(8);
            if (TextUtils.isEmpty(((m)localObject1).dzM)) {
              break label2701;
            }
            paramViewGroup.hrE.hrJ.setVisibility(0);
            paramViewGroup.hrE.hrJ.setText(((m)localObject1).dzM);
            if (((m)localObject1).dzN != 2) {
              break label2716;
            }
            paramViewGroup.hrE.hrK.setImageResource(b.g.chatting_item_biz_kugou_music_watermark);
            a(paramViewGroup.hrE.hrp, localq, 0, ((m)localObject1).dzy);
            a(paramViewGroup.hrE, localq);
            localObject4 = paramViewGroup.hrE.hri;
            if (j <= 1) {
              break label2732;
            }
            bool = true;
            a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
            if (!(localq.field_msgId + "_0").equals(com.tencent.mm.plugin.brandservice.ui.b.b.avq())) {
              break label2738;
            }
            paramViewGroup.hrE.hrp.setImageResource(b.g.chatting_item_biz_music_pause_loading_icon);
          }
          for (;;)
          {
            paramViewGroup.hrE.hrq.setVisibility(8);
            a(((m)localObject1).dzy, paramViewGroup.hrE.hro, localq.field_type, hqE, hqE, "@S", new a.4(this, paramViewGroup, localq));
            u(paramViewGroup.hrE.hri, j);
            break;
            paramViewGroup.hrE.hrI.setVisibility(0);
            paramViewGroup.hrE.hrI.Q(((m)localObject1).title);
            break label2438;
            paramViewGroup.hrE.hrJ.setVisibility(8);
            break label2475;
            paramViewGroup.hrE.hrK.setImageResource(b.g.chatting_item_biz_qq_music_watermark);
            break label2497;
            bool = false;
            break label2543;
            paramViewGroup.hrE.hrp.setImageResource(b.g.chatting_item_biz_music_play_loading_icon);
          }
        }
        if (((m)localObject1).type == 10)
        {
          if (bi.oW(((m)localObject1).title))
          {
            paramViewGroup.hrF.hrI.setVisibility(8);
            if (j <= 1) {
              break label2915;
            }
            paramViewGroup.hrF.hrO.setVisibility(8);
            paramViewGroup.hrF.hrI.setTextSize(1, 18.0F * com.tencent.mm.bp.a.fe(this.hqC));
            a(paramViewGroup.hrF, localq);
            localObject4 = paramViewGroup.hrF.hri;
            if (j <= 1) {
              break label2951;
            }
          }
          for (bool = true;; bool = false)
          {
            a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
            u(paramViewGroup.hrF.hri, j);
            break;
            paramViewGroup.hrF.hrI.setVisibility(0);
            paramViewGroup.hrF.hrI.Q(((m)localObject1).title);
            break label2787;
            paramViewGroup.hrF.hrO.setVisibility(0);
            paramViewGroup.hrF.hrI.setTextSize(1, 15.0F * com.tencent.mm.bp.a.fe(this.hqC));
            break label2827;
          }
        }
        cm(paramViewGroup.hrA.hro);
        paramViewGroup.hrA.hrI.Q(((m)localObject1).title);
        if (bi.oW(((m)localObject1).dzy))
        {
          paramViewGroup.hrA.hro.setVisibility(8);
          if (bi.oW(((m)localObject1).dzA))
          {
            paramViewGroup.hrA.hrN.setVisibility(8);
            paramViewGroup.hrw.setOnClickListener(new a.2(this));
            a(paramViewGroup.hrA, localq);
            localObject4 = paramViewGroup.hrA.hri;
            if (j <= 1) {
              break label3182;
            }
          }
        }
        for (bool = true;; bool = false)
        {
          a((m)localObject1, localq, paramInt, (l)localObject2, (View)localObject4, bool, 0);
          u(paramViewGroup.hrA.hri, j);
          break;
          paramViewGroup.hrA.hrN.setVisibility(0);
          paramViewGroup.hrA.hrN.setText(((m)localObject1).dzA);
          break label3028;
          paramViewGroup.hrA.hro.setVisibility(0);
          paramViewGroup.hrA.hrN.setVisibility(8);
          a(((m)localObject1).dzy, paramViewGroup.hrA.hro, ((m)localObject1).type, hqD, null);
          break label3028;
        }
        paramViewGroup.hrx.setVisibility(8);
        break label1479;
        ((c.b)localObject4).hrk.setPadding(0, hqG, 0, hqG);
        break label1560;
        if (!bi.oW(((m)localObject1).dzy))
        {
          a(((m)localObject1).dzy, ((c.b)localObject4).hro, localq.field_type, hqE, hqE, "@S", new a.21(this, paramViewGroup, (c.b)localObject4, (m)localObject1, localq, i));
          break label1694;
        }
        if ((((m)localObject1).type == 5) || (((m)localObject1).type == 6))
        {
          a(b.c.chatting_item_biz_play_icon_bg, ((c.b)localObject4).hro, hqE, hqE);
          break label1694;
        }
        ((c.b)localObject4).hrn.setVisibility(8);
        break label1694;
        ((c.b)localObject4).hrn.setVisibility(8);
        ((c.b)localObject4).hrl.setTextColor(this.hqC.getResources().getColor(b.a.hint_text_color));
        break label1694;
        ((c.b)localObject4).hrm.setVisibility(8);
        break label1736;
      }
      a(paramInt, localq, paramViewGroup.hrh, paramViewGroup.hrg);
      return paramView;
      if (paramView == null)
      {
        paramViewGroup = new c.f();
        paramView = this.hqC;
        if (paramViewGroup.hri != null)
        {
          paramView = paramViewGroup.hri;
          paramView.setTag(paramViewGroup);
          localObject1 = j.a(this.hqC, localq.field_content, (int)paramViewGroup.hrI.getTextSize(), null, null);
          paramViewGroup.hrI.setMaxLines(Integer.MAX_VALUE);
          paramViewGroup.hrI.Q((CharSequence)localObject1);
          i = paramViewGroup.hrI.Hg(getContentWidth()).cEg();
          if ((localq.field_isExpand) || (i <= 6)) {
            break label3690;
          }
          paramViewGroup.hrI.setMaxLines(6);
          paramViewGroup.hrG.setVisibility(0);
          paramViewGroup.hrG.setOnClickListener(new a.15(this, paramViewGroup, localq));
        }
      }
      for (;;)
      {
        a(paramViewGroup, localq);
        a(paramInt, localq, paramViewGroup.hrh, paramViewGroup.hrg);
        paramViewGroup.hrH.setOnTouchListener(this.hqR);
        paramViewGroup.hrH.setOnLongClickListener(new a.16(this, localq));
        return paramView;
        paramViewGroup.hri = View.inflate(paramView, b.e.biz_time_line_text_item, null);
        paramViewGroup.avh();
        paramViewGroup.hrI = ((MMNeatTextView)paramViewGroup.hri.findViewById(b.d.text_tv));
        paramViewGroup.hrG = ((TextView)paramViewGroup.hri.findViewById(b.d.show_all_tv));
        paramViewGroup.hrH = paramViewGroup.hri.findViewById(b.d.biz_time_line_item_click_area);
        paramView = paramViewGroup.hri;
        break;
        paramViewGroup = (c.f)paramView.getTag();
        break label3446;
        paramViewGroup.hrI.setMaxLines(Integer.MAX_VALUE);
        paramViewGroup.hrG.setVisibility(8);
      }
      if (paramView == null)
      {
        paramViewGroup = new c.n();
        paramView = this.hqC;
        if (paramViewGroup.hri != null)
        {
          paramView = paramViewGroup.hri;
          paramView.setTag(paramViewGroup);
          localObject1 = new com.tencent.mm.modelvoice.n(localq.field_content);
          paramViewGroup.hrI.Q(com.tencent.mm.pluginsdk.f.h.h("yyyy/MM/dd", System.currentTimeMillis() / 1000L));
          localObject1 = com.tencent.mm.y.i.gR((int)(((com.tencent.mm.modelvoice.n)localObject1).time / 1000L));
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            break label4087;
          }
          paramViewGroup.hrQ.setVisibility(0);
          paramViewGroup.hrQ.setText((CharSequence)localObject1);
          localObject1 = paramViewGroup.hrp.getDrawable();
          if (((localObject1 instanceof AnimationDrawable)) && (((AnimationDrawable)localObject1).isRunning())) {
            ((AnimationDrawable)localObject1).stop();
          }
          if ((!this.hqN.isPlaying()) || (localq.field_msgId != this.hqN.hsy)) {
            break label4098;
          }
          paramViewGroup.hrp.setImageResource(b.c.chatting_item_biz_voice_playing_selector);
          if ((paramViewGroup.hrp.getDrawable() instanceof AnimationDrawable)) {
            ((AnimationDrawable)paramViewGroup.hrp.getDrawable()).start();
          }
        }
      }
      for (;;)
      {
        paramViewGroup.hrp.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            paramAnonymousView = a.g(a.this);
            BizTimeLineUI localBizTimeLineUI = a.b(a.this);
            String str = com.tencent.mm.modelvoice.q.getFullPath(localq.field_imgPath);
            long l = localq.field_msgId;
            paramAnonymousView.avp().a(paramAnonymousView);
            x.d("MicroMsg.FavVoiceLogic", "start play, path[%s]", new Object[] { str });
            if (paramAnonymousView.avp().startPlay(str, -1))
            {
              paramAnonymousView.hsy = l;
              return;
            }
            Toast.makeText(localBizTimeLineUI, b.h.biz_time_line_play_voice_fail, 1).show();
            paramAnonymousView.hsy = 0L;
          }
        });
        a(paramViewGroup, localq);
        a(paramInt, localq, paramViewGroup.hrh, paramViewGroup.hrg);
        paramViewGroup.hrH.setOnTouchListener(this.hqR);
        paramViewGroup.hrH.setOnLongClickListener(new a.18(this, localq));
        return paramView;
        paramViewGroup.hri = View.inflate(paramView, b.e.biz_time_line_voice_item, null);
        paramViewGroup.avh();
        paramViewGroup.hrI = ((MMNeatTextView)paramViewGroup.hri.findViewById(b.d.title_tv));
        paramViewGroup.hrQ = ((TextView)paramViewGroup.hri.findViewById(b.d.play_time_tv));
        paramViewGroup.hrp = ((ImageView)paramViewGroup.hri.findViewById(b.d.play_icon));
        paramViewGroup.hrH = paramViewGroup.hri.findViewById(b.d.chatting_item_biz_voice);
        paramView = paramViewGroup.hri;
        break;
        paramViewGroup = (c.n)paramView.getTag();
        break label3746;
        paramViewGroup.hrQ.setVisibility(4);
        break label3820;
        paramViewGroup.hrp.setImageResource(b.c.chatting_item_biz_voice_play_selector);
      }
      if (paramView == null)
      {
        paramViewGroup = new c.d();
        paramView = this.hqC;
        if (paramViewGroup.hri != null)
        {
          paramView = paramViewGroup.hri;
          paramView.setTag(paramViewGroup);
          cm(paramViewGroup.hrv);
          cm(paramViewGroup.hru);
          if (this.hqP == null) {
            this.hqP = new b(this.hqC);
          }
          localObject2 = this.hqP;
          localObject1 = paramViewGroup.hru;
          if ((((b)localObject2).cb(localq.field_msgId) != 2) && (((b)localObject2).cb(localq.field_msgId) != 3)) {
            break label4359;
          }
        }
      }
      for (;;)
      {
        paramViewGroup.hrv.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            a.a(a.this, paramAnonymousView, localq);
          }
        });
        a(paramViewGroup, localq);
        a(paramInt, localq, paramViewGroup.hrh, paramViewGroup.hrg);
        paramViewGroup.hrv.setOnTouchListener(this.hqR);
        paramViewGroup.hrv.setOnLongClickListener(new a.20(this, localq));
        return paramView;
        paramViewGroup.hri = View.inflate(paramView, b.e.biz_time_line_img_item, null);
        paramViewGroup.avh();
        paramViewGroup.hru = ((ImageView)paramViewGroup.hri.findViewById(b.d.pic_iv));
        paramViewGroup.hrv = ((ImageView)paramViewGroup.hri.findViewById(b.d.pic_iv_pressed));
        paramView = paramViewGroup.hri;
        break;
        paramViewGroup = (c.d)paramView.getTag();
        break label4145;
        localObject3 = b.b(localq);
        if (localObject3 != null)
        {
          localObject4 = b.f((com.tencent.mm.ak.e)localObject3);
          if (com.tencent.mm.a.e.cn((String)localObject4))
          {
            b.a((String)localObject4, (ImageView)localObject1);
            ((b)localObject2).j(localq.field_msgId, 1);
          }
          else if (o.Pg().a(((com.tencent.mm.ak.e)localObject3).dTK, localq.field_msgId, 0, Integer.valueOf(paramInt), b.c.chat_img_template, (d.a)localObject2, 0) == -2)
          {
            x.w("MicroMsg.BizTimeLineImgMsgHandler", "it is already download image finish, but imgInfo is old, search db and repair.");
            localObject2 = b.b(localq);
            if (localObject2 == null)
            {
              x.w("MicroMsg.BizTimeLineImgMsgHandler", "get imgInfo by db but it is null.");
            }
            else
            {
              localObject2 = b.f((com.tencent.mm.ak.e)localObject2);
              if (com.tencent.mm.a.e.cn((String)localObject2)) {
                b.a((String)localObject2, (ImageView)localObject1);
              }
            }
          }
        }
        else
        {
          x.w("MicroMsg.BizTimeLineImgMsgHandler", "showImg img info is null. %d/%d", new Object[] { Long.valueOf(localq.field_msgId), Long.valueOf(localq.field_msgSvrId) });
        }
      }
      paramViewGroup.hri = View.inflate(paramView, b.e.biz_time_line_unknown_item, null);
      paramViewGroup.avh();
      paramView = paramViewGroup.hri;
      break;
      paramViewGroup = (c.m)paramView.getTag();
      break label474;
    }
  }
  
  public final int getViewTypeCount()
  {
    return 5;
  }
  
  public final void notifyDataSetChanged()
  {
    super.notifyDataSetChanged();
  }
  
  public final com.tencent.mm.storage.q nz(int paramInt)
  {
    if ((paramInt < this.gxs.size()) && (paramInt >= 0)) {
      return (com.tencent.mm.storage.q)this.gxs.get(paramInt);
    }
    return null;
  }
  
  public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    if (this.hqH == null) {
      x.w("MicroMsg.BizTimeLineAdapter", "onCreateContextMenu mInfo == null");
    }
    do
    {
      do
      {
        do
        {
          do
          {
            return;
            if (this.hqJ == 0)
            {
              paramView = ((com.tencent.mm.plugin.messenger.foundation.a.i)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.messenger.foundation.a.i.class)).FR().Yg(this.hqH.field_talker);
              if (paramView == null)
              {
                x.e("MicroMsg.BizTimeLineAdapter", "onCreateContextMenu, contact is null, talker = " + this.hqH.field_talker);
                return;
              }
              paramContextMenuInfo = paramView.BL();
              paramContextMenu.setHeaderTitle(j.a(this.hqC, paramContextMenuInfo));
              if (com.tencent.mm.l.a.gd(paramView.field_type)) {
                paramContextMenu.add(0, 2, 0, b.h.main_conversation_longclick_delete_biz_service);
              }
              paramContextMenu.add(0, 3, 0, this.hqC.getString(b.h.biz_time_line_longclick_about, new Object[] { paramContextMenuInfo }));
              return;
            }
            if (!this.hqH.cky()) {
              break;
            }
            paramContextMenuInfo = ((com.tencent.mm.plugin.biz.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.biz.a.a.class)).wS(this.hqH.field_content);
            if (paramContextMenuInfo == null)
            {
              x.w("MicroMsg.BizTimeLineAdapter", "onCreateContextMenu reader is null");
              return;
            }
            this.hqK = false;
            if ((this.hqI >= 0) && (this.hqI < paramContextMenuInfo.dzs.size()) && (com.tencent.mm.y.i.gr(((m)paramContextMenuInfo.dzs.get(this.hqI)).dzD))) {
              this.hqK = true;
            }
            if (!com.tencent.mm.y.i.gu(this.hqH.field_content)) {
              paramContextMenu.add(0, 4, 0, paramView.getContext().getString(b.h.retransmit));
            }
          } while ((!com.tencent.mm.bg.d.QS("favorite")) || (this.hqK));
          paramContextMenu.add(0, 5, 0, paramView.getContext().getString(b.h.plugin_favorite_opt));
          return;
          if (!this.hqH.ckA()) {
            break;
          }
          paramContextMenu.add(0, 6, 0, paramView.getContext().getString(b.h.retransmit));
        } while ((!com.tencent.mm.bg.d.QS("favorite")) || (this.hqK));
        paramContextMenu.add(0, 7, 0, paramView.getContext().getString(b.h.plugin_favorite_opt));
        return;
        if (!this.hqH.isText()) {
          break;
        }
        paramContextMenu.add(0, 9, 0, paramView.getContext().getString(b.h.app_copy));
        paramContextMenu.add(0, 8, 0, paramView.getContext().getString(b.h.retransmit));
      } while (!com.tencent.mm.bg.d.QS("favorite"));
      paramContextMenu.add(0, 7, 0, paramView.getContext().getString(b.h.plugin_favorite_opt));
      return;
    } while ((!this.hqH.ckz()) || (!com.tencent.mm.bg.d.QS("favorite")));
    paramContextMenu.add(0, 7, 0, paramView.getContext().getString(b.h.plugin_favorite_opt));
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/brandservice/ui/timeline/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */