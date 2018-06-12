package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.gallery.model.GalleryItem.AlbumItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.ImageMediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.c;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bi;
import com.tencent.mm.sdk.platformtools.x;
import java.util.ArrayList;

public final class b
  extends BaseAdapter
{
  private int jBm;
  ArrayList<GalleryItem.AlbumItem> jCO;
  GalleryItem.AlbumItem jCP;
  String jCQ = "";
  private int jCR = 0;
  private Context mContext;
  
  public b(Context paramContext, int paramInt)
  {
    this.mContext = paramContext;
    this.jCO = new ArrayList();
    this.jBm = paramInt;
    this.jCP = new GalleryItem.AlbumItem("", 0);
    this.jCP.jAR = new GalleryItem.ImageMediaItem();
    this.jCR = paramContext.getResources().getDimensionPixelSize(R.f.SmallPadding);
  }
  
  public final int getCount()
  {
    return this.jCO.size() + 1;
  }
  
  public final long getItemId(int paramInt)
  {
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    x.i("MicroMsg.GalleryAdapter", "duanyi test getview:" + paramInt);
    GalleryItem.AlbumItem localAlbumItem = qB(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.mContext).inflate(R.i.sd_card_medial_folder_item, paramViewGroup, false);
      paramViewGroup = new a((byte)0);
      paramViewGroup.jBN = ((ImageView)paramView.findViewById(R.h.folder_thumb));
      paramViewGroup.eCn = ((TextView)paramView.findViewById(R.h.folder_name));
      paramViewGroup.jeF = ((ImageView)paramView.findViewById(R.h.video_mask));
      paramViewGroup.jCS = ((TextView)paramView.findViewById(R.h.folder_count));
      paramViewGroup.jCT = ((ImageView)paramView.findViewById(R.h.folder_selected_iv));
      paramView.setTag(paramViewGroup);
      if (!this.jCQ.equals(localAlbumItem.jAQ)) {
        break label268;
      }
      paramViewGroup.jCT.setVisibility(0);
      label155:
      if (paramInt != 0) {
        break label315;
      }
      paramViewGroup.jBN.setImageResource(R.g.pic_thumb_bg);
      if (localAlbumItem.jAR != null) {
        h.a(paramViewGroup.jBN, localAlbumItem.jAR.getType(), localAlbumItem.aRw(), localAlbumItem.jAR.egA, localAlbumItem.aRx());
      }
      if (c.aRf().aRJ() != 1) {
        break label279;
      }
      paramViewGroup.eCn.setText(R.l.gallery_all_pic);
    }
    for (;;)
    {
      paramViewGroup.jBN.setVisibility(0);
      paramViewGroup.eCn.setVisibility(0);
      paramViewGroup.jCS.setVisibility(8);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
      break;
      label268:
      paramViewGroup.jCT.setVisibility(4);
      break label155;
      label279:
      if (c.aRf().aRJ() == 3) {
        paramViewGroup.eCn.setText(R.l.gallery_all_pic_and_video);
      } else {
        paramViewGroup.eCn.setText(R.l.gallery_all_video);
      }
    }
    label315:
    paramViewGroup.jBN.setVisibility(0);
    paramViewGroup.eCn.setVisibility(0);
    paramViewGroup.eCn.setText(localAlbumItem.jAQ);
    paramViewGroup.jCS.setVisibility(0);
    paramViewGroup.jCS.setText(this.mContext.getString(R.l.gallery_pic_count, new Object[] { Integer.valueOf(localAlbumItem.bMU) }));
    Object localObject;
    if ((paramViewGroup.jeF != null) && (localAlbumItem.jAR != null))
    {
      localObject = paramViewGroup.jeF;
      if (localAlbumItem.jAR.getType() != 2) {
        break label479;
      }
    }
    label479:
    for (paramInt = 0;; paramInt = 8)
    {
      ((ImageView)localObject).setVisibility(paramInt);
      localObject = localAlbumItem.aRw();
      if ((bi.oW((String)localObject)) || (localAlbumItem.jAR == null)) {
        break;
      }
      h.a(paramViewGroup.jBN, localAlbumItem.jAR.getType(), (String)localObject, localAlbumItem.jAR.egA, localAlbumItem.aRx());
      return paramView;
    }
    if ((localAlbumItem.jAR != null) && (localAlbumItem.jAR.getType() == 2))
    {
      h.a(paramViewGroup.jBN, localAlbumItem.jAR.getType(), null, localAlbumItem.jAR.egA, localAlbumItem.aRx());
      return paramView;
    }
    x.e("MicroMsg.GalleryAdapter", "get folder failed");
    paramViewGroup.jBN.setVisibility(8);
    paramViewGroup.eCn.setVisibility(8);
    return paramView;
  }
  
  public final GalleryItem.AlbumItem qB(int paramInt)
  {
    if (paramInt == 0) {
      return this.jCP;
    }
    return (GalleryItem.AlbumItem)this.jCO.get(paramInt - 1);
  }
  
  private static final class a
  {
    public TextView eCn;
    public ImageView jBN;
    public TextView jCS;
    public ImageView jCT;
    public ImageView jeF;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/plugin/gallery/ui/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */