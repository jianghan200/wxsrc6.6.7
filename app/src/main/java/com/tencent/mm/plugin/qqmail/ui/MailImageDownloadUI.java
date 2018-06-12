package com.tencent.mm.plugin.qqmail.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.g;
import com.tencent.mm.ak.k;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;

public class MailImageDownloadUI
  extends MMActivity
  implements com.tencent.mm.ab.e, com.tencent.mm.ab.f
{
  private long bJC = 0L;
  private long bYu = 0L;
  private int dTO;
  private ag handler = new ag(Looper.getMainLooper());
  private ProgressBar mhq;
  private TextView mhr;
  private TextView mhs;
  private TextView mht;
  private TextView mhu;
  private RelativeLayout mhv;
  private com.tencent.mm.ak.e mhw;
  private k mhx;
  private ImageView mhy;
  private LinearLayout mhz;
  private String username;
  
  private void va(int paramInt)
  {
    this.mhr.setText(getString(R.l.fmt_percent, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.mhq.getMax()) {
      return;
    }
    com.tencent.mm.ak.e locale = com.tencent.mm.ak.o.Pf().b(Long.valueOf(this.mhx.dVh));
    if (this.dTO == 1) {
      com.tencent.mm.ak.f.c(locale);
    }
    finish();
    startActivity(getIntent());
  }
  
  public final void a(int paramInt1, int paramInt2, l paraml)
  {
    x.d("MicroMsg.MailImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
    if (paraml.getType() == 109) {
      if (paramInt2 == 0) {
        break label62;
      }
    }
    label62:
    for (paramInt1 = paramInt1 * 100 / paramInt2 - 1;; paramInt1 = 0)
    {
      va(Math.max(0, paramInt1));
      return;
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, l paraml)
  {
    if (paraml.getType() != 109) {
      return;
    }
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      va(this.mhq.getMax());
      return;
    }
    x.e("MicroMsg.MailImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, R.l.imgdownload_fail, 1).show();
  }
  
  protected final int getLayoutId()
  {
    return R.i.mail_image_download;
  }
  
  protected final void initView()
  {
    this.mhr = ((TextView)findViewById(R.h.image_download_percent_tv));
    this.mhs = ((TextView)findViewById(R.h.image_download_percent_tv));
    this.mht = ((TextView)findViewById(R.h.image_download_size_tv));
    this.mhu = ((TextView)findViewById(R.h.image_download_length_tv));
    this.mhy = ((ImageView)findViewById(R.h.mail_image));
    this.mhr.setVisibility(0);
    this.mhz = ((LinearLayout)findViewById(R.h.image_bottom_info_layout));
    this.mhv = ((RelativeLayout)findViewById(R.h.mail_img_download_layout));
    this.mhs.setVisibility(8);
    this.mht.setVisibility(8);
    this.mhu.setVisibility(8);
    setTitleVisibility(8);
    setBackBtn(new MailImageDownloadUI.1(this));
    this.mhq = ((ProgressBar)findViewById(R.h.image_download_pb));
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.bJC = getIntent().getLongExtra("img_msg_id", 0L);
    this.bYu = getIntent().getLongExtra("img_server_id", 0L);
    this.dTO = getIntent().getIntExtra("img_download_compress_type", 0);
    this.username = getIntent().getStringExtra("img_download_username");
    initView();
    if (this.bJC > 0L) {
      this.mhw = com.tencent.mm.ak.o.Pf().br(this.bJC);
    }
    if (((this.mhw == null) || (this.mhw.dTK <= 0L)) && (this.bYu > 0L)) {
      this.mhw = com.tencent.mm.ak.o.Pf().bq(this.bYu);
    }
    if ((this.mhw == null) || (this.mhw.dTK <= 0L))
    {
      x.e("MicroMsg.MailImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.bJC + ", or msgSvrId = " + this.bYu);
      return;
    }
    if ((this.bJC <= 0L) && (this.bYu > 0L))
    {
      au.HU();
      this.bJC = com.tencent.mm.model.c.FT().I(this.username, this.bYu).field_msgId;
    }
    paramBundle = this.mhw.dTL;
    String str = com.tencent.mm.ak.o.Pf().o(paramBundle, null, null);
    if ((!bi.oW(paramBundle)) && (com.tencent.mm.a.e.cn(str)))
    {
      x.i("MicroMsg.MailImageDownloadUI", "has big image, bigImgPath = %s, hasHDImg = %b, fullPath = %s", new Object[] { paramBundle, Boolean.valueOf(this.mhw.ON()), str });
      if ((str == null) || (str.equals("")) || (!com.tencent.mm.a.e.cn(str)))
      {
        x.d("MicroMsg.MailImageDownloadUI", "showImg : imgPath is null");
        return;
      }
      this.mhz.setVisibility(8);
      this.mhq.setVisibility(8);
      this.mhy.setVisibility(0);
      paramBundle = com.tencent.mm.sdk.platformtools.c.Wb(str);
      this.mhy.setImageBitmap(paramBundle);
      this.mhv.invalidate();
      return;
    }
    this.mhx = new k(this.mhw.dTK, this.bJC, this.dTO, this);
    au.DF().a(this.mhx, 0);
  }
  
  protected void onPause()
  {
    super.onPause();
    au.DF().b(109, this);
  }
  
  protected void onResume()
  {
    super.onResume();
    au.DF().a(109, this);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/plugin/qqmail/ui/MailImageDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */