package com.tencent.mm.pluginsdk.ui.preference;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.az.d;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.g.c.ch;
import com.tencent.mm.model.am.a;
import com.tencent.mm.model.am.c;
import com.tencent.mm.model.bd;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.plugin.messenger.foundation.a.a.k.a;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.pluginsdk.ui.ProfileDescribeView;
import com.tencent.mm.pluginsdk.ui.ProfileLabelView;
import com.tencent.mm.pluginsdk.ui.ProfileMobilePhoneView;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.j;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.bb;
import com.tencent.mm.storage.bo;
import com.tencent.mm.storage.bp;
import com.tencent.mm.storage.bq;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import junit.framework.Assert;

public class NormalUserHeaderPreference
  extends Preference
  implements f.c, k.a, m.b
{
  MMActivity bGc;
  ab guS;
  private boolean iAc = false;
  private TextView jYA;
  private String juZ;
  private TextView kkF;
  private ImageView lUo;
  private boolean lWk;
  private boolean lWr = false;
  private boolean lXu = false;
  private ClipboardManager lyy;
  private ImageView mZF;
  int mZZ;
  public String qGi;
  public String qGj;
  private TextView qOL;
  private TextView qOM;
  private TextView qON;
  private View qOO;
  private Button qOP;
  private Button qOQ;
  private TextView qOR;
  private ImageView qOS;
  private CheckBox qOT;
  private ImageView qOU;
  private ImageView qOV;
  private LinearLayout qOW;
  private Button qOX;
  private FMessageListView qOY;
  private int qOZ = 0;
  private boolean qPa = false;
  private boolean qPb = false;
  private boolean qPc = false;
  private boolean qPd = false;
  private boolean qPe = false;
  private boolean qPf = false;
  private boolean qPg = false;
  private boolean qPh = false;
  private String qPi;
  private ProfileMobilePhoneView qPj;
  private ProfileDescribeView qPk;
  private ProfileLabelView qPl;
  private TextView qPm;
  public View.OnClickListener qPn;
  public String qPo = null;
  
  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    init();
  }
  
  public NormalUserHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.bGc = ((MMActivity)paramContext);
    init();
  }
  
  private boolean bnm()
  {
    return (this.iAc) && (this.guS != null);
  }
  
  private void bru()
  {
    a.b.a(this.lUo, this.guS.field_username);
    int i;
    if (this.lUo != null)
    {
      i = com.tencent.mm.bp.a.ad(this.mContext, R.f.BigAvatarSize);
      int j = com.tencent.mm.bp.a.fromDPToPix(this.bGc, 88);
      if (i <= j) {
        break label85;
      }
      i = j;
    }
    label85:
    for (;;)
    {
      LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(i, i);
      localLayoutParams.setMargins(0, 0, com.tencent.mm.bp.a.ae(this.mContext, R.f.LargerPadding), 0);
      this.lUo.setLayoutParams(localLayoutParams);
      return;
    }
  }
  
  private void cfd()
  {
    int j = 0;
    Object localObject;
    boolean bool;
    if ((this.qOU != null) && (s.gW(this.guS.field_username)))
    {
      this.qPb = this.guS.BF();
      localObject = this.qOU;
      if (this.qPb)
      {
        i = 0;
        ((ImageView)localObject).setVisibility(i);
      }
    }
    else if ((this.qOV != null) && (s.gW(this.guS.field_username)))
    {
      localObject = this.guS.field_username;
      if (n.nkA == null) {
        break label133;
      }
      bool = n.nkA.Lz((String)localObject);
      label100:
      this.qPa = bool;
      localObject = this.qOV;
      if (!this.qPa) {
        break label138;
      }
    }
    label133:
    label138:
    for (int i = j;; i = 8)
    {
      ((ImageView)localObject).setVisibility(i);
      return;
      i = 8;
      break;
      bool = false;
      break label100;
    }
  }
  
  private void cfe()
  {
    Object localObject;
    if ((com.tencent.mm.model.q.gQ(this.guS.field_username)) || (bi.oV(this.guS.field_conRemark).length() <= 0))
    {
      this.qOM.setVisibility(8);
      this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.BK()) + " ", this.jYA.getTextSize()));
      if (this.qPg)
      {
        this.qOP.setVisibility(0);
        this.qPm.setVisibility(8);
        if (ab.XR(this.guS.field_username))
        {
          this.qPm.setText(R.l.contact_set_des_only);
          int i = R.h.line_username;
          if (this.qOW != null)
          {
            localObject = this.qOW.findViewById(i);
            if (localObject != null) {
              ((View)localObject).setVisibility(8);
            }
          }
        }
        if ((!this.lXu) || (com.tencent.mm.l.a.gd(this.guS.field_type))) {
          break label578;
        }
        this.qOQ.setVisibility(0);
      }
    }
    for (;;)
    {
      if (ab.gY(this.guS.field_username)) {
        this.jYA.setText("");
      }
      if ((this.mZZ == 76) && (this.guS.field_username != null) && (this.guS.field_username.endsWith("@stranger"))) {
        this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.field_nickname) + " ", this.jYA.getTextSize()));
      }
      if ((this.qOQ.getVisibility() == 0) && (this.qOM.getVisibility() == 0))
      {
        localObject = (LinearLayout.LayoutParams)this.qOM.getLayoutParams();
        ((LinearLayout.LayoutParams)localObject).topMargin = this.mContext.getResources().getDimensionPixelSize(R.f.SmallPadding);
        this.qOM.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      return;
      if (this.qPe)
      {
        this.qOP.setVisibility(0);
        this.qPm.setVisibility(8);
        break;
      }
      if (com.tencent.mm.l.a.gd(this.guS.field_type)) {
        this.qOP.setVisibility(8);
      }
      boolean bool1 = this.qPk.N(this.guS);
      boolean bool2 = this.qPl.N(this.guS);
      if ((!bool1) && (!bool2)) {
        break;
      }
      this.qPm.setVisibility(8);
      break;
      this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.field_conRemark) + " ", this.jYA.getTextSize()));
      this.qOM.setVisibility(0);
      this.qOM.setText(j.a(this.bGc, this.mContext.getString(R.l.contact_info_nickname) + this.guS.BK(), this.qOM.getTextSize()));
      this.qOP.setVisibility(8);
      break;
      label578:
      if (this.qPf)
      {
        this.qOQ.setVisibility(0);
        if (com.tencent.mm.bp.a.fi(this.bGc))
        {
          this.qOQ.setTextSize(0, this.bGc.getResources().getDimensionPixelSize(R.f.HintTextSize));
          this.qOP.setTextSize(0, this.bGc.getResources().getDimensionPixelSize(R.f.HintTextSize));
        }
      }
      else
      {
        this.qOQ.setVisibility(8);
      }
    }
  }
  
  private void cff()
  {
    this.qOT.setClickable(false);
    if (((s.gW(this.guS.field_username)) || (ab.XR(this.guS.field_username))) && (com.tencent.mm.l.a.gd(this.guS.field_type)) && (!com.tencent.mm.model.q.gQ(this.guS.field_username)))
    {
      this.qOT.setVisibility(0);
      if (this.guS.BC())
      {
        this.qOT.setChecked(true);
        this.qPd = true;
        return;
      }
      this.qOT.setChecked(false);
      this.qOT.setVisibility(8);
      this.qPd = false;
      return;
    }
    this.qPd = false;
    this.qOT.setVisibility(8);
  }
  
  private void init()
  {
    this.iAc = false;
    this.lyy = ((ClipboardManager)this.bGc.getSystemService("clipboard"));
  }
  
  private void initView()
  {
    int j = 0;
    if (!bnm()) {
      com.tencent.mm.sdk.platformtools.x.w("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.iAc + "contact = " + this.guS);
    }
    do
    {
      return;
      if (!this.lWr) {
        break;
      }
      this.qOR.setVisibility(0);
      this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.BK()) + " ", this.jYA.getTextSize()));
      bru();
      this.qOX.setVisibility(8);
      this.kkF.setVisibility(8);
      this.qOY.setVisibility(8);
      if ((this.qOY.getVisibility() == 8) && (this.qPm.getVisibility() == 8) && (this.qPl.getVisibility() == 8) && (this.qPk.getVisibility() == 8) && (this.qON.getVisibility() == 8)) {
        this.qOO.setVisibility(8);
      }
      this.qOP.setVisibility(8);
      this.qOQ.setVisibility(8);
      this.qOT.setVisibility(8);
      if (this.qPl != null) {
        this.qPl.setVisibility(8);
      }
      if (this.qPj != null) {
        this.qPj.setVisibility(8);
      }
      if (this.qPk != null) {
        this.qPk.setVisibility(8);
      }
      if (this.qPm != null) {
        this.qPm.setVisibility(8);
      }
    } while (this.qOM == null);
    this.qOM.setVisibility(8);
    return;
    boolean bool = ab.gY(this.guS.field_username);
    label446:
    Object localObject;
    label491:
    int i;
    if (bool)
    {
      this.jYA.setText("");
      if (ab.XV(com.tencent.mm.model.q.GF()).equals(this.guS.field_username))
      {
        this.qOX.setVisibility(0);
        this.qOX.setOnClickListener(new NormalUserHeaderPreference.1(this));
      }
      this.mZF.setVisibility(0);
      this.qPc = true;
      if (this.guS.sex != 1) {
        break label893;
      }
      this.mZF.setImageDrawable(com.tencent.mm.bp.a.f(this.bGc, R.k.ic_sex_male));
      this.mZF.setContentDescription(this.mContext.getString(R.l.profile_sex_male_desc));
      if (this.guS.field_verifyFlag != 0)
      {
        this.qOS.setVisibility(0);
        if (am.a.dBt == null) {
          break label968;
        }
        localObject = BackwardSupportUtil.b.e(am.a.dBt.gX(this.guS.field_verifyFlag), 2.0F);
        this.qOS.setImageBitmap((Bitmap)localObject);
        if (localObject != null) {
          break label974;
        }
        i = 0;
        label507:
        this.qOZ = i;
      }
      bru();
      this.lUo.setOnClickListener(new NormalUserHeaderPreference.2(this));
      if (!ab.XQ(this.guS.field_username)) {
        break label983;
      }
      this.kkF.setText(this.mContext.getString(R.l.app_field_qquin) + this.guS.BM());
      label584:
      if (!s.hH(this.guS.field_username)) {
        break label1296;
      }
      this.qON.setVisibility(0);
      label605:
      cfe();
      cfd();
      cff();
      if (!bi.oW(this.qPi)) {
        break label1308;
      }
      this.qOL.setVisibility(8);
      label636:
      this.qOP.setOnClickListener(new NormalUserHeaderPreference.3(this));
      this.qOQ.setOnClickListener(new NormalUserHeaderPreference.4(this));
      i = j;
      if (this.qPc) {
        i = com.tencent.mm.bp.a.fromDPToPix(this.bGc, 17) + 0;
      }
      j = this.qOZ + i;
      i = j;
      if (this.qPa) {
        i = j + com.tencent.mm.bp.a.fromDPToPix(this.bGc, 27);
      }
      j = i;
      if (this.qPb) {
        j = i + com.tencent.mm.bp.a.fromDPToPix(this.bGc, 27);
      }
      i = j;
      if (this.qPd) {
        i = j + com.tencent.mm.bp.a.fromDPToPix(this.bGc, 30);
      }
      if (!com.tencent.mm.bp.a.fi(this.mContext)) {
        break label1408;
      }
      i += com.tencent.mm.bp.a.fromDPToPix(this.bGc, 88);
    }
    for (;;)
    {
      j = com.tencent.mm.bp.a.fromDPToPix(this.bGc, 60);
      localObject = this.bGc.getResources().getDisplayMetrics();
      this.jYA.setMaxWidth(((DisplayMetrics)localObject).widthPixels - (i + j));
      this.kkF.setLongClickable(true);
      this.kkF.setOnLongClickListener(new NormalUserHeaderPreference.5(this));
      return;
      this.jYA.setText(j.a(this.bGc, bi.oV(this.guS.BK()) + " ", this.jYA.getTextSize()));
      break;
      label893:
      if (this.guS.sex == 2)
      {
        this.mZF.setImageDrawable(com.tencent.mm.bp.a.f(this.bGc, R.k.ic_sex_female));
        this.mZF.setContentDescription(this.mContext.getString(R.l.profile_sex_female_desc));
        break label446;
      }
      if (this.guS.sex != 0) {
        break label446;
      }
      this.mZF.setVisibility(8);
      this.qPc = false;
      break label446;
      label968:
      localObject = null;
      break label491;
      label974:
      i = ((Bitmap)localObject).getWidth();
      break label507;
      label983:
      if (ab.XO(this.guS.field_username))
      {
        this.kkF.setText(this.mContext.getString(R.l.app_field_weibo) + this.guS.BM());
        break label584;
      }
      if (this.lWk)
      {
        if (com.tencent.mm.l.a.gd(this.guS.field_type))
        {
          cfc();
          break label584;
        }
        if ((this.guS.csM == null) || (this.guS.csM.equals("")))
        {
          this.kkF.setText(R.l.app_empty_string);
          break label584;
        }
        this.kkF.setText(this.guS.csM);
        break label584;
      }
      if (bool)
      {
        this.kkF.setText((bi.oV(r.gV(this.guS.getProvince())) + " " + bi.oV(this.guS.getCity())).trim());
        break label584;
      }
      if ((!ab.XP(this.guS.field_username)) && (this.bGc.getIntent().getBooleanExtra("Contact_ShowUserName", true)))
      {
        if ((bi.oW(this.guS.wM())) && ((ab.XT(this.guS.field_username)) || (s.hd(this.guS.field_username))))
        {
          this.kkF.setVisibility(8);
          break label584;
        }
        if (com.tencent.mm.l.a.gd(this.guS.field_type))
        {
          cfc();
          break label584;
        }
      }
      this.kkF.setVisibility(8);
      break label584;
      label1296:
      this.qON.setVisibility(8);
      break label605;
      label1308:
      if ((!com.tencent.mm.model.q.gQ(this.guS.field_username)) && (bi.oV(this.guS.field_conRemark).length() > 0)) {
        this.kkF.setVisibility(8);
      }
      this.qOL.setVisibility(0);
      this.qOL.setText(j.a(this.bGc, this.bGc.getString(R.l.contact_info_chatroom_nickname) + this.qPi, this.qOL.getTextSize()));
      break label636;
      label1408:
      i += com.tencent.mm.bp.a.fromDPToPix(this.bGc, 64);
    }
  }
  
  public final void a(int paramInt, m paramm, Object paramObject)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "onNotifyChange event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    if ((paramObject == null) || (!(paramObject instanceof String))) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoHeader", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
    }
    do
    {
      return;
      paramm = (String)paramObject;
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "onNotifyChange username = " + paramm + ", contact = " + this.guS);
      if (!bnm())
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.iAc + "contact = " + this.guS);
        return;
      }
    } while ((bi.oV(paramm).length() <= 0) || (this.guS == null) || (!this.guS.field_username.equals(paramm)));
    com.tencent.mm.model.au.HU();
    this.guS = c.FR().Yg(paramm);
    ah.A(new NormalUserHeaderPreference.6(this));
  }
  
  public final void a(ab paramab, int paramInt, String paramString)
  {
    boolean bool2 = true;
    onDetach();
    com.tencent.mm.model.au.HU();
    c.FR().a(this);
    com.tencent.mm.model.au.HU();
    c.FS().a(this);
    com.tencent.mm.aa.q.Kp().d(this);
    this.guS = paramab;
    this.mZZ = paramInt;
    this.juZ = paramString;
    this.lWk = this.bGc.getIntent().getBooleanExtra("Contact_IsLBSFriend", false);
    this.qPh = this.bGc.getIntent().getBooleanExtra("Contact_ShowFMessageList", false);
    this.qPe = this.bGc.getIntent().getBooleanExtra("Contact_NeedShowChangeRemarkButton", false);
    this.qPf = this.bGc.getIntent().getBooleanExtra("Contact_NeedShowChangeSnsPreButton", false);
    this.qPg = this.bGc.getIntent().getBooleanExtra("Contact_AlwaysShowRemarkBtn", false);
    this.lXu = this.bGc.getIntent().getBooleanExtra("Contact_AlwaysShowSnsPreBtn", false);
    this.qPi = this.bGc.getIntent().getStringExtra("Contact_RoomNickname");
    if (paramab.field_deleteFlag == 1)
    {
      bool1 = true;
      this.lWr = bool1;
      if (bi.oV(paramab.field_username).length() <= 0) {
        break label233;
      }
    }
    label233:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      Assert.assertTrue("initView: contact username is null", bool1);
      initView();
      return;
      bool1 = false;
      break;
    }
  }
  
  public final void a(bq parambq)
  {
    ah.A(new NormalUserHeaderPreference.7(this, parambq));
  }
  
  public final void bo(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.equals(this.guS.field_username))) {
      this.qPe = paramBoolean;
    }
  }
  
  public final void bp(String paramString, boolean paramBoolean)
  {
    if ((paramString != null) && (paramString.equals(this.guS.field_username))) {
      this.qPf = paramBoolean;
    }
  }
  
  public final void cfc()
  {
    ab.ckV();
    this.kkF.setVisibility(0);
    if (!bi.oW(this.guS.wM()))
    {
      this.kkF.setText(this.mContext.getString(R.l.app_field_username) + this.guS.wM());
      return;
    }
    if ((!ab.XT(this.guS.field_username)) && (!s.hd(this.guS.field_username)))
    {
      String str = bi.oV(this.guS.BM());
      this.kkF.setText(this.mContext.getString(R.l.app_field_username) + str);
      return;
    }
    this.kkF.setVisibility(8);
  }
  
  public final void jX(String paramString)
  {
    if (!bnm()) {
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoHeader", "initView : bindView = " + this.iAc + "contact = " + this.guS);
    }
    do
    {
      return;
      if (bi.oV(paramString).length() <= 0)
      {
        com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoHeader", "notifyChanged: user = " + paramString);
        return;
      }
    } while (!paramString.equals(this.guS.field_username));
    initView();
  }
  
  public final void onBindView(View paramView)
  {
    int j = 0;
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "onBindView");
    this.jYA = ((TextView)paramView.findViewById(R.h.contact_info_nickname_tv));
    this.kkF = ((TextView)paramView.findViewById(R.h.contact_info_username_tv));
    this.qOR = ((TextView)paramView.findViewById(R.h.contact_info_account_deleted_tv));
    this.qOL = ((TextView)paramView.findViewById(R.h.contact_info_chatroom_nickname_tv));
    this.qOM = ((TextView)paramView.findViewById(R.h.contact_info_nickname_when_has_remark_tv));
    this.qOP = ((Button)paramView.findViewById(R.h.contact_info_remarkname_btn));
    this.qOQ = ((Button)paramView.findViewById(R.h.contact_info_snspermission_btn));
    this.qPj = ((ProfileMobilePhoneView)paramView.findViewById(R.h.mobile_phone));
    Object localObject1 = this.qPj;
    com.tencent.mm.model.au.HU();
    ((ProfileMobilePhoneView)localObject1).qGs = ((Boolean)c.DT().get(aa.a.sRf, Boolean.valueOf(false))).booleanValue();
    this.qPk = ((ProfileDescribeView)paramView.findViewById(R.h.desc_info));
    this.qPl = ((ProfileLabelView)paramView.findViewById(R.h.label_info));
    this.qPm = ((TextView)paramView.findViewById(R.h.set_desc_and_label_tv));
    this.qPk.setOnClickListener(this.qPn);
    this.qPl.setOnClickListener(this.qPn);
    this.qPm.setOnClickListener(this.qPn);
    if ((com.tencent.mm.model.q.gQ(this.guS.field_username)) || ((!bi.oW(this.guS.field_username)) && (s.hH(this.guS.field_username))))
    {
      this.qPm.setVisibility(8);
      this.qPj.setVisibility(8);
      this.qPk.setVisibility(8);
      this.qPl.setVisibility(8);
      this.qON = ((TextView)paramView.findViewById(R.h.contact_info_hing_tv));
      this.qOX = ((Button)paramView.findViewById(R.h.contact_info_edit_btn));
      this.qOY = ((FMessageListView)paramView.findViewById(R.h.contact_info_fmessage_listview));
      localObject1 = new a.a();
      ((a.a)localObject1).talker = this.guS.field_username;
      ((a.a)localObject1).scene = this.mZZ;
      ((a.a)localObject1).juZ = this.juZ;
      ((a.a)localObject1).qOy = this.guS.cta;
      ((a.a)localObject1).type = 0;
      if (this.mZZ != 18) {
        break label875;
      }
      ((a.a)localObject1).type = 1;
      label421:
      this.qOY.setFMessageArgs((a.a)localObject1);
      this.qOO = paramView.findViewById(R.h.small_category);
      this.qOW = ((LinearLayout)paramView.findViewById(R.h.head_root));
      this.lUo = ((ImageView)paramView.findViewById(R.h.contact_info_avatar_iv));
      this.mZF = ((ImageView)paramView.findViewById(R.h.contact_info_sex_iv));
      this.qOS = ((ImageView)paramView.findViewById(R.h.contact_info_vuserinfo_iv));
      this.qOT = ((CheckBox)paramView.findViewById(R.h.contact_info_star_iv));
      this.qOU = ((ImageView)paramView.findViewById(R.h.contact_info_sns_iv));
      this.qOV = ((ImageView)paramView.findViewById(R.h.contact_info_sns_black_iv));
      this.iAc = true;
      initView();
      if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
        break label894;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, showFMessageList false");
      this.qOY.setVisibility(8);
      if ((this.qOY.getVisibility() == 8) && (this.qPm.getVisibility() == 8) && (this.qPl.getVisibility() == 8) && (this.qPk.getVisibility() == 8) && (this.qON.getVisibility() == 8)) {
        this.qOO.setVisibility(8);
      }
    }
    for (;;)
    {
      super.onBindView(paramView);
      return;
      localObject1 = this.qPj;
      localObject2 = this.qGi;
      String str = this.qGj;
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.ProfileMobilePhoneView", "phoneNumberByMD5:%s phoneNumberList:%s", new Object[] { localObject2, str });
      ((ProfileMobilePhoneView)localObject1).qGi = ((String)localObject2);
      ((ProfileMobilePhoneView)localObject1).qGj = str;
      ((ProfileMobilePhoneView)localObject1).bnH();
      if (!com.tencent.mm.l.a.gd(this.guS.field_type)) {
        this.qPj.setVisibility(8);
      }
      for (;;)
      {
        boolean bool1 = this.qPk.N(this.guS);
        boolean bool2 = this.qPl.N(this.guS);
        if ((!bool1) && (!bool2)) {
          break label796;
        }
        this.qPm.setVisibility(8);
        break;
        this.qPj.setVisibility(0);
      }
      label796:
      if ((this.qPg) || (this.qPe)) {
        this.qPm.setVisibility(8);
      }
      for (;;)
      {
        if ((this.qPo == null) || ((!this.qPo.equals("ContactWidgetBottleContact")) && (!this.qPo.equals("ContactWidgetQContact")))) {
          break label873;
        }
        this.qPm.setVisibility(8);
        break;
        this.qPm.setVisibility(0);
      }
      label873:
      break;
      label875:
      if (!bd.hd(this.mZZ)) {
        break label421;
      }
      ((a.a)localObject1).type = 2;
      break label421;
      label894:
      if ((this.juZ != null) && (this.juZ.length() != 0)) {
        break label1031;
      }
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, FMessageListView gone, addScene = " + this.mZZ + ", verifyTicket = " + this.juZ);
      this.qOY.setVisibility(8);
      if ((this.qOY.getVisibility() == 8) && (this.qPm.getVisibility() == 8) && (this.qPl.getVisibility() == 8) && (this.qPk.getVisibility() == 8) && (this.qON.getVisibility() == 8)) {
        this.qOO.setVisibility(8);
      }
    }
    label1031:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, scene = " + this.mZZ);
    if (this.mZZ == 18)
    {
      com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is lbs");
      localObject1 = d.SG().YR(this.guS.field_username);
      localObject1 = b.a(this.bGc, (ch[])localObject1);
    }
    for (;;)
    {
      if ((localObject1 != null) && (localObject1.length != 0)) {
        break label1288;
      }
      com.tencent.mm.sdk.platformtools.x.e("MicroMsg.ContactInfoHeader", "initAddContent, providerList is null");
      this.qOY.setVisibility(8);
      if ((this.qOY.getVisibility() != 8) || (this.qPm.getVisibility() != 8) || (this.qPl.getVisibility() != 8) || (this.qPk.getVisibility() != 8) || (this.qON.getVisibility() != 8)) {
        break;
      }
      this.qOO.setVisibility(8);
      break;
      if (bd.hd(this.mZZ))
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is shake");
        localObject1 = d.SH().Zp(this.guS.field_username);
        localObject1 = b.a(this.bGc, (bo[])localObject1);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, scene is other");
        localObject1 = d.SE().YM(this.guS.field_username);
        localObject1 = b.a(this.bGc, (at[])localObject1);
      }
    }
    label1288:
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, providerList size = " + localObject1.length);
    int k = localObject1.length;
    int i = 0;
    while (i < k)
    {
      localObject2 = localObject1[i];
      if (localObject2 != null) {
        com.tencent.mm.sdk.platformtools.x.d("MicroMsg.ContactInfoHeader", "initAddContent, username = " + ((b)localObject2).username + ", nickname = " + ((b)localObject2).nickname + ", digest = " + ((b)localObject2).dzA + ", addScene = " + ((b)localObject2).mZZ);
      }
      i += 1;
    }
    Object localObject2 = this.qOY;
    if (ab.XR(this.guS.field_username)) {}
    for (i = 8;; i = 0)
    {
      ((FMessageListView)localObject2).setVisibility(i);
      if ((this.qOY.getVisibility() == 0) || (this.qPm.getVisibility() == 0) || (this.qPl.getVisibility() == 0) || (this.qPk.getVisibility() == 0) || (this.qON.getVisibility() == 0)) {
        this.qOO.setVisibility(0);
      }
      k = localObject1.length;
      i = j;
      while (i < k)
      {
        localObject2 = localObject1[i];
        this.qOY.a((b)localObject2);
        i += 1;
      }
      break;
    }
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    if (this.qOY != null) {
      this.qOY.detach();
    }
    return super.onCreateView(paramViewGroup);
  }
  
  public final void onDetach()
  {
    if (this.qOY != null) {
      this.qOY.detach();
    }
    if (this.qPh) {
      d.SF().YK(this.guS.field_username);
    }
    this.bGc.getIntent().putExtra("Contact_NeedShowChangeRemarkButton", this.qPe);
    this.bGc.getIntent().putExtra("Contact_NeedShowChangeSnsPreButton", this.qPf);
    com.tencent.mm.model.au.HU();
    c.FR().b(this);
    com.tencent.mm.aa.q.Kp().e(this);
    com.tencent.mm.model.au.HU();
    c.FS().b(this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/pluginsdk/ui/preference/NormalUserHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */