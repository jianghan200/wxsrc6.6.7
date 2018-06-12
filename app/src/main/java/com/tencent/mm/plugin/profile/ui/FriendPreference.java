package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.aa.f;
import com.tencent.mm.aa.f.c;
import com.tencent.mm.aa.q;
import com.tencent.mm.g.c.ai;
import com.tencent.mm.model.au;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.storage.ab;
import com.tencent.mm.storage.ay;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import junit.framework.Assert;

public class FriendPreference
  extends Preference
  implements f.c
{
  private MMActivity bGc;
  private int bVF;
  private TextView eBO;
  private String eHT;
  private ab guS;
  private boolean iAc;
  private TextView lWL;
  private ImageView lWM;
  private ImageView lWN;
  private com.tencent.mm.plugin.account.friend.a.a lWO;
  private String lWP;
  private long lWQ;
  private long lWR;
  
  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.bGc = ((MMActivity)paramContext);
    init();
  }
  
  public FriendPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    setLayoutResource(R.i.mm_preference);
    setWidgetLayoutResource(R.i.mm_preference_submenu);
    init();
  }
  
  private void init()
  {
    this.iAc = false;
    this.guS = null;
    this.lWO = null;
    this.lWP = "";
    this.lWQ = 0L;
    this.lWR = 0L;
    this.bVF = 0;
    this.eHT = "";
  }
  
  private void initView()
  {
    if ((this.guS == null) || (!this.iAc))
    {
      x.d("MicroMsg.FriendPreference", "initView : contact = " + this.guS + " bindView = " + this.iAc);
      return;
    }
    Object localObject1;
    Object localObject9;
    Object localObject7;
    if ((this.lWQ != -1L) && (new o(this.lWQ).longValue() > 0L))
    {
      setWidgetLayoutResource(R.i.mm_preference_submenu_qzone);
      if ((this.guS == null) || (!this.iAc))
      {
        x.d("MicroMsg.FriendPreference", "initView : contact = " + this.guS + " bindView = " + this.iAc);
        return;
      }
      this.bVF = 2;
      this.eBO.setText(this.mContext.getString(R.l.contact_info_friendtype_qq));
      localObject1 = bi.oV(this.lWP);
      localObject1 = (String)localObject1 + " " + new o(this.lWQ).longValue();
      this.lWL.setText((CharSequence)localObject1);
      localObject1 = com.tencent.mm.aa.c.aY(this.lWQ);
      if (localObject1 != null) {
        break label1134;
      }
      localObject9 = null;
      localObject7 = null;
    }
    label412:
    label1001:
    label1131:
    label1134:
    for (;;)
    {
      Bitmap localBitmap;
      try
      {
        localInputStream1 = this.mContext.getResources().openRawResource(R.k.default_qq_avatar);
        localObject7 = localInputStream1;
        localObject9 = localInputStream1;
        localBitmap = com.tencent.mm.compatible.g.a.decodeStream(localInputStream1);
        localObject7 = localBitmap;
        localObject1 = localObject7;
      }
      catch (Exception localException7)
      {
        InputStream localInputStream1;
        localObject9 = localObject7;
        x.printErrStackTrace("MicroMsg.FriendPreference", localException7, "", new Object[0]);
        if (localObject7 == null) {
          break label1134;
        }
        try
        {
          ((InputStream)localObject7).close();
        }
        catch (Exception localException3)
        {
          x.printErrStackTrace("MicroMsg.FriendPreference", localException3, "", new Object[0]);
        }
        continue;
      }
      finally
      {
        if (localObject9 == null) {
          break label412;
        }
      }
      try
      {
        localInputStream1.close();
        localObject1 = localObject7;
      }
      catch (Exception localException1)
      {
        x.printErrStackTrace("MicroMsg.FriendPreference", localException1, "", new Object[0]);
        localObject2 = localObject7;
        continue;
      }
      if (localObject1 != null)
      {
        localObject7 = Bitmap.createScaledBitmap((Bitmap)localObject1, 48, 48, false);
        if (localObject7 != localObject1) {
          ((Bitmap)localObject1).recycle();
        }
        localObject1 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject7, true, 0.0F);
        this.lWM.setImageBitmap((Bitmap)localObject1);
      }
      au.HU();
      if (com.tencent.mm.model.c.isSDCardAvailable()) {
        break;
      }
      this.lWM.setBackgroundDrawable(com.tencent.mm.bp.a.f(this.bGc, R.k.default_avatar));
      return;
      try
      {
        Object localObject2;
        ((InputStream)localObject9).close();
        throw ((Throwable)localObject3);
      }
      catch (Exception localException4)
      {
        for (;;)
        {
          x.printErrStackTrace("MicroMsg.FriendPreference", localException4, "", new Object[0]);
        }
      }
      Object localObject4;
      Object localObject8;
      if (this.lWO != null)
      {
        setWidgetLayoutResource(R.i.mm_preference_more);
        if ((this.guS == null) || (!this.iAc))
        {
          x.d("MicroMsg.FriendPreference", "initView : contact = " + this.guS + " bindView = " + this.iAc);
          return;
        }
        if (this.lWO == null) {
          break;
        }
        this.bVF = 1;
        this.eBO.setText(this.mContext.getString(R.l.contact_info_friendtype_mobile));
        localObject4 = bi.oV(this.lWO.Xj()) + " " + bi.oV(this.lWO.Xp()).replace(" ", "");
        this.lWL.setText((CharSequence)localObject4);
        localObject8 = l.b(this.lWO.Xi(), this.mContext);
        if (localObject8 == null) {
          this.lWM.setImageDrawable(com.tencent.mm.bp.a.f(this.bGc, R.k.default_mobile_avatar));
        }
        for (;;)
        {
          au.HU();
          if (!com.tencent.mm.model.c.FR().Yc(this.lWO.getUsername())) {
            break;
          }
          this.lWN.setOnClickListener(new FriendPreference.1(this, (String)localObject4));
          return;
          localObject8 = com.tencent.mm.sdk.platformtools.c.a(Bitmap.createScaledBitmap((Bitmap)localObject8, 48, 48, false), true, 0.0F);
          this.lWM.setImageBitmap((Bitmap)localObject8);
        }
        this.lWN.setVisibility(4);
        return;
      }
      if (this.lWR > 0L)
      {
        if ((this.guS == null) || (!this.iAc))
        {
          x.d("MicroMsg.FriendPreference", "initView : contact = " + this.guS + " bindView = " + this.iAc);
          return;
        }
        this.bVF = 3;
        this.eBO.setText(this.mContext.getString(R.l.hardcode_plugin_facebookapp_nick));
        this.lWL.setText(bi.oV(this.guS.csB));
        localObject4 = com.tencent.mm.aa.c.jI(this.lWR);
        if (localObject4 != null) {
          break label1131;
        }
        localObject9 = null;
        localObject8 = null;
      }
      for (;;)
      {
        try
        {
          localInputStream2 = this.mContext.getResources().openRawResource(R.k.default_qq_avatar);
          localObject8 = localInputStream2;
          localObject9 = localInputStream2;
          localBitmap = com.tencent.mm.compatible.g.a.decodeStream(localInputStream2);
          localObject8 = localBitmap;
          localObject4 = localObject8;
        }
        catch (Exception localException8)
        {
          InputStream localInputStream2;
          localObject9 = localObject8;
          x.printErrStackTrace("MicroMsg.FriendPreference", localException8, "", new Object[0]);
          if (localObject8 == null) {
            break label1131;
          }
          try
          {
            ((InputStream)localObject8).close();
          }
          catch (Exception localException5)
          {
            x.printErrStackTrace("MicroMsg.FriendPreference", localException5, "", new Object[0]);
          }
          continue;
        }
        finally
        {
          if (localObject9 == null) {
            break label1001;
          }
        }
        try
        {
          localInputStream2.close();
          localObject4 = localObject8;
        }
        catch (Exception localException2)
        {
          x.printErrStackTrace("MicroMsg.FriendPreference", localException2, "", new Object[0]);
          localObject5 = localObject8;
          continue;
        }
        if (localObject4 != null)
        {
          localObject8 = Bitmap.createScaledBitmap((Bitmap)localObject4, 48, 48, false);
          if (localObject8 != localObject4) {
            ((Bitmap)localObject4).recycle();
          }
          localObject4 = com.tencent.mm.sdk.platformtools.c.a((Bitmap)localObject8, true, 0.0F);
          this.lWM.setImageBitmap((Bitmap)localObject4);
        }
        au.HU();
        if (com.tencent.mm.model.c.isSDCardAvailable()) {
          break;
        }
        this.lWM.setBackgroundDrawable(com.tencent.mm.bp.a.f(this.bGc, R.k.default_avatar));
        return;
        try
        {
          Object localObject5;
          ((InputStream)localObject9).close();
          throw ((Throwable)localObject6);
        }
        catch (Exception localException6)
        {
          for (;;)
          {
            x.printErrStackTrace("MicroMsg.FriendPreference", localException6, "", new Object[0]);
          }
        }
        if (!TextUtils.isEmpty(this.eHT))
        {
          if ((this.guS == null) || (!this.iAc))
          {
            x.d("MicroMsg.FriendPreference", "initView : contact = " + this.guS + " bindView = " + this.iAc);
            return;
          }
          this.bVF = 3;
          this.eBO.setText(this.mContext.getString(R.l.regby_email_address));
          this.lWL.setText(bi.oV(this.eHT));
          this.lWM.setVisibility(8);
          return;
        }
        Assert.assertTrue(false);
        return;
      }
    }
  }
  
  private boolean q(String paramString, Bitmap paramBitmap)
  {
    if (paramBitmap != null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
      return l.a(paramString, this.mContext, localByteArrayOutputStream.toByteArray());
    }
    return false;
  }
  
  public final boolean auw()
  {
    q.Kp().e(this);
    return true;
  }
  
  public final void jX(String paramString)
  {
    long l = com.tencent.mm.aa.c.jK(paramString);
    if ((l > 0L) && (this.lWQ == l) && (com.tencent.mm.aa.c.a(paramString, false, -1) != null)) {
      initView();
    }
    if ((com.tencent.mm.aa.c.jJ(paramString) == this.lWR) && (com.tencent.mm.aa.c.a(paramString, false, -1) != null)) {
      initView();
    }
  }
  
  public final void onBindView(View paramView)
  {
    this.eBO = ((TextView)paramView.findViewById(R.h.title));
    this.lWL = ((TextView)paramView.findViewById(R.h.summary));
    this.lWM = ((ImageView)paramView.findViewById(R.h.image_iv));
    this.lWN = ((ImageView)paramView.findViewById(R.h.mobile_preference_more));
    this.iAc = true;
    initView();
    super.onBindView(paramView);
  }
  
  protected final View onCreateView(ViewGroup paramViewGroup)
  {
    paramViewGroup = super.onCreateView(paramViewGroup);
    LayoutInflater localLayoutInflater = (LayoutInflater)this.mContext.getSystemService("layout_inflater");
    ViewGroup localViewGroup = (ViewGroup)paramViewGroup.findViewById(R.h.content);
    localViewGroup.removeAllViews();
    localLayoutInflater.inflate(R.i.mm_preference_content_friend, localViewGroup);
    return paramViewGroup;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/profile/ui/FriendPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */