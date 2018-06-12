package com.tencent.mm.ui.chatting.gallery;

import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView<*>;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.a;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.ak.o;
import com.tencent.mm.g.a.ch;
import com.tencent.mm.g.a.ch.a;
import com.tencent.mm.g.a.ch.b;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.lj;
import com.tencent.mm.g.a.nk;
import com.tencent.mm.g.a.nk.a;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.m;
import com.tencent.mm.model.t;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.protocal.c.wz;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.chatting.a.c;
import com.tencent.mm.ui.chatting.a.d;
import com.tencent.mm.ui.chatting.ah;
import com.tencent.mm.ui.chatting.ah.a;
import com.tencent.mm.ui.chatting.as;
import com.tencent.mm.ui.chatting.i;
import com.tencent.mm.ui.chatting.k;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

@com.tencent.mm.ui.base.a(19)
public class ImageGalleryGridUI
  extends MMActivity
  implements MenuItem.OnMenuItemClickListener, View.OnClickListener, ViewTreeObserver.OnPreDrawListener, AdapterView.OnItemClickListener, ah, g.b
{
  protected ag handler;
  public long hpD;
  private TextView jCc;
  private boolean mIsPause = true;
  private Animation nen;
  public boolean qIZ;
  private boolean qUB = false;
  private com.tencent.mm.sdk.b.c tQa = new ImageGalleryGridUI.4(this);
  private long tUA = 0L;
  Runnable tUB = new ImageGalleryGridUI.8(this);
  public View tUC = null;
  private View tUD;
  private int tUE = -1;
  private View tUF;
  private View tUG;
  private View tUH;
  private View tUI;
  public int tUq;
  private GridView tUr;
  c tUs;
  private WeakReference<c.a> tUt;
  private Boolean tUu;
  private Boolean tUv;
  private TextView tUw;
  private Runnable tUx = new ImageGalleryGridUI.1(this);
  private Runnable tUy = new ImageGalleryGridUI.3(this);
  private boolean tUz = false;
  private String talker;
  
  @TargetApi(11)
  private void Fy(int paramInt)
  {
    Object localObject = getIntent();
    if (((Intent)localObject).getIntExtra("kintent_intent_source", 0) == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.tUu = Boolean.valueOf(bool);
      this.talker = ((Intent)localObject).getStringExtra("kintent_talker");
      this.tUq = ((Intent)localObject).getIntExtra("kintent_image_index", 0);
      this.qIZ = ((Intent)localObject).getBooleanExtra("key_is_biz_chat", false);
      this.hpD = getIntent().getLongExtra("key_biz_chat_id", -1L);
      this.tUv = Boolean.valueOf(true);
      setMMTitle(getString(R.l.all_pictures));
      setBackBtn(new ImageGalleryGridUI.5(this));
      this.tUD = findViewById(R.h.more_bottom_root);
      localObject = findViewById(R.h.fav_btn);
      this.tUF = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.trans_btn);
      this.tUG = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.save_btn);
      this.tUH = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      localObject = findViewById(R.h.del_btn);
      this.tUI = ((View)localObject);
      ((View)localObject).setOnClickListener(this);
      this.jCc = ((TextView)findViewById(R.h.album_tips_bar));
      this.tUw = ((TextView)findViewById(R.h.album_no_img_tip));
      if (paramInt != 0) {
        break label354;
      }
      this.tUr = ((GridView)findViewById(R.h.image_gallery_grid));
      this.tUr.setOnItemClickListener(this);
      this.tUr.setNumColumns(3);
      localObject = new com.tencent.mm.storage.bd();
      if (this.qIZ) {
        ((com.tencent.mm.storage.bd)localObject).az(this.hpD);
      }
      this.tUs = new c(this, (com.tencent.mm.storage.bd)localObject, this.talker);
      if (this.tUs.getCount() != 0) {
        break;
      }
      this.tUw.setVisibility(0);
      return;
    }
    this.tUw.setVisibility(8);
    this.tUr.setAdapter(this.tUs);
    cwQ();
    for (;;)
    {
      this.tUr.setOnScrollListener(new AbsListView.OnScrollListener()
      {
        private Runnable jCG = new ImageGalleryGridUI.6.1(this);
        
        private void fj(boolean paramAnonymousBoolean)
        {
          if (paramAnonymousBoolean)
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.jCG);
            if (ImageGalleryGridUI.b(ImageGalleryGridUI.this).getVisibility() != 0)
            {
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).clearAnimation();
              Animation localAnimation = AnimationUtils.loadAnimation(ImageGalleryGridUI.this.mController.tml, R.a.fast_faded_in);
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).setVisibility(0);
              ImageGalleryGridUI.b(ImageGalleryGridUI.this).startAnimation(localAnimation);
            }
            return;
          }
          ImageGalleryGridUI.b(ImageGalleryGridUI.this).removeCallbacks(this.jCG);
          ImageGalleryGridUI.b(ImageGalleryGridUI.this).postDelayed(this.jCG, 256L);
        }
        
        public final void onScroll(AbsListView paramAnonymousAbsListView, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
        {
          paramAnonymousAbsListView = ImageGalleryGridUI.this;
          Object localObject = (com.tencent.mm.storage.bd)paramAnonymousAbsListView.tUs.getItem(paramAnonymousInt1);
          if (localObject == null) {}
          for (paramAnonymousAbsListView = null;; paramAnonymousAbsListView = com.tencent.mm.ui.gridviewheaders.a.czj().a((Date)localObject, paramAnonymousAbsListView))
          {
            ImageGalleryGridUI.b(ImageGalleryGridUI.this).setText(paramAnonymousAbsListView);
            return;
            localObject = new Date(((cm)localObject).field_createTime);
          }
        }
        
        public final void onScrollStateChanged(AbsListView paramAnonymousAbsListView, int paramAnonymousInt)
        {
          if (1 == paramAnonymousInt) {
            fj(true);
          }
          for (;;)
          {
            o.Pj().br(paramAnonymousInt);
            return;
            if (paramAnonymousInt == 0) {
              fj(false);
            }
          }
        }
      });
      return;
      label354:
      if (this.tUs != null)
      {
        this.tUs.notifyDataSetChanged();
        cwQ();
      }
    }
  }
  
  private void M(View paramView, int paramInt)
  {
    if (this.tUs == null) {}
    Intent localIntent;
    com.tencent.mm.storage.bd localbd;
    do
    {
      return;
      localIntent = new Intent(this, ImageGalleryUI.class);
      localIntent.putExtra("key_biz_chat_id", this.hpD);
      localIntent.putExtra("key_is_biz_chat", this.qIZ);
      localIntent.putExtra("intent.key.with.footer", true);
      localbd = (com.tencent.mm.storage.bd)this.tUs.getItem(paramInt);
    } while (localbd == null);
    int j = getResources().getConfiguration().orientation;
    int[] arrayOfInt = new int[2];
    int i;
    if (paramView != null)
    {
      i = paramView.getWidth();
      paramInt = paramView.getHeight();
      paramView.getLocationInWindow(arrayOfInt);
    }
    for (;;)
    {
      localIntent.addFlags(536870912);
      localIntent.putExtra("img_gallery_msg_id", localbd.field_msgId).putExtra("img_gallery_msg_svr_id", localbd.field_msgSvrId).putExtra("img_gallery_talker", localbd.field_talker).putExtra("img_gallery_chatroom_name", localbd.field_talker).putExtra("img_gallery_orientation", j);
      if (paramView != null) {
        localIntent.putExtra("img_gallery_width", i).putExtra("img_gallery_height", paramInt).putExtra("img_gallery_left", arrayOfInt[0]).putExtra("img_gallery_top", arrayOfInt[1]).putExtra("img_gallery_enter_from_grid", true);
      }
      for (;;)
      {
        startActivity(localIntent);
        overridePendingTransition(0, 0);
        return;
        localIntent.putExtra("img_gallery_back_from_grid", true);
      }
      paramInt = 0;
      i = 0;
    }
  }
  
  private boolean a(com.tencent.mm.storage.bd parambd, f paramf)
  {
    if ((!parambd.field_talker.endsWith("@qqim")) || (!paramf.field_packageName.equals("com.tencent.mobileqq"))) {
      return false;
    }
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GalleryGridUI", "jacks open QQ");
    parambd = new Intent("android.intent.action.MAIN", null);
    parambd.addCategory("android.intent.category.LAUNCHER");
    parambd.addFlags(268435456);
    parambd.setClassName("com.tencent.mobileqq", aF(this.mController.tml, "com.tencent.mobileqq"));
    parambd.putExtra("platformId", "wechat");
    au.HU();
    paramf = com.tencent.mm.model.c.DT().get(9, null);
    int i;
    if ((paramf != null) && ((paramf instanceof Integer))) {
      i = ((Integer)paramf).intValue();
    }
    for (;;)
    {
      if (i != 0) {}
      try
      {
        paramf = String.valueOf(i).getBytes("utf-8");
        byte[] arrayOfByte = "asdfghjkl;'".getBytes("utf-8");
        int k = arrayOfByte.length;
        int j = 0;
        i = 0;
        while (j < k)
        {
          int m = arrayOfByte[j];
          if (i >= paramf.length) {
            break;
          }
          paramf[i] = ((byte)(m ^ paramf[i]));
          j += 1;
          i += 1;
        }
        parambd.putExtra("tencent_gif", paramf);
        i = 0;
      }
      catch (UnsupportedEncodingException paramf)
      {
        try
        {
          for (;;)
          {
            startActivity(parambd);
            return true;
            paramf = paramf;
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GalleryGridUI", paramf, "", new Object[0]);
          }
        }
        catch (Exception parambd)
        {
          for (;;) {}
        }
      }
    }
  }
  
  private static String aF(Context paramContext, String paramString)
  {
    paramContext = paramContext.getPackageManager();
    try
    {
      paramString = paramContext.getPackageInfo(paramString, 0);
      Intent localIntent = new Intent("android.intent.action.MAIN", null);
      localIntent.addCategory("android.intent.category.LAUNCHER");
      localIntent.setPackage(paramString.packageName);
      paramContext = (ResolveInfo)paramContext.queryIntentActivities(localIntent, 0).iterator().next();
      if (paramContext != null)
      {
        paramContext = paramContext.activityInfo.name;
        return paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  private void b(ch paramch)
  {
    paramch.bJF.activity = this;
    paramch.bJF.bJM = 45;
    com.tencent.mm.sdk.b.a.sFg.m(paramch);
    if ((paramch.bJG.ret == -2) || (paramch.bJG.ret > 0)) {}
    while (paramch.bJG.ret > 0) {
      return;
    }
    cwy();
    if (14 != paramch.bJF.type)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GalleryGridUI", "not record type, do not report");
      return;
    }
    if (paramch.bJF.bJI == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GalleryGridUI", "want to report record fav, but type count is null");
      return;
    }
    com.tencent.mm.plugin.report.service.h.mEJ.h(11142, new Object[] { Integer.valueOf(paramch.bJF.bJI.rBY), Integer.valueOf(paramch.bJF.bJI.rBZ), Integer.valueOf(paramch.bJF.bJI.rCa), Integer.valueOf(paramch.bJF.bJI.rCb), Integer.valueOf(paramch.bJF.bJI.rCc), Integer.valueOf(paramch.bJF.bJI.rCd), Integer.valueOf(paramch.bJF.bJI.rCe), Integer.valueOf(paramch.bJF.bJI.rCf), Integer.valueOf(paramch.bJF.bJI.rCg), Integer.valueOf(paramch.bJF.bJI.rCh), Integer.valueOf(paramch.bJF.bJI.rCi), Integer.valueOf(paramch.bJF.bJI.rCj), Integer.valueOf(paramch.bJF.bJI.rCk), Integer.valueOf(paramch.bJF.bJI.rCl), Integer.valueOf(paramch.bJF.bJI.rCm) });
  }
  
  private String bs(com.tencent.mm.storage.bd parambd)
  {
    String str = bi.aG(this.talker, "");
    boolean bool = this.talker.endsWith("@chatroom");
    if (!bool) {
      return str;
    }
    if (bool)
    {
      parambd = com.tencent.mm.model.bd.iB(parambd.field_content);
      if ((parambd == null) || (parambd.length() <= 0)) {}
    }
    for (;;)
    {
      return parambd;
      parambd = str;
    }
  }
  
  private void bt(com.tencent.mm.storage.bd parambd)
  {
    long l1 = this.tUA;
    long l2 = System.currentTimeMillis();
    this.tUA = l2;
    if (l1 + 30000L < l2)
    {
      au.HU();
      this.qUB = com.tencent.mm.model.c.isSDCardAvailable();
    }
    if (!this.qUB)
    {
      com.tencent.mm.ui.base.s.gH(this.mController.tml);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(this.mController.tml, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
    localIntent.putExtra("app_msg_id", parambd.field_msgId);
    startActivity(localIntent);
  }
  
  private void cwQ()
  {
    int i = this.tUr.getFirstVisiblePosition();
    int j = this.tUr.getLastVisiblePosition();
    int k = this.tUq;
    if ((k >= i) && (k <= j)) {
      return;
    }
    this.tUr.setSelection(k);
  }
  
  private void cwR()
  {
    if ((!g.a.cwU().tTJ.isEmpty()) && (g.a.cwU().tVs)) {}
    for (int i = 1; i != 0; i = 0)
    {
      this.tUF.setEnabled(true);
      this.tUG.setEnabled(true);
      this.tUH.setEnabled(true);
      this.tUI.setEnabled(true);
      return;
    }
    this.tUF.setEnabled(false);
    this.tUG.setEnabled(false);
    this.tUH.setEnabled(false);
    this.tUI.setEnabled(false);
  }
  
  private void cwx()
  {
    setMMTitle(getString(R.l.gallery_selected_title, new Object[] { Integer.valueOf(g.a.cwU().tTJ.size()) }));
    g.a.cwU().tVs = true;
    if (this.tUs == null) {
      return;
    }
    if (this.nen == null) {
      this.nen = AnimationUtils.loadAnimation(this, R.a.push_up_in);
    }
    c localc = this.tUs;
    localc.mGh = false;
    localc.notifyDataSetChanged();
    this.tUD.setVisibility(0);
    this.tUD.startAnimation(this.nen);
    this.tUF.setEnabled(false);
    this.tUG.setEnabled(false);
    this.tUH.setEnabled(false);
    this.tUI.setEnabled(false);
    this.tUE = this.tUr.getPaddingBottom();
    this.tUr.setPadding(this.tUr.getPaddingLeft(), this.tUr.getPaddingTop(), this.tUr.getPaddingRight(), com.tencent.mm.bp.a.ad(this.mController.tml, R.f.SmallListHeight));
    com.tencent.mm.plugin.report.service.h.mEJ.h(11627, new Object[] { Integer.valueOf(2) });
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(R.l.gallery_grid_cancel_selected_option), this);
  }
  
  private static void dG(List<com.tencent.mm.storage.bd> paramList)
  {
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)paramList.next();
      com.tencent.mm.ui.chatting.a.a(a.c.tFU, a.d.tFZ, localbd, 0);
    }
  }
  
  private static List<com.tencent.mm.storage.bd> dJ(List<com.tencent.mm.storage.bd> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)paramList.next();
      if ((!b.bi(localbd)) && (!b.bj(localbd))) {
        localArrayList.add(localbd);
      }
    }
    return localArrayList;
  }
  
  private static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      paramString = null;
    }
    while (paramString == null)
    {
      return null;
      paramString = com.tencent.mm.pluginsdk.model.app.g.bl(paramString, true);
      if (paramString == null) {
        paramString = null;
      } else {
        paramString = paramString.field_packageName;
      }
    }
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(paramString, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.GalleryGridUI", paramContext, "", new Object[0]);
    }
    return null;
  }
  
  public final void a(ah.a parama) {}
  
  public final void b(ah.a parama)
  {
    if (parama == ah.a.tMx)
    {
      this.tUs.WT();
      this.tUs.notifyDataSetChanged();
    }
    cwy();
  }
  
  public final void clear()
  {
    if ((this.tUs != null) && (this.mIsPause)) {
      this.tUs.tUj = true;
    }
    cwR();
  }
  
  protected final boolean cpZ()
  {
    return true;
  }
  
  public final void cug() {}
  
  public final boolean cuh()
  {
    return true;
  }
  
  public final void cwS()
  {
    if ((this.tUs != null) && (this.mIsPause)) {
      this.tUs.tUj = true;
    }
    setMMTitle(getString(R.l.gallery_selected_title, new Object[] { Integer.valueOf(g.a.cwU().tTJ.size()) }));
    cwR();
  }
  
  public final void cwy()
  {
    g.a.cwU().tVs = false;
    setMMTitle(getString(R.l.all_pictures));
    if (this.tUs == null) {
      return;
    }
    this.tUs.notifyDataSetChanged();
    if (this.tUE >= 0) {
      this.tUr.setPadding(this.tUr.getPaddingLeft(), this.tUr.getPaddingTop(), this.tUr.getPaddingRight(), this.tUE);
    }
    this.tUD.setVisibility(8);
    removeOptionMenu(0);
    addTextOptionMenu(0, getString(R.l.gallery_grid_selected_option), this);
  }
  
  public void finish()
  {
    super.finish();
    g.a.cwU().detach();
  }
  
  protected final int getLayoutId()
  {
    return R.i.image_gallery_grid;
  }
  
  public void onBackPressed()
  {
    if (g.a.cwU().tVs)
    {
      cwy();
      return;
    }
    if (this.tUu.booleanValue())
    {
      super.onBackPressed();
      return;
    }
    if (this.tUq >= 0) {
      M(null, this.tUq);
    }
    finish();
  }
  
  public void onClick(final View paramView)
  {
    if (g.a.cwU().tTJ.isEmpty()) {}
    Object localObject2;
    Object localObject1;
    label363:
    do
    {
      boolean bool;
      do
      {
        return;
        bool = this.talker.toLowerCase().endsWith("@chatroom");
        localObject2 = g.a.cwU().tTJ;
      } while ((localObject2 == null) || (((List)localObject2).isEmpty()));
      if (paramView.getId() == R.h.del_btn)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.h(11627, new Object[] { Integer.valueOf(5) });
        paramView = new TreeSet();
        localObject1 = ((List)localObject2).iterator();
        while (((Iterator)localObject1).hasNext()) {
          paramView.add(Long.valueOf(((com.tencent.mm.storage.bd)((Iterator)localObject1).next()).field_msgId));
        }
        com.tencent.mm.ui.base.h.a(this, getString(R.l.confirm_delete), "", getString(R.l.delete_message), getString(R.l.app_cancel), new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GalleryGridUI", "delete message");
            i.a(ImageGalleryGridUI.this, paramView, ImageGalleryGridUI.this);
            ImageGalleryGridUI.this.cwy();
          }
        }, null);
        return;
      }
      if (paramView.getId() == R.h.fav_btn)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 18L, 1L, true);
        ch localch = new ch();
        if (com.tencent.mm.pluginsdk.model.g.a(this.mController.tml, localch, this.talker, (List)localObject2, false, false))
        {
          b(localch);
          dG((List)localObject2);
          return;
        }
        if (((List)localObject2).size() > 1)
        {
          ActionBarActivity localActionBarActivity = this.mController.tml;
          if (localch.bJF.bJL >= 0)
          {
            paramView = this.mController.tml.getString(R.l.favorite_fail_recordtype_error);
            if (localch.bJF.bJL < 0) {
              break label363;
            }
          }
          for (localObject1 = this.mController.tml.getString(R.l.confirm_dialog_ok);; localObject1 = this.mController.tml.getString(R.l.plugin_favorite_opt))
          {
            com.tencent.mm.ui.base.h.a(localActionBarActivity, paramView, "", (String)localObject1, this.mController.tml.getString(R.l.confirm_dialog_cancel), new ImageGalleryGridUI.10(this, localch, (List)localObject2), null);
            return;
            paramView = this.mController.tml.getString(R.l.favorite_fail_record_expired_bigfile);
            break;
          }
        }
        com.tencent.mm.ui.base.h.i(this.mController.tml, localch.bJF.bJL, 0);
        return;
      }
      if (paramView.getId() == R.h.trans_btn)
      {
        com.tencent.mm.plugin.report.service.h.mEJ.a(219L, 19L, 1L, true);
        k.a(this, (List)localObject2, bool, this.talker, this);
        cwy();
        return;
      }
      com.tencent.mm.plugin.report.service.h.mEJ.h(11627, new Object[] { Integer.valueOf(3) });
      paramView = dJ((List)localObject2);
      if (paramView.size() != ((List)localObject2).size())
      {
        com.tencent.mm.ui.base.h.a(this.mController.tml, R.l.gallery_save_sight_tips, R.l.app_tip, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            b.e(ImageGalleryGridUI.this.mController.tml, paramView);
            ImageGalleryGridUI.this.cwy();
          }
        }, null);
        return;
      }
      localObject1 = (com.tencent.mm.storage.bd)paramView.get(0);
      if ((((List)localObject2).size() != 1) || (localObject1 == null) || (!((com.tencent.mm.storage.bd)localObject1).aQm())) {
        break;
      }
      localObject2 = ((cm)localObject1).field_content;
      paramView = null;
      if (localObject2 != null) {
        paramView = com.tencent.mm.y.g.a.J((String)localObject2, ((cm)localObject1).field_reserved);
      }
    } while ((paramView == null) || (paramView.type != 6));
    bt((com.tencent.mm.storage.bd)localObject1);
    return;
    b.e(this, (List)localObject2);
    cwy();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.tUz = true;
    this.handler = new ag();
    Fy(0);
    com.tencent.mm.sdk.b.a.sFg.b(this.tQa);
  }
  
  protected void onDestroy()
  {
    this.handler.removeCallbacks(this.tUy);
    this.handler = null;
    o.Pj().br(0);
    com.tencent.mm.sdk.b.a.sFg.c(this.tQa);
    super.onDestroy();
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    com.tencent.mm.storage.bd localbd = (com.tencent.mm.storage.bd)this.tUs.getItem(paramInt);
    paramAdapterView = localbd.field_content;
    if (paramAdapterView != null) {}
    for (paramAdapterView = com.tencent.mm.y.g.a.J(paramAdapterView, localbd.field_reserved);; paramAdapterView = null)
    {
      if ((paramAdapterView != null) && (paramAdapterView.type == 6)) {
        bt(localbd);
      }
      Object localObject2;
      Object localObject3;
      label184:
      label193:
      label476:
      label694:
      label701:
      label963:
      label979:
      label988:
      label1232:
      label1292:
      label1620:
      label1633:
      label1643:
      label1742:
      label1745:
      label1747:
      label1995:
      label2003:
      label2056:
      label2119:
      label2168:
      label2357:
      label2509:
      label2516:
      do
      {
        Object localObject4;
        boolean bool;
        do
        {
          for (;;)
          {
            return;
            if ((paramAdapterView != null) && (paramAdapterView.type == 3))
            {
              localObject1 = com.tencent.mm.pluginsdk.model.app.p.B(paramAdapterView.url, "message");
              localObject2 = com.tencent.mm.pluginsdk.model.app.p.B(paramAdapterView.dwn, "message");
              localObject3 = getPackageInfo(this.mController.tml, paramAdapterView.appId);
              if (localObject3 == null)
              {
                paramView = null;
                if (localObject3 != null) {
                  break label184;
                }
              }
              long l;
              for (paramInt = 0;; paramInt = ((PackageInfo)localObject3).versionCode)
              {
                localObject3 = paramAdapterView.appId;
                paramLong = localbd.field_msgId;
                l = localbd.field_msgSvrId;
                if (((localObject1 != null) && (((String)localObject1).length() != 0)) || ((localObject2 != null) && (((String)localObject2).length() != 0))) {
                  break label193;
                }
                com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GalleryGridUI", "url, lowUrl both are empty");
                return;
                paramView = ((PackageInfo)localObject3).versionName;
                break;
              }
              if (com.tencent.mm.sdk.platformtools.ao.isMobile(this.mController.tml))
              {
                paramAdapterView = (AdapterView<?>)localObject1;
                if (localObject2 != null)
                {
                  if (((String)localObject2).length() > 0) {
                    break label476;
                  }
                  paramAdapterView = (AdapterView<?>)localObject1;
                }
              }
              for (;;)
              {
                localObject1 = new Intent();
                ((Intent)localObject1).putExtra("msg_id", paramLong);
                ((Intent)localObject1).putExtra("rawUrl", paramAdapterView);
                ((Intent)localObject1).putExtra("version_name", paramView);
                ((Intent)localObject1).putExtra("version_code", paramInt);
                ((Intent)localObject1).putExtra("usePlugin", true);
                ((Intent)localObject1).putExtra("geta8key_username", this.talker);
                ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(l));
                ((Intent)localObject1).putExtra("KAppId", (String)localObject3);
                paramAdapterView = bs(localbd);
                ((Intent)localObject1).putExtra("pre_username", paramAdapterView);
                ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(l));
                if (localbd != null) {
                  ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
                }
                ((Intent)localObject1).putExtra("preChatName", this.talker);
                ((Intent)localObject1).putExtra("preChatTYPE", t.N(paramAdapterView, this.talker));
                ((Intent)localObject1).putExtra("preMsgIndex", 0);
                com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                return;
                if (localObject1 != null)
                {
                  paramAdapterView = (AdapterView<?>)localObject1;
                  if (((String)localObject1).length() > 0) {}
                }
                else
                {
                  paramAdapterView = (AdapterView<?>)localObject2;
                }
              }
            }
            if ((paramAdapterView != null) && (paramAdapterView.type == 5))
            {
              if ((paramAdapterView.url != null) && (!paramAdapterView.url.equals("")))
              {
                localObject1 = paramAdapterView.url;
                if (this.talker.endsWith("@chatroom"))
                {
                  paramView = "groupmessage";
                  localObject3 = com.tencent.mm.pluginsdk.model.app.p.B((String)localObject1, paramView);
                  paramView = paramAdapterView.url;
                  localObject2 = getPackageInfo(this.mController.tml, paramAdapterView.appId);
                  localObject1 = new Intent();
                  ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
                  ((Intent)localObject1).putExtra("webpageTitle", paramAdapterView.title);
                  if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
                  {
                    localObject3 = new Bundle();
                    ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
                    ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
                  }
                  if (bi.oW(paramView)) {
                    break label963;
                  }
                  ((Intent)localObject1).putExtra("shortUrl", paramView);
                  if (localObject2 != null) {
                    break label979;
                  }
                  paramView = null;
                  ((Intent)localObject1).putExtra("version_name", paramView);
                  if (localObject2 != null) {
                    break label988;
                  }
                }
                for (paramInt = 0;; paramInt = ((PackageInfo)localObject2).versionCode)
                {
                  ((Intent)localObject1).putExtra("version_code", paramInt);
                  if (!bi.oW(paramAdapterView.bZG))
                  {
                    ((Intent)localObject1).putExtra("srcUsername", paramAdapterView.bZG);
                    ((Intent)localObject1).putExtra("srcDisplayname", paramAdapterView.bZH);
                  }
                  ((Intent)localObject1).putExtra("msg_id", localbd.field_msgId);
                  ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(localbd.field_msgSvrId));
                  ((Intent)localObject1).putExtra("KAppId", paramAdapterView.appId);
                  ((Intent)localObject1).putExtra("geta8key_username", this.talker);
                  paramAdapterView = bs(localbd);
                  ((Intent)localObject1).putExtra("pre_username", paramAdapterView);
                  ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(localbd.field_msgSvrId));
                  ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
                  ((Intent)localObject1).putExtra("preChatName", this.talker);
                  ((Intent)localObject1).putExtra("preChatTYPE", t.N(paramAdapterView, this.talker));
                  ((Intent)localObject1).putExtra("preMsgIndex", 0);
                  com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
                  return;
                  paramView = "singlemessage";
                  break;
                  ((Intent)localObject1).putExtra("shortUrl", paramAdapterView.url);
                  break label694;
                  paramView = ((PackageInfo)localObject2).versionName;
                  break label701;
                }
              }
            }
            else
            {
              if ((paramAdapterView != null) && (paramAdapterView.type == 19))
              {
                paramView = new Intent();
                paramView.putExtra("message_id", localbd.field_msgId);
                paramView.putExtra("record_xml", paramAdapterView.dwW);
                com.tencent.mm.bg.d.b(this.mController.tml, "record", ".ui.RecordMsgDetailUI", paramView);
                return;
              }
              if ((paramAdapterView != null) && (paramAdapterView.type == 24))
              {
                paramView = new lj();
                paramView.bVI.context = this.mController.tml;
                paramView.bVI.bJC = localbd.field_msgId;
                paramView.bVI.bVJ = paramAdapterView.dwW;
                com.tencent.mm.sdk.b.a.sFg.m(paramView);
                return;
              }
              if ((paramAdapterView == null) || (paramAdapterView.type != 7)) {
                break label2119;
              }
              localObject2 = com.tencent.mm.pluginsdk.model.app.g.bl(paramAdapterView.appId, false);
              if ((localObject2 != null) && (((f)localObject2).aaq()))
              {
                localObject1 = this.talker;
                paramView = (View)localObject1;
                if (com.tencent.mm.model.s.fq((String)localObject1)) {
                  paramView = com.tencent.mm.model.bd.iB(localbd.field_content);
                }
                paramLong = localbd.field_msgSvrId;
                if ((localObject2 != null) && (com.tencent.mm.pluginsdk.model.app.p.r(this.mController.tml, ((f)localObject2).field_packageName)))
                {
                  paramInt = 3;
                  if (paramAdapterView.type != 2) {
                    break label1620;
                  }
                  paramInt = 4;
                  localObject3 = new nk();
                  ((nk)localObject3).bYs.context = this.mController.tml;
                  ((nk)localObject3).bYs.scene = 1;
                  ((nk)localObject3).bYs.bPS = paramAdapterView.appId;
                  localObject4 = ((nk)localObject3).bYs;
                  if (localObject2 != null) {
                    break label1633;
                  }
                  localObject1 = null;
                  ((nk.a)localObject4).packageName = ((String)localObject1);
                  ((nk)localObject3).bYs.msgType = paramAdapterView.type;
                  ((nk)localObject3).bYs.bSS = paramView;
                  ((nk)localObject3).bYs.bYt = paramInt;
                  ((nk)localObject3).bYs.mediaTagName = paramAdapterView.mediaTagName;
                  ((nk)localObject3).bYs.bYu = paramLong;
                  ((nk)localObject3).bYs.bYv = "";
                  com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject3);
                  paramView = a.a.aSm();
                  if ((com.tencent.mm.pluginsdk.model.app.g.a(this.mController.tml, (f)localObject2)) || (paramView == null)) {
                    break label1742;
                  }
                  if (bi.oW(((com.tencent.mm.g.c.p)localObject2).cmK)) {
                    break label1643;
                  }
                  bool = com.tencent.mm.pluginsdk.model.app.q.bi(this.mController.tml, ((com.tencent.mm.g.c.p)localObject2).cmK);
                  com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GalleryGridUI", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", new Object[] { ((com.tencent.mm.g.c.p)localObject2).cmK, Boolean.valueOf(bool) });
                  if (!bool) {
                    break label1643;
                  }
                  paramInt = 1;
                }
                for (;;)
                {
                  if (paramInt != 0) {
                    break label1745;
                  }
                  if ((paramAdapterView.bGP != null) && (paramAdapterView.bGP.length() != 0)) {
                    break label2056;
                  }
                  paramView = localbd.field_content;
                  paramAdapterView = paramView;
                  if (localbd.field_isSend == 0)
                  {
                    paramInt = localbd.field_isSend;
                    paramAdapterView = paramView;
                    if (!this.qIZ)
                    {
                      paramAdapterView = paramView;
                      if (com.tencent.mm.model.s.fq(this.talker))
                      {
                        paramAdapterView = paramView;
                        if (paramView != null)
                        {
                          paramAdapterView = paramView;
                          if (paramInt == 0) {
                            paramAdapterView = com.tencent.mm.model.bd.iC(paramView);
                          }
                        }
                      }
                    }
                  }
                  paramView = com.tencent.mm.y.g.a.gp(paramAdapterView);
                  localObject1 = com.tencent.mm.pluginsdk.model.app.g.bl(paramView.appId, true);
                  if ((localObject1 == null) || (!com.tencent.mm.pluginsdk.model.app.p.r(this.mController.tml, ((f)localObject1).field_packageName))) {
                    break label2003;
                  }
                  if (((f)localObject1).field_status != 3) {
                    break label1747;
                  }
                  com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GalleryGridUI", "requestAppShow fail, app is in blacklist, packageName = " + ((f)localObject1).field_packageName);
                  return;
                  paramInt = 6;
                  break;
                  if (paramAdapterView.type != 5) {
                    break label1232;
                  }
                  paramInt = 1;
                  break label1232;
                  localObject1 = ((f)localObject2).field_packageName;
                  break label1292;
                  localObject1 = new gk();
                  ((gk)localObject1).bPB.actionCode = 2;
                  ((gk)localObject1).bPB.scene = 1;
                  ((gk)localObject1).bPB.appId = ((f)localObject2).field_appId;
                  ((gk)localObject1).bPB.context = this.mController.tml;
                  com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
                  new Intent();
                  localObject1 = this.mController.tml;
                  paramView.S(((f)localObject2).field_appId, 1, 1);
                  paramInt = 1;
                  continue;
                  paramInt = 0;
                }
              }
            }
          }
          if (!com.tencent.mm.pluginsdk.model.app.p.b(this.mController.tml, (f)localObject1))
          {
            com.tencent.mm.sdk.platformtools.x.e("MicroMsg.GalleryGridUI", "The app %s signature is incorrect.", new Object[] { ((f)localObject1).field_appName });
            Toast.makeText(this.mController.tml, getString(R.l.game_launch_fail_alert, new Object[] { com.tencent.mm.pluginsdk.model.app.g.b(this.mController.tml, (f)localObject1, null) }), 1).show();
            return;
          }
        } while (a(localbd, (f)localObject1));
        localObject2 = new WXAppExtendObject();
        ((WXAppExtendObject)localObject2).extInfo = paramView.extInfo;
        if ((paramView.bGP != null) && (paramView.bGP.length() > 0))
        {
          paramAdapterView = com.tencent.mm.pluginsdk.model.app.ao.asF().SR(paramView.bGP);
          if (paramAdapterView != null) {
            break label1995;
          }
        }
        for (paramAdapterView = null;; paramAdapterView = paramAdapterView.field_fileFullPath)
        {
          ((WXAppExtendObject)localObject2).filePath = paramAdapterView;
          paramAdapterView = new WXMediaMessage();
          paramAdapterView.sdkVer = 620823808;
          paramAdapterView.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
          paramAdapterView.title = paramView.title;
          paramAdapterView.description = paramView.description;
          paramAdapterView.messageAction = paramView.messageAction;
          paramAdapterView.messageExt = paramView.messageExt;
          paramAdapterView.thumbData = e.e(o.Pf().lN(localbd.field_imgPath), 0, -1);
          new as(this).a(((f)localObject1).field_packageName, paramAdapterView, ((f)localObject1).field_appId, ((f)localObject1).field_openId);
          return;
        }
        paramAdapterView = com.tencent.mm.pluginsdk.model.app.p.y(this.mController.tml, paramView.appId, "message");
        paramView = new Intent();
        paramView.putExtra("rawUrl", paramAdapterView);
        com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramView);
        return;
        if (!this.qUB)
        {
          com.tencent.mm.ui.base.s.gH(this.mController.tml);
          return;
        }
        paramAdapterView = new Intent();
        paramAdapterView.setClassName(this.mController.tml, "com.tencent.mm.ui.chatting.AppAttachDownloadUI");
        paramAdapterView.putExtra("app_msg_id", localbd.field_msgId);
        startActivityForResult(paramAdapterView, 210);
        return;
        int i;
        if ((localbd.cmj()) || (localbd.ckA()) || (localbd.cmk()) || (localbd.cmo()))
        {
          if ((paramAdapterView == null) || (bi.oW(paramAdapterView.dyJ)))
          {
            i = 0;
            if (i == 0) {
              M(paramView, paramInt);
            }
          }
          else
          {
            localObject1 = localbd.field_imgPath;
            localObject3 = new Intent();
            ((Intent)localObject3).putExtra("IsAd", false);
            ((Intent)localObject3).putExtra("KStremVideoUrl", paramAdapterView.dyJ);
            ((Intent)localObject3).putExtra("KThumUrl", paramAdapterView.dyO);
            ((Intent)localObject3).putExtra("KThumbPath", (String)localObject1);
            ((Intent)localObject3).putExtra("KMediaId", "fakeid_" + localbd.field_msgId);
            ((Intent)localObject3).putExtra("KMediaVideoTime", paramAdapterView.dyK);
            ((Intent)localObject3).putExtra("StremWebUrl", paramAdapterView.dyN);
            ((Intent)localObject3).putExtra("StreamWording", paramAdapterView.dyM);
            ((Intent)localObject3).putExtra("KMediaTitle", paramAdapterView.title);
            localObject2 = localbd.field_talker;
            bool = ((String)localObject2).endsWith("@chatroom");
            if (!bool) {
              break label2509;
            }
            localObject1 = com.tencent.mm.model.bd.iB(localbd.field_content);
            ((Intent)localObject3).putExtra("KSta_StremVideoAduxInfo", paramAdapterView.dyP);
            ((Intent)localObject3).putExtra("KSta_StremVideoPublishId", paramAdapterView.dyQ);
            ((Intent)localObject3).putExtra("KSta_SourceType", 1);
            if (!bool) {
              break label2516;
            }
          }
          for (i = a.b.tFR.value;; i = a.b.tFQ.value)
          {
            ((Intent)localObject3).putExtra("KSta_Scene", i);
            ((Intent)localObject3).putExtra("KSta_FromUserName", (String)localObject1);
            ((Intent)localObject3).putExtra("KSta_ChatName", (String)localObject2);
            ((Intent)localObject3).putExtra("KSta_MsgId", localbd.field_msgSvrId);
            ((Intent)localObject3).putExtra("KSta_SnsStatExtStr", paramAdapterView.bZN);
            if (bool) {
              ((Intent)localObject3).putExtra("KSta_ChatroomMembercount", m.gK((String)localObject2));
            }
            com.tencent.mm.bg.d.b(this.mController.tml, "sns", ".ui.VideoAdPlayerUI", (Intent)localObject3);
            i = 1;
            break label2168;
            break;
            localObject1 = localObject2;
            break label2357;
          }
        }
        if ((paramAdapterView != null) && (paramAdapterView.type == 15))
        {
          localObject1 = paramAdapterView.dwZ;
          paramView = (View)localObject1;
          if (TextUtils.isEmpty((CharSequence)localObject1)) {
            paramView = ((com.tencent.mm.plugin.emoji.b.c)com.tencent.mm.kernel.g.n(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr().zn(paramAdapterView.url);
          }
          if (TextUtils.isEmpty(paramView))
          {
            paramView = new Intent();
            paramView.putExtra("geta8key_username", com.tencent.mm.model.q.GF());
            paramView.putExtra("rawUrl", paramAdapterView.url);
            com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", paramView);
            return;
          }
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.GalleryGridUI", "start emoji detail from brandcontact");
          paramAdapterView = new Intent();
          paramAdapterView.putExtra("extra_id", paramView);
          paramAdapterView.putExtra("preceding_scence", 123);
          paramAdapterView.putExtra("download_entrance_scene", 23);
          com.tencent.mm.bg.d.b(this.mController.tml, "emoji", ".ui.EmojiStoreDetailUI", paramAdapterView);
          com.tencent.mm.plugin.report.service.h.mEJ.h(10993, new Object[] { Integer.valueOf(2), paramView });
          return;
        }
        if ((paramAdapterView != null) && (paramAdapterView.type == 26))
        {
          paramInt = paramAdapterView.tid;
          paramView = paramAdapterView.dyH;
          localObject1 = paramAdapterView.desc;
          localObject2 = paramAdapterView.iconUrl;
          localObject3 = paramAdapterView.secondUrl;
          i = paramAdapterView.pageType;
          if (paramInt != 0)
          {
            localObject4 = new Intent();
            ((Intent)localObject4).putExtra("geta8key_username", bs(localbd));
            ((Intent)localObject4).putExtra("rawUrl", paramAdapterView.cGB);
            ((Intent)localObject4).putExtra("topic_id", paramInt);
            ((Intent)localObject4).putExtra("topic_name", paramView);
            ((Intent)localObject4).putExtra("topic_desc", (String)localObject1);
            ((Intent)localObject4).putExtra("topic_icon_url", (String)localObject2);
            ((Intent)localObject4).putExtra("topic_ad_url", (String)localObject3);
            ((Intent)localObject4).putExtra("extra_scence", 23);
            com.tencent.mm.bg.d.b(this.mController.tml, "emoji", ".ui.EmojiStoreTopicUI", (Intent)localObject4);
            return;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GalleryGridUI", "topic id is zero.");
          return;
        }
        if ((paramAdapterView != null) && (paramAdapterView.type == 27))
        {
          paramInt = paramAdapterView.tid;
          paramView = paramAdapterView.dyH;
          localObject1 = paramAdapterView.desc;
          localObject2 = paramAdapterView.iconUrl;
          localObject3 = paramAdapterView.secondUrl;
          i = paramAdapterView.pageType;
          if (paramInt != 0)
          {
            localObject4 = new Intent();
            ((Intent)localObject4).putExtra("geta8key_username", bs(localbd));
            ((Intent)localObject4).putExtra("rawUrl", paramAdapterView.cGB);
            ((Intent)localObject4).putExtra("set_id", paramInt);
            ((Intent)localObject4).putExtra("set_title", paramView);
            ((Intent)localObject4).putExtra("set_iconURL", (String)localObject2);
            ((Intent)localObject4).putExtra("set_desc", (String)localObject1);
            ((Intent)localObject4).putExtra("headurl", (String)localObject3);
            ((Intent)localObject4).putExtra("pageType", i);
            com.tencent.mm.bg.d.b(this.mController.tml, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", (Intent)localObject4);
            return;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GalleryGridUI", "topic id is zero.");
          return;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.GalleryGridUI", "talker:%s, msgId:%s, msgType:%s, msgContent:%s", new Object[] { localbd.field_talker, Long.valueOf(localbd.field_msgId), Integer.valueOf(localbd.getType()), localbd.field_content });
      } while ((paramAdapterView.url == null) || (paramAdapterView.url.equals("")) || (paramAdapterView.url == null) || (paramAdapterView.url.equals("")));
      Object localObject1 = paramAdapterView.url;
      if (com.tencent.mm.model.s.fq(this.talker))
      {
        paramView = "groupmessage";
        localObject3 = com.tencent.mm.pluginsdk.model.app.p.B((String)localObject1, paramView);
        paramView = paramAdapterView.url;
        localObject2 = getPackageInfo(this.mController.tml, paramAdapterView.appId);
        localObject1 = new Intent();
        ((Intent)localObject1).putExtra("rawUrl", (String)localObject3);
        ((Intent)localObject1).putExtra("webpageTitle", paramAdapterView.title);
        if ((paramAdapterView.appId != null) && (("wx751a1acca5688ba3".equals(paramAdapterView.appId)) || ("wxfbc915ff7c30e335".equals(paramAdapterView.appId)) || ("wx482a4001c37e2b74".equals(paramAdapterView.appId))))
        {
          localObject3 = new Bundle();
          ((Bundle)localObject3).putString("jsapi_args_appid", paramAdapterView.appId);
          ((Intent)localObject1).putExtra("jsapiargs", (Bundle)localObject3);
        }
        if (bi.oW(paramView)) {
          break label3626;
        }
        ((Intent)localObject1).putExtra("shortUrl", paramView);
        label3355:
        if (localObject2 != null) {
          break label3642;
        }
        paramView = null;
        label3362:
        ((Intent)localObject1).putExtra("version_name", paramView);
        if (localObject2 != null) {
          break label3651;
        }
      }
      label3626:
      label3642:
      label3651:
      for (paramInt = 0;; paramInt = ((PackageInfo)localObject2).versionCode)
      {
        ((Intent)localObject1).putExtra("version_code", paramInt);
        if (!bi.oW(paramAdapterView.bZG))
        {
          ((Intent)localObject1).putExtra("srcUsername", paramAdapterView.bZG);
          ((Intent)localObject1).putExtra("srcDisplayname", paramAdapterView.bZH);
        }
        ((Intent)localObject1).putExtra("msg_id", localbd.field_msgId);
        ((Intent)localObject1).putExtra("KPublisherId", "msg_" + Long.toString(localbd.field_msgSvrId));
        ((Intent)localObject1).putExtra("KAppId", paramAdapterView.appId);
        ((Intent)localObject1).putExtra("geta8key_username", com.tencent.mm.model.q.GF());
        ((Intent)localObject1).putExtra("pre_username", bs(localbd));
        ((Intent)localObject1).putExtra("prePublishId", "msg_" + Long.toString(localbd.field_msgSvrId));
        paramAdapterView = bs(localbd);
        paramView = com.tencent.mm.model.q.GF();
        ((Intent)localObject1).putExtra("preUsername", paramAdapterView);
        ((Intent)localObject1).putExtra("preChatName", paramView);
        ((Intent)localObject1).putExtra("preChatTYPE", t.N(paramAdapterView, paramView));
        ((Intent)localObject1).putExtra("preMsgIndex", 0);
        com.tencent.mm.bg.d.b(this.mController.tml, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        return;
        paramView = "singlemessage";
        break;
        ((Intent)localObject1).putExtra("shortUrl", paramAdapterView.url);
        break label3355;
        paramView = ((PackageInfo)localObject2).versionName;
        break label3362;
      }
    }
  }
  
  public boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    if (paramMenuItem.getTitle().equals(getString(R.l.gallery_grid_selected_option)))
    {
      g.a.cwU().clear();
      cwx();
    }
    for (;;)
    {
      return false;
      cwy();
    }
  }
  
  protected void onNewIntent(Intent paramIntent)
  {
    setIntent(paramIntent);
    super.onNewIntent(paramIntent);
    Fy(1);
  }
  
  protected void onPause()
  {
    g localg = g.a.cwU();
    if (this != null) {
      localg.tVt.remove(this);
    }
    this.mIsPause = true;
    super.onPause();
  }
  
  public boolean onPreDraw()
  {
    Object localObject1 = (c.a)this.tUt.get();
    if (localObject1 == null) {}
    Object localObject2;
    do
    {
      int i;
      int j;
      do
      {
        do
        {
          return true;
          localObject2 = ((c.a)localObject1).mZb.getViewTreeObserver();
        } while (!((ViewTreeObserver)localObject2).isAlive());
        ((ViewTreeObserver)localObject2).removeOnPreDrawListener(this);
        i = ((c.a)localObject1).mZb.getMeasuredWidth();
        j = ((c.a)localObject1).mZb.getMeasuredHeight();
      } while ((i <= 0) || (j <= 0));
      localObject2 = (RelativeLayout.LayoutParams)((c.a)localObject1).tNO.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject2).width = i;
      ((ViewGroup.LayoutParams)localObject2).height = j;
      ((c.a)localObject1).tNO.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject1 = ((c.a)localObject1).tNO;
      localObject2 = new DecelerateInterpolator();
    } while (Build.VERSION.SDK_INT < 12);
    this.tUC = ((View)localObject1);
    this.handler.postDelayed(new ImageGalleryGridUI.7(this, (View)localObject1, (TimeInterpolator)localObject2), 700L);
    return true;
  }
  
  protected void onResume()
  {
    g.a.cwU().a(this);
    this.mIsPause = false;
    if (this.tUz)
    {
      if (!g.a.cwU().tVs) {
        break label131;
      }
      cwx();
    }
    for (;;)
    {
      this.handler.postDelayed(this.tUy, 300L);
      super.onResume();
      if (this.tUs != null)
      {
        this.tUs.tUj = true;
        c localc = this.tUs;
        if (localc.tUj) {
          localc.notifyDataSetChanged();
        }
        if (g.a.cwU().tVs) {
          setMMTitle(getString(R.l.gallery_selected_title, new Object[] { Integer.valueOf(g.a.cwU().tTJ.size()) }));
        }
      }
      this.tUz = false;
      cwR();
      return;
      label131:
      cwy();
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/gallery/ImageGalleryGridUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */