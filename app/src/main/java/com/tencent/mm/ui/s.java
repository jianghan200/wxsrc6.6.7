package com.tencent.mm.ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.os.SystemClock;
import android.support.v4.view.m;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.mm.compatible.b.f;
import com.tencent.mm.compatible.util.h;
import com.tencent.mm.g.a.ah;
import com.tencent.mm.g.a.ah.b;
import com.tencent.mm.g.a.ry;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.a.a.a;
import com.tencent.mm.ui.tools.o;
import com.tencent.mm.w.a.d;
import com.tencent.mm.w.a.e;
import com.tencent.mm.w.a.f;
import com.tencent.mm.w.a.g;
import com.tencent.mm.w.a.h;
import com.tencent.mm.w.a.j;
import com.tencent.mm.w.a.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

public abstract class s
{
  public static final int tmE;
  private static byte[] tmH = { 0 };
  private static boolean tmo = false;
  private static PowerManager.WakeLock wakeLock;
  public int aDx = this.tmy;
  String className;
  public View contentView;
  private o eMS;
  private LayoutInflater eMa;
  AudioManager eoL;
  private int jCR = 0;
  public ActionBar mActionBar;
  public Context mContext;
  public boolean mQO = false;
  protected ag msM = new ag(Looper.getMainLooper());
  private final long oco = 300L;
  private long ocp = SystemClock.elapsedRealtime();
  private View ofX;
  private int tgp = 0;
  ImageButton tgq;
  TextView tgs;
  LinkedList<a> tgz = new LinkedList();
  protected boolean tlM = false;
  private View tlW;
  public View tlX;
  View tlY;
  private TextView tlZ;
  private int tmA = 0;
  private boolean tmB = false;
  private c tmC = new c() {};
  private int tmD = a.h.actionbar_title;
  private int tmF = -1;
  public int tmG = 0;
  private a tmI;
  private MenuItem tmJ;
  private Runnable tmK = new Runnable()
  {
    public final void run()
    {
      s.i(s.this).getWindow().setFlags(1024, 1024);
      if (s.j(s.this) != null) {
        s.j(s.this).hide();
      }
    }
  };
  private Runnable tmL = new Runnable()
  {
    public final void run()
    {
      if (s.j(s.this) != null) {
        s.j(s.this).show();
      }
    }
  };
  FrameLayout tma;
  public boolean tmb = true;
  private String tmc = " ";
  private int tmd = 0;
  private int tme = 0;
  private com.tencent.mm.ui.widget.a tmf = null;
  private com.tencent.mm.ui.widget.a tmg = null;
  private com.tencent.mm.ui.widget.a tmh = null;
  private com.tencent.mm.ui.widget.a tmi = null;
  private boolean tmj = false;
  boolean tmk = false;
  public ActionBarActivity tml;
  private boolean tmm;
  private a tmn = new a();
  private ArrayList<Dialog> tmp;
  public TextView tmq;
  private View tmr;
  View tms;
  public ImageView tmt;
  TextView tmu;
  int tmv = 0;
  private ImageView tmw;
  private ViewGroup.LayoutParams tmx;
  int tmy;
  private int tmz;
  
  static
  {
    tmE = a.h.actionbar_title_single_text;
    wakeLock = null;
  }
  
  private void a(int paramInt1, final boolean paramBoolean1, final String paramString1, final String paramString2, final String paramString3, final int paramInt2, boolean paramBoolean2)
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "initNotifyView viewid[%d], visible[%b], uithread[%b], noticeid[%s], position[%d], notifyView[%s]", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(paramBoolean1), Boolean.valueOf(paramBoolean2), paramString3, Integer.valueOf(paramInt2), this.tlY });
    if (!needShowIdcError()) {
      break label61;
    }
    label61:
    while ((!paramBoolean1) && (this.tlY == null)) {
      return;
    }
    if ((this.mActionBar != null) && (!this.mActionBar.isShowing()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "initNotifyView mActionBar not showing");
      return;
    }
    if (this.tma == null) {
      this.tma = ((FrameLayout)this.contentView.findViewById(a.g.mm_content_fl));
    }
    if (this.tlY != null) {
      this.tma.removeView(this.tlY);
    }
    int i = a.h.mmnotify_view;
    if (paramInt1 > 0) {}
    for (;;)
    {
      this.tlY = this.eMa.inflate(paramInt1, null);
      this.tlZ = ((TextView)this.tlY.findViewById(a.g.notify_text));
      this.tlY.findViewById(a.g.notify_btn).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = new ah();
          paramAnonymousView.bHy.type = 1;
          paramAnonymousView.bHy.bHA = paramString3;
          paramAnonymousView.bHy.position = paramInt2;
          com.tencent.mm.sdk.b.a.sFg.m(paramAnonymousView);
          s.b(s.this).setVisibility(8);
        }
      });
      this.tlY.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          if (paramString1 != null)
          {
            paramAnonymousView = new Intent("android.intent.action.VIEW");
            paramAnonymousView.setData(Uri.parse(paramString1));
            s.c(s.this).startActivity(paramAnonymousView);
          }
        }
      });
      paramString3 = new FrameLayout.LayoutParams(-1, -2);
      if ((this.tmB) && (Build.VERSION.SDK_INT >= 16))
      {
        paramString3.setMargins(0, BackwardSupportUtil.b.b(this.tml, 48.0F), 0, 0);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz initNotifyView [%d, %d]", new Object[] { Integer.valueOf(paramString3.height), Integer.valueOf(paramString3.topMargin) });
      }
      this.tma.addView(this.tlY, this.tma.getChildCount(), paramString3);
      if (this.tlY == null) {
        break;
      }
      if (paramBoolean2)
      {
        paramString3 = this.tlY;
        if (paramBoolean1)
        {
          paramInt1 = 0;
          paramString3.setVisibility(paramInt1);
          String str = this.mContext.getString(a.k.idc_url);
          paramString3 = paramString2;
          if (bi.oW(paramString2)) {
            paramString3 = this.mContext.getString(a.k.disaster_default_tips_default);
          }
          if (paramString1 == null) {
            break label489;
          }
          paramString1 = new SpannableString(paramString3 + str);
          paramString2 = new ForegroundColorSpan(-10119449);
          paramInt1 = paramString3.length();
          paramInt2 = paramString3.length();
          paramString1.setSpan(paramString2, paramInt1, str.length() + paramInt2, 33);
          this.tlZ.setText(paramString1);
        }
        for (;;)
        {
          this.tlY.invalidate();
          this.tma.invalidate();
          return;
          paramInt1 = 8;
          break;
          label489:
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz url is null 1");
          this.tlZ.setText(paramString3);
        }
      }
      this.tlY.post(new Runnable()
      {
        public final void run()
        {
          Object localObject = s.b(s.this);
          int i;
          if (paramBoolean1)
          {
            i = 0;
            ((View)localObject).setVisibility(i);
            String str = s.c(s.this).getString(a.k.idc_url);
            if (!bi.oW(paramString2)) {
              break label162;
            }
            localObject = s.c(s.this).getString(a.k.disaster_default_tips_default);
            label60:
            if (paramString1 == null) {
              break label170;
            }
            SpannableString localSpannableString = new SpannableString((String)localObject + str);
            localSpannableString.setSpan(new ForegroundColorSpan(-10119449), ((String)localObject).length(), ((String)localObject).length() + str.length(), 33);
            s.d(s.this).setText(localSpannableString);
          }
          for (;;)
          {
            s.b(s.this).invalidate();
            s.e(s.this).invalidate();
            return;
            i = 8;
            break;
            label162:
            localObject = paramString2;
            break label60;
            label170:
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz url is null 2");
            s.d(s.this).setText((CharSequence)localObject);
          }
        }
      });
      return;
      paramInt1 = i;
    }
  }
  
  private void a(MenuItem paramMenuItem, a parama)
  {
    if (!this.tmb) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "callMenuCallback screen not enable.");
    }
    while (parama.eOJ == null) {
      return;
    }
    parama.eOJ.onMenuItemClick(paramMenuItem);
  }
  
  public static Locale bw(Context paramContext, String paramString)
  {
    if (paramString.equals("language_default"))
    {
      w.a(paramContext, Locale.ENGLISH);
      return Locale.getDefault();
    }
    paramString = w.Wl(paramString);
    w.a(paramContext, paramString);
    return paramString;
  }
  
  public static void cqb()
  {
    tmo = true;
  }
  
  public static boolean cqn()
  {
    for (;;)
    {
      synchronized (tmH)
      {
        if (wakeLock != null)
        {
          bool = wakeLock.isHeld();
          return bool;
        }
      }
      boolean bool = false;
    }
  }
  
  public static void cqp() {}
  
  public static void cqq() {}
  
  private com.tencent.mm.ui.widget.a eK(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = this.mContext.getResources().getDrawable(paramInt2);
    if (this.mQO) {
      localDrawable = an.ao(this.tml, paramInt2);
    }
    localDrawable.setBounds(0, 0, localDrawable.getIntrinsicWidth(), localDrawable.getIntrinsicHeight());
    com.tencent.mm.ui.widget.a locala = new com.tencent.mm.ui.widget.a(localDrawable);
    locala.uFY = ((localDrawable.getIntrinsicHeight() - paramInt1) / 2);
    return locala;
  }
  
  private View findViewById(int paramInt)
  {
    View localView = this.contentView.findViewById(paramInt);
    if (localView != null) {
      return localView;
    }
    return this.tml.findViewById(paramInt);
  }
  
  protected static int getForceOrientation()
  {
    return -1;
  }
  
  public static Locale initLanguage(Context paramContext)
  {
    return bw(paramContext, w.d(paramContext.getSharedPreferences(ad.chY(), 0)));
  }
  
  @TargetApi(21)
  private static void k(Activity paramActivity, int paramInt)
  {
    if (Build.VERSION.SDK_INT < 21) {
      return;
    }
    if ((Build.VERSION.SDK_INT >= 23) && (!h.Af())) {}
    for (;;)
    {
      paramActivity.getWindow().setStatusBarColor(paramInt);
      return;
      if (Build.VERSION.SDK_INT >= 21) {
        paramInt = an.n(paramActivity.getResources().getColor(a.d.statusbar_fg_drak_color), paramInt);
      } else {
        paramInt = 0;
      }
    }
  }
  
  final boolean DP(int paramInt)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.tgz.size())
      {
        if (((a)this.tgz.get(i)).tgH == paramInt)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
          this.tgz.remove(i);
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final a DQ(int paramInt)
  {
    Iterator localIterator = this.tgz.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.tgH == paramInt) {
        return locala;
      }
    }
    return null;
  }
  
  public final void DR(int paramInt)
  {
    int i = paramInt;
    if (paramInt > this.tmy) {
      i = this.tmy;
    }
    paramInt = i;
    if (i < this.tmz) {
      paramInt = this.tmz;
    }
    this.aDx = paramInt;
    this.ofX = this.tml.getWindow().getDecorView().findViewById(a.g.action_bar_container);
    if (this.ofX != null) {
      this.tmx = this.ofX.getLayoutParams();
    }
    if ((this.ofX != null) && (this.tmx != null))
    {
      this.tmx.height = (this.ofX.getPaddingTop() + paramInt + this.ofX.getPaddingBottom());
      this.ofX.setLayoutParams(this.tmx);
    }
    float f1 = Math.min(com.tencent.mm.bp.a.fe(this.tml), com.tencent.mm.bp.a.fg(this.tml));
    i = (int)(ap.ae(this.mContext, a.e.SmallTiteSzie) * f1);
    int j = (int)(f1 * ap.ae(this.mContext, a.e.NormalTiteSzie));
    int k = ap.fromDPToPix(this.mContext, 14);
    f1 = (paramInt - this.tmz) / (this.tmy - this.tmz);
    float f2 = i;
    float f3 = j - i;
    aB(f1);
    paramInt = (int)((k - ap.fromDPToPix(this.mContext, 40)) * (1.0F - f1));
    i = (int)((this.tmz - this.tmy) / 2.0F * (1.0F - f1));
    if (this.tmq != null)
    {
      this.tmq.setTextSize(0, f3 * f1 + f2);
      if (this.tmr != null)
      {
        this.tmr.setTranslationX(paramInt);
        this.tmr.setTranslationY(i);
      }
    }
    if (this.tmt != null) {
      this.tmt.setTranslationY(i);
    }
    if (this.tgq != null) {
      this.tgq.setTranslationY(i);
    }
  }
  
  public final void M(CharSequence paramCharSequence)
  {
    if (this.mActionBar == null) {
      return;
    }
    this.tmc = paramCharSequence.toString();
    this.tmq.setText(paramCharSequence);
    if (com.tencent.mm.bp.a.fi(this.tml)) {
      this.tmq.setTextSize(0, com.tencent.mm.bp.a.ae(this.tml, a.e.ActionBarTextSize) * com.tencent.mm.bp.a.fg(this.tml));
    }
    updateDescription(paramCharSequence.toString());
  }
  
  public final void U(Activity paramActivity)
  {
    if ((this.mActionBar != null) && (!noActionBar()))
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "onCreate, after");
      if (this.tgp == 0) {
        this.tgp = cqm();
      }
      this.mQO = an.Ec(this.tgp);
      lF(this.tgp);
      this.mActionBar.setLogo(new ColorDrawable(this.tml.getResources().getColor(17170445)));
      this.mActionBar.da();
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      this.mActionBar.cZ();
      this.mActionBar.db();
      this.mActionBar.setIcon(a.f.transparent_background);
      if (this.tmF != -1) {
        break label316;
      }
      this.mActionBar.setCustomView(y.gq(this.tml).inflate(this.tmD, new LinearLayout(this.tml), false));
      this.tmq = ((TextView)findViewById(16908308));
      this.tmu = ((TextView)findViewById(16908309));
      this.tmr = findViewById(a.g.title_ll);
      this.tms = findViewById(a.g.actionbar_up_indicator);
      this.tmt = ((ImageView)findViewById(a.g.actionbar_up_indicator_btn));
      if (this.tmt != null) {
        this.tmt.setContentDescription(this.tml.getString(a.k.app_back));
      }
      if (this.tmq != null) {
        this.tmq.setText(a.k.app_name);
      }
      if (paramActivity.getClass().getName() != "WebViewUI") {
        break label352;
      }
      if (this.tmt != null) {
        this.tmt.setVisibility(0);
      }
      if (this.tms != null) {
        this.tms.setVisibility(0);
      }
    }
    for (;;)
    {
      cqs();
      return;
      label316:
      this.mActionBar.setCustomView(y.gq(this.tml).inflate(this.tmF, new LinearLayout(this.tml), false));
      break;
      label352:
      if ((paramActivity instanceof MMActivity))
      {
        if (this.tmt != null) {
          this.tmt.setVisibility(0);
        }
        if (this.tms != null) {
          this.tms.setVisibility(0);
        }
        if (this.tmq != null) {
          this.tmq.setVisibility(0);
        }
      }
      else
      {
        if (this.tmt != null) {
          this.tmt.setVisibility(8);
        }
        if (this.tms != null) {
          this.tms.setVisibility(8);
        }
      }
    }
  }
  
  final void a(int paramInt1, int paramInt2, String paramString, boolean paramBoolean, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt3)
  {
    a locala = new a();
    locala.tgH = paramInt1;
    locala.tgI = paramInt2;
    locala.text = paramString;
    locala.eOJ = paramOnMenuItemClickListener;
    locala.jcS = paramOnLongClickListener;
    locala.tmU = paramInt3;
    locala.tmV = paramBoolean;
    if ((locala.tgI == a.f.mm_title_btn_menu) && (bi.oW(paramString))) {
      locala.text = this.mContext.getString(a.k.app_more);
    }
    DP(locala.tgH);
    this.tgz.add(locala);
    supportInvalidateOptionsMenu();
  }
  
  public final void a(int paramInt, String paramString, Drawable paramDrawable, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    int i = b.tmW;
    a locala = new a();
    locala.tgH = paramInt;
    locala.tmT = paramDrawable;
    locala.text = paramString;
    locala.eOJ = paramOnMenuItemClickListener;
    locala.jcS = null;
    locala.tmU = i;
    DP(locala.tgH);
    this.tgz.add(locala);
    new ag().postDelayed(new Runnable()
    {
      public final void run()
      {
        s.this.supportInvalidateOptionsMenu();
      }
    }, 200L);
  }
  
  public final void a(Context paramContext, ActionBarActivity paramActionBarActivity)
  {
    this.mContext = paramActionBarActivity;
    this.tml = paramActionBarActivity;
    boolean bool1 = ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar_init", false);
    boolean bool2 = ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false);
    if ((!bool1) && (!bool2))
    {
      ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).edit().putBoolean("dark_actionbar", true).commit();
      ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).edit().putBoolean("dark_actionbar_init", true).commit();
    }
    onCreateBeforeSetContentView();
    this.className = getClass().getName();
    ai.ba(3, this.className);
    initLanguage(paramContext);
    this.eoL = ((AudioManager)this.mContext.getSystemService("audio"));
    int i = getLayoutId();
    this.eMa = LayoutInflater.from(this.mContext);
    this.contentView = com.tencent.mm.kiss.a.b.EY().a(paramActionBarActivity, "R.layout.mm_activity", a.h.mm_activity);
    this.tlW = this.contentView.findViewById(a.g.mm_trans_layer);
    this.tma = ((FrameLayout)this.contentView.findViewById(a.g.mm_content_fl));
    this.jCR = this.mContext.getResources().getDimensionPixelSize(a.e.SmallBtnPadding);
    label494:
    label618:
    long l;
    String str;
    if (i != -1)
    {
      this.tlX = getLayoutView();
      if (this.tlX == null)
      {
        this.tlX = this.eMa.inflate(getLayoutId(), null);
        this.tma.addView(this.tlX, 0);
      }
    }
    else
    {
      dealContentView(this.contentView);
      if (cpZ())
      {
        ak.d(ak.a(this.tml.getWindow(), this.tlX), this.tlX);
        ((ViewGroup)this.tlX.getParent()).removeView(this.tlX);
        ((ViewGroup)this.tml.getWindow().getDecorView()).addView(this.tlX, 0);
        int j = com.tencent.mm.bp.a.fromDPToPix(this.mContext, 25);
        paramContext = this.mContext.getResources().getDisplayMetrics();
        if (paramContext.widthPixels <= paramContext.heightPixels) {
          break label870;
        }
        i = this.mContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightLand);
        this.tlX.setPadding(this.tlX.getPaddingLeft(), i + (j + this.tlX.getPaddingTop()), this.tlX.getPaddingRight(), this.tlX.getPaddingBottom());
      }
      this.mActionBar = getSupportActionBar();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "onCreate, before.");
      U(paramActionBarActivity);
      this.tmy = ap.ae(this.mContext, a.e.DefaultActionbarHeightPort);
      this.tmz = ap.ae(this.mContext, a.e.SmallActionbarHeight);
      if ((this.tma == null) || (!(this.tma instanceof LayoutListenerView))) {
        break label887;
      }
      ((LayoutListenerView)this.tma).setOnResizedListener(new LayoutListenerView.c()
      {
        private final int tmQ = com.tencent.mm.bp.a.fromDPToPix(s.c(s.this), 100);
        
        public final void onSizeChanged(int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3, int paramAnonymousInt4)
        {
          if (s.f(s.this)) {}
          do
          {
            do
            {
              return;
            } while ((paramAnonymousInt1 == 0) || (paramAnonymousInt2 == 0) || (paramAnonymousInt3 == 0) || (paramAnonymousInt4 == 0) || (paramAnonymousInt1 != paramAnonymousInt3));
            if ((paramAnonymousInt2 > paramAnonymousInt4) && (paramAnonymousInt2 - paramAnonymousInt4 > this.tmQ))
            {
              s.g(s.this);
              return;
            }
          } while ((paramAnonymousInt4 <= paramAnonymousInt2) || (paramAnonymousInt4 - paramAnonymousInt2 <= this.tmQ));
          s.h(s.this);
        }
      });
      paramContext = new ah();
      paramContext.bHy.type = 2;
      paramContext.bHy.position = this.tmA;
      com.tencent.mm.sdk.b.a.sFg.m(paramContext);
      if (paramContext.bHz.bHC == 2)
      {
        l = System.currentTimeMillis();
        str = paramContext.bHz.bHF;
        i = paramContext.bHz.position;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position[%d], noticeId[%s] stack[%s]", new Object[] { Integer.valueOf(i), str, bi.cjd() });
        if ((i <= 0) || (i == this.tmA)) {
          break label898;
        }
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onCreate position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.tmA) });
      }
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.INIT", "KEVIN MMActivity onCreate initNotifyView:" + (System.currentTimeMillis() - l));
      if (Build.VERSION.SDK_INT >= 21)
      {
        if (this.tgp == 0) {
          this.tgp = cqm();
        }
        paramContext = paramActionBarActivity.getWindow();
        paramContext.clearFlags(201326592);
        paramContext.addFlags(Integer.MIN_VALUE);
        k(paramActionBarActivity, this.tgp);
        cqt();
      }
      return;
      if (this.tlX.getParent() == null) {
        break;
      }
      ((ViewGroup)this.tlX.getParent()).removeView(this.tlX);
      break;
      label870:
      i = this.mContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightPort);
      break label494;
      label887:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "layoutListenerView is not right");
      break label618;
      label898:
      a(paramContext.bHz.bHE, paramContext.bHz.YN, paramContext.bHz.url, paramContext.bHz.desc, str, i, true);
    }
  }
  
  public final void aB(float paramFloat)
  {
    if (this.tms != null)
    {
      this.tms.setAlpha(paramFloat);
      if (paramFloat != 0.0F) {
        break label59;
      }
      this.tms.setEnabled(false);
    }
    for (;;)
    {
      if (this.tgq != null)
      {
        this.tgq.setAlpha(paramFloat);
        if (paramFloat != 0.0F) {
          break;
        }
        this.tgq.setEnabled(false);
      }
      return;
      label59:
      this.tms.setEnabled(true);
    }
    this.tgq.setEnabled(true);
  }
  
  protected abstract String aYS();
  
  public final void activateBroadcast(boolean paramBoolean)
  {
    if ((!tmo) && (paramBoolean))
    {
      com.tencent.mm.ui.base.x.b(paramBoolean, new Intent().putExtra("classname", getClassName()).putExtra("main_process", false));
      return;
    }
    com.tencent.mm.ui.base.x.b(paramBoolean, new Intent().putExtra("classname", getClassName() + aYS()));
  }
  
  public final void addDialog(Dialog paramDialog)
  {
    if (paramDialog == null) {
      return;
    }
    if (this.tmp == null) {
      this.tmp = new ArrayList();
    }
    this.tmp.add(paramDialog);
  }
  
  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), false, paramOnMenuItemClickListener, null, b.tmW);
  }
  
  public final void addIconOptionMenu(int paramInt1, int paramInt2, int paramInt3, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a(paramInt1, paramInt3, this.mContext.getString(paramInt2), false, paramOnMenuItemClickListener, paramOnLongClickListener, b.tmW);
  }
  
  public final void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt2, "", false, paramOnMenuItemClickListener, null, b.tmW);
  }
  
  public final void addIconOptionMenu(int paramInt1, String paramString, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt1, paramInt2, paramString, false, paramOnMenuItemClickListener, null, b.tmW);
  }
  
  public final void addSearchMenu(boolean paramBoolean, o paramo)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "add search menu");
    a locala = new a();
    locala.tgH = a.g.menu_search;
    locala.text = this.mContext.getString(a.k.app_search);
    locala.tgI = a.j.actionbar_icon_dark_search;
    locala.eOJ = null;
    locala.jcS = null;
    removeOptionMenu(locala.tgH);
    this.tgz.add(0, locala);
    this.tmm = paramBoolean;
    this.eMS = paramo;
    supportInvalidateOptionsMenu();
  }
  
  public final void addTextOptionMenu(int paramInt, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    a(paramInt, 0, paramString, false, paramOnMenuItemClickListener, null, b.tmW);
  }
  
  public final void addTextOptionMenu$7df2a0ca(int paramInt1, String paramString, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener, int paramInt2)
  {
    a(paramInt1, 0, paramString, false, paramOnMenuItemClickListener, paramOnLongClickListener, paramInt2);
  }
  
  public final void ak(int paramInt, boolean paramBoolean)
  {
    this.tmA = paramInt;
    this.tmB = paramBoolean;
  }
  
  final void c(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    Iterator localIterator;
    boolean bool;
    a locala;
    if (paramBoolean1)
    {
      localIterator = this.tgz.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!localIterator.hasNext()) {
        break label125;
      }
      locala = (a)localIterator.next();
      if (locala.bKe == paramBoolean2) {
        break label191;
      }
      locala.bKe = paramBoolean2;
      paramBoolean1 = true;
    }
    label125:
    label188:
    label191:
    for (;;)
    {
      break;
      localIterator = this.tgz.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if ((locala.tgH != paramInt) || (locala.bKe == paramBoolean2)) {
          break label188;
        }
        locala.bKe = paramBoolean2;
        paramBoolean1 = true;
      }
      for (;;)
      {
        break;
        if (this.eMS == null) {}
        for (paramBoolean1 = false;; paramBoolean1 = this.eMS.uBr)
        {
          if (!paramBoolean1) {
            supportInvalidateOptionsMenu();
          }
          com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "enable option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          return;
        }
      }
    }
  }
  
  public final boolean callBackMenu()
  {
    if ((this.tmn != null) && (this.tmn.bKe))
    {
      a(null, this.tmn);
      return true;
    }
    return false;
  }
  
  protected abstract boolean cpZ();
  
  public final int cqm()
  {
    boolean bool = ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false);
    this.mQO = bool;
    if (this.tgp == 0) {
      if (!bool) {
        break label77;
      }
    }
    label77:
    for (this.tgp = this.mContext.getResources().getColor(a.d.dark_actionbar_color);; this.tgp = this.mContext.getResources().getColor(a.d.normal_actionbar_color)) {
      return this.tgp;
    }
  }
  
  public final void cqo()
  {
    if (this.mActionBar != null) {
      this.mActionBar.hide();
    }
    this.msM.removeCallbacks(this.tmL);
    this.msM.removeCallbacks(this.tmK);
    this.msM.postDelayed(this.tmK, 0L);
  }
  
  final void cqr()
  {
    Object localObject1 = "%s";
    int n = this.mContext.getResources().getDimensionPixelSize(a.e.ActionBarTextSize);
    if (this.tmd != 0) {
      localObject1 = "# " + "%s";
    }
    if (this.tme != 0) {
      localObject1 = (String)localObject1 + " #";
    }
    for (int i = 1;; i = 0)
    {
      if (this.tmj)
      {
        localObject1 = (String)localObject1 + " #";
        i += 2;
      }
      for (int j = 1;; j = 0)
      {
        int m;
        int k;
        if (this.tmk)
        {
          localObject1 = (String)localObject1 + " #";
          j += 2;
          m = 1;
          k = i + 2;
        }
        for (i = m;; i = m)
        {
          Object localObject2 = String.format((String)localObject1, new Object[] { this.tmc });
          com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "span title format %s", new Object[] { localObject1 });
          localObject1 = com.tencent.mm.ui.e.c.b.c((CharSequence)localObject2, n);
          if ((localObject1 instanceof SpannableString))
          {
            localObject2 = (SpannableString)localObject1;
            if (this.tmd != 0) {
              ((SpannableString)localObject2).setSpan(this.tmf, 0, 1, 33);
            }
            if (this.tme != 0)
            {
              k = ((SpannableString)localObject2).length() - k;
              ((SpannableString)localObject2).setSpan(this.tmg, k, k + 1, 33);
            }
            if (this.tmj)
            {
              if (this.tmh == null) {
                this.tmh = eK(n, a.j.chat_mute_notify_title_icon);
              }
              j = ((SpannableString)localObject2).length() - j;
              ((SpannableString)localObject2).setSpan(this.tmh, j, j + 1, 33);
            }
            if (this.tmk)
            {
              if (this.tmi == null) {
                this.tmi = eK(n, a.j.chat_phone_notify_title_icon);
              }
              i = ((SpannableString)localObject2).length() - i;
              ((SpannableString)localObject2).setSpan(this.tmi, i, i + 1, 33);
            }
          }
          this.tmq.setText((CharSequence)localObject1);
          return;
          m = 0;
          k = i;
        }
      }
    }
  }
  
  final void cqs()
  {
    if (this.mQO)
    {
      if (this.tmt != null)
      {
        this.tmt.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        this.tms.setBackgroundResource(a.f.selected_bg_dark);
      }
      if ((this.tmq != null) && (this.tmq.getVisibility() == 0)) {
        this.tmq.setTextColor(this.mContext.getResources().getColor(a.d.white_text_color));
      }
      if ((this.tmu != null) && (this.tmu.getVisibility() == 0)) {
        this.tmu.setTextColor(this.mContext.getResources().getColor(a.d.white_text_color));
      }
      if ((this.tgq != null) && (this.tgq.getVisibility() == 0)) {
        if (this.tgq.getDrawable() != null) {
          this.tgq.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        }
      }
    }
    do
    {
      do
      {
        return;
        this.tgq.setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
        return;
      } while ((this.tgs == null) || (this.tgs.getVisibility() != 0));
      this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.mContext, a.d.white_text_color_selector));
      return;
      if (this.tmt != null)
      {
        this.tmt.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        this.tms.setBackgroundResource(a.f.actionbar_menu_selector);
      }
      if ((this.tmq != null) && (this.tmq.getVisibility() == 0)) {
        this.tmq.setTextColor(this.mContext.getResources().getColor(a.d.black_text_color));
      }
      if ((this.tmu != null) && (this.tmu.getVisibility() == 0)) {
        this.tmu.setTextColor(this.mContext.getResources().getColor(a.d.black_text_color));
      }
      if ((this.tgq != null) && (this.tgq.getVisibility() == 0))
      {
        if (this.tgq.getDrawable() != null)
        {
          this.tgq.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
          return;
        }
        this.tgq.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
        return;
      }
    } while ((this.tgs == null) || (this.tgs.getVisibility() != 0));
    this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.mContext, a.d.black_text_color_selector));
  }
  
  final void cqt()
  {
    View localView;
    int i;
    if (Build.VERSION.SDK_INT >= 23)
    {
      localView = this.tml.getWindow().getDecorView();
      i = localView.getSystemUiVisibility();
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "dancy test actionbar isDark:%s", new Object[] { Boolean.valueOf(this.mQO) });
      if (!this.mQO) {
        break label65;
      }
      i &= 0xDFFF;
    }
    for (;;)
    {
      localView.setSystemUiVisibility(i);
      return;
      label65:
      i |= 0x2000;
    }
  }
  
  final void d(boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    Iterator localIterator;
    boolean bool;
    a locala;
    if (paramBoolean1)
    {
      localIterator = this.tgz.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (!localIterator.hasNext()) {
        break label125;
      }
      locala = (a)localIterator.next();
      if (locala.YN == paramBoolean2) {
        break label196;
      }
      locala.YN = paramBoolean2;
      paramBoolean1 = true;
    }
    label125:
    label193:
    label196:
    for (;;)
    {
      break;
      localIterator = this.tgz.iterator();
      paramBoolean1 = false;
      bool = paramBoolean1;
      if (localIterator.hasNext())
      {
        locala = (a)localIterator.next();
        if ((locala.tgH != paramInt) || (locala.YN == paramBoolean2)) {
          break label193;
        }
        locala.YN = paramBoolean2;
        paramBoolean1 = true;
      }
      for (;;)
      {
        break;
        if (this.eMS == null) {}
        for (paramBoolean1 = false;; paramBoolean1 = this.eMS.uBr)
        {
          if ((bool) && (!paramBoolean1)) {
            supportInvalidateOptionsMenu();
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "show option menu, target id %d, changed %B, searching %B", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool), Boolean.valueOf(paramBoolean1) });
          return;
        }
      }
    }
  }
  
  protected abstract void dealContentView(View paramView);
  
  public final void enableBackMenu(boolean paramBoolean)
  {
    if (this.tmn == null) {}
    while (this.tmn.bKe == paramBoolean) {
      return;
    }
    this.tmn.bKe = paramBoolean;
    supportInvalidateOptionsMenu();
  }
  
  public final void fullScreenNoTitleBar(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      if (this.mActionBar != null) {
        this.mActionBar.hide();
      }
      this.msM.removeCallbacks(this.tmL);
      this.msM.removeCallbacks(this.tmK);
      this.msM.postDelayed(this.tmK, 256L);
      return;
    }
    this.tml.getWindow().clearFlags(1024);
    this.msM.removeCallbacks(this.tmK);
    this.msM.removeCallbacks(this.tmL);
    this.msM.postDelayed(this.tmL, 256L);
  }
  
  protected abstract String getClassName();
  
  public final boolean getLandscapeMode()
  {
    return this.tlM;
  }
  
  protected abstract int getLayoutId();
  
  protected abstract View getLayoutView();
  
  public final CharSequence getMMTitle()
  {
    if (this.mActionBar == null) {
      return null;
    }
    if (this.tmc != null) {
      return this.tmc;
    }
    return this.mActionBar.getTitle();
  }
  
  public ActionBar getSupportActionBar()
  {
    return this.tml.getSupportActionBar();
  }
  
  public final int getTitleLocation()
  {
    if (this.mActionBar == null) {
      return 0;
    }
    return this.mActionBar.getHeight();
  }
  
  public final void hideTitleView()
  {
    boolean bool = true;
    if (this.mActionBar != null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "hideTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.mActionBar != null) {
        break;
      }
      return;
      bool = false;
    }
    this.mActionBar.hide();
  }
  
  public final boolean hideVKB()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
    if (localInputMethodManager == null) {}
    Object localObject;
    do
    {
      do
      {
        return false;
        localObject = this.tml.getCurrentFocus();
      } while (localObject == null);
      localObject = ((View)localObject).getWindowToken();
    } while (localObject == null);
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow((IBinder)localObject, 0);
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "hide VKB result %B", new Object[] { Boolean.valueOf(bool) });
      return bool;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMActivityController", "hide VKB exception %s", new Object[] { localIllegalArgumentException });
        boolean bool = false;
      }
    }
  }
  
  public final boolean hideVKB(View paramView)
  {
    if (paramView == null) {}
    InputMethodManager localInputMethodManager;
    do
    {
      do
      {
        return false;
        localInputMethodManager = (InputMethodManager)this.mContext.getSystemService("input_method");
      } while (localInputMethodManager == null);
      paramView = paramView.getWindowToken();
    } while (paramView == null);
    try
    {
      bool = localInputMethodManager.hideSoftInputFromWindow(paramView, 0);
      return bool;
    }
    catch (IllegalArgumentException paramView)
    {
      for (;;)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMActivityController", "hide VKB(View) exception %s", new Object[] { paramView });
        boolean bool = false;
      }
    }
  }
  
  public boolean interceptSupportInvalidateOptionsMenu()
  {
    return false;
  }
  
  public final boolean isTitleShowing()
  {
    boolean bool = true;
    if (this.mActionBar != null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "isTitleShowing hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.mActionBar != null) {
        break;
      }
      return false;
      bool = false;
    }
    return this.mActionBar.isShowing();
  }
  
  public final void lF(int paramInt)
  {
    if (this.mActionBar == null) {
      return;
    }
    this.tgp = paramInt;
    this.mQO = an.Ec(this.tgp);
    this.mActionBar.setBackgroundDrawable(new ColorDrawable(this.tgp));
    k(this.tml, this.tgp);
    cqt();
    cqs();
  }
  
  public boolean needShowIdcError()
  {
    return true;
  }
  
  public boolean noActionBar()
  {
    return false;
  }
  
  protected abstract void onCreateBeforeSetContentView();
  
  public final boolean onCreateOptionsMenu(Menu paramMenu)
  {
    boolean bool2 = true;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "on create option menu, menuCache size:%d", new Object[] { Integer.valueOf(this.tgz.size()) });
    boolean bool1;
    if ((this.mActionBar == null) || (this.tgz.size() == 0))
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "error, mActionBar is null or cache size:%d", new Object[] { Integer.valueOf(this.tgz.size()) });
      bool1 = false;
      return bool1;
    }
    this.tmI = null;
    this.tmJ = null;
    Object localObject1;
    if (this.mActionBar.getHeight() == 0)
    {
      localObject1 = this.mContext.getResources().getDisplayMetrics();
      if (((DisplayMetrics)localObject1).widthPixels <= ((DisplayMetrics)localObject1).heightPixels) {
        break label187;
      }
      this.mContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightLand);
    }
    final a locala;
    for (;;)
    {
      localObject1 = this.tgz.iterator();
      for (;;)
      {
        bool1 = bool2;
        if (!((Iterator)localObject1).hasNext()) {
          break;
        }
        locala = (a)((Iterator)localObject1).next();
        if (locala.tgH != 16908332) {
          break label204;
        }
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "match back option menu, continue");
      }
      label187:
      this.mContext.getResources().getDimensionPixelSize(a.e.DefaultActionbarHeightPort);
    }
    label204:
    if (locala.tgH == a.g.menu_search)
    {
      boolean bool3 = this.tmm;
      if (this.eMS == null) {}
      for (bool1 = true;; bool1 = false)
      {
        com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "match search menu, enable search view[%B], search view helper is null[%B]", new Object[] { Boolean.valueOf(bool3), Boolean.valueOf(bool1) });
        if ((!this.tmm) || (this.eMS == null)) {
          break;
        }
        this.eMS.a(this.tml, paramMenu);
        break;
      }
    }
    final MenuItem localMenuItem = paramMenu.add(0, locala.tgH, 0, locala.text);
    Object localObject2 = getClass().getName();
    label334:
    View.OnLongClickListener local13;
    if (localMenuItem == null)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MenuItemUtil", "fixTitleCondensed fail, item is null");
      localObject2 = new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          s.a(s.this, localMenuItem, locala);
        }
      };
      local13 = new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          return s.a(s.this, paramAnonymousView, locala);
        }
      };
      if ((locala.tgI == 0) && (locala.tmT == null)) {
        break label930;
      }
      if (locala.tgK == null) {
        locala.tgK = View.inflate(this.mContext, a.h.action_option_view, null);
      }
      ImageView localImageView = (ImageView)locala.tgK.findViewById(a.g.divider);
      if (localImageView != null) {
        localImageView.setVisibility(8);
      }
      this.tgq = ((ImageButton)locala.tgK.findViewById(a.g.action_option_icon));
      this.tgq.setVisibility(0);
      if (locala.tmT == null) {
        break label840;
      }
      this.tgq.setImageDrawable(locala.tmT);
      label474:
      if (!this.mQO) {
        break label872;
      }
      if (this.tmv == 0) {
        break label855;
      }
      this.tgq.getDrawable().setColorFilter(this.tmv, PorterDuff.Mode.SRC_ATOP);
      label505:
      this.tgq.setOnClickListener((View.OnClickListener)localObject2);
      this.tgq.setEnabled(locala.bKe);
      this.tgq.setContentDescription(locala.text);
      if (locala.jcS != null) {
        this.tgq.setOnLongClickListener(local13);
      }
      this.tmw = ((ImageView)locala.tgK.findViewById(a.g.dot_iv));
      if (this.tmw != null)
      {
        if (!locala.tmV) {
          break label918;
        }
        this.tmw.setVisibility(0);
      }
    }
    for (;;)
    {
      m.a(localMenuItem, locala.tgK);
      localMenuItem.setEnabled(locala.bKe);
      localMenuItem.setVisible(locala.YN);
      m.a(localMenuItem, 2);
      if (locala.tgI == a.f.mm_title_btn_menu)
      {
        this.tmI = locala;
        this.tmJ = localMenuItem;
      }
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "set %d %s option menu enable %B, visible %B", new Object[] { Integer.valueOf(locala.tgH), locala.text, Boolean.valueOf(locala.bKe), Boolean.valueOf(locala.YN) });
      break;
      if (localMenuItem.getTitleCondensed() == null)
      {
        com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MenuItemUtil", "%s title condensed is null, fix it", new Object[] { localObject2 });
        localMenuItem.setTitleCondensed("");
        break label334;
      }
      if ((localMenuItem.getTitleCondensed() instanceof String)) {
        break label334;
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MenuItemUtil", "%s title condensed is not String type, cur type[%s], cur value[%s], fix it", new Object[] { localObject2, localMenuItem.getTitleCondensed().getClass().getName(), localMenuItem.getTitleCondensed() });
      localMenuItem.setTitleCondensed(localMenuItem.getTitleCondensed().toString());
      break label334;
      label840:
      this.tgq.setImageResource(locala.tgI);
      break label474;
      label855:
      this.tgq.getDrawable().setColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
      break label505;
      label872:
      if (this.tmv != 0)
      {
        this.tgq.getDrawable().setColorFilter(this.tmv, PorterDuff.Mode.SRC_ATOP);
        break label505;
      }
      this.tgq.getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      break label505;
      label918:
      this.tmw.setVisibility(8);
    }
    label930:
    if (locala.tgJ == null) {
      locala.tgJ = View.inflate(this.mContext, a.h.action_option_view, null);
    }
    this.tgs = ((TextView)locala.tgJ.findViewById(a.g.action_option_text));
    this.tgs.setVisibility(0);
    if ((locala.tmU == b.tmY) || (locala.tmU == b.tnb)) {
      this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.tml, a.d.red_text_color_selector));
    }
    for (;;)
    {
      this.tgs.setText(locala.text);
      if (locala.textColor != 0) {
        this.tgs.setTextColor(locala.textColor);
      }
      this.tgs.setOnClickListener((View.OnClickListener)localObject2);
      this.tgs.setOnLongClickListener(local13);
      this.tgs.setEnabled(locala.bKe);
      m.a(localMenuItem, locala.tgJ);
      break;
      if ((locala.tmU == b.tmX) || (locala.tmU == b.tnc))
      {
        this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.tml, a.d.green_text_color_selector));
      }
      else
      {
        if (locala.tmU != b.tmZ)
        {
          if (locala.tmU == b.tne)
          {
            this.tgs.setTextColor(this.tml.getResources().getColor(a.d.lucky_money_goldstyle_text_color));
            continue;
          }
          if (locala.tmU == b.tnd)
          {
            this.tgs.setTextColor(-2601405);
            continue;
          }
          if (this.tmv != 0)
          {
            this.tgs.setTextColor(this.tmv);
            continue;
          }
          if (this.mQO)
          {
            this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.tml, a.d.white_text_color_selector));
            continue;
          }
        }
        this.tgs.setTextColor(com.tencent.mm.bp.a.ac(this.tml, a.d.black_text_color_selector));
      }
    }
  }
  
  public final void onDestroy()
  {
    if (this.tmp != null)
    {
      int j = this.tmp.size();
      int i = 0;
      while (i < j)
      {
        Dialog localDialog = (Dialog)this.tmp.get(i);
        if ((localDialog != null) && (localDialog.isShowing())) {
          localDialog.dismiss();
        }
        i += 1;
      }
      this.tmp.clear();
      this.tmp = null;
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool2 = false;
    f.yD();
    f.yD();
    boolean bool1 = bool2;
    if (this.tmm)
    {
      bool1 = bool2;
      if (this.eMS != null)
      {
        bool1 = bool2;
        if (this.eMS.onKeyDown(paramInt, paramKeyEvent))
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "match search view on key down");
          if (!ad.getContext().getSharedPreferences(ad.chY() + "_redesign", 4).getBoolean("dark_actionbar", false)) {
            break label116;
          }
          lF(this.tml.getResources().getColor(a.d.dark_actionbar_color));
        }
      }
    }
    for (;;)
    {
      bool1 = true;
      return bool1;
      label116:
      lF(this.tml.getResources().getColor(a.d.normal_actionbar_color));
    }
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
    {
      if ((this.tmI != null) && (this.tmI.bKe)) {
        a(this.tmJ, this.tmI);
      }
      return true;
    }
    return false;
  }
  
  public abstract void onKeyboardStateChanged();
  
  public final boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "on options item selected");
    if (!this.tmb)
    {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "onOptionsItemSelected screen not enable.");
      return true;
    }
    if ((paramMenuItem.getItemId() == this.tmn.tgH) && (this.tmn.bKe))
    {
      a(paramMenuItem, this.tmn);
      return true;
    }
    Iterator localIterator = this.tgz.iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (paramMenuItem.getItemId() == locala.tgH)
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "on option menu %d click", new Object[] { Integer.valueOf(paramMenuItem.getItemId()) });
        a(paramMenuItem, locala);
        return true;
      }
    }
    return false;
  }
  
  public final void onPause()
  {
    activateBroadcast(false);
    com.tencent.mm.sdk.b.a.sFg.c(this.tmC);
  }
  
  public final boolean onPrepareOptionsMenu(Menu paramMenu)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "on prepare option menu");
    if ((this.tmm) && (this.eMS != null)) {
      this.eMS.a(this.tml, paramMenu);
    }
    return true;
  }
  
  public final void onResume()
  {
    activateBroadcast(true);
    com.tencent.mm.sdk.b.a.sFg.b(this.tmC);
    ah localah = new ah();
    localah.bHy.type = 2;
    localah.bHy.position = this.tmA;
    com.tencent.mm.sdk.b.a.sFg.m(localah);
    long l;
    String str;
    int i;
    if (localah.bHz.bHC == 2)
    {
      l = System.currentTimeMillis();
      str = localah.bHz.bHF;
      i = localah.bHz.position;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position[%d], noticeId[%s]", new Object[] { Integer.valueOf(i), str });
      if ((i <= 0) || (i == this.tmA)) {
        break label183;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "summerdiz E_BR_SHOWTYPE_TXTSTRIPE onResume position not match[%d, %d] ignore display", new Object[] { Integer.valueOf(i), Integer.valueOf(this.tmA) });
    }
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.INIT", "KEVIN MMActivity onResume initNotifyView:" + (System.currentTimeMillis() - l));
      return;
      label183:
      a(localah.bHz.bHE, localah.bHz.YN, localah.bHz.url, localah.bHz.desc, str, i, true);
    }
  }
  
  public final void onStart()
  {
    this.tlM = this.mContext.getSharedPreferences(ad.chY(), 0).getBoolean("settings_landscape_mode", false);
    if (this.tlM)
    {
      this.tml.setRequestedOrientation(-1);
      return;
    }
    this.tml.setRequestedOrientation(1);
  }
  
  public final void removeAllOptionMenu()
  {
    if (this.tgz.isEmpty()) {
      return;
    }
    this.tgz.clear();
    supportInvalidateOptionsMenu();
  }
  
  public final boolean removeOptionMenu(int paramInt)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.tgz.size())
      {
        if (((a)this.tgz.get(i)).tgH == paramInt)
        {
          com.tencent.mm.sdk.platformtools.x.d("MicroMsg.MMActivityController", "match menu, id %d, remove it", new Object[] { Integer.valueOf(paramInt) });
          this.tgz.remove(i);
          supportInvalidateOptionsMenu();
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public final void setBackBtn(final MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    if (this.mActionBar == null) {
      return;
    }
    if (paramOnMenuItemClickListener == null) {
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
    }
    for (;;)
    {
      int i = paramInt;
      if (paramInt == 0) {
        i = a.j.actionbar_icon_dark_back;
      }
      if ((this.tmt != null) && (i != 0)) {
        this.tmt.setImageResource(i);
      }
      this.tmn.tgH = 16908332;
      this.tmn.eOJ = paramOnMenuItemClickListener;
      return;
      this.mActionBar.setDisplayHomeAsUpEnabled(false);
      if (this.tms != null) {
        this.tms.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            paramOnMenuItemClickListener.onMenuItemClick(null);
          }
        });
      }
    }
  }
  
  public final void setBackGroundColorResource(int paramInt)
  {
    if (this.contentView == null) {
      return;
    }
    if (this.tma == null) {
      this.tma = ((FrameLayout)this.contentView.findViewById(a.g.mm_content_fl));
    }
    this.tma.setBackgroundResource(paramInt);
    this.tlX.setBackgroundResource(paramInt);
  }
  
  public final void setMMSubTitle(int paramInt)
  {
    if (this.mActionBar == null) {
      return;
    }
    this.tmu.setText(this.mContext.getString(paramInt));
    if (com.tencent.mm.bp.a.fi(this.tml))
    {
      this.tmu.setTextSize(1, 14.0F);
      this.tmq.setTextSize(1, 18.0F);
    }
    this.tmu.setVisibility(0);
    updateDescription(this.mContext.getString(paramInt));
  }
  
  public final void setMMSubTitle(String paramString)
  {
    if (this.mActionBar == null) {
      return;
    }
    if (paramString == null)
    {
      this.tmu.setVisibility(8);
      return;
    }
    this.tmu.setText(paramString);
    if (com.tencent.mm.bp.a.fi(this.tml))
    {
      this.tmu.setTextSize(1, 14.0F);
      this.tmq.setTextSize(1, 18.0F);
    }
    this.tmu.setVisibility(0);
    updateDescription(paramString);
  }
  
  public final void setMMTitle(int paramInt)
  {
    setMMTitle(this.mContext.getString(paramInt));
  }
  
  public final void setMMTitle(String paramString)
  {
    if (this.mActionBar == null) {
      return;
    }
    this.tmc = paramString;
    if (com.tencent.mm.bp.a.fi(this.tml)) {
      this.tmq.setTextSize(0, com.tencent.mm.bp.a.ae(this.tml, a.e.ActionBarTextSize) * com.tencent.mm.bp.a.fg(this.tml));
    }
    cqr();
    updateDescription(paramString);
  }
  
  public final void setScreenEnable(boolean paramBoolean)
  {
    boolean bool2 = true;
    this.tmb = paramBoolean;
    if ((this.tlW == null) && (this.contentView != null)) {
      this.tlW = this.contentView.findViewById(a.g.mm_trans_layer);
    }
    if (this.tlW == null)
    {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.MMActivityController", "jacks error npe translayer !");
      return;
    }
    ??? = this.tlW;
    boolean bool1;
    label81:
    ActionBarActivity localActionBarActivity;
    if (!paramBoolean)
    {
      bool1 = true;
      ((View)???).setFocusable(bool1);
      ??? = this.tlW;
      if (paramBoolean) {
        break label199;
      }
      bool1 = bool2;
      ((View)???).setFocusableInTouchMode(bool1);
      if (paramBoolean) {
        break label226;
      }
      localActionBarActivity = this.tml;
    }
    for (;;)
    {
      synchronized (tmH)
      {
        if (wakeLock == null) {
          wakeLock = ((PowerManager)localActionBarActivity.getSystemService("power")).newWakeLock(32, "screen Lock");
        }
        if (wakeLock.isHeld()) {
          break label204;
        }
        wakeLock.acquire();
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "after acquire screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
        return;
      }
      bool1 = false;
      break;
      label199:
      bool1 = false;
      break label81;
      label204:
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "repeatedly acquire screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
    }
    for (;;)
    {
      synchronized (tmH)
      {
        label226:
        if ((wakeLock != null) && (wakeLock.isHeld()))
        {
          wakeLock.release();
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.MMActivityController", "after release screen off wakelock from object: %s, isHeld: %s", new Object[] { toString(), Boolean.valueOf(wakeLock.isHeld()) });
          return;
        }
      }
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.MMActivityController", "repeatedly release screen off wakelock from object: %s, drop this call.", new Object[] { toString() });
    }
  }
  
  public final void setTitleBarDoubleClickListener(final Runnable paramRunnable)
  {
    if ((this.mActionBar == null) || (paramRunnable == null)) {
      return;
    }
    this.mActionBar.getCustomView().setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        if (SystemClock.elapsedRealtime() - s.k(s.this) < 300L) {
          paramRunnable.run();
        }
        s.a(s.this, SystemClock.elapsedRealtime());
      }
    });
  }
  
  public final void setTitleLogo(int paramInt1, int paramInt2)
  {
    if (this.mActionBar == null) {
      return;
    }
    if (paramInt1 == 0)
    {
      this.tmd = 0;
      this.tmf = null;
      if (paramInt2 != 0) {
        break label82;
      }
      this.tme = 0;
      this.tmg = null;
    }
    for (;;)
    {
      cqr();
      return;
      if (this.tmd == paramInt1) {
        break;
      }
      this.tmd = paramInt1;
      this.tmf = eK(this.mContext.getResources().getDimensionPixelSize(a.e.BigTextSize), this.tmd);
      break;
      label82:
      if (this.tme != paramInt2)
      {
        this.tme = paramInt2;
        this.tmg = eK(this.mContext.getResources().getDimensionPixelSize(a.e.BigTextSize), this.tme);
      }
    }
  }
  
  public final void setTitleMuteIconVisibility(int paramInt)
  {
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.tmj = bool;
      cqr();
      return;
    }
  }
  
  public final void setTitleVisibility(int paramInt)
  {
    if (this.mActionBar == null) {
      return;
    }
    if (paramInt == 0)
    {
      this.mActionBar.show();
      k(this.tml, this.tgp);
      return;
    }
    this.mActionBar.hide();
    k(this.tml, this.tml.getResources().getColor(a.d.black));
  }
  
  public final void showHomeBtn(boolean paramBoolean)
  {
    if (this.mActionBar == null) {}
    do
    {
      return;
      this.mActionBar.setDisplayHomeAsUpEnabled(paramBoolean);
    } while (this.tms == null);
    View localView = this.tms;
    if (paramBoolean) {}
    for (int i = 0;; i = 8)
    {
      localView.setVisibility(i);
      return;
    }
  }
  
  public final void showTitleView()
  {
    boolean bool = true;
    if (this.mActionBar != null) {}
    for (;;)
    {
      com.tencent.mm.sdk.platformtools.x.v("MicroMsg.MMActivityController", "showTitleView hasTitle:%b", new Object[] { Boolean.valueOf(bool) });
      if (this.mActionBar != null) {
        break;
      }
      return;
      bool = false;
    }
    this.mActionBar.show();
  }
  
  public final void showVKB()
  {
    Object localObject = this.tml;
    InputMethodManager localInputMethodManager = (InputMethodManager)((Activity)localObject).getSystemService("input_method");
    if (localInputMethodManager != null)
    {
      localObject = ((Activity)localObject).getCurrentFocus();
      if ((localObject != null) && (((View)localObject).getWindowToken() != null)) {
        localInputMethodManager.toggleSoftInput(0, 2);
      }
    }
  }
  
  public void supportInvalidateOptionsMenu()
  {
    this.tml.supportInvalidateOptionsMenu();
  }
  
  protected final void updateDescription(String paramString)
  {
    com.tencent.mm.ui.a.a locala = a.a.cqX();
    ActionBarActivity localActionBarActivity = this.tml;
    if ((locala.cqW()) || (bi.oW(paramString)) || (localActionBarActivity == null)) {
      return;
    }
    paramString = localActionBarActivity.getString(a.k.common_enter_activity) + paramString;
    localActionBarActivity.getWindow().getDecorView().setContentDescription(paramString);
  }
  
  public final void updateOptionMenuListener(int paramInt, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    a locala = DQ(paramInt);
    if (locala != null)
    {
      locala.eOJ = paramOnMenuItemClickListener;
      locala.jcS = paramOnLongClickListener;
    }
  }
  
  public final void updateOptionMenuText(int paramInt, String paramString)
  {
    a locala = DQ(paramInt);
    if ((locala != null) && (!bi.aG(paramString, "").equals(locala.text)))
    {
      locala.text = paramString;
      supportInvalidateOptionsMenu();
    }
  }
  
  public static final class a
  {
    boolean YN = true;
    boolean bKe = true;
    MenuItem.OnMenuItemClickListener eOJ;
    View.OnLongClickListener jcS;
    String text;
    int textColor;
    int tgH = -1;
    int tgI;
    View tgJ;
    View tgK;
    Drawable tmT;
    int tmU = s.b.tmW;
    boolean tmV = false;
  }
  
  public static enum b {}
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/ui/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */