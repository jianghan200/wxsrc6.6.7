package com.tencent.mm.plugin.ipcall.ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.o;
import com.tencent.mm.model.au;
import com.tencent.mm.model.q;
import com.tencent.mm.protocal.c.akc;
import com.tencent.mm.protocal.c.ccm;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.i.a.a;
import com.tencent.mm.ui.i.a.c;
import com.tencent.mm.ui.s;
import java.util.HashMap;

public class IPCallShareCouponCardUI
  extends MMActivity
  implements com.tencent.mm.ab.e, a.a, com.tencent.mm.ui.i.a.b
{
  private int BV = 0;
  private String cZG = null;
  private String cZH = null;
  private ProgressDialog eHw = null;
  private View fY;
  private ProgressDialog kuy = null;
  private TextView kxK;
  private TextView kxL;
  private TextView kxM;
  private TextView kxN;
  private Button kxO;
  private ImageView kxP;
  private com.tencent.mm.ui.i.a kxQ = new com.tencent.mm.ui.i.a();
  private ProgressDialog kxR = null;
  private i kxS = null;
  private ImageView kxT = null;
  private ProgressBar kxU = null;
  private com.tencent.mm.plugin.ipcall.a.e.e kxV = new com.tencent.mm.plugin.ipcall.a.e.e();
  private String kxW = null;
  private String kxX = null;
  private String kxY = null;
  private String kxZ = null;
  private String kya = null;
  private String kyb = null;
  private String kyc = null;
  private String kyd = null;
  private String kye = null;
  private ccm kyf = null;
  private String kyg = null;
  private View kyh;
  
  /* Error */
  private static byte[] Fg(String paramString)
  {
    // Byte code:
    //   0: invokestatic 121	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   3: pop
    //   4: invokestatic 127	com/tencent/mm/model/c:Gb	()Ljava/lang/String;
    //   7: astore_1
    //   8: invokestatic 121	com/tencent/mm/model/au:HU	()Lcom/tencent/mm/model/c;
    //   11: pop
    //   12: aload_1
    //   13: invokestatic 130	com/tencent/mm/model/c:Gc	()Ljava/lang/String;
    //   16: ldc -124
    //   18: aload_0
    //   19: invokevirtual 138	java/lang/String:getBytes	()[B
    //   22: invokestatic 144	com/tencent/mm/a/g:u	([B)Ljava/lang/String;
    //   25: ldc -110
    //   27: invokestatic 152	com/tencent/mm/sdk/platformtools/h:f	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_0
    //   31: aload_0
    //   32: invokestatic 158	com/tencent/mm/sdk/platformtools/bi:oW	(Ljava/lang/String;)Z
    //   35: ifeq +12 -> 47
    //   38: ldc -96
    //   40: ldc -94
    //   42: invokestatic 168	com/tencent/mm/sdk/platformtools/x:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   45: aconst_null
    //   46: areturn
    //   47: new 170	java/io/RandomAccessFile
    //   50: dup
    //   51: aload_0
    //   52: ldc -84
    //   54: invokespecial 174	java/io/RandomAccessFile:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   57: astore_1
    //   58: aload_1
    //   59: astore_0
    //   60: aload_1
    //   61: invokevirtual 178	java/io/RandomAccessFile:length	()J
    //   64: l2i
    //   65: newarray <illegal type>
    //   67: astore_2
    //   68: aload_1
    //   69: astore_0
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual 182	java/io/RandomAccessFile:read	([B)I
    //   75: pop
    //   76: aload_1
    //   77: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   80: aload_2
    //   81: areturn
    //   82: astore_2
    //   83: aconst_null
    //   84: astore_1
    //   85: aload_1
    //   86: astore_0
    //   87: ldc -96
    //   89: aload_2
    //   90: ldc -69
    //   92: iconst_0
    //   93: anewarray 189	java/lang/Object
    //   96: invokestatic 193	com/tencent/mm/sdk/platformtools/x:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   99: aload_1
    //   100: ifnull -55 -> 45
    //   103: aload_1
    //   104: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   107: aconst_null
    //   108: areturn
    //   109: astore_0
    //   110: aconst_null
    //   111: areturn
    //   112: astore_1
    //   113: aconst_null
    //   114: astore_0
    //   115: aload_0
    //   116: ifnull +7 -> 123
    //   119: aload_0
    //   120: invokevirtual 185	java/io/RandomAccessFile:close	()V
    //   123: aload_1
    //   124: athrow
    //   125: astore_0
    //   126: goto -46 -> 80
    //   129: astore_0
    //   130: goto -7 -> 123
    //   133: astore_1
    //   134: goto -19 -> 115
    //   137: astore_2
    //   138: goto -53 -> 85
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	141	0	paramString	String
    //   7	97	1	localObject1	Object
    //   112	12	1	localObject2	Object
    //   133	1	1	localObject3	Object
    //   67	14	2	arrayOfByte	byte[]
    //   82	8	2	localException1	Exception
    //   137	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   47	58	82	java/lang/Exception
    //   103	107	109	java/lang/Exception
    //   47	58	112	finally
    //   76	80	125	java/lang/Exception
    //   119	123	129	java/lang/Exception
    //   60	68	133	finally
    //   70	76	133	finally
    //   87	99	133	finally
    //   60	68	137	java/lang/Exception
    //   70	76	137	java/lang/Exception
  }
  
  public static String H(Context paramContext, int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), paramContext.getString(R.l.ip_call_share_copy_invite_url_tip));
    localHashMap.put(Integer.valueOf(0), paramContext.getString(R.l.wechat_friend));
    localHashMap.put(Integer.valueOf(1), paramContext.getString(R.l.ip_call_share_timeline_tip));
    localHashMap.put(Integer.valueOf(3), paramContext.getString(R.l.ip_call_share_email_tip));
    localHashMap.put(Integer.valueOf(2), paramContext.getString(R.l.ip_call_share_sms_tip));
    localHashMap.put(Integer.valueOf(5), paramContext.getString(R.l.ip_call_share_twitter_tip));
    localHashMap.put(Integer.valueOf(4), paramContext.getString(R.l.ip_call_share_whatsapp_tip));
    localHashMap.put(Integer.valueOf(6), paramContext.getString(R.l.ip_call_share_facebook_tip));
    localHashMap.put(Integer.valueOf(7), paramContext.getString(R.l.ip_call_share_facebook_messenger_tip));
    if (localHashMap.containsKey(Integer.valueOf(paramInt))) {
      return (String)localHashMap.get(Integer.valueOf(paramInt));
    }
    return null;
  }
  
  public static void a(Context paramContext, int paramInt, TextView paramTextView, ImageView paramImageView)
  {
    paramContext = H(paramContext, paramInt);
    if (paramContext != null) {
      paramTextView.setText(paramContext);
    }
    paramInt = rH(paramInt);
    if (paramInt != -1) {
      paramImageView.setImageResource(paramInt);
    }
  }
  
  private static Bitmap aYp()
  {
    byte[] arrayOfByte = Fg(q.GF());
    if (arrayOfByte == null) {
      return null;
    }
    return com.tencent.mm.sdk.platformtools.c.bs(arrayOfByte);
  }
  
  private static boolean au(Context paramContext, String paramString)
  {
    if (bi.oW(paramString)) {
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  private void l(int paramInt, String paramString1, String paramString2)
  {
    this.kyh = View.inflate(this.mController.tml, R.i.confirm_dialog_item, null);
    EditText localEditText = (EditText)this.kyh.findViewById(R.h.confirm_dialog_text_et);
    this.kxT = ((ImageView)this.kyh.findViewById(R.h.confirm_dialog_imageview));
    this.kxU = ((ProgressBar)this.kyh.findViewById(R.h.loading_pb));
    localEditText.setText(paramString1);
    Object localObject = aYp();
    if (localObject == null)
    {
      localObject = q.GF();
      au.HU();
      localObject = new com.tencent.mm.as.a((String)localObject, bi.f((Integer)com.tencent.mm.model.c.DT().get(66561, null)));
      au.DF().a((com.tencent.mm.ab.l)localObject, 0);
      this.kxU.setVisibility(0);
    }
    for (;;)
    {
      com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, paramString2, this.kyh, getResources().getString(R.l.app_send), new IPCallShareCouponCardUI.5(this, localEditText, paramString1, paramInt));
      return;
      if (this.kxT != null) {
        this.kxT.setImageBitmap((Bitmap)localObject);
      }
    }
  }
  
  public static int rH(int paramInt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(8), Integer.valueOf(R.k.bottomsheet_copy));
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(R.k.bottomsheet_repost));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(R.k.bottomsheet_moment));
    localHashMap.put(Integer.valueOf(3), Integer.valueOf(R.k.bottomsheet_email));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(R.k.bottomsheet_sms));
    localHashMap.put(Integer.valueOf(5), Integer.valueOf(R.k.bottomsheet_twitter));
    localHashMap.put(Integer.valueOf(4), Integer.valueOf(R.k.bottomsheet_whatsapp));
    localHashMap.put(Integer.valueOf(6), Integer.valueOf(R.k.bottomsheet_facebook));
    localHashMap.put(Integer.valueOf(7), Integer.valueOf(R.k.bottomsheet_messenger));
    if (localHashMap.containsKey(Integer.valueOf(paramInt))) {
      return ((Integer)localHashMap.get(Integer.valueOf(paramInt))).intValue();
    }
    return -1;
  }
  
  private void rI(int paramInt)
  {
    com.tencent.mm.ui.base.h.a(this.mController.tml, paramInt, R.l.app_tip, new IPCallShareCouponCardUI.14(this), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt) {}
    });
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    String str;
    Object localObject1;
    label293:
    Object localObject2;
    if ((paraml instanceof com.tencent.mm.plugin.ipcall.a.d.g)) {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.fY.setVisibility(0);
        paramString = com.tencent.mm.plugin.ipcall.b.c.aYD();
        if (paramString != null)
        {
          this.kxW = paramString.rMH;
          this.cZG = paramString.jOS;
          this.kxX = paramString.rMI;
          this.cZH = paramString.bHD;
          this.kxY = paramString.ksB;
          this.kxZ = paramString.rMJ;
          this.kyb = paramString.rMK;
          this.kyc = paramString.rML;
          this.kyd = paramString.rMM;
          this.kye = paramString.rMO;
          this.kyf = paramString.rMN;
          this.kyg = paramString.rMP;
        }
        this.kxK.setText(this.kye);
        this.kxL.setText(String.format(this.mController.tml.getString(R.l.ipcall_share_coupon_card_code_desc), new Object[] { this.kxW }));
        this.kxO.setOnClickListener(new IPCallShareCouponCardUI.11(this));
        this.kxM.setText(String.format(getString(R.l.ipcall_share_coupon_card_content_title), new Object[] { this.kye }));
        paraml = this.kxN;
        str = String.format(getString(R.l.ipcall_share_coupon_card_content_desc), new Object[] { this.kye });
        localObject1 = getString(R.l.ipcall_share_coupon_card_rule);
        if (bi.oW((String)localObject1))
        {
          paraml.setText(str);
          if ((this.kuy != null) && (this.kuy.isShowing())) {
            this.kuy.dismiss();
          }
          return;
        }
        paramString = getString(R.l.ipcall_share_coupon_promotion_desc);
        localObject2 = paraml.getPaint();
        float f1 = ((TextPaint)localObject2).measureText(str);
        float f2 = ((TextPaint)localObject2).measureText(paramString);
        paramInt1 = com.tencent.mm.bp.a.fk(this.mController.tml);
        paramInt2 = ((LinearLayout.LayoutParams)paraml.getLayoutParams()).leftMargin;
        paramInt1 -= ((LinearLayout.LayoutParams)paraml.getLayoutParams()).rightMargin + paramInt2;
        paramInt2 = (int)Math.ceil(f1 / paramInt1);
        int i = (int)Math.ceil((f1 + f2) / paramInt1);
        paramInt1 = paramInt2;
        if (paramInt2 == 0) {
          paramInt1 = 1;
        }
        if (i <= paramInt1) {
          break label715;
        }
        paramString = "\n" + paramString;
      }
    }
    label715:
    for (;;)
    {
      paraml.setGravity(17);
      localObject2 = Spannable.Factory.getInstance().newSpannable(str + paramString);
      localObject1 = new IPCallShareCouponCardUI.6(this, (String)localObject1);
      paramInt1 = str.length();
      paramInt2 = str.length();
      ((Spannable)localObject2).setSpan(localObject1, paramInt1, paramString.length() + paramInt2, 33);
      paraml.setText((CharSequence)localObject2);
      paraml.setMovementMethod(LinkMovementMethod.getInstance());
      break;
      if ((this.kuy == null) || (!this.kuy.isShowing())) {
        break label293;
      }
      this.kuy.dismiss();
      com.tencent.mm.ui.base.h.a(this.mController.tml, getString(R.l.ip_call_load_error_tip), getString(R.l.ip_call_func_name), new IPCallShareCouponCardUI.10(this));
      return;
      if ((paraml instanceof com.tencent.mm.modelmulti.h))
      {
        if (this.eHw != null)
        {
          this.eHw.dismiss();
          this.eHw = null;
        }
        if (com.tencent.mm.plugin.subapp.b.ezo.b(this.mController.tml, paramInt1, paramInt2, paramString)) {
          break label293;
        }
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          com.tencent.mm.ui.base.h.i(this.mController.tml, R.l.sendrequest_send_fail, R.l.app_tip);
          return;
        }
        com.tencent.mm.ui.base.h.bA(this, getResources().getString(R.l.confirm_dialog_sent));
        return;
      }
      if ((!(paraml instanceof com.tencent.mm.as.a)) || (paramInt1 != 0) || (paramInt2 != 0) || (this.kxT == null)) {
        break label293;
      }
      if (this.kxU != null) {
        this.kxU.setVisibility(8);
      }
      this.kxT.setImageBitmap(aYp());
      return;
    }
  }
  
  public final void a(a.c paramc)
  {
    if (this.kxR != null) {
      this.kxR.cancel();
    }
    switch (IPCallShareCouponCardUI.8.kyp[paramc.ordinal()])
    {
    case 2: 
    default: 
      return;
    case 1: 
      rI(R.l.twitterlogin_success);
      return;
    }
    rI(R.l.twitterlogin_failed);
  }
  
  public final void b(a.c paramc) {}
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.ip_call_coupons_share_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if ((paramInt1 == 1) && (paramIntent != null))
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      if (!bi.oW(paramIntent)) {
        com.tencent.mm.pluginsdk.ui.applet.g.a(this.mController, this.cZH, this.kxX, this.cZG, true, getResources().getString(R.l.app_send), new IPCallShareCouponCardUI.7(this, paramIntent));
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setMMTitle(R.l.ipcall_share_coupon_card_title);
    setBackBtn(new IPCallShareCouponCardUI.1(this));
    this.fY = findViewById(R.h.layout);
    this.kxK = ((TextView)findViewById(R.h.coupon_money_tv));
    this.kxL = ((TextView)findViewById(R.h.data_wording_tv));
    this.kxM = ((TextView)findViewById(R.h.coupon_big_tips_tv));
    this.kxN = ((TextView)findViewById(R.h.coupon_small_tips_tv));
    this.kxO = ((Button)findViewById(R.h.share_btn));
    this.kxP = ((ImageView)findViewById(R.h.header_icon));
    this.fY.setVisibility(8);
    com.tencent.mm.pluginsdk.ui.a.b.a(this.kxP, q.GF(), 0.5F, false);
    paramBundle = this.mController.tml;
    getString(R.l.app_tip);
    this.kuy = com.tencent.mm.ui.base.h.a(paramBundle, getString(R.l.ip_call_loading_tip), true, new IPCallShareCouponCardUI.9(this));
    com.tencent.mm.plugin.ipcall.a.f.b.aXT().fY(false);
    this.BV = getIntent().getIntExtra("IPCallShareCouponCardUI_KFrom", 0);
    au.DF().a(257, this);
    au.DF().a(1804, this);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    au.DF().b(257, this);
    au.DF().b(1804, this);
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/ipcall/ui/IPCallShareCouponCardUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */