package com.tencent.mm.plugin.music.b.b;

import com.google.android.exoplayer2.d.b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.tencent.mm.sdk.platformtools.x;
import java.text.NumberFormat;
import java.util.Locale;

public final class a
{
  private static final NumberFormat lAf;
  
  static
  {
    NumberFormat localNumberFormat = NumberFormat.getInstance(Locale.US);
    lAf = localNumberFormat;
    localNumberFormat.setMinimumFractionDigits(2);
    lAf.setMaximumFractionDigits(2);
    lAf.setGroupingUsed(false);
  }
  
  public static void a(Metadata paramMetadata, String paramString)
  {
    int i = 0;
    if (i < paramMetadata.aqq.length)
    {
      Object localObject = paramMetadata.aqq[i];
      if ((localObject instanceof TextInformationFrame))
      {
        localObject = (TextInformationFrame)localObject;
        x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: value=%s", new Object[] { ((TextInformationFrame)localObject).id, ((TextInformationFrame)localObject).value }));
      }
      for (;;)
      {
        i += 1;
        break;
        if ((localObject instanceof UrlLinkFrame))
        {
          localObject = (UrlLinkFrame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: url=%s", new Object[] { ((UrlLinkFrame)localObject).id, ((UrlLinkFrame)localObject).url }));
        }
        else if ((localObject instanceof PrivFrame))
        {
          localObject = (PrivFrame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: owner=%s", new Object[] { ((PrivFrame)localObject).id, ((PrivFrame)localObject).aqU }));
        }
        else if ((localObject instanceof GeobFrame))
        {
          localObject = (GeobFrame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: mimeType=%s, filename=%s, description=%s", new Object[] { ((GeobFrame)localObject).id, ((GeobFrame)localObject).mimeType, ((GeobFrame)localObject).filename, ((GeobFrame)localObject).description }));
        }
        else if ((localObject instanceof ApicFrame))
        {
          localObject = (ApicFrame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: mimeType=%s, description=%s", new Object[] { ((ApicFrame)localObject).id, ((ApicFrame)localObject).mimeType, ((ApicFrame)localObject).description }));
        }
        else if ((localObject instanceof CommentFrame))
        {
          localObject = (CommentFrame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s: language=%s, description=%s", new Object[] { ((CommentFrame)localObject).id, ((CommentFrame)localObject).aem, ((CommentFrame)localObject).description }));
        }
        else if ((localObject instanceof Id3Frame))
        {
          localObject = (Id3Frame)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("%s", new Object[] { ((Id3Frame)localObject).id }));
        }
        else if ((localObject instanceof EventMessage))
        {
          localObject = (EventMessage)localObject;
          x.d("MicroMsg.ExoPlayer", paramString + String.format("EMSG: scheme=%s, id=%d, value=%s", new Object[] { ((EventMessage)localObject).aqB, Long.valueOf(((EventMessage)localObject).id), ((EventMessage)localObject).value }));
        }
      }
    }
  }
  
  public static void biB()
  {
    b.DEBUG = false;
    b.a(new a.1());
  }
  
  public static String ee(long paramLong)
  {
    if (paramLong == -9223372036854775807L) {
      return "?";
    }
    return lAf.format((float)paramLong / 1000.0F);
  }
  
  public static String tN(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return "?";
    case 2: 
      return "B";
    case 4: 
      return "E";
    case 1: 
      return "I";
    }
    return "R";
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/music/b/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */