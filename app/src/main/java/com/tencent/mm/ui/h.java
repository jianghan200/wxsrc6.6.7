package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.o;
import com.tencent.mm.ak.o;
import com.tencent.mm.ak.p.a;
import com.tencent.mm.g.a.gp;
import com.tencent.mm.g.a.he;
import com.tencent.mm.g.a.hs;
import com.tencent.mm.g.a.hs.a;
import com.tencent.mm.g.a.in;
import com.tencent.mm.g.a.iq;
import com.tencent.mm.g.a.iv;
import com.tencent.mm.g.a.iv.b;
import com.tencent.mm.g.a.kx;
import com.tencent.mm.g.a.me;
import com.tencent.mm.g.a.me.a;
import com.tencent.mm.g.a.nh;
import com.tencent.mm.g.a.nj;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.ou;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.g.a.pk.b;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.g.a.sa;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.model.ap;
import com.tencent.mm.model.aq;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bl;
import com.tencent.mm.model.k;
import com.tencent.mm.model.q;
import com.tencent.mm.plugin.account.bind.ui.BindMContactIntroUI;
import com.tencent.mm.plugin.account.bind.ui.MobileFriendUI;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.account.ui.FacebookFriendUI;
import com.tencent.mm.plugin.game.a.a.a;
import com.tencent.mm.plugin.sns.b.j;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.plugin.websearch.api.ac;
import com.tencent.mm.plugin.websearch.api.ac.a;
import com.tencent.mm.pluginsdk.f.f.a;
import com.tencent.mm.pluginsdk.f.f.b;
import com.tencent.mm.pluginsdk.o.a;
import com.tencent.mm.pluginsdk.o.e;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bp;
import com.tencent.mm.ui.base.preference.IconPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.PreferenceSmallCategory;
import com.tencent.mm.ui.base.s;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class h
  extends a
  implements ap, aq, j.a, m.b
{
  private boolean bQt = false;
  private long hXx;
  private com.tencent.mm.sdk.b.c<tt> jxo = new h.4(this);
  private CheckBox lBF;
  private com.tencent.mm.ui.widget.a.c lBH = null;
  private ag mHandler = new h.1(this, Looper.getMainLooper());
  private int mSF;
  com.tencent.mm.sdk.b.c nqB = new com.tencent.mm.sdk.b.c() {};
  private com.tencent.mm.pluginsdk.c.a qOz = new com.tencent.mm.pluginsdk.c.a()
  {
    public final void j(com.tencent.mm.sdk.b.b paramAnonymousb)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.FindMoreFriendsUI", "onMStorageNotifyEvent, %s ", new Object[] { paramAnonymousb });
      if ((paramAnonymousb instanceof iq)) {
        h.d(h.this);
      }
    }
  };
  private int status;
  com.tencent.mm.sdk.b.c tiA = new h.20(this);
  private com.tencent.mm.pluginsdk.c.a tiB = new h.21(this);
  private com.tencent.mm.pluginsdk.c.a tiC = new h.22(this);
  private com.tencent.mm.sdk.b.c tiD = new h.23(this);
  private com.tencent.mm.sdk.b.c<he> tiE = new h.5(this);
  p.a tiF = new h.7(this);
  private com.tencent.mm.ui.base.preference.h tig;
  private View tih;
  private boolean tii = false;
  private String tij = "";
  private int tik = 0;
  private String til = null;
  private String tim = null;
  private String tin = null;
  private String tio = null;
  private String tiq = null;
  private boolean tir = false;
  private boolean tis = false;
  private boolean tit = false;
  private boolean tiu = true;
  private int tiv;
  private View tiw;
  private TextView tix;
  private com.tencent.mm.sdk.b.c<os> tiy = new h.12(this);
  com.tencent.mm.sdk.b.c tiz = new com.tencent.mm.sdk.b.c() {};
  
  private static void a(IconPreference paramIconPreference, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5, int paramInt6)
  {
    paramIconPreference.Er(paramInt1);
    paramIconPreference.Et(paramInt2);
    paramIconPreference.Es(paramInt3);
    paramIconPreference.lN(paramBoolean);
    paramIconPreference.Ew(paramInt4);
    paramIconPreference.Ev(paramInt5);
    paramIconPreference.Ex(paramInt6);
  }
  
  private static void a(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    com.tencent.mm.kernel.g.Ek();
    Object localObject = (String)com.tencent.mm.kernel.g.Ei().DT().get(aa.a.sZb, "");
    if ((paramString2 != null) && (!paramString2.equals(localObject)))
    {
      com.tencent.mm.kernel.g.Ek();
      com.tencent.mm.kernel.g.Ei().DT().a(aa.a.sZb, paramString2);
      localObject = new nj();
      ((nj)localObject).bYp.scene = 9;
      ((nj)localObject).bYp.bYq = 901;
      ((nj)localObject).bYp.action = 1;
      ((nj)localObject).bYp.appId = paramString1;
      ((nj)localObject).bYp.msgType = paramInt1;
      ((nj)localObject).bYp.bWQ = paramString2;
      ((nj)localObject).bYp.bHF = paramString3;
      paramString1 = new JSONObject();
    }
    try
    {
      paramString1.put("function_type", "resource");
      paramString1.put("function_value", String.valueOf(paramInt2));
    }
    catch (JSONException paramString2)
    {
      try
      {
        for (;;)
        {
          paramString1 = URLEncoder.encode(paramString1.toString(), "utf-8");
          ((nj)localObject).bYp.bYr = paramString1;
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject);
          com.tencent.mm.plugin.report.service.h.mEJ.a(858L, 2L, 1L, false);
          return;
          paramString2 = paramString2;
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", paramString2.getMessage());
        }
      }
      catch (UnsupportedEncodingException paramString2)
      {
        for (;;)
        {
          paramString1 = "";
          com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", paramString2.getMessage());
        }
      }
    }
  }
  
  /* Error */
  private void a(String paramString1, IconPreference paramIconPreference, me paramme, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic 289	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   6: ifne +18 -> 24
    //   9: aload_2
    //   10: ifnull +14 -> 24
    //   13: aload_2
    //   14: getfield 444	com/tencent/mm/ui/base/preference/IconPreference:kYT	Landroid/widget/ImageView;
    //   17: astore 7
    //   19: aload 7
    //   21: ifnonnull +6 -> 27
    //   24: aload_0
    //   25: monitorexit
    //   26: return
    //   27: ldc_w 430
    //   30: ldc_w 446
    //   33: iconst_1
    //   34: anewarray 448	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_1
    //   40: aastore
    //   41: invokestatic 452	com/tencent/mm/sdk/platformtools/x:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: aload_3
    //   45: getfield 223	com/tencent/mm/g/a/me:bWO	Lcom/tencent/mm/g/a/me$a;
    //   48: getfield 228	com/tencent/mm/g/a/me$a:bWQ	Ljava/lang/String;
    //   51: astore 7
    //   53: aload_3
    //   54: getfield 223	com/tencent/mm/g/a/me:bWO	Lcom/tencent/mm/g/a/me$a;
    //   57: getfield 231	com/tencent/mm/g/a/me$a:appId	Ljava/lang/String;
    //   60: astore 8
    //   62: aload_3
    //   63: getfield 223	com/tencent/mm/g/a/me:bWO	Lcom/tencent/mm/g/a/me$a;
    //   66: getfield 234	com/tencent/mm/g/a/me$a:msgType	I
    //   69: istore 5
    //   71: aload_3
    //   72: getfield 223	com/tencent/mm/g/a/me:bWO	Lcom/tencent/mm/g/a/me$a;
    //   75: getfield 237	com/tencent/mm/g/a/me$a:bHF	Ljava/lang/String;
    //   78: astore 9
    //   80: aload_3
    //   81: getfield 223	com/tencent/mm/g/a/me:bWO	Lcom/tencent/mm/g/a/me$a;
    //   84: getfield 240	com/tencent/mm/g/a/me$a:showType	I
    //   87: istore 6
    //   89: new 454	com/tencent/mm/g/a/gq
    //   92: dup
    //   93: invokespecial 455	com/tencent/mm/g/a/gq:<init>	()V
    //   96: astore_3
    //   97: aload_3
    //   98: getfield 459	com/tencent/mm/g/a/gq:bPN	Lcom/tencent/mm/g/a/gq$a;
    //   101: iconst_1
    //   102: putfield 464	com/tencent/mm/g/a/gq$a:nc	I
    //   105: aload_3
    //   106: getfield 459	com/tencent/mm/g/a/gq:bPN	Lcom/tencent/mm/g/a/gq$a;
    //   109: aload_1
    //   110: putfield 467	com/tencent/mm/g/a/gq$a:url	Ljava/lang/String;
    //   113: getstatic 411	com/tencent/mm/sdk/b/a:sFg	Lcom/tencent/mm/sdk/b/a;
    //   116: aload_3
    //   117: invokevirtual 415	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   120: pop
    //   121: aload_3
    //   122: getfield 471	com/tencent/mm/g/a/gq:bPO	Lcom/tencent/mm/g/a/gq$b;
    //   125: getfield 476	com/tencent/mm/g/a/gq$b:bPQ	Z
    //   128: ifeq -104 -> 24
    //   131: new 478	java/lang/StringBuilder
    //   134: dup
    //   135: invokespecial 479	java/lang/StringBuilder:<init>	()V
    //   138: aload_3
    //   139: getfield 471	com/tencent/mm/g/a/gq:bPO	Lcom/tencent/mm/g/a/gq$b;
    //   142: getfield 482	com/tencent/mm/g/a/gq$b:bPP	Ljava/lang/String;
    //   145: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload_1
    //   149: invokevirtual 490	java/lang/String:getBytes	()[B
    //   152: invokestatic 496	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   155: invokevirtual 486	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: invokevirtual 497	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   161: astore 10
    //   163: new 499	com/tencent/mm/ak/a/a/c$a
    //   166: dup
    //   167: invokespecial 500	com/tencent/mm/ak/a/a/c$a:<init>	()V
    //   170: astore 11
    //   172: aload 11
    //   174: iconst_1
    //   175: putfield 503	com/tencent/mm/ak/a/a/c$a:dXy	Z
    //   178: aload 11
    //   180: aload 10
    //   182: putfield 506	com/tencent/mm/ak/a/a/c$a:dXA	Ljava/lang/String;
    //   185: aload 11
    //   187: invokevirtual 510	com/tencent/mm/ak/a/a/c$a:Pt	()Lcom/tencent/mm/ak/a/a/c;
    //   190: astore 10
    //   192: invokestatic 516	com/tencent/mm/ak/o:Pj	()Lcom/tencent/mm/ak/a/a;
    //   195: aload_1
    //   196: aload_2
    //   197: getfield 444	com/tencent/mm/ui/base/preference/IconPreference:kYT	Landroid/widget/ImageView;
    //   200: aload 10
    //   202: new 518	com/tencent/mm/ui/h$11
    //   205: dup
    //   206: aload_0
    //   207: aload_3
    //   208: invokespecial 521	com/tencent/mm/ui/h$11:<init>	(Lcom/tencent/mm/ui/h;Lcom/tencent/mm/g/a/gq;)V
    //   211: new 523	com/tencent/mm/ui/h$13
    //   214: dup
    //   215: aload_0
    //   216: aload_3
    //   217: aload_2
    //   218: iload 6
    //   220: aload 8
    //   222: iload 5
    //   224: aload 7
    //   226: aload 9
    //   228: aload 4
    //   230: invokespecial 526	com/tencent/mm/ui/h$13:<init>	(Lcom/tencent/mm/ui/h;Lcom/tencent/mm/g/a/gq;Lcom/tencent/mm/ui/base/preference/IconPreference;ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    //   233: invokevirtual 531	com/tencent/mm/ak/a/a:a	(Ljava/lang/String;Landroid/widget/ImageView;Lcom/tencent/mm/ak/a/a/c;Lcom/tencent/mm/ak/a/c/i;Lcom/tencent/mm/ak/a/c/g;)V
    //   236: goto -212 -> 24
    //   239: astore_1
    //   240: aload_0
    //   241: monitorexit
    //   242: aload_1
    //   243: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	244	0	this	h
    //   0	244	1	paramString1	String
    //   0	244	2	paramIconPreference	IconPreference
    //   0	244	3	paramme	me
    //   0	244	4	paramString2	String
    //   69	154	5	i	int
    //   87	132	6	j	int
    //   17	208	7	localObject1	Object
    //   60	161	8	str1	String
    //   78	149	9	str2	String
    //   161	40	10	localObject2	Object
    //   170	16	11	locala	com.tencent.mm.ak.a.a.c.a
    // Exception table:
    //   from	to	target	type
    //   2	9	239	finally
    //   13	19	239	finally
    //   27	236	239	finally
  }
  
  private void anw()
  {
    this.tiv = 0;
    if (this.tiw != null) {
      this.tiw.setVisibility(8);
    }
    if ((!this.tDd) || (!isAdded())) {
      return;
    }
    cpn();
    boolean bool2 = vO(1048576);
    boolean bool3 = com.tencent.mm.bg.d.QS("scanner");
    label110:
    label136:
    label200:
    label253:
    label267:
    label296:
    Object localObject1;
    if (!bool2)
    {
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openScan %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      if ((!bool2) && (bool3)) {
        break label906;
      }
      this.tig.bw("find_friends_by_qrcode", true);
      cpo();
      bool2 = vO(2097152);
      bool3 = com.tencent.mm.bg.d.QS("search");
      if (bool2) {
        break label930;
      }
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openSearch %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3) });
      if ((!bool2) && (bool3)) {
        break label935;
      }
      this.tig.bw("find_friends_by_search", true);
      cpp();
      if ((this.mSF & 0x40) != 0) {
        break label1208;
      }
      bool1 = true;
      bool2 = com.tencent.mm.bg.d.QS("bottle");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openBottle %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2)) {
        break label1213;
      }
      this.tig.bw("voice_bottle", true);
      bool2 = vO(4194304);
      if (bool2) {
        break label1312;
      }
      bool1 = true;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openShoppingEntry %s", new Object[] { Boolean.valueOf(bool1) });
      if (bool2) {
        break label1317;
      }
      lw(false);
      localObject1 = a.a.aSm();
      if (localObject1 == null) {
        break label1519;
      }
      getContext();
    }
    label335:
    label395:
    label447:
    label514:
    label643:
    label692:
    label743:
    label766:
    label906:
    label930:
    label935:
    label1099:
    label1109:
    label1208:
    label1213:
    label1312:
    label1317:
    label1336:
    label1349:
    label1354:
    label1403:
    label1452:
    label1458:
    label1463:
    label1473:
    label1484:
    label1494:
    label1508:
    label1519:
    for (boolean bool1 = ((com.tencent.mm.plugin.game.a.a)localObject1).aSd();; bool1 = false)
    {
      bool3 = vO(8388608);
      int i;
      Object localObject3;
      if (!bool3)
      {
        bool2 = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "shouldShowGame %s, openGameEntry %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
        if ((!bool1) || (bool3)) {
          break label1336;
        }
        this.tig.bw("more_tab_game_recommend", false);
        cpm();
        this.tiv += 1;
        localObject1 = new pk();
        ((pk)localObject1).cah.caj = true;
        com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
        bool2 = ((pk)localObject1).cai.cak;
        bool3 = vO(16777216);
        if (bool3) {
          break label1349;
        }
        bool1 = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "shouldShowMiniProgram %s, openMiniProgramEntry %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        if ((bool2) && (!bool3)) {
          break label1354;
        }
        this.tig.bw("app_brand_entrance", true);
        bool2 = com.tencent.mm.plugin.ipcall.d.aWV();
        bool3 = vO(33554432);
        if (bool3) {
          break label1458;
        }
        bool1 = true;
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "showShowWeChatOut %s, openWeChatOutEntry %s", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
        if ((!bool2) || (bool3)) {
          break label1494;
        }
        this.tiv += 1;
        this.tig.bw("ip_call_entrance", false);
        localObject1 = (IconPreference)this.tig.ZZ("ip_call_entrance");
        au.HU();
        if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sRg, Integer.valueOf(0))).intValue() >= com.tencent.mm.k.g.AT().getInt("WCOEntranceRedDot", 0)) {
          break label1463;
        }
        ((IconPreference)localObject1).Er(0);
        ((IconPreference)localObject1).dk(getString(R.l.app_new), R.g.new_tips_bg);
        ((IconPreference)localObject1).Ew(8);
        au.HU();
        if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRi, Boolean.valueOf(false))).booleanValue() != true) {
          break label1473;
        }
        ((IconPreference)localObject1).lN(true);
        ((IconPreference)localObject1).Er(8);
        i = 1;
        au.HU();
        localObject3 = (String)com.tencent.mm.model.c.DT().get(aa.a.sRh, "");
        ((IconPreference)localObject1).ao((String)localObject3, -1, -7566196);
        if (!bi.oW((String)localObject3)) {
          i = 1;
        }
        if (i == 0) {
          break label1484;
        }
        ((IconPreference)localObject1).Es(0);
        localObject1 = new PreferenceSmallCategory(getContext());
        this.tig.a((Preference)localObject1, -1);
        cpj();
        this.tig.bw("find_friends_by_facebook", true);
        this.tig.bw("settings_emoji_store", true);
        if (this.tiv == 0)
        {
          localObject1 = (ViewGroup)findViewById(16908298).getParent();
          if (this.tiw != null) {
            break label1508;
          }
          this.tiw = getContext().getLayoutInflater().inflate(R.i.findmore_ui_empty_jump_view, null);
          this.tix = ((TextView)this.tiw.findViewById(R.h.goto_manage_findmoreui));
          this.tix.setOnClickListener(new h.6(this));
          localObject3 = new RelativeLayout.LayoutParams(-1, -1);
          ((ViewGroup)localObject1).addView(this.tiw, (ViewGroup.LayoutParams)localObject3);
        }
      }
      for (;;)
      {
        this.tig.notifyDataSetChanged();
        return;
        bool1 = false;
        break;
        this.tig.bw("find_friends_by_qrcode", false);
        this.tiv += 1;
        break label110;
        bool1 = false;
        break label136;
        this.tiv += 1;
        this.tig.bw("find_friends_by_search", false);
        for (;;)
        {
          IconPreference localIconPreference;
          try
          {
            localObject3 = com.tencent.mm.plugin.websearch.api.r.PX("discoverSearchEntry");
            localObject1 = ((JSONObject)localObject3).optString("wording");
            localObject3 = ((JSONObject)localObject3).optString("androidIcon");
            localIconPreference = (IconPreference)this.tig.ZZ("find_friends_by_search");
            if (!bi.oW((String)localObject1)) {
              break label1099;
            }
            localIconPreference.setTitle(getString(R.l.find_friends_search));
            if (!bi.oW((String)localObject3)) {
              break label1109;
            }
            localIconPreference.drawable = com.tencent.mm.bp.a.f(getContext(), R.k.find_more_friend_search);
            this.tin = null;
            localIconPreference.Er(8);
            ah.A(new h.3(this, localIconPreference, ac.bTg().pMk));
            com.tencent.mm.plugin.websearch.api.p.bSR();
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.x.printErrStackTrace("MicroMsg.FindMoreFriendsUI", localException, "update search entry exception!", new Object[0]);
          }
          break;
          localIconPreference.setTitle(localException);
          continue;
          o.Pe();
          localObject2 = com.tencent.mm.ak.c.jz((String)localObject3);
          if (localObject2 != null)
          {
            localIconPreference.drawable = new BitmapDrawable(getContext().getResources(), (Bitmap)localObject2);
            this.tin = null;
          }
          else
          {
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "load search icon from disk and net %s ", new Object[] { localObject3 });
            localIconPreference.drawable = com.tencent.mm.bp.a.f(getContext(), R.k.find_more_friend_search);
            o.Pi().a((String)localObject3, this.tiF);
            this.tin = ((String)localObject3);
          }
        }
        bool1 = false;
        break label200;
        this.tiv += 1;
        this.tig.bw("voice_bottle", false);
        Object localObject2 = (IconPreference)this.tig.ZZ("voice_bottle");
        if (localObject2 == null) {
          break label253;
        }
        i = k.GB();
        if (i > 0) {
          ((IconPreference)localObject2).dk(String.valueOf(i), com.tencent.mm.ui.tools.r.hd(getContext()));
        }
        if ((i > 0) && ((this.status & 0x8000) == 0))
        {
          ((IconPreference)localObject2).Er(0);
          break label253;
        }
        ((IconPreference)localObject2).Er(8);
        break label253;
        bool1 = false;
        break label267;
        this.tig.bw("jd_market_entrance", true);
        break label296;
        bool2 = false;
        break label335;
        this.tig.bw("more_tab_game_recommend", true);
        break label395;
        bool1 = false;
        break label447;
        this.tiv += 1;
        this.tig.bw("app_brand_entrance", false);
        localObject3 = (IconPreference)this.tig.ZZ("app_brand_entrance");
        if (((pk)localObject2).cai.cam)
        {
          i = 0;
          ((IconPreference)localObject3).Er(i);
          ((IconPreference)localObject3).dk(getString(R.l.app_new), R.g.new_tips_bg);
          if (!((pk)localObject2).cai.cal) {
            break label1452;
          }
        }
        for (i = 0;; i = 8)
        {
          ((IconPreference)localObject3).Et(i);
          break;
          i = 8;
          break label1403;
        }
        bool1 = false;
        break label514;
        ((IconPreference)localObject2).Er(8);
        break label643;
        ((IconPreference)localObject2).lN(false);
        i = 0;
        break label692;
        ((IconPreference)localObject2).Es(8);
        break label743;
        this.tig.bw("ip_call_entrance", true);
        break label766;
        this.tiw.setVisibility(0);
      }
    }
  }
  
  private void cpj()
  {
    int k = 0;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility");
    if ((!this.tDd) || (!isAdded()))
    {
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility preference not add");
      return;
    }
    for (;;)
    {
      Object localObject;
      IconPreference localIconPreference;
      try
      {
        localObject = com.tencent.mm.plugin.websearch.api.r.PX("discoverRecommendEntry");
        if (!((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RZ("labs_browse")) {
          break label305;
        }
        if (((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RX("labs_browse"))
        {
          if (!((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).RY("labs_browse")) {
            break label468;
          }
          j = 1;
          i = 1;
          if (!com.tencent.mm.al.b.ml((String)com.tencent.mm.kernel.g.Ei().DT().get(274436, null))) {
            break label465;
          }
          com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility EuropeanUnionCountry");
          i = k;
          if (i == 0) {
            break label453;
          }
          String str = ((JSONObject)localObject).optString("wording");
          localObject = ((JSONObject)localObject).optString("androidIcon");
          localIconPreference = (IconPreference)this.tig.ZZ("find_friends_by_look");
          if (!bi.oW(str)) {
            break label321;
          }
          localIconPreference.setTitle(getString(R.l.find_friends_look));
          if (!bi.oW((String)localObject)) {
            break label331;
          }
          localIconPreference.drawable = com.tencent.mm.bp.a.f(getContext(), R.k.find_more_friend_look);
          this.tim = null;
          this.tiv += 1;
          this.tig.bw("find_friends_by_look", false);
          if (j == 0) {
            break label430;
          }
          localIconPreference.Er(0);
          localIconPreference.dk(getString(R.l.app_new), R.g.new_tips_bg);
          com.tencent.mm.plugin.websearch.api.p.bSP();
          return;
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", bi.i(localException));
        return;
      }
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility in experiment but not open");
      int i = 0;
      break label470;
      label305:
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "checkLookVisibility not in experiment");
      int j = 0;
      i = 0;
      continue;
      label321:
      localIconPreference.setTitle(localException);
      continue;
      label331:
      o.Pe();
      Bitmap localBitmap = com.tencent.mm.ak.c.jz((String)localObject);
      if (localBitmap != null)
      {
        localIconPreference.drawable = new BitmapDrawable(getContext().getResources(), localBitmap);
        this.tim = null;
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "load look icon from disk and net %s ", new Object[] { localObject });
        localIconPreference.drawable = com.tencent.mm.bp.a.f(getContext(), R.k.find_more_friend_look);
        o.Pi().a((String)localObject, this.tiF);
        this.tim = ((String)localObject);
        continue;
        label430:
        localIconPreference.Er(8);
        ah.A(new h.2(this, localIconPreference));
        continue;
        label453:
        this.tig.bw("find_friends_by_look", true);
        return;
        label465:
        continue;
        label468:
        i = 1;
        label470:
        j = 0;
      }
    }
  }
  
  private static int cpk()
  {
    int j = 1;
    f.b localb = com.tencent.mm.pluginsdk.f.f.qBo;
    int i = j;
    f.a locala;
    if (localb != null)
    {
      locala = localb.bGq();
      i = j;
      if (localb.bGh())
      {
        i = j;
        if (locala.aiS())
        {
          i = j;
          if (!locala.bFZ())
          {
            if ((!"3".equals(locala.bGe())) || (bi.oW(locala.bGf()))) {
              break label84;
            }
            i = 6;
          }
        }
      }
    }
    label84:
    do
    {
      return i;
      if (!bi.oW(locala.bGc())) {
        return 3;
      }
      i = j;
    } while (!locala.bGd());
    return 2;
  }
  
  private void cpm()
  {
    if ((IconPreference)this.tig.ZZ("more_tab_game_recommend") == null) {
      return;
    }
    com.tencent.mm.sdk.f.e.post(new h.10(this), "updateGame");
  }
  
  private void cpn()
  {
    if ((this.mSF & 0x8000) == 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      boolean bool2 = com.tencent.mm.bg.d.QS("sns");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openSns %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      localObject1 = getSharedPreferences(com.tencent.mm.sdk.platformtools.ad.chY(), 0);
      localObject2 = ((SharedPreferences)localObject1).getString(q.GF() + "_sns_entrance_disappear", "");
      if (!bool1) {
        break;
      }
      if (bi.oW((String)localObject2)) {
        ((SharedPreferences)localObject1).edit().putString(q.GF() + "_sns_entrance_disappear", "on").commit();
      }
      if ((bool1) && (bool2)) {
        break label507;
      }
      this.tig.bw("album_dyna_photo_ui_title", true);
      return;
    }
    boolean bool3 = ((SharedPreferences)localObject1).getBoolean(q.GF() + "_has_mod_userinfo", false);
    if ((localObject2 != null) && (((String)localObject2).equals("on"))) {
      if (bool3)
      {
        i = 110;
        label226:
        com.tencent.mm.plugin.report.service.h.mEJ.a(150L, i, 1L, true);
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", "sns entrance disappear autoly, hasModUserInfo:%b", new Object[] { Boolean.valueOf(bool3) });
        com.tencent.mm.plugin.report.service.h.mEJ.h(15179, new Object[] { Integer.valueOf(i) });
      }
    }
    for (;;)
    {
      label280:
      if ((((SharedPreferences)localObject1).contains(q.GF() + "_has_mod_userinfo")) || (((SharedPreferences)localObject1).contains(q.GF() + "_sns_entrance_disappear")))
      {
        ((SharedPreferences)localObject1).edit().remove(q.GF() + "_has_mod_userinfo").remove(q.GF() + "_sns_entrance_disappear").commit();
        break;
        i = 111;
        break label226;
        if ((localObject2 != null) && (((String)localObject2).equals("on_close"))) {
          if (!bool3) {
            break label501;
          }
        }
      }
    }
    label501:
    for (int i = 112;; i = 113)
    {
      com.tencent.mm.plugin.report.service.h.mEJ.a(150L, i, 1L, true);
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "sns entrance close by user, hasModUserInfo:%b", new Object[] { Boolean.valueOf(bool3) });
      com.tencent.mm.plugin.report.service.h.mEJ.h(15179, new Object[] { Integer.valueOf(i) });
      break label280;
      break;
    }
    label507:
    this.tiv += 1;
    this.tig.bw("album_dyna_photo_ui_title", false);
    Object localObject1 = (FriendSnsPreference)this.tig.ZZ("album_dyna_photo_ui_title");
    ((IconPreference)localObject1).drawable = com.tencent.mm.bp.a.f(getContext(), R.k.find_more_friend_photograph_icon);
    au.HU();
    bool1 = bi.d((Boolean)com.tencent.mm.model.c.DT().get(48, null));
    ((FriendSnsPreference)localObject1).Er(8);
    ((FriendSnsPreference)localObject1).Ex(8);
    if (bool1)
    {
      ((FriendSnsPreference)localObject1).Er(0);
      ((FriendSnsPreference)localObject1).dk(getString(R.l.app_new), R.g.new_tips_bg);
    }
    au.HU();
    this.tij = ((String)com.tencent.mm.model.c.DT().get(68377, null));
    Object localObject2 = com.tencent.mm.kernel.g.Ei().DT().get(aa.a.tah, null);
    long l;
    if (localObject2 == null)
    {
      l = 0L;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "newer snsobj %s", new Object[] { bi.aG(this.tij, "") });
      ((FriendSnsPreference)localObject1).Ew(0);
      if (bi.oW(this.tij)) {
        break label897;
      }
      ((FriendSnsPreference)localObject1).Ev(0);
      au.HU();
      if (!bi.a((Boolean)com.tencent.mm.model.c.DT().get(68384, null), true)) {
        break label891;
      }
      i = 0;
      label734:
      ((FriendSnsPreference)localObject1).Ex(i);
      localObject2 = this.tij;
      ((FriendSnsPreference)localObject1).tiW = null;
      ((FriendSnsPreference)localObject1).tgw = -1;
      ((FriendSnsPreference)localObject1).tiV = ((String)localObject2);
      ((FriendSnsPreference)localObject1).tiX = 0L;
      if (((FriendSnsPreference)localObject1).kYT != null) {
        a.b.a(((FriendSnsPreference)localObject1).kYT, (String)localObject2);
      }
    }
    for (;;)
    {
      if (n.nkz != null) {
        this.tik = n.nkz.axd();
      }
      if (this.tik != 0)
      {
        ((FriendSnsPreference)localObject1).Er(0);
        ((FriendSnsPreference)localObject1).dk(this.tik, com.tencent.mm.ui.tools.r.hd(getContext()));
      }
      ((FriendSnsPreference)localObject1).Et(8);
      ((FriendSnsPreference)localObject1).Es(8);
      com.tencent.mm.sdk.b.a.sFg.m(new sa());
      return;
      l = ((Long)localObject2).longValue();
      break;
      label891:
      i = 8;
      break label734;
      label897:
      au.HU();
      if (((Boolean)com.tencent.mm.model.c.DT().get(589825, Boolean.valueOf(false))).booleanValue())
      {
        ((FriendSnsPreference)localObject1).Eu(R.k.net_warn_icon);
        ((FriendSnsPreference)localObject1).Ev(0);
        ((FriendSnsPreference)localObject1).Ex(8);
      }
      else if ((l != 0L) && (((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.sns.b.m.class)).ew(l)))
      {
        ((FriendSnsPreference)localObject1).Ev(0);
        ((FriendSnsPreference)localObject1).Ex(0);
        ((FriendSnsPreference)localObject1).tiV = null;
        ((FriendSnsPreference)localObject1).tiW = null;
        ((FriendSnsPreference)localObject1).tgw = -1;
        ((FriendSnsPreference)localObject1).tiX = l;
        if ((((FriendSnsPreference)localObject1).tiX != 0L) && (((FriendSnsPreference)localObject1).kYT != null)) {
          ((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.sns.b.m.class)).a(((FriendSnsPreference)localObject1).tiX, ((FriendSnsPreference)localObject1).kYT, ((Preference)localObject1).mContext.hashCode());
        }
      }
      else
      {
        ((FriendSnsPreference)localObject1).Ev(8);
      }
    }
  }
  
  private void cpo()
  {
    if ((this.mSF & 0x100) == 0) {}
    boolean bool2;
    for (boolean bool1 = true;; bool1 = false)
    {
      bool2 = com.tencent.mm.bg.d.QS("shake");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openShake %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2)) {
        break;
      }
      this.tig.bw("find_friends_by_shake", true);
      return;
    }
    this.tiv += 1;
    this.tig.bw("find_friends_by_shake", false);
    IconPreference localIconPreference = (IconPreference)this.tig.ZZ("find_friends_by_shake");
    int i = com.tencent.mm.az.d.SH().axd() + o.a.cbj().buv();
    if (i > 0)
    {
      localIconPreference.Er(0);
      localIconPreference.dk(String.valueOf(i), R.g.unread_count_shape);
      localIconPreference.Ev(8);
      o.a.cbj().buw();
      if (!o.a.cbj().bux()) {
        break label509;
      }
    }
    label476:
    label501:
    label509:
    for (bool1 = com.tencent.mm.s.c.Cp().aU(262154, 266258);; bool1 = false)
    {
      Object localObject;
      if (bool1)
      {
        au.HU();
        localObject = (String)com.tencent.mm.model.c.DT().get(aa.a.sOK, "");
        if (!TextUtils.isEmpty((CharSequence)localObject))
        {
          localIconPreference.Et(8);
          localIconPreference.Er(0);
          localIconPreference.dk((String)localObject, R.g.unread_count_shape);
        }
      }
      int j;
      for (;;)
      {
        au.HU();
        localObject = bi.aG((String)com.tencent.mm.model.c.DT().get(aa.a.sRQ, null), "");
        au.HU();
        bool2 = bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRS, null), false);
        au.HU();
        j = ((Integer)com.tencent.mm.model.c.DT().get(aa.a.sRO, Integer.valueOf(0))).intValue();
        if ((!Boolean.valueOf(bool2).booleanValue()) || (localObject == null) || (((String)localObject).equals("")) || (i > 0) || (bool1)) {
          break label501;
        }
        if (j != 0) {
          break label476;
        }
        localIconPreference.Et(8);
        localIconPreference.Es(0);
        localObject = ((String)localObject).split(",");
        if (localObject.length > 0) {
          localIconPreference.ao(localObject[0], -1, Color.parseColor("#8c8c8c"));
        }
        localIconPreference.lN(true);
        localIconPreference.Ew(8);
        return;
        localIconPreference.Er(8);
        localIconPreference.dk("", -1);
        break;
        if (i > 0)
        {
          localIconPreference.Et(0);
        }
        else
        {
          localIconPreference.Et(0);
          localIconPreference.Er(8);
          localIconPreference.dk("", -1);
          continue;
          localIconPreference.Et(8);
        }
      }
      if (j != 1) {
        break;
      }
      localIconPreference.Es(8);
      localIconPreference.Er(0);
      localIconPreference.tCn = true;
      return;
      localIconPreference.Es(8);
      return;
    }
  }
  
  private void cpp()
  {
    boolean bool1;
    if ((this.mSF & 0x200) == 0)
    {
      bool1 = true;
      boolean bool2 = com.tencent.mm.bg.d.QS("nearby");
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "openNearby %s, plugin installed %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
      if ((bool1) && (bool2)) {
        break label72;
      }
      this.tig.bw("find_friends_by_near", true);
    }
    label72:
    IconPreference localIconPreference;
    do
    {
      return;
      bool1 = false;
      break;
      this.tiv += 1;
      this.tig.bw("find_friends_by_near", false);
      localIconPreference = (IconPreference)this.tig.ZZ("find_friends_by_near");
    } while (localIconPreference == null);
    iv localiv = new iv();
    localiv.bSp.bNI = 7;
    com.tencent.mm.sdk.b.a.sFg.m(localiv);
    if (localiv.bSq.bJm) {
      localIconPreference.Ev(8);
    }
    int i;
    for (;;)
    {
      i = com.tencent.mm.az.d.SG().axd();
      if (!com.tencent.mm.be.a.cbf()) {
        break label217;
      }
      if (i <= 0) {
        break;
      }
      localIconPreference.Et(0);
      return;
      localIconPreference.Ev(0);
      localIconPreference.Eu(R.g.mm_foot);
      localIconPreference.eW(-2, -2);
    }
    localIconPreference.Et(8);
    return;
    label217:
    if (i > 0)
    {
      localIconPreference.Er(0);
      localIconPreference.dk(String.valueOf(i), com.tencent.mm.ui.tools.r.hd(getContext()));
      return;
    }
    localIconPreference.Er(8);
    localIconPreference.dk("", -1);
  }
  
  private void cpq()
  {
    ou localou = new ou();
    localou.bZO.bQt = this.bQt;
    com.tencent.mm.sdk.b.a.sFg.m(localou);
  }
  
  private String gg(String paramString1, String paramString2)
  {
    if (!bi.oW(paramString1)) {
      return paramString1;
    }
    return com.tencent.mm.pluginsdk.model.app.g.q(getContext(), paramString2);
  }
  
  private void lw(boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    f.b localb;
    boolean bool1;
    String str;
    com.tencent.mm.plugin.subapp.jdbiz.b localb1;
    int i;
    label126:
    Object localObject3;
    if (w.chM())
    {
      localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigName");
      localObject2 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigIconUrl");
      localb = com.tencent.mm.pluginsdk.f.f.qBo;
      boolean bool2 = true;
      bool1 = bool2;
      if (localb != null)
      {
        str = localb.bGp();
        bool1 = bool2;
        if (!bi.oW((String)localObject1))
        {
          bool1 = bool2;
          if (!bi.oW((String)localObject2))
          {
            bool1 = bool2;
            if (!bi.oW(str))
            {
              this.tiv += 1;
              localb1 = (com.tencent.mm.plugin.subapp.jdbiz.b)localb.bGq();
              if (localb1.oqO >= System.currentTimeMillis() / 1000L) {
                break label558;
              }
              i = 1;
              localObject3 = localObject2;
              if (i == 0) {
                break label683;
              }
              if ((localb1.oqP == 0L) || (localb1.oqP >= System.currentTimeMillis() / 1000L)) {
                break label563;
              }
              i = 1;
              label162:
              localObject3 = localObject2;
              if (i != 0) {
                break label683;
              }
              if (!bi.oW(localb1.iconUrl)) {
                localObject2 = localb1.iconUrl;
              }
              localObject3 = localObject2;
              if (bi.oW(localb1.title)) {
                break label683;
              }
              localObject1 = localb1.title;
            }
          }
        }
      }
    }
    for (;;)
    {
      localObject3 = (IconPreference)this.tig.ZZ("jd_market_entrance");
      o.Pe();
      Bitmap localBitmap = com.tencent.mm.ak.c.jz((String)localObject2);
      if (localBitmap != null)
      {
        ((IconPreference)localObject3).drawable = new BitmapDrawable(getContext().getResources(), localBitmap);
        this.til = null;
        label267:
        ((IconPreference)localObject3).setTitle((CharSequence)localObject1);
        ((IconPreference)localObject3).Er(8);
        ((IconPreference)localObject3).Et(8);
        ((IconPreference)localObject3).Es(8);
        ((IconPreference)localObject3).lN(false);
        ((IconPreference)localObject3).Ew(8);
        if ((localb.bGh()) && (localb1.aiS()) && (!localb1.bFZ()))
        {
          if (!bi.oW(localb1.oqK))
          {
            ((IconPreference)localObject3).Er(8);
            ((IconPreference)localObject3).Et(8);
            ((IconPreference)localObject3).ao(localb1.oqK, -1, -7566196);
            ((IconPreference)localObject3).Es(0);
          }
          if (bi.oW(localb1.oqL)) {
            break label631;
          }
          o.Pe();
          localObject1 = com.tencent.mm.ak.c.jz(localb1.oqL);
          ((IconPreference)localObject3).Ew(0);
          ((IconPreference)localObject3).Ev(0);
          ((IconPreference)localObject3).Ex(0);
          ((IconPreference)localObject3).lN(false);
          if (localObject1 == null) {
            break label604;
          }
          this.tiq = null;
          ((IconPreference)localObject3).V((Bitmap)localObject1);
        }
      }
      for (;;)
      {
        if (paramBoolean) {
          this.tig.notifyDataSetChanged();
        }
        if (!this.tir)
        {
          com.tencent.mm.plugin.report.service.h.mEJ.h(11178, new Object[] { str, localb.bGq().bGb(), Integer.valueOf(cpk()) });
          this.tir = true;
        }
        bool1 = false;
        this.tig.bw("jd_market_entrance", bool1);
        return;
        if (w.chN())
        {
          localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigNameHKTW");
          break;
        }
        localObject1 = com.tencent.mm.k.g.AT().getValue("JDEntranceConfigNameEN");
        break;
        label558:
        i = 0;
        break label126;
        label563:
        i = 0;
        break label162;
        ((IconPreference)localObject3).drawable = com.tencent.mm.bp.a.f(getContext(), R.k.jd_entrance_icon);
        o.Pi().a((String)localObject2, this.tiF);
        this.til = ((String)localObject2);
        break label267;
        label604:
        o.Pi().a(localb1.oqL, this.tiF);
        this.tiq = localb1.oqL;
        continue;
        label631:
        if (!bi.oW(localb1.oqK))
        {
          ((IconPreference)localObject3).lN(true);
        }
        else if (localb1.oqJ)
        {
          ((IconPreference)localObject3).Et(0);
          ((IconPreference)localObject3).dk("", -1);
          ((IconPreference)localObject3).Er(8);
        }
      }
      label683:
      localObject2 = localObject3;
    }
  }
  
  private boolean vO(int paramInt)
  {
    return (this.hXx & paramInt) != 0L;
  }
  
  public final void HG()
  {
    if ((q.GQ() & 0x8000) != 0) {
      return;
    }
    this.tik += 1;
    cpn();
    this.tig.notifyDataSetChanged();
  }
  
  public final void HH()
  {
    if ((q.GQ() & 0x8000) != 0) {
      return;
    }
    cpn();
    this.tig.notifyDataSetChanged();
  }
  
  public final void HI() {}
  
  public final void HJ()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "notify comment change");
    if ((q.GQ() & 0x8000) != 0) {
      return;
    }
    if (n.nkz != null) {
      this.tik = n.nkz.axd();
    }
    cpn();
    this.tig.notifyDataSetChanged();
  }
  
  public final void HK()
  {
    if (this.tig == null) {
      return;
    }
    this.status = q.GJ();
    anw();
  }
  
  public final int Ys()
  {
    return R.o.find_more_friends;
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    int i = 1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange");
    if (LauncherUI.cpR() == 2)
    {
      paramInt = 0;
      if (this.status != q.GJ())
      {
        this.status = q.GJ();
        paramInt = 1;
      }
      if (this.hXx != q.GK())
      {
        this.hXx = q.GK();
        paramInt = 1;
      }
      if (this.mSF == q.GQ()) {
        break label89;
      }
      this.mSF = q.GQ();
      paramInt = i;
    }
    label89:
    for (;;)
    {
      if (paramInt != 0) {
        anw();
      }
      return;
    }
  }
  
  public final void a(String paramString, com.tencent.mm.sdk.e.l paraml)
  {
    int j = 1;
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "onNotifyChange");
    int i;
    if (LauncherUI.cpR() == 2)
    {
      i = 0;
      if (this.status != q.GJ())
      {
        this.status = q.GJ();
        i = 1;
      }
      if (this.hXx != q.GK())
      {
        this.hXx = q.GK();
        i = 1;
      }
      if (this.mSF == q.GQ()) {
        break label89;
      }
      this.mSF = q.GQ();
      i = j;
    }
    label89:
    for (;;)
    {
      if (i != 0) {
        anw();
      }
      return;
    }
  }
  
  public final boolean a(com.tencent.mm.ui.base.preference.f paramf, Preference paramPreference)
  {
    boolean bool1;
    label91:
    label158:
    label300:
    boolean bool2;
    if ("album_dyna_photo_ui_title".equals(paramPreference.mKey))
    {
      au.HU();
      if (!com.tencent.mm.model.c.isSDCardAvailable())
      {
        s.gH(getContext());
        return true;
      }
      com.tencent.mm.plugin.report.service.g.vu(10);
      au.HU();
      this.tij = ((String)com.tencent.mm.model.c.DT().get(68377, null));
      paramf = new Intent();
      paramPreference = new com.tencent.mm.modelsns.b(701, 1);
      if (!bi.oW(this.tij))
      {
        bool1 = true;
        paramPreference.bP(bool1);
        paramPreference.nb(this.tik);
        paramf.putExtra("sns_timeline_NeedFirstLoadint", true);
        paramf.putExtra("is_from_find_more", true);
        if ((bi.oW(this.tij)) && (this.tik <= 0)) {
          break label434;
        }
        bool1 = true;
        paramf.putExtra("enter_by_red", bool1);
        au.HU();
        paramf.putExtra("is_sns_notify_open", bi.a((Boolean)com.tencent.mm.model.c.DT().get(68384, null), true));
        paramf.putExtra("sns_unread_count", n.nkz.axd());
        if (!bi.oW(this.tij))
        {
          au.HU();
          paramf.putExtra("new_feed_id", bi.aG((String)com.tencent.mm.model.c.DT().get(68418, null), ""));
        }
        paramPreference.b(paramf, "enter_log");
        paramPreference = new hs();
        com.tencent.mm.sdk.b.a.sFg.m(paramPreference);
        if (paramPreference.bRd.isResume) {
          break label2370;
        }
        if (bi.oW(this.tij)) {
          break label2364;
        }
        bool1 = false;
        bool2 = bool1;
        if (n.nkz != null)
        {
          this.tik = n.nkz.axd();
          bool2 = bool1;
          if (this.tik > 0) {
            bool2 = false;
          }
        }
        au.HU();
        com.tencent.mm.model.c.DT().set(68377, "");
      }
    }
    for (;;)
    {
      au.HU();
      com.tencent.mm.model.c.DT().set(589825, Boolean.valueOf(false));
      paramf.putExtra("sns_resume_state", bool2);
      com.tencent.mm.bg.d.b(getContext(), "sns", ".ui.SnsTimeLineUI", paramf);
      com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "1");
      new ag().postDelayed(new h.8(this), 500L);
      return true;
      bool1 = false;
      break label91;
      label434:
      bool1 = false;
      break label158;
      if ("find_friends_by_near".equals(paramPreference.mKey))
      {
        bool1 = com.tencent.mm.pluginsdk.permission.a.a(thisActivity(), "android.permission.ACCESS_COARSE_LOCATION", 66, null, null);
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "summerper checkPermission checkLocation[%b]", new Object[] { Boolean.valueOf(bool1) });
        if (!bool1) {
          break;
        }
        cpl();
        return true;
      }
      if ("find_friends_by_shake".equals(paramPreference.mKey))
      {
        if ((!this.tis) && (q.Hn().booleanValue()))
        {
          paramf = (IconPreference)paramf.ZZ("find_friends_by_shake");
          if (paramf != null)
          {
            paramf.Et(8);
            au.HU();
            com.tencent.mm.model.c.DT().set(340231, Boolean.valueOf(true));
            au.HU();
            com.tencent.mm.model.c.DT().lm(true);
            com.tencent.mm.plugin.report.service.h.mEJ.a(232L, 4L, 1L, false);
          }
        }
        com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "3");
        au.HU();
        paramf = bi.aG((String)com.tencent.mm.model.c.DT().get(aa.a.sRQ, null), "");
        au.HU();
        if ((Boolean.valueOf(bi.a((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRS, null), false)).booleanValue()) && (paramf != null) && (!paramf.equals(""))) {}
        for (paramf = Boolean.valueOf(true);; paramf = Boolean.valueOf(false))
        {
          if (paramf.booleanValue()) {
            com.tencent.mm.plugin.report.service.h.mEJ.h(12653, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
          }
          com.tencent.mm.sdk.b.a.sFg.m(new nh());
          com.tencent.mm.bg.d.A(getContext(), "shake", ".ui.ShakeReportUI");
          return true;
        }
      }
      if ("voice_bottle".equals(paramPreference.mKey))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "5");
        paramf = bl.IC();
        if ((bi.a(Integer.valueOf(paramf.sex), 0) <= 0) || (bi.oW(paramf.getProvince())))
        {
          com.tencent.mm.bg.d.A(getContext(), "bottle", ".ui.BottleWizardStep1");
          return true;
        }
        com.tencent.mm.bg.d.A(getContext(), "bottle", ".ui.BottleBeachUI");
        return true;
      }
      if ("find_friends_by_qrcode".equals(paramPreference.mKey))
      {
        if (com.tencent.mm.p.a.bx(getContext())) {
          break;
        }
        getContext();
        if (com.tencent.mm.ax.e.Sz()) {
          break;
        }
        com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "2");
        paramf = new Intent();
        paramf.putExtra("BaseScanUI_qrcode_right_btn_direct_album", true);
        com.tencent.mm.plugin.report.service.h.mEJ.h(11265, new Object[] { Integer.valueOf(2) });
        com.tencent.mm.bg.d.b(getContext(), "scanner", ".ui.BaseScanUI", paramf);
        return true;
      }
      Object localObject1;
      Object localObject2;
      if (paramPreference.mKey.equals("more_tab_game_recommend"))
      {
        com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "6");
        com.tencent.mm.plugin.report.service.h.mEJ.a(848L, 2L, 1L, false);
        au.HU();
        if (!com.tencent.mm.model.c.isSDCardAvailable())
        {
          s.gH(getContext());
          return true;
        }
        paramPreference = new Intent();
        paramPreference.putExtra("from_find_more_friend", this.tiu);
        paramPreference.putExtra("game_report_from_scene", 901);
        if (this.tiu)
        {
          localObject1 = new me();
          com.tencent.mm.sdk.b.a.sFg.m((com.tencent.mm.sdk.b.b)localObject1);
          localObject2 = (IconPreference)paramf.ZZ("more_tab_game_recommend");
          if ((((me)localObject1).bWO.bWP != null) && (localObject2 != null))
          {
            paramf = o.Pj();
            localObject1 = ((me)localObject1).bWO.bWP;
            localObject1 = new com.tencent.mm.ak.a.c(((IconPreference)localObject2).kYT, (String)localObject1);
            paramf.dWO.a((com.tencent.mm.ak.a.c)localObject1);
          }
        }
        com.tencent.mm.bg.d.b(getContext(), "game", ".ui.GameCenterUI", paramPreference);
        return true;
      }
      if ("find_friends_by_micromsg".equals(paramPreference.mKey))
      {
        com.tencent.mm.bg.d.b(getContext(), "subapp", ".ui.pluginapp.ContactSearchUI", new Intent());
        return true;
      }
      if ("find_friends_by_mobile".equals(paramPreference.mKey))
      {
        if (com.tencent.mm.plugin.account.friend.a.l.XC() != l.a.eKt)
        {
          paramf = new Intent(getContext(), BindMContactIntroUI.class);
          paramf.putExtra("key_upload_scene", 6);
          MMWizardActivity.D(getContext(), paramf);
          return true;
        }
        startActivity(new Intent(getContext(), MobileFriendUI.class));
        return true;
      }
      if ("find_friends_by_facebook".equals(paramPreference.mKey))
      {
        startActivity(new Intent(getContext(), FacebookFriendUI.class));
        return true;
      }
      if ("settings_mm_card_package".equals(paramPreference.mKey))
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "enter to cardhome");
        com.tencent.mm.bg.d.A(getContext(), "card", ".ui.CardHomePageUI");
        return true;
      }
      if (paramPreference.mKey.equals("jd_market_entrance"))
      {
        com.tencent.mm.pluginsdk.wallet.i.Cx(9);
        paramf = com.tencent.mm.pluginsdk.f.f.qBo;
        if (paramf == null) {
          break label2359;
        }
        localObject1 = com.tencent.mm.pluginsdk.f.f.qBo.bGp();
        com.tencent.mm.plugin.report.service.h.mEJ.h(11179, new Object[] { localObject1, paramf.bGq().bGb(), Integer.valueOf(cpk()) });
        paramf.bGk();
        paramf.bGj();
        ((IconPreference)paramPreference).dk("", -1);
        paramf = (com.tencent.mm.ui.base.preference.f)localObject1;
        if (!bi.oW((String)localObject1))
        {
          paramf = new Intent();
          paramf.putExtra("rawUrl", (String)localObject1);
          paramf.putExtra("useJs", true);
          paramf.putExtra("vertical_scroll", true);
          paramf.putExtra("minimize_secene", 1);
          paramf.putExtra("KPublisherId", "jd_store");
          com.tencent.mm.bg.d.b(getContext(), "webview", ".ui.tools.WebViewUI", paramf);
        }
      }
      label2354:
      label2359:
      for (paramf = (com.tencent.mm.ui.base.preference.f)localObject1;; paramf = null)
      {
        com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "jump to url: " + paramf);
        return true;
        if ("ip_call_entrance".equals(paramPreference.mKey))
        {
          paramf = (IconPreference)paramf.ZZ("ip_call_entrance");
          paramf.Et(8);
          paramf.Es(8);
          paramf.lN(false);
          paramf.Ew(8);
          au.HU();
          paramf = (String)com.tencent.mm.model.c.DT().get(aa.a.sRh, "");
          au.HU();
          if (((Boolean)com.tencent.mm.model.c.DT().get(aa.a.sRi, Boolean.valueOf(false))).booleanValue() != true) {
            break label2354;
          }
          com.tencent.mm.plugin.ipcall.a.e.i.M(1, -1, -1);
          au.HU();
          com.tencent.mm.model.c.DT().a(aa.a.sRi, Boolean.valueOf(false));
        }
        for (int i = 1;; i = 0)
        {
          au.HU();
          if (((Integer)com.tencent.mm.model.c.DT().get(aa.a.sRg, Integer.valueOf(0))).intValue() < com.tencent.mm.k.g.AT().getInt("WCOEntranceRedDot", 0))
          {
            com.tencent.mm.plugin.report.service.h.mEJ.h(13254, new Object[] { Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(-1), Integer.valueOf(-1), Integer.valueOf(-1) });
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sRg, Integer.valueOf(com.tencent.mm.k.g.AT().getInt("WCOEntranceRedDot", 0)));
            i = 1;
          }
          if (!bi.oW(paramf))
          {
            au.HU();
            com.tencent.mm.model.c.DT().a(aa.a.sRh, "");
          }
          if (i != 0) {
            com.tencent.mm.sdk.b.a.sFg.m(new sa());
          }
          if (com.tencent.mm.p.a.BQ())
          {
            com.tencent.mm.ui.base.h.a(getContext(), R.l.multitalk_in_tip, 0, null, null);
            return true;
          }
          com.tencent.mm.plugin.report.service.h.mEJ.h(12061, new Object[] { Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0) });
          com.tencent.mm.bg.d.b(getContext(), "ipcall", ".ui.IPCallAddressUI", new Intent());
          return true;
          if ("app_brand_entrance".equals(paramPreference.mKey))
          {
            ((com.tencent.mm.plugin.appbrand.n.f)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.appbrand.n.f.class)).x(getContext(), 1);
            return true;
          }
          if ("find_friends_by_search".equals(paramPreference.mKey))
          {
            if (!com.tencent.mm.plugin.websearch.api.p.zO(0))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
              return true;
            }
            paramf = com.tencent.mm.plugin.websearch.api.r.PX("discoverSearchEntry").optString("wording");
            if (bi.oW(paramf))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", "empty title");
              return true;
            }
            paramPreference = ac.bTg();
            paramPreference.pMk = new ac.a();
            paramPreference.save();
            ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).open("labs1de6f3");
            com.tencent.mm.plugin.websearch.api.ad.h("", 0, 0, 20);
            paramPreference = com.tencent.mm.plugin.websearch.api.p.zK(20);
            localObject1 = com.tencent.mm.plugin.webview.modeltools.e.bUU().bTG();
            localObject2 = new HashMap();
            ((Map)localObject2).put("sessionId", paramPreference);
            ((Map)localObject2).put("inputMarginTop", "32");
            ((Map)localObject2).put("inputMarginLeftRight", "24");
            ((Map)localObject2).put("inputHeight", "48");
            if ((localObject1 != null) && (!((String)localObject1).isEmpty())) {
              ((Map)localObject2).put("educationTab", Uri.encode((String)localObject1));
            }
            ((com.tencent.mm.plugin.websearch.api.f)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.websearch.api.f.class)).a(getContext(), 20, "", paramPreference, (Map)localObject2, paramf);
            ((com.tencent.mm.plugin.boots.a.c)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.boots.a.c.class)).nd(com.tencent.mm.plugin.boots.a.b.hjA);
            return true;
          }
          if ("find_friends_by_look".equals(paramPreference.mKey))
          {
            if (!com.tencent.mm.plugin.websearch.api.p.zO(1))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", "fts h5 template not avail");
              return true;
            }
            paramf = com.tencent.mm.plugin.websearch.api.r.PX("discoverRecommendEntry").optString("wording");
            if (bi.oW(paramf))
            {
              com.tencent.mm.sdk.platformtools.x.e("MicroMsg.FindMoreFriendsUI", "empty query");
              return true;
            }
            com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "look one look clikced");
            com.tencent.mm.plugin.topstory.ui.d.N(getContext(), 21);
            ((com.tencent.mm.plugin.welab.a.a.a)com.tencent.mm.kernel.g.l(com.tencent.mm.plugin.welab.a.a.a.class)).open("labs_browse");
            paramPreference = new kx();
            paramPreference.bVh.scene = 0;
            com.tencent.mm.sdk.b.a.sFg.m(paramPreference);
            com.tencent.mm.plugin.websearch.api.ad.aR(21, paramf);
            com.tencent.mm.plugin.websearch.api.ad.reportIdKey649ForLook(21, 0);
            if (com.tencent.mm.plugin.websearch.api.p.zP(1) > com.tencent.mm.plugin.websearch.api.p.zN(1))
            {
              com.tencent.mm.plugin.websearch.api.ad.reportIdKey649ForLook(21, 15);
              return true;
            }
            com.tencent.mm.plugin.websearch.api.ad.reportIdKey649ForLook(21, 14);
            return true;
          }
          return false;
        }
      }
      label2364:
      bool1 = true;
      break label300;
      label2370:
      bool2 = true;
    }
  }
  
  protected final void coA()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab start");
  }
  
  protected final void coB()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab pause");
    this.bQt = false;
    cpq();
    if (au.HX())
    {
      com.tencent.mm.pluginsdk.c.a.b(iq.class.getName(), this.qOz);
      com.tencent.mm.pluginsdk.c.a.b(gp.class.getName(), this.tiB);
      com.tencent.mm.pluginsdk.c.a.b(ph.class.getName(), this.tiC);
      com.tencent.mm.sdk.b.a.sFg.c(this.tiz);
      com.tencent.mm.sdk.b.a.sFg.c(this.tiy);
      com.tencent.mm.sdk.b.a.sFg.c(this.tiA);
      com.tencent.mm.sdk.b.a.sFg.c(this.nqB);
      com.tencent.mm.sdk.b.a.sFg.c(this.tiD);
      com.tencent.mm.sdk.b.a.sFg.c(this.jxo);
      com.tencent.mm.sdk.b.a.sFg.c(this.tiE);
      com.tencent.mm.az.d.SH().d(this);
      au.HU();
      com.tencent.mm.model.c.FW().b(this);
      au.HU();
      com.tencent.mm.model.c.b(this);
      au.HU();
      com.tencent.mm.model.c.DT().b(this);
      if (this.til != null) {
        o.Pe().lF(this.til);
      }
      if (this.tiq != null) {
        o.Pe().lF(this.tiq);
      }
    }
    if (n.nkB != null) {
      n.nkB.b(this);
    }
  }
  
  protected final void coC()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab stop");
  }
  
  protected final void coD()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab destroy");
  }
  
  public final void coF()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "turn to bg");
  }
  
  public final void coG()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "turn to fg");
  }
  
  public final void coI()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab recreate ui");
  }
  
  protected final void coy()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab create");
    this.tig = ((com.tencent.mm.ui.base.preference.h)this.tCL);
    this.status = q.GJ();
    this.mSF = q.GQ();
    this.hXx = q.GK();
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab create end");
  }
  
  protected final void coz()
  {
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab resume");
    this.bQt = true;
    cpq();
    com.tencent.mm.pluginsdk.c.a.a(iq.class.getName(), this.qOz);
    com.tencent.mm.pluginsdk.c.a.a(gp.class.getName(), this.tiB);
    com.tencent.mm.pluginsdk.c.a.a(ph.class.getName(), this.tiC);
    com.tencent.mm.sdk.b.a.sFg.b(this.tiz);
    com.tencent.mm.sdk.b.a.sFg.b(this.tiy);
    com.tencent.mm.sdk.b.a.sFg.b(this.tiA);
    com.tencent.mm.sdk.b.a.sFg.b(this.nqB);
    com.tencent.mm.sdk.b.a.sFg.b(this.tiD);
    com.tencent.mm.sdk.b.a.sFg.a(this.jxo);
    com.tencent.mm.sdk.b.a.sFg.b(this.tiE);
    com.tencent.mm.az.d.SH().c(this);
    au.HU();
    com.tencent.mm.model.c.FW().a(this);
    au.HU();
    com.tencent.mm.model.c.a(this);
    au.HU();
    com.tencent.mm.model.c.DT().a(this);
    if (n.nkB != null) {
      n.nkB.a(this);
    }
    View localView = findViewById(R.h.loading_tips_area);
    if ((localView != null) && (localView.getVisibility() != 8)) {
      new ag(Looper.getMainLooper()).post(new h.14(this, localView));
    }
    if (isAdded()) {
      com.tencent.mm.blink.b.xi().g(new h.15(this));
    }
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "on tab resume end");
  }
  
  public final void cpl()
  {
    com.tencent.mm.plugin.report.service.h.mEJ.k(10958, "4");
    au.HU();
    if (!bi.d((Boolean)com.tencent.mm.model.c.DT().get(4103, null)))
    {
      com.tencent.mm.bg.d.A(getContext(), "nearby", ".ui.NearbyFriendsIntroUI");
      return;
    }
    Object localObject = bl.ID();
    if (localObject == null)
    {
      com.tencent.mm.bg.d.A(getContext(), "nearby", ".ui.NearbyPersonalInfoUI");
      return;
    }
    String str = bi.oV(((bl)localObject).getProvince());
    int i = bi.a(Integer.valueOf(((bl)localObject).sex), 0);
    if ((bi.oW(str)) || (i == 0))
    {
      com.tencent.mm.bg.d.A(getContext(), "nearby", ".ui.NearbyPersonalInfoUI");
      return;
    }
    au.HU();
    localObject = (Boolean)com.tencent.mm.model.c.DT().get(4104, null);
    if ((localObject == null) || (!((Boolean)localObject).booleanValue()))
    {
      localObject = (LauncherUI)getContext();
      if (localObject != null) {
        ((LauncherUI)localObject).tkn.tjF.ZS("tab_find_friend");
      }
      com.tencent.mm.be.a.eF(getContext());
      return;
    }
    if (this.tih == null)
    {
      this.tih = View.inflate(getContext(), R.i.lbs_open_dialog_view, null);
      this.lBF = ((CheckBox)this.tih.findViewById(R.h.lbs_open_dialog_cb));
      this.lBF.setChecked(false);
    }
    if (this.lBH == null)
    {
      this.lBH = com.tencent.mm.ui.base.h.a(getContext(), getString(R.l.app_tip), this.tih, new h.9(this), null);
      return;
    }
    this.lBH.show();
  }
  
  public final void cpr()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FindMoreFriendsUI", "on tab switch in");
    this.bQt = true;
    cpq();
    com.tencent.mm.blink.b.xi().g(new h.16(this));
    com.tencent.mm.plugin.websearch.api.r.zZ(20);
  }
  
  public final void cps()
  {
    com.tencent.mm.sdk.platformtools.x.v("MicroMsg.FindMoreFriendsUI", "on tab switch out");
    this.bQt = false;
    cpq();
  }
  
  public boolean noActionBar()
  {
    return true;
  }
  
  public void onActivityCreated(Bundle paramBundle)
  {
    super.onActivityCreated(paramBundle);
    com.tencent.mm.sdk.platformtools.x.i("MicroMsg.FindMoreFriendsUI", "onActivityCreated");
  }
  
  public boolean supportNavigationSwipeBack()
  {
    return false;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/ui/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */