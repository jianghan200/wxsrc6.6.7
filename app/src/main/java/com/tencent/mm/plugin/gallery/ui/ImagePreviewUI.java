package com.tencent.mm.plugin.gallery.ui;

import android.annotation.TargetApi;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.v;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.j;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bg.d;
import com.tencent.mm.compatible.f.b;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.plugin.gallery.model.m;
import com.tencent.mm.plugin.gallery.stub.GalleryStubService;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ak;
import com.tencent.mm.ui.base.MMViewPager;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.s;
import com.tencent.mm.ui.s.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

@com.tencent.mm.ui.base.a(19)
@TargetApi(16)
public class ImagePreviewUI
  extends MMActivity
{
  private ServiceConnection hKe = new ImagePreviewUI.1(this);
  private com.tencent.mm.plugin.gallery.stub.a jBy = null;
  private ArrayList<GalleryItem.MediaItem> jBz;
  private HashMap<String, Integer> jCD = new HashMap();
  private boolean jCW;
  private TextView jCf;
  private boolean jCl = true;
  private boolean jCp;
  private int jCs;
  private long jCx = 0L;
  private c jDA;
  private MMViewPager jDB;
  private RecyclerView jDC;
  private ArrayList<String> jDD;
  private ArrayList<String> jDE;
  private Integer jDF;
  private ImageButton jDG;
  private TextView jDH;
  private al jDI;
  private ImageButton jDJ;
  private TextView jDK;
  private ViewGroup jDL;
  private ViewGroup jDM;
  private boolean jDN = true;
  private boolean jDO = true;
  private int jDP = 0;
  private int jDQ = 10;
  private TextView jDR;
  private TextView jDS;
  private TextView jDT;
  private TextView jDU;
  private View jDV;
  private TextView jDW;
  private ProgressBar jDX;
  boolean jDY = false;
  private HashSet<String> jDZ;
  
  private void CW(String paramString)
  {
    if (!this.jDE.contains(paramString)) {
      if (this.jDE.size() >= this.jCs)
      {
        h.bA(this.mController.tml, getResources().getQuantityString(R.j.gallery_pic_limit, this.jCs, new Object[] { Integer.valueOf(this.jCs) }));
        this.jDJ.setImageResource(R.k.checkbox_unselected);
      }
    }
    for (;;)
    {
      paramString = this.jDE.iterator();
      do
      {
        if (!paramString.hasNext()) {
          break;
        }
      } while (o.Wf((String)paramString.next()));
      return;
      this.jDE.add(paramString);
      this.jDJ.setImageResource(R.k.checkbox_selected);
      a(this.jDE.size(), this.jDF.intValue(), paramString, 0);
      continue;
      this.jDJ.setImageResource(R.k.checkbox_unselected);
      while (this.jDE.remove(paramString)) {}
      a(this.jDE.size(), this.jDF.intValue(), paramString, 1);
    }
    this.jCp = true;
  }
  
  private void CX(String paramString)
  {
    Boolean localBoolean2;
    GalleryItem.MediaItem localMediaItem;
    Boolean localBoolean1;
    switch (com.tencent.mm.plugin.gallery.model.c.aRf().aRI())
    {
    default: 
      localBoolean2 = Boolean.valueOf(false);
      localMediaItem = com.tencent.mm.plugin.gallery.model.c.CS(paramString);
      localBoolean1 = localBoolean2;
      if (localMediaItem != null)
      {
        localBoolean1 = localBoolean2;
        if (localMediaItem.getType() == 2) {
          localBoolean1 = Boolean.valueOf(true);
        }
      }
      if ((localMediaItem == null) && (o.Wf(paramString))) {
        paramString = Boolean.valueOf(true);
      }
      break;
    }
    for (;;)
    {
      if (!paramString.booleanValue()) {
        break label156;
      }
      this.jDG.setVisibility(8);
      this.jCf.setVisibility(8);
      return;
      localBoolean2 = Boolean.valueOf(true);
      break;
      paramString = localBoolean1;
      if (localMediaItem != null)
      {
        paramString = localBoolean1;
        if (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")) {
          paramString = Boolean.valueOf(true);
        }
      }
    }
    label156:
    this.jDG.setVisibility(0);
    this.jCf.setVisibility(0);
  }
  
  private void a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    x.i("MicroMsg.ImagePreviewUI", "count:%s selectPosition:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if ((-1 != paramInt2) && (!this.jCW))
    {
      this.jDC.getAdapter().c(paramInt2, Integer.valueOf(paramInt2));
      if (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() != 13) {
        break label268;
      }
    }
    label268:
    for (paramInt2 = 1;; paramInt2 = 0)
    {
      paramString = this.jDA.qE(this.jDF.intValue());
      if ((paramInt1 != 0) && (((!this.jCl) && (paramInt2 == 0)) || (this.jDA == null) || (paramString == null) || (paramString.getType() != 2))) {
        break label273;
      }
      this.jDC.setVisibility(8);
      return;
      if (-1 == paramInt2) {
        break;
      }
      if ((paramInt3 == 0) && (paramInt1 > 0))
      {
        ((f)this.jDC.getAdapter()).jEl.add(paramString);
        ((f)this.jDC.getAdapter()).cH(paramInt1 - 1, this.jDF.intValue());
        this.jDC.getAdapter().bm(paramInt1 - 1);
        this.jDC.smoothScrollToPosition(paramInt1 - 1);
        break;
      }
      if (paramInt3 != 1) {
        break;
      }
      paramInt2 = ((f)this.jDC.getAdapter()).jEl.indexOf(paramString);
      if (-1 == paramInt2) {
        break;
      }
      ((f)this.jDC.getAdapter()).jEl.remove(paramInt2);
      this.jDC.getAdapter().bn(paramInt2);
      break;
    }
    label273:
    this.jDC.setVisibility(0);
  }
  
  private void a(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || ((com.tencent.mm.plugin.gallery.model.c.aRf().aRI() != 4) && (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() != 13)))
    {
      this.jDN = true;
      this.jDL.setVisibility(0);
      this.jDM.setVisibility(8);
      this.jDX.setVisibility(8);
      b(paramString, paramMediaItem);
      CX(paramString);
      enableOptionMenu(true);
      this.jDH.setVisibility(8);
      if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif"))) {
        this.jDR.setVisibility(0);
      }
    }
    GalleryItem.VideoMediaItem localVideoMediaItem;
    label408:
    label411:
    for (;;)
    {
      return;
      boolean bool = getIntent().getBooleanExtra("preview_image", false);
      x.i("MicroMsg.ImagePreviewUI", "QuerySource:%s isPreViewImage:%s  path:%s", new Object[] { Integer.valueOf(com.tencent.mm.plugin.gallery.model.c.aRf().aRI()), Boolean.valueOf(bool), paramString });
      if ((paramMediaItem == null) && (!bi.oW(paramString)))
      {
        this.jDR.setVisibility(0);
        return;
      }
      this.jDR.setVisibility(8);
      return;
      if ((paramMediaItem != null) && (paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        this.jDR.setVisibility(0);
        localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
        enableOptionMenu(false);
        this.jDN = false;
        this.jDL.setVisibility(8);
        this.jDM.setVisibility(0);
        this.jDW.setVisibility(8);
        if (FileOp.mI(paramString) <= 1073741824L) {
          break label408;
        }
        this.jDS.setText(getString(R.l.gallery_pic_video_too_large_title));
        this.jDT.setText(getString(R.l.gallery_pic_video_too_large_desc));
      }
      for (int i = 1;; i = 0)
      {
        if (i != 0) {
          break label411;
        }
        if (bi.oW(localVideoMediaItem.egB)) {
          break label413;
        }
        x.d("MicroMsg.ImagePreviewUI", "got MediaItem directly path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.egA, Integer.valueOf(localVideoMediaItem.egD), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
        a(paramString, localVideoMediaItem);
        return;
        this.jDR.setVisibility(8);
        break;
      }
    }
    label413:
    enableOptionMenu(false);
    this.jDN = true;
    this.jDL.setVisibility(0);
    this.jDM.setVisibility(8);
    this.jDH.setVisibility(8);
    b(paramString, paramMediaItem);
    CX(paramString);
    paramMediaItem = new m(paramString, this.jDF.intValue(), localVideoMediaItem, new ImagePreviewUI.17(this));
    if (com.tencent.mm.sdk.f.e.X(paramMediaItem))
    {
      x.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramString });
      return;
    }
    com.tencent.mm.sdk.f.e.post(paramMediaItem, "video_analysis");
  }
  
  private void a(String paramString, GalleryItem.VideoMediaItem paramVideoMediaItem)
  {
    enableOptionMenu(false);
    this.jDN = false;
    this.jDL.setVisibility(8);
    this.jDM.setVisibility(0);
    this.jDW.setVisibility(8);
    if (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() == 13)
    {
      this.jDM.setVisibility(8);
      this.jDL.setVisibility(8);
      this.jDS.setVisibility(8);
      this.jDT.setVisibility(8);
      enableOptionMenu(true);
    }
    label210:
    label261:
    label308:
    label356:
    label497:
    label499:
    label698:
    label707:
    label710:
    label712:
    label829:
    label832:
    for (;;)
    {
      return;
      int i;
      String str;
      if ((paramVideoMediaItem == null) || (paramVideoMediaItem.videoWidth <= 0) || (paramVideoMediaItem.videoHeight <= 0) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight > 3.0F) || (paramVideoMediaItem.videoWidth / paramVideoMediaItem.videoHeight < 0.3F))
      {
        if (paramVideoMediaItem != null) {
          x.d("MicroMsg.ImagePreviewUI", "check ratio faild width = [%d], height = [%d]", new Object[] { Integer.valueOf(paramVideoMediaItem.videoWidth), Integer.valueOf(paramVideoMediaItem.videoHeight) });
        }
        this.jDS.setText(getString(R.l.gallery_pic_video_special_ratio));
        this.jDT.setText(getString(R.l.gallery_pic_video_special_ratio_desc));
        i = 1;
        if (i != 0) {
          break label497;
        }
        x.d("MicroMsg.ImagePreviewUI", "updateBottomLayoutCheckFormat() called with: item = [%s]", new Object[] { paramVideoMediaItem });
        if ((paramVideoMediaItem != null) && (!bi.oW(paramVideoMediaItem.egA)))
        {
          str = paramVideoMediaItem.egA;
          if (!bi.oW(str)) {
            break label499;
          }
          i = 1;
          if ((i == 0) && ("video/avc".equalsIgnoreCase(paramVideoMediaItem.egB)) && ((bi.oW(paramVideoMediaItem.egC)) || ("audio/mp4a-latm".equalsIgnoreCase(paramVideoMediaItem.egC)))) {
            break label707;
          }
        }
        if (paramVideoMediaItem != null) {
          break label698;
        }
        str = null;
        x.d("MicroMsg.ImagePreviewUI", "check video format failed, dst format [video/avc], video format [%s]", new Object[] { str });
        this.jDS.setText(getString(R.l.gallery_pic_video_not_support));
        this.jDT.setText(getString(R.l.gallery_pic_video_not_support_desc));
        i = 1;
        if (i != 0) {
          break label710;
        }
        x.d("MicroMsg.ImagePreviewUI", "check duration %d", new Object[] { Integer.valueOf(paramVideoMediaItem.egD) });
        if (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() == 13) {
          break label829;
        }
        if (paramVideoMediaItem.egD > 1000) {
          break label712;
        }
        this.jDS.setText(getString(R.l.gallery_pic_video_too_short_title));
        this.jDT.setText(getString(R.l.gallery_pic_video_too_short_desc));
        i = 1;
      }
      for (;;)
      {
        if (i != 0) {
          break label832;
        }
        enableOptionMenu(true);
        this.jDN = true;
        this.jDL.setVisibility(0);
        this.jDM.setVisibility(8);
        this.jDH.setVisibility(0);
        this.jDX.setVisibility(8);
        b(paramString, paramVideoMediaItem);
        CX(paramString);
        return;
        i = 0;
        break label210;
        break;
        if (this.jDZ == null)
        {
          this.jDZ = new HashSet();
          this.jDZ.add(".h264");
          this.jDZ.add(".h26l");
          this.jDZ.add(".264");
          this.jDZ.add(".avc");
          this.jDZ.add(".mov");
          this.jDZ.add(".mp4");
          this.jDZ.add(".m4a");
          this.jDZ.add(".3gp");
          this.jDZ.add(".3g2");
          this.jDZ.add(".mj2");
          this.jDZ.add(".m4v");
        }
        str = str.trim();
        i = str.lastIndexOf(".");
        if ((i < 0) || (i >= str.length()))
        {
          i = 1;
          break label261;
        }
        if (!this.jDZ.contains(str.substring(i)))
        {
          i = 1;
          break label261;
        }
        i = 0;
        break label261;
        str = paramVideoMediaItem.egB;
        break label308;
        i = 0;
        break label356;
        break;
        if (paramVideoMediaItem.egD >= 300000)
        {
          this.jDS.setText(getString(R.l.gallery_pic_video_too_long_title));
          this.jDT.setText(getString(R.l.gallery_pic_video_too_long_desc));
          i = 1;
        }
        else if (paramVideoMediaItem.egD >= this.jDQ * 1000 + 500)
        {
          this.jDS.setText(getString(R.l.gallery_pic_edit_video));
          this.jDT.setText(getString(R.l.gallery_pic_edit_des_config, new Object[] { Integer.valueOf(this.jDQ) }));
          this.jDW.setVisibility(0);
          i = 1;
        }
        else
        {
          i = 0;
        }
      }
    }
  }
  
  private String aRW()
  {
    switch (com.tencent.mm.plugin.gallery.model.c.aRf().aRI())
    {
    case 5: 
    case 6: 
    case 9: 
    case 10: 
    case 12: 
    default: 
      if ((this.jDE.size() == 0) || (this.jCs <= 1)) {
        return getString(R.l.app_send);
      }
      break;
    case 4: 
    case 7: 
    case 8: 
    case 13: 
      if ((this.jDE.size() == 0) || (this.jCs <= 1)) {
        return getString(R.l.gallery_pic_timeline_send);
      }
      return getString(R.l.gallery_pic_timeline_send) + "(" + this.jDE.size() + "/" + this.jCs + ")";
    case 11: 
      return getString(R.l.emoji_store_use);
    }
    return getString(R.l.gallery_pic_chatting_send, new Object[] { Integer.valueOf(this.jDE.size()), Integer.valueOf(this.jCs) });
  }
  
  private ArrayList<String> aRX()
  {
    if (this.jCW) {
      return this.jDE;
    }
    ArrayList localArrayList = new ArrayList(this.jDE.size());
    Iterator localIterator = this.jDD.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (this.jDE.contains(str)) {
        localArrayList.add(str);
      }
    }
    return localArrayList;
  }
  
  private void b(String paramString, GalleryItem.MediaItem paramMediaItem)
  {
    if ((paramMediaItem == null) || (paramMediaItem.getType() != 2) || (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() != 4))
    {
      if (this.jCs == 1)
      {
        this.jDJ.setVisibility(8);
        this.jDK.setVisibility(8);
      }
      while (!this.jDE.contains(paramString))
      {
        this.jDJ.setImageResource(R.k.checkbox_unselected);
        return;
        this.jDJ.setVisibility(0);
        this.jDK.setVisibility(0);
      }
      this.jDJ.setImageResource(R.k.checkbox_selected);
      return;
    }
    this.jDJ.setVisibility(8);
    this.jDK.setVisibility(8);
  }
  
  private void c(GalleryItem.MediaItem paramMediaItem)
  {
    if (paramMediaItem == null) {
      x.e("MicroMsg.ImagePreviewUI", "[updateTopTip] null == item");
    }
    do
    {
      return;
      if (paramMediaItem.getType() == 2)
      {
        GalleryItem.VideoMediaItem localVideoMediaItem = (GalleryItem.VideoMediaItem)paramMediaItem;
        if (!bi.oW(localVideoMediaItem.egB))
        {
          x.d("MicroMsg.ImagePreviewUI", "path [%s], durationMs [%d], videoHeight[%d], videoWidth [%d]", new Object[] { localVideoMediaItem.egA, Integer.valueOf(localVideoMediaItem.egD), Integer.valueOf(localVideoMediaItem.videoHeight), Integer.valueOf(localVideoMediaItem.videoWidth) });
          if ((localVideoMediaItem.egD >= 300000) || ((localVideoMediaItem.egD > 0) && (localVideoMediaItem.egD < 1000)))
          {
            this.jDV.setVisibility(0);
            localObject = this.jDU;
            if (localVideoMediaItem.egD >= 300000) {}
            for (paramMediaItem = getString(R.l.gallery_pic_video_too_long_desc);; paramMediaItem = getString(R.l.gallery_pic_video_too_short_desc))
            {
              ((TextView)localObject).setText(paramMediaItem);
              this.jDK.setEnabled(false);
              this.jDJ.setEnabled(false);
              this.jDK.setTextColor(getResources().getColor(R.e.white_text_color_disabled));
              if (this.jDE.size() != 0) {
                break;
              }
              enableOptionMenu(false);
              return;
            }
          }
          this.jDK.setEnabled(true);
          this.jDJ.setEnabled(true);
          this.jDK.setTextColor(getResources().getColor(R.e.white_text_color));
          this.jDV.setVisibility(8);
          return;
        }
        localObject = new m(paramMediaItem.egA, this.jDF.intValue(), localVideoMediaItem, new ImagePreviewUI.18(this));
        if (com.tencent.mm.sdk.f.e.X((Runnable)localObject))
        {
          x.d("MicroMsg.ImagePreviewUI", "analysis of path[%s] has already been added in ThreadPool", new Object[] { paramMediaItem.egA });
          return;
        }
        com.tencent.mm.sdk.f.e.post((Runnable)localObject, "video_analysis");
        return;
      }
      if ((paramMediaItem.getType() == 1) && (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
      {
        this.jDK.setEnabled(true);
        this.jDJ.setEnabled(true);
        this.jDK.setTextColor(getResources().getColor(R.e.white_text_color));
        if ((this.jCp) && (this.jDE.contains(paramMediaItem.egA)) && (FileOp.mI(paramMediaItem.egA) > 26214400L))
        {
          this.jDV.setVisibility(0);
          this.jDU.setText(getString(R.l.gallery_select_image_to_big));
          return;
        }
        this.jDV.setVisibility(8);
        return;
      }
    } while ((paramMediaItem.getType() != 1) || (!paramMediaItem.mMimeType.equalsIgnoreCase("image/gif")));
    Object localObject = new com.tencent.mm.plugin.gif.e(paramMediaItem.egA);
    int i = com.tencent.mm.a.e.cm(paramMediaItem.egA);
    try
    {
      if (((this.jDE.contains(paramMediaItem.egA)) && (i != 0) && (i > this.jBy.AA())) || (localObject.khG[0] > this.jBy.Az()) || (localObject.khG[1] > this.jBy.Az()))
      {
        this.jDK.setTextColor(getResources().getColor(R.e.white_text_color_disabled));
        this.jDK.setEnabled(false);
        this.jDJ.setEnabled(false);
        return;
      }
    }
    catch (Exception paramMediaItem)
    {
      x.e("MicroMsg.ImagePreviewUI", bi.i(paramMediaItem));
      return;
    }
    this.jDK.setTextColor(getResources().getColor(R.e.white_text_color));
    this.jDK.setEnabled(true);
    this.jDJ.setEnabled(true);
  }
  
  private void fl(boolean paramBoolean)
  {
    if (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() == 4) {
      return;
    }
    if (this.jDA == null)
    {
      x.i("MicroMsg.ImagePreviewUI", "[setTopTipVisibility] adapter == null");
      return;
    }
    GalleryItem.MediaItem localMediaItem = this.jDA.qE(this.jDF.intValue());
    if ((paramBoolean) && (localMediaItem != null))
    {
      this.jDV.postDelayed(new ImagePreviewUI.16(this, localMediaItem), 400L);
      return;
    }
    this.jDV.setVisibility(8);
  }
  
  private void fm(boolean paramBoolean)
  {
    x.d("MicroMsg.ImagePreviewUI", "setFooterVisibility() called with: visible = [" + paramBoolean + "], selectedNormalFooter = " + this.jDN);
    if (this.jDN)
    {
      localObject = findViewById(R.h.cropimage_operator_ll);
      if (localObject != null) {
        break label109;
      }
      if (!this.jDN) {
        break label102;
      }
      localObject = "normal";
      label66:
      x.w("MicroMsg.ImagePreviewUI", "set footer[%s] visibility[%B], but footerbar null", new Object[] { localObject, Boolean.valueOf(paramBoolean) });
    }
    label102:
    label109:
    do
    {
      do
      {
        return;
        localObject = findViewById(R.h.gallery_edit_layout);
        break;
        localObject = "edit_tips";
        break label66;
      } while (((paramBoolean) && (((View)localObject).getVisibility() == 0)) || ((!paramBoolean) && (((View)localObject).getVisibility() == 8)));
      if (paramBoolean)
      {
        ((View)localObject).setVisibility(0);
        ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, R.a.fast_faded_in));
      }
      while ((paramBoolean) && (this.jDC.getVisibility() == 8) && (this.jDE.size() > 0))
      {
        this.jDC.setVisibility(0);
        localObject = AnimationUtils.loadAnimation(this, R.a.fast_faded_in);
        this.jDC.startAnimation((Animation)localObject);
        return;
        ((View)localObject).setVisibility(8);
        ((View)localObject).startAnimation(AnimationUtils.loadAnimation(this, R.a.fast_faded_out));
      }
    } while ((paramBoolean) || (this.jDC.getVisibility() != 0));
    this.jDC.setVisibility(8);
    Object localObject = AnimationUtils.loadAnimation(this, R.a.fast_faded_out);
    this.jDC.startAnimation((Animation)localObject);
  }
  
  private void goBack()
  {
    boolean bool2 = true;
    Intent localIntent = new Intent();
    boolean bool1;
    if (!this.jCp)
    {
      bool1 = true;
      if (!this.jCl) {
        break label77;
      }
      bool1 = bool2;
    }
    label77:
    for (;;)
    {
      localIntent.putExtra("CropImage_Compress_Img", bool1);
      localIntent.putStringArrayListExtra("preview_image_list", aRX());
      localIntent.putExtra("show_photo_edit_tip", this.jDY);
      setResult(0, localIntent);
      finish();
      return;
      bool1 = false;
      break;
    }
  }
  
  protected final void dealContentView(View paramView)
  {
    if (b.bt(this))
    {
      setContentView(paramView);
      return;
    }
    ak.d(ak.a(getWindow(), null), this.mController.tlX);
    ((ViewGroup)this.mController.tlX.getParent()).removeView(this.mController.tlX);
    ((ViewGroup)getWindow().getDecorView()).addView(this.mController.tlX, 0);
  }
  
  protected final int getForceOrientation()
  {
    return 1;
  }
  
  protected final int getLayoutId()
  {
    return R.i.image_gallery_plugin;
  }
  
  protected final void initView()
  {
    this.jDS = ((TextView)findViewById(R.h.gallery_edit_tv));
    this.jDT = ((TextView)findViewById(R.h.gallery_edit_tv_des));
    this.jDU = ((TextView)findViewById(R.h.item_legal_tip));
    this.jDV = findViewById(R.h.item_legal_tip_layout);
    this.jDV.postDelayed(new ImagePreviewUI.21(this), 100L);
    this.jDW = ((TextView)findViewById(R.h.gallery_edit_tv_btn));
    this.jDX = ((ProgressBar)findViewById(R.h.video_edit_progressbar));
    this.jCs = getIntent().getIntExtra("max_select_count", 9);
    this.jDQ = getIntent().getIntExtra("key_edit_video_max_time_length", 10);
    final Object localObject1;
    boolean bool2;
    if (com.tencent.mm.plugin.gallery.model.c.aRf().aRI() == 4)
    {
      bool1 = true;
      this.jCl = bool1;
      localObject1 = getIntent();
      this.jDD = ((Intent)localObject1).getStringArrayListExtra("preview_image_list");
      this.jDE = new ArrayList();
      if (this.jDD != null) {
        this.jDE.addAll(this.jDD);
      }
      this.jBz = com.tencent.mm.plugin.gallery.model.c.aRh();
      bool2 = ((Intent)localObject1).getBooleanExtra("preview_all", false);
      if (this.jBz != null) {
        break label373;
      }
    }
    label373:
    for (boolean bool1 = true;; bool1 = false)
    {
      x.i("MicroMsg.ImagePreviewUI", "preview all[%B] mediaitems is null[%B]", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      if ((bool2) && (this.jBz != null))
      {
        this.jCW = true;
        this.jDF = Integer.valueOf(((Intent)localObject1).getIntExtra("preview_position", 0));
        x.i("MicroMsg.ImagePreviewUI", "start position=%d", new Object[] { this.jDF });
        if (this.jDF.intValue() >= 0) {}
      }
      else
      {
        this.jDF = Integer.valueOf(0);
      }
      com.tencent.mm.plugin.gallery.model.c.qn(this.jDF.intValue());
      if ((this.jCW) || ((this.jDE != null) && (this.jDE.size() != 0))) {
        break label378;
      }
      x.e("MicroMsg.ImagePreviewUI", "not preview all items and imagepaths is null or empty");
      finish();
      return;
      bool1 = false;
      break;
    }
    label378:
    this.jDG = ((ImageButton)findViewById(R.h.orignal_image));
    this.jCf = ((TextView)findViewById(R.h.orignal_image_tip));
    this.jDH = ((TextView)findViewById(R.h.video_edit_button));
    this.jCp = ((Intent)localObject1).getBooleanExtra("send_raw_img", false);
    this.jDP = ((Intent)localObject1).getIntExtra("query_source_type", 0);
    int i;
    if (this.jCp)
    {
      this.jDG.setImageResource(R.k.radio_on);
      if ((this.jDE != null) && (this.jDE.size() == 1))
      {
        localObject1 = (String)this.jDE.get(0);
        if (((String)localObject1).endsWith(".jpg")) {
          ah.A(new Runnable()
          {
            public final void run()
            {
              boolean bool1 = true;
              try
              {
                com.tencent.mm.plugin.gallery.stub.a locala = ImagePreviewUI.s(ImagePreviewUI.this);
                String str1 = localObject1;
                String str2 = ImagePreviewUI.this.getIntent().getStringExtra("GalleryUI_ToUser");
                if (ImagePreviewUI.l(ImagePreviewUI.this)) {}
                for (;;)
                {
                  locala.a(str1, str2, bool1, 0, true);
                  return;
                  boolean bool2 = ImagePreviewUI.b(ImagePreviewUI.this);
                  if (bool2) {
                    bool1 = false;
                  }
                }
                return;
              }
              catch (Exception localException) {}
            }
          });
        }
      }
      this.jCf.setText(this.mController.tml.getString(R.l.gallery_pic_orignal));
      this.jDG.setOnClickListener(new ImagePreviewUI.22(this));
      this.jDH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).jl(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bi.oW(paramAnonymousView))
          {
            x.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            return;
          }
          Intent localIntent = new Intent();
          localIntent.putExtra("key_video_path", paramAnonymousView);
          localIntent.putExtra("key_need_clip_video_first", false);
          d.b(ImagePreviewUI.this.mController.tml, "mmsight", ".segment.MMSightEditUI", localIntent, 4370);
        }
      });
      this.jDW.setOnClickListener(new ImagePreviewUI.24(this));
      this.jCf.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          ImagePreviewUI.c(ImagePreviewUI.this).performClick();
        }
      });
      setBackBtn(new ImagePreviewUI.26(this));
      a(0, aRW(), new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          int j = 0;
          if (ImagePreviewUI.j(ImagePreviewUI.this) == 6)
          {
            ImagePreviewUI.this.setResult(1);
            ImagePreviewUI.this.finish();
          }
          paramAnonymousMenuItem = new Intent();
          paramAnonymousMenuItem.putExtra("isPreviewPhoto", ImagePreviewUI.this.getIntent().getBooleanExtra("isPreviewPhoto", false));
          Object localObject = ImagePreviewUI.k(ImagePreviewUI.this);
          int i;
          if ((localObject != null) && (((ArrayList)localObject).size() == 0))
          {
            localObject = ImagePreviewUI.h(ImagePreviewUI.this).qE(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
            if ((ImagePreviewUI.l(ImagePreviewUI.this)) && (ImagePreviewUI.h(ImagePreviewUI.this) != null) && (localObject != null) && (((GalleryItem.MediaItem)localObject).getType() == 2))
            {
              ImagePreviewUI.a(ImagePreviewUI.this, ((GalleryItem.MediaItem)localObject).egA);
              i = 0;
            }
          }
          for (;;)
          {
            if (!ImagePreviewUI.b(ImagePreviewUI.this)) {}
            boolean bool2;
            for (boolean bool1 = true;; bool1 = false)
            {
              bool2 = ImagePreviewUI.l(ImagePreviewUI.this);
              if (i != 0) {
                break label213;
              }
              ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousMenuItem, bool2, bool1);
              return true;
              ImagePreviewUI.e(ImagePreviewUI.this).performClick();
              i = 300;
              break;
            }
            label213:
            localObject = com.tencent.mm.plugin.gallery.model.c.aRg();
            paramAnonymousMenuItem = new ImagePreviewUI.27.1(this, paramAnonymousMenuItem, bool2, bool1);
            if (i < 0) {
              i = j;
            }
            for (;;)
            {
              ((com.tencent.mm.plugin.gallery.model.e)localObject).aRu().postDelayed(paramAnonymousMenuItem, i);
              return true;
            }
            i = 0;
          }
        }
      }, s.b.tmX);
      this.jDJ = ((ImageButton)findViewById(R.h.photos_select_checkbox));
      this.jDJ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          paramAnonymousView = ImagePreviewUI.h(ImagePreviewUI.this).jl(ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          if (bi.oW(paramAnonymousView))
          {
            x.w("MicroMsg.ImagePreviewUI", "get path error, position %d", new Object[] { ImagePreviewUI.g(ImagePreviewUI.this) });
            return;
          }
          ImagePreviewUI.a(ImagePreviewUI.this, paramAnonymousView);
          ImagePreviewUI.a(ImagePreviewUI.this, ImagePreviewUI.g(ImagePreviewUI.this).intValue());
          ImagePreviewUI.f(ImagePreviewUI.this).setText(ImagePreviewUI.this.mController.tml.getString(R.l.gallery_pic_orignal) + ImagePreviewUI.aRY());
          ImagePreviewUI.this.updateOptionMenuText(0, ImagePreviewUI.m(ImagePreviewUI.this));
        }
      });
      this.jDK = ((TextView)findViewById(R.h.photos_select_tv));
      this.jDK.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          ImagePreviewUI.e(ImagePreviewUI.this).performClick();
        }
      });
      if (this.jCs == 1)
      {
        this.jDJ.setVisibility(8);
        this.jDK.setVisibility(8);
      }
      this.jDL = ((ViewGroup)findViewById(R.h.cropimage_operator_ll));
      this.jDM = ((ViewGroup)findViewById(R.h.gallery_edit_layout));
      if (this.jDL != null)
      {
        this.jDL.setVisibility(8);
        this.jDL.setOnClickListener(new ImagePreviewUI.4(this));
      }
      if (this.jDM != null)
      {
        this.jDM.setVisibility(8);
        this.jDM.setOnClickListener(new ImagePreviewUI.5(this));
      }
      this.jDR = ((TextView)findViewById(R.h.photo_edit_button));
      this.jDR.setOnClickListener(new ImagePreviewUI.6(this));
      this.jDC = ((RecyclerView)findViewById(R.h.image_preview_recycler_view));
      this.jDC.getItemAnimator().RX = 66L;
      this.jDC.a(new ImagePreviewUI.7(this));
      localObject1 = new g();
      ((g)localObject1).setOrientation(0);
      this.jDC.setLayoutManager((RecyclerView.h)localObject1);
      i = getResources().getDisplayMetrics().widthPixels / 7;
      localObject1 = new f(this, this.jDE, i, this.jCW);
      this.jDC.setAdapter((RecyclerView.a)localObject1);
      this.jDC.post(new ImagePreviewUI.8(this));
      if (this.jDE.size() <= 0) {
        break label1316;
      }
      this.jDC.setVisibility(0);
      label988:
      this.jDC.setItemAnimator(new v());
      ((f)localObject1).jEs.A(this.jDC);
      ((f)localObject1).jEm = new ImagePreviewUI.9(this);
      this.jDB = ((MMViewPager)findViewById(R.h.gallery));
      this.jDB.setVerticalFadingEdgeEnabled(false);
      this.jDB.setHorizontalFadingEdgeEnabled(false);
      this.jDB.setOnPageChangeListener(new ImagePreviewUI.13(this));
      this.jDB.setSingleClickOverListener(new ImagePreviewUI.14(this));
      this.jDA = new c(this);
      ((f)this.jDC.getAdapter()).jEj = this.jDA;
      if (this.jCW) {
        break label1328;
      }
      this.jDA.A(this.jDD);
      this.jDA.jCW = false;
      if (this.jDD.size() <= 0) {
        break label1437;
      }
      localObject1 = (String)this.jDD.get(this.jDF.intValue());
    }
    for (;;)
    {
      this.jDB.setAdapter(this.jDA);
      this.jDB.setCurrentItem(this.jDF.intValue());
      i = aRX().indexOf(this.jDA.jl(this.jDF.intValue()));
      ((f)this.jDC.getAdapter()).cH(i, this.jDF.intValue());
      Object localObject2 = com.tencent.mm.plugin.gallery.model.c.CS((String)localObject1);
      a((String)localObject1, (GalleryItem.MediaItem)localObject2);
      c((GalleryItem.MediaItem)localObject2);
      setMMTitle(String.format("%d/%d", new Object[] { Integer.valueOf(this.jDF.intValue() + 1), Integer.valueOf(this.jDA.getCount()) }));
      return;
      this.jDG.setImageResource(R.k.radio_off);
      break;
      label1316:
      this.jDC.setVisibility(8);
      break label988;
      label1328:
      localObject1 = this.jDA;
      localObject2 = this.jBz;
      ((c)localObject1).jBz.clear();
      ((c)localObject1).jBz.addAll((Collection)localObject2);
      ((c)localObject1).reset();
      ((c)localObject1).notifyDataSetChanged();
      this.jDA.jCW = true;
      if (this.jDF.intValue() >= this.jBz.size()) {
        this.jDF = Integer.valueOf(0);
      }
      if (this.jBz.size() > 0) {
        localObject1 = ((GalleryItem.MediaItem)this.jBz.get(this.jDF.intValue())).egA;
      } else {
        label1437:
        localObject1 = "";
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    x.i("MicroMsg.ImagePreviewUI", "test onActivityResult");
    if (paramInt1 == 4371) {
      if (paramInt2 == -1)
      {
        setResult(-1, paramIntent);
        finish();
      }
    }
    for (;;)
    {
      if (paramInt1 == 4372) {
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          this.jDY = true;
          str1 = paramIntent.getStringExtra("before_photo_edit");
          localObject1 = com.tencent.mm.plugin.gallery.model.c.aRj().iterator();
          for (;;)
          {
            if (((Iterator)localObject1).hasNext()) {
              if (str1.equals(((Bundle)((Iterator)localObject1).next()).getString("before_photo_edit")))
              {
                ((Iterator)localObject1).remove();
                continue;
                if (this.jDE.size() > 0)
                {
                  CW((String)this.jDE.get(0));
                  break;
                }
                x.e("MicroMsg.ImagePreviewUI", "selectedPath has unexpected size() [%d]", new Object[] { Integer.valueOf(this.jDE.size()) });
                break;
                if (paramInt1 != 4370) {
                  break;
                }
                if (paramInt2 == -1) {
                  setResult(-1, paramIntent);
                }
                if (paramIntent == null) {
                  break;
                }
                setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
                finish();
                break;
              }
            }
          }
          com.tencent.mm.plugin.gallery.model.c.aRj().add(paramIntent.getBundleExtra("report_info"));
          localObject1 = paramIntent.getStringExtra("after_photo_edit");
          str2 = paramIntent.getStringExtra("tmp_photo_edit");
          x.i("MicroMsg.ImagePreviewUI", "rawEditPhotoPath:%s lastEditPhotoPath;%s", new Object[] { str1, localObject1 });
          if (this.jDD != null)
          {
            this.jDD.clear();
            localObject2 = paramIntent.getStringArrayListExtra("preview_image_list");
            if (localObject2 != null) {
              this.jDD.addAll((Collection)localObject2);
            }
            localObject2 = this.jDA.qE(this.jDF.intValue());
            if (localObject2 != null) {
              break label357;
            }
            x.e("MicroMsg.ImagePreviewUI", "item is null!!! mPosition:%s rawEditPhotoPath:%s lastEditPhotoPath:%s", new Object[] { this.jDF, str1, localObject1 });
          }
        }
      }
    }
    label357:
    while (paramIntent == null)
    {
      String str1;
      Object localObject1;
      String str2;
      Object localObject2;
      return;
      ((GalleryItem.MediaItem)localObject2).jAS = str1;
      ((GalleryItem.MediaItem)localObject2).egA = ((String)localObject1);
      ((GalleryItem.MediaItem)localObject2).iSr = ((String)localObject1);
      ((GalleryItem.MediaItem)localObject2).jAT = str2;
      ((GalleryItem.MediaItem)localObject2).mMimeType = "edit";
      com.tencent.mm.plugin.gallery.model.c.aRi().add(localObject2);
      com.tencent.mm.plugin.gallery.model.c.aRe().a(new ImagePreviewUI.11(this, paramIntent));
      com.tencent.mm.plugin.gallery.model.c.aRe().b((String)localObject1, ((GalleryItem.MediaItem)localObject2).getType(), (String)localObject1, ((GalleryItem.MediaItem)localObject2).jAU);
      x.i("MicroMsg.ImagePreviewUI", "photo_edit_back!");
      return;
    }
    setResult(-1, paramIntent.putExtra("GalleryUI_IsSendImgBackground", true));
    finish();
  }
  
  @TargetApi(16)
  public void onCreate(Bundle paramBundle)
  {
    long l = bi.VG();
    super.onCreate(paramBundle);
    fullScreenNoTitleBar(true);
    new ag().post(new ImagePreviewUI.12(this, l));
    bindService(new Intent(this.mController.tml, GalleryStubService.class), this.hKe, 1);
    initView();
    x.v("MicroMsg.ImagePreviewUI", "test oncreate: %d", new Object[] { Long.valueOf(bi.bI(l)) });
  }
  
  protected void onDestroy()
  {
    super.onDestroy();
    if ((com.tencent.mm.plugin.gallery.model.c.aRf().aRI() == 3) && (getIntent().getBooleanExtra("preview_image", false)) && (getIntent().getIntExtra("max_select_count", 0) == 1))
    {
      x.i("MicroMsg.ImagePreviewUI", "clear photo edit cache!");
      sendBroadcast(new Intent("com.tencent.mm.plugin.photoedit.action.clear"));
    }
    if (this.jDA != null) {
      this.jDA.release();
    }
    com.tencent.mm.plugin.gallery.model.c.v(null);
    unbindService(this.hKe);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      goBack();
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  protected void onPause()
  {
    if (this.jDI != null) {
      this.jDI.SO();
    }
    super.onPause();
  }
  
  protected void onResume()
  {
    super.onResume();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/ImagePreviewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */