package com.tencent.mm.plugin.facedetect.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.tencent.mm.ab.e;
import com.tencent.mm.ab.o;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.facedetect.a.e;
import com.tencent.mm.plugin.facedetect.a.g;
import com.tencent.mm.plugin.facedetect.a.h;
import com.tencent.mm.plugin.facedetect.model.FaceDetectReporter;
import com.tencent.mm.plugin.facedetect.model.k;
import com.tencent.mm.protocal.c.bbt;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;

@a(3)
public class FaceDetectConfirmUI
  extends MMActivity
  implements e
{
  private String appId;
  private String fWF;
  private String grA;
  private String iMx = null;
  private String iMy = null;
  private String iMz = null;
  private TextView iPT;
  private Button iPU;
  private CheckBox iPV;
  private TextView iPW;
  private TextView iPX;
  private bbt iPY = null;
  private int iPZ;
  private com.tencent.mm.ui.base.p tipDialog;
  
  private void aKo()
  {
    Intent localIntent = new Intent();
    localIntent.putExtra("err_code", k.py(90024));
    localIntent.putExtra("err_msg", "user cancel in confirm ui");
    FaceDetectReporter.aJU().a(this.iPZ, false, 3, 1, 90024);
    FaceDetectReporter.aJU().iOi = System.currentTimeMillis();
    FaceDetectReporter.aJU().bl(this.grA, this.iPZ);
    setResult(0, localIntent);
    finish();
  }
  
  private void dismissDialog()
  {
    if ((this.tipDialog != null) && (this.tipDialog.isShowing())) {
      this.tipDialog.dismiss();
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ab.l paraml)
  {
    x.i("MicroMsg.FaceDetectConfirmUI", "alvinluo scene: %d, errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paraml.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    bbt localbbt;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      this.iPY = ((com.tencent.mm.plugin.facedetect.b.l)paraml).iMw;
      this.iMx = ((com.tencent.mm.plugin.facedetect.b.l)paraml).iMx;
      this.iMy = ((com.tencent.mm.plugin.facedetect.b.l)paraml).iMy;
      this.iMz = ((com.tencent.mm.plugin.facedetect.b.l)paraml).iMz;
      if (bi.oW(this.iMx)) {
        this.iMx = getString(a.h.face_confirm_tips);
      }
      dismissDialog();
      this.iPU.setEnabled(true);
      this.iPT.setText(this.iMx);
      if (this.iPY != null)
      {
        x.v("MicroMsg.FaceDetectConfirmUI", "alvinluo provider wording: %s, url_wording: %s, url: %s", new Object[] { this.iPY.bSc, this.iPY.seb, this.iPY.url });
        localbbt = this.iPY;
        x.i("MicroMsg.FaceDetectConfirmUI", "alvinluo protocol info: %s", new Object[] { localbbt.bSc });
        if (!bi.oW(localbbt.bSc)) {
          break label419;
        }
        paramString = getString(a.h.face_confirm_protocol_tips);
        if (!bi.oW(localbbt.seb)) {
          break label428;
        }
        paraml = getString(a.h.face_confirm_protocol_details);
        label252:
        Spannable localSpannable = Spannable.Factory.getInstance().newSpannable(paramString + paraml);
        localSpannable.setSpan(new FaceDetectConfirmUI.6(this, localbbt), paramString.length(), paramString.length() + paraml.length(), 33);
        this.iPV.setVisibility(0);
        this.iPW.setVisibility(0);
        this.iPW.setText(localSpannable);
        this.iPW.setMovementMethod(LinkMovementMethod.getInstance());
        if (localbbt.sec != 0) {
          break label438;
        }
        this.iPV.setChecked(false);
        this.iPU.setEnabled(false);
        label371:
        this.iPX.setText(getString(a.h.face_confirm_complain_tips));
        this.iPX.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            try
            {
              if (FaceDetectConfirmUI.f(FaceDetectConfirmUI.this) != null) {}
              for (paramAnonymousView = FaceDetectConfirmUI.f(FaceDetectConfirmUI.this);; paramAnonymousView = "")
              {
                paramAnonymousView = com.tencent.mm.compatible.util.p.encode(String.format("appid=%s", new Object[] { paramAnonymousView }), "UTF-8");
                paramAnonymousView = FaceDetectConfirmUI.g(FaceDetectConfirmUI.this) + "?customInfo=" + paramAnonymousView;
                x.i("MicroMsg.FaceDetectConfirmUI", "alvinluo jump realUrl: %s", new Object[] { paramAnonymousView });
                FaceDetectConfirmUI.a(FaceDetectConfirmUI.this, paramAnonymousView);
                return;
              }
              return;
            }
            catch (Exception paramAnonymousView)
            {
              x.printErrStackTrace("MicroMsg.FaceDetectConfirmUI", paramAnonymousView, "alvinluo jumpToWebView exception", new Object[0]);
            }
          }
        });
        this.iPX.setVisibility(0);
      }
    }
    for (;;)
    {
      g.DF().b(1147, this);
      return;
      label419:
      paramString = localbbt.bSc;
      break;
      label428:
      paraml = localbbt.seb;
      break label252;
      label438:
      if (localbbt.sec != 1) {
        break label371;
      }
      this.iPV.setChecked(true);
      this.iPU.setEnabled(true);
      break label371;
      paraml = paramString;
      if (bi.oW(paramString)) {
        paraml = getString(a.h.face_get_confirm_info_failed_tips);
      }
      dismissDialog();
      h.a(this, paraml, getString(a.h.app_tip), false, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("err_code", k.py(90022));
          paramAnonymousDialogInterface.putExtra("err_msg", "get confirm info error");
          FaceDetectReporter.aJU().a(FaceDetectConfirmUI.d(FaceDetectConfirmUI.this), false, 3, 2, 90022);
          FaceDetectReporter.aJU().iOi = System.currentTimeMillis();
          FaceDetectReporter.aJU().bl(FaceDetectConfirmUI.e(FaceDetectConfirmUI.this), FaceDetectConfirmUI.d(FaceDetectConfirmUI.this));
          FaceDetectConfirmUI.a(FaceDetectConfirmUI.this, paramAnonymousDialogInterface);
          FaceDetectConfirmUI.this.finish();
        }
      });
    }
  }
  
  public void finish()
  {
    dismissDialog();
    super.finish();
  }
  
  protected final int getLayoutId()
  {
    return a.g.face_confirm_ui;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.FaceDetectConfirmUI", "onActiviyResult reqeustCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    FaceDetectReporter.aJU().iOi = System.currentTimeMillis();
    FaceDetectReporter.aJU().bl(this.grA, this.iPZ);
    setResult(paramInt2, paramIntent);
    finish();
  }
  
  public void onBackPressed()
  {
    aKo();
    super.onBackPressed();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.appId = getIntent().getStringExtra("k_app_id");
    this.fWF = getIntent().getStringExtra("request_verify_pre_info");
    this.grA = getIntent().getStringExtra("key_function_name");
    this.iPZ = getIntent().getIntExtra("key_business_type", -1);
    setMMTitle(getString(a.h.face_confirm_ui_title));
    setBackBtn(new FaceDetectConfirmUI.1(this));
    this.iPT = ((TextView)findViewById(a.e.face_confirm_header_tips));
    this.iPU = ((Button)findViewById(a.e.start_face_detect_button));
    this.iPU.setOnClickListener(new FaceDetectConfirmUI.2(this));
    this.iPV = ((CheckBox)findViewById(a.e.face_confirm_protocol_checkbox));
    this.iPV.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener()
    {
      public final void onCheckedChanged(CompoundButton paramAnonymousCompoundButton, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean)
        {
          FaceDetectConfirmUI.c(FaceDetectConfirmUI.this).setEnabled(true);
          return;
        }
        FaceDetectConfirmUI.c(FaceDetectConfirmUI.this).setEnabled(false);
      }
    });
    this.iPV.setVisibility(8);
    this.iPW = ((TextView)findViewById(a.e.face_confirm_protocol_checkbox_text));
    this.iPX = ((TextView)findViewById(a.e.face_complain));
    x.i("MicroMsg.FaceDetectConfirmUI", "alvinluo start get confirm info");
    paramBundle = this.mController.tml;
    getString(a.h.app_tip);
    this.tipDialog = h.a(paramBundle, getString(a.h.app_waiting), false, new FaceDetectConfirmUI.4(this));
    paramBundle = new com.tencent.mm.plugin.facedetect.b.l(this.appId, this.fWF);
    g.DF().a(1147, this);
    g.DF().a(paramBundle, 0);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */