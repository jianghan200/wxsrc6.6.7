package com.tencent.mm.plugin.webview.ui.tools;

import android.app.ProgressDialog;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.widget.Toast;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.compatible.j.a.a;
import com.tencent.mm.model.au;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.mmsight.SightCaptureResult;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.pluginsdk.ui.tools.l;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ao;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.h.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class OpenFileChooserUI
  extends MMActivity
{
  private int count;
  private ProgressDialog eHw = null;
  private String fOr;
  private String fOs;
  private int jCU;
  private int jCt;
  private int ohT;
  private boolean pWc;
  private int pWd;
  private int pWe;
  private boolean pWf = false;
  private DialogInterface.OnCancelListener pWg = null;
  
  private SightParams AC(int paramInt)
  {
    String str1 = "microMsg_" + System.currentTimeMillis();
    this.fOr = (com.tencent.mm.compatible.util.e.dgl + str1 + ".mp4");
    this.fOs = (com.tencent.mm.compatible.util.e.dgl + str1 + ".jpeg");
    int j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
    SightParams localSightParams = new SightParams(3, 1);
    if (this.pWd == 16) {}
    for (int i = 1;; i = 2)
    {
      localSightParams.lel = i;
      localSightParams.mode = paramInt;
      if (localSightParams.lem == null) {
        localSightParams.lem = new VideoTransPara();
      }
      localSightParams.lem.duration = j;
      String str2 = com.tencent.mm.compatible.util.e.dgl + String.format("%s%d.%s", new Object[] { "capture", Long.valueOf(System.currentTimeMillis()), "jpg" });
      localSightParams.m(str1, this.fOr, this.fOs, str2);
      return localSightParams;
    }
  }
  
  private void Rc(String paramString)
  {
    this.pWg = new OpenFileChooserUI.5(this);
    getString(R.l.app_tip);
    this.eHw = h.a(this, getString(R.l.webview_jssdk_choose_video_compressing), true, this.pWg);
    au.Em().H(new OpenFileChooserUI.6(this, paramString));
  }
  
  private String Rd(String paramString)
  {
    try
    {
      MediaMetadataRetriever localMediaMetadataRetriever = new MediaMetadataRetriever();
      localMediaMetadataRetriever.setDataSource(paramString);
      if (localMediaMetadataRetriever == null) {
        return null;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        x.e("MicroMsg.OpenFileChooserUI", "addVideoItem, MetaDataRetriever setDataSource failed, e = %s", new Object[] { localException });
        localWebViewJSSDKVideoItem = null;
      }
      int i = bi.getInt(localWebViewJSSDKVideoItem.extractMetadata(18), 0);
      int j = bi.getInt(localWebViewJSSDKVideoItem.extractMetadata(19), 0);
      int k = bi.getInt(localWebViewJSSDKVideoItem.extractMetadata(9), 0);
      localWebViewJSSDKVideoItem.release();
      localWebViewJSSDKVideoItem.release();
      WebViewJSSDKVideoItem localWebViewJSSDKVideoItem = WebViewJSSDKFileItem.Qp(paramString);
      localWebViewJSSDKVideoItem.duration = ((k + 500) / 1000);
      localWebViewJSSDKVideoItem.width = i;
      localWebViewJSSDKVideoItem.height = j;
      localWebViewJSSDKVideoItem.size = com.tencent.mm.a.e.cm(paramString);
      if (this.pWe == 1) {
        localWebViewJSSDKVideoItem.fOs = this.fOs;
      }
      com.tencent.mm.plugin.webview.modeltools.e.bUX().b(localWebViewJSSDKVideoItem);
      return localWebViewJSSDKVideoItem.bNH;
    }
  }
  
  private int Re(String paramString)
  {
    Object localObject = new Intent();
    ((Intent)localObject).setData(Uri.parse("file://" + paramString));
    ao.is2G(this);
    for (;;)
    {
      try
      {
        paramString = com.tencent.mm.compatible.j.a.j(this, (Intent)localObject);
        if (paramString == null)
        {
          x.e("MicroMsg.OpenFileChooserUI", "compressVideo filed.");
          return -50005;
        }
      }
      catch (Exception paramString)
      {
        x.printErrStackTrace("MicroMsg.OpenFileChooserUI", paramString, "", new Object[0]);
        paramString = null;
        continue;
        localObject = paramString.filename;
        boolean bool = c.oZ((String)localObject);
        x.i("MicroMsg.OpenFileChooserUI", "isMp4 = %b", new Object[] { Boolean.valueOf(bool) });
        i = 55536;
        if (bool)
        {
          i = SightVideoJNI.shouldRemuxing((String)localObject, 660, 500, 26214400, 300000.0D, 1000000);
          x.i("MicroMsg.OpenFileChooserUI", "check remuxing, ret %d", new Object[] { Integer.valueOf(i) });
        }
        if ((i == -1) || (!bool))
        {
          i = com.tencent.mm.a.e.cm((String)localObject);
          x.i("MicroMsg.OpenFileChooserUI", "fileLenght = %d", new Object[] { Integer.valueOf(i) });
          if (i > 26214400) {
            i = -1;
          }
        }
        else
        {
          switch (i)
          {
          default: 
            x.e("MicroMsg.OpenFileChooserUI", "unknown check type");
            return -50001;
          }
        }
      }
      i = 1;
    }
    int j = 0;
    for (int i = 1;; i = 0)
    {
      if (j != 0) {
        i = -50006;
      }
      x.i("MicroMsg.OpenFileChooserUI", "finish to import %s  ret %d | duration %d", new Object[] { localObject, Integer.valueOf(i), Integer.valueOf(paramString.duration / 1000) });
      return i;
      j = 1;
    }
    return -50002;
  }
  
  private boolean bVJ()
  {
    x.i("MicroMsg.OpenFileChooserUI", "avaiableMem = %d", new Object[] { Long.valueOf(bi.fQ(this)) });
    return bi.fQ(this) > 200L;
  }
  
  private static boolean tO(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      File localFile = new File(paramString);
      x.i("MicroMsg.OpenFileChooserUI", "thumbFilePath:%s", new Object[] { paramString });
      if (localFile.exists())
      {
        x.i("MicroMsg.OpenFileChooserUI", "video thumb file is exist");
        return true;
      }
      x.e("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
      return false;
    }
    x.e("MicroMsg.OpenFileChooserUI", "video thumb file path is null");
    return false;
  }
  
  protected final int getLayoutId()
  {
    return -1;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    Object localObject1 = null;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      paramIntent = new Intent();
      paramIntent.putExtra("key_pick_local_media_show_memory_warning", this.pWf);
      setResult(paramInt2, paramIntent);
      finish();
      return;
    }
    Object localObject2;
    switch (paramInt1)
    {
    default: 
      x.e("MicroMsg.OpenFileChooserUI", "unknown request code = %d", new Object[] { Integer.valueOf(paramInt1) });
      setResult(1);
      finish();
      return;
    case 1: 
    case 3: 
      au.Em().H(new OpenFileChooserUI.4(this, paramIntent, paramInt2));
      return;
    case 2: 
      localObject1 = l.d(this.mController.tml.getApplicationContext(), paramIntent, com.tencent.mm.compatible.util.e.dgl);
      if (bi.oW((String)localObject1))
      {
        x.w("MicroMsg.OpenFileChooserUI", "take photo, but result is null");
        setResult(-2, paramIntent);
        finish();
        return;
      }
      x.i("MicroMsg.OpenFileChooserUI", "take photo, result[%s]", new Object[] { localObject1 });
      paramIntent = new Intent();
      paramIntent.putExtra("key_send_raw_image", this.pWc);
      paramIntent.putExtra("max_select_count", this.ohT);
      paramIntent.putExtra("query_source_type", this.jCt);
      localObject2 = new ArrayList(1);
      ((ArrayList)localObject2).add(localObject1);
      paramIntent.putStringArrayListExtra("preview_image_list", (ArrayList)localObject2);
      paramIntent.putExtra("preview_image", true);
      paramIntent.addFlags(67108864);
      d.b(this, "gallery", ".ui.GalleryEntryUI", paramIntent, 3);
      return;
    case 5: 
      if (new File(this.fOr).exists())
      {
        Rc(this.fOr);
        return;
      }
      x.e("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_VIDEO, file not exist : %s", new Object[] { this.fOr });
      setResult(1);
      finish();
      return;
    case 4: 
      paramIntent = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((paramIntent == null) || (paramIntent.size() == 0))
      {
        x.e("MicroMsg.OpenFileChooserUI", "choose video failed, path is null");
        setResult(1);
        finish();
        return;
      }
      x.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_GALLERY_VIDEO");
      x.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { paramIntent.get(0) });
      if ((this.pWe == 1) && (!tO(this.fOs))) {
        x.i("MicroMsg.OpenFileChooserUI", "video thumb file is not exist");
      }
      Rc((String)paramIntent.get(0));
      return;
    case 6: 
      x.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_SIGHT_VIDEO");
      if (paramIntent != null)
      {
        x.i("MicroMsg.OpenFileChooserUI", "data is valid!");
        paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          x.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
          setResult(1);
          finish();
          return;
        }
        this.fOr = paramIntent.lee;
        x.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.fOr });
        if ((!tO(this.fOs)) && (tO(paramIntent.lef))) {
          this.fOs = paramIntent.lef;
        }
        paramIntent = (Intent)localObject1;
        if (!TextUtils.isEmpty(this.fOr)) {
          paramIntent = new File(this.fOr);
        }
        if ((paramIntent != null) && (paramIntent.exists()))
        {
          x.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.fOr });
          Rc(this.fOr);
          return;
        }
        x.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.fOr });
      }
      x.e("MicroMsg.OpenFileChooserUI", "data is null!");
      setResult(1);
      finish();
      return;
    case 7: 
      x.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_CAMERA");
      if (paramIntent != null)
      {
        x.i("MicroMsg.OpenFileChooserUI", "data is valid!");
        paramIntent = (SightCaptureResult)paramIntent.getParcelableExtra("key_req_result");
        if (paramIntent == null)
        {
          x.e("MicroMsg.OpenFileChooserUI", "sight capture result is null!");
          setResult(1);
          finish();
          return;
        }
        if (paramIntent.lec)
        {
          paramIntent = paramIntent.lek;
          if (bi.oW(paramIntent))
          {
            x.e("MicroMsg.OpenFileChooserUI", "picture_picturePath file is not exist! path:%s", new Object[] { paramIntent });
            setResult(1);
            finish();
            return;
          }
          localObject1 = new ArrayList();
          localObject2 = WebViewJSSDKFileItem.Qn(paramIntent);
          ((WebViewJSSDKFileItem)localObject2).fnQ = true;
          ((WebViewJSSDKFileItem)localObject2).bMT = 1;
          com.tencent.mm.plugin.webview.modeltools.e.bUX().b((WebViewJSSDKFileItem)localObject2);
          ((ArrayList)localObject1).add(((WebViewJSSDKFileItem)localObject2).bNH);
          x.i("MicroMsg.OpenFileChooserUI", "filepath is : %s, local id is : %s", new Object[] { paramIntent, ((WebViewJSSDKFileItem)localObject2).bNH });
          paramIntent = aj.V((ArrayList)localObject1);
          x.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { paramIntent });
          localObject1 = new Intent();
          ((Intent)localObject1).putExtra("key_pick_local_media_local_ids", paramIntent);
          ((Intent)localObject1).putExtra("key_pick_local_media_callback_type", 2);
          setResult(paramInt2, (Intent)localObject1);
          finish();
          return;
        }
        this.fOr = paramIntent.lee;
        x.i("MicroMsg.OpenFileChooserUI", "videoFilePath:%s", new Object[] { this.fOr });
        if ((!tO(this.fOs)) && (tO(paramIntent.lef))) {
          this.fOs = paramIntent.lef;
        }
        if (TextUtils.isEmpty(this.fOr)) {
          break label1324;
        }
      }
      break;
    }
    label1324:
    for (paramIntent = new File(this.fOr);; paramIntent = null)
    {
      if ((paramIntent != null) && (paramIntent.exists()))
      {
        x.e("MicroMsg.OpenFileChooserUI", "video file is exist! path:%s", new Object[] { this.fOr });
        Rc(this.fOr);
        return;
      }
      x.e("MicroMsg.OpenFileChooserUI", "video file is not exist! path:%s", new Object[] { this.fOr });
      x.e("MicroMsg.OpenFileChooserUI", "data is null!");
      setResult(1);
      finish();
      return;
      x.i("MicroMsg.OpenFileChooserUI", "REQUEST_CODE_TAKE_MEDIA_LOCAL");
      localObject1 = paramIntent.getStringArrayListExtra("key_select_video_list");
      if ((localObject1 != null) && (((ArrayList)localObject1).size() > 0))
      {
        Rc((String)((ArrayList)localObject1).get(0));
        return;
      }
      localObject1 = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      boolean bool = paramIntent.getBooleanExtra("CropImage_Compress_Img", true);
      if (localObject1 == null)
      {
        x.e("MicroMsg.OpenFileChooserUI", "chosen is null");
        setResult(1);
        finish();
        return;
      }
      paramIntent = new ArrayList();
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (String)((Iterator)localObject1).next();
        WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.Qn((String)localObject2);
        String str = localWebViewJSSDKFileItem.bNH;
        localWebViewJSSDKFileItem.fnQ = bool;
        com.tencent.mm.plugin.webview.modeltools.e.bUX().b(localWebViewJSSDKFileItem);
        x.i("MicroMsg.OpenFileChooserUI", "now filepath is : %s, local id is : %s", new Object[] { localObject2, str });
        paramIntent.add(str);
      }
      paramIntent = aj.V(paramIntent);
      x.i("MicroMsg.OpenFileChooserUI", "after parse to json data : %s", new Object[] { paramIntent });
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("key_pick_local_media_local_ids", paramIntent);
      ((Intent)localObject1).putExtra("key_pick_local_media_show_memory_warning", this.pWf);
      ((Intent)localObject1).putExtra("key_pick_local_media_callback_type", 2);
      setResult(paramInt2, (Intent)localObject1);
      finish();
      return;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.count = getIntent().getIntExtra("key_pick_local_pic_count", 0);
    if ((this.count <= 0) || (this.count > 9)) {
      this.count = 9;
    }
    this.ohT = this.count;
    this.jCt = getIntent().getIntExtra("key_pick_local_pic_query_source_type", 8);
    this.jCU = getIntent().getIntExtra("query_media_type", 1);
    this.pWc = getIntent().getBooleanExtra("key_pick_local_pic_send_raw", false);
    this.pWd = getIntent().getIntExtra("key_pick_local_pic_capture", 3);
    this.pWe = getIntent().getIntExtra("key_pick_local_media_video_type", 0);
    int i;
    int j;
    if (((this.jCt == 7) && (this.jCU == 2)) || (this.jCU == 3))
    {
      if (!bVJ())
      {
        com.tencent.mm.ui.base.s.makeText(this, getString(R.l.webview_memory_check_message), 1).show();
        this.pWf = true;
      }
      paramBundle = new Intent();
      paramBundle.putExtra("key_send_raw_image", this.pWc);
      paramBundle.putExtra("query_media_type", this.jCU);
      if (this.pWe == 1) {
        if ((this.pWd != 4096) && ((this.pWd & 0x1000) > 0))
        {
          i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
          j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
          paramBundle.putExtra("KEY_SIGHT_PARAMS", AC(1));
          paramBundle.putExtra("record_video_force_sys_camera", false);
          paramBundle.putExtra("show_header_view", true);
          paramBundle.putExtra("record_video_is_sight_capture", true);
          paramBundle.putExtra("record_video_quality", i);
          paramBundle.putExtra("record_video_time_limit", j);
          paramBundle.putExtra("video_full_path", this.fOr);
          l.c(this, this.ohT, this.jCt, paramBundle);
          if ((this.pWd == 4096) || ((this.pWd & 0x1000) <= 0)) {
            break label1026;
          }
          i = 1;
        }
      }
    }
    Object localObject;
    for (;;)
    {
      if (i == 0) {
        break label1070;
      }
      return;
      if ((this.pWd == 16) || (this.pWd == 256))
      {
        paramBundle.putExtra("KEY_SIGHT_PARAMS", AC(1));
        l.a(this, 6, paramBundle, 3, 1);
        break;
      }
      if (this.pWd != 4096) {
        break;
      }
      paramBundle.putExtra("show_header_view", false);
      l.c(this, this.ohT, this.jCt, paramBundle);
      break;
      if (this.pWe == 2)
      {
        localObject = bi.oV(getIntent().getStringExtra("key_pick_local_media_sight_type"));
        if ((this.pWd != 4096) && ((this.pWd & 0x1000) > 0))
        {
          x.e("MicroMsg.OpenFileChooserUI", "choose media from local or camera is not support");
          setResult(1);
          finish();
          break;
        }
        if ((this.pWd == 16) || (this.pWd == 256))
        {
          i = 0;
          if ((((String)localObject).contains("video")) && (((String)localObject).contains("image"))) {
            i = 0;
          }
          for (;;)
          {
            paramBundle.putExtra("KEY_SIGHT_PARAMS", AC(i));
            l.a(this, 7, paramBundle, 3, i);
            break;
            if (((String)localObject).contains("video")) {
              i = 1;
            } else if (((String)localObject).contains("image")) {
              i = 2;
            }
          }
        }
        if (this.pWd != 4096) {
          break;
        }
        i = 3;
        if ((((String)localObject).contains("image")) && (((String)localObject).contains("video"))) {
          i = 3;
        }
        for (;;)
        {
          paramBundle = new Intent();
          paramBundle.putExtra("key_can_select_video_and_pic", true);
          paramBundle.putExtra("key_send_raw_image", this.pWc);
          l.a(this, 8, this.ohT, this.jCt, i, false, paramBundle);
          break;
          if (((String)localObject).contains("image")) {
            i = 1;
          } else if (((String)localObject).contains("video")) {
            i = 2;
          }
        }
      }
      if ((this.pWd != 4096) && ((this.pWd & 0x1000) > 0))
      {
        this.fOr = (com.tencent.mm.compatible.util.e.dgl + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
        j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        paramBundle.putExtra("record_video_force_sys_camera", true);
        paramBundle.putExtra("record_video_quality", i);
        paramBundle.putExtra("record_video_time_limit", j);
        paramBundle.putExtra("video_full_path", this.fOr);
        l.c(this, this.ohT, this.jCt, paramBundle);
        break;
      }
      if ((this.pWd == 16) || (this.pWd == 256))
      {
        this.fOr = (com.tencent.mm.compatible.util.e.dgl + "microMsg." + System.currentTimeMillis() + ".mp4");
        i = getIntent().getIntExtra("key_pick_local_media_quality", 1);
        j = getIntent().getIntExtra("key_pick_local_media_duration", 60);
        paramBundle = this.fOr;
        if (this.pWd == 16) {}
        for (boolean bool = true;; bool = false)
        {
          l.a(this, paramBundle, 5, j, i, bool);
          break;
        }
      }
      if (this.pWd != 4096) {
        break;
      }
      paramBundle.putExtra("show_header_view", false);
      l.c(this, this.ohT, this.jCt, paramBundle);
      break;
      label1026:
      if ((this.pWd == 16) || (this.pWd == 256)) {
        i = 1;
      } else if (this.pWd == 4096) {
        i = 1;
      } else {
        i = 0;
      }
    }
    label1070:
    if (!bVJ())
    {
      com.tencent.mm.ui.base.s.makeText(this, getString(R.l.webview_memory_check_message), 1).show();
      this.pWf = true;
    }
    paramBundle = new Intent();
    paramBundle.putExtra("key_send_raw_image", this.pWc);
    paramBundle.putExtra("query_media_type", this.jCU);
    switch (this.pWd)
    {
    default: 
      x.e("MicroMsg.OpenFileChooserUI", "unkown scene, ignore this request");
      setResult(0);
      finish();
      return;
    case 1: 
      paramBundle.putExtra("show_header_view", false);
      l.a(this, 1, this.ohT, this.jCt, paramBundle);
      return;
    case 2: 
      paramBundle = getString(R.l.webview_jssdk_take_photo);
      localObject = new OpenFileChooserUI.1(this);
      OpenFileChooserUI.2 local2 = new OpenFileChooserUI.2(this);
      h.a(this, "", new String[] { paramBundle }, "", true, (h.c)localObject, local2);
      return;
    }
    l.a(this, 1, this.count, this.jCt, paramBundle);
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((this.eHw != null) && (this.eHw.isShowing())) {
      this.eHw.dismiss();
    }
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    x.i("MicroMsg.OpenFileChooserUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    default: 
      return;
    }
    if (paramArrayOfInt[0] == 0)
    {
      l.c(this.mController.tml, com.tencent.mm.compatible.util.e.dgl, "microMsg." + System.currentTimeMillis() + ".jpg", 2);
      return;
    }
    h.a(this, getString(R.l.permission_camera_request_again_msg), getString(R.l.permission_tips_title), getString(R.l.jump_to_settings), getString(R.l.cancel), false, new OpenFileChooserUI.3(this), null);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/plugin/webview/ui/tools/OpenFileChooserUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */