package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ab.l;
import com.tencent.mm.ak.g;
import com.tencent.mm.ak.k;
import com.tencent.mm.g.c.cm;
import com.tencent.mm.model.au;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.chatting.gallery.ImageGalleryUI;

public class ImageDownloadUI
  extends MMActivity
  implements com.tencent.mm.ab.e, com.tencent.mm.ab.f
{
  private long bJC = 0L;
  private long bYu = 0L;
  private int dTO;
  private ProgressBar mhq;
  private TextView mhr;
  private TextView mhs;
  private TextView mht;
  private TextView mhu;
  private com.tencent.mm.ak.e mhw;
  private k mhx;
  private ImageView tMv;
  private String username;
  
  private void va(int paramInt)
  {
    this.mhq.setProgress(paramInt);
    this.mhr.setText(getString(R.l.fmt_percent, new Object[] { Integer.valueOf(paramInt) }));
    if (paramInt < this.mhq.getMax()) {
      return;
    }
    Object localObject = com.tencent.mm.ak.o.Pf().b(Long.valueOf(this.mhx.dVh));
    String str = ((com.tencent.mm.ak.e)localObject).dTL;
    if (this.dTO == 1) {
      str = com.tencent.mm.ak.f.c((com.tencent.mm.ak.e)localObject);
    }
    str = com.tencent.mm.ak.o.Pf().o(str, null, null);
    if ((str == null) || (str.equals("")) || (!com.tencent.mm.a.e.cn(str)))
    {
      x.d("ImageDownloadUI", "showImg : imgPath is null");
      return;
    }
    localObject = new Intent(this, ImageGalleryUI.class);
    ((Intent)localObject).putExtra("key_message_id", this.bJC);
    ((Intent)localObject).putExtra("key_image_path", str);
    ((Intent)localObject).putExtra("key_compress_type", this.dTO);
    ((Intent)localObject).putExtra("key_favorite", true);
    ((Intent)localObject).putExtra("img_gallery_msg_id", this.bJC);
    ((Intent)localObject).putExtra("img_gallery_talker", this.username);
    finish();
  }
  
  public final void a(int paramInt1, int paramInt2, l paraml)
  {
    x.d("ImageDownloadUI", "offset " + paramInt1 + "totaolLen  " + paramInt2);
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
    x.e("ImageDownloadUI", "onSceneEnd : fail, errType = " + paramInt1 + ", errCode = " + paramInt2);
    Toast.makeText(this, R.l.imgdownload_fail, 1).show();
  }
  
  protected final int getLayoutId()
  {
    return R.i.video_download;
  }
  
  protected final void initView()
  {
    this.mhr = ((TextView)findViewById(R.h.image_download_percent_tv));
    this.mhs = ((TextView)findViewById(R.h.video_download_percent_tv));
    this.mht = ((TextView)findViewById(R.h.video_download_size_tv));
    this.mhu = ((TextView)findViewById(R.h.video_download_length_tv));
    this.tMv = ((ImageView)findViewById(R.h.down_background));
    this.tMv.setImageResource(R.k.download_image_icon);
    this.mhr.setVisibility(0);
    this.mhs.setVisibility(8);
    this.mht.setVisibility(8);
    this.mhu.setVisibility(8);
    setBackBtn(new ImageDownloadUI.1(this));
    this.mhq = ((ProgressBar)findViewById(R.h.video_download_pb));
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
      x.e("ImageDownloadUI", "onCreate : on such imginfo, with msgLocalId = " + this.bJC + ", or msgSvrId = " + this.bYu);
      return;
    }
    if ((this.bJC <= 0L) && (this.bYu > 0L))
    {
      au.HU();
      this.bJC = c.FT().I(this.username, this.bYu).field_msgId;
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


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/ui/chatting/ImageDownloadUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */