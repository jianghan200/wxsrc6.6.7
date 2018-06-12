package com.tencent.mm.plugin.fav.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.ab.e;
import com.tencent.mm.g.a.kp;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.i;
import com.tencent.mm.plugin.fav.a.m.c;
import com.tencent.mm.plugin.fav.ui.d.a.b;
import com.tencent.mm.plugin.fav.ui.d.a.c;
import com.tencent.mm.plugin.fav.ui.widget.c.a;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.we;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.protocal.c.wr;
import com.tencent.mm.protocal.c.xa;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteIndexUI
  extends FavBaseUI
  implements a.c, c.a
{
  private static final long jaZ = com.tencent.mm.k.b.AB();
  private com.tencent.mm.ui.tools.k contextMenuHelper;
  private n.d hlb = new FavoriteIndexUI.17(this);
  private int jba = 0;
  private com.tencent.mm.plugin.fav.ui.a.b jbb;
  private com.tencent.mm.plugin.fav.ui.widget.b jbc;
  private com.tencent.mm.plugin.fav.a.g jbd;
  private e jbe = new FavoriteIndexUI.12(this);
  private AdapterView.OnItemLongClickListener jbf = new AdapterView.OnItemLongClickListener()
  {
    public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
    {
      if (paramAnonymousInt < FavoriteIndexUI.this.iYa.getHeaderViewsCount())
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
        return true;
      }
      FavoriteIndexUI.d(FavoriteIndexUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, FavoriteIndexUI.this, FavoriteIndexUI.c(FavoriteIndexUI.this));
      return true;
    }
  };
  private com.tencent.mm.plugin.fav.a.g jbg;
  private long startTime = 0L;
  
  private void a(List<com.tencent.mm.plugin.fav.a.g> paramList, String paramString1, String paramString2)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    while (bi.oW(paramString2)) {
      return;
    }
    boolean bool = com.tencent.mm.model.s.fq(paramString2);
    Object localObject = new com.tencent.mm.plugin.fav.a.k();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)localIterator.next();
      if (!((com.tencent.mm.plugin.fav.a.k)localObject).t(localg))
      {
        com.tencent.mm.plugin.fav.a.h.f(localg.field_localId, 1, 0);
        localLinkedList.add(localg);
        label114:
        com.tencent.mm.plugin.fav.a.m.d locald;
        if (bool)
        {
          paramList = m.c.iWy;
          locald = com.tencent.mm.plugin.fav.a.m.d.iWB;
          if (!bool) {
            break label150;
          }
        }
        label150:
        for (int i = com.tencent.mm.model.m.gK(paramString2);; i = 0)
        {
          com.tencent.mm.plugin.fav.a.m.a(paramList, localg, locald, i);
          break;
          paramList = m.c.iWx;
          break label114;
        }
      }
    }
    if (localLinkedList.isEmpty())
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteIndexUI", "after filter, nothing");
      paramList = getString(m.i.favorite_retransmit_tip);
      com.tencent.mm.ui.base.h.bA(getApplicationContext(), paramList);
      return;
    }
    paramList = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(m.i.favorite_forward_tips), false, null);
    h.a(this.mController.tml, paramString2, paramString1, localLinkedList, new FavoriteIndexUI.5(this, paramList));
    paramString2 = localLinkedList.iterator();
    for (;;)
    {
      if (!paramString2.hasNext()) {
        break label487;
      }
      localObject = (com.tencent.mm.plugin.fav.a.g)paramString2.next();
      if ((localObject != null) && (((com.tencent.mm.plugin.fav.a.g)localObject).field_type == 5))
      {
        paramList = "";
        if (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rAN != null) {
          paramList = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rAN.rCn;
        }
        paramString1 = paramList;
        if (((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rBG != null)
        {
          paramString1 = paramList;
          if (bi.oW(paramList)) {
            paramString1 = ((com.tencent.mm.plugin.fav.a.g)localObject).field_favProto.rBG.egr;
          }
        }
        if (!bi.oW(paramString1))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramString1, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
          paramList = "";
        }
      }
      try
      {
        paramString1 = URLEncoder.encode(paramString1, "UTF-8");
        paramList = paramString1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramString1, "", new Object[0]);
        }
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { paramList, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
    }
    label487:
    com.tencent.mm.plugin.report.service.h.mEJ.h(11125, new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(1) });
  }
  
  public static void a(List<com.tencent.mm.plugin.fav.a.g> paramList, String[] paramArrayOfString)
  {
    if ((paramList == null) || (paramList.isEmpty())) {}
    for (;;)
    {
      return;
      if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
      {
        LinkedList localLinkedList = new LinkedList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          com.tencent.mm.plugin.fav.a.g localg = (com.tencent.mm.plugin.fav.a.g)paramList.next();
          int j = paramArrayOfString.length;
          int i = 0;
          boolean bool = false;
          while (i < j)
          {
            bool |= localg.Bj(paramArrayOfString[i]);
            i += 1;
          }
          if (bool)
          {
            ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().a(localg, new String[] { "localId" });
            com.tencent.mm.plugin.fav.a.b.p(localg);
            localLinkedList.add(localg);
          }
        }
        paramList = localLinkedList.iterator();
        while (paramList.hasNext()) {
          com.tencent.mm.plugin.fav.a.b.a((com.tencent.mm.plugin.fav.a.g)paramList.next(), 3);
        }
      }
    }
  }
  
  public static boolean a(List<com.tencent.mm.plugin.fav.a.g> paramList, Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return true;
    }
    int n = 0;
    int i1 = 0;
    int m = 0;
    new com.tencent.mm.plugin.fav.a.k();
    Iterator localIterator1 = paramList.iterator();
    int i = 0;
    int j = 0;
    com.tencent.mm.plugin.fav.a.g localg;
    int k;
    int i2;
    for (;;)
    {
      if (localIterator1.hasNext())
      {
        localg = (com.tencent.mm.plugin.fav.a.g)localIterator1.next();
        if ((localg != null) && (localg.field_favProto != null) && (localg.field_favProto.rBI != null)) {
          if (localg.field_type == 3)
          {
            m += 1;
          }
          else
          {
            Iterator localIterator2 = localg.field_favProto.rBI.iterator();
            k = 0;
            while (localIterator2.hasNext())
            {
              vx localvx = (vx)localIterator2.next();
              if (localvx.rAw == 2) {
                n += 1;
              } else if (localvx.rAw == 1) {
                i1 += 1;
              } else {
                k += 1;
              }
            }
            if (!com.tencent.mm.plugin.fav.a.k.u(localg)) {
              break label549;
            }
            int i3 = j + 1;
            j = i3;
            i2 = k;
            if (k > 0)
            {
              i2 = k - 1;
              j = i3;
            }
          }
        }
      }
    }
    for (;;)
    {
      if ((i == 0) && (i2 == localg.field_favProto.rBI.size())) {
        i = 1;
      }
      for (;;)
      {
        break;
        if (1 == paramList.size())
        {
          if ((((com.tencent.mm.plugin.fav.a.g)paramList.get(0)).field_type == 14) && ((n > 0) || (i1 > 0)))
          {
            com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_trans_big_expired));
            return false;
          }
          if (n > 0)
          {
            com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_trans_big_file));
            return false;
          }
          if (i1 > 0)
          {
            switch (((com.tencent.mm.plugin.fav.a.g)paramList.get(0)).field_type)
            {
            }
            for (;;)
            {
              return false;
              com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_trans_file));
              continue;
              com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_trans_image));
              continue;
              com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_trans_video));
            }
          }
          if (j > 0)
          {
            com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.Fav_NotDownload_CannotForward));
            return false;
          }
          if (m > 0)
          {
            com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.Fav_Voice_CannotForward));
            return false;
          }
        }
        else if ((n > 0) || (i1 > 0) || (j > 0) || (m > 0))
        {
          if (i != 0) {
            com.tencent.mm.ui.base.h.a(paramContext, paramContext.getString(m.i.favorite_detail_illegal_transmay_tips_yes), "", paramContext.getString(m.i.confirm_dialog_ok), paramContext.getString(m.i.confirm_dialog_cancel), paramOnClickListener, null, m.b.wechat_green);
          }
          for (;;)
          {
            return false;
            com.tencent.mm.ui.base.h.bA(paramContext, paramContext.getString(m.i.favorite_detail_illegal_transmay_tips_no));
          }
        }
        return true;
      }
      label549:
      i2 = k;
    }
  }
  
  private void aMw()
  {
    this.jbb.a(false, null);
    this.iYa.setOnItemLongClickListener(this.jbf);
    showOptionMenu(11, true);
    com.tencent.mm.plugin.fav.ui.widget.b localb = this.jbc;
    if ((localb.jff) && (localb.jfg.getVisibility() != 8))
    {
      localb.jfg.setVisibility(8);
      localb.jfg.startAnimation(AnimationUtils.loadAnimation(localb.jfg.getContext(), m.a.fast_faded_out));
    }
  }
  
  public final com.tencent.mm.plugin.fav.ui.a.a aMc()
  {
    if (this.jbb == null)
    {
      ActionBarActivity localActionBarActivity = this.mController.tml;
      this.jbb = new com.tencent.mm.plugin.fav.ui.a.b(this.iYh, false);
      this.jbb.a(new FavoriteIndexUI.18(this));
      this.jbb.jbP = this;
      this.jbb.scene = 1;
      this.jbb.jbS = this.iYa;
    }
    return this.jbb;
  }
  
  protected final void aMd()
  {
    this.iYg.post(new FavoriteIndexUI.19(this));
  }
  
  protected final boolean aMe()
  {
    switch (this.jba)
    {
    }
    for (int i = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().getCount(); i > 0; i = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLA()) {
      return true;
    }
    return false;
  }
  
  @SuppressLint({"ResourceType"})
  protected final void aMf()
  {
    switch (this.jba)
    {
    default: 
      this.iYb.setCompoundDrawablesWithIntrinsicBounds(0, m.d.favorites_empty_favorites_icon, 0, 0);
      this.iYb.setCompoundDrawablePadding(com.tencent.mm.bp.a.fromDPToPix(this.mController.tml, 10));
      this.iYb.setText(m.i.favorite_empty_fav);
      return;
    }
    this.iYb.setCompoundDrawablesWithIntrinsicBounds(0, m.h.fav_list_img_default, 0, 0);
    this.iYb.setCompoundDrawablePadding(com.tencent.mm.bp.a.fromDPToPix(this.mController.tml, 10));
    this.iYb.setText(m.i.favorite_empty_fav_img);
  }
  
  protected final void aMg()
  {
    super.aMg();
    this.dvh.post(new FavoriteIndexUI.15(this));
  }
  
  public final void aMx()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("key_enter_fav_cleanui_from", 0);
    com.tencent.mm.plugin.fav.a.b.a(this.mController.tml, ".ui.FavCleanUI", localIntent);
  }
  
  public final void dC(long paramLong)
  {
    com.tencent.mm.plugin.fav.ui.widget.b localb;
    if (this.jbb.jbI)
    {
      localb = this.jbc;
      if (this.jbb.aMG() <= 0) {
        break label64;
      }
    }
    label64:
    for (boolean bool = true;; bool = false)
    {
      if (localb.jff)
      {
        localb.jfj.setEnabled(bool);
        localb.jfk.setEnabled(bool);
        localb.jfl.setEnabled(bool);
      }
      return;
    }
  }
  
  protected final void initHeaderView()
  {
    super.initHeaderView();
    this.iYg.eX(false);
  }
  
  protected void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject1;
    switch (paramInt1)
    {
    default: 
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteIndexUI", "onActivityResult reqCode: %d, retCod: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      if (paramInt2 != -1) {
        if (((this.jbg != null) && (this.jbg.field_type == 5)) || ((this.jbd != null) && (this.jbd.field_type == 5)))
        {
          localObject1 = "";
          if ((this.jbd == null) || (this.jbd.field_favProto.rBG == null)) {
            break label269;
          }
          paramIntent = this.jbd.field_favProto.rBG.egr;
          label139:
          if (!bi.oW(paramIntent)) {
            com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramIntent, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
          }
        }
      }
      break;
    }
    label269:
    label1374:
    do
    {
      try
      {
        paramIntent = URLEncoder.encode(paramIntent, "UTF-8");
        com.tencent.mm.plugin.report.service.h.mEJ.h(13378, new Object[] { paramIntent, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
        return;
        i.Bl(".ui.transmit.SelectConversationUI");
        break;
        if (this.jbg.field_favProto.rAN != null) {
          localObject1 = this.jbg.field_favProto.rAN.rCn;
        }
        paramIntent = (Intent)localObject1;
        if (this.jbg.field_favProto.rBG == null) {
          break label139;
        }
        paramIntent = (Intent)localObject1;
        if (!bi.oW((String)localObject1)) {
          break label139;
        }
        paramIntent = this.jbg.field_favProto.rBG.egr;
      }
      catch (UnsupportedEncodingException paramIntent)
      {
        for (;;)
        {
          com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramIntent, "", new Object[0]);
          paramIntent = "";
        }
      }
      paramInt2 = 2;
      localObject1 = paramIntent.getStringExtra("custom_send_text");
      switch (paramInt1)
      {
      default: 
        paramInt1 = paramInt2;
      }
      for (;;)
      {
        if (paramInt1 != 0) {
          break label1374;
        }
        com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.favorite_ok));
        return;
        paramInt1 = 0;
        this.iXX = true;
        continue;
        paramIntent = l.d(getApplicationContext(), paramIntent, com.tencent.mm.plugin.p.c.Gb());
        if (paramIntent == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteIndexUI", "take picture result path is null");
          return;
        }
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("CropImageMode", 4);
        ((Intent)localObject1).putExtra("CropImage_Filter", true);
        ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
        ((Intent)localObject1).setClassName(this.mController.tml, "com.tencent.mm.ui.tools.CropImageNewUI");
        startActivityForResult((Intent)localObject1, 4099);
        paramInt1 = paramInt2;
        continue;
        paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
        if (paramIntent == null)
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteIndexUI", "crop picture resutl path is null");
          return;
        }
        paramInt1 = 0;
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).add(paramIntent);
        this.iYd.post(new FavoriteIndexUI.6(this, (ArrayList)localObject1));
        continue;
        paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
        if ((paramIntent == null) || (paramIntent.size() == 0))
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavoriteIndexUI", "onActivityResult pathList is null or nil");
          return;
        }
        paramInt1 = 0;
        this.iYd.post(new FavoriteIndexUI.7(this, paramIntent));
        continue;
        final double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
        double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
        paramInt1 = paramIntent.getIntExtra("kwebmap_scale", 0);
        localObject1 = bi.aG(paramIntent.getStringExtra("Kwebmap_locaion"), "");
        final Object localObject2 = paramIntent.getCharSequenceExtra("kRemark");
        final Object localObject3 = paramIntent.getStringExtra("kPoiName");
        paramIntent = paramIntent.getStringArrayListExtra("kTags");
        this.iYd.post(new Runnable()
        {
          public final void run()
          {
            FavoriteIndexUI.this.iXX = true;
            double d1 = d1;
            double d2 = paramInt1;
            int i = localObject2;
            Object localObject2 = localObject3;
            Object localObject1 = paramIntent;
            String str = this.jbs;
            ArrayList localArrayList = this.jbt;
            we localwe = new we();
            localwe.Vn((String)localObject2);
            localwe.z(d1);
            localwe.y(d2);
            localwe.CK(i);
            localwe.Vo(str);
            localObject2 = new com.tencent.mm.plugin.fav.a.g();
            ((com.tencent.mm.plugin.fav.a.g)localObject2).field_type = 6;
            ((com.tencent.mm.plugin.fav.a.g)localObject2).field_sourceType = 6;
            ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.b(localwe);
            if ((localObject1 != null) && (!bi.oW(((CharSequence)localObject1).toString())))
            {
              ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.Vt(((CharSequence)localObject1).toString());
              ((com.tencent.mm.plugin.fav.a.g)localObject2).field_favProto.fS(bi.VF());
              com.tencent.mm.plugin.report.service.h.mEJ.h(10873, new Object[] { Integer.valueOf(6) });
            }
            g.E((com.tencent.mm.plugin.fav.a.g)localObject2);
            if ((localArrayList != null) && (!localArrayList.isEmpty()))
            {
              localObject1 = localArrayList.iterator();
              while (((Iterator)localObject1).hasNext()) {
                ((com.tencent.mm.plugin.fav.a.g)localObject2).Bj((String)((Iterator)localObject1).next());
              }
            }
            b.B((com.tencent.mm.plugin.fav.a.g)localObject2);
            com.tencent.mm.plugin.report.service.h.mEJ.h(10648, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
            com.tencent.mm.plugin.fav.a.b.dn(((com.tencent.mm.plugin.fav.a.g)localObject2).field_localId);
            long l = ((com.tencent.mm.plugin.fav.a.g)localObject2).field_localId;
            localObject1 = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(l);
            if ((localObject1 != null) && (((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rAL != null)) {
              com.tencent.mm.plugin.fav.a.b.a(l, ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rAL, "", "", new ArrayList(), FavoriteIndexUI.this.mController.tml);
            }
          }
        });
        paramInt1 = 0;
        continue;
        paramIntent = paramIntent.getStringExtra("choosed_file_path");
        if (bi.oW(paramIntent))
        {
          paramInt1 = 1;
        }
        else
        {
          localObject1 = new com.tencent.mm.vfs.b(paramIntent);
          if (!((com.tencent.mm.vfs.b)localObject1).exists())
          {
            paramInt1 = 1;
          }
          else if (((com.tencent.mm.vfs.b)localObject1).length() >= jaZ)
          {
            paramInt1 = 3;
          }
          else
          {
            if (bi.oW(paramIntent)) {
              paramInt1 = 0;
            }
            for (;;)
            {
              if (paramInt1 != 0)
              {
                paramInt1 = 0;
                this.iXX = true;
                break;
                localObject3 = new com.tencent.mm.vfs.b(paramIntent);
                if (!((com.tencent.mm.vfs.b)localObject3).exists())
                {
                  paramInt1 = 0;
                }
                else
                {
                  localObject1 = new com.tencent.mm.plugin.fav.a.g();
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_type = 8;
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_sourceType = 6;
                  g.E((com.tencent.mm.plugin.fav.a.g)localObject1);
                  ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.Vu(((com.tencent.mm.vfs.b)localObject3).getName());
                  localObject2 = new vx();
                  ((vx)localObject2).UP(paramIntent);
                  ((vx)localObject2).kY(true);
                  ((vx)localObject2).UB(((com.tencent.mm.vfs.b)localObject3).getName());
                  ((vx)localObject2).CF(((com.tencent.mm.plugin.fav.a.g)localObject1).field_type);
                  if ((paramIntent == null) || (paramIntent.length() <= 0)) {
                    paramIntent = "";
                  }
                  for (;;)
                  {
                    ((vx)localObject2).UL(paramIntent);
                    ((com.tencent.mm.plugin.fav.a.g)localObject1).field_favProto.rBI.add(localObject2);
                    b.B((com.tencent.mm.plugin.fav.a.g)localObject1);
                    com.tencent.mm.plugin.report.service.h.mEJ.h(10648, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
                    paramInt1 = 1;
                    break;
                    paramIntent = new com.tencent.mm.vfs.b(paramIntent).getName();
                    paramInt1 = paramIntent.lastIndexOf('.');
                    if ((paramInt1 <= 0) || (paramInt1 == paramIntent.length() - 1)) {
                      paramIntent = "";
                    } else {
                      paramIntent = paramIntent.substring(paramInt1 + 1);
                    }
                  }
                }
              }
            }
            paramInt1 = 1;
            continue;
            long l = paramIntent.getLongExtra("key_fav_result_local_id", -1L);
            if (-1L == l) {
              break;
            }
            paramInt1 = this.jbb.dD(l);
            if (-1 == paramInt1) {
              break;
            }
            this.iYa.removeFooterView(this.iYe);
            this.iYa.setSelection(paramInt1);
            return;
            localObject1 = this.jbb.eU(false);
            paramIntent = paramIntent.getStringArrayExtra("key_fav_result_array");
            paramInt1 = paramInt2;
            if (!((List)localObject1).isEmpty())
            {
              paramInt1 = paramInt2;
              if (paramIntent != null)
              {
                paramInt1 = paramInt2;
                if (paramIntent.length > 0)
                {
                  localObject2 = com.tencent.mm.ui.base.h.a(this.mController.tml, "", false, null);
                  com.tencent.mm.kernel.g.Em().H(new FavoriteIndexUI.4(this, (List)localObject1, paramIntent, (Dialog)localObject2));
                  com.tencent.mm.plugin.report.service.h.mEJ.h(11125, new Object[] { Integer.valueOf(paramIntent.length), Integer.valueOf(2) });
                  paramInt1 = paramInt2;
                  continue;
                  paramIntent = paramIntent.getStringExtra("Select_Conv_User");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { paramIntent });
                  a(this.jbb.eU(false), (String)localObject1, paramIntent);
                  paramInt1 = paramInt2;
                  continue;
                  paramIntent = paramIntent.getStringExtra("Select_Conv_User");
                  com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { paramIntent });
                  localObject2 = new ArrayList();
                  ((List)localObject2).add(this.jbg);
                  a((List)localObject2, (String)localObject1, paramIntent);
                  paramInt1 = paramInt2;
                }
              }
            }
          }
        }
      }
      if (1 == paramInt1)
      {
        com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.favorite_fail));
        return;
      }
      if (3 == paramInt1)
      {
        Toast.makeText(this.mController.tml, getString(m.i.favorite_too_large), 1).show();
        return;
      }
    } while (!this.jbb.jbI);
    aMw();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    this.iYi = this;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
    super.onCreate(paramBundle);
    if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLz() == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
      finish();
      return;
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().eN(false);
    setMMTitle(m.i.favorite_index_ui_title);
    setBackBtn(new FavoriteIndexUI.1(this));
    this.iYa.setOnItemLongClickListener(this.jbf);
    com.tencent.mm.kernel.g.DF().a(438, this.jbe);
    com.tencent.mm.kernel.g.DF().a(401, this.jbe);
    this.contextMenuHelper = new com.tencent.mm.ui.tools.k(this);
    addIconOptionMenu(11, m.i.fav_actionbar_title_add_fav, m.h.actionbar_icon_dark_add, new FavoriteIndexUI.21(this));
    this.jbc = new com.tencent.mm.plugin.fav.ui.widget.b();
    paramBundle = this.jbc;
    View localView = findViewById(m.e.fav_edit_footer);
    paramBundle.jff = false;
    paramBundle.jfg = localView;
    this.jbc.jfm = new FavoriteIndexUI.2(this);
    com.tencent.mm.kernel.g.Em().H(new FavoriteIndexUI.14(this));
    com.tencent.mm.plugin.fav.a.d.aLb().a(null);
    c.aMi();
    i.start();
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    com.tencent.mm.plugin.fav.a.k localk = new com.tencent.mm.plugin.fav.a.k();
    Object localObject = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    localObject = this.jbb.pQ(((AdapterView.AdapterContextMenuInfo)localObject).position - this.iYa.getHeaderViewsCount() - 1);
    switch (this.jba)
    {
    default: 
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      return;
    }
    paramContextMenu.setHeaderTitle(m.i.app_tip);
    boolean bool = localk.t((com.tencent.mm.plugin.fav.a.g)localObject);
    if (!bool) {
      paramContextMenu.add(0, 3, 0, m.i.favorite_retransmit);
    }
    if ((bool) && (com.tencent.mm.plugin.fav.a.b.g((com.tencent.mm.plugin.fav.a.g)localObject))) {
      paramContextMenu.add(0, 3, 0, m.i.favorite_retransmit);
    }
    paramContextMenu.add(0, 2, 0, m.i.favorite_edit_tag_tips);
    paramContextMenu.add(0, 0, 0, m.i.favorite_delete);
    paramContextMenu.add(0, 1, 0, m.i.favorite_more);
  }
  
  @SuppressLint({"ResourceType"})
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    MenuItem localMenuItem = paramMenu.add(0, 10, 0, m.i.top_item_desc_search);
    localMenuItem.setIcon(m.h.actionbar_icon_dark_search);
    android.support.v4.view.m.a(localMenuItem, 2);
    return super.onCreateOptionsMenu(paramMenu);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if (((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().aLz() == null) {
      return;
    }
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnService().eN(true);
    if (this.jbb != null) {
      this.jbb.finish();
    }
    kp localkp = new kp();
    localkp.bUP.type = 12;
    com.tencent.mm.sdk.b.a.sFg.m(localkp);
    com.tencent.mm.kernel.g.DF().b(438, this.jbe);
    com.tencent.mm.kernel.g.DF().b(401, this.jbe);
    i.end();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    switch (this.jba)
    {
    }
    do
    {
      return;
    } while (this.jbb == null);
    this.jbb.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    paramAdapterView = (a.b)paramView.getTag();
    if (paramAdapterView == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
      return;
    }
    if (paramAdapterView.iWQ == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
      return;
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteIndexUI", "click type is %d", new Object[] { Integer.valueOf(paramAdapterView.iWQ.field_type) });
    com.tencent.mm.plugin.report.service.h.mEJ.h(12746, new Object[] { Integer.valueOf(paramAdapterView.iWQ.field_type), Integer.valueOf(0), Integer.valueOf(paramInt - 1) });
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((4 == paramInt) && (this.jbb.jbI))
    {
      aMw();
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getItemId() == 10)
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_enter_fav_search_from", 0);
      paramMenuItem = null;
      if (Build.VERSION.SDK_INT >= 21) {
        paramMenuItem = ActivityOptions.makeSceneTransitionAnimation(this, new Pair[0]).toBundle();
      }
      if (this.jbb.jbI)
      {
        localIntent.putExtra("key_search_type", 2);
        com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavSearchUI", localIntent, 4103, paramMenuItem);
      }
      for (;;)
      {
        return true;
        com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavSearchUI", localIntent, paramMenuItem);
      }
    }
    return super.onOptionsItemSelected(paramMenuItem);
  }
  
  protected void onPause()
  {
    super.onPause();
    i.Bl(getClass().getSimpleName());
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavoriteIndexUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    case 80: 
      if (paramArrayOfInt[0] == 0)
      {
        com.tencent.mm.plugin.fav.a.b.a(this, ".ui.FavPostVoiceUI", new Intent(), 4102);
        overridePendingTransition(0, 0);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(m.i.permission_microphone_request_again_msg), "", getString(m.i.jump_to_settings), getString(m.i.app_cancel), false, new FavoriteIndexUI.9(this), new FavoriteIndexUI.10(this));
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      paramArrayOfString = new Intent();
      paramArrayOfString.putExtra("MMActivity.OverrideExitAnimation", m.a.push_down_out);
      paramArrayOfString.putExtra("MMActivity.OverrideEnterAnimation", m.a.fast_faded_in);
      paramArrayOfString.putExtra("map_view_type", 3);
      com.tencent.mm.bg.d.b(this, "location", ".ui.RedirectUI", paramArrayOfString, 4097);
      return;
    }
    com.tencent.mm.ui.base.h.a(this, getString(m.i.permission_location_request_again_msg), "", getString(m.i.jump_to_settings), getString(m.i.app_cancel), false, new FavoriteIndexUI.11(this), new FavoriteIndexUI.13(this));
  }
  
  protected void onResume()
  {
    long l = System.currentTimeMillis();
    super.onResume();
    this.dvh.post(new FavoriteIndexUI.20(this));
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavoriteIndexUI", "on resume use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    i.Bk(getClass().getSimpleName());
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavoriteIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */