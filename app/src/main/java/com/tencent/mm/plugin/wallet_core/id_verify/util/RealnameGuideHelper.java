package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.aa.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

public class RealnameGuideHelper
  implements Parcelable
{
  public static final Parcelable.Creator<RealnameGuideHelper> CREATOR = new RealnameGuideHelper.1();
  private int eLd;
  private String kRs;
  private String kRt;
  private String kRu = "";
  private String kRv = "";
  private String kRw = "";
  private SetPwdInfo pkV;
  private boolean pkW = false;
  
  public RealnameGuideHelper() {}
  
  protected RealnameGuideHelper(Parcel paramParcel)
  {
    this.pkV = ((SetPwdInfo)paramParcel.readParcelable(SetPwdInfo.class.getClassLoader()));
    this.kRs = paramParcel.readString();
    this.kRt = paramParcel.readString();
    this.kRu = paramParcel.readString();
    this.kRv = paramParcel.readString();
    this.kRw = paramParcel.readString();
    if (paramParcel.readByte() != 0) {}
    for (boolean bool = true;; bool = false)
    {
      this.pkW = bool;
      this.eLd = paramParcel.readInt();
      return;
    }
  }
  
  public final void a(String paramString1, SetPwdInfo paramSetPwdInfo, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    this.pkV = paramSetPwdInfo;
    this.kRs = paramString1;
    this.kRt = paramString2;
    this.kRu = paramString3;
    this.kRv = paramString4;
    this.kRw = paramString5;
    this.eLd = paramInt;
  }
  
  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, int paramInt)
  {
    a(paramString1, null, paramString2, paramString3, paramString4, paramString5, paramInt);
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    com.tencent.mm.sdk.platformtools.x.d("MicroMsg.RealnameGuideHelper", "doIfNeedSetPwd sendPwdMsg %s mEntryScene %s guide_wording %s upload_credit_url %s left_button_wording %s right_button_wording %s hadShow %s guide_flag %s", new Object[] { this.pkV, Integer.valueOf(this.eLd), this.kRt, this.kRw, this.kRu, this.kRv, Boolean.valueOf(this.pkW), this.kRs });
    boolean bool2;
    if (this.pkW)
    {
      bool2 = false;
      return bool2;
    }
    if ((this.pkV != null) && (this.pkV.plg == 1))
    {
      int i = this.eLd;
      String str2 = this.pkV.kRt;
      Object localObject2 = this.pkV.kRu;
      String str1 = this.pkV.kRv;
      g.Ek();
      int j = ((Integer)g.Ei().DT().get(aa.a.sYy, Integer.valueOf(0))).intValue();
      com.tencent.mm.sdk.platformtools.x.i("MicroMsg.RealnameVerifyUtil", "showSetPwdDialog count %s", new Object[] { Integer.valueOf(j) });
      if (j >= 3) {}
      for (boolean bool1 = false;; bool1 = true)
      {
        bool2 = bool1;
        if (!bool1) {
          break;
        }
        bool2 = bool1;
        if (this.pkW) {
          break;
        }
        this.pkW = true;
        return bool1;
        g.Ek();
        g.Ei().DT().a(aa.a.sYy, Integer.valueOf(j + 1));
        Object localObject1 = localObject2;
        if (bi.oW((String)localObject2)) {
          localObject1 = paramMMActivity.getString(a.i.app_cancel);
        }
        localObject2 = str1;
        if (bi.oW(str1)) {
          localObject2 = paramMMActivity.getString(a.i.app_ok);
        }
        paramBundle = h.a(paramMMActivity, str2, "", (String)localObject2, (String)localObject1, new a.3(paramBundle, i, paramMMActivity), paramOnClickListener, a.c.wechat_green);
        if (paramBundle != null)
        {
          paramBundle.setOnCancelListener(new a.4(paramMMActivity));
          paramBundle.setOnDismissListener(new a.5(paramMMActivity));
        }
      }
    }
    return false;
  }
  
  public final boolean a(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener, boolean paramBoolean)
  {
    if (this.pkW) {}
    do
    {
      return false;
      if ("1".equals(this.kRs))
      {
        if (!this.pkW) {
          this.pkW = true;
        }
        return a.a(paramMMActivity, paramBundle, this.eLd);
      }
    } while ((!"2".equals(this.kRs)) || (bi.oW(this.kRw)));
    if (!this.pkW) {
      this.pkW = true;
    }
    return a.a(paramMMActivity, this.kRt, this.kRw, this.kRu, this.kRv, paramBoolean, paramOnClickListener);
  }
  
  public final boolean b(MMActivity paramMMActivity, Bundle paramBundle, DialogInterface.OnClickListener paramOnClickListener)
  {
    return a(paramMMActivity, paramBundle, paramOnClickListener, false);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeParcelable(this.pkV, paramInt);
    paramParcel.writeString(this.kRs);
    paramParcel.writeString(this.kRt);
    paramParcel.writeString(this.kRu);
    paramParcel.writeString(this.kRv);
    paramParcel.writeString(this.kRw);
    if (this.pkW) {}
    for (paramInt = 1;; paramInt = 0)
    {
      paramParcel.writeByte((byte)paramInt);
      paramParcel.writeInt(this.eLd);
      return;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/wallet_core/id_verify/util/RealnameGuideHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */