package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.a.e;
import com.tencent.mm.bg.d;
import com.tencent.mm.g.a.cb;
import com.tencent.mm.g.a.mu;
import com.tencent.mm.g.a.mu.a;
import com.tencent.mm.platformtools.r;
import com.tencent.mm.plugin.fav.a.ae;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.q;
import com.tencent.mm.plugin.webview.ui.tools.widget.m;
import com.tencent.mm.protocal.c.vx;
import com.tencent.mm.protocal.c.wl;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.n.d;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FavImgGalleryUI
  extends MMActivity
  implements AdapterView.OnItemSelectedListener, com.tencent.mm.plugin.fav.a.p
{
  private boolean bUY = true;
  private com.tencent.mm.ui.tools.k gcQ;
  private ArrayList<f> gvR;
  private MMGestureGallery hDd;
  private int iYO = 0;
  private a iYP;
  private Map<String, mu> iYQ = new HashMap();
  private long iYR;
  private com.tencent.mm.sdk.b.c iYS = new FavImgGalleryUI.2(this);
  private n.d ioF = new n.d()
  {
    public final void onMMMenuItemSelected(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
    {
      Object localObject1 = FavImgGalleryUI.d(FavImgGalleryUI.this).pN(FavImgGalleryUI.c(FavImgGalleryUI.this));
      if (localObject1 == null) {}
      Object localObject2;
      do
      {
        return;
        localObject2 = b.b(((f)localObject1).bOz);
        if (!e.cn((String)localObject2))
        {
          com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavImgGalleryUI", "file not exists");
          return;
        }
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          return;
        case 0: 
          com.tencent.mm.plugin.fav.a.h.f(FavImgGalleryUI.e(FavImgGalleryUI.this), 1, 0);
          if (o.Wf((String)localObject2))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
            paramAnonymousMenuItem.putExtra("select_is_ret", true);
            d.b(FavImgGalleryUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 1);
            return;
          }
          b.c((String)localObject2, FavImgGalleryUI.this);
          return;
        case 1: 
          b.d((String)localObject2, FavImgGalleryUI.this);
          com.tencent.mm.plugin.fav.a.h.f(FavImgGalleryUI.e(FavImgGalleryUI.this), 0, 0);
          return;
        case 2: 
          FavImgGalleryUI.a((String)localObject2, FavImgGalleryUI.this.getString(m.i.favorite_save_fail), FavImgGalleryUI.this);
          return;
        }
        localObject2 = (mu)FavImgGalleryUI.f(FavImgGalleryUI.this).get(localObject2);
      } while (localObject2 == null);
      paramAnonymousMenuItem = new cb();
      paramAnonymousMenuItem.bJq.activity = FavImgGalleryUI.this;
      paramAnonymousMenuItem.bJq.bHL = ((mu)localObject2).bXK.result;
      paramAnonymousMenuItem.bJq.bJr = ((mu)localObject2).bXK.bJr;
      paramAnonymousMenuItem.bJq.bJt = 7;
      if ((localObject1 != null) && (((f)localObject1).bOz != null))
      {
        paramAnonymousMenuItem.bJq.imagePath = ((f)localObject1).bOz.rzo;
        paramAnonymousMenuItem.bJq.bJw = ((f)localObject1).bOz.rzq;
      }
      paramAnonymousMenuItem.bJq.bJs = ((mu)localObject2).bXK.bJs;
      localObject1 = new Bundle(1);
      ((Bundle)localObject1).putInt("stat_scene", 5);
      paramAnonymousMenuItem.bJq.bJx = ((Bundle)localObject1);
      com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousMenuItem);
    }
  };
  
  public static void a(String paramString1, String paramString2, Context paramContext)
  {
    if (bi.oW(paramString1)) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavImgGalleryUI", "save image fail, path is null");
    }
    while (r.a(paramString1, paramContext, m.i.cropimage_saved)) {
      return;
    }
    Toast.makeText(paramContext, paramString2, 1).show();
  }
  
  private void aMk()
  {
    this.iYR = getIntent().getLongExtra("key_detail_info_id", -1L);
    String str = getIntent().getStringExtra("key_detail_data_id");
    boolean bool2 = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    Object localObject = getIntent().getStringExtra("fav_note_xml");
    ArrayList localArrayList = new ArrayList();
    com.tencent.mm.plugin.fav.a.g localg = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavItemInfoStorage().dy(this.iYR);
    long l = this.iYR;
    boolean bool1;
    if (localg != null)
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool1) });
      if ((!bool2) || (bi.oW((String)localObject))) {
        break label435;
      }
      localg = b.Bf((String)localObject);
    }
    label185:
    label219:
    label432:
    label435:
    for (;;)
    {
      if (localg != null) {
        localArrayList.add(localg);
      }
      this.gvR.clear();
      int i = -1;
      int m = localArrayList.size();
      int k = 0;
      int j;
      if (k < m)
      {
        localg = (com.tencent.mm.plugin.fav.a.g)localArrayList.get(k);
        int n = localg.field_favProto.rBI.size();
        j = 0;
        if (j < n)
        {
          localObject = (vx)localg.field_favProto.rBI.get(j);
          if (((((vx)localObject).bjS == 8) && (!o.Wf(b.b((vx)localObject)))) || ((((vx)localObject).bjS != 2) && (((vx)localObject).bjS != 8))) {
            break label432;
          }
          f localf = new f(localg, (vx)localObject);
          this.gvR.add(localf);
          if ((str == null) || (!str.equals(((vx)localObject).jdM))) {
            break label432;
          }
          i = this.gvR.size() - 1;
        }
      }
      for (;;)
      {
        j += 1;
        break label219;
        bool1 = false;
        break;
        j = i;
        if (str == null)
        {
          j = i;
          if (localg.field_localId == this.iYR) {
            j = this.gvR.size() - 1;
          }
        }
        k += 1;
        i = j;
        break label185;
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.iYP.notifyDataSetChanged();
        this.hDd.post(new FavImgGalleryUI.8(this, i));
        return;
      }
    }
  }
  
  public final void d(final com.tencent.mm.plugin.fav.a.c paramc)
  {
    if (paramc != null)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", new Object[] { Integer.valueOf(paramc.field_status) });
      f localf = this.iYP.pN(this.iYO);
      if ((localf != null) && (bi.aG(paramc.field_dataId, "").equals(localf.bOz.jdM))) {
        ah.A(new Runnable()
        {
          public final void run()
          {
            int j = 0;
            Object localObject = FavImgGalleryUI.g(FavImgGalleryUI.this).getSelectedView();
            if (localObject == null) {
              return;
            }
            localObject = (FavImgGalleryUI.b)((View)localObject).getTag();
            int i;
            if (paramc.field_totalLen > 0)
            {
              i = paramc.field_offset * 100 / paramc.field_totalLen - 1;
              label57:
              if (i >= 0) {
                break label129;
              }
              i = j;
            }
            label129:
            for (;;)
            {
              ((FavImgGalleryUI.b)localObject).eVR.setProgress(i);
              ((FavImgGalleryUI.b)localObject).iZa.setText(i + "%");
              if ((i < 100) && (!paramc.isFinished())) {
                break;
              }
              FavImgGalleryUI.d(FavImgGalleryUI.this).notifyDataSetChanged();
              return;
              i = 0;
              break label57;
            }
          }
        });
      }
    }
  }
  
  protected final int getLayoutId()
  {
    return m.f.fav_img_gallery_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (1 == paramInt1)
    {
      if (-1 != paramInt2) {
        return;
      }
      f localf = this.iYP.pN(this.iYO);
      if (localf == null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
        return;
      }
      new com.tencent.mm.plugin.fav.a.k();
      if (com.tencent.mm.plugin.fav.a.k.u(localf.iYN))
      {
        com.tencent.mm.ui.base.h.bA(this.mController.tml, getString(m.i.Fav_NotDownload_CannotForward));
        return;
      }
      String str = paramIntent.getStringExtra("Select_Conv_User");
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImgGalleryUI", "select %s for sending", new Object[] { str });
      com.tencent.mm.ui.base.p localp = com.tencent.mm.ui.base.h.a(this.mController.tml, getString(m.i.favorite_forward_tips), false, null);
      h.a(this.mController.tml, str, localf.iYN, localf.bOz, new FavImgGalleryUI.10(this, localp));
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.bUY = getIntent().getBooleanExtra("show_share", true);
    this.hDd = ((MMGestureGallery)findViewById(m.e.gallery));
    this.hDd.setVerticalFadingEdgeEnabled(false);
    this.hDd.setHorizontalFadingEdgeEnabled(false);
    this.hDd.setOnItemSelectedListener(this);
    this.hDd.setSingleClickOverListener(new FavImgGalleryUI.1(this));
    if (this.bUY) {
      this.hDd.setLongClickOverListener(new MMGestureGallery.c()
      {
        public final void aMl()
        {
          if ((!FavImgGalleryUI.this.isFinishing()) && (!FavImgGalleryUI.this.tlP)) {
            FavImgGalleryUI.a(FavImgGalleryUI.this);
          }
        }
      });
    }
    fullScreenNoTitleBar(true);
    this.gvR = new ArrayList();
    this.iYP = new a((byte)0);
    this.hDd.setAdapter(this.iYP);
    aMk();
    setBackBtn(new FavImgGalleryUI.4(this));
    com.tencent.mm.sdk.b.a.sFg.b(this.iYS);
    setResult(0, getIntent());
  }
  
  protected void onDestroy()
  {
    getIntent().putExtra("key_activity_browse_time", cql());
    com.tencent.mm.sdk.b.a.sFg.c(this.iYS);
    super.onDestroy();
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.iYO = paramInt;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImgGalleryUI", "pos:" + paramInt);
    if ((paramView instanceof MultiTouchImageView)) {
      ((MultiTouchImageView)paramView).crm();
    }
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView) {}
  
  protected void onPause()
  {
    super.onPause();
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().b(this);
    m.Bk(2);
  }
  
  protected void onResume()
  {
    super.onResume();
    ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage().a(this);
    m.Bk(1);
  }
  
  private final class a
    extends BaseAdapter
  {
    SparseBooleanArray iYW = new SparseBooleanArray();
    
    private a() {}
    
    private Bitmap a(f paramf)
    {
      if (paramf != null)
      {
        paramf = k.a(paramf.bOz, paramf.iYN);
        if (paramf != null) {
          return paramf;
        }
      }
      return com.tencent.mm.compatible.g.a.decodeResource(FavImgGalleryUI.this.getResources(), m.h.download_image_icon);
    }
    
    private void a(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      paramb.eVR.setVisibility(8);
      paramb.iZa.setVisibility(8);
      paramb.iYZ.setVisibility(8);
      paramb.iYX.setVisibility(0);
      paramb.iZb.setVisibility(8);
      b(paramb, paramBitmap, paramString);
    }
    
    private void b(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      com.tencent.mm.sdk.platformtools.k.k(paramb.iYY, paramBitmap.getWidth(), paramBitmap.getHeight());
      int i = paramb.iYY.getWidth();
      int j = paramb.iYY.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).reset();
      float f1 = paramBitmap.getWidth() / paramBitmap.getHeight();
      float f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FavImgGalleryUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 >= 2.0F) && (paramBitmap.getHeight() >= 480))
      {
        f1 = paramBitmap.getWidth() / i;
        f2 = i / paramBitmap.getWidth();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f2, f2);
          paramBitmap.getHeight();
          ((Matrix)localObject).postTranslate((i - f2 * paramBitmap.getWidth()) / 2.0F, 0.0F);
        }
      }
      for (;;)
      {
        paramb.iYY.setImageMatrix((Matrix)localObject);
        paramb.iYY.eT(paramBitmap.getWidth(), paramBitmap.getHeight());
        paramb.iYY.setMaxZoomDoubleTab(true);
        if (!bi.oW(paramString)) {
          break label521;
        }
        paramb.iYY.setImageBitmap(paramBitmap);
        return;
        ((Matrix)localObject).postScale(1.0F, 1.0F);
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth()) / 2, 0.0F);
        continue;
        if ((f1 < 2.0F) || (paramBitmap.getWidth() < 480)) {
          break;
        }
        f1 = paramBitmap.getHeight() / 480.0F;
        f2 = 480.0F / paramBitmap.getHeight();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f1, f2);
          ((Matrix)localObject).postTranslate(0.0F, (j - 480) / 2);
        }
        else
        {
          ((Matrix)localObject).postScale(1.0F, 1.0F);
          f1 = (j - paramBitmap.getHeight()) / 2;
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FavImgGalleryUI", " offsety " + f1);
          ((Matrix)localObject).postTranslate(0.0F, f1);
        }
      }
      f1 = i / paramBitmap.getWidth();
      f2 = j / paramBitmap.getHeight();
      label422:
      float f3;
      if (f1 < f2)
      {
        f2 = paramBitmap.getWidth() / i;
        f3 = paramBitmap.getHeight() / j;
        if (f2 <= f3) {
          break label514;
        }
        label452:
        if (f2 <= 1.0D) {
          break label657;
        }
        ((Matrix)localObject).postScale(f1, f1);
      }
      for (;;)
      {
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth() * f1) / 2.0F, (j - f1 * paramBitmap.getHeight()) / 2.0F);
        break;
        f1 = f2;
        break label422;
        label514:
        f2 = f3;
        break label452;
        try
        {
          label521:
          paramString = new com.tencent.mm.plugin.gif.c(paramString);
          paramb.iYY.setGifDrawable(paramString);
          localObject = paramb.iYY;
          i = com.tencent.mm.bp.a.fk(FavImgGalleryUI.this.mController.tml);
          ((MultiTouchImageView)localObject).iGo = com.tencent.mm.bp.a.fl(FavImgGalleryUI.this.mController.tml);
          ((MultiTouchImageView)localObject).iGn = i;
          paramb.iYY.eT(paramString.getIntrinsicWidth(), paramString.getIntrinsicHeight());
          paramString = paramb.iYY;
          if ((paramString.tzG) && (paramString.tzH != null)) {
            ((com.tencent.mm.ui.e.b.a)paramString.tzH).start();
          }
          paramb.iYY.csa();
          return;
        }
        catch (Exception paramString)
        {
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FavImgGalleryUI", bi.i(paramString));
          paramb.iYY.setImageBitmap(paramBitmap);
          return;
        }
        label657:
        f1 = 1.0F;
      }
    }
    
    public final int getCount()
    {
      return FavImgGalleryUI.h(FavImgGalleryUI.this).size();
    }
    
    public final long getItemId(int paramInt)
    {
      return paramInt;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      f localf;
      q localq;
      if (paramView == null)
      {
        paramViewGroup = new FavImgGalleryUI.b(FavImgGalleryUI.this, (byte)0);
        paramView = View.inflate(FavImgGalleryUI.this.mController.tml, m.f.fav_img_detail_item, null);
        paramViewGroup.iYX = paramView.findViewById(m.e.image_gallery_download_success);
        paramViewGroup.iYY = ((MultiTouchImageView)paramView.findViewById(m.e.image));
        paramViewGroup.eVR = ((ProgressBar)paramView.findViewById(m.e.downloading_pb));
        paramViewGroup.iYZ = ((ImageView)paramView.findViewById(m.e.thumb_iv));
        paramViewGroup.iZa = ((TextView)paramView.findViewById(m.e.downloading_percent_tv));
        paramViewGroup.iZb = ((LinearLayout)paramView.findViewById(m.e.fav_expired_btn));
        paramViewGroup.iZc = ((TextView)paramView.findViewById(m.e.fav_expired_btn_text));
        paramViewGroup.iZc.setText(m.i.favorite_detail_illegal_expired_image);
        paramView.setTag(paramViewGroup);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        localf = pN(paramInt);
        boolean bool = this.iYW.get(paramInt, true);
        this.iYW.put(paramInt, false);
        localObject = k.a(localf.bOz, localf.iYN, bool);
        if (localf.iYN != null) {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(localf.iYN.field_id), Long.valueOf(localf.iYN.field_localId), Integer.valueOf(localf.iYN.field_itemStatus) });
        }
        if (localf.bOz != null) {
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", new Object[] { localf.bOz.jdM, localf.bOz.rzo, localf.bOz.rzq, Long.valueOf(localf.bOz.rzJ), localf.bOz.dwE, localf.bOz.rzk, Long.valueOf(localf.bOz.rzU) });
        }
        if (localObject != null) {
          break label778;
        }
        FavImgGalleryUI.this.enableOptionMenu(false);
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        localq = ((ae)com.tencent.mm.kernel.g.n(ae.class)).getFavCdnStorage();
        if (localf.bOz == null) {
          break label552;
        }
      }
      label552:
      for (Object localObject = localf.bOz.jdM;; localObject = "")
      {
        localObject = localq.Br((String)localObject);
        if (localObject != null) {
          break label630;
        }
        paramViewGroup.iZb.setVisibility(8);
        if ((localf.iYN == null) || (localf.iYN.field_id >= 0)) {
          break label560;
        }
        paramViewGroup.eVR.setVisibility(0);
        paramViewGroup.iZa.setVisibility(0);
        paramViewGroup.iYZ.setVisibility(0);
        paramViewGroup.iYX.setVisibility(8);
        paramViewGroup.iYZ.setImageBitmap(a(localf));
        paramViewGroup.eVR.setProgress(0);
        paramViewGroup.iZa.setText("0%");
        return paramView;
        paramViewGroup = (FavImgGalleryUI.b)paramView.getTag();
        break;
      }
      label560:
      paramViewGroup.eVR.setVisibility(8);
      paramViewGroup.iZa.setVisibility(8);
      paramViewGroup.iYZ.setVisibility(8);
      paramViewGroup.iYX.setVisibility(0);
      if (localf.bOz.rAw != 0) {
        paramViewGroup.iZb.setVisibility(0);
      }
      b(paramViewGroup, a(localf), "");
      return paramView;
      label630:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.fav.a.c)localObject).field_status) });
      paramViewGroup.eVR.setVisibility(0);
      paramViewGroup.iZa.setVisibility(0);
      paramViewGroup.iYZ.setVisibility(0);
      paramViewGroup.iYX.setVisibility(8);
      paramViewGroup.iYZ.setImageBitmap(a(localf));
      if (((com.tencent.mm.plugin.fav.a.c)localObject).field_totalLen > 0) {}
      for (paramInt = ((com.tencent.mm.plugin.fav.a.c)localObject).field_offset * 100 / ((com.tencent.mm.plugin.fav.a.c)localObject).field_totalLen - 1;; paramInt = 0)
      {
        int i = paramInt;
        if (paramInt < 0) {
          i = 0;
        }
        paramViewGroup.eVR.setProgress(i);
        paramViewGroup.iZa.setText(i + "%");
        return paramView;
      }
      label778:
      FavImgGalleryUI.this.enableOptionMenu(true);
      if (o.Wf(b.b(localf.bOz)))
      {
        a(paramViewGroup, (Bitmap)localObject, b.b(localf.bOz));
        return paramView;
      }
      a(paramViewGroup, (Bitmap)localObject, "");
      return paramView;
    }
    
    public final f pN(int paramInt)
    {
      if (paramInt >= FavImgGalleryUI.h(FavImgGalleryUI.this).size())
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", new Object[] { Integer.valueOf(paramInt) });
        return null;
      }
      return (f)FavImgGalleryUI.h(FavImgGalleryUI.this).get(paramInt);
    }
  }
  
  private final class b
  {
    ProgressBar eVR;
    View iYX;
    MultiTouchImageView iYY;
    ImageView iYZ;
    TextView iZa;
    LinearLayout iZb;
    TextView iZc;
    
    private b() {}
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/fav/ui/FavImgGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */