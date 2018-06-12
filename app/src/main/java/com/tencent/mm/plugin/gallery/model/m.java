package com.tencent.mm.plugin.gallery.model;

import android.annotation.TargetApi;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.x;

@TargetApi(16)
public final class m
  implements Runnable
{
  public MediaFormat jBq;
  public MediaFormat jBr;
  public GalleryItem.VideoMediaItem jBs;
  public a jBt;
  public String path;
  public int position;
  
  public m(String paramString, int paramInt, GalleryItem.VideoMediaItem paramVideoMediaItem, a parama)
  {
    this.path = paramString;
    this.position = paramInt;
    this.jBs = paramVideoMediaItem;
    this.jBt = parama;
  }
  
  public final boolean equals(Object paramObject)
  {
    return ((paramObject instanceof m)) && ((this == paramObject) || (this.position == ((m)paramObject).position) || ((this.path != null) && (this.path.equals(((m)paramObject).path))));
  }
  
  public final void run()
  {
    MediaExtractor localMediaExtractor = new MediaExtractor();
    for (;;)
    {
      int i;
      try
      {
        localMediaExtractor.setDataSource(this.path);
        int j = localMediaExtractor.getTrackCount();
        i = 0;
        if (i < j)
        {
          localObject1 = localMediaExtractor.getTrackFormat(i);
          if (!((MediaFormat)localObject1).containsKey("mime"))
          {
            x.d("VideoAnalysisTask", "find video mime : not found.");
            break label570;
          }
          localObject3 = ((MediaFormat)localObject1).getString("mime");
          x.d("VideoAnalysisTask", "find video mime : %s", new Object[] { localObject3 });
          if (localObject3 == null) {
            break label570;
          }
          if (!((String)localObject3).startsWith("video/")) {
            continue;
          }
          if (this.jBq == null) {
            this.jBq = ((MediaFormat)localObject1);
          }
          if ((this.jBr == null) || (this.jBq == null)) {
            break label570;
          }
        }
        if (this.jBs == null) {
          continue;
        }
        if (this.jBq == null) {
          continue;
        }
        localObject1 = this.jBs;
        if (this.jBq.containsKey("durationUs")) {
          continue;
        }
        i = 0;
      }
      catch (Exception localException)
      {
        Object localObject1;
        Object localObject3;
        x.d("VideoAnalysisTask", "Video extractor init failed. video path = [%s] e = [%s]", new Object[] { this.path, localException.getMessage() });
        localMediaExtractor.release();
        continue;
        i = (int)(this.jBq.getLong("durationUs") / 1000L);
        continue;
        i = this.jBq.getInteger("height");
        continue;
        i = this.jBq.getInteger("width");
        continue;
        String str = this.jBq.getString("mime");
        continue;
        i = this.jBq.getInteger("bitrate");
        continue;
        i = this.jBq.getInteger("i-frame-interval");
        continue;
        i = this.jBq.getInteger("frame-rate");
        continue;
        str = this.jBr.getString("mime");
        continue;
      }
      finally
      {
        localMediaExtractor.release();
      }
      ((GalleryItem.VideoMediaItem)localObject1).egD = i;
      localObject1 = this.jBs;
      if (!this.jBq.containsKey("height"))
      {
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoHeight = i;
        localObject1 = this.jBs;
        if (this.jBq.containsKey("width")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoWidth = i;
        localObject3 = this.jBs;
        if (this.jBq.containsKey("mime")) {
          continue;
        }
        localObject1 = "";
        ((GalleryItem.VideoMediaItem)localObject3).egB = ((String)localObject1);
        localObject1 = this.jBs;
        if (this.jBq.containsKey("bitrate")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoBitRate = i;
        localObject1 = this.jBs;
        if (this.jBq.containsKey("i-frame-interval")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).egE = i;
        localObject1 = this.jBs;
        if (this.jBq.containsKey("frame-rate")) {
          continue;
        }
        i = 0;
        ((GalleryItem.VideoMediaItem)localObject1).videoFrameRate = i;
        if (this.jBr != null)
        {
          localObject3 = this.jBs;
          if (this.jBr.containsKey("mime")) {
            continue;
          }
          localObject1 = "";
          ((GalleryItem.VideoMediaItem)localObject3).egC = ((String)localObject1);
        }
        localMediaExtractor.release();
        if (this.jBt != null) {
          break label558;
        }
        x.d("VideoAnalysisTask", "video analysis end. observer == null, position = [%d], mediaItem = [%s]", new Object[] { Integer.valueOf(this.position), this.jBs });
        return;
        if ((!((String)localObject3).startsWith("audio/")) || (this.jBr != null)) {
          continue;
        }
        this.jBr = ((MediaFormat)localObject1);
      }
      label558:
      ah.A(new Runnable()
      {
        public final void run()
        {
          if (m.this.jBt != null) {
            m.this.jBt.a(m.this);
          }
        }
      });
      return;
      label570:
      i += 1;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(m paramm);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/gallery/model/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */